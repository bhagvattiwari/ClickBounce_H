/*    */ package com.seeinfobiz.click.dbconnection;
/*    */ 
/*    */ import com.encryption.SecurePassword;
/*    */ import com.seeinfobiz.click.util.PropertiesFileRead;
/*    */ import java.sql.Connection;
/*    */ import java.sql.DriverManager;
/*    */ import java.util.Properties;
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
/*    */ public class DBConnection
/*    */ {
/* 20 */   PropertiesFileRead propRead = new PropertiesFileRead();
/* 21 */   Properties prop = this.propRead.readPropertyFile();
/*    */   
/*    */   public Connection getjdbcConnection() throws Exception {
/* 24 */     Connection con = null;
/*    */     try {
/* 26 */       Class.forName(this.prop.getProperty("DRIVER"));
/* 27 */       con = DriverManager.getConnection(this.prop.getProperty("URL_ARCH"), this.prop.getProperty("USER_ARCH"), SecurePassword.decode(this.prop.getProperty("PASSWORD_ARCH")));
/* 28 */     } catch (Exception ex) {
/* 29 */       ex.printStackTrace();
/*    */     } 
/* 31 */     return con;
/*    */   }
/*    */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\dbconnection\DBConnection.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */