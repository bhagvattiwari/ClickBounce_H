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
/*     */ public class Pxeshlrxprcsxdtls
/*     */   implements Serializable
/*     */ {
/*     */   private Long ixdtlsxeshdlr;
/*     */   private Pxeshdlrxprsxm pxeshdlrxprsxm;
/*     */   private Pxeshlrxprcsxmde pxeshlrxprcsxmde;
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
/*     */   public Pxeshlrxprcsxdtls() {}
/*     */   
/*     */   public Pxeshlrxprcsxdtls(Long ixdtlsxeshdlr) {
/*  38 */     this.ixdtlsxeshdlr = ixdtlsxeshdlr;
/*     */   }
/*     */   public Pxeshlrxprcsxdtls(Long ixdtlsxeshdlr, Pxeshdlrxprsxm pxeshdlrxprsxm, Pxeshlrxprcsxmde pxeshlrxprcsxmde, String mntxschldrx1, String dxschldrx1, String mnthxschldrx2, String dxschldrx2, String mnthxschldrx3, String dxschldrx3, String mnthxschldrx4, String dxschldrx4, String dyxwk, String tmxschldrxwk, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst, String mdexshdlr) {
/*  41 */     this.ixdtlsxeshdlr = ixdtlsxeshdlr;
/*  42 */     this.pxeshdlrxprsxm = pxeshdlrxprsxm;
/*  43 */     this.pxeshlrxprcsxmde = pxeshlrxprcsxmde;
/*  44 */     this.mntxschldrx1 = mntxschldrx1;
/*  45 */     this.dxschldrx1 = dxschldrx1;
/*  46 */     this.mnthxschldrx2 = mnthxschldrx2;
/*  47 */     this.dxschldrx2 = dxschldrx2;
/*  48 */     this.mnthxschldrx3 = mnthxschldrx3;
/*  49 */     this.dxschldrx3 = dxschldrx3;
/*  50 */     this.mnthxschldrx4 = mnthxschldrx4;
/*  51 */     this.dxschldrx4 = dxschldrx4;
/*  52 */     this.dyxwk = dyxwk;
/*  53 */     this.tmxschldrxwk = tmxschldrxwk;
/*  54 */     this.dxctd = dxctd;
/*  55 */     this.bxctd = bxctd;
/*  56 */     this.dxmfdxlst = dxmfdxlst;
/*  57 */     this.bxmfdxlst = bxmfdxlst;
/*  58 */     this.mdexshdlr = mdexshdlr;
/*     */   }
/*     */   
/*     */   public Long getIxdtlsxeshdlr() {
/*  62 */     return this.ixdtlsxeshdlr;
/*     */   }
/*     */   
/*     */   public void setIxdtlsxeshdlr(Long ixdtlsxeshdlr) {
/*  66 */     this.ixdtlsxeshdlr = ixdtlsxeshdlr;
/*     */   }
/*     */   public Pxeshdlrxprsxm getPxeshdlrxprsxm() {
/*  69 */     return this.pxeshdlrxprsxm;
/*     */   }
/*     */   
/*     */   public void setPxeshdlrxprsxm(Pxeshdlrxprsxm pxeshdlrxprsxm) {
/*  73 */     this.pxeshdlrxprsxm = pxeshdlrxprsxm;
/*     */   }
/*     */   public Pxeshlrxprcsxmde getPxeshlrxprcsxmde() {
/*  76 */     return this.pxeshlrxprcsxmde;
/*     */   }
/*     */   
/*     */   public void setPxeshlrxprcsxmde(Pxeshlrxprcsxmde pxeshlrxprcsxmde) {
/*  80 */     this.pxeshlrxprcsxmde = pxeshlrxprcsxmde;
/*     */   }
/*     */   public String getMntxschldrx1() {
/*  83 */     return this.mntxschldrx1;
/*     */   }
/*     */   
/*     */   public void setMntxschldrx1(String mntxschldrx1) {
/*  87 */     this.mntxschldrx1 = mntxschldrx1;
/*     */   }
/*     */   public String getDxschldrx1() {
/*  90 */     return this.dxschldrx1;
/*     */   }
/*     */   
/*     */   public void setDxschldrx1(String dxschldrx1) {
/*  94 */     this.dxschldrx1 = dxschldrx1;
/*     */   }
/*     */   public String getMnthxschldrx2() {
/*  97 */     return this.mnthxschldrx2;
/*     */   }
/*     */   
/*     */   public void setMnthxschldrx2(String mnthxschldrx2) {
/* 101 */     this.mnthxschldrx2 = mnthxschldrx2;
/*     */   }
/*     */   public String getDxschldrx2() {
/* 104 */     return this.dxschldrx2;
/*     */   }
/*     */   
/*     */   public void setDxschldrx2(String dxschldrx2) {
/* 108 */     this.dxschldrx2 = dxschldrx2;
/*     */   }
/*     */   public String getMnthxschldrx3() {
/* 111 */     return this.mnthxschldrx3;
/*     */   }
/*     */   
/*     */   public void setMnthxschldrx3(String mnthxschldrx3) {
/* 115 */     this.mnthxschldrx3 = mnthxschldrx3;
/*     */   }
/*     */   public String getDxschldrx3() {
/* 118 */     return this.dxschldrx3;
/*     */   }
/*     */   
/*     */   public void setDxschldrx3(String dxschldrx3) {
/* 122 */     this.dxschldrx3 = dxschldrx3;
/*     */   }
/*     */   public String getMnthxschldrx4() {
/* 125 */     return this.mnthxschldrx4;
/*     */   }
/*     */   
/*     */   public void setMnthxschldrx4(String mnthxschldrx4) {
/* 129 */     this.mnthxschldrx4 = mnthxschldrx4;
/*     */   }
/*     */   public String getDxschldrx4() {
/* 132 */     return this.dxschldrx4;
/*     */   }
/*     */   
/*     */   public void setDxschldrx4(String dxschldrx4) {
/* 136 */     this.dxschldrx4 = dxschldrx4;
/*     */   }
/*     */   public String getDyxwk() {
/* 139 */     return this.dyxwk;
/*     */   }
/*     */   
/*     */   public void setDyxwk(String dyxwk) {
/* 143 */     this.dyxwk = dyxwk;
/*     */   }
/*     */   public String getTmxschldrxwk() {
/* 146 */     return this.tmxschldrxwk;
/*     */   }
/*     */   
/*     */   public void setTmxschldrxwk(String tmxschldrxwk) {
/* 150 */     this.tmxschldrxwk = tmxschldrxwk;
/*     */   }
/*     */   public Date getDxctd() {
/* 153 */     return this.dxctd;
/*     */   }
/*     */   
/*     */   public void setDxctd(Date dxctd) {
/* 157 */     this.dxctd = dxctd;
/*     */   }
/*     */   public String getBxctd() {
/* 160 */     return this.bxctd;
/*     */   }
/*     */   
/*     */   public void setBxctd(String bxctd) {
/* 164 */     this.bxctd = bxctd;
/*     */   }
/*     */   public Date getDxmfdxlst() {
/* 167 */     return this.dxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setDxmfdxlst(Date dxmfdxlst) {
/* 171 */     this.dxmfdxlst = dxmfdxlst;
/*     */   }
/*     */   public String getBxmfdxlst() {
/* 174 */     return this.bxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setBxmfdxlst(String bxmfdxlst) {
/* 178 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */   
/*     */   public String getMdexshdlr() {
/* 182 */     return this.mdexshdlr;
/*     */   }
/*     */   
/*     */   public void setMdexshdlr(String mdexshdlr) {
/* 186 */     this.mdexshdlr = mdexshdlr;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pxeshlrxprcsxdtls.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */