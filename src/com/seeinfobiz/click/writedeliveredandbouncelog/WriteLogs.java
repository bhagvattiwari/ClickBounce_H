/*     */ package com.seeinfobiz.click.writedeliveredandbouncelog;
/*     */ 
/*     */ import com.seeinfobiz.click.dbconnection.DBConnection;
/*     */ import java.io.BufferedWriter;
/*     */ import java.io.File;
/*     */ import java.io.FileWriter;
/*     */ import java.sql.Connection;
/*     */ import java.sql.ResultSet;
/*     */ import java.sql.Statement;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.Date;
/*     */ import java.util.Properties;
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
/*     */ public class WriteLogs
/*     */ {
/*  25 */   Connection con = null;
/*     */   
/*     */   boolean isSuccess = false;
/*     */   
/*     */   public void writeLog(Long paramLong, Properties paramProperties, String paramString) {
/*     */     try {
/*  31 */       this.con = (new DBConnection()).getjdbcConnection();
/*  32 */       String str = paramProperties.getProperty("BOUNCEDELIVEREEDLOGPATH");
/*  33 */       str = str + "/" + getStrDate(new Date()) + "/";
/*  34 */       writeInToFile(this.con, str, paramLong, paramString);
/*     */     }
/*  36 */     catch (Exception exception) {
/*  37 */       exception.printStackTrace();
/*     */     } 
/*     */   }
/*     */   
/*     */   public String getStrDate(Date paramDate) {
/*  42 */     String str = "";
/*  43 */     SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy");
/*  44 */     str = simpleDateFormat.format(paramDate);
/*  45 */     return str;
/*     */   }
/*     */   
/*     */   public boolean writeInToFile(Connection paramConnection, String paramString1, Long paramLong, String paramString2) {
/*  49 */     System.out.println("vlues ******* " + paramConnection + " - " + paramString1 + " - " + paramLong + " - " + paramString2);
/*  50 */     File file = new File(paramString1);
/*  51 */     if (!file.exists()) {
/*  52 */       file.mkdirs();
/*     */     }
/*  54 */     file = new File(paramString1 + paramString2 + ".csv");
/*  55 */     if (file.exists()) {
/*  56 */       file.delete();
/*     */     }
/*  58 */     Statement statement = null;
/*  59 */     ResultSet resultSet = null;
/*  60 */     String str1 = "";
/*  61 */     BufferedWriter bufferedWriter = null;
/*  62 */     String str2 = "";
/*     */     try {
/*  64 */       if (paramString2.toLowerCase().contains("retrigger_bounce")) {
/*  65 */         str1 = "select noxacnt,logo,nmxfst,RIXEMXBNCD,to_char(dtxprcs, 'DD-Mon-YY') dtxprcs,SUBSTR(crn,LENGTH(crn)-16,8),cdexreg,cxfile,replace(flxdelevry,'Email,Print', 'Email and Print') as flxdlvry ,rrexo,decode(rcatxbou, 'H', 'Bounced', 'S', 'Bounced', 'D', 'Delivered') as status ,decode(rcatxbou, 'H', 'Hard', 'S', 'Soft', 'D', 'Delivered') as type,to_char(to_date(substr(dtxarrvl,6,11),'dd Mon yyyy'), 'DD-Mon-YY') as bounce_date from  pxbncdxtra where trunc(rdxctd)=trunc(sysdate)";
/*  66 */       } else if (paramString2.toLowerCase().contains("bounce")) {
/*  67 */         str1 = "select noxacnt,logo,nmxfst,IXEMXBNCD,to_char(dtxprcs, 'DD-Mon-YY') dtxprcs,SUBSTR(crn,LENGTH(crn)-16,8),cdexreg,cxfile,replace(flxdelevry,'Email,Print', 'Email and Print') as flxdlvry ,rexo,decode(catxbou, 'H', 'Bounced', 'S', 'Bounced', 'D', 'Delivered') as status ,decode(catxbou, 'H', 'Hard', 'S', 'Soft', 'D', 'Delivered') as type,to_char(to_date(substr(dtxarrvl,6,11),'dd Mon yyyy'), 'DD-Mon-YY') as bounce_date  from  pxbncdxtra where trunc(dxctd)=trunc(sysdate)";
/*     */       } 
/*  69 */       if (paramString2.toLowerCase().contains("deliver")) {
/*  70 */         str1 = "select distinct substr(dprc.crn,1,length(dprc.crn)-18) as Account_Number ,dprc.acntxtyp as Logo,cstmstr.nmxfst as Customer_Name,dprc.ixem as Email, dprc.dxprcs as Email_Date,cstmstrdtl.stxstxdt as Statement_Date,cstmstrdtl.cdexreg as Region, dprc.cxfile as Extract_Name,replace(dprc.FLXCHNLXDLVY,'Email,Print', 'Email and Print') as Delivery_Channel,'Email Delivered Successfully' as Reason,'Delivered' as Status,'N/A' as Bounce_Category from DXPRDTNXDTLSXM dprc,  DXCSTMRXDTLS cstmstrdtl, DXCSTMRXM cstmstr where  dprc.ixprcs = cstmstrdtl.ixprcs and cstmstr.ixprcs = dprc.ixprcs and dprc.ixprcs = '" + paramLong + "' and cstmstrdtl.IXCST = cstmstr.IXCST and dprc.NOXACNT = cstmstrdtl.NOXACNT and dprc.crn = cstmstr.crn and dprc.FLXCHNLXDLVY  =  cstmstrdtl.DLVRYXCHNEL and dprc.FLXCHNLXDLVY  like'%Email%'and NOT EXISTS (select * from PXBNCDXTRA where dprc.crn = PXBNCDXTRA.crn and PXBNCDXTRA.ixprcs ='" + paramLong + "')";
/*     */       }
/*  72 */       if (paramString2.toLowerCase().contains("readreceipt")) {
/*  73 */         System.out.println("read receipt query executes...");
/*  74 */         str1 = "select CARD_NO, EMAIL_ID, DELIVERD_DATE, FILE_SRC_NAME, STATEMENT_DATE, STMT_FLAG, PROCESS_ID from VW_READ_RECEIPT_DATA";
/*     */       } 
/*  76 */       str2 = (paramString2.toLowerCase().contains("retrigger_bounce") || paramString2.toLowerCase().contains("bounce") || paramString2.toLowerCase().contains("deliver")) ? "Sr. No,Account Number,Logo,Customer Name,Email,Email Date,Statement Date,Region Code,Extract Name,Delivery Channel,Reason,Status,Bounce Type,Bounce Date" : "Sr. No,Card No, Email Id, Email Read Date, File sourcee Name, Statement Date, Stmt Flag, Process Id";
                System.out.println("str1:"+str1);
/*  77 */       statement = paramConnection.createStatement();
/*  78 */       resultSet = statement.executeQuery(str1);
/*  79 */       int b = 1;
/*  80 */       while (resultSet.next()) {
/*  81 */         String str = "";
/*  82 */         bufferedWriter = new BufferedWriter(new FileWriter(paramString1 + paramString2 + ".csv", true));
///*  83 */         str = (paramString2.toLowerCase().contains("retrigger_bounce") || paramString2.toLowerCase().contains("bounce") || paramString2.toLowerCase().contains("deliver")) ? (b + "," + resultSet.getString(1) + "," + resultSet.getString(2) + "," + resultSet.getString(3) + "," + resultSet.getString(4) + "," + getddMMYYYYString(resultSet.getString(5), "dd-MM-yy") + "," + getddMMYYYYString(resultSet.getString(6), "MMddyyyy") + "," + resultSet.getString(7) + "," + resultSet.getString(8) + "," + resultSet.getString(9) + "," + resultSet.getString(10) + "," + resultSet.getString(11) + "," + resultSet.getString(12) + "," + getddMMYYYYString(resultSet.getString(13), "dd-MM-yy")) : (b + "," + resultSet.getString(1) + "," + resultSet.getString(2) + "," + getddMMYYYYString(resultSet.getString(3).substring(0, 10)) + "," + resultSet.getString(4) + "," + getddmmmyyyyfromddmmyyyy(resultSet.getString(5)) + "," + resultSet.getString(6).replace(",", "-") + "," + resultSet.getString(7));
                  str = (paramString2.toLowerCase().contains("retrigger_bounce") || paramString2.toLowerCase().contains("bounce") || paramString2.toLowerCase().contains("deliver")) ? (b + "," + resultSet.getString(1) + "," + resultSet.getString(2) + "," + resultSet.getString(3) + "," + resultSet.getString(4) + "," + resultSet.getString(5) + "," + getddMMYYYYString(resultSet.getString(6), "MMddyyyy") + "," + resultSet.getString(7) + "," + resultSet.getString(8) + "," + resultSet.getString(9) + "," + resultSet.getString(10) + "," + resultSet.getString(11) + "," + resultSet.getString(12) + "," + resultSet.getString(13)) : (b + "," + resultSet.getString(1) + "," + resultSet.getString(2) + "," + getddMMYYYYString(resultSet.getString(3).substring(0, 10)) + "," + resultSet.getString(4) + "," + getddmmmyyyyfromddmmyyyy(resultSet.getString(5)) + "," + resultSet.getString(6).replace(",", "-") + "," + resultSet.getString(7));
/*  84 */         str = str.replace("null", "");
/*  85 */         if (b == 1) {
/*  86 */           bufferedWriter.write(str2 + "\n");
/*     */         }
/*  88 */         bufferedWriter.write(str + "\n");
/*  89 */         bufferedWriter.flush();
/*  90 */         bufferedWriter.close();
/*  91 */         b++;
/*     */       }
/*     */     
/*  94 */     } catch (Exception exception) {
/*  95 */       exception.printStackTrace();
/*     */     } 
/*  97 */     return true;
/*     */   }
/*     */   
/*     */   public static String getddMMYYYYString(String paramString) {
/* 101 */     Date date = null;
/* 102 */     SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
/*     */     try {
/* 104 */       date = simpleDateFormat.parse(paramString);
/* 105 */       SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd-MMM-yy");
/* 106 */       paramString = simpleDateFormat1.format(date);
/*     */     }
/* 108 */     catch (Exception exception) {
/* 109 */       exception.printStackTrace();
/*     */     } 
/* 111 */     return paramString;
/*     */   }
/*     */   
/*     */   public static String getddMMYYYYString(String paramString1, String paramString2) {
/* 115 */     Date date = null;
/* 116 */     SimpleDateFormat simpleDateFormat = new SimpleDateFormat(paramString2);
/*     */     try {
/* 118 */       date = simpleDateFormat.parse(paramString1);
/* 119 */       SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd-MMM-yy");
/* 120 */       paramString1 = simpleDateFormat1.format(date);
/*     */     }
/* 122 */     catch (Exception exception) {
/* 123 */       exception.printStackTrace();
/*     */     } 
/* 125 */     return paramString1;
/*     */   }
/*     */   
/*     */   public static String getddMMYYYYTimeString(String paramString) {
/* 129 */     Date date = null;
/* 130 */     SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
/*     */     try {
/* 132 */       date = simpleDateFormat.parse(paramString);
/* 133 */       SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd-MMM-yy");
/* 134 */       paramString = simpleDateFormat1.format(date);
/*     */     }
/* 136 */     catch (Exception exception) {
/* 137 */       exception.printStackTrace();
/*     */     } 
/* 139 */     return paramString;
/*     */   }
/*     */   
/*     */   public static String getddmmmyyyyfromddmmyyyy(String paramString) {
/* 143 */     Date date = null;
/* 144 */     SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
/*     */     try {
/* 146 */       date = simpleDateFormat.parse(paramString);
/* 147 */       SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd-MMM-yy");
/* 148 */       paramString = simpleDateFormat1.format(date);
/*     */     }
/* 150 */     catch (Exception exception) {
/* 151 */       exception.printStackTrace();
/*     */     } 
/* 153 */     return paramString;
/*     */   }
            public static void main(String[] args) {
                System.out.println(new WriteLogs().getddMMYYYYString("09-01-23", "dd-MM-YY"));
       
            }
    
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\writedeliveredandbouncelog\WriteLogs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */