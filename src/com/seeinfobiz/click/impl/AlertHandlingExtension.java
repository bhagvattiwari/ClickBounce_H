/*     */ package com.seeinfobiz.click.impl;
/*     */ 
/*     */ import java.sql.Connection;
/*     */ import java.sql.ResultSet;
/*     */ import java.sql.SQLException;
/*     */ import java.sql.Statement;
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
/*     */ public class AlertHandlingExtension
/*     */ {
/*     */   public ResultSet getAlertEvents(Connection con, Statement stmt) throws SQLException {
/*  23 */     ResultSet rs = null;
/*     */     try {
/*  25 */       String sql = "select * from PXALTXEVTXM";
/*     */       
/*  27 */       rs = stmt.executeQuery(sql);
/*     */     }
/*  29 */     catch (SQLException ex) {
/*     */     
/*     */     } finally {}
/*     */ 
/*     */     
/*  34 */     return rs;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ResultSet getAlrtEvntDtlsList(Connection con, Statement stmt) throws SQLException {
/*  40 */     ResultSet rs = null;
/*     */     
/*     */     try {
/*  43 */       String sql = "select * from PXALTXEVTXDTS";
/*     */       
/*  45 */       rs = stmt.executeQuery(sql);
/*     */     }
/*  47 */     catch (SQLException ex) {
/*     */     
/*     */     } finally {}
/*     */ 
/*     */     
/*  52 */     return rs;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ResultSet getEmailConfig(Connection con, Statement stmt, Long serverID) throws SQLException {
/*  58 */     ResultSet rs = null;
/*     */     try {
/*  60 */       String sql = "select * from PXEMXSRVXCNFG where IXSRXEM = " + serverID + "";
/*     */       
/*  62 */       rs = stmt.executeQuery(sql);
/*     */     }
/*  64 */     catch (SQLException ex) {
/*     */     
/*     */     } finally {}
/*     */ 
/*     */     
/*  69 */     return rs;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ResultSet getAlrtEmailList(String sgbeFlag, Statement stmt, long processId) throws SQLException {
/*  77 */     ResultSet rs = null;
/*  78 */     String sql = "";
/*     */     
/*     */     try {
/*  81 */       if (sgbeFlag.equals("SG")) {
/*  82 */         sql = "select * from DXPRDTNXDTLSXM prdtl where prdtl.MDXGXGEN='G' and prdtl.IXPRCS=" + processId + "";
/*     */         
/*  84 */         rs = stmt.executeQuery(sql);
/*     */       } 
/*     */       
/*  87 */       if (sgbeFlag.equals("BE")) {
/*  88 */         sql = "select * from PXBNCDXTRA";
/*     */         
/*  90 */         rs = stmt.executeQuery(sql);
/*     */       } 
/*     */       
/*  93 */       if (rs == null);
/*     */     
/*     */     }
/*  96 */     catch (SQLException ex) {
/*     */ 
/*     */       
/*  99 */       ex.printStackTrace();
/*     */     } finally {}
/*     */ 
/*     */     
/* 103 */     return rs;
/*     */   }
/*     */ 
/*     */   
/*     */   public ResultSet getCustomerByCRN(String qualify, Statement stmt) throws SQLException {
/* 108 */     String sql = "";
/* 109 */     ResultSet rs = null;
/*     */     
/*     */     try {
/* 112 */       sql = "select * from DXCSTMRXDTLS d where exists(select ixcst from DXCSTMRXM m where CRN = '" + qualify + "' and m.ixcst  = d.ixcst )";
/*     */       
/* 114 */       rs = stmt.executeQuery(sql);
/*     */     }
/* 116 */     catch (SQLException ex) {
/* 117 */       ex.printStackTrace();
/*     */     } finally {}
/*     */ 
/*     */ 
/*     */     
/* 122 */     return rs;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\impl\AlertHandlingExtension.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */