/*     */ package SIBMAILAPI.SIBMailHelper;
/*     */ 
/*     */ import SBIMAILAPI.SIBSMTPCONNECTION.SMTPConnection;
/*     */ import com.seeinfobiz.click.entitybean.Dxprdtnxdtlsxm;
/*     */ import com.seeinfobiz.click.util.PropertiesFileRead;
/*     */ import java.io.File;
/*     */ import java.sql.Connection;
/*     */ import java.sql.ResultSet;
/*     */ import java.sql.Statement;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.Date;
/*     */ import java.util.HashMap;
/*     */ import java.util.Iterator;
/*     */ import java.util.Properties;
/*     */ import javax.mail.Flags;
/*     */ import javax.mail.Message;
/*     */ import javax.mail.Store;
/*     */ 
/*     */ public class Main
/*     */ {
/*  21 */   static Connection con = null;
/*  22 */   static Statement stmt = null;
/*  23 */   static Statement stmt1 = null;
/*  24 */   static ResultSet rs = null;
/*  25 */   String result = "Success";
/*     */   
/*     */   public String mainMethod(String[] a) {
/*     */     try {
/*  29 */       PropertiesFileRead propRead = new PropertiesFileRead();
/*  30 */       Properties prop = propRead.readPropertyFile();
/*     */       
/*  32 */       MailReader mailReader = new MailReader();
/*     */       
/*  34 */       int bounceBatchSize = Integer.parseInt(prop.getProperty("BOUNCE.BATCH.SIZE"));
/*     */       
/*  36 */       String accessToken = (new callws()).getAccessToken(prop.getProperty("BOUNCE.DATA"), prop.getProperty("BOUNCE.ENDPOINT"));
/*     */       
/*  38 */       SMTPConnection SMTPcON = new SMTPConnection(prop.getProperty("DR_MAILSERVER"), prop.getProperty("DR_HOSTSERVER"), a[2], a[4], a[5], a[3]);
/*  39 */       Store st = SMTPcON.getConectionStore(accessToken);
/*     */       
/*  41 */       if (st != null) {
/*  42 */         System.out.println(" Get Connected....");
/*     */       }
/*     */       
/*  45 */       Message[] msg = MailReader.getAllMessages(st, "Inbox");
/*     */       
/*  47 */       Date currdate = new Date();
/*  48 */       SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
/*  49 */       String dateName = sdf.format(currdate);
/*  50 */       dateName = dateName.replace("/", "");
/*     */       
/*  52 */       String fileNameDR = "";
/*     */       
/*  54 */       String cardNumber = "";
/*  55 */       String statementName = "";
/*  56 */       HashMap<Object, Object> cardNumMap = new HashMap<>();
/*     */       
/*  58 */       String productId = a[0];
/*  59 */       String processId = a[1];
/*  60 */       Iterator itr = null;
/*  61 */       Dxprdtnxdtlsxm d = null;
/*     */       
/*     */       try {
/*  64 */         System.out.println(" message size = " + msg.length);
/*  65 */         for (int i = 0; i < msg.length; i++) {
/*     */           
/*  67 */           if (!st.isConnected()) {
/*  68 */             accessToken = (new callws()).getAccessToken(prop.getProperty("BOUNCE.DATA"), prop.getProperty("BOUNCE.ENDPOINT"));
/*  69 */             st = SMTPcON.getConectionStore(accessToken);
/*  70 */             msg = MailReader.getAllMessages(st, "Inbox");
/*     */           } 
/*     */           try {
/*  73 */             mailReader.readDeliveryReportAttachment(msg[i], "", fileNameDR, cardNumMap, processId, productId, a[6]);
/*  74 */             if (prop.getProperty("BT_DEL").equalsIgnoreCase("Y")) {
/*  75 */               msg[i].setFlag(Flags.Flag.DELETED, true);
/*     */             }
/*  77 */           } catch (Exception e) {
/*  78 */             System.out.println(">>>>>>111 " + e.getMessage());
/*     */           } 
/*  80 */           if (i == bounceBatchSize) {
/*  81 */             System.out.println("Bounce Batch Size : " + i);
/*     */             break;
/*     */           } 
/*     */         } 
/*  85 */       } catch (Exception ex) {
/*  86 */         this.result = "Fail";
/*  87 */         System.out.println("Exception in read message >> " + this.result + " >> " + ex.getMessage());
/*  88 */         ex.printStackTrace();
/*     */       } finally {
/*  90 */         MailReader.closeConnection();
/*  91 */         st.close();
/*  92 */         System.out.println("All connection is closed ");
/*     */       } 
/*  94 */     } catch (Exception ex) {
/*  95 */       this.result = "Fail";
/*  96 */       System.out.println("Exception in read total email >> " + this.result + " >> " + ex.getMessage());
/*  97 */       ex.printStackTrace();
/*     */     } 
/*  99 */     return this.result;
/*     */   }
/*     */   
/*     */   private static String isFileExist(String dirName, String fileName) {
/* 103 */     File dir = new File(dirName);
/* 104 */     String[] children = dir.list();
/* 105 */     if (children == null) {
/* 106 */       return fileName;
/*     */     }
/* 108 */     int version = children.length;
/* 109 */     if (version != 0) {
/* 110 */       fileName = fileName + version;
/*     */     }
/* 112 */     return fileName;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\SIBMAILAPI\SIBMailHelper\Main.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */