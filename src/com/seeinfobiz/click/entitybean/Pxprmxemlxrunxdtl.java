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
/*     */ public class Pxprmxemlxrunxdtl
/*     */   implements Serializable
/*     */ {
/*     */   private BigDecimal ixpxexd;
/*     */   private Pxprmxemlxm pxprmxemlxm;
/*     */   private BigDecimal ixprmxemlxdtl;
/*     */   private String crn;
/*     */   private String ixem;
/*     */   private String fxstts;
/*     */   private String fldx4;
/*     */   private String fldx5;
/*     */   private String fldx6;
/*     */   private String fldx7;
/*     */   private String fldx8;
/*     */   private String fldx9;
/*     */   private String fldx10;
/*     */   private Date dxctd;
/*     */   private String bxctd;
/*     */   private Date dxmfdxlst;
/*     */   private String bxmfdxlst;
/*     */   
/*     */   public Pxprmxemlxrunxdtl() {}
/*     */   
/*     */   public Pxprmxemlxrunxdtl(BigDecimal ixpxexd, BigDecimal ixprmxemlxdtl) {
/*  37 */     this.ixpxexd = ixpxexd;
/*  38 */     this.ixprmxemlxdtl = ixprmxemlxdtl;
/*     */   }
/*     */   public Pxprmxemlxrunxdtl(BigDecimal ixpxexd, Pxprmxemlxm pxprmxemlxm, BigDecimal ixprmxemlxdtl, String crn, String ixem, String fxstts, String fldx4, String fldx5, String fldx6, String fldx7, String fldx8, String fldx9, String fldx10, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst) {
/*  41 */     this.ixpxexd = ixpxexd;
/*  42 */     this.pxprmxemlxm = pxprmxemlxm;
/*  43 */     this.ixprmxemlxdtl = ixprmxemlxdtl;
/*  44 */     this.crn = crn;
/*  45 */     this.ixem = ixem;
/*  46 */     this.fxstts = fxstts;
/*  47 */     this.fldx4 = fldx4;
/*  48 */     this.fldx5 = fldx5;
/*  49 */     this.fldx6 = fldx6;
/*  50 */     this.fldx7 = fldx7;
/*  51 */     this.fldx8 = fldx8;
/*  52 */     this.fldx9 = fldx9;
/*  53 */     this.fldx10 = fldx10;
/*  54 */     this.dxctd = dxctd;
/*  55 */     this.bxctd = bxctd;
/*  56 */     this.dxmfdxlst = dxmfdxlst;
/*  57 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */   
/*     */   public BigDecimal getIxpxexd() {
/*  61 */     return this.ixpxexd;
/*     */   }
/*     */   
/*     */   public void setIxpxexd(BigDecimal ixpxexd) {
/*  65 */     this.ixpxexd = ixpxexd;
/*     */   }
/*     */   public Pxprmxemlxm getPxprmxemlxm() {
/*  68 */     return this.pxprmxemlxm;
/*     */   }
/*     */   
/*     */   public void setPxprmxemlxm(Pxprmxemlxm pxprmxemlxm) {
/*  72 */     this.pxprmxemlxm = pxprmxemlxm;
/*     */   }
/*     */   public BigDecimal getIxprmxemlxdtl() {
/*  75 */     return this.ixprmxemlxdtl;
/*     */   }
/*     */   
/*     */   public void setIxprmxemlxdtl(BigDecimal ixprmxemlxdtl) {
/*  79 */     this.ixprmxemlxdtl = ixprmxemlxdtl;
/*     */   }
/*     */   public String getCrn() {
/*  82 */     return this.crn;
/*     */   }
/*     */   
/*     */   public void setCrn(String crn) {
/*  86 */     this.crn = crn;
/*     */   }
/*     */   public String getIxem() {
/*  89 */     return this.ixem;
/*     */   }
/*     */   
/*     */   public void setIxem(String ixem) {
/*  93 */     this.ixem = ixem;
/*     */   }
/*     */   public String getFxstts() {
/*  96 */     return this.fxstts;
/*     */   }
/*     */   
/*     */   public void setFxstts(String fxstts) {
/* 100 */     this.fxstts = fxstts;
/*     */   }
/*     */   public String getFldx4() {
/* 103 */     return this.fldx4;
/*     */   }
/*     */   
/*     */   public void setFldx4(String fldx4) {
/* 107 */     this.fldx4 = fldx4;
/*     */   }
/*     */   public String getFldx5() {
/* 110 */     return this.fldx5;
/*     */   }
/*     */   
/*     */   public void setFldx5(String fldx5) {
/* 114 */     this.fldx5 = fldx5;
/*     */   }
/*     */   public String getFldx6() {
/* 117 */     return this.fldx6;
/*     */   }
/*     */   
/*     */   public void setFldx6(String fldx6) {
/* 121 */     this.fldx6 = fldx6;
/*     */   }
/*     */   public String getFldx7() {
/* 124 */     return this.fldx7;
/*     */   }
/*     */   
/*     */   public void setFldx7(String fldx7) {
/* 128 */     this.fldx7 = fldx7;
/*     */   }
/*     */   public String getFldx8() {
/* 131 */     return this.fldx8;
/*     */   }
/*     */   
/*     */   public void setFldx8(String fldx8) {
/* 135 */     this.fldx8 = fldx8;
/*     */   }
/*     */   public String getFldx9() {
/* 138 */     return this.fldx9;
/*     */   }
/*     */   
/*     */   public void setFldx9(String fldx9) {
/* 142 */     this.fldx9 = fldx9;
/*     */   }
/*     */   public String getFldx10() {
/* 145 */     return this.fldx10;
/*     */   }
/*     */   
/*     */   public void setFldx10(String fldx10) {
/* 149 */     this.fldx10 = fldx10;
/*     */   }
/*     */   public Date getDxctd() {
/* 152 */     return this.dxctd;
/*     */   }
/*     */   
/*     */   public void setDxctd(Date dxctd) {
/* 156 */     this.dxctd = dxctd;
/*     */   }
/*     */   public String getBxctd() {
/* 159 */     return this.bxctd;
/*     */   }
/*     */   
/*     */   public void setBxctd(String bxctd) {
/* 163 */     this.bxctd = bxctd;
/*     */   }
/*     */   public Date getDxmfdxlst() {
/* 166 */     return this.dxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setDxmfdxlst(Date dxmfdxlst) {
/* 170 */     this.dxmfdxlst = dxmfdxlst;
/*     */   }
/*     */   public String getBxmfdxlst() {
/* 173 */     return this.bxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setBxmfdxlst(String bxmfdxlst) {
/* 177 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pxprmxemlxrunxdtl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */