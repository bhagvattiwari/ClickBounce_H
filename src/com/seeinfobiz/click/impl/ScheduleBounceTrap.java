/*     */ package com.seeinfobiz.click.impl;
/*     */ 
/*     */ import com.seeinfobiz.click.entitybean.Pxshdlrxarcv;
/*     */ import com.seeinfobiz.click.util.DateUtil;
/*     */ import com.seeinfobiz.click.util.PropertiesFileRead;
/*     */ import com.seeinfobiz.click.writedeliveredandbouncelog.WriteLogs;
/*     */ import java.io.BufferedReader;
/*     */ import java.io.BufferedWriter;
/*     */ import java.io.FileWriter;
/*     */ import java.io.InputStreamReader;
/*     */ import java.util.Date;
/*     */ import java.util.Properties;
/*     */ import java.util.logging.Level;
/*     */ import java.util.logging.Logger;
/*     */ import javax.mail.MessagingException;
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
/*     */ public class ScheduleBounceTrap
/*     */ {
/*  30 */   private BounceTrapReptReSndManager bnTrapManager = new BounceTrapReptReSndManager();
/*  31 */   private BounceTrapReptReSendDAOImpl bnTrapDAO = new BounceTrapReptReSendDAOImpl();
/*  32 */   private SchedularManager schedularManager = new SchedularManager();
/*     */ 
/*     */   
/*     */   public void execute(Long paramLong) throws MessagingException, Exception {
/*  36 */     boolean bool = false;
/*  37 */     PropertiesFileRead propertiesFileRead = new PropertiesFileRead();
/*  38 */     Properties properties = propertiesFileRead.readPropertyFile();
/*  39 */     Pxshdlrxarcv pxshdlrxarcv = null;
/*  40 */     String str1 = null;
/*  41 */     String str2 = null;
/*     */     try {
/*     */       try {
/*  44 */         System.out.println("scheArcvId==> " + paramLong);
/*  45 */         pxshdlrxarcv = this.schedularManager.getScheduleArcv(paramLong);
/*  46 */         str1 = pxshdlrxarcv.getPxshdlrxm().getIxprdt();
/*  47 */         System.out.println("prdId==> " + str1);
/*     */       }
/*  49 */       catch (Exception exception) {
/*  50 */         str2 = "arch";
/*  51 */         System.out.println("scheArcvId arch==> " + paramLong);
/*  52 */         pxshdlrxarcv = this.schedularManager.getScheduleArcv(paramLong);
/*  53 */         str1 = pxshdlrxarcv.getPxshdlrxm().getIxprdt();
/*  54 */         System.out.println("prdId  arch==> " + str1);
/*     */       } 
/*  56 */       pxshdlrxarcv.setCrnt_stts("STATEMENT GENERATION INITIATING");
/*  57 */       this.schedularManager.saveProcessStatus(pxshdlrxarcv, str2);
/*  58 */       Date date = pxshdlrxarcv.getPxshdlrxm().getDxshdlrxcur();
/*  59 */       String str3 = DateUtil.getFormattedStrDate(date);
/*  60 */       String str4 = pxshdlrxarcv.getIxtmexshdlr();
/*  61 */       Long long_ = this.schedularManager.getProcessId(str1, str3, str4.replaceAll("-", " "), "SG", str2);
/*  62 */       System.out.println("Process id " + long_);
/*  63 */       String str5 = this.bnTrapManager.getScheduledBounceData(Long.valueOf(Long.parseLong(str1)), long_, "product", str3, str2);
/*  64 */       WriteLogs writeLogs = new WriteLogs();
/*  65 */       writeLogs.writeLog(long_, properties, "Bounced");
/*  66 */       writeLogs.writeLog(long_, properties, "Retrigger_Bounced");
/*     */       try {
/*  68 */         if (str5.equals("Success")) {
/*  69 */           bool = true;
/*     */         }
/*     */       }
/*  72 */       catch (Exception exception) {
/*  73 */         Logger.getLogger(ScheduleBounceTrap.class.getName()).log(Level.SEVERE, (String)null, exception);
/*     */       } finally {
/*     */         
/*  76 */         finishProcess(properties.getProperty("bt.status.log"), bool);
/*     */       }
/*     */     
/*  79 */     } catch (Exception exception) {
/*  80 */       exception.printStackTrace();
/*  81 */       System.out.println(" ProcessID is not found on this ArcvId ");
/*  82 */       finishProcess(properties.getProperty("bt.status.log"), false);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void runjob(Properties paramProperties) {
/*     */     try {
/*  88 */       Process process = Runtime.getRuntime().exec(paramProperties.getProperty("bt.script.path"));
/*  89 */       System.out.println("Job started");
/*  90 */       BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(process.getInputStream()));
/*  91 */       BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(process.getErrorStream()));
/*  92 */       String str = "";
/*  93 */       while ((str = bufferedReader1.readLine()) != null) {
/*  94 */         System.out.println("Process sout: " + str);
/*     */       }
/*  96 */       while ((str = bufferedReader2.readLine()) != null) {
/*  97 */         System.out.println("Process serror: " + str);
/*     */       }
/*  99 */       System.out.println("Job completed");
/*     */     }
/* 101 */     catch (Exception exception) {}
/*     */   }
/*     */   
/*     */   private void finishProcess(String paramString, boolean paramBoolean) {
/* 105 */     BufferedWriter bufferedWriter = null;
/*     */     try {
/* 107 */       bufferedWriter = new BufferedWriter(new FileWriter(paramString));
/* 108 */       if (paramBoolean) {
/* 109 */         bufferedWriter.write("SUCCESS");
/*     */       } else {
/*     */         
/* 112 */         bufferedWriter.write("FAIL");
/*     */       } 
/* 114 */       bufferedWriter.newLine();
/* 115 */       bufferedWriter.flush();
/*     */     }
/* 117 */     catch (Exception exception) {
/* 118 */       exception.printStackTrace();
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\impl\ScheduleBounceTrap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */