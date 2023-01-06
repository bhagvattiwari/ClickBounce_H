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
/*     */ public class Dxcstmrxdtls
/*     */   implements Serializable
/*     */ {
/*     */   private Long ixdtlsxcst;
/*     */   private Dxcstmrxm dxcstmrxm;
/*     */   private Long noxacnt;
/*     */   private String drs1xa;
/*     */   private String drs2xa;
/*     */   private String drs3xa;
/*     */   private String nmxcty;
/*     */   private String nmxst;
/*     */   private String cntry;
/*     */   private String cdexzp;
/*     */   private String ixem;
/*     */   private String ixemxalt;
/*     */   private String noxfx;
/*     */   private String noxcntct;
/*     */   private String noxmbl;
/*     */   private String flxsttsxadrs;
/*     */   private Date dxfrmxads;
/*     */   private Date dxtoxads;
/*     */   private String flxfrncy;
/*     */   private Long flxchnlxdlvy;
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
/*     */   private String axcdexbr;
/*     */   private String axnmxbr;
/*     */   private String acntxtyp;
/*     */   private String schmxtyp;
/*     */   private Long ixstmt;
/*     */   private Date dxstmt;
/*     */   private Long ixprdt;
/*     */   private Long ixprcs;
/*     */   private Date stxstxdt;
/*     */   private Date stxenxdt;
/*     */   private String ovrxdu;
/*     */   private String uxclrxbl;
/*     */   private String ixrt;
/*     */   private Date matxdt;
/*     */   private String psxdu;
/*     */   private String totxcrdt;
/*     */   private String minxpayxd;
/*     */   private Date pyxduxdt;
/*     */   private String rwrdxopxbl;
/*     */   private String rwrdxernd;
/*     */   private String rwrdxred;
/*     */   private String rwrdxclsnxbl;
/*     */   private String cdrxnmbr;
/*     */   private String ixserty;
/*     */   private String qtxrec;
/*     */   private String qtxdel;
/*     */   private String blxdt;
/*     */   private String prexexstxcndtn;
/*     */   private String exstxsnce;
/*     */   private String nomnxnm;
/*     */   private String frstxplcyxcmmncxdt;
/*     */   private String srvcxtaxxcde;
/*     */   private String srvcxtaxxrgstrtn;
/*     */   private String aplctnxno;
/*     */   private String unvrsty;
/*     */   private String corse;
/*     */   private String unvrstyxadrs;
/*     */   private String unvrstyxst;
/*     */   private String unvrstyxcntry;
/*     */   private String typxofxtrip;
/*     */   private String polcyxpriod;
/*     */   private String geoxscope;
/*     */   private String dlvryxchnel;
/*     */   private String sponsorxdob;
/*     */   private String noxofxlives;
/*     */   private String fmlyxdfntn;
/*     */   private String typxcrd;
/*     */   private String cshxlmt;
/*     */   private String ovrdrftxamt;
/*     */   private String opnxdt;
/*     */   private String strctxfldr;
/*     */   private String cdexreg;
/*     */   
/*     */   public Dxcstmrxdtls() {}
/*     */   
/*     */   public String getCdexreg() {
/* 115 */     return this.cdexreg;
/*     */   }
/*     */   
/*     */   public void setCdexreg(String cdexreg) {
/* 119 */     this.cdexreg = cdexreg;
/*     */   }
/*     */ 
/*     */   
/*     */   public Dxcstmrxdtls(Long ixdtlsxcst) {
/* 124 */     this.ixdtlsxcst = ixdtlsxcst;
/*     */   }
/*     */   public Dxcstmrxdtls(Long ixdtlsxcst, Dxcstmrxm dxcstmrxm, Long noxacnt, String drs1xa, String drs2xa, String drs3xa, String nmxcty, String nmxst, String cntry, String cdexzp, String ixem, String ixemxalt, String noxfx, String noxcntct, String noxmbl, String flxsttsxadrs, Date dxfrmxads, Date dxtoxads, String flxfrncy, Long flxchnlxdlvy, String fldx1, String fldx2, String fldx3, String fldx4, String fldx5, String fldx6, String fldx7, String fldx8, String fldx9, String fldx10, String fldx11, String fldx12, String fldx13, String fldx14, String fldx15, String fldx16, String fldx17, String fldx18, String fldx19, String fldx20, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst, String axcdexbr, String axnmxbr, String acntxtyp, String schmxtyp, Long ixstmt, Date dxstmt, Long ixprdt, Long ixprcs, Date stxstxdt, Date stxenxdt, String ovrxdu, String uxclrxbl, String ixrt, Date matxdt, String psxdu, String totxcrdt, String minxpayxd, Date pyxduxdt, String rwrdxopxbl, String rwrdxernd, String rwrdxred, String rwrdxclsnxbl, String cdrxnmbr, String ixserty, String qtxrec, String qtxdel, String blxdt, String prexexstxcndtn, String exstxsnce, String nomnxnm, String frstxplcyxcmmncxdt, String srvcxtaxxcde, String srvcxtaxxrgstrtn, String aplctnxno, String unvrsty, String corse, String unvrstyxadrs, String unvrstyxst, String unvrstyxcntry, String typxofxtrip, String polcyxpriod, String geoxscope, String dlvryxchnel, String sponsorxdob, String noxofxlives, String fmlyxdfntn, String typxcrd, String cshxlmt, String ovrdrftxamt, String opnxdt, String strctxfldr) {
/* 127 */     this.ixdtlsxcst = ixdtlsxcst;
/* 128 */     this.dxcstmrxm = dxcstmrxm;
/* 129 */     this.noxacnt = noxacnt;
/* 130 */     this.drs1xa = drs1xa;
/* 131 */     this.drs2xa = drs2xa;
/* 132 */     this.drs3xa = drs3xa;
/* 133 */     this.nmxcty = nmxcty;
/* 134 */     this.nmxst = nmxst;
/* 135 */     this.cntry = cntry;
/* 136 */     this.cdexzp = cdexzp;
/* 137 */     this.ixem = ixem;
/* 138 */     this.ixemxalt = ixemxalt;
/* 139 */     this.noxfx = noxfx;
/* 140 */     this.noxcntct = noxcntct;
/* 141 */     this.noxmbl = noxmbl;
/* 142 */     this.flxsttsxadrs = flxsttsxadrs;
/* 143 */     this.dxfrmxads = dxfrmxads;
/* 144 */     this.dxtoxads = dxtoxads;
/* 145 */     this.flxfrncy = flxfrncy;
/* 146 */     this.flxchnlxdlvy = flxchnlxdlvy;
/* 147 */     this.fldx1 = fldx1;
/* 148 */     this.fldx2 = fldx2;
/* 149 */     this.fldx3 = fldx3;
/* 150 */     this.fldx4 = fldx4;
/* 151 */     this.fldx5 = fldx5;
/* 152 */     this.fldx6 = fldx6;
/* 153 */     this.fldx7 = fldx7;
/* 154 */     this.fldx8 = fldx8;
/* 155 */     this.fldx9 = fldx9;
/* 156 */     this.fldx10 = fldx10;
/* 157 */     this.fldx11 = fldx11;
/* 158 */     this.fldx12 = fldx12;
/* 159 */     this.fldx13 = fldx13;
/* 160 */     this.fldx14 = fldx14;
/* 161 */     this.fldx15 = fldx15;
/* 162 */     this.fldx16 = fldx16;
/* 163 */     this.fldx17 = fldx17;
/* 164 */     this.fldx18 = fldx18;
/* 165 */     this.fldx19 = fldx19;
/* 166 */     this.fldx20 = fldx20;
/* 167 */     this.dxctd = dxctd;
/* 168 */     this.bxctd = bxctd;
/* 169 */     this.dxmfdxlst = dxmfdxlst;
/* 170 */     this.bxmfdxlst = bxmfdxlst;
/* 171 */     this.axcdexbr = axcdexbr;
/* 172 */     this.axnmxbr = axnmxbr;
/* 173 */     this.acntxtyp = acntxtyp;
/* 174 */     this.schmxtyp = schmxtyp;
/* 175 */     this.ixstmt = ixstmt;
/* 176 */     this.dxstmt = dxstmt;
/* 177 */     this.ixprdt = ixprdt;
/* 178 */     this.ixprcs = ixprcs;
/* 179 */     this.stxstxdt = stxstxdt;
/* 180 */     this.stxenxdt = stxenxdt;
/* 181 */     this.ovrxdu = ovrxdu;
/* 182 */     this.uxclrxbl = uxclrxbl;
/* 183 */     this.ixrt = ixrt;
/* 184 */     this.matxdt = matxdt;
/* 185 */     this.psxdu = psxdu;
/* 186 */     this.totxcrdt = totxcrdt;
/* 187 */     this.minxpayxd = minxpayxd;
/* 188 */     this.pyxduxdt = pyxduxdt;
/* 189 */     this.rwrdxopxbl = rwrdxopxbl;
/* 190 */     this.rwrdxernd = rwrdxernd;
/* 191 */     this.rwrdxred = rwrdxred;
/* 192 */     this.rwrdxclsnxbl = rwrdxclsnxbl;
/* 193 */     this.cdrxnmbr = cdrxnmbr;
/* 194 */     this.ixserty = ixserty;
/* 195 */     this.qtxrec = qtxrec;
/* 196 */     this.qtxdel = qtxdel;
/* 197 */     this.blxdt = blxdt;
/* 198 */     this.prexexstxcndtn = prexexstxcndtn;
/* 199 */     this.exstxsnce = exstxsnce;
/* 200 */     this.nomnxnm = nomnxnm;
/* 201 */     this.frstxplcyxcmmncxdt = frstxplcyxcmmncxdt;
/* 202 */     this.srvcxtaxxcde = srvcxtaxxcde;
/* 203 */     this.srvcxtaxxrgstrtn = srvcxtaxxrgstrtn;
/* 204 */     this.aplctnxno = aplctnxno;
/* 205 */     this.unvrsty = unvrsty;
/* 206 */     this.corse = corse;
/* 207 */     this.unvrstyxadrs = unvrstyxadrs;
/* 208 */     this.unvrstyxst = unvrstyxst;
/* 209 */     this.unvrstyxcntry = unvrstyxcntry;
/* 210 */     this.typxofxtrip = typxofxtrip;
/* 211 */     this.polcyxpriod = polcyxpriod;
/* 212 */     this.geoxscope = geoxscope;
/* 213 */     this.dlvryxchnel = dlvryxchnel;
/* 214 */     this.sponsorxdob = sponsorxdob;
/* 215 */     this.noxofxlives = noxofxlives;
/* 216 */     this.fmlyxdfntn = fmlyxdfntn;
/* 217 */     this.typxcrd = typxcrd;
/* 218 */     this.cshxlmt = cshxlmt;
/* 219 */     this.ovrdrftxamt = ovrdrftxamt;
/* 220 */     this.opnxdt = opnxdt;
/* 221 */     this.strctxfldr = strctxfldr;
/*     */   }
/*     */   
/*     */   public Long getIxdtlsxcst() {
/* 225 */     return this.ixdtlsxcst;
/*     */   }
/*     */   
/*     */   public void setIxdtlsxcst(Long ixdtlsxcst) {
/* 229 */     this.ixdtlsxcst = ixdtlsxcst;
/*     */   }
/*     */   
/*     */   public Dxcstmrxm getDxcstmrxm() {
/* 233 */     return this.dxcstmrxm;
/*     */   }
/*     */   
/*     */   public void setDxcstmrxm(Dxcstmrxm dxcstmrxm) {
/* 237 */     this.dxcstmrxm = dxcstmrxm;
/*     */   }
/*     */   
/*     */   public Long getNoxacnt() {
/* 241 */     return this.noxacnt;
/*     */   }
/*     */   
/*     */   public void setNoxacnt(Long noxacnt) {
/* 245 */     this.noxacnt = noxacnt;
/*     */   }
/*     */   public String getDrs1xa() {
/* 248 */     return this.drs1xa;
/*     */   }
/*     */   
/*     */   public void setDrs1xa(String drs1xa) {
/* 252 */     this.drs1xa = drs1xa;
/*     */   }
/*     */   public String getDrs2xa() {
/* 255 */     return this.drs2xa;
/*     */   }
/*     */   
/*     */   public void setDrs2xa(String drs2xa) {
/* 259 */     this.drs2xa = drs2xa;
/*     */   }
/*     */   public String getDrs3xa() {
/* 262 */     return this.drs3xa;
/*     */   }
/*     */   
/*     */   public void setDrs3xa(String drs3xa) {
/* 266 */     this.drs3xa = drs3xa;
/*     */   }
/*     */   public String getNmxcty() {
/* 269 */     return this.nmxcty;
/*     */   }
/*     */   
/*     */   public void setNmxcty(String nmxcty) {
/* 273 */     this.nmxcty = nmxcty;
/*     */   }
/*     */   public String getNmxst() {
/* 276 */     return this.nmxst;
/*     */   }
/*     */   
/*     */   public void setNmxst(String nmxst) {
/* 280 */     this.nmxst = nmxst;
/*     */   }
/*     */   public String getCntry() {
/* 283 */     return this.cntry;
/*     */   }
/*     */   
/*     */   public void setCntry(String cntry) {
/* 287 */     this.cntry = cntry;
/*     */   }
/*     */   public String getCdexzp() {
/* 290 */     return this.cdexzp;
/*     */   }
/*     */   
/*     */   public void setCdexzp(String cdexzp) {
/* 294 */     this.cdexzp = cdexzp;
/*     */   }
/*     */   public String getIxem() {
/* 297 */     return this.ixem;
/*     */   }
/*     */   
/*     */   public void setIxem(String ixem) {
/* 301 */     this.ixem = ixem;
/*     */   }
/*     */   public String getIxemxalt() {
/* 304 */     return this.ixemxalt;
/*     */   }
/*     */   
/*     */   public void setIxemxalt(String ixemxalt) {
/* 308 */     this.ixemxalt = ixemxalt;
/*     */   }
/*     */   public String getNoxfx() {
/* 311 */     return this.noxfx;
/*     */   }
/*     */   
/*     */   public void setNoxfx(String noxfx) {
/* 315 */     this.noxfx = noxfx;
/*     */   }
/*     */   public String getNoxcntct() {
/* 318 */     return this.noxcntct;
/*     */   }
/*     */   
/*     */   public void setNoxcntct(String noxcntct) {
/* 322 */     this.noxcntct = noxcntct;
/*     */   }
/*     */   public String getNoxmbl() {
/* 325 */     return this.noxmbl;
/*     */   }
/*     */   
/*     */   public void setNoxmbl(String noxmbl) {
/* 329 */     this.noxmbl = noxmbl;
/*     */   }
/*     */   public String getFlxsttsxadrs() {
/* 332 */     return this.flxsttsxadrs;
/*     */   }
/*     */   
/*     */   public void setFlxsttsxadrs(String flxsttsxadrs) {
/* 336 */     this.flxsttsxadrs = flxsttsxadrs;
/*     */   }
/*     */   public Date getDxfrmxads() {
/* 339 */     return this.dxfrmxads;
/*     */   }
/*     */   
/*     */   public void setDxfrmxads(Date dxfrmxads) {
/* 343 */     this.dxfrmxads = dxfrmxads;
/*     */   }
/*     */   public Date getDxtoxads() {
/* 346 */     return this.dxtoxads;
/*     */   }
/*     */   
/*     */   public void setDxtoxads(Date dxtoxads) {
/* 350 */     this.dxtoxads = dxtoxads;
/*     */   }
/*     */   public String getFlxfrncy() {
/* 353 */     return this.flxfrncy;
/*     */   }
/*     */   
/*     */   public void setFlxfrncy(String flxfrncy) {
/* 357 */     this.flxfrncy = flxfrncy;
/*     */   }
/*     */   public Long getFlxchnlxdlvy() {
/* 360 */     return this.flxchnlxdlvy;
/*     */   }
/*     */   
/*     */   public void setFlxchnlxdlvy(Long flxchnlxdlvy) {
/* 364 */     this.flxchnlxdlvy = flxchnlxdlvy;
/*     */   }
/*     */   public String getFldx1() {
/* 367 */     return this.fldx1;
/*     */   }
/*     */   
/*     */   public void setFldx1(String fldx1) {
/* 371 */     this.fldx1 = fldx1;
/*     */   }
/*     */   public String getFldx2() {
/* 374 */     return this.fldx2;
/*     */   }
/*     */   
/*     */   public void setFldx2(String fldx2) {
/* 378 */     this.fldx2 = fldx2;
/*     */   }
/*     */   public String getFldx3() {
/* 381 */     return this.fldx3;
/*     */   }
/*     */   
/*     */   public void setFldx3(String fldx3) {
/* 385 */     this.fldx3 = fldx3;
/*     */   }
/*     */   public String getFldx4() {
/* 388 */     return this.fldx4;
/*     */   }
/*     */   
/*     */   public void setFldx4(String fldx4) {
/* 392 */     this.fldx4 = fldx4;
/*     */   }
/*     */   public String getFldx5() {
/* 395 */     return this.fldx5;
/*     */   }
/*     */   
/*     */   public void setFldx5(String fldx5) {
/* 399 */     this.fldx5 = fldx5;
/*     */   }
/*     */   public String getFldx6() {
/* 402 */     return this.fldx6;
/*     */   }
/*     */   
/*     */   public void setFldx6(String fldx6) {
/* 406 */     this.fldx6 = fldx6;
/*     */   }
/*     */   public String getFldx7() {
/* 409 */     return this.fldx7;
/*     */   }
/*     */   
/*     */   public void setFldx7(String fldx7) {
/* 413 */     this.fldx7 = fldx7;
/*     */   }
/*     */   public String getFldx8() {
/* 416 */     return this.fldx8;
/*     */   }
/*     */   
/*     */   public void setFldx8(String fldx8) {
/* 420 */     this.fldx8 = fldx8;
/*     */   }
/*     */   public String getFldx9() {
/* 423 */     return this.fldx9;
/*     */   }
/*     */   
/*     */   public void setFldx9(String fldx9) {
/* 427 */     this.fldx9 = fldx9;
/*     */   }
/*     */   public String getFldx10() {
/* 430 */     return this.fldx10;
/*     */   }
/*     */   
/*     */   public void setFldx10(String fldx10) {
/* 434 */     this.fldx10 = fldx10;
/*     */   }
/*     */   public String getFldx11() {
/* 437 */     return this.fldx11;
/*     */   }
/*     */   
/*     */   public void setFldx11(String fldx11) {
/* 441 */     this.fldx11 = fldx11;
/*     */   }
/*     */   public String getFldx12() {
/* 444 */     return this.fldx12;
/*     */   }
/*     */   
/*     */   public void setFldx12(String fldx12) {
/* 448 */     this.fldx12 = fldx12;
/*     */   }
/*     */   public String getFldx13() {
/* 451 */     return this.fldx13;
/*     */   }
/*     */   
/*     */   public void setFldx13(String fldx13) {
/* 455 */     this.fldx13 = fldx13;
/*     */   }
/*     */   public String getFldx14() {
/* 458 */     return this.fldx14;
/*     */   }
/*     */   
/*     */   public void setFldx14(String fldx14) {
/* 462 */     this.fldx14 = fldx14;
/*     */   }
/*     */   public String getFldx15() {
/* 465 */     return this.fldx15;
/*     */   }
/*     */   
/*     */   public void setFldx15(String fldx15) {
/* 469 */     this.fldx15 = fldx15;
/*     */   }
/*     */   public String getFldx16() {
/* 472 */     return this.fldx16;
/*     */   }
/*     */   
/*     */   public void setFldx16(String fldx16) {
/* 476 */     this.fldx16 = fldx16;
/*     */   }
/*     */   public String getFldx17() {
/* 479 */     return this.fldx17;
/*     */   }
/*     */   
/*     */   public void setFldx17(String fldx17) {
/* 483 */     this.fldx17 = fldx17;
/*     */   }
/*     */   public String getFldx18() {
/* 486 */     return this.fldx18;
/*     */   }
/*     */   
/*     */   public void setFldx18(String fldx18) {
/* 490 */     this.fldx18 = fldx18;
/*     */   }
/*     */   public String getFldx19() {
/* 493 */     return this.fldx19;
/*     */   }
/*     */   
/*     */   public void setFldx19(String fldx19) {
/* 497 */     this.fldx19 = fldx19;
/*     */   }
/*     */   public String getFldx20() {
/* 500 */     return this.fldx20;
/*     */   }
/*     */   
/*     */   public void setFldx20(String fldx20) {
/* 504 */     this.fldx20 = fldx20;
/*     */   }
/*     */   public Date getDxctd() {
/* 507 */     return this.dxctd;
/*     */   }
/*     */   
/*     */   public void setDxctd(Date dxctd) {
/* 511 */     this.dxctd = dxctd;
/*     */   }
/*     */   public String getBxctd() {
/* 514 */     return this.bxctd;
/*     */   }
/*     */   
/*     */   public void setBxctd(String bxctd) {
/* 518 */     this.bxctd = bxctd;
/*     */   }
/*     */   public Date getDxmfdxlst() {
/* 521 */     return this.dxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setDxmfdxlst(Date dxmfdxlst) {
/* 525 */     this.dxmfdxlst = dxmfdxlst;
/*     */   }
/*     */   public String getBxmfdxlst() {
/* 528 */     return this.bxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setBxmfdxlst(String bxmfdxlst) {
/* 532 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */   public String getAxcdexbr() {
/* 535 */     return this.axcdexbr;
/*     */   }
/*     */   
/*     */   public void setAxcdexbr(String axcdexbr) {
/* 539 */     this.axcdexbr = axcdexbr;
/*     */   }
/*     */   public String getAxnmxbr() {
/* 542 */     return this.axnmxbr;
/*     */   }
/*     */   
/*     */   public void setAxnmxbr(String axnmxbr) {
/* 546 */     this.axnmxbr = axnmxbr;
/*     */   }
/*     */   public String getAcntxtyp() {
/* 549 */     return this.acntxtyp;
/*     */   }
/*     */   
/*     */   public void setAcntxtyp(String acntxtyp) {
/* 553 */     this.acntxtyp = acntxtyp;
/*     */   }
/*     */   public String getSchmxtyp() {
/* 556 */     return this.schmxtyp;
/*     */   }
/*     */   
/*     */   public void setSchmxtyp(String schmxtyp) {
/* 560 */     this.schmxtyp = schmxtyp;
/*     */   }
/*     */   public Long getIxstmt() {
/* 563 */     return this.ixstmt;
/*     */   }
/*     */   
/*     */   public void setIxstmt(Long ixstmt) {
/* 567 */     this.ixstmt = ixstmt;
/*     */   }
/*     */   public Date getDxstmt() {
/* 570 */     return this.dxstmt;
/*     */   }
/*     */   
/*     */   public void setDxstmt(Date dxstmt) {
/* 574 */     this.dxstmt = dxstmt;
/*     */   }
/*     */   public Long getIxprdt() {
/* 577 */     return this.ixprdt;
/*     */   }
/*     */   
/*     */   public void setIxprdt(Long ixprdt) {
/* 581 */     this.ixprdt = ixprdt;
/*     */   }
/*     */   public Long getIxprcs() {
/* 584 */     return this.ixprcs;
/*     */   }
/*     */   
/*     */   public void setIxprcs(Long ixprcs) {
/* 588 */     this.ixprcs = ixprcs;
/*     */   }
/*     */   public Date getStxstxdt() {
/* 591 */     return this.stxstxdt;
/*     */   }
/*     */   
/*     */   public void setStxstxdt(Date stxstxdt) {
/* 595 */     this.stxstxdt = stxstxdt;
/*     */   }
/*     */   public Date getStxenxdt() {
/* 598 */     return this.stxenxdt;
/*     */   }
/*     */   
/*     */   public void setStxenxdt(Date stxenxdt) {
/* 602 */     this.stxenxdt = stxenxdt;
/*     */   }
/*     */   public String getOvrxdu() {
/* 605 */     return this.ovrxdu;
/*     */   }
/*     */   
/*     */   public void setOvrxdu(String ovrxdu) {
/* 609 */     this.ovrxdu = ovrxdu;
/*     */   }
/*     */   public String getUxclrxbl() {
/* 612 */     return this.uxclrxbl;
/*     */   }
/*     */   
/*     */   public void setUxclrxbl(String uxclrxbl) {
/* 616 */     this.uxclrxbl = uxclrxbl;
/*     */   }
/*     */   public String getIxrt() {
/* 619 */     return this.ixrt;
/*     */   }
/*     */   
/*     */   public void setIxrt(String ixrt) {
/* 623 */     this.ixrt = ixrt;
/*     */   }
/*     */   public Date getMatxdt() {
/* 626 */     return this.matxdt;
/*     */   }
/*     */   
/*     */   public void setMatxdt(Date matxdt) {
/* 630 */     this.matxdt = matxdt;
/*     */   }
/*     */   public String getPsxdu() {
/* 633 */     return this.psxdu;
/*     */   }
/*     */   
/*     */   public void setPsxdu(String psxdu) {
/* 637 */     this.psxdu = psxdu;
/*     */   }
/*     */   public String getTotxcrdt() {
/* 640 */     return this.totxcrdt;
/*     */   }
/*     */   
/*     */   public void setTotxcrdt(String totxcrdt) {
/* 644 */     this.totxcrdt = totxcrdt;
/*     */   }
/*     */   public String getMinxpayxd() {
/* 647 */     return this.minxpayxd;
/*     */   }
/*     */   
/*     */   public void setMinxpayxd(String minxpayxd) {
/* 651 */     this.minxpayxd = minxpayxd;
/*     */   }
/*     */   public Date getPyxduxdt() {
/* 654 */     return this.pyxduxdt;
/*     */   }
/*     */   
/*     */   public void setPyxduxdt(Date pyxduxdt) {
/* 658 */     this.pyxduxdt = pyxduxdt;
/*     */   }
/*     */   public String getRwrdxopxbl() {
/* 661 */     return this.rwrdxopxbl;
/*     */   }
/*     */   
/*     */   public void setRwrdxopxbl(String rwrdxopxbl) {
/* 665 */     this.rwrdxopxbl = rwrdxopxbl;
/*     */   }
/*     */   public String getRwrdxernd() {
/* 668 */     return this.rwrdxernd;
/*     */   }
/*     */   
/*     */   public void setRwrdxernd(String rwrdxernd) {
/* 672 */     this.rwrdxernd = rwrdxernd;
/*     */   }
/*     */   public String getRwrdxred() {
/* 675 */     return this.rwrdxred;
/*     */   }
/*     */   
/*     */   public void setRwrdxred(String rwrdxred) {
/* 679 */     this.rwrdxred = rwrdxred;
/*     */   }
/*     */   public String getRwrdxclsnxbl() {
/* 682 */     return this.rwrdxclsnxbl;
/*     */   }
/*     */   
/*     */   public void setRwrdxclsnxbl(String rwrdxclsnxbl) {
/* 686 */     this.rwrdxclsnxbl = rwrdxclsnxbl;
/*     */   }
/*     */   public String getCdrxnmbr() {
/* 689 */     return this.cdrxnmbr;
/*     */   }
/*     */   
/*     */   public void setCdrxnmbr(String cdrxnmbr) {
/* 693 */     this.cdrxnmbr = cdrxnmbr;
/*     */   }
/*     */   public String getIxserty() {
/* 696 */     return this.ixserty;
/*     */   }
/*     */   
/*     */   public void setIxserty(String ixserty) {
/* 700 */     this.ixserty = ixserty;
/*     */   }
/*     */   public String getQtxrec() {
/* 703 */     return this.qtxrec;
/*     */   }
/*     */   
/*     */   public void setQtxrec(String qtxrec) {
/* 707 */     this.qtxrec = qtxrec;
/*     */   }
/*     */   public String getQtxdel() {
/* 710 */     return this.qtxdel;
/*     */   }
/*     */   
/*     */   public void setQtxdel(String qtxdel) {
/* 714 */     this.qtxdel = qtxdel;
/*     */   }
/*     */   public String getBlxdt() {
/* 717 */     return this.blxdt;
/*     */   }
/*     */   
/*     */   public void setBlxdt(String blxdt) {
/* 721 */     this.blxdt = blxdt;
/*     */   }
/*     */   public String getPrexexstxcndtn() {
/* 724 */     return this.prexexstxcndtn;
/*     */   }
/*     */   
/*     */   public void setPrexexstxcndtn(String prexexstxcndtn) {
/* 728 */     this.prexexstxcndtn = prexexstxcndtn;
/*     */   }
/*     */   public String getExstxsnce() {
/* 731 */     return this.exstxsnce;
/*     */   }
/*     */   
/*     */   public void setExstxsnce(String exstxsnce) {
/* 735 */     this.exstxsnce = exstxsnce;
/*     */   }
/*     */   public String getNomnxnm() {
/* 738 */     return this.nomnxnm;
/*     */   }
/*     */   
/*     */   public void setNomnxnm(String nomnxnm) {
/* 742 */     this.nomnxnm = nomnxnm;
/*     */   }
/*     */   public String getFrstxplcyxcmmncxdt() {
/* 745 */     return this.frstxplcyxcmmncxdt;
/*     */   }
/*     */   
/*     */   public void setFrstxplcyxcmmncxdt(String frstxplcyxcmmncxdt) {
/* 749 */     this.frstxplcyxcmmncxdt = frstxplcyxcmmncxdt;
/*     */   }
/*     */   public String getSrvcxtaxxcde() {
/* 752 */     return this.srvcxtaxxcde;
/*     */   }
/*     */   
/*     */   public void setSrvcxtaxxcde(String srvcxtaxxcde) {
/* 756 */     this.srvcxtaxxcde = srvcxtaxxcde;
/*     */   }
/*     */   public String getSrvcxtaxxrgstrtn() {
/* 759 */     return this.srvcxtaxxrgstrtn;
/*     */   }
/*     */   
/*     */   public void setSrvcxtaxxrgstrtn(String srvcxtaxxrgstrtn) {
/* 763 */     this.srvcxtaxxrgstrtn = srvcxtaxxrgstrtn;
/*     */   }
/*     */   public String getAplctnxno() {
/* 766 */     return this.aplctnxno;
/*     */   }
/*     */   
/*     */   public void setAplctnxno(String aplctnxno) {
/* 770 */     this.aplctnxno = aplctnxno;
/*     */   }
/*     */   public String getUnvrsty() {
/* 773 */     return this.unvrsty;
/*     */   }
/*     */   
/*     */   public void setUnvrsty(String unvrsty) {
/* 777 */     this.unvrsty = unvrsty;
/*     */   }
/*     */   public String getCorse() {
/* 780 */     return this.corse;
/*     */   }
/*     */   
/*     */   public void setCorse(String corse) {
/* 784 */     this.corse = corse;
/*     */   }
/*     */   public String getUnvrstyxadrs() {
/* 787 */     return this.unvrstyxadrs;
/*     */   }
/*     */   
/*     */   public void setUnvrstyxadrs(String unvrstyxadrs) {
/* 791 */     this.unvrstyxadrs = unvrstyxadrs;
/*     */   }
/*     */   public String getUnvrstyxst() {
/* 794 */     return this.unvrstyxst;
/*     */   }
/*     */   
/*     */   public void setUnvrstyxst(String unvrstyxst) {
/* 798 */     this.unvrstyxst = unvrstyxst;
/*     */   }
/*     */   public String getUnvrstyxcntry() {
/* 801 */     return this.unvrstyxcntry;
/*     */   }
/*     */   
/*     */   public void setUnvrstyxcntry(String unvrstyxcntry) {
/* 805 */     this.unvrstyxcntry = unvrstyxcntry;
/*     */   }
/*     */   public String getTypxofxtrip() {
/* 808 */     return this.typxofxtrip;
/*     */   }
/*     */   
/*     */   public void setTypxofxtrip(String typxofxtrip) {
/* 812 */     this.typxofxtrip = typxofxtrip;
/*     */   }
/*     */   public String getPolcyxpriod() {
/* 815 */     return this.polcyxpriod;
/*     */   }
/*     */   
/*     */   public void setPolcyxpriod(String polcyxpriod) {
/* 819 */     this.polcyxpriod = polcyxpriod;
/*     */   }
/*     */   public String getGeoxscope() {
/* 822 */     return this.geoxscope;
/*     */   }
/*     */   
/*     */   public void setGeoxscope(String geoxscope) {
/* 826 */     this.geoxscope = geoxscope;
/*     */   }
/*     */   public String getDlvryxchnel() {
/* 829 */     return this.dlvryxchnel;
/*     */   }
/*     */   
/*     */   public void setDlvryxchnel(String dlvryxchnel) {
/* 833 */     this.dlvryxchnel = dlvryxchnel;
/*     */   }
/*     */   public String getSponsorxdob() {
/* 836 */     return this.sponsorxdob;
/*     */   }
/*     */   
/*     */   public void setSponsorxdob(String sponsorxdob) {
/* 840 */     this.sponsorxdob = sponsorxdob;
/*     */   }
/*     */   public String getNoxofxlives() {
/* 843 */     return this.noxofxlives;
/*     */   }
/*     */   
/*     */   public void setNoxofxlives(String noxofxlives) {
/* 847 */     this.noxofxlives = noxofxlives;
/*     */   }
/*     */   public String getFmlyxdfntn() {
/* 850 */     return this.fmlyxdfntn;
/*     */   }
/*     */   
/*     */   public void setFmlyxdfntn(String fmlyxdfntn) {
/* 854 */     this.fmlyxdfntn = fmlyxdfntn;
/*     */   }
/*     */   public String getTypxcrd() {
/* 857 */     return this.typxcrd;
/*     */   }
/*     */   
/*     */   public void setTypxcrd(String typxcrd) {
/* 861 */     this.typxcrd = typxcrd;
/*     */   }
/*     */   public String getCshxlmt() {
/* 864 */     return this.cshxlmt;
/*     */   }
/*     */   
/*     */   public void setCshxlmt(String cshxlmt) {
/* 868 */     this.cshxlmt = cshxlmt;
/*     */   }
/*     */   public String getOvrdrftxamt() {
/* 871 */     return this.ovrdrftxamt;
/*     */   }
/*     */   
/*     */   public void setOvrdrftxamt(String ovrdrftxamt) {
/* 875 */     this.ovrdrftxamt = ovrdrftxamt;
/*     */   }
/*     */   public String getOpnxdt() {
/* 878 */     return this.opnxdt;
/*     */   }
/*     */   
/*     */   public void setOpnxdt(String opnxdt) {
/* 882 */     this.opnxdt = opnxdt;
/*     */   }
/*     */   
/*     */   public String getStrctxfldr() {
/* 886 */     return this.strctxfldr;
/*     */   }
/*     */   
/*     */   public void setStrctxfldr(String strctxfldr) {
/* 890 */     this.strctxfldr = strctxfldr;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Dxcstmrxdtls.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */