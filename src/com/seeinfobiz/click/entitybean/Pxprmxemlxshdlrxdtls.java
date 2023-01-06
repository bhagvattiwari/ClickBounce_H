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
/*     */ public class Pxprmxemlxshdlrxdtls
/*     */   implements Serializable
/*     */ {
/*     */   private Long ixprmxemlxshdlr;
/*     */   private Pxprmxemlxm pxprmxemlxm;
/*     */   private String mntxschldrx1;
/*     */   private String dxschldrx1;
/*     */   private String mnthxschldrx2;
/*     */   private String dxschldrx2;
/*     */   private String mnthxschldrx3;
/*     */   private String dxschldrx3;
/*     */   private String mnthxschldrx4;
/*     */   private String dxschldrx4;
/*     */   private String dyxwk;
/*     */   private String tmxschldrxwk;
/*     */   private Date dxctd;
/*     */   private String bxctd;
/*     */   private Date dxmfdxlst;
/*     */   private String bxmfdxlst;
/*     */   private String mdexshdlr;
/*     */   
/*     */   public Pxprmxemlxshdlrxdtls() {}
/*     */   
/*     */   public Pxprmxemlxshdlrxdtls(Long ixprmxemlxshdlr) {
/*  36 */     this.ixprmxemlxshdlr = ixprmxemlxshdlr;
/*     */   }
/*     */   public Pxprmxemlxshdlrxdtls(Long ixprmxemlxshdlr, Pxprmxemlxm pxprmxemlxm, String mntxschldrx1, String dxschldrx1, String mnthxschldrx2, String dxschldrx2, String mnthxschldrx3, String dxschldrx3, String mnthxschldrx4, String dxschldrx4, String dyxwk, String tmxschldrxwk, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst, String mdexshdlr) {
/*  39 */     this.ixprmxemlxshdlr = ixprmxemlxshdlr;
/*  40 */     this.pxprmxemlxm = pxprmxemlxm;
/*  41 */     this.mntxschldrx1 = mntxschldrx1;
/*  42 */     this.dxschldrx1 = dxschldrx1;
/*  43 */     this.mnthxschldrx2 = mnthxschldrx2;
/*  44 */     this.dxschldrx2 = dxschldrx2;
/*  45 */     this.mnthxschldrx3 = mnthxschldrx3;
/*  46 */     this.dxschldrx3 = dxschldrx3;
/*  47 */     this.mnthxschldrx4 = mnthxschldrx4;
/*  48 */     this.dxschldrx4 = dxschldrx4;
/*  49 */     this.dyxwk = dyxwk;
/*  50 */     this.tmxschldrxwk = tmxschldrxwk;
/*  51 */     this.dxctd = dxctd;
/*  52 */     this.bxctd = bxctd;
/*  53 */     this.dxmfdxlst = dxmfdxlst;
/*  54 */     this.bxmfdxlst = bxmfdxlst;
/*  55 */     this.mdexshdlr = mdexshdlr;
/*     */   }
/*     */   
/*     */   public Long getIxprmxemlxshdlr() {
/*  59 */     return this.ixprmxemlxshdlr;
/*     */   }
/*     */   
/*     */   public void setIxprmxemlxshdlr(Long ixprmxemlxshdlr) {
/*  63 */     this.ixprmxemlxshdlr = ixprmxemlxshdlr;
/*     */   }
/*     */   public Pxprmxemlxm getPxprmxemlxm() {
/*  66 */     return this.pxprmxemlxm;
/*     */   }
/*     */   
/*     */   public void setPxprmxemlxm(Pxprmxemlxm pxprmxemlxm) {
/*  70 */     this.pxprmxemlxm = pxprmxemlxm;
/*     */   }
/*     */   public String getMntxschldrx1() {
/*  73 */     return this.mntxschldrx1;
/*     */   }
/*     */   
/*     */   public void setMntxschldrx1(String mntxschldrx1) {
/*  77 */     this.mntxschldrx1 = mntxschldrx1;
/*     */   }
/*     */   public String getDxschldrx1() {
/*  80 */     return this.dxschldrx1;
/*     */   }
/*     */   
/*     */   public void setDxschldrx1(String dxschldrx1) {
/*  84 */     this.dxschldrx1 = dxschldrx1;
/*     */   }
/*     */   public String getMnthxschldrx2() {
/*  87 */     return this.mnthxschldrx2;
/*     */   }
/*     */   
/*     */   public void setMnthxschldrx2(String mnthxschldrx2) {
/*  91 */     this.mnthxschldrx2 = mnthxschldrx2;
/*     */   }
/*     */   public String getDxschldrx2() {
/*  94 */     return this.dxschldrx2;
/*     */   }
/*     */   
/*     */   public void setDxschldrx2(String dxschldrx2) {
/*  98 */     this.dxschldrx2 = dxschldrx2;
/*     */   }
/*     */   public String getMnthxschldrx3() {
/* 101 */     return this.mnthxschldrx3;
/*     */   }
/*     */   
/*     */   public void setMnthxschldrx3(String mnthxschldrx3) {
/* 105 */     this.mnthxschldrx3 = mnthxschldrx3;
/*     */   }
/*     */   public String getDxschldrx3() {
/* 108 */     return this.dxschldrx3;
/*     */   }
/*     */   
/*     */   public void setDxschldrx3(String dxschldrx3) {
/* 112 */     this.dxschldrx3 = dxschldrx3;
/*     */   }
/*     */   public String getMnthxschldrx4() {
/* 115 */     return this.mnthxschldrx4;
/*     */   }
/*     */   
/*     */   public void setMnthxschldrx4(String mnthxschldrx4) {
/* 119 */     this.mnthxschldrx4 = mnthxschldrx4;
/*     */   }
/*     */   public String getDxschldrx4() {
/* 122 */     return this.dxschldrx4;
/*     */   }
/*     */   
/*     */   public void setDxschldrx4(String dxschldrx4) {
/* 126 */     this.dxschldrx4 = dxschldrx4;
/*     */   }
/*     */   public String getDyxwk() {
/* 129 */     return this.dyxwk;
/*     */   }
/*     */   
/*     */   public void setDyxwk(String dyxwk) {
/* 133 */     this.dyxwk = dyxwk;
/*     */   }
/*     */   public String getTmxschldrxwk() {
/* 136 */     return this.tmxschldrxwk;
/*     */   }
/*     */   
/*     */   public void setTmxschldrxwk(String tmxschldrxwk) {
/* 140 */     this.tmxschldrxwk = tmxschldrxwk;
/*     */   }
/*     */   public Date getDxctd() {
/* 143 */     return this.dxctd;
/*     */   }
/*     */   
/*     */   public void setDxctd(Date dxctd) {
/* 147 */     this.dxctd = dxctd;
/*     */   }
/*     */   public String getBxctd() {
/* 150 */     return this.bxctd;
/*     */   }
/*     */   
/*     */   public void setBxctd(String bxctd) {
/* 154 */     this.bxctd = bxctd;
/*     */   }
/*     */   public Date getDxmfdxlst() {
/* 157 */     return this.dxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setDxmfdxlst(Date dxmfdxlst) {
/* 161 */     this.dxmfdxlst = dxmfdxlst;
/*     */   }
/*     */   public String getBxmfdxlst() {
/* 164 */     return this.bxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setBxmfdxlst(String bxmfdxlst) {
/* 168 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */   public String getMdexshdlr() {
/* 171 */     return this.mdexshdlr;
/*     */   }
/*     */   
/*     */   public void setMdexshdlr(String mdexshdlr) {
/* 175 */     this.mdexshdlr = mdexshdlr;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pxprmxemlxshdlrxdtls.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */