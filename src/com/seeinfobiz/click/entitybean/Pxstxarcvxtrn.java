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
/*     */ public class Pxstxarcvxtrn
/*     */   implements Serializable
/*     */ {
/*     */   private BigDecimal ixtrnsxarcv;
/*     */   private Pxprdctxm pxprdctxm;
/*     */   private Date dtxarch;
/*     */   private Long pdxarch;
/*     */   private String ptxflxarch;
/*     */   private Date dxctd;
/*     */   private String bxctd;
/*     */   private Date dxmfdxlst;
/*     */   private String bxmfdxlst;
/*     */   
/*     */   public Pxstxarcvxtrn() {}
/*     */   
/*     */   public Pxstxarcvxtrn(BigDecimal ixtrnsxarcv) {
/*  29 */     this.ixtrnsxarcv = ixtrnsxarcv;
/*     */   }
/*     */   public Pxstxarcvxtrn(BigDecimal ixtrnsxarcv, Pxprdctxm pxprdctxm, Date dtxarch, Long pdxarch, String ptxflxarch, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst) {
/*  32 */     this.ixtrnsxarcv = ixtrnsxarcv;
/*  33 */     this.pxprdctxm = pxprdctxm;
/*  34 */     this.dtxarch = dtxarch;
/*  35 */     this.pdxarch = pdxarch;
/*  36 */     this.ptxflxarch = ptxflxarch;
/*  37 */     this.dxctd = dxctd;
/*  38 */     this.bxctd = bxctd;
/*  39 */     this.dxmfdxlst = dxmfdxlst;
/*  40 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */   
/*     */   public BigDecimal getIxtrnsxarcv() {
/*  44 */     return this.ixtrnsxarcv;
/*     */   }
/*     */   
/*     */   public void setIxtrnsxarcv(BigDecimal ixtrnsxarcv) {
/*  48 */     this.ixtrnsxarcv = ixtrnsxarcv;
/*     */   }
/*     */   public Pxprdctxm getPxprdctxm() {
/*  51 */     return this.pxprdctxm;
/*     */   }
/*     */   
/*     */   public void setPxprdctxm(Pxprdctxm pxprdctxm) {
/*  55 */     this.pxprdctxm = pxprdctxm;
/*     */   }
/*     */   public Date getDtxarch() {
/*  58 */     return this.dtxarch;
/*     */   }
/*     */   
/*     */   public void setDtxarch(Date dtxarch) {
/*  62 */     this.dtxarch = dtxarch;
/*     */   }
/*     */   public Long getPdxarch() {
/*  65 */     return this.pdxarch;
/*     */   }
/*     */   
/*     */   public void setPdxarch(Long pdxarch) {
/*  69 */     this.pdxarch = pdxarch;
/*     */   }
/*     */   public String getPtxflxarch() {
/*  72 */     return this.ptxflxarch;
/*     */   }
/*     */   
/*     */   public void setPtxflxarch(String ptxflxarch) {
/*  76 */     this.ptxflxarch = ptxflxarch;
/*     */   }
/*     */   public Date getDxctd() {
/*  79 */     return this.dxctd;
/*     */   }
/*     */   
/*     */   public void setDxctd(Date dxctd) {
/*  83 */     this.dxctd = dxctd;
/*     */   }
/*     */   public String getBxctd() {
/*  86 */     return this.bxctd;
/*     */   }
/*     */   
/*     */   public void setBxctd(String bxctd) {
/*  90 */     this.bxctd = bxctd;
/*     */   }
/*     */   public Date getDxmfdxlst() {
/*  93 */     return this.dxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setDxmfdxlst(Date dxmfdxlst) {
/*  97 */     this.dxmfdxlst = dxmfdxlst;
/*     */   }
/*     */   public String getBxmfdxlst() {
/* 100 */     return this.bxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setBxmfdxlst(String bxmfdxlst) {
/* 104 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pxstxarcvxtrn.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */