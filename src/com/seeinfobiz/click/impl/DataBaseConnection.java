/*     */ package com.seeinfobiz.click.impl;
/*     */ 
/*     */ import java.io.InputStream;
/*     */ import java.sql.Connection;
/*     */ import java.sql.DriverManager;
/*     */ import java.sql.ResultSet;
/*     */ import java.sql.SQLException;
/*     */ import java.sql.Statement;
/*     */ import java.util.Properties;
/*     */ import java.util.logging.Level;
/*     */ import java.util.logging.Logger;
/*     */ import javax.naming.Context;
/*     */ import javax.sql.DataSource;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class DataBaseConnection
/*     */ {
/*  24 */   DataSource ds = null;
/*  25 */   Context ctx = null;
/*  26 */   Context envctx = null;
/*  27 */   Connection con = null;
/*  28 */   Statement stmt = null;
/*  29 */   ResultSet rs = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  39 */   Properties SystemProperties = new Properties();
/*     */   
/*     */   public String getProperties(String key) {
/*  42 */     String value = "";
/*     */     try {
/*  44 */       InputStream istream = getClass().getResourceAsStream("/properties/CLICK_PSS.properties");
/*  45 */       if (istream != null) {
/*  46 */         this.SystemProperties.load(istream);
/*  47 */         istream.close();
/*     */       } 
/*  49 */       value = (String)this.SystemProperties.get(key);
/*  50 */     } catch (Exception e) {
/*     */       
/*  52 */       System.out.println("Error in Property file  Value not match    " + e);
/*     */     } 
/*     */     
/*  55 */     return value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Connection getjdbcConnection(Properties prop) throws Exception {
/*     */     try {
/*  65 */       Class.forName(prop.getProperty("DRIVER"));
/*  66 */       this.con = DriverManager.getConnection(prop.getProperty("URL"), prop.getProperty("USER"), prop.getProperty("PASSWORD"));
/*     */     }
/*  68 */     catch (SQLException ex) {
/*     */     
/*  70 */     } catch (ClassNotFoundException ex) {}
/*     */ 
/*     */ 
/*     */     
/*  74 */     return this.con;
/*     */   }
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
/*     */   public void closeConnection() {
/*     */     try {
/*  88 */       if (this.rs != null) {
/*  89 */         this.rs.close();
/*     */       }
/*  91 */       if (this.con != null) {
/*  92 */         this.con.close();
/*     */       }
/*     */     }
/*  95 */     catch (SQLException ex) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 101 */       Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE, (String)null, ex);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\impl\DataBaseConnection.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */