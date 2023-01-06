/*     */ package com.seeinfobiz.click.entitybean;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Cxrlbkxm
/*     */   implements Serializable
/*     */ {
/*     */   private Long ixrlbk;
/*     */   private Pxprdctxm pxprdctxm;
/*     */   private Date dtxprcs;
/*     */   private Date dxst;
/*     */   private String fxlvlxrlbk;
/*     */   private String fxnwxrn;
/*     */   private Date dtxschdlr;
/*     */   private Date dxctd;
/*     */   private String bxctd;
/*     */   private Date dxmfdxlst;
/*     */   private String bxmfdxlst;
/*     */   private String fxstxus;
/*     */   
/*     */   public Cxrlbkxm() {}
/*     */   
/*     */   public Cxrlbkxm(Long ixrlbk) {
/*  32 */     this.ixrlbk = ixrlbk;
/*     */   }
/*     */   public Cxrlbkxm(Long ixrlbk, Pxprdctxm pxprdctxm, Date dtxprcs, Date dxst, String fxlvlxrlbk, String fxnwxrn, Date dtxschdlr, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst, String fxstxus) {
/*  35 */     this.ixrlbk = ixrlbk;
/*  36 */     this.pxprdctxm = pxprdctxm;
/*  37 */     this.dtxprcs = dtxprcs;
/*  38 */     this.dxst = dxst;
/*  39 */     this.fxlvlxrlbk = fxlvlxrlbk;
/*  40 */     this.fxnwxrn = fxnwxrn;
/*  41 */     this.dtxschdlr = dtxschdlr;
/*  42 */     this.dxctd = dxctd;
/*  43 */     this.bxctd = bxctd;
/*  44 */     this.dxmfdxlst = dxmfdxlst;
/*  45 */     this.bxmfdxlst = bxmfdxlst;
/*  46 */     this.fxstxus = fxstxus;
/*     */   }
/*     */   
/*     */   public Long getIxrlbk() {
/*  50 */     return this.ixrlbk;
/*     */   }
/*     */   
/*     */   public void setIxrlbk(Long ixrlbk) {
/*  54 */     this.ixrlbk = ixrlbk;
/*     */   }
/*     */   public Pxprdctxm getPxprdctxm() {
/*  57 */     return this.pxprdctxm;
/*     */   }
/*     */   
/*     */   public void setPxprdctxm(Pxprdctxm pxprdctxm) {
/*  61 */     this.pxprdctxm = pxprdctxm;
/*     */   }
/*     */   public Date getDtxprcs() {
/*  64 */     return this.dtxprcs;
/*     */   }
/*     */   
/*     */   public void setDtxprcs(Date dtxprcs) {
/*  68 */     this.dtxprcs = dtxprcs;
/*     */   }
/*     */   public Date getDxst() {
/*  71 */     return this.dxst;
/*     */   }
/*     */   
/*     */   public void setDxst(Date dxst) {
/*  75 */     this.dxst = dxst;
/*     */   }
/*     */   public String getFxlvlxrlbk() {
/*  78 */     return this.fxlvlxrlbk;
/*     */   }
/*     */   
/*     */   public void setFxlvlxrlbk(String fxlvlxrlbk) {
/*  82 */     this.fxlvlxrlbk = fxlvlxrlbk;
/*     */   }
/*     */   public String getFxnwxrn() {
/*  85 */     return this.fxnwxrn;
/*     */   }
/*     */   
/*     */   public void setFxnwxrn(String fxnwxrn) {
/*  89 */     this.fxnwxrn = fxnwxrn;
/*     */   }
/*     */   public Date getDtxschdlr() {
/*  92 */     return this.dtxschdlr;
/*     */   }
/*     */   
/*     */   public void setDtxschdlr(Date dtxschdlr) {
/*  96 */     this.dtxschdlr = dtxschdlr;
/*     */   }
/*     */   public Date getDxctd() {
/*  99 */     return this.dxctd;
/*     */   }
/*     */   
/*     */   public void setDxctd(Date dxctd) {
/* 103 */     this.dxctd = dxctd;
/*     */   }
/*     */   public String getBxctd() {
/* 106 */     return this.bxctd;
/*     */   }
/*     */   
/*     */   public void setBxctd(String bxctd) {
/* 110 */     this.bxctd = bxctd;
/*     */   }
/*     */   public Date getDxmfdxlst() {
/* 113 */     return this.dxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setDxmfdxlst(Date dxmfdxlst) {
/* 117 */     this.dxmfdxlst = dxmfdxlst;
/*     */   }
/*     */   public String getBxmfdxlst() {
/* 120 */     return this.bxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setBxmfdxlst(String bxmfdxlst) {
/* 124 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */   
/*     */   public String getFxstxus() {
/* 128 */     return this.fxstxus;
/*     */   }
/*     */   
/*     */   public void setFxstxus(String fxstxus) {
/* 132 */     this.fxstxus = fxstxus;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Cxrlbkxm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */