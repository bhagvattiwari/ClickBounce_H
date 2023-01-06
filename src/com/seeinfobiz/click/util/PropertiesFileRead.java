/*    */ package com.seeinfobiz.click.util;
/*    */ 
/*    */ import java.io.FileInputStream;
/*    */ import java.io.FileNotFoundException;
/*    */ import java.io.IOException;
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
/*    */ 
/*    */ 
/*    */ public class PropertiesFileRead
/*    */ {
/*    */   public Properties readPropertyFile() {
/* 21 */     Properties prop = new Properties();
/*    */     
/*    */     try {
/* 24 */       FileInputStream file = new FileInputStream("/consdata1/CLICK-PSS-10/sib_app/resource/CLICK_PSS.properties");
/*    */ 
/*    */       
/* 27 */       prop.load(file);
/* 28 */     } catch (FileNotFoundException ex) {
/* 29 */       Logger.getLogger(PropertiesFileRead.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 30 */     } catch (IOException ex) {
/* 31 */       Logger.getLogger(PropertiesFileRead.class.getName()).log(Level.SEVERE, (String)null, ex);
/*    */     } 
/* 33 */     return prop;
/*    */   }
/*    */   
/*    */   public Properties readPasswordPropertyFile() {
/* 37 */     Properties prop = new Properties();
/*    */     
/*    */     try {
/* 40 */       FileInputStream file = new FileInputStream("/consdata1/CLICK-PSS-10/sib_app/resource/CLICK_PSS_DynamicMessage.properties");
/*    */       
/* 42 */       prop.load(file);
/* 43 */     } catch (FileNotFoundException ex) {
/* 44 */       Logger.getLogger(PropertiesFileRead.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 45 */     } catch (IOException ex) {
/* 46 */       Logger.getLogger(PropertiesFileRead.class.getName()).log(Level.SEVERE, (String)null, ex);
/*    */     } 
/* 48 */     return prop;
/*    */   }
/*    */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\clic\\util\PropertiesFileRead.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */