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
/*     */ public class Dxtrnsxchrgxdtls
/*     */   implements Serializable
/*     */ {
/*     */   private BigDecimal ixdtlsxchrgxtrns;
/*     */   private Dxtrnsxsmryxm dxtrnsxsmryxm;
/*     */   private BigDecimal noxacnt;
/*     */   private String nmxacnt;
/*     */   private String cylxmntly;
/*     */   private String prdxrfrnc;
/*     */   private String prds;
/*     */   private String typxchrg;
/*     */   private BigDecimal trnsxofxno;
/*     */   private BigDecimal chrg;
/*     */   private String fldx1;
/*     */   private String fldx2;
/*     */   private String fldx3;
/*     */   private String fldx4;
/*     */   private String fldx5;
/*     */   private String fldx6;
/*     */   private String fldx7;
/*     */   private String fldx8;
/*     */   private String fldx9;
/*     */   private String fldx10;
/*     */   private String fldx11;
/*     */   private String fldx12;
/*     */   private String fldx13;
/*     */   private String fldx14;
/*     */   private String fldx15;
/*     */   private String fldx16;
/*     */   private String fldx17;
/*     */   private String fldx18;
/*     */   private String fldx19;
/*     */   private String fldx20;
/*     */   private Date dxctd;
/*     */   private String bxctd;
/*     */   private Date dxmfdxlst;
/*     */   private String bxmfdxlst;
/*     */   
/*     */   public Dxtrnsxchrgxdtls() {}
/*     */   
/*     */   public Dxtrnsxchrgxdtls(BigDecimal ixdtlsxchrgxtrns) {
/*  54 */     this.ixdtlsxchrgxtrns = ixdtlsxchrgxtrns;
/*     */   }
/*     */   public Dxtrnsxchrgxdtls(BigDecimal ixdtlsxchrgxtrns, Dxtrnsxsmryxm dxtrnsxsmryxm, BigDecimal noxacnt, String nmxacnt, String cylxmntly, String prdxrfrnc, String prds, String typxchrg, BigDecimal trnsxofxno, BigDecimal chrg, String fldx1, String fldx2, String fldx3, String fldx4, String fldx5, String fldx6, String fldx7, String fldx8, String fldx9, String fldx10, String fldx11, String fldx12, String fldx13, String fldx14, String fldx15, String fldx16, String fldx17, String fldx18, String fldx19, String fldx20, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst) {
/*  57 */     this.ixdtlsxchrgxtrns = ixdtlsxchrgxtrns;
/*  58 */     this.dxtrnsxsmryxm = dxtrnsxsmryxm;
/*  59 */     this.noxacnt = noxacnt;
/*  60 */     this.nmxacnt = nmxacnt;
/*  61 */     this.cylxmntly = cylxmntly;
/*  62 */     this.prdxrfrnc = prdxrfrnc;
/*  63 */     this.prds = prds;
/*  64 */     this.typxchrg = typxchrg;
/*  65 */     this.trnsxofxno = trnsxofxno;
/*  66 */     this.chrg = chrg;
/*  67 */     this.fldx1 = fldx1;
/*  68 */     this.fldx2 = fldx2;
/*  69 */     this.fldx3 = fldx3;
/*  70 */     this.fldx4 = fldx4;
/*  71 */     this.fldx5 = fldx5;
/*  72 */     this.fldx6 = fldx6;
/*  73 */     this.fldx7 = fldx7;
/*  74 */     this.fldx8 = fldx8;
/*  75 */     this.fldx9 = fldx9;
/*  76 */     this.fldx10 = fldx10;
/*  77 */     this.fldx11 = fldx11;
/*  78 */     this.fldx12 = fldx12;
/*  79 */     this.fldx13 = fldx13;
/*  80 */     this.fldx14 = fldx14;
/*  81 */     this.fldx15 = fldx15;
/*  82 */     this.fldx16 = fldx16;
/*  83 */     this.fldx17 = fldx17;
/*  84 */     this.fldx18 = fldx18;
/*  85 */     this.fldx19 = fldx19;
/*  86 */     this.fldx20 = fldx20;
/*  87 */     this.dxctd = dxctd;
/*  88 */     this.bxctd = bxctd;
/*  89 */     this.dxmfdxlst = dxmfdxlst;
/*  90 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */   
/*     */   public BigDecimal getIxdtlsxchrgxtrns() {
/*  94 */     return this.ixdtlsxchrgxtrns;
/*     */   }
/*     */   
/*     */   public void setIxdtlsxchrgxtrns(BigDecimal ixdtlsxchrgxtrns) {
/*  98 */     this.ixdtlsxchrgxtrns = ixdtlsxchrgxtrns;
/*     */   }
/*     */   public Dxtrnsxsmryxm getDxtrnsxsmryxm() {
/* 101 */     return this.dxtrnsxsmryxm;
/*     */   }
/*     */   
/*     */   public void setDxtrnsxsmryxm(Dxtrnsxsmryxm dxtrnsxsmryxm) {
/* 105 */     this.dxtrnsxsmryxm = dxtrnsxsmryxm;
/*     */   }
/*     */   public BigDecimal getNoxacnt() {
/* 108 */     return this.noxacnt;
/*     */   }
/*     */   
/*     */   public void setNoxacnt(BigDecimal noxacnt) {
/* 112 */     this.noxacnt = noxacnt;
/*     */   }
/*     */   public String getNmxacnt() {
/* 115 */     return this.nmxacnt;
/*     */   }
/*     */   
/*     */   public void setNmxacnt(String nmxacnt) {
/* 119 */     this.nmxacnt = nmxacnt;
/*     */   }
/*     */   public String getCylxmntly() {
/* 122 */     return this.cylxmntly;
/*     */   }
/*     */   
/*     */   public void setCylxmntly(String cylxmntly) {
/* 126 */     this.cylxmntly = cylxmntly;
/*     */   }
/*     */   public String getPrdxrfrnc() {
/* 129 */     return this.prdxrfrnc;
/*     */   }
/*     */   
/*     */   public void setPrdxrfrnc(String prdxrfrnc) {
/* 133 */     this.prdxrfrnc = prdxrfrnc;
/*     */   }
/*     */   public String getPrds() {
/* 136 */     return this.prds;
/*     */   }
/*     */   
/*     */   public void setPrds(String prds) {
/* 140 */     this.prds = prds;
/*     */   }
/*     */   public String getTypxchrg() {
/* 143 */     return this.typxchrg;
/*     */   }
/*     */   
/*     */   public void setTypxchrg(String typxchrg) {
/* 147 */     this.typxchrg = typxchrg;
/*     */   }
/*     */   public BigDecimal getTrnsxofxno() {
/* 150 */     return this.trnsxofxno;
/*     */   }
/*     */   
/*     */   public void setTrnsxofxno(BigDecimal trnsxofxno) {
/* 154 */     this.trnsxofxno = trnsxofxno;
/*     */   }
/*     */   public BigDecimal getChrg() {
/* 157 */     return this.chrg;
/*     */   }
/*     */   
/*     */   public void setChrg(BigDecimal chrg) {
/* 161 */     this.chrg = chrg;
/*     */   }
/*     */   public String getFldx1() {
/* 164 */     return this.fldx1;
/*     */   }
/*     */   
/*     */   public void setFldx1(String fldx1) {
/* 168 */     this.fldx1 = fldx1;
/*     */   }
/*     */   public String getFldx2() {
/* 171 */     return this.fldx2;
/*     */   }
/*     */   
/*     */   public void setFldx2(String fldx2) {
/* 175 */     this.fldx2 = fldx2;
/*     */   }
/*     */   public String getFldx3() {
/* 178 */     return this.fldx3;
/*     */   }
/*     */   
/*     */   public void setFldx3(String fldx3) {
/* 182 */     this.fldx3 = fldx3;
/*     */   }
/*     */   public String getFldx4() {
/* 185 */     return this.fldx4;
/*     */   }
/*     */   
/*     */   public void setFldx4(String fldx4) {
/* 189 */     this.fldx4 = fldx4;
/*     */   }
/*     */   public String getFldx5() {
/* 192 */     return this.fldx5;
/*     */   }
/*     */   
/*     */   public void setFldx5(String fldx5) {
/* 196 */     this.fldx5 = fldx5;
/*     */   }
/*     */   public String getFldx6() {
/* 199 */     return this.fldx6;
/*     */   }
/*     */   
/*     */   public void setFldx6(String fldx6) {
/* 203 */     this.fldx6 = fldx6;
/*     */   }
/*     */   public String getFldx7() {
/* 206 */     return this.fldx7;
/*     */   }
/*     */   
/*     */   public void setFldx7(String fldx7) {
/* 210 */     this.fldx7 = fldx7;
/*     */   }
/*     */   public String getFldx8() {
/* 213 */     return this.fldx8;
/*     */   }
/*     */   
/*     */   public void setFldx8(String fldx8) {
/* 217 */     this.fldx8 = fldx8;
/*     */   }
/*     */   public String getFldx9() {
/* 220 */     return this.fldx9;
/*     */   }
/*     */   
/*     */   public void setFldx9(String fldx9) {
/* 224 */     this.fldx9 = fldx9;
/*     */   }
/*     */   public String getFldx10() {
/* 227 */     return this.fldx10;
/*     */   }
/*     */   
/*     */   public void setFldx10(String fldx10) {
/* 231 */     this.fldx10 = fldx10;
/*     */   }
/*     */   public String getFldx11() {
/* 234 */     return this.fldx11;
/*     */   }
/*     */   
/*     */   public void setFldx11(String fldx11) {
/* 238 */     this.fldx11 = fldx11;
/*     */   }
/*     */   public String getFldx12() {
/* 241 */     return this.fldx12;
/*     */   }
/*     */   
/*     */   public void setFldx12(String fldx12) {
/* 245 */     this.fldx12 = fldx12;
/*     */   }
/*     */   public String getFldx13() {
/* 248 */     return this.fldx13;
/*     */   }
/*     */   
/*     */   public void setFldx13(String fldx13) {
/* 252 */     this.fldx13 = fldx13;
/*     */   }
/*     */   public String getFldx14() {
/* 255 */     return this.fldx14;
/*     */   }
/*     */   
/*     */   public void setFldx14(String fldx14) {
/* 259 */     this.fldx14 = fldx14;
/*     */   }
/*     */   public String getFldx15() {
/* 262 */     return this.fldx15;
/*     */   }
/*     */   
/*     */   public void setFldx15(String fldx15) {
/* 266 */     this.fldx15 = fldx15;
/*     */   }
/*     */   public String getFldx16() {
/* 269 */     return this.fldx16;
/*     */   }
/*     */   
/*     */   public void setFldx16(String fldx16) {
/* 273 */     this.fldx16 = fldx16;
/*     */   }
/*     */   public String getFldx17() {
/* 276 */     return this.fldx17;
/*     */   }
/*     */   
/*     */   public void setFldx17(String fldx17) {
/* 280 */     this.fldx17 = fldx17;
/*     */   }
/*     */   public String getFldx18() {
/* 283 */     return this.fldx18;
/*     */   }
/*     */   
/*     */   public void setFldx18(String fldx18) {
/* 287 */     this.fldx18 = fldx18;
/*     */   }
/*     */   public String getFldx19() {
/* 290 */     return this.fldx19;
/*     */   }
/*     */   
/*     */   public void setFldx19(String fldx19) {
/* 294 */     this.fldx19 = fldx19;
/*     */   }
/*     */   public String getFldx20() {
/* 297 */     return this.fldx20;
/*     */   }
/*     */   
/*     */   public void setFldx20(String fldx20) {
/* 301 */     this.fldx20 = fldx20;
/*     */   }
/*     */   public Date getDxctd() {
/* 304 */     return this.dxctd;
/*     */   }
/*     */   
/*     */   public void setDxctd(Date dxctd) {
/* 308 */     this.dxctd = dxctd;
/*     */   }
/*     */   public String getBxctd() {
/* 311 */     return this.bxctd;
/*     */   }
/*     */   
/*     */   public void setBxctd(String bxctd) {
/* 315 */     this.bxctd = bxctd;
/*     */   }
/*     */   public Date getDxmfdxlst() {
/* 318 */     return this.dxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setDxmfdxlst(Date dxmfdxlst) {
/* 322 */     this.dxmfdxlst = dxmfdxlst;
/*     */   }
/*     */   public String getBxmfdxlst() {
/* 325 */     return this.bxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setBxmfdxlst(String bxmfdxlst) {
/* 329 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Dxtrnsxchrgxdtls.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */