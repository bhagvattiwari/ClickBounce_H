/*    */ package com.seeinfobiz.click.util;
/*    */ 
/*    */ import com.encryption.SecurePassword;
/*    */ import java.io.File;
/*    */ import java.util.Properties;
/*    */ import org.hibernate.Session;
/*    */ import org.hibernate.SessionFactory;
/*    */ import org.hibernate.cfg.Configuration;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class HibernateUtil_Main
/*    */ {
/*    */   private static final SessionFactory sessionFactory;
/*    */   
/*    */   static {
/*    */     try {
/* 25 */       Configuration cfg = getConfig();
/* 26 */       String encrPss = cfg.getProperty("hibernate.connection.password");
/*    */       
/* 28 */       String plainPass = SecurePassword.decode(encrPss);
/*    */       
/* 30 */       cfg.setProperty("hibernate.connection.password", plainPass);
/*    */       
/* 32 */       sessionFactory = cfg.buildSessionFactory();
/*    */     
/*    */     }
/* 35 */     catch (Throwable ex) {
/*    */       
/* 37 */       System.err.println("Initial SessionFactory creation failed." + ex);
/* 38 */       throw new ExceptionInInitializerError(ex);
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static Configuration getConfig() {
/* 46 */     PropertiesFileRead propFileRead = new PropertiesFileRead();
/* 47 */     Properties prop = propFileRead.readPropertyFile();
/*    */     
/* 49 */     Configuration cfg = new Configuration();
/*    */     
/* 51 */     File f = new File(prop.getProperty("hib.config.file.bounce"));
/* 52 */     System.out.println("getAbsoluteFile==> " + f.getAbsoluteFile());
/*    */     
/* 54 */     if (f.exists()) {
/* 55 */       cfg.configure(f);
/*    */     }
/*    */     
/* 58 */     return cfg;
/*    */   }
/*    */   public static SessionFactory getSessionFactory() {
/* 61 */     return sessionFactory;
/*    */   }
/*    */   
/*    */   public static Session getSession() {
/* 65 */     return (Session)sessionFactory.openSession();
/*    */   }
/*    */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\clic\\util\HibernateUtil_Main.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */