/*     */ package com.seeinfobiz.click.entitybean;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.math.BigDecimal;
/*     */ import java.util.Date;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Pxbncdxrsnxm
/*     */   implements Serializable
/*     */ {
/*     */   private BigDecimal ixrsn;
/*     */   private Pxprdctxm pxprdctxm;
/*     */   private Cxprcsxm cxprcsxm;
/*     */   private String nmxprdt;
/*     */   private BigDecimal ixst;
/*     */   private Date dxprcs;
/*     */   private String flrxstg;
/*     */   private String rsns;
/*     */   private Date dxctd;
/*     */   private String bxctd;
/*     */   private Date dxmfdxlst;
/*     */   private String bxmfdxlst;
/*     */   
/*     */   public Pxbncdxrsnxm() {}
/*     */   
/*     */   public Pxbncdxrsnxm(BigDecimal ixrsn) {
/*  32 */     this.ixrsn = ixrsn;
/*     */   }
/*     */   public Pxbncdxrsnxm(BigDecimal ixrsn, Pxprdctxm pxprdctxm, Cxprcsxm cxprcsxm, String nmxprdt, BigDecimal ixst, Date dxprcs, String flrxstg, String rsns, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst) {
/*  35 */     this.ixrsn = ixrsn;
/*  36 */     this.pxprdctxm = pxprdctxm;
/*  37 */     this.cxprcsxm = cxprcsxm;
/*  38 */     this.nmxprdt = nmxprdt;
/*  39 */     this.ixst = ixst;
/*  40 */     this.dxprcs = dxprcs;
/*  41 */     this.flrxstg = flrxstg;
/*  42 */     this.rsns = rsns;
/*  43 */     this.dxctd = dxctd;
/*  44 */     this.bxctd = bxctd;
/*  45 */     this.dxmfdxlst = dxmfdxlst;
/*  46 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */   
/*     */   public BigDecimal getIxrsn() {
/*  50 */     return this.ixrsn;
/*     */   }
/*     */   
/*     */   public void setIxrsn(BigDecimal ixrsn) {
/*  54 */     this.ixrsn = ixrsn;
/*     */   }
/*     */   public Pxprdctxm getPxprdctxm() {
/*  57 */     return this.pxprdctxm;
/*     */   }
/*     */   
/*     */   public void setPxprdctxm(Pxprdctxm pxprdctxm) {
/*  61 */     this.pxprdctxm = pxprdctxm;
/*     */   }
/*     */   public Cxprcsxm getCxprcsxm() {
/*  64 */     return this.cxprcsxm;
/*     */   }
/*     */   
/*     */   public void setCxprcsxm(Cxprcsxm cxprcsxm) {
/*  68 */     this.cxprcsxm = cxprcsxm;
/*     */   }
/*     */   public String getNmxprdt() {
/*  71 */     return this.nmxprdt;
/*     */   }
/*     */   
/*     */   public void setNmxprdt(String nmxprdt) {
/*  75 */     this.nmxprdt = nmxprdt;
/*     */   }
/*     */   public BigDecimal getIxst() {
/*  78 */     return this.ixst;
/*     */   }
/*     */   
/*     */   public void setIxst(BigDecimal ixst) {
/*  82 */     this.ixst = ixst;
/*     */   }
/*     */   public Date getDxprcs() {
/*  85 */     return this.dxprcs;
/*     */   }
/*     */   
/*     */   public void setDxprcs(Date dxprcs) {
/*  89 */     this.dxprcs = dxprcs;
/*     */   }
/*     */   public String getFlrxstg() {
/*  92 */     return this.flrxstg;
/*     */   }
/*     */   
/*     */   public void setFlrxstg(String flrxstg) {
/*  96 */     this.flrxstg = flrxstg;
/*     */   }
/*     */   public String getRsns() {
/*  99 */     return this.rsns;
/*     */   }
/*     */   
/*     */   public void setRsns(String rsns) {
/* 103 */     this.rsns = rsns;
/*     */   }
/*     */   public Date getDxctd() {
/* 106 */     return this.dxctd;
/*     */   }
/*     */   
/*     */   public void setDxctd(Date dxctd) {
/* 110 */     this.dxctd = dxctd;
/*     */   }
/*     */   public String getBxctd() {
/* 113 */     return this.bxctd;
/*     */   }
/*     */   
/*     */   public void setBxctd(String bxctd) {
/* 117 */     this.bxctd = bxctd;
/*     */   }
/*     */   public Date getDxmfdxlst() {
/* 120 */     return this.dxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setDxmfdxlst(Date dxmfdxlst) {
/* 124 */     this.dxmfdxlst = dxmfdxlst;
/*     */   }
/*     */   public String getBxmfdxlst() {
/* 127 */     return this.bxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setBxmfdxlst(String bxmfdxlst) {
/* 131 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pxbncdxrsnxm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */