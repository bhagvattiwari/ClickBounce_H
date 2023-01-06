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
/*     */ public class DxcstmrxdtlsId
/*     */   implements Serializable
/*     */ {
/*     */   private Long ixdtlsxcst;
/*     */   private Long ixcst;
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
/*     */   
/*     */   public DxcstmrxdtlsId() {}
/*     */   
/*     */   public DxcstmrxdtlsId(Long ixdtlsxcst) {
/*  64 */     this.ixdtlsxcst = ixdtlsxcst;
/*     */   }
/*     */   public DxcstmrxdtlsId(Long ixdtlsxcst, Long ixcst, Long noxacnt, String drs1xa, String drs2xa, String drs3xa, String nmxcty, String nmxst, String cntry, String cdexzp, String ixem, String ixemxalt, String noxfx, String noxcntct, String noxmbl, String flxsttsxadrs, Date dxfrmxads, Date dxtoxads, String flxfrncy, Long flxchnlxdlvy, String fldx1, String fldx2, String fldx3, String fldx4, String fldx5, String fldx6, String fldx7, String fldx8, String fldx9, String fldx10, String fldx11, String fldx12, String fldx13, String fldx14, String fldx15, String fldx16, String fldx17, String fldx18, String fldx19, String fldx20, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst) {
/*  67 */     this.ixdtlsxcst = ixdtlsxcst;
/*  68 */     this.ixcst = ixcst;
/*  69 */     this.noxacnt = noxacnt;
/*  70 */     this.drs1xa = drs1xa;
/*  71 */     this.drs2xa = drs2xa;
/*  72 */     this.drs3xa = drs3xa;
/*  73 */     this.nmxcty = nmxcty;
/*  74 */     this.nmxst = nmxst;
/*  75 */     this.cntry = cntry;
/*  76 */     this.cdexzp = cdexzp;
/*  77 */     this.ixem = ixem;
/*  78 */     this.ixemxalt = ixemxalt;
/*  79 */     this.noxfx = noxfx;
/*  80 */     this.noxcntct = noxcntct;
/*  81 */     this.noxmbl = noxmbl;
/*  82 */     this.flxsttsxadrs = flxsttsxadrs;
/*  83 */     this.dxfrmxads = dxfrmxads;
/*  84 */     this.dxtoxads = dxtoxads;
/*  85 */     this.flxfrncy = flxfrncy;
/*  86 */     this.flxchnlxdlvy = flxchnlxdlvy;
/*  87 */     this.fldx1 = fldx1;
/*  88 */     this.fldx2 = fldx2;
/*  89 */     this.fldx3 = fldx3;
/*  90 */     this.fldx4 = fldx4;
/*  91 */     this.fldx5 = fldx5;
/*  92 */     this.fldx6 = fldx6;
/*  93 */     this.fldx7 = fldx7;
/*  94 */     this.fldx8 = fldx8;
/*  95 */     this.fldx9 = fldx9;
/*  96 */     this.fldx10 = fldx10;
/*  97 */     this.fldx11 = fldx11;
/*  98 */     this.fldx12 = fldx12;
/*  99 */     this.fldx13 = fldx13;
/* 100 */     this.fldx14 = fldx14;
/* 101 */     this.fldx15 = fldx15;
/* 102 */     this.fldx16 = fldx16;
/* 103 */     this.fldx17 = fldx17;
/* 104 */     this.fldx18 = fldx18;
/* 105 */     this.fldx19 = fldx19;
/* 106 */     this.fldx20 = fldx20;
/* 107 */     this.dxctd = dxctd;
/* 108 */     this.bxctd = bxctd;
/* 109 */     this.dxmfdxlst = dxmfdxlst;
/* 110 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */   
/*     */   public Long getIxdtlsxcst() {
/* 114 */     return this.ixdtlsxcst;
/*     */   }
/*     */   
/*     */   public void setIxdtlsxcst(Long ixdtlsxcst) {
/* 118 */     this.ixdtlsxcst = ixdtlsxcst;
/*     */   }
/*     */   public Long getIxcst() {
/* 121 */     return this.ixcst;
/*     */   }
/*     */   
/*     */   public void setIxcst(Long ixcst) {
/* 125 */     this.ixcst = ixcst;
/*     */   }
/*     */   public Long getNoxacnt() {
/* 128 */     return this.noxacnt;
/*     */   }
/*     */   
/*     */   public void setNoxacnt(Long noxacnt) {
/* 132 */     this.noxacnt = noxacnt;
/*     */   }
/*     */   public String getDrs1xa() {
/* 135 */     return this.drs1xa;
/*     */   }
/*     */   
/*     */   public void setDrs1xa(String drs1xa) {
/* 139 */     this.drs1xa = drs1xa;
/*     */   }
/*     */   public String getDrs2xa() {
/* 142 */     return this.drs2xa;
/*     */   }
/*     */   
/*     */   public void setDrs2xa(String drs2xa) {
/* 146 */     this.drs2xa = drs2xa;
/*     */   }
/*     */   public String getDrs3xa() {
/* 149 */     return this.drs3xa;
/*     */   }
/*     */   
/*     */   public void setDrs3xa(String drs3xa) {
/* 153 */     this.drs3xa = drs3xa;
/*     */   }
/*     */   public String getNmxcty() {
/* 156 */     return this.nmxcty;
/*     */   }
/*     */   
/*     */   public void setNmxcty(String nmxcty) {
/* 160 */     this.nmxcty = nmxcty;
/*     */   }
/*     */   public String getNmxst() {
/* 163 */     return this.nmxst;
/*     */   }
/*     */   
/*     */   public void setNmxst(String nmxst) {
/* 167 */     this.nmxst = nmxst;
/*     */   }
/*     */   public String getCntry() {
/* 170 */     return this.cntry;
/*     */   }
/*     */   
/*     */   public void setCntry(String cntry) {
/* 174 */     this.cntry = cntry;
/*     */   }
/*     */   public String getCdexzp() {
/* 177 */     return this.cdexzp;
/*     */   }
/*     */   
/*     */   public void setCdexzp(String cdexzp) {
/* 181 */     this.cdexzp = cdexzp;
/*     */   }
/*     */   public String getIxem() {
/* 184 */     return this.ixem;
/*     */   }
/*     */   
/*     */   public void setIxem(String ixem) {
/* 188 */     this.ixem = ixem;
/*     */   }
/*     */   public String getIxemxalt() {
/* 191 */     return this.ixemxalt;
/*     */   }
/*     */   
/*     */   public void setIxemxalt(String ixemxalt) {
/* 195 */     this.ixemxalt = ixemxalt;
/*     */   }
/*     */   public String getNoxfx() {
/* 198 */     return this.noxfx;
/*     */   }
/*     */   
/*     */   public void setNoxfx(String noxfx) {
/* 202 */     this.noxfx = noxfx;
/*     */   }
/*     */   public String getNoxcntct() {
/* 205 */     return this.noxcntct;
/*     */   }
/*     */   
/*     */   public void setNoxcntct(String noxcntct) {
/* 209 */     this.noxcntct = noxcntct;
/*     */   }
/*     */   public String getNoxmbl() {
/* 212 */     return this.noxmbl;
/*     */   }
/*     */   
/*     */   public void setNoxmbl(String noxmbl) {
/* 216 */     this.noxmbl = noxmbl;
/*     */   }
/*     */   public String getFlxsttsxadrs() {
/* 219 */     return this.flxsttsxadrs;
/*     */   }
/*     */   
/*     */   public void setFlxsttsxadrs(String flxsttsxadrs) {
/* 223 */     this.flxsttsxadrs = flxsttsxadrs;
/*     */   }
/*     */   public Date getDxfrmxads() {
/* 226 */     return this.dxfrmxads;
/*     */   }
/*     */   
/*     */   public void setDxfrmxads(Date dxfrmxads) {
/* 230 */     this.dxfrmxads = dxfrmxads;
/*     */   }
/*     */   public Date getDxtoxads() {
/* 233 */     return this.dxtoxads;
/*     */   }
/*     */   
/*     */   public void setDxtoxads(Date dxtoxads) {
/* 237 */     this.dxtoxads = dxtoxads;
/*     */   }
/*     */   public String getFlxfrncy() {
/* 240 */     return this.flxfrncy;
/*     */   }
/*     */   
/*     */   public void setFlxfrncy(String flxfrncy) {
/* 244 */     this.flxfrncy = flxfrncy;
/*     */   }
/*     */   public Long getFlxchnlxdlvy() {
/* 247 */     return this.flxchnlxdlvy;
/*     */   }
/*     */   
/*     */   public void setFlxchnlxdlvy(Long flxchnlxdlvy) {
/* 251 */     this.flxchnlxdlvy = flxchnlxdlvy;
/*     */   }
/*     */   public String getFldx1() {
/* 254 */     return this.fldx1;
/*     */   }
/*     */   
/*     */   public void setFldx1(String fldx1) {
/* 258 */     this.fldx1 = fldx1;
/*     */   }
/*     */   public String getFldx2() {
/* 261 */     return this.fldx2;
/*     */   }
/*     */   
/*     */   public void setFldx2(String fldx2) {
/* 265 */     this.fldx2 = fldx2;
/*     */   }
/*     */   public String getFldx3() {
/* 268 */     return this.fldx3;
/*     */   }
/*     */   
/*     */   public void setFldx3(String fldx3) {
/* 272 */     this.fldx3 = fldx3;
/*     */   }
/*     */   public String getFldx4() {
/* 275 */     return this.fldx4;
/*     */   }
/*     */   
/*     */   public void setFldx4(String fldx4) {
/* 279 */     this.fldx4 = fldx4;
/*     */   }
/*     */   public String getFldx5() {
/* 282 */     return this.fldx5;
/*     */   }
/*     */   
/*     */   public void setFldx5(String fldx5) {
/* 286 */     this.fldx5 = fldx5;
/*     */   }
/*     */   public String getFldx6() {
/* 289 */     return this.fldx6;
/*     */   }
/*     */   
/*     */   public void setFldx6(String fldx6) {
/* 293 */     this.fldx6 = fldx6;
/*     */   }
/*     */   public String getFldx7() {
/* 296 */     return this.fldx7;
/*     */   }
/*     */   
/*     */   public void setFldx7(String fldx7) {
/* 300 */     this.fldx7 = fldx7;
/*     */   }
/*     */   public String getFldx8() {
/* 303 */     return this.fldx8;
/*     */   }
/*     */   
/*     */   public void setFldx8(String fldx8) {
/* 307 */     this.fldx8 = fldx8;
/*     */   }
/*     */   public String getFldx9() {
/* 310 */     return this.fldx9;
/*     */   }
/*     */   
/*     */   public void setFldx9(String fldx9) {
/* 314 */     this.fldx9 = fldx9;
/*     */   }
/*     */   public String getFldx10() {
/* 317 */     return this.fldx10;
/*     */   }
/*     */   
/*     */   public void setFldx10(String fldx10) {
/* 321 */     this.fldx10 = fldx10;
/*     */   }
/*     */   public String getFldx11() {
/* 324 */     return this.fldx11;
/*     */   }
/*     */   
/*     */   public void setFldx11(String fldx11) {
/* 328 */     this.fldx11 = fldx11;
/*     */   }
/*     */   public String getFldx12() {
/* 331 */     return this.fldx12;
/*     */   }
/*     */   
/*     */   public void setFldx12(String fldx12) {
/* 335 */     this.fldx12 = fldx12;
/*     */   }
/*     */   public String getFldx13() {
/* 338 */     return this.fldx13;
/*     */   }
/*     */   
/*     */   public void setFldx13(String fldx13) {
/* 342 */     this.fldx13 = fldx13;
/*     */   }
/*     */   public String getFldx14() {
/* 345 */     return this.fldx14;
/*     */   }
/*     */   
/*     */   public void setFldx14(String fldx14) {
/* 349 */     this.fldx14 = fldx14;
/*     */   }
/*     */   public String getFldx15() {
/* 352 */     return this.fldx15;
/*     */   }
/*     */   
/*     */   public void setFldx15(String fldx15) {
/* 356 */     this.fldx15 = fldx15;
/*     */   }
/*     */   public String getFldx16() {
/* 359 */     return this.fldx16;
/*     */   }
/*     */   
/*     */   public void setFldx16(String fldx16) {
/* 363 */     this.fldx16 = fldx16;
/*     */   }
/*     */   public String getFldx17() {
/* 366 */     return this.fldx17;
/*     */   }
/*     */   
/*     */   public void setFldx17(String fldx17) {
/* 370 */     this.fldx17 = fldx17;
/*     */   }
/*     */   public String getFldx18() {
/* 373 */     return this.fldx18;
/*     */   }
/*     */   
/*     */   public void setFldx18(String fldx18) {
/* 377 */     this.fldx18 = fldx18;
/*     */   }
/*     */   public String getFldx19() {
/* 380 */     return this.fldx19;
/*     */   }
/*     */   
/*     */   public void setFldx19(String fldx19) {
/* 384 */     this.fldx19 = fldx19;
/*     */   }
/*     */   public String getFldx20() {
/* 387 */     return this.fldx20;
/*     */   }
/*     */   
/*     */   public void setFldx20(String fldx20) {
/* 391 */     this.fldx20 = fldx20;
/*     */   }
/*     */   public Date getDxctd() {
/* 394 */     return this.dxctd;
/*     */   }
/*     */   
/*     */   public void setDxctd(Date dxctd) {
/* 398 */     this.dxctd = dxctd;
/*     */   }
/*     */   public String getBxctd() {
/* 401 */     return this.bxctd;
/*     */   }
/*     */   
/*     */   public void setBxctd(String bxctd) {
/* 405 */     this.bxctd = bxctd;
/*     */   }
/*     */   public Date getDxmfdxlst() {
/* 408 */     return this.dxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setDxmfdxlst(Date dxmfdxlst) {
/* 412 */     this.dxmfdxlst = dxmfdxlst;
/*     */   }
/*     */   public String getBxmfdxlst() {
/* 415 */     return this.bxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setBxmfdxlst(String bxmfdxlst) {
/* 419 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object other) {
/* 424 */     if (this == other) return true; 
/* 425 */     if (other == null) return false; 
/* 426 */     if (!(other instanceof DxcstmrxdtlsId)) return false; 
/* 427 */     DxcstmrxdtlsId castOther = (DxcstmrxdtlsId)other;
/*     */     
/* 429 */     return ((getIxdtlsxcst() == castOther.getIxdtlsxcst() || (getIxdtlsxcst() != null && castOther.getIxdtlsxcst() != null && getIxdtlsxcst().equals(castOther.getIxdtlsxcst()))) && (getIxcst() == castOther.getIxcst() || (getIxcst() != null && castOther.getIxcst() != null && getIxcst().equals(castOther.getIxcst()))) && (getNoxacnt() == castOther.getNoxacnt() || (getNoxacnt() != null && castOther.getNoxacnt() != null && getNoxacnt().equals(castOther.getNoxacnt()))) && (getDrs1xa() == castOther.getDrs1xa() || (getDrs1xa() != null && castOther.getDrs1xa() != null && getDrs1xa().equals(castOther.getDrs1xa()))) && (getDrs2xa() == castOther.getDrs2xa() || (getDrs2xa() != null && castOther.getDrs2xa() != null && getDrs2xa().equals(castOther.getDrs2xa()))) && (getDrs3xa() == castOther.getDrs3xa() || (getDrs3xa() != null && castOther.getDrs3xa() != null && getDrs3xa().equals(castOther.getDrs3xa()))) && (getNmxcty() == castOther.getNmxcty() || (getNmxcty() != null && castOther.getNmxcty() != null && getNmxcty().equals(castOther.getNmxcty()))) && (getNmxst() == castOther.getNmxst() || (getNmxst() != null && castOther.getNmxst() != null && getNmxst().equals(castOther.getNmxst()))) && (getCntry() == castOther.getCntry() || (getCntry() != null && castOther.getCntry() != null && getCntry().equals(castOther.getCntry()))) && (getCdexzp() == castOther.getCdexzp() || (getCdexzp() != null && castOther.getCdexzp() != null && getCdexzp().equals(castOther.getCdexzp()))) && (getIxem() == castOther.getIxem() || (getIxem() != null && castOther.getIxem() != null && getIxem().equals(castOther.getIxem()))) && (getIxemxalt() == castOther.getIxemxalt() || (getIxemxalt() != null && castOther.getIxemxalt() != null && getIxemxalt().equals(castOther.getIxemxalt()))) && (getNoxfx() == castOther.getNoxfx() || (getNoxfx() != null && castOther.getNoxfx() != null && getNoxfx().equals(castOther.getNoxfx()))) && (getNoxcntct() == castOther.getNoxcntct() || (getNoxcntct() != null && castOther.getNoxcntct() != null && getNoxcntct().equals(castOther.getNoxcntct()))) && (getNoxmbl() == castOther.getNoxmbl() || (getNoxmbl() != null && castOther.getNoxmbl() != null && getNoxmbl().equals(castOther.getNoxmbl()))) && (getFlxsttsxadrs() == castOther.getFlxsttsxadrs() || (getFlxsttsxadrs() != null && castOther.getFlxsttsxadrs() != null && getFlxsttsxadrs().equals(castOther.getFlxsttsxadrs()))) && (getDxfrmxads() == castOther.getDxfrmxads() || (getDxfrmxads() != null && castOther.getDxfrmxads() != null && getDxfrmxads().equals(castOther.getDxfrmxads()))) && (getDxtoxads() == castOther.getDxtoxads() || (getDxtoxads() != null && castOther.getDxtoxads() != null && getDxtoxads().equals(castOther.getDxtoxads()))) && (getFlxfrncy() == castOther.getFlxfrncy() || (getFlxfrncy() != null && castOther.getFlxfrncy() != null && getFlxfrncy().equals(castOther.getFlxfrncy()))) && (getFlxchnlxdlvy() == castOther.getFlxchnlxdlvy() || (getFlxchnlxdlvy() != null && castOther.getFlxchnlxdlvy() != null && getFlxchnlxdlvy().equals(castOther.getFlxchnlxdlvy()))) && (getFldx1() == castOther.getFldx1() || (getFldx1() != null && castOther.getFldx1() != null && getFldx1().equals(castOther.getFldx1()))) && (getFldx2() == castOther.getFldx2() || (getFldx2() != null && castOther.getFldx2() != null && getFldx2().equals(castOther.getFldx2()))) && (getFldx3() == castOther.getFldx3() || (getFldx3() != null && castOther.getFldx3() != null && getFldx3().equals(castOther.getFldx3()))) && (getFldx4() == castOther.getFldx4() || (getFldx4() != null && castOther.getFldx4() != null && getFldx4().equals(castOther.getFldx4()))) && (getFldx5() == castOther.getFldx5() || (getFldx5() != null && castOther.getFldx5() != null && getFldx5().equals(castOther.getFldx5()))) && (getFldx6() == castOther.getFldx6() || (getFldx6() != null && castOther.getFldx6() != null && getFldx6().equals(castOther.getFldx6()))) && (getFldx7() == castOther.getFldx7() || (getFldx7() != null && castOther.getFldx7() != null && getFldx7().equals(castOther.getFldx7()))) && (getFldx8() == castOther.getFldx8() || (getFldx8() != null && castOther.getFldx8() != null && getFldx8().equals(castOther.getFldx8()))) && (getFldx9() == castOther.getFldx9() || (getFldx9() != null && castOther.getFldx9() != null && getFldx9().equals(castOther.getFldx9()))) && (getFldx10() == castOther.getFldx10() || (getFldx10() != null && castOther.getFldx10() != null && getFldx10().equals(castOther.getFldx10()))) && (getFldx11() == castOther.getFldx11() || (getFldx11() != null && castOther.getFldx11() != null && getFldx11().equals(castOther.getFldx11()))) && (getFldx12() == castOther.getFldx12() || (getFldx12() != null && castOther.getFldx12() != null && getFldx12().equals(castOther.getFldx12()))) && (getFldx13() == castOther.getFldx13() || (getFldx13() != null && castOther.getFldx13() != null && getFldx13().equals(castOther.getFldx13()))) && (getFldx14() == castOther.getFldx14() || (getFldx14() != null && castOther.getFldx14() != null && getFldx14().equals(castOther.getFldx14()))) && (getFldx15() == castOther.getFldx15() || (getFldx15() != null && castOther.getFldx15() != null && getFldx15().equals(castOther.getFldx15()))) && (getFldx16() == castOther.getFldx16() || (getFldx16() != null && castOther.getFldx16() != null && getFldx16().equals(castOther.getFldx16()))) && (getFldx17() == castOther.getFldx17() || (getFldx17() != null && castOther.getFldx17() != null && getFldx17().equals(castOther.getFldx17()))) && (getFldx18() == castOther.getFldx18() || (getFldx18() != null && castOther.getFldx18() != null && getFldx18().equals(castOther.getFldx18()))) && (getFldx19() == castOther.getFldx19() || (getFldx19() != null && castOther.getFldx19() != null && getFldx19().equals(castOther.getFldx19()))) && (getFldx20() == castOther.getFldx20() || (getFldx20() != null && castOther.getFldx20() != null && getFldx20().equals(castOther.getFldx20()))) && (getDxctd() == castOther.getDxctd() || (getDxctd() != null && castOther.getDxctd() != null && getDxctd().equals(castOther.getDxctd()))) && (getBxctd() == castOther.getBxctd() || (getBxctd() != null && castOther.getBxctd() != null && getBxctd().equals(castOther.getBxctd()))) && (getDxmfdxlst() == castOther.getDxmfdxlst() || (getDxmfdxlst() != null && castOther.getDxmfdxlst() != null && getDxmfdxlst().equals(castOther.getDxmfdxlst()))) && (getBxmfdxlst() == castOther.getBxmfdxlst() || (getBxmfdxlst() != null && castOther.getBxmfdxlst() != null && getBxmfdxlst().equals(castOther.getBxmfdxlst()))));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 476 */     int result = 17;
/*     */     
/* 478 */     result = 37 * result + ((getIxdtlsxcst() == null) ? 0 : getIxdtlsxcst().hashCode());
/* 479 */     result = 37 * result + ((getIxcst() == null) ? 0 : getIxcst().hashCode());
/* 480 */     result = 37 * result + ((getNoxacnt() == null) ? 0 : getNoxacnt().hashCode());
/* 481 */     result = 37 * result + ((getDrs1xa() == null) ? 0 : getDrs1xa().hashCode());
/* 482 */     result = 37 * result + ((getDrs2xa() == null) ? 0 : getDrs2xa().hashCode());
/* 483 */     result = 37 * result + ((getDrs3xa() == null) ? 0 : getDrs3xa().hashCode());
/* 484 */     result = 37 * result + ((getNmxcty() == null) ? 0 : getNmxcty().hashCode());
/* 485 */     result = 37 * result + ((getNmxst() == null) ? 0 : getNmxst().hashCode());
/* 486 */     result = 37 * result + ((getCntry() == null) ? 0 : getCntry().hashCode());
/* 487 */     result = 37 * result + ((getCdexzp() == null) ? 0 : getCdexzp().hashCode());
/* 488 */     result = 37 * result + ((getIxem() == null) ? 0 : getIxem().hashCode());
/* 489 */     result = 37 * result + ((getIxemxalt() == null) ? 0 : getIxemxalt().hashCode());
/* 490 */     result = 37 * result + ((getNoxfx() == null) ? 0 : getNoxfx().hashCode());
/* 491 */     result = 37 * result + ((getNoxcntct() == null) ? 0 : getNoxcntct().hashCode());
/* 492 */     result = 37 * result + ((getNoxmbl() == null) ? 0 : getNoxmbl().hashCode());
/* 493 */     result = 37 * result + ((getFlxsttsxadrs() == null) ? 0 : getFlxsttsxadrs().hashCode());
/* 494 */     result = 37 * result + ((getDxfrmxads() == null) ? 0 : getDxfrmxads().hashCode());
/* 495 */     result = 37 * result + ((getDxtoxads() == null) ? 0 : getDxtoxads().hashCode());
/* 496 */     result = 37 * result + ((getFlxfrncy() == null) ? 0 : getFlxfrncy().hashCode());
/* 497 */     result = 37 * result + ((getFlxchnlxdlvy() == null) ? 0 : getFlxchnlxdlvy().hashCode());
/* 498 */     result = 37 * result + ((getFldx1() == null) ? 0 : getFldx1().hashCode());
/* 499 */     result = 37 * result + ((getFldx2() == null) ? 0 : getFldx2().hashCode());
/* 500 */     result = 37 * result + ((getFldx3() == null) ? 0 : getFldx3().hashCode());
/* 501 */     result = 37 * result + ((getFldx4() == null) ? 0 : getFldx4().hashCode());
/* 502 */     result = 37 * result + ((getFldx5() == null) ? 0 : getFldx5().hashCode());
/* 503 */     result = 37 * result + ((getFldx6() == null) ? 0 : getFldx6().hashCode());
/* 504 */     result = 37 * result + ((getFldx7() == null) ? 0 : getFldx7().hashCode());
/* 505 */     result = 37 * result + ((getFldx8() == null) ? 0 : getFldx8().hashCode());
/* 506 */     result = 37 * result + ((getFldx9() == null) ? 0 : getFldx9().hashCode());
/* 507 */     result = 37 * result + ((getFldx10() == null) ? 0 : getFldx10().hashCode());
/* 508 */     result = 37 * result + ((getFldx11() == null) ? 0 : getFldx11().hashCode());
/* 509 */     result = 37 * result + ((getFldx12() == null) ? 0 : getFldx12().hashCode());
/* 510 */     result = 37 * result + ((getFldx13() == null) ? 0 : getFldx13().hashCode());
/* 511 */     result = 37 * result + ((getFldx14() == null) ? 0 : getFldx14().hashCode());
/* 512 */     result = 37 * result + ((getFldx15() == null) ? 0 : getFldx15().hashCode());
/* 513 */     result = 37 * result + ((getFldx16() == null) ? 0 : getFldx16().hashCode());
/* 514 */     result = 37 * result + ((getFldx17() == null) ? 0 : getFldx17().hashCode());
/* 515 */     result = 37 * result + ((getFldx18() == null) ? 0 : getFldx18().hashCode());
/* 516 */     result = 37 * result + ((getFldx19() == null) ? 0 : getFldx19().hashCode());
/* 517 */     result = 37 * result + ((getFldx20() == null) ? 0 : getFldx20().hashCode());
/* 518 */     result = 37 * result + ((getDxctd() == null) ? 0 : getDxctd().hashCode());
/* 519 */     result = 37 * result + ((getBxctd() == null) ? 0 : getBxctd().hashCode());
/* 520 */     result = 37 * result + ((getDxmfdxlst() == null) ? 0 : getDxmfdxlst().hashCode());
/* 521 */     result = 37 * result + ((getBxmfdxlst() == null) ? 0 : getBxmfdxlst().hashCode());
/* 522 */     return result;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\DxcstmrxdtlsId.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */