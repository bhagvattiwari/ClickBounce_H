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
/*     */ public class Dxinsuxsmry
/*     */   implements Serializable
/*     */ {
/*     */   private BigDecimal ixsmryxinsuxtrns;
/*     */   private Dxtrnsxsmryxm dxtrnsxsmryxm;
/*     */   private String nmxacnt;
/*     */   private String assrdxsmxbsc;
/*     */   private Date dxcmncmnt;
/*     */   private Date dxmtrty;
/*     */   private String frncyxpyt;
/*     */   private Date dxprmum;
/*     */   private String cdexadvsr;
/*     */   private String nmxadvsr;
/*     */   private String nxrcpt;
/*     */   private Date dxrcpt;
/*     */   private String instxprmum;
/*     */   private String amtxfexlt;
/*     */   private String adjstxprmumxaftrxbl;
/*     */   private String atxdpst;
/*     */   private String noxchq;
/*     */   private Date dxchq;
/*     */   private Date dxprmumxnxt;
/*     */   private String mnfctrxmtr;
/*     */   private String noxengnx;
/*     */   private String noxmodl;
/*     */   private String chsssxno;
/*     */   private String rtoxno;
/*     */   private String rgstrtnxno;
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
/*     */   public Dxinsuxsmry() {}
/*     */   
/*     */   public Dxinsuxsmry(BigDecimal ixsmryxinsuxtrns) {
/*  69 */     this.ixsmryxinsuxtrns = ixsmryxinsuxtrns;
/*     */   }
/*     */   public Dxinsuxsmry(BigDecimal ixsmryxinsuxtrns, Dxtrnsxsmryxm dxtrnsxsmryxm, String nmxacnt, String assrdxsmxbsc, Date dxcmncmnt, Date dxmtrty, String frncyxpyt, Date dxprmum, String cdexadvsr, String nmxadvsr, String nxrcpt, Date dxrcpt, String instxprmum, String amtxfexlt, String adjstxprmumxaftrxbl, String atxdpst, String noxchq, Date dxchq, Date dxprmumxnxt, String mnfctrxmtr, String noxengnx, String noxmodl, String chsssxno, String rtoxno, String rgstrtnxno, String fldx1, String fldx2, String fldx3, String fldx4, String fldx5, String fldx6, String fldx7, String fldx8, String fldx9, String fldx10, String fldx11, String fldx12, String fldx13, String fldx14, String fldx15, String fldx16, String fldx17, String fldx18, String fldx19, String fldx20, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst) {
/*  72 */     this.ixsmryxinsuxtrns = ixsmryxinsuxtrns;
/*  73 */     this.dxtrnsxsmryxm = dxtrnsxsmryxm;
/*  74 */     this.nmxacnt = nmxacnt;
/*  75 */     this.assrdxsmxbsc = assrdxsmxbsc;
/*  76 */     this.dxcmncmnt = dxcmncmnt;
/*  77 */     this.dxmtrty = dxmtrty;
/*  78 */     this.frncyxpyt = frncyxpyt;
/*  79 */     this.dxprmum = dxprmum;
/*  80 */     this.cdexadvsr = cdexadvsr;
/*  81 */     this.nmxadvsr = nmxadvsr;
/*  82 */     this.nxrcpt = nxrcpt;
/*  83 */     this.dxrcpt = dxrcpt;
/*  84 */     this.instxprmum = instxprmum;
/*  85 */     this.amtxfexlt = amtxfexlt;
/*  86 */     this.adjstxprmumxaftrxbl = adjstxprmumxaftrxbl;
/*  87 */     this.atxdpst = atxdpst;
/*  88 */     this.noxchq = noxchq;
/*  89 */     this.dxchq = dxchq;
/*  90 */     this.dxprmumxnxt = dxprmumxnxt;
/*  91 */     this.mnfctrxmtr = mnfctrxmtr;
/*  92 */     this.noxengnx = noxengnx;
/*  93 */     this.noxmodl = noxmodl;
/*  94 */     this.chsssxno = chsssxno;
/*  95 */     this.rtoxno = rtoxno;
/*  96 */     this.rgstrtnxno = rgstrtnxno;
/*  97 */     this.fldx1 = fldx1;
/*  98 */     this.fldx2 = fldx2;
/*  99 */     this.fldx3 = fldx3;
/* 100 */     this.fldx4 = fldx4;
/* 101 */     this.fldx5 = fldx5;
/* 102 */     this.fldx6 = fldx6;
/* 103 */     this.fldx7 = fldx7;
/* 104 */     this.fldx8 = fldx8;
/* 105 */     this.fldx9 = fldx9;
/* 106 */     this.fldx10 = fldx10;
/* 107 */     this.fldx11 = fldx11;
/* 108 */     this.fldx12 = fldx12;
/* 109 */     this.fldx13 = fldx13;
/* 110 */     this.fldx14 = fldx14;
/* 111 */     this.fldx15 = fldx15;
/* 112 */     this.fldx16 = fldx16;
/* 113 */     this.fldx17 = fldx17;
/* 114 */     this.fldx18 = fldx18;
/* 115 */     this.fldx19 = fldx19;
/* 116 */     this.fldx20 = fldx20;
/* 117 */     this.dxctd = dxctd;
/* 118 */     this.bxctd = bxctd;
/* 119 */     this.dxmfdxlst = dxmfdxlst;
/* 120 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */   
/*     */   public BigDecimal getIxsmryxinsuxtrns() {
/* 124 */     return this.ixsmryxinsuxtrns;
/*     */   }
/*     */   
/*     */   public void setIxsmryxinsuxtrns(BigDecimal ixsmryxinsuxtrns) {
/* 128 */     this.ixsmryxinsuxtrns = ixsmryxinsuxtrns;
/*     */   }
/*     */   public Dxtrnsxsmryxm getDxtrnsxsmryxm() {
/* 131 */     return this.dxtrnsxsmryxm;
/*     */   }
/*     */   
/*     */   public void setDxtrnsxsmryxm(Dxtrnsxsmryxm dxtrnsxsmryxm) {
/* 135 */     this.dxtrnsxsmryxm = dxtrnsxsmryxm;
/*     */   }
/*     */   public String getNmxacnt() {
/* 138 */     return this.nmxacnt;
/*     */   }
/*     */   
/*     */   public void setNmxacnt(String nmxacnt) {
/* 142 */     this.nmxacnt = nmxacnt;
/*     */   }
/*     */   public String getAssrdxsmxbsc() {
/* 145 */     return this.assrdxsmxbsc;
/*     */   }
/*     */   
/*     */   public void setAssrdxsmxbsc(String assrdxsmxbsc) {
/* 149 */     this.assrdxsmxbsc = assrdxsmxbsc;
/*     */   }
/*     */   public Date getDxcmncmnt() {
/* 152 */     return this.dxcmncmnt;
/*     */   }
/*     */   
/*     */   public void setDxcmncmnt(Date dxcmncmnt) {
/* 156 */     this.dxcmncmnt = dxcmncmnt;
/*     */   }
/*     */   public Date getDxmtrty() {
/* 159 */     return this.dxmtrty;
/*     */   }
/*     */   
/*     */   public void setDxmtrty(Date dxmtrty) {
/* 163 */     this.dxmtrty = dxmtrty;
/*     */   }
/*     */   public String getFrncyxpyt() {
/* 166 */     return this.frncyxpyt;
/*     */   }
/*     */   
/*     */   public void setFrncyxpyt(String frncyxpyt) {
/* 170 */     this.frncyxpyt = frncyxpyt;
/*     */   }
/*     */   public Date getDxprmum() {
/* 173 */     return this.dxprmum;
/*     */   }
/*     */   
/*     */   public void setDxprmum(Date dxprmum) {
/* 177 */     this.dxprmum = dxprmum;
/*     */   }
/*     */   public String getCdexadvsr() {
/* 180 */     return this.cdexadvsr;
/*     */   }
/*     */   
/*     */   public void setCdexadvsr(String cdexadvsr) {
/* 184 */     this.cdexadvsr = cdexadvsr;
/*     */   }
/*     */   public String getNmxadvsr() {
/* 187 */     return this.nmxadvsr;
/*     */   }
/*     */   
/*     */   public void setNmxadvsr(String nmxadvsr) {
/* 191 */     this.nmxadvsr = nmxadvsr;
/*     */   }
/*     */   public String getNxrcpt() {
/* 194 */     return this.nxrcpt;
/*     */   }
/*     */   
/*     */   public void setNxrcpt(String nxrcpt) {
/* 198 */     this.nxrcpt = nxrcpt;
/*     */   }
/*     */   public Date getDxrcpt() {
/* 201 */     return this.dxrcpt;
/*     */   }
/*     */   
/*     */   public void setDxrcpt(Date dxrcpt) {
/* 205 */     this.dxrcpt = dxrcpt;
/*     */   }
/*     */   public String getInstxprmum() {
/* 208 */     return this.instxprmum;
/*     */   }
/*     */   
/*     */   public void setInstxprmum(String instxprmum) {
/* 212 */     this.instxprmum = instxprmum;
/*     */   }
/*     */   public String getAmtxfexlt() {
/* 215 */     return this.amtxfexlt;
/*     */   }
/*     */   
/*     */   public void setAmtxfexlt(String amtxfexlt) {
/* 219 */     this.amtxfexlt = amtxfexlt;
/*     */   }
/*     */   public String getAdjstxprmumxaftrxbl() {
/* 222 */     return this.adjstxprmumxaftrxbl;
/*     */   }
/*     */   
/*     */   public void setAdjstxprmumxaftrxbl(String adjstxprmumxaftrxbl) {
/* 226 */     this.adjstxprmumxaftrxbl = adjstxprmumxaftrxbl;
/*     */   }
/*     */   public String getAtxdpst() {
/* 229 */     return this.atxdpst;
/*     */   }
/*     */   
/*     */   public void setAtxdpst(String atxdpst) {
/* 233 */     this.atxdpst = atxdpst;
/*     */   }
/*     */   public String getNoxchq() {
/* 236 */     return this.noxchq;
/*     */   }
/*     */   
/*     */   public void setNoxchq(String noxchq) {
/* 240 */     this.noxchq = noxchq;
/*     */   }
/*     */   public Date getDxchq() {
/* 243 */     return this.dxchq;
/*     */   }
/*     */   
/*     */   public void setDxchq(Date dxchq) {
/* 247 */     this.dxchq = dxchq;
/*     */   }
/*     */   public Date getDxprmumxnxt() {
/* 250 */     return this.dxprmumxnxt;
/*     */   }
/*     */   
/*     */   public void setDxprmumxnxt(Date dxprmumxnxt) {
/* 254 */     this.dxprmumxnxt = dxprmumxnxt;
/*     */   }
/*     */   public String getMnfctrxmtr() {
/* 257 */     return this.mnfctrxmtr;
/*     */   }
/*     */   
/*     */   public void setMnfctrxmtr(String mnfctrxmtr) {
/* 261 */     this.mnfctrxmtr = mnfctrxmtr;
/*     */   }
/*     */   public String getNoxengnx() {
/* 264 */     return this.noxengnx;
/*     */   }
/*     */   
/*     */   public void setNoxengnx(String noxengnx) {
/* 268 */     this.noxengnx = noxengnx;
/*     */   }
/*     */   public String getNoxmodl() {
/* 271 */     return this.noxmodl;
/*     */   }
/*     */   
/*     */   public void setNoxmodl(String noxmodl) {
/* 275 */     this.noxmodl = noxmodl;
/*     */   }
/*     */   public String getChsssxno() {
/* 278 */     return this.chsssxno;
/*     */   }
/*     */   
/*     */   public void setChsssxno(String chsssxno) {
/* 282 */     this.chsssxno = chsssxno;
/*     */   }
/*     */   public String getRtoxno() {
/* 285 */     return this.rtoxno;
/*     */   }
/*     */   
/*     */   public void setRtoxno(String rtoxno) {
/* 289 */     this.rtoxno = rtoxno;
/*     */   }
/*     */   public String getRgstrtnxno() {
/* 292 */     return this.rgstrtnxno;
/*     */   }
/*     */   
/*     */   public void setRgstrtnxno(String rgstrtnxno) {
/* 296 */     this.rgstrtnxno = rgstrtnxno;
/*     */   }
/*     */   public String getFldx1() {
/* 299 */     return this.fldx1;
/*     */   }
/*     */   
/*     */   public void setFldx1(String fldx1) {
/* 303 */     this.fldx1 = fldx1;
/*     */   }
/*     */   public String getFldx2() {
/* 306 */     return this.fldx2;
/*     */   }
/*     */   
/*     */   public void setFldx2(String fldx2) {
/* 310 */     this.fldx2 = fldx2;
/*     */   }
/*     */   public String getFldx3() {
/* 313 */     return this.fldx3;
/*     */   }
/*     */   
/*     */   public void setFldx3(String fldx3) {
/* 317 */     this.fldx3 = fldx3;
/*     */   }
/*     */   public String getFldx4() {
/* 320 */     return this.fldx4;
/*     */   }
/*     */   
/*     */   public void setFldx4(String fldx4) {
/* 324 */     this.fldx4 = fldx4;
/*     */   }
/*     */   public String getFldx5() {
/* 327 */     return this.fldx5;
/*     */   }
/*     */   
/*     */   public void setFldx5(String fldx5) {
/* 331 */     this.fldx5 = fldx5;
/*     */   }
/*     */   public String getFldx6() {
/* 334 */     return this.fldx6;
/*     */   }
/*     */   
/*     */   public void setFldx6(String fldx6) {
/* 338 */     this.fldx6 = fldx6;
/*     */   }
/*     */   public String getFldx7() {
/* 341 */     return this.fldx7;
/*     */   }
/*     */   
/*     */   public void setFldx7(String fldx7) {
/* 345 */     this.fldx7 = fldx7;
/*     */   }
/*     */   public String getFldx8() {
/* 348 */     return this.fldx8;
/*     */   }
/*     */   
/*     */   public void setFldx8(String fldx8) {
/* 352 */     this.fldx8 = fldx8;
/*     */   }
/*     */   public String getFldx9() {
/* 355 */     return this.fldx9;
/*     */   }
/*     */   
/*     */   public void setFldx9(String fldx9) {
/* 359 */     this.fldx9 = fldx9;
/*     */   }
/*     */   public String getFldx10() {
/* 362 */     return this.fldx10;
/*     */   }
/*     */   
/*     */   public void setFldx10(String fldx10) {
/* 366 */     this.fldx10 = fldx10;
/*     */   }
/*     */   public String getFldx11() {
/* 369 */     return this.fldx11;
/*     */   }
/*     */   
/*     */   public void setFldx11(String fldx11) {
/* 373 */     this.fldx11 = fldx11;
/*     */   }
/*     */   public String getFldx12() {
/* 376 */     return this.fldx12;
/*     */   }
/*     */   
/*     */   public void setFldx12(String fldx12) {
/* 380 */     this.fldx12 = fldx12;
/*     */   }
/*     */   public String getFldx13() {
/* 383 */     return this.fldx13;
/*     */   }
/*     */   
/*     */   public void setFldx13(String fldx13) {
/* 387 */     this.fldx13 = fldx13;
/*     */   }
/*     */   public String getFldx14() {
/* 390 */     return this.fldx14;
/*     */   }
/*     */   
/*     */   public void setFldx14(String fldx14) {
/* 394 */     this.fldx14 = fldx14;
/*     */   }
/*     */   public String getFldx15() {
/* 397 */     return this.fldx15;
/*     */   }
/*     */   
/*     */   public void setFldx15(String fldx15) {
/* 401 */     this.fldx15 = fldx15;
/*     */   }
/*     */   public String getFldx16() {
/* 404 */     return this.fldx16;
/*     */   }
/*     */   
/*     */   public void setFldx16(String fldx16) {
/* 408 */     this.fldx16 = fldx16;
/*     */   }
/*     */   public String getFldx17() {
/* 411 */     return this.fldx17;
/*     */   }
/*     */   
/*     */   public void setFldx17(String fldx17) {
/* 415 */     this.fldx17 = fldx17;
/*     */   }
/*     */   public String getFldx18() {
/* 418 */     return this.fldx18;
/*     */   }
/*     */   
/*     */   public void setFldx18(String fldx18) {
/* 422 */     this.fldx18 = fldx18;
/*     */   }
/*     */   public String getFldx19() {
/* 425 */     return this.fldx19;
/*     */   }
/*     */   
/*     */   public void setFldx19(String fldx19) {
/* 429 */     this.fldx19 = fldx19;
/*     */   }
/*     */   public String getFldx20() {
/* 432 */     return this.fldx20;
/*     */   }
/*     */   
/*     */   public void setFldx20(String fldx20) {
/* 436 */     this.fldx20 = fldx20;
/*     */   }
/*     */   public Date getDxctd() {
/* 439 */     return this.dxctd;
/*     */   }
/*     */   
/*     */   public void setDxctd(Date dxctd) {
/* 443 */     this.dxctd = dxctd;
/*     */   }
/*     */   public String getBxctd() {
/* 446 */     return this.bxctd;
/*     */   }
/*     */   
/*     */   public void setBxctd(String bxctd) {
/* 450 */     this.bxctd = bxctd;
/*     */   }
/*     */   public Date getDxmfdxlst() {
/* 453 */     return this.dxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setDxmfdxlst(Date dxmfdxlst) {
/* 457 */     this.dxmfdxlst = dxmfdxlst;
/*     */   }
/*     */   public String getBxmfdxlst() {
/* 460 */     return this.bxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setBxmfdxlst(String bxmfdxlst) {
/* 464 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Dxinsuxsmry.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */