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
/*     */ 
/*     */ public class Dxtrnsxdtls
/*     */   implements Serializable
/*     */ {
/*     */   private BigDecimal ixdtlsxtrns;
/*     */   private Dxtrnsxsmryxm dxtrnsxsmryxm;
/*     */   private Date dxtr;
/*     */   private Date dxval;
/*     */   private String descxtrs;
/*     */   private String noxref;
/*     */   private String dbxt;
/*     */   private String crxdt;
/*     */   private String blnxc;
/*     */   private String brnchxintng;
/*     */   private String areaxspnds;
/*     */   private String qtnx;
/*     */   private String vlex;
/*     */   private String rtsx;
/*     */   private String atxtot;
/*     */   private String rtsxmk;
/*     */   private String losxganxunrelzd;
/*     */   private String secrty;
/*     */   private String noxorxr;
/*     */   private String tmexordr;
/*     */   private String noxtrdex;
/*     */   private String brkxg;
/*     */   private String srvcextx;
/*     */   private String amtxnt;
/*     */   private String stt;
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
/*     */   private String dxbxn;
/*     */   private String dxbxac;
/*     */   private String dxbxem;
/*     */   private String dxrsn;
/*     */   private String dxtrnxcd;
/*     */   
/*     */   public Dxtrnsxdtls() {}
/*     */   
/*     */   public Dxtrnsxdtls(BigDecimal ixdtlsxtrns) {
/*  75 */     this.ixdtlsxtrns = ixdtlsxtrns;
/*     */   }
/*     */   public Dxtrnsxdtls(BigDecimal ixdtlsxtrns, Dxtrnsxsmryxm dxtrnsxsmryxm, Date dxtr, Date dxval, String descxtrs, String noxref, String dbxt, String crxdt, String blnxc, String brnchxintng, String areaxspnds, String qtnx, String vlex, String rtsx, String atxtot, String rtsxmk, String losxganxunrelzd, String secrty, String noxorxr, String tmexordr, String noxtrdex, String brkxg, String srvcextx, String amtxnt, String stt, String fldx1, String fldx2, String fldx3, String fldx4, String fldx5, String fldx6, String fldx7, String fldx8, String fldx9, String fldx10, String fldx11, String fldx12, String fldx13, String fldx14, String fldx15, String fldx16, String fldx17, String fldx18, String fldx19, String fldx20, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst) {
/*  78 */     this.ixdtlsxtrns = ixdtlsxtrns;
/*  79 */     this.dxtrnsxsmryxm = dxtrnsxsmryxm;
/*  80 */     this.dxtr = dxtr;
/*  81 */     this.dxval = dxval;
/*  82 */     this.descxtrs = descxtrs;
/*  83 */     this.noxref = noxref;
/*  84 */     this.dbxt = dbxt;
/*  85 */     this.crxdt = crxdt;
/*  86 */     this.blnxc = blnxc;
/*  87 */     this.brnchxintng = brnchxintng;
/*  88 */     this.areaxspnds = areaxspnds;
/*  89 */     this.qtnx = qtnx;
/*  90 */     this.vlex = vlex;
/*  91 */     this.rtsx = rtsx;
/*  92 */     this.atxtot = atxtot;
/*  93 */     this.rtsxmk = rtsxmk;
/*  94 */     this.losxganxunrelzd = losxganxunrelzd;
/*  95 */     this.secrty = secrty;
/*  96 */     this.noxorxr = noxorxr;
/*  97 */     this.tmexordr = tmexordr;
/*  98 */     this.noxtrdex = noxtrdex;
/*  99 */     this.brkxg = brkxg;
/* 100 */     this.srvcextx = srvcextx;
/* 101 */     this.amtxnt = amtxnt;
/* 102 */     this.stt = stt;
/* 103 */     this.fldx1 = fldx1;
/* 104 */     this.fldx2 = fldx2;
/* 105 */     this.fldx3 = fldx3;
/* 106 */     this.fldx4 = fldx4;
/* 107 */     this.fldx5 = fldx5;
/* 108 */     this.fldx6 = fldx6;
/* 109 */     this.fldx7 = fldx7;
/* 110 */     this.fldx8 = fldx8;
/* 111 */     this.fldx9 = fldx9;
/* 112 */     this.fldx10 = fldx10;
/* 113 */     this.fldx11 = fldx11;
/* 114 */     this.fldx12 = fldx12;
/* 115 */     this.fldx13 = fldx13;
/* 116 */     this.fldx14 = fldx14;
/* 117 */     this.fldx15 = fldx15;
/* 118 */     this.fldx16 = fldx16;
/* 119 */     this.fldx17 = fldx17;
/* 120 */     this.fldx18 = fldx18;
/* 121 */     this.fldx19 = fldx19;
/* 122 */     this.fldx20 = fldx20;
/* 123 */     this.dxctd = dxctd;
/* 124 */     this.bxctd = bxctd;
/* 125 */     this.dxmfdxlst = dxmfdxlst;
/* 126 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */   
/*     */   public BigDecimal getIxdtlsxtrns() {
/* 130 */     return this.ixdtlsxtrns;
/*     */   }
/*     */   
/*     */   public void setIxdtlsxtrns(BigDecimal ixdtlsxtrns) {
/* 134 */     this.ixdtlsxtrns = ixdtlsxtrns;
/*     */   }
/*     */   public Dxtrnsxsmryxm getDxtrnsxsmryxm() {
/* 137 */     return this.dxtrnsxsmryxm;
/*     */   }
/*     */   
/*     */   public void setDxtrnsxsmryxm(Dxtrnsxsmryxm dxtrnsxsmryxm) {
/* 141 */     this.dxtrnsxsmryxm = dxtrnsxsmryxm;
/*     */   }
/*     */   public Date getDxtr() {
/* 144 */     return this.dxtr;
/*     */   }
/*     */   
/*     */   public void setDxtr(Date dxtr) {
/* 148 */     this.dxtr = dxtr;
/*     */   }
/*     */   public Date getDxval() {
/* 151 */     return this.dxval;
/*     */   }
/*     */   
/*     */   public void setDxval(Date dxval) {
/* 155 */     this.dxval = dxval;
/*     */   }
/*     */   public String getDescxtrs() {
/* 158 */     return this.descxtrs;
/*     */   }
/*     */   
/*     */   public void setDescxtrs(String descxtrs) {
/* 162 */     this.descxtrs = descxtrs;
/*     */   }
/*     */   public String getNoxref() {
/* 165 */     return this.noxref;
/*     */   }
/*     */   
/*     */   public void setNoxref(String noxref) {
/* 169 */     this.noxref = noxref;
/*     */   }
/*     */   public String getDbxt() {
/* 172 */     return this.dbxt;
/*     */   }
/*     */   
/*     */   public void setDbxt(String dbxt) {
/* 176 */     this.dbxt = dbxt;
/*     */   }
/*     */   public String getCrxdt() {
/* 179 */     return this.crxdt;
/*     */   }
/*     */   
/*     */   public void setCrxdt(String crxdt) {
/* 183 */     this.crxdt = crxdt;
/*     */   }
/*     */   public String getBlnxc() {
/* 186 */     return this.blnxc;
/*     */   }
/*     */   
/*     */   public void setBlnxc(String blnxc) {
/* 190 */     this.blnxc = blnxc;
/*     */   }
/*     */   public String getBrnchxintng() {
/* 193 */     return this.brnchxintng;
/*     */   }
/*     */   
/*     */   public void setBrnchxintng(String brnchxintng) {
/* 197 */     this.brnchxintng = brnchxintng;
/*     */   }
/*     */   public String getAreaxspnds() {
/* 200 */     return this.areaxspnds;
/*     */   }
/*     */   
/*     */   public void setAreaxspnds(String areaxspnds) {
/* 204 */     this.areaxspnds = areaxspnds;
/*     */   }
/*     */   public String getQtnx() {
/* 207 */     return this.qtnx;
/*     */   }
/*     */   
/*     */   public void setQtnx(String qtnx) {
/* 211 */     this.qtnx = qtnx;
/*     */   }
/*     */   public String getVlex() {
/* 214 */     return this.vlex;
/*     */   }
/*     */   
/*     */   public void setVlex(String vlex) {
/* 218 */     this.vlex = vlex;
/*     */   }
/*     */   public String getRtsx() {
/* 221 */     return this.rtsx;
/*     */   }
/*     */   
/*     */   public void setRtsx(String rtsx) {
/* 225 */     this.rtsx = rtsx;
/*     */   }
/*     */   public String getAtxtot() {
/* 228 */     return this.atxtot;
/*     */   }
/*     */   
/*     */   public void setAtxtot(String atxtot) {
/* 232 */     this.atxtot = atxtot;
/*     */   }
/*     */   public String getRtsxmk() {
/* 235 */     return this.rtsxmk;
/*     */   }
/*     */   
/*     */   public void setRtsxmk(String rtsxmk) {
/* 239 */     this.rtsxmk = rtsxmk;
/*     */   }
/*     */   public String getLosxganxunrelzd() {
/* 242 */     return this.losxganxunrelzd;
/*     */   }
/*     */   
/*     */   public void setLosxganxunrelzd(String losxganxunrelzd) {
/* 246 */     this.losxganxunrelzd = losxganxunrelzd;
/*     */   }
/*     */   public String getSecrty() {
/* 249 */     return this.secrty;
/*     */   }
/*     */   
/*     */   public void setSecrty(String secrty) {
/* 253 */     this.secrty = secrty;
/*     */   }
/*     */   public String getNoxorxr() {
/* 256 */     return this.noxorxr;
/*     */   }
/*     */   
/*     */   public void setNoxorxr(String noxorxr) {
/* 260 */     this.noxorxr = noxorxr;
/*     */   }
/*     */   public String getTmexordr() {
/* 263 */     return this.tmexordr;
/*     */   }
/*     */   
/*     */   public void setTmexordr(String tmexordr) {
/* 267 */     this.tmexordr = tmexordr;
/*     */   }
/*     */   public String getNoxtrdex() {
/* 270 */     return this.noxtrdex;
/*     */   }
/*     */   
/*     */   public void setNoxtrdex(String noxtrdex) {
/* 274 */     this.noxtrdex = noxtrdex;
/*     */   }
/*     */   public String getBrkxg() {
/* 277 */     return this.brkxg;
/*     */   }
/*     */   
/*     */   public void setBrkxg(String brkxg) {
/* 281 */     this.brkxg = brkxg;
/*     */   }
/*     */   public String getSrvcextx() {
/* 284 */     return this.srvcextx;
/*     */   }
/*     */   
/*     */   public void setSrvcextx(String srvcextx) {
/* 288 */     this.srvcextx = srvcextx;
/*     */   }
/*     */   public String getAmtxnt() {
/* 291 */     return this.amtxnt;
/*     */   }
/*     */   
/*     */   public void setAmtxnt(String amtxnt) {
/* 295 */     this.amtxnt = amtxnt;
/*     */   }
/*     */   public String getStt() {
/* 298 */     return this.stt;
/*     */   }
/*     */   
/*     */   public void setStt(String stt) {
/* 302 */     this.stt = stt;
/*     */   }
/*     */   public String getFldx1() {
/* 305 */     return this.fldx1;
/*     */   }
/*     */   
/*     */   public void setFldx1(String fldx1) {
/* 309 */     this.fldx1 = fldx1;
/*     */   }
/*     */   public String getFldx2() {
/* 312 */     return this.fldx2;
/*     */   }
/*     */   
/*     */   public void setFldx2(String fldx2) {
/* 316 */     this.fldx2 = fldx2;
/*     */   }
/*     */   public String getFldx3() {
/* 319 */     return this.fldx3;
/*     */   }
/*     */   
/*     */   public void setFldx3(String fldx3) {
/* 323 */     this.fldx3 = fldx3;
/*     */   }
/*     */   public String getFldx4() {
/* 326 */     return this.fldx4;
/*     */   }
/*     */   
/*     */   public void setFldx4(String fldx4) {
/* 330 */     this.fldx4 = fldx4;
/*     */   }
/*     */   public String getFldx5() {
/* 333 */     return this.fldx5;
/*     */   }
/*     */   
/*     */   public void setFldx5(String fldx5) {
/* 337 */     this.fldx5 = fldx5;
/*     */   }
/*     */   public String getFldx6() {
/* 340 */     return this.fldx6;
/*     */   }
/*     */   
/*     */   public void setFldx6(String fldx6) {
/* 344 */     this.fldx6 = fldx6;
/*     */   }
/*     */   public String getFldx7() {
/* 347 */     return this.fldx7;
/*     */   }
/*     */   
/*     */   public void setFldx7(String fldx7) {
/* 351 */     this.fldx7 = fldx7;
/*     */   }
/*     */   public String getFldx8() {
/* 354 */     return this.fldx8;
/*     */   }
/*     */   
/*     */   public void setFldx8(String fldx8) {
/* 358 */     this.fldx8 = fldx8;
/*     */   }
/*     */   public String getFldx9() {
/* 361 */     return this.fldx9;
/*     */   }
/*     */   
/*     */   public void setFldx9(String fldx9) {
/* 365 */     this.fldx9 = fldx9;
/*     */   }
/*     */   public String getFldx10() {
/* 368 */     return this.fldx10;
/*     */   }
/*     */   
/*     */   public void setFldx10(String fldx10) {
/* 372 */     this.fldx10 = fldx10;
/*     */   }
/*     */   public String getFldx11() {
/* 375 */     return this.fldx11;
/*     */   }
/*     */   
/*     */   public void setFldx11(String fldx11) {
/* 379 */     this.fldx11 = fldx11;
/*     */   }
/*     */   public String getFldx12() {
/* 382 */     return this.fldx12;
/*     */   }
/*     */   
/*     */   public void setFldx12(String fldx12) {
/* 386 */     this.fldx12 = fldx12;
/*     */   }
/*     */   public String getFldx13() {
/* 389 */     return this.fldx13;
/*     */   }
/*     */   
/*     */   public void setFldx13(String fldx13) {
/* 393 */     this.fldx13 = fldx13;
/*     */   }
/*     */   public String getFldx14() {
/* 396 */     return this.fldx14;
/*     */   }
/*     */   
/*     */   public void setFldx14(String fldx14) {
/* 400 */     this.fldx14 = fldx14;
/*     */   }
/*     */   public String getFldx15() {
/* 403 */     return this.fldx15;
/*     */   }
/*     */   
/*     */   public void setFldx15(String fldx15) {
/* 407 */     this.fldx15 = fldx15;
/*     */   }
/*     */   public String getFldx16() {
/* 410 */     return this.fldx16;
/*     */   }
/*     */   
/*     */   public void setFldx16(String fldx16) {
/* 414 */     this.fldx16 = fldx16;
/*     */   }
/*     */   public String getFldx17() {
/* 417 */     return this.fldx17;
/*     */   }
/*     */   
/*     */   public void setFldx17(String fldx17) {
/* 421 */     this.fldx17 = fldx17;
/*     */   }
/*     */   public String getFldx18() {
/* 424 */     return this.fldx18;
/*     */   }
/*     */   
/*     */   public void setFldx18(String fldx18) {
/* 428 */     this.fldx18 = fldx18;
/*     */   }
/*     */   public String getFldx19() {
/* 431 */     return this.fldx19;
/*     */   }
/*     */   
/*     */   public void setFldx19(String fldx19) {
/* 435 */     this.fldx19 = fldx19;
/*     */   }
/*     */   public String getFldx20() {
/* 438 */     return this.fldx20;
/*     */   }
/*     */   
/*     */   public void setFldx20(String fldx20) {
/* 442 */     this.fldx20 = fldx20;
/*     */   }
/*     */   public Date getDxctd() {
/* 445 */     return this.dxctd;
/*     */   }
/*     */   
/*     */   public void setDxctd(Date dxctd) {
/* 449 */     this.dxctd = dxctd;
/*     */   }
/*     */   public String getBxctd() {
/* 452 */     return this.bxctd;
/*     */   }
/*     */   
/*     */   public void setBxctd(String bxctd) {
/* 456 */     this.bxctd = bxctd;
/*     */   }
/*     */   public Date getDxmfdxlst() {
/* 459 */     return this.dxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setDxmfdxlst(Date dxmfdxlst) {
/* 463 */     this.dxmfdxlst = dxmfdxlst;
/*     */   }
/*     */   public String getBxmfdxlst() {
/* 466 */     return this.bxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setBxmfdxlst(String bxmfdxlst) {
/* 470 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */   
/*     */   public String getDxbxac() {
/* 474 */     return this.dxbxac;
/*     */   }
/*     */   
/*     */   public void setDxbxac(String dxbxac) {
/* 478 */     this.dxbxac = dxbxac;
/*     */   }
/*     */   
/*     */   public String getDxbxem() {
/* 482 */     return this.dxbxem;
/*     */   }
/*     */   
/*     */   public void setDxbxem(String dxbxem) {
/* 486 */     this.dxbxem = dxbxem;
/*     */   }
/*     */   
/*     */   public String getDxbxn() {
/* 490 */     return this.dxbxn;
/*     */   }
/*     */   
/*     */   public void setDxbxn(String dxbxn) {
/* 494 */     this.dxbxn = dxbxn;
/*     */   }
/*     */   
/*     */   public String getDxrsn() {
/* 498 */     return this.dxrsn;
/*     */   }
/*     */   
/*     */   public void setDxrsn(String dxrsn) {
/* 502 */     this.dxrsn = dxrsn;
/*     */   }
/*     */   
/*     */   public String getDxtrnxcd() {
/* 506 */     return this.dxtrnxcd;
/*     */   }
/*     */   
/*     */   public void setDxtrnxcd(String dxtrnxcd) {
/* 510 */     this.dxtrnxcd = dxtrnxcd;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Dxtrnsxdtls.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */