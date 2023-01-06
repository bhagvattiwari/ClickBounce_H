/*     */ package com.seeinfobiz.click.entitybean;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.math.BigDecimal;
/*     */ import java.util.Date;
/*     */ import java.util.HashSet;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Dxtelomxsmry
/*     */   implements Serializable
/*     */ {
/*     */   private BigDecimal ixsmryxtelom;
/*     */   private Dxtrnsxsmryxm dxtrnsxsmryxm;
/*     */   private String nmxacnt;
/*     */   private String chrsxtmexone;
/*     */   private String chrgsxmnhly;
/*     */   private String chrsxus;
/*     */   private String chrgsxms;
/*     */   private String chrgsxcallxconfrnc;
/*     */   private String chrgsxromng;
/*     */   private String chrsxothxdscnts;
/*     */   private String chrsxcrdtxmisc;
/*     */   private String tx;
/*     */   private String balxprv;
/*     */   private String pyt;
/*     */   private String adjstxs;
/*     */   private String chrgsxtot;
/*     */   private String onxduxamt;
/*     */   private String dxduxaftrxduxamt;
/*     */   private Date dxdu;
/*     */   private String noxmbl;
/*     */   private String plnxtlk;
/*     */   private String lmtxcrdtxdynmc;
/*     */   private String rtsxplsexlcl;
/*     */   private String rtsxclxot;
/*     */   private String rtsxsmsxot;
/*     */   private String rtsxlcl;
/*     */   private String rtsxstd;
/*     */   private String rtsxisd;
/*     */   private String rtsxsms;
/*     */   private String frncyxblngs;
/*     */   private String crncyxblngs;
/*     */   private String noxinvce;
/*     */   private String chrgsxrecrng;
/*     */   private String dsxc;
/*     */   private Date dxinvce;
/*     */   private String dsxcxchrg;
/*     */   private Date dxtrns;
/*     */   private String chrxs;
/*     */   private String rvrsls;
/*     */   private String chrgsxnet;
/*     */   private String qty;
/*     */   private String rts;
/*     */   private String atxtot;
/*     */   private Date dxadjxst;
/*     */   private String itxm;
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
/*  85 */   private Set<Dxtelcomxdtls> dxtelcomxdtlses = new HashSet<Dxtelcomxdtls>(0);
/*     */ 
/*     */   
/*     */   public Dxtelomxsmry() {}
/*     */ 
/*     */   
/*     */   public Dxtelomxsmry(BigDecimal ixsmryxtelom) {
/*  92 */     this.ixsmryxtelom = ixsmryxtelom;
/*     */   }
/*     */   public Dxtelomxsmry(BigDecimal ixsmryxtelom, Dxtrnsxsmryxm dxtrnsxsmryxm, String nmxacnt, String chrsxtmexone, String chrgsxmnhly, String chrsxus, String chrgsxms, String chrgsxcallxconfrnc, String chrgsxromng, String chrsxothxdscnts, String chrsxcrdtxmisc, String tx, String balxprv, String pyt, String adjstxs, String chrgsxtot, String onxduxamt, String dxduxaftrxduxamt, Date dxdu, String noxmbl, String plnxtlk, String lmtxcrdtxdynmc, String rtsxplsexlcl, String rtsxclxot, String rtsxsmsxot, String rtsxlcl, String rtsxstd, String rtsxisd, String rtsxsms, String frncyxblngs, String crncyxblngs, String noxinvce, String chrgsxrecrng, String dsxc, Date dxinvce, String dsxcxchrg, Date dxtrns, String chrxs, String rvrsls, String chrgsxnet, String qty, String rts, String atxtot, Date dxadjxst, String itxm, String fldx1, String fldx2, String fldx3, String fldx4, String fldx5, String fldx6, String fldx7, String fldx8, String fldx9, String fldx10, String fldx11, String fldx12, String fldx13, String fldx14, String fldx15, String fldx16, String fldx17, String fldx18, String fldx19, String fldx20, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst, Set<Dxtelcomxdtls> dxtelcomxdtlses) {
/*  95 */     this.ixsmryxtelom = ixsmryxtelom;
/*  96 */     this.dxtrnsxsmryxm = dxtrnsxsmryxm;
/*  97 */     this.nmxacnt = nmxacnt;
/*  98 */     this.chrsxtmexone = chrsxtmexone;
/*  99 */     this.chrgsxmnhly = chrgsxmnhly;
/* 100 */     this.chrsxus = chrsxus;
/* 101 */     this.chrgsxms = chrgsxms;
/* 102 */     this.chrgsxcallxconfrnc = chrgsxcallxconfrnc;
/* 103 */     this.chrgsxromng = chrgsxromng;
/* 104 */     this.chrsxothxdscnts = chrsxothxdscnts;
/* 105 */     this.chrsxcrdtxmisc = chrsxcrdtxmisc;
/* 106 */     this.tx = tx;
/* 107 */     this.balxprv = balxprv;
/* 108 */     this.pyt = pyt;
/* 109 */     this.adjstxs = adjstxs;
/* 110 */     this.chrgsxtot = chrgsxtot;
/* 111 */     this.onxduxamt = onxduxamt;
/* 112 */     this.dxduxaftrxduxamt = dxduxaftrxduxamt;
/* 113 */     this.dxdu = dxdu;
/* 114 */     this.noxmbl = noxmbl;
/* 115 */     this.plnxtlk = plnxtlk;
/* 116 */     this.lmtxcrdtxdynmc = lmtxcrdtxdynmc;
/* 117 */     this.rtsxplsexlcl = rtsxplsexlcl;
/* 118 */     this.rtsxclxot = rtsxclxot;
/* 119 */     this.rtsxsmsxot = rtsxsmsxot;
/* 120 */     this.rtsxlcl = rtsxlcl;
/* 121 */     this.rtsxstd = rtsxstd;
/* 122 */     this.rtsxisd = rtsxisd;
/* 123 */     this.rtsxsms = rtsxsms;
/* 124 */     this.frncyxblngs = frncyxblngs;
/* 125 */     this.crncyxblngs = crncyxblngs;
/* 126 */     this.noxinvce = noxinvce;
/* 127 */     this.chrgsxrecrng = chrgsxrecrng;
/* 128 */     this.dsxc = dsxc;
/* 129 */     this.dxinvce = dxinvce;
/* 130 */     this.dsxcxchrg = dsxcxchrg;
/* 131 */     this.dxtrns = dxtrns;
/* 132 */     this.chrxs = chrxs;
/* 133 */     this.rvrsls = rvrsls;
/* 134 */     this.chrgsxnet = chrgsxnet;
/* 135 */     this.qty = qty;
/* 136 */     this.rts = rts;
/* 137 */     this.atxtot = atxtot;
/* 138 */     this.dxadjxst = dxadjxst;
/* 139 */     this.itxm = itxm;
/* 140 */     this.fldx1 = fldx1;
/* 141 */     this.fldx2 = fldx2;
/* 142 */     this.fldx3 = fldx3;
/* 143 */     this.fldx4 = fldx4;
/* 144 */     this.fldx5 = fldx5;
/* 145 */     this.fldx6 = fldx6;
/* 146 */     this.fldx7 = fldx7;
/* 147 */     this.fldx8 = fldx8;
/* 148 */     this.fldx9 = fldx9;
/* 149 */     this.fldx10 = fldx10;
/* 150 */     this.fldx11 = fldx11;
/* 151 */     this.fldx12 = fldx12;
/* 152 */     this.fldx13 = fldx13;
/* 153 */     this.fldx14 = fldx14;
/* 154 */     this.fldx15 = fldx15;
/* 155 */     this.fldx16 = fldx16;
/* 156 */     this.fldx17 = fldx17;
/* 157 */     this.fldx18 = fldx18;
/* 158 */     this.fldx19 = fldx19;
/* 159 */     this.fldx20 = fldx20;
/* 160 */     this.dxctd = dxctd;
/* 161 */     this.bxctd = bxctd;
/* 162 */     this.dxmfdxlst = dxmfdxlst;
/* 163 */     this.bxmfdxlst = bxmfdxlst;
/* 164 */     this.dxtelcomxdtlses = dxtelcomxdtlses;
/*     */   }
/*     */   
/*     */   public BigDecimal getIxsmryxtelom() {
/* 168 */     return this.ixsmryxtelom;
/*     */   }
/*     */   
/*     */   public void setIxsmryxtelom(BigDecimal ixsmryxtelom) {
/* 172 */     this.ixsmryxtelom = ixsmryxtelom;
/*     */   }
/*     */   public Dxtrnsxsmryxm getDxtrnsxsmryxm() {
/* 175 */     return this.dxtrnsxsmryxm;
/*     */   }
/*     */   
/*     */   public void setDxtrnsxsmryxm(Dxtrnsxsmryxm dxtrnsxsmryxm) {
/* 179 */     this.dxtrnsxsmryxm = dxtrnsxsmryxm;
/*     */   }
/*     */   public String getNmxacnt() {
/* 182 */     return this.nmxacnt;
/*     */   }
/*     */   
/*     */   public void setNmxacnt(String nmxacnt) {
/* 186 */     this.nmxacnt = nmxacnt;
/*     */   }
/*     */   public String getChrsxtmexone() {
/* 189 */     return this.chrsxtmexone;
/*     */   }
/*     */   
/*     */   public void setChrsxtmexone(String chrsxtmexone) {
/* 193 */     this.chrsxtmexone = chrsxtmexone;
/*     */   }
/*     */   public String getChrgsxmnhly() {
/* 196 */     return this.chrgsxmnhly;
/*     */   }
/*     */   
/*     */   public void setChrgsxmnhly(String chrgsxmnhly) {
/* 200 */     this.chrgsxmnhly = chrgsxmnhly;
/*     */   }
/*     */   public String getChrsxus() {
/* 203 */     return this.chrsxus;
/*     */   }
/*     */   
/*     */   public void setChrsxus(String chrsxus) {
/* 207 */     this.chrsxus = chrsxus;
/*     */   }
/*     */   public String getChrgsxms() {
/* 210 */     return this.chrgsxms;
/*     */   }
/*     */   
/*     */   public void setChrgsxms(String chrgsxms) {
/* 214 */     this.chrgsxms = chrgsxms;
/*     */   }
/*     */   public String getChrgsxcallxconfrnc() {
/* 217 */     return this.chrgsxcallxconfrnc;
/*     */   }
/*     */   
/*     */   public void setChrgsxcallxconfrnc(String chrgsxcallxconfrnc) {
/* 221 */     this.chrgsxcallxconfrnc = chrgsxcallxconfrnc;
/*     */   }
/*     */   public String getChrgsxromng() {
/* 224 */     return this.chrgsxromng;
/*     */   }
/*     */   
/*     */   public void setChrgsxromng(String chrgsxromng) {
/* 228 */     this.chrgsxromng = chrgsxromng;
/*     */   }
/*     */   public String getChrsxothxdscnts() {
/* 231 */     return this.chrsxothxdscnts;
/*     */   }
/*     */   
/*     */   public void setChrsxothxdscnts(String chrsxothxdscnts) {
/* 235 */     this.chrsxothxdscnts = chrsxothxdscnts;
/*     */   }
/*     */   public String getChrsxcrdtxmisc() {
/* 238 */     return this.chrsxcrdtxmisc;
/*     */   }
/*     */   
/*     */   public void setChrsxcrdtxmisc(String chrsxcrdtxmisc) {
/* 242 */     this.chrsxcrdtxmisc = chrsxcrdtxmisc;
/*     */   }
/*     */   public String getTx() {
/* 245 */     return this.tx;
/*     */   }
/*     */   
/*     */   public void setTx(String tx) {
/* 249 */     this.tx = tx;
/*     */   }
/*     */   public String getBalxprv() {
/* 252 */     return this.balxprv;
/*     */   }
/*     */   
/*     */   public void setBalxprv(String balxprv) {
/* 256 */     this.balxprv = balxprv;
/*     */   }
/*     */   public String getPyt() {
/* 259 */     return this.pyt;
/*     */   }
/*     */   
/*     */   public void setPyt(String pyt) {
/* 263 */     this.pyt = pyt;
/*     */   }
/*     */   public String getAdjstxs() {
/* 266 */     return this.adjstxs;
/*     */   }
/*     */   
/*     */   public void setAdjstxs(String adjstxs) {
/* 270 */     this.adjstxs = adjstxs;
/*     */   }
/*     */   public String getChrgsxtot() {
/* 273 */     return this.chrgsxtot;
/*     */   }
/*     */   
/*     */   public void setChrgsxtot(String chrgsxtot) {
/* 277 */     this.chrgsxtot = chrgsxtot;
/*     */   }
/*     */   public String getOnxduxamt() {
/* 280 */     return this.onxduxamt;
/*     */   }
/*     */   
/*     */   public void setOnxduxamt(String onxduxamt) {
/* 284 */     this.onxduxamt = onxduxamt;
/*     */   }
/*     */   public String getDxduxaftrxduxamt() {
/* 287 */     return this.dxduxaftrxduxamt;
/*     */   }
/*     */   
/*     */   public void setDxduxaftrxduxamt(String dxduxaftrxduxamt) {
/* 291 */     this.dxduxaftrxduxamt = dxduxaftrxduxamt;
/*     */   }
/*     */   public Date getDxdu() {
/* 294 */     return this.dxdu;
/*     */   }
/*     */   
/*     */   public void setDxdu(Date dxdu) {
/* 298 */     this.dxdu = dxdu;
/*     */   }
/*     */   public String getNoxmbl() {
/* 301 */     return this.noxmbl;
/*     */   }
/*     */   
/*     */   public void setNoxmbl(String noxmbl) {
/* 305 */     this.noxmbl = noxmbl;
/*     */   }
/*     */   public String getPlnxtlk() {
/* 308 */     return this.plnxtlk;
/*     */   }
/*     */   
/*     */   public void setPlnxtlk(String plnxtlk) {
/* 312 */     this.plnxtlk = plnxtlk;
/*     */   }
/*     */   public String getLmtxcrdtxdynmc() {
/* 315 */     return this.lmtxcrdtxdynmc;
/*     */   }
/*     */   
/*     */   public void setLmtxcrdtxdynmc(String lmtxcrdtxdynmc) {
/* 319 */     this.lmtxcrdtxdynmc = lmtxcrdtxdynmc;
/*     */   }
/*     */   public String getRtsxplsexlcl() {
/* 322 */     return this.rtsxplsexlcl;
/*     */   }
/*     */   
/*     */   public void setRtsxplsexlcl(String rtsxplsexlcl) {
/* 326 */     this.rtsxplsexlcl = rtsxplsexlcl;
/*     */   }
/*     */   public String getRtsxclxot() {
/* 329 */     return this.rtsxclxot;
/*     */   }
/*     */   
/*     */   public void setRtsxclxot(String rtsxclxot) {
/* 333 */     this.rtsxclxot = rtsxclxot;
/*     */   }
/*     */   public String getRtsxsmsxot() {
/* 336 */     return this.rtsxsmsxot;
/*     */   }
/*     */   
/*     */   public void setRtsxsmsxot(String rtsxsmsxot) {
/* 340 */     this.rtsxsmsxot = rtsxsmsxot;
/*     */   }
/*     */   public String getRtsxlcl() {
/* 343 */     return this.rtsxlcl;
/*     */   }
/*     */   
/*     */   public void setRtsxlcl(String rtsxlcl) {
/* 347 */     this.rtsxlcl = rtsxlcl;
/*     */   }
/*     */   public String getRtsxstd() {
/* 350 */     return this.rtsxstd;
/*     */   }
/*     */   
/*     */   public void setRtsxstd(String rtsxstd) {
/* 354 */     this.rtsxstd = rtsxstd;
/*     */   }
/*     */   public String getRtsxisd() {
/* 357 */     return this.rtsxisd;
/*     */   }
/*     */   
/*     */   public void setRtsxisd(String rtsxisd) {
/* 361 */     this.rtsxisd = rtsxisd;
/*     */   }
/*     */   public String getRtsxsms() {
/* 364 */     return this.rtsxsms;
/*     */   }
/*     */   
/*     */   public void setRtsxsms(String rtsxsms) {
/* 368 */     this.rtsxsms = rtsxsms;
/*     */   }
/*     */   public String getFrncyxblngs() {
/* 371 */     return this.frncyxblngs;
/*     */   }
/*     */   
/*     */   public void setFrncyxblngs(String frncyxblngs) {
/* 375 */     this.frncyxblngs = frncyxblngs;
/*     */   }
/*     */   public String getCrncyxblngs() {
/* 378 */     return this.crncyxblngs;
/*     */   }
/*     */   
/*     */   public void setCrncyxblngs(String crncyxblngs) {
/* 382 */     this.crncyxblngs = crncyxblngs;
/*     */   }
/*     */   public String getNoxinvce() {
/* 385 */     return this.noxinvce;
/*     */   }
/*     */   
/*     */   public void setNoxinvce(String noxinvce) {
/* 389 */     this.noxinvce = noxinvce;
/*     */   }
/*     */   public String getChrgsxrecrng() {
/* 392 */     return this.chrgsxrecrng;
/*     */   }
/*     */   
/*     */   public void setChrgsxrecrng(String chrgsxrecrng) {
/* 396 */     this.chrgsxrecrng = chrgsxrecrng;
/*     */   }
/*     */   public String getDsxc() {
/* 399 */     return this.dsxc;
/*     */   }
/*     */   
/*     */   public void setDsxc(String dsxc) {
/* 403 */     this.dsxc = dsxc;
/*     */   }
/*     */   public Date getDxinvce() {
/* 406 */     return this.dxinvce;
/*     */   }
/*     */   
/*     */   public void setDxinvce(Date dxinvce) {
/* 410 */     this.dxinvce = dxinvce;
/*     */   }
/*     */   public String getDsxcxchrg() {
/* 413 */     return this.dsxcxchrg;
/*     */   }
/*     */   
/*     */   public void setDsxcxchrg(String dsxcxchrg) {
/* 417 */     this.dsxcxchrg = dsxcxchrg;
/*     */   }
/*     */   public Date getDxtrns() {
/* 420 */     return this.dxtrns;
/*     */   }
/*     */   
/*     */   public void setDxtrns(Date dxtrns) {
/* 424 */     this.dxtrns = dxtrns;
/*     */   }
/*     */   public String getChrxs() {
/* 427 */     return this.chrxs;
/*     */   }
/*     */   
/*     */   public void setChrxs(String chrxs) {
/* 431 */     this.chrxs = chrxs;
/*     */   }
/*     */   public String getRvrsls() {
/* 434 */     return this.rvrsls;
/*     */   }
/*     */   
/*     */   public void setRvrsls(String rvrsls) {
/* 438 */     this.rvrsls = rvrsls;
/*     */   }
/*     */   public String getChrgsxnet() {
/* 441 */     return this.chrgsxnet;
/*     */   }
/*     */   
/*     */   public void setChrgsxnet(String chrgsxnet) {
/* 445 */     this.chrgsxnet = chrgsxnet;
/*     */   }
/*     */   public String getQty() {
/* 448 */     return this.qty;
/*     */   }
/*     */   
/*     */   public void setQty(String qty) {
/* 452 */     this.qty = qty;
/*     */   }
/*     */   public String getRts() {
/* 455 */     return this.rts;
/*     */   }
/*     */   
/*     */   public void setRts(String rts) {
/* 459 */     this.rts = rts;
/*     */   }
/*     */   public String getAtxtot() {
/* 462 */     return this.atxtot;
/*     */   }
/*     */   
/*     */   public void setAtxtot(String atxtot) {
/* 466 */     this.atxtot = atxtot;
/*     */   }
/*     */   public Date getDxadjxst() {
/* 469 */     return this.dxadjxst;
/*     */   }
/*     */   
/*     */   public void setDxadjxst(Date dxadjxst) {
/* 473 */     this.dxadjxst = dxadjxst;
/*     */   }
/*     */   public String getItxm() {
/* 476 */     return this.itxm;
/*     */   }
/*     */   
/*     */   public void setItxm(String itxm) {
/* 480 */     this.itxm = itxm;
/*     */   }
/*     */   public String getFldx1() {
/* 483 */     return this.fldx1;
/*     */   }
/*     */   
/*     */   public void setFldx1(String fldx1) {
/* 487 */     this.fldx1 = fldx1;
/*     */   }
/*     */   public String getFldx2() {
/* 490 */     return this.fldx2;
/*     */   }
/*     */   
/*     */   public void setFldx2(String fldx2) {
/* 494 */     this.fldx2 = fldx2;
/*     */   }
/*     */   public String getFldx3() {
/* 497 */     return this.fldx3;
/*     */   }
/*     */   
/*     */   public void setFldx3(String fldx3) {
/* 501 */     this.fldx3 = fldx3;
/*     */   }
/*     */   public String getFldx4() {
/* 504 */     return this.fldx4;
/*     */   }
/*     */   
/*     */   public void setFldx4(String fldx4) {
/* 508 */     this.fldx4 = fldx4;
/*     */   }
/*     */   public String getFldx5() {
/* 511 */     return this.fldx5;
/*     */   }
/*     */   
/*     */   public void setFldx5(String fldx5) {
/* 515 */     this.fldx5 = fldx5;
/*     */   }
/*     */   public String getFldx6() {
/* 518 */     return this.fldx6;
/*     */   }
/*     */   
/*     */   public void setFldx6(String fldx6) {
/* 522 */     this.fldx6 = fldx6;
/*     */   }
/*     */   public String getFldx7() {
/* 525 */     return this.fldx7;
/*     */   }
/*     */   
/*     */   public void setFldx7(String fldx7) {
/* 529 */     this.fldx7 = fldx7;
/*     */   }
/*     */   public String getFldx8() {
/* 532 */     return this.fldx8;
/*     */   }
/*     */   
/*     */   public void setFldx8(String fldx8) {
/* 536 */     this.fldx8 = fldx8;
/*     */   }
/*     */   public String getFldx9() {
/* 539 */     return this.fldx9;
/*     */   }
/*     */   
/*     */   public void setFldx9(String fldx9) {
/* 543 */     this.fldx9 = fldx9;
/*     */   }
/*     */   public String getFldx10() {
/* 546 */     return this.fldx10;
/*     */   }
/*     */   
/*     */   public void setFldx10(String fldx10) {
/* 550 */     this.fldx10 = fldx10;
/*     */   }
/*     */   public String getFldx11() {
/* 553 */     return this.fldx11;
/*     */   }
/*     */   
/*     */   public void setFldx11(String fldx11) {
/* 557 */     this.fldx11 = fldx11;
/*     */   }
/*     */   public String getFldx12() {
/* 560 */     return this.fldx12;
/*     */   }
/*     */   
/*     */   public void setFldx12(String fldx12) {
/* 564 */     this.fldx12 = fldx12;
/*     */   }
/*     */   public String getFldx13() {
/* 567 */     return this.fldx13;
/*     */   }
/*     */   
/*     */   public void setFldx13(String fldx13) {
/* 571 */     this.fldx13 = fldx13;
/*     */   }
/*     */   public String getFldx14() {
/* 574 */     return this.fldx14;
/*     */   }
/*     */   
/*     */   public void setFldx14(String fldx14) {
/* 578 */     this.fldx14 = fldx14;
/*     */   }
/*     */   public String getFldx15() {
/* 581 */     return this.fldx15;
/*     */   }
/*     */   
/*     */   public void setFldx15(String fldx15) {
/* 585 */     this.fldx15 = fldx15;
/*     */   }
/*     */   public String getFldx16() {
/* 588 */     return this.fldx16;
/*     */   }
/*     */   
/*     */   public void setFldx16(String fldx16) {
/* 592 */     this.fldx16 = fldx16;
/*     */   }
/*     */   public String getFldx17() {
/* 595 */     return this.fldx17;
/*     */   }
/*     */   
/*     */   public void setFldx17(String fldx17) {
/* 599 */     this.fldx17 = fldx17;
/*     */   }
/*     */   public String getFldx18() {
/* 602 */     return this.fldx18;
/*     */   }
/*     */   
/*     */   public void setFldx18(String fldx18) {
/* 606 */     this.fldx18 = fldx18;
/*     */   }
/*     */   public String getFldx19() {
/* 609 */     return this.fldx19;
/*     */   }
/*     */   
/*     */   public void setFldx19(String fldx19) {
/* 613 */     this.fldx19 = fldx19;
/*     */   }
/*     */   public String getFldx20() {
/* 616 */     return this.fldx20;
/*     */   }
/*     */   
/*     */   public void setFldx20(String fldx20) {
/* 620 */     this.fldx20 = fldx20;
/*     */   }
/*     */   public Date getDxctd() {
/* 623 */     return this.dxctd;
/*     */   }
/*     */   
/*     */   public void setDxctd(Date dxctd) {
/* 627 */     this.dxctd = dxctd;
/*     */   }
/*     */   public String getBxctd() {
/* 630 */     return this.bxctd;
/*     */   }
/*     */   
/*     */   public void setBxctd(String bxctd) {
/* 634 */     this.bxctd = bxctd;
/*     */   }
/*     */   public Date getDxmfdxlst() {
/* 637 */     return this.dxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setDxmfdxlst(Date dxmfdxlst) {
/* 641 */     this.dxmfdxlst = dxmfdxlst;
/*     */   }
/*     */   public String getBxmfdxlst() {
/* 644 */     return this.bxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setBxmfdxlst(String bxmfdxlst) {
/* 648 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */   public Set<Dxtelcomxdtls> getDxtelcomxdtlses() {
/* 651 */     return this.dxtelcomxdtlses;
/*     */   }
/*     */   
/*     */   public void setDxtelcomxdtlses(Set<Dxtelcomxdtls> dxtelcomxdtlses) {
/* 655 */     this.dxtelcomxdtlses = dxtelcomxdtlses;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Dxtelomxsmry.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */