/*    */ package com.seeinfobiz.click.entitybean;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.math.BigDecimal;
/*    */ import java.util.Date;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Pxbncdxsbjct
/*    */   implements Serializable
/*    */ {
/*    */   private BigDecimal ixsbjct;
/*    */   private String lnxsbjct;
/*    */   private Date dxctd;
/*    */   private String bxctd;
/*    */   private Date dxmfdxlst;
/*    */   private String bxmfdxlst;
/*    */   
/*    */   public Pxbncdxsbjct() {}
/*    */   
/*    */   public Pxbncdxsbjct(BigDecimal ixsbjct) {
/* 26 */     this.ixsbjct = ixsbjct;
/*    */   }
/*    */   public Pxbncdxsbjct(BigDecimal ixsbjct, String lnxsbjct, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst) {
/* 29 */     this.ixsbjct = ixsbjct;
/* 30 */     this.lnxsbjct = lnxsbjct;
/* 31 */     this.dxctd = dxctd;
/* 32 */     this.bxctd = bxctd;
/* 33 */     this.dxmfdxlst = dxmfdxlst;
/* 34 */     this.bxmfdxlst = bxmfdxlst;
/*    */   }
/*    */   
/*    */   public BigDecimal getIxsbjct() {
/* 38 */     return this.ixsbjct;
/*    */   }
/*    */   
/*    */   public void setIxsbjct(BigDecimal ixsbjct) {
/* 42 */     this.ixsbjct = ixsbjct;
/*    */   }
/*    */   public String getLnxsbjct() {
/* 45 */     return this.lnxsbjct;
/*    */   }
/*    */   
/*    */   public void setLnxsbjct(String lnxsbjct) {
/* 49 */     this.lnxsbjct = lnxsbjct;
/*    */   }
/*    */   public Date getDxctd() {
/* 52 */     return this.dxctd;
/*    */   }
/*    */   
/*    */   public void setDxctd(Date dxctd) {
/* 56 */     this.dxctd = dxctd;
/*    */   }
/*    */   public String getBxctd() {
/* 59 */     return this.bxctd;
/*    */   }
/*    */   
/*    */   public void setBxctd(String bxctd) {
/* 63 */     this.bxctd = bxctd;
/*    */   }
/*    */   public Date getDxmfdxlst() {
/* 66 */     return this.dxmfdxlst;
/*    */   }
/*    */   
/*    */   public void setDxmfdxlst(Date dxmfdxlst) {
/* 70 */     this.dxmfdxlst = dxmfdxlst;
/*    */   }
/*    */   public String getBxmfdxlst() {
/* 73 */     return this.bxmfdxlst;
/*    */   }
/*    */   
/*    */   public void setBxmfdxlst(String bxmfdxlst) {
/* 77 */     this.bxmfdxlst = bxmfdxlst;
/*    */   }
/*    */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pxbncdxsbjct.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */