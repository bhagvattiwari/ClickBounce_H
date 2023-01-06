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
/*     */ public class Dxdmtxsmry
/*     */   implements Serializable
/*     */ {
/*     */   private BigDecimal ixsmryxdmtxtrns;
/*     */   private Dxtrnsxsmryxm dxtrnsxsmryxm;
/*     */   private Pxprdctxm pxprdctxm;
/*     */   private String nmxact;
/*     */   private String ixclnt;
/*     */   private String cdexisin;
/*     */   private String dscxisin;
/*     */   private String noxslp;
/*     */   private String noxcntrt;
/*     */   private Date dxntxcntrt;
/*     */   private BigDecimal blxopng;
/*     */   private BigDecimal blxclsg;
/*     */   private BigDecimal aqustnxcst;
/*     */   private String cdexcrncy;
/*     */   private String cdexxchge;
/*     */   private BigDecimal valxmkt;
/*     */   private BigDecimal prcntxprtflo;
/*     */   private BigDecimal txxtrnsxscrts;
/*     */   private Date dxstlmnt;
/*     */   private BigDecimal noxstlmnt;
/*     */   private String cdexbrkrxstck;
/*     */   private String nmxbrkrxstck;
/*     */   private Date dxtrde;
/*     */   private BigDecimal mpnxclntxtrdng;
/*     */   private BigDecimal chrgsxtrxn;
/*     */   private String dscxtrns;
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
/*     */   public Dxdmtxsmry() {}
/*     */   
/*     */   public Dxdmtxsmry(BigDecimal ixsmryxdmtxtrns) {
/*  70 */     this.ixsmryxdmtxtrns = ixsmryxdmtxtrns;
/*     */   }
/*     */   public Dxdmtxsmry(BigDecimal ixsmryxdmtxtrns, Dxtrnsxsmryxm dxtrnsxsmryxm, Pxprdctxm pxprdctxm, String nmxact, String ixclnt, String cdexisin, String dscxisin, String noxslp, String noxcntrt, Date dxntxcntrt, BigDecimal blxopng, BigDecimal blxclsg, BigDecimal aqustnxcst, String cdexcrncy, String cdexxchge, BigDecimal valxmkt, BigDecimal prcntxprtflo, BigDecimal txxtrnsxscrts, Date dxstlmnt, BigDecimal noxstlmnt, String cdexbrkrxstck, String nmxbrkrxstck, Date dxtrde, BigDecimal mpnxclntxtrdng, BigDecimal chrgsxtrxn, String dscxtrns, String fldx1, String fldx2, String fldx3, String fldx4, String fldx5, String fldx6, String fldx7, String fldx8, String fldx9, String fldx10, String fldx11, String fldx12, String fldx13, String fldx14, String fldx15, String fldx16, String fldx17, String fldx18, String fldx19, String fldx20, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst) {
/*  73 */     this.ixsmryxdmtxtrns = ixsmryxdmtxtrns;
/*  74 */     this.dxtrnsxsmryxm = dxtrnsxsmryxm;
/*  75 */     this.pxprdctxm = pxprdctxm;
/*  76 */     this.nmxact = nmxact;
/*  77 */     this.ixclnt = ixclnt;
/*  78 */     this.cdexisin = cdexisin;
/*  79 */     this.dscxisin = dscxisin;
/*  80 */     this.noxslp = noxslp;
/*  81 */     this.noxcntrt = noxcntrt;
/*  82 */     this.dxntxcntrt = dxntxcntrt;
/*  83 */     this.blxopng = blxopng;
/*  84 */     this.blxclsg = blxclsg;
/*  85 */     this.aqustnxcst = aqustnxcst;
/*  86 */     this.cdexcrncy = cdexcrncy;
/*  87 */     this.cdexxchge = cdexxchge;
/*  88 */     this.valxmkt = valxmkt;
/*  89 */     this.prcntxprtflo = prcntxprtflo;
/*  90 */     this.txxtrnsxscrts = txxtrnsxscrts;
/*  91 */     this.dxstlmnt = dxstlmnt;
/*  92 */     this.noxstlmnt = noxstlmnt;
/*  93 */     this.cdexbrkrxstck = cdexbrkrxstck;
/*  94 */     this.nmxbrkrxstck = nmxbrkrxstck;
/*  95 */     this.dxtrde = dxtrde;
/*  96 */     this.mpnxclntxtrdng = mpnxclntxtrdng;
/*  97 */     this.chrgsxtrxn = chrgsxtrxn;
/*  98 */     this.dscxtrns = dscxtrns;
/*  99 */     this.fldx1 = fldx1;
/* 100 */     this.fldx2 = fldx2;
/* 101 */     this.fldx3 = fldx3;
/* 102 */     this.fldx4 = fldx4;
/* 103 */     this.fldx5 = fldx5;
/* 104 */     this.fldx6 = fldx6;
/* 105 */     this.fldx7 = fldx7;
/* 106 */     this.fldx8 = fldx8;
/* 107 */     this.fldx9 = fldx9;
/* 108 */     this.fldx10 = fldx10;
/* 109 */     this.fldx11 = fldx11;
/* 110 */     this.fldx12 = fldx12;
/* 111 */     this.fldx13 = fldx13;
/* 112 */     this.fldx14 = fldx14;
/* 113 */     this.fldx15 = fldx15;
/* 114 */     this.fldx16 = fldx16;
/* 115 */     this.fldx17 = fldx17;
/* 116 */     this.fldx18 = fldx18;
/* 117 */     this.fldx19 = fldx19;
/* 118 */     this.fldx20 = fldx20;
/* 119 */     this.dxctd = dxctd;
/* 120 */     this.bxctd = bxctd;
/* 121 */     this.dxmfdxlst = dxmfdxlst;
/* 122 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */   
/*     */   public BigDecimal getIxsmryxdmtxtrns() {
/* 126 */     return this.ixsmryxdmtxtrns;
/*     */   }
/*     */   
/*     */   public void setIxsmryxdmtxtrns(BigDecimal ixsmryxdmtxtrns) {
/* 130 */     this.ixsmryxdmtxtrns = ixsmryxdmtxtrns;
/*     */   }
/*     */   public Dxtrnsxsmryxm getDxtrnsxsmryxm() {
/* 133 */     return this.dxtrnsxsmryxm;
/*     */   }
/*     */   
/*     */   public void setDxtrnsxsmryxm(Dxtrnsxsmryxm dxtrnsxsmryxm) {
/* 137 */     this.dxtrnsxsmryxm = dxtrnsxsmryxm;
/*     */   }
/*     */   public Pxprdctxm getPxprdctxm() {
/* 140 */     return this.pxprdctxm;
/*     */   }
/*     */   
/*     */   public void setPxprdctxm(Pxprdctxm pxprdctxm) {
/* 144 */     this.pxprdctxm = pxprdctxm;
/*     */   }
/*     */   public String getNmxact() {
/* 147 */     return this.nmxact;
/*     */   }
/*     */   
/*     */   public void setNmxact(String nmxact) {
/* 151 */     this.nmxact = nmxact;
/*     */   }
/*     */   public String getIxclnt() {
/* 154 */     return this.ixclnt;
/*     */   }
/*     */   
/*     */   public void setIxclnt(String ixclnt) {
/* 158 */     this.ixclnt = ixclnt;
/*     */   }
/*     */   public String getCdexisin() {
/* 161 */     return this.cdexisin;
/*     */   }
/*     */   
/*     */   public void setCdexisin(String cdexisin) {
/* 165 */     this.cdexisin = cdexisin;
/*     */   }
/*     */   public String getDscxisin() {
/* 168 */     return this.dscxisin;
/*     */   }
/*     */   
/*     */   public void setDscxisin(String dscxisin) {
/* 172 */     this.dscxisin = dscxisin;
/*     */   }
/*     */   public String getNoxslp() {
/* 175 */     return this.noxslp;
/*     */   }
/*     */   
/*     */   public void setNoxslp(String noxslp) {
/* 179 */     this.noxslp = noxslp;
/*     */   }
/*     */   public String getNoxcntrt() {
/* 182 */     return this.noxcntrt;
/*     */   }
/*     */   
/*     */   public void setNoxcntrt(String noxcntrt) {
/* 186 */     this.noxcntrt = noxcntrt;
/*     */   }
/*     */   public Date getDxntxcntrt() {
/* 189 */     return this.dxntxcntrt;
/*     */   }
/*     */   
/*     */   public void setDxntxcntrt(Date dxntxcntrt) {
/* 193 */     this.dxntxcntrt = dxntxcntrt;
/*     */   }
/*     */   public BigDecimal getBlxopng() {
/* 196 */     return this.blxopng;
/*     */   }
/*     */   
/*     */   public void setBlxopng(BigDecimal blxopng) {
/* 200 */     this.blxopng = blxopng;
/*     */   }
/*     */   public BigDecimal getBlxclsg() {
/* 203 */     return this.blxclsg;
/*     */   }
/*     */   
/*     */   public void setBlxclsg(BigDecimal blxclsg) {
/* 207 */     this.blxclsg = blxclsg;
/*     */   }
/*     */   public BigDecimal getAqustnxcst() {
/* 210 */     return this.aqustnxcst;
/*     */   }
/*     */   
/*     */   public void setAqustnxcst(BigDecimal aqustnxcst) {
/* 214 */     this.aqustnxcst = aqustnxcst;
/*     */   }
/*     */   public String getCdexcrncy() {
/* 217 */     return this.cdexcrncy;
/*     */   }
/*     */   
/*     */   public void setCdexcrncy(String cdexcrncy) {
/* 221 */     this.cdexcrncy = cdexcrncy;
/*     */   }
/*     */   public String getCdexxchge() {
/* 224 */     return this.cdexxchge;
/*     */   }
/*     */   
/*     */   public void setCdexxchge(String cdexxchge) {
/* 228 */     this.cdexxchge = cdexxchge;
/*     */   }
/*     */   public BigDecimal getValxmkt() {
/* 231 */     return this.valxmkt;
/*     */   }
/*     */   
/*     */   public void setValxmkt(BigDecimal valxmkt) {
/* 235 */     this.valxmkt = valxmkt;
/*     */   }
/*     */   public BigDecimal getPrcntxprtflo() {
/* 238 */     return this.prcntxprtflo;
/*     */   }
/*     */   
/*     */   public void setPrcntxprtflo(BigDecimal prcntxprtflo) {
/* 242 */     this.prcntxprtflo = prcntxprtflo;
/*     */   }
/*     */   public BigDecimal getTxxtrnsxscrts() {
/* 245 */     return this.txxtrnsxscrts;
/*     */   }
/*     */   
/*     */   public void setTxxtrnsxscrts(BigDecimal txxtrnsxscrts) {
/* 249 */     this.txxtrnsxscrts = txxtrnsxscrts;
/*     */   }
/*     */   public Date getDxstlmnt() {
/* 252 */     return this.dxstlmnt;
/*     */   }
/*     */   
/*     */   public void setDxstlmnt(Date dxstlmnt) {
/* 256 */     this.dxstlmnt = dxstlmnt;
/*     */   }
/*     */   public BigDecimal getNoxstlmnt() {
/* 259 */     return this.noxstlmnt;
/*     */   }
/*     */   
/*     */   public void setNoxstlmnt(BigDecimal noxstlmnt) {
/* 263 */     this.noxstlmnt = noxstlmnt;
/*     */   }
/*     */   public String getCdexbrkrxstck() {
/* 266 */     return this.cdexbrkrxstck;
/*     */   }
/*     */   
/*     */   public void setCdexbrkrxstck(String cdexbrkrxstck) {
/* 270 */     this.cdexbrkrxstck = cdexbrkrxstck;
/*     */   }
/*     */   public String getNmxbrkrxstck() {
/* 273 */     return this.nmxbrkrxstck;
/*     */   }
/*     */   
/*     */   public void setNmxbrkrxstck(String nmxbrkrxstck) {
/* 277 */     this.nmxbrkrxstck = nmxbrkrxstck;
/*     */   }
/*     */   public Date getDxtrde() {
/* 280 */     return this.dxtrde;
/*     */   }
/*     */   
/*     */   public void setDxtrde(Date dxtrde) {
/* 284 */     this.dxtrde = dxtrde;
/*     */   }
/*     */   public BigDecimal getMpnxclntxtrdng() {
/* 287 */     return this.mpnxclntxtrdng;
/*     */   }
/*     */   
/*     */   public void setMpnxclntxtrdng(BigDecimal mpnxclntxtrdng) {
/* 291 */     this.mpnxclntxtrdng = mpnxclntxtrdng;
/*     */   }
/*     */   public BigDecimal getChrgsxtrxn() {
/* 294 */     return this.chrgsxtrxn;
/*     */   }
/*     */   
/*     */   public void setChrgsxtrxn(BigDecimal chrgsxtrxn) {
/* 298 */     this.chrgsxtrxn = chrgsxtrxn;
/*     */   }
/*     */   public String getDscxtrns() {
/* 301 */     return this.dscxtrns;
/*     */   }
/*     */   
/*     */   public void setDscxtrns(String dscxtrns) {
/* 305 */     this.dscxtrns = dscxtrns;
/*     */   }
/*     */   public String getFldx1() {
/* 308 */     return this.fldx1;
/*     */   }
/*     */   
/*     */   public void setFldx1(String fldx1) {
/* 312 */     this.fldx1 = fldx1;
/*     */   }
/*     */   public String getFldx2() {
/* 315 */     return this.fldx2;
/*     */   }
/*     */   
/*     */   public void setFldx2(String fldx2) {
/* 319 */     this.fldx2 = fldx2;
/*     */   }
/*     */   public String getFldx3() {
/* 322 */     return this.fldx3;
/*     */   }
/*     */   
/*     */   public void setFldx3(String fldx3) {
/* 326 */     this.fldx3 = fldx3;
/*     */   }
/*     */   public String getFldx4() {
/* 329 */     return this.fldx4;
/*     */   }
/*     */   
/*     */   public void setFldx4(String fldx4) {
/* 333 */     this.fldx4 = fldx4;
/*     */   }
/*     */   public String getFldx5() {
/* 336 */     return this.fldx5;
/*     */   }
/*     */   
/*     */   public void setFldx5(String fldx5) {
/* 340 */     this.fldx5 = fldx5;
/*     */   }
/*     */   public String getFldx6() {
/* 343 */     return this.fldx6;
/*     */   }
/*     */   
/*     */   public void setFldx6(String fldx6) {
/* 347 */     this.fldx6 = fldx6;
/*     */   }
/*     */   public String getFldx7() {
/* 350 */     return this.fldx7;
/*     */   }
/*     */   
/*     */   public void setFldx7(String fldx7) {
/* 354 */     this.fldx7 = fldx7;
/*     */   }
/*     */   public String getFldx8() {
/* 357 */     return this.fldx8;
/*     */   }
/*     */   
/*     */   public void setFldx8(String fldx8) {
/* 361 */     this.fldx8 = fldx8;
/*     */   }
/*     */   public String getFldx9() {
/* 364 */     return this.fldx9;
/*     */   }
/*     */   
/*     */   public void setFldx9(String fldx9) {
/* 368 */     this.fldx9 = fldx9;
/*     */   }
/*     */   public String getFldx10() {
/* 371 */     return this.fldx10;
/*     */   }
/*     */   
/*     */   public void setFldx10(String fldx10) {
/* 375 */     this.fldx10 = fldx10;
/*     */   }
/*     */   public String getFldx11() {
/* 378 */     return this.fldx11;
/*     */   }
/*     */   
/*     */   public void setFldx11(String fldx11) {
/* 382 */     this.fldx11 = fldx11;
/*     */   }
/*     */   public String getFldx12() {
/* 385 */     return this.fldx12;
/*     */   }
/*     */   
/*     */   public void setFldx12(String fldx12) {
/* 389 */     this.fldx12 = fldx12;
/*     */   }
/*     */   public String getFldx13() {
/* 392 */     return this.fldx13;
/*     */   }
/*     */   
/*     */   public void setFldx13(String fldx13) {
/* 396 */     this.fldx13 = fldx13;
/*     */   }
/*     */   public String getFldx14() {
/* 399 */     return this.fldx14;
/*     */   }
/*     */   
/*     */   public void setFldx14(String fldx14) {
/* 403 */     this.fldx14 = fldx14;
/*     */   }
/*     */   public String getFldx15() {
/* 406 */     return this.fldx15;
/*     */   }
/*     */   
/*     */   public void setFldx15(String fldx15) {
/* 410 */     this.fldx15 = fldx15;
/*     */   }
/*     */   public String getFldx16() {
/* 413 */     return this.fldx16;
/*     */   }
/*     */   
/*     */   public void setFldx16(String fldx16) {
/* 417 */     this.fldx16 = fldx16;
/*     */   }
/*     */   public String getFldx17() {
/* 420 */     return this.fldx17;
/*     */   }
/*     */   
/*     */   public void setFldx17(String fldx17) {
/* 424 */     this.fldx17 = fldx17;
/*     */   }
/*     */   public String getFldx18() {
/* 427 */     return this.fldx18;
/*     */   }
/*     */   
/*     */   public void setFldx18(String fldx18) {
/* 431 */     this.fldx18 = fldx18;
/*     */   }
/*     */   public String getFldx19() {
/* 434 */     return this.fldx19;
/*     */   }
/*     */   
/*     */   public void setFldx19(String fldx19) {
/* 438 */     this.fldx19 = fldx19;
/*     */   }
/*     */   public String getFldx20() {
/* 441 */     return this.fldx20;
/*     */   }
/*     */   
/*     */   public void setFldx20(String fldx20) {
/* 445 */     this.fldx20 = fldx20;
/*     */   }
/*     */   public Date getDxctd() {
/* 448 */     return this.dxctd;
/*     */   }
/*     */   
/*     */   public void setDxctd(Date dxctd) {
/* 452 */     this.dxctd = dxctd;
/*     */   }
/*     */   public String getBxctd() {
/* 455 */     return this.bxctd;
/*     */   }
/*     */   
/*     */   public void setBxctd(String bxctd) {
/* 459 */     this.bxctd = bxctd;
/*     */   }
/*     */   public Date getDxmfdxlst() {
/* 462 */     return this.dxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setDxmfdxlst(Date dxmfdxlst) {
/* 466 */     this.dxmfdxlst = dxmfdxlst;
/*     */   }
/*     */   public String getBxmfdxlst() {
/* 469 */     return this.bxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setBxmfdxlst(String bxmfdxlst) {
/* 473 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Dxdmtxsmry.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */