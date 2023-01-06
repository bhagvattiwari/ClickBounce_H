/*     */ package SIBMAILAPI.SIBMailHelper;
/*     */ 
/*     */ import java.io.BufferedReader;
/*     */ import java.io.DataOutputStream;
/*     */ import java.io.InputStreamReader;
/*     */ import java.net.URL;
/*     */ import java.time.LocalDateTime;
/*     */ import java.time.ZoneId;
/*     */ import java.util.Date;
/*     */ import javax.net.ssl.HostnameVerifier;
/*     */ import javax.net.ssl.HttpsURLConnection;
/*     */ import javax.net.ssl.SSLSession;
/*     */ import org.json.simple.JSONObject;
/*     */ import org.json.simple.parser.JSONParser;
/*     */ import org.json.simple.parser.ParseException;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class callws
/*     */ {
/*     */   public String getData(String requestxml, String endpoint, String type, String keystorepath, String keystorepwd) {
/*  33 */     String result = null;
/*  34 */     HttpsURLConnection connection = null;
/*  35 */     JSONObject jsonObject = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/*  45 */       System.out.println("URL ::" + endpoint);
/*  46 */       System.out.println("RequestXML ::" + requestxml);
/*     */       
/*  48 */       URL url = new URL(endpoint);
/*  49 */       connection = (HttpsURLConnection)url.openConnection();
/*  50 */       connection.setConnectTimeout(30000);
/*  51 */       connection.setReadTimeout(30000);
/*  52 */       connection.setRequestMethod("POST");
/*  53 */       connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=utf-8");
/*  54 */       connection.setDoOutput(true);
/*     */       
/*  56 */       connection.setHostnameVerifier(new HostnameVerifier() {
/*     */             public boolean verify(String hostname, SSLSession session) {
/*  58 */               return true;
/*     */             }
/*     */           });
/*  61 */       DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
/*  62 */       wr.writeBytes(requestxml);
/*  63 */       wr.flush();
/*  64 */       wr.close();
/*     */       
/*  66 */       BufferedReader in = null;
/*     */       
/*     */       try {
/*  69 */         System.out.println("response code" + connection.getResponseCode());
/*     */         
/*  71 */         String inputLine = null;
/*  72 */         StringBuilder buf = new StringBuilder();
/*     */         
/*  74 */         if (connection.getResponseCode() == 200) {
/*  75 */           in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
/*  76 */           while ((inputLine = in.readLine()) != null) {
/*  77 */             buf.append(inputLine);
/*     */           }
/*     */         } else {
/*  80 */           in = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
/*  81 */           while ((inputLine = in.readLine()) != null) {
/*  82 */             buf.append(inputLine);
/*     */           }
/*     */         } 
/*     */         
/*  86 */         result = buf.toString();
/*     */         
/*  88 */         System.out.println("|response|" + result);
/*  89 */       } catch (Exception e) {
/*     */         
/*  91 */         String tmperr = "Exception while calling webservice " + e.getMessage();
/*     */ 
/*     */         
/*  94 */         result = "{\n    \"error_description\": \"" + tmperr + "\",\n    \"timestamp\": \"" + convertToLocalDateTime(new Date()) + "\",\n}";
/*     */       } finally {
/*     */         
/*  97 */         if (in != null) {
/*  98 */           in.close();
/*     */         }
/*     */       } 
/* 101 */     } catch (Exception e) {
/* 102 */       e.printStackTrace();
/* 103 */       String tmperr = "Exception while calling webservice " + e.getMessage();
/*     */ 
/*     */       
/* 106 */       result = "{\n    \"error_description\": \"" + tmperr + "\",\n    \"timestamp\": \"" + convertToLocalDateTime(new Date()) + "\",\n}";
/*     */     } finally {
/*     */       
/* 109 */       if (connection != null) {
/* 110 */         connection.disconnect();
/*     */       }
/*     */     } 
/* 113 */     return result;
/*     */   }
/*     */   
/*     */   public JSONObject getJsonObject(String result) {
/* 117 */     JSONObject jo = null;
/*     */     try {
/* 119 */       jo = (JSONObject)(new JSONParser()).parse(result);
/* 120 */     } catch (ParseException ex) {
/* 121 */       ex.printStackTrace();
/*     */     } 
/*     */     
/* 124 */     return jo;
/*     */   }
/*     */   
/*     */   public LocalDateTime convertToLocalDateTime(Date dateToConvert) {
/* 128 */     return LocalDateTime.ofInstant(dateToConvert
/* 129 */         .toInstant(), ZoneId.systemDefault());
/*     */   }
/*     */   public String getAccessToken(String requestdata, String endpoint) {
/* 132 */     JSONObject jsonObject = null;
/*     */ 
/*     */     
/*     */     try {
/* 136 */       String result = (new callws()).getData(requestdata, endpoint, null, null, null);
/*     */       
/* 138 */       jsonObject = (new callws()).getJsonObject(result);
/*     */ 
/*     */ 
/*     */       
/* 142 */       System.out.println(jsonObject.toJSONString());
/*     */       
/* 144 */       if (jsonObject.get("access_token") != null) {
/* 145 */         return jsonObject.get("access_token").toString();
/*     */       }
/*     */     }
/* 148 */     catch (Exception e) {
/* 149 */       e.printStackTrace();
/* 150 */       return "error";
/*     */     } 
/* 152 */     return "error";
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\SIBMAILAPI\SIBMailHelper\callws.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */