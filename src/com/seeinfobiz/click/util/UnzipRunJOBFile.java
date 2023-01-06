/*    */ package com.seeinfobiz.click.util;
/*    */ 
/*    */ import java.io.BufferedReader;
/*    */ import java.io.InputStreamReader;
/*    */ import java.util.Date;
/*    */ import java.util.Properties;
/*    */ import java.util.logging.Level;
/*    */ import java.util.logging.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class UnzipRunJOBFile
/*    */ {
/* 18 */   public static PropertiesFileRead propRead = new PropertiesFileRead();
/* 19 */   public static Properties prop = propRead.readPropertyFile();
/* 20 */   public static String operatingSystem = prop.getProperty("OPERATING_SYSTEM");
/* 21 */   public static String commandPromt = prop.getProperty("COMMANDPROMPT");
/*    */ 
/*    */ 
/*    */   
/*    */   public static String runBatFile(String batFile, String prdiD) throws InterruptedException {
/* 26 */     String prodType = "";
/* 27 */     String exe = "";
/* 28 */     System.out.println("runBatFile " + batFile + prdiD);
/*    */     try {
/* 30 */       if (operatingSystem.equalsIgnoreCase("WINDOWS")) {
/* 31 */         exe = "cmd " + commandPromt + " start /MIN " + batFile;
/*    */       } else {
/* 33 */         exe = "sh " + batFile + " " + prdiD;
/*    */       } 
/* 35 */       System.out.println(" exe ------" + exe);
/*    */       
/* 37 */       Date start = new Date();
/* 38 */       Process exec = Runtime.getRuntime().exec(exe);
/* 39 */       BufferedReader stdInput = new BufferedReader(new InputStreamReader(exec.getInputStream()));
/* 40 */       BufferedReader stdError = new BufferedReader(new InputStreamReader(exec.getErrorStream()));
/*    */       
/* 42 */       String s = "";
/* 43 */       while ((s = stdInput.readLine()) != null) {
/* 44 */         System.out.println("Process sout: " + s);
/*    */       }
/*    */       
/* 47 */       while ((s = stdError.readLine()) != null) {
/* 48 */         System.out.println("Process serror: " + s);
/*    */       }
/* 50 */       Date end = new Date();
/* 51 */       long timetaken = end.getTime() - start.getTime();
/*    */       
/* 53 */       System.out.println("ETL job completed. Timetaken: " + timetaken);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     }
/* 62 */     catch (Exception ex) {
/* 63 */       Logger.getLogger(UnzipRunJOBFile.class.getName()).log(Level.SEVERE, (String)null, ex);
/*    */     } 
/* 65 */     return ((prodType == null) ? ("" == null) : prodType.equals("")) ? "BANK" : prodType;
/*    */   }
/*    */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\clic\\util\UnzipRunJOBFile.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */