/*    */ package com.seeinfobiz.click.entitybean;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.Date;
/*    */ import java.util.HashSet;
/*    */ import java.util.Set;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Pxbncdxschdlrxm
/*    */   implements Serializable
/*    */ {
/*    */   private Long ixshdlrxbncd;
/*    */   private String mdxshdlr;
/*    */   private Date dxctd;
/*    */   private String bxctd;
/*    */   private Date dxmfdxlst;
/*    */   private String bxmfdxlst;
/* 22 */   private Set<Pxbncdxshdlrxdtls> pxbncdxshdlrxdtlses = new HashSet<Pxbncdxshdlrxdtls>(0);
/*    */ 
/*    */   
/*    */   public Pxbncdxschdlrxm() {}
/*    */ 
/*    */   
/*    */   public Pxbncdxschdlrxm(Long ixshdlrxbncd) {
/* 29 */     this.ixshdlrxbncd = ixshdlrxbncd;
/*    */   }
/*    */   public Pxbncdxschdlrxm(Long ixshdlrxbncd, String mdxshdlr, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst, Set<Pxbncdxshdlrxdtls> pxbncdxshdlrxdtlses) {
/* 32 */     this.ixshdlrxbncd = ixshdlrxbncd;
/* 33 */     this.mdxshdlr = mdxshdlr;
/* 34 */     this.dxctd = dxctd;
/* 35 */     this.bxctd = bxctd;
/* 36 */     this.dxmfdxlst = dxmfdxlst;
/* 37 */     this.bxmfdxlst = bxmfdxlst;
/* 38 */     this.pxbncdxshdlrxdtlses = pxbncdxshdlrxdtlses;
/*    */   }
/*    */   
/*    */   public Long getIxshdlrxbncd() {
/* 42 */     return this.ixshdlrxbncd;
/*    */   }
/*    */   
/*    */   public void setIxshdlrxbncd(Long ixshdlrxbncd) {
/* 46 */     this.ixshdlrxbncd = ixshdlrxbncd;
/*    */   }
/*    */   public String getMdxshdlr() {
/* 49 */     return this.mdxshdlr;
/*    */   }
/*    */   
/*    */   public void setMdxshdlr(String mdxshdlr) {
/* 53 */     this.mdxshdlr = mdxshdlr;
/*    */   }
/*    */   public Date getDxctd() {
/* 56 */     return this.dxctd;
/*    */   }
/*    */   
/*    */   public void setDxctd(Date dxctd) {
/* 60 */     this.dxctd = dxctd;
/*    */   }
/*    */   public String getBxctd() {
/* 63 */     return this.bxctd;
/*    */   }
/*    */   
/*    */   public void setBxctd(String bxctd) {
/* 67 */     this.bxctd = bxctd;
/*    */   }
/*    */   public Date getDxmfdxlst() {
/* 70 */     return this.dxmfdxlst;
/*    */   }
/*    */   
/*    */   public void setDxmfdxlst(Date dxmfdxlst) {
/* 74 */     this.dxmfdxlst = dxmfdxlst;
/*    */   }
/*    */   public String getBxmfdxlst() {
/* 77 */     return this.bxmfdxlst;
/*    */   }
/*    */   
/*    */   public void setBxmfdxlst(String bxmfdxlst) {
/* 81 */     this.bxmfdxlst = bxmfdxlst;
/*    */   }
/*    */   public Set<Pxbncdxshdlrxdtls> getPxbncdxshdlrxdtlses() {
/* 84 */     return this.pxbncdxshdlrxdtlses;
/*    */   }
/*    */   
/*    */   public void setPxbncdxshdlrxdtlses(Set<Pxbncdxshdlrxdtls> pxbncdxshdlrxdtlses) {
/* 88 */     this.pxbncdxshdlrxdtlses = pxbncdxshdlrxdtlses;
/*    */   }
/*    */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pxbncdxschdlrxm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */