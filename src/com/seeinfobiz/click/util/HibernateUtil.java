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
/*    */ public class HibernateUtil
/*    */ {
/*    */   private static final SessionFactory sessionFactory;
/*    */   
/*    */   static {
/*    */     try {
/* 23 */       Configuration cfg = getConfig();
/* 24 */       String encrPss = cfg.getProperty("hibernate.connection.password");
/*    */       
/* 26 */       String plainPass = SecurePassword.decode(encrPss);
/*    */       
/* 28 */       cfg.setProperty("hibernate.connection.password", plainPass);
/*    */       
/* 30 */       sessionFactory = cfg.buildSessionFactory();
/*    */     
/*    */     }
/* 33 */     catch (Throwable ex) {
/*    */       
/* 35 */       System.err.println("Initial SessionFactory creation failed." + ex);
/* 36 */       throw new ExceptionInInitializerError(ex);
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static Configuration getConfig() {
/* 44 */     PropertiesFileRead propFileRead = new PropertiesFileRead();
/* 45 */     Properties prop = propFileRead.readPropertyFile();
/*    */     
/* 47 */     Configuration cfg = new Configuration();
/*    */     
/* 49 */     File f = new File(prop.getProperty("hib.config.file"));
/* 50 */     System.out.println("getAbsoluteFile==> " + f.getAbsoluteFile());
/*    */     
/* 52 */     if (f.exists()) {
/* 53 */       cfg.configure(f);
/*    */     }
/*    */     
/* 56 */     return cfg;
/*    */   }
/*    */   public static SessionFactory getSessionFactory() {
/* 59 */     return sessionFactory;
/*    */   }
/*    */   
/*    */   public static Session getSession() {
/* 63 */     return (Session)sessionFactory.openSession();
/*    */   }
/*    */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\clic\\util\HibernateUtil.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */