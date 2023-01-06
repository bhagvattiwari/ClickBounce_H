/*    */ package com.seeinfobiz.click.entitybean;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.math.BigDecimal;
/*    */ import java.util.Date;
/*    */ import java.util.HashSet;
/*    */ import java.util.Set;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Pxarcvxshdlrxmde
/*    */   implements Serializable
/*    */ {
/*    */   private BigDecimal ixmdxshdlrxarcv;
/*    */   private Pxarcvxshdlrxm pxarcvxshdlrxm;
/*    */   private String mdxschdlr;
/*    */   private Date dxctd;
/*    */   private String bxctd;
/*    */   private Date dxmfdxlst;
/*    */   private String bxmfdxlst;
/* 23 */   private Set<Pxarcvxshdlrxdtls> pxarcvxshdlrxdtlses = new HashSet<Pxarcvxshdlrxdtls>(0);
/*    */ 
/*    */   
/*    */   public Pxarcvxshdlrxmde() {}
/*    */ 
/*    */   
/*    */   public Pxarcvxshdlrxmde(BigDecimal ixmdxshdlrxarcv) {
/* 30 */     this.ixmdxshdlrxarcv = ixmdxshdlrxarcv;
/*    */   }
/*    */   public Pxarcvxshdlrxmde(BigDecimal ixmdxshdlrxarcv, Pxarcvxshdlrxm pxarcvxshdlrxm, String mdxschdlr, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst, Set<Pxarcvxshdlrxdtls> pxarcvxshdlrxdtlses) {
/* 33 */     this.ixmdxshdlrxarcv = ixmdxshdlrxarcv;
/* 34 */     this.pxarcvxshdlrxm = pxarcvxshdlrxm;
/* 35 */     this.mdxschdlr = mdxschdlr;
/* 36 */     this.dxctd = dxctd;
/* 37 */     this.bxctd = bxctd;
/* 38 */     this.dxmfdxlst = dxmfdxlst;
/* 39 */     this.bxmfdxlst = bxmfdxlst;
/* 40 */     this.pxarcvxshdlrxdtlses = pxarcvxshdlrxdtlses;
/*    */   }
/*    */   
/*    */   public BigDecimal getIxmdxshdlrxarcv() {
/* 44 */     return this.ixmdxshdlrxarcv;
/*    */   }
/*    */   
/*    */   public void setIxmdxshdlrxarcv(BigDecimal ixmdxshdlrxarcv) {
/* 48 */     this.ixmdxshdlrxarcv = ixmdxshdlrxarcv;
/*    */   }
/*    */   public Pxarcvxshdlrxm getPxarcvxshdlrxm() {
/* 51 */     return this.pxarcvxshdlrxm;
/*    */   }
/*    */   
/*    */   public void setPxarcvxshdlrxm(Pxarcvxshdlrxm pxarcvxshdlrxm) {
/* 55 */     this.pxarcvxshdlrxm = pxarcvxshdlrxm;
/*    */   }
/*    */   public String getMdxschdlr() {
/* 58 */     return this.mdxschdlr;
/*    */   }
/*    */   
/*    */   public void setMdxschdlr(String mdxschdlr) {
/* 62 */     this.mdxschdlr = mdxschdlr;
/*    */   }
/*    */   public Date getDxctd() {
/* 65 */     return this.dxctd;
/*    */   }
/*    */   
/*    */   public void setDxctd(Date dxctd) {
/* 69 */     this.dxctd = dxctd;
/*    */   }
/*    */   public String getBxctd() {
/* 72 */     return this.bxctd;
/*    */   }
/*    */   
/*    */   public void setBxctd(String bxctd) {
/* 76 */     this.bxctd = bxctd;
/*    */   }
/*    */   public Date getDxmfdxlst() {
/* 79 */     return this.dxmfdxlst;
/*    */   }
/*    */   
/*    */   public void setDxmfdxlst(Date dxmfdxlst) {
/* 83 */     this.dxmfdxlst = dxmfdxlst;
/*    */   }
/*    */   public String getBxmfdxlst() {
/* 86 */     return this.bxmfdxlst;
/*    */   }
/*    */   
/*    */   public void setBxmfdxlst(String bxmfdxlst) {
/* 90 */     this.bxmfdxlst = bxmfdxlst;
/*    */   }
/*    */   public Set<Pxarcvxshdlrxdtls> getPxarcvxshdlrxdtlses() {
/* 93 */     return this.pxarcvxshdlrxdtlses;
/*    */   }
/*    */   
/*    */   public void setPxarcvxshdlrxdtlses(Set<Pxarcvxshdlrxdtls> pxarcvxshdlrxdtlses) {
/* 97 */     this.pxarcvxshdlrxdtlses = pxarcvxshdlrxdtlses;
/*    */   }
/*    */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pxarcvxshdlrxmde.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */