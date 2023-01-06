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
/*     */ public class Pxrdxdrxshdlrxdtls
/*     */   implements Serializable
/*     */ {
/*     */   private Long ixrxdxrpt;
/*     */   private Pxrdxdrxm pxrdxdrxm;
/*     */   private String nmshdlrxtyp;
/*     */   private String mnthxschldrx1;
/*     */   private String dxschldrx1;
/*     */   private String mnthxschldrx2;
/*     */   private String dxschldrx2;
/*     */   private String mnthxschldrx3;
/*     */   private String dxschldrx3;
/*     */   private String mnthxschldrx4;
/*     */   private String dxschldrx4;
/*     */   private String dyxwk;
/*     */   private String tmxschldrxwk;
/*     */   private String mdxshdlr;
/*     */   private Long ixtyp;
/*     */   private Date dxctd;
/*     */   private String bxctd;
/*     */   private Date dxmfdxlst;
/*     */   private String bxmfdxlst;
/*     */   
/*     */   public Pxrdxdrxshdlrxdtls() {}
/*     */   
/*     */   public Pxrdxdrxshdlrxdtls(Long ixrxdxrpt) {
/*  38 */     this.ixrxdxrpt = ixrxdxrpt;
/*     */   }
/*     */   public Pxrdxdrxshdlrxdtls(Long ixrxdxrpt, Pxrdxdrxm pxrdxdrxm, String nmshdlrxtyp, String mnthxschldrx1, String dxschldrx1, String mnthxschldrx2, String dxschldrx2, String mnthxschldrx3, String dxschldrx3, String mnthxschldrx4, String dxschldrx4, String dyxwk, String tmxschldrxwk, String mdxshdlr, Long ixtyp, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst) {
/*  41 */     this.ixrxdxrpt = ixrxdxrpt;
/*  42 */     this.pxrdxdrxm = pxrdxdrxm;
/*  43 */     this.nmshdlrxtyp = nmshdlrxtyp;
/*  44 */     this.mnthxschldrx1 = mnthxschldrx1;
/*  45 */     this.dxschldrx1 = dxschldrx1;
/*  46 */     this.mnthxschldrx2 = mnthxschldrx2;
/*  47 */     this.dxschldrx2 = dxschldrx2;
/*  48 */     this.mnthxschldrx3 = mnthxschldrx3;
/*  49 */     this.dxschldrx3 = dxschldrx3;
/*  50 */     this.mnthxschldrx4 = mnthxschldrx4;
/*  51 */     this.dxschldrx4 = dxschldrx4;
/*  52 */     this.dyxwk = dyxwk;
/*  53 */     this.tmxschldrxwk = tmxschldrxwk;
/*  54 */     this.mdxshdlr = mdxshdlr;
/*  55 */     this.ixtyp = ixtyp;
/*  56 */     this.dxctd = dxctd;
/*  57 */     this.bxctd = bxctd;
/*  58 */     this.dxmfdxlst = dxmfdxlst;
/*  59 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */   
/*     */   public Long getIxrxdxrpt() {
/*  63 */     return this.ixrxdxrpt;
/*     */   }
/*     */   
/*     */   public void setIxrxdxrpt(Long ixrxdxrpt) {
/*  67 */     this.ixrxdxrpt = ixrxdxrpt;
/*     */   }
/*     */   public Pxrdxdrxm getPxrdxdrxm() {
/*  70 */     return this.pxrdxdrxm;
/*     */   }
/*     */   
/*     */   public void setPxrdxdrxm(Pxrdxdrxm pxrdxdrxm) {
/*  74 */     this.pxrdxdrxm = pxrdxdrxm;
/*     */   }
/*     */   public String getNmshdlrxtyp() {
/*  77 */     return this.nmshdlrxtyp;
/*     */   }
/*     */   
/*     */   public void setNmshdlrxtyp(String nmshdlrxtyp) {
/*  81 */     this.nmshdlrxtyp = nmshdlrxtyp;
/*     */   }
/*     */   public String getMnthxschldrx1() {
/*  84 */     return this.mnthxschldrx1;
/*     */   }
/*     */   
/*     */   public void setMnthxschldrx1(String mnthxschldrx1) {
/*  88 */     this.mnthxschldrx1 = mnthxschldrx1;
/*     */   }
/*     */   public String getDxschldrx1() {
/*  91 */     return this.dxschldrx1;
/*     */   }
/*     */   
/*     */   public void setDxschldrx1(String dxschldrx1) {
/*  95 */     this.dxschldrx1 = dxschldrx1;
/*     */   }
/*     */   public String getMnthxschldrx2() {
/*  98 */     return this.mnthxschldrx2;
/*     */   }
/*     */   
/*     */   public void setMnthxschldrx2(String mnthxschldrx2) {
/* 102 */     this.mnthxschldrx2 = mnthxschldrx2;
/*     */   }
/*     */   public String getDxschldrx2() {
/* 105 */     return this.dxschldrx2;
/*     */   }
/*     */   
/*     */   public void setDxschldrx2(String dxschldrx2) {
/* 109 */     this.dxschldrx2 = dxschldrx2;
/*     */   }
/*     */   public String getMnthxschldrx3() {
/* 112 */     return this.mnthxschldrx3;
/*     */   }
/*     */   
/*     */   public void setMnthxschldrx3(String mnthxschldrx3) {
/* 116 */     this.mnthxschldrx3 = mnthxschldrx3;
/*     */   }
/*     */   public String getDxschldrx3() {
/* 119 */     return this.dxschldrx3;
/*     */   }
/*     */   
/*     */   public void setDxschldrx3(String dxschldrx3) {
/* 123 */     this.dxschldrx3 = dxschldrx3;
/*     */   }
/*     */   public String getMnthxschldrx4() {
/* 126 */     return this.mnthxschldrx4;
/*     */   }
/*     */   
/*     */   public void setMnthxschldrx4(String mnthxschldrx4) {
/* 130 */     this.mnthxschldrx4 = mnthxschldrx4;
/*     */   }
/*     */   public String getDxschldrx4() {
/* 133 */     return this.dxschldrx4;
/*     */   }
/*     */   
/*     */   public void setDxschldrx4(String dxschldrx4) {
/* 137 */     this.dxschldrx4 = dxschldrx4;
/*     */   }
/*     */   public String getDyxwk() {
/* 140 */     return this.dyxwk;
/*     */   }
/*     */   
/*     */   public void setDyxwk(String dyxwk) {
/* 144 */     this.dyxwk = dyxwk;
/*     */   }
/*     */   public String getTmxschldrxwk() {
/* 147 */     return this.tmxschldrxwk;
/*     */   }
/*     */   
/*     */   public void setTmxschldrxwk(String tmxschldrxwk) {
/* 151 */     this.tmxschldrxwk = tmxschldrxwk;
/*     */   }
/*     */   public String getMdxshdlr() {
/* 154 */     return this.mdxshdlr;
/*     */   }
/*     */   
/*     */   public void setMdxshdlr(String mdxshdlr) {
/* 158 */     this.mdxshdlr = mdxshdlr;
/*     */   }
/*     */   public Long getIxtyp() {
/* 161 */     return this.ixtyp;
/*     */   }
/*     */   
/*     */   public void setIxtyp(Long ixtyp) {
/* 165 */     this.ixtyp = ixtyp;
/*     */   }
/*     */   public Date getDxctd() {
/* 168 */     return this.dxctd;
/*     */   }
/*     */   
/*     */   public void setDxctd(Date dxctd) {
/* 172 */     this.dxctd = dxctd;
/*     */   }
/*     */   public String getBxctd() {
/* 175 */     return this.bxctd;
/*     */   }
/*     */   
/*     */   public void setBxctd(String bxctd) {
/* 179 */     this.bxctd = bxctd;
/*     */   }
/*     */   public Date getDxmfdxlst() {
/* 182 */     return this.dxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setDxmfdxlst(Date dxmfdxlst) {
/* 186 */     this.dxmfdxlst = dxmfdxlst;
/*     */   }
/*     */   public String getBxmfdxlst() {
/* 189 */     return this.bxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setBxmfdxlst(String bxmfdxlst) {
/* 193 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pxrdxdrxshdlrxdtls.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */