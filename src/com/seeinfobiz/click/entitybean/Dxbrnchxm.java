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
/*     */ public class Dxbrnchxm
/*     */   implements Serializable
/*     */ {
/*     */   private BigDecimal ixbr;
/*     */   private String nmxbr;
/*     */   private String cdexbr;
/*     */   private String rmxbr;
/*     */   private String drs1xa;
/*     */   private String drs2xa;
/*     */   private String drs3xa;
/*     */   private String nmxcty;
/*     */   private String nmxst;
/*     */   private String cntry;
/*     */   private String cdexzp;
/*     */   private String rgnxtxxsrvc;
/*     */   private String ixem;
/*     */   private String noxcntct;
/*     */   private String noxfx;
/*     */   private String noxmbl;
/*     */   private String cntctxprsnxbrch;
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
/*  57 */   private Set<Dxcstmrxm> dxcstmrxms = new HashSet<Dxcstmrxm>(0);
/*     */ 
/*     */   
/*     */   public Dxbrnchxm() {}
/*     */ 
/*     */   
/*     */   public Dxbrnchxm(BigDecimal ixbr) {
/*  64 */     this.ixbr = ixbr;
/*     */   }
/*     */   public Dxbrnchxm(BigDecimal ixbr, String nmxbr, String cdexbr, String rmxbr, String drs1xa, String drs2xa, String drs3xa, String nmxcty, String nmxst, String cntry, String cdexzp, String rgnxtxxsrvc, String ixem, String noxcntct, String noxfx, String noxmbl, String cntctxprsnxbrch, String fldx1, String fldx2, String fldx3, String fldx4, String fldx5, String fldx6, String fldx7, String fldx8, String fldx9, String fldx10, String fldx11, String fldx12, String fldx13, String fldx14, String fldx15, String fldx16, String fldx17, String fldx18, String fldx19, String fldx20, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst, Set<Dxcstmrxm> dxcstmrxms) {
/*  67 */     this.ixbr = ixbr;
/*  68 */     this.nmxbr = nmxbr;
/*  69 */     this.cdexbr = cdexbr;
/*  70 */     this.rmxbr = rmxbr;
/*  71 */     this.drs1xa = drs1xa;
/*  72 */     this.drs2xa = drs2xa;
/*  73 */     this.drs3xa = drs3xa;
/*  74 */     this.nmxcty = nmxcty;
/*  75 */     this.nmxst = nmxst;
/*  76 */     this.cntry = cntry;
/*  77 */     this.cdexzp = cdexzp;
/*  78 */     this.rgnxtxxsrvc = rgnxtxxsrvc;
/*  79 */     this.ixem = ixem;
/*  80 */     this.noxcntct = noxcntct;
/*  81 */     this.noxfx = noxfx;
/*  82 */     this.noxmbl = noxmbl;
/*  83 */     this.cntctxprsnxbrch = cntctxprsnxbrch;
/*  84 */     this.fldx1 = fldx1;
/*  85 */     this.fldx2 = fldx2;
/*  86 */     this.fldx3 = fldx3;
/*  87 */     this.fldx4 = fldx4;
/*  88 */     this.fldx5 = fldx5;
/*  89 */     this.fldx6 = fldx6;
/*  90 */     this.fldx7 = fldx7;
/*  91 */     this.fldx8 = fldx8;
/*  92 */     this.fldx9 = fldx9;
/*  93 */     this.fldx10 = fldx10;
/*  94 */     this.fldx11 = fldx11;
/*  95 */     this.fldx12 = fldx12;
/*  96 */     this.fldx13 = fldx13;
/*  97 */     this.fldx14 = fldx14;
/*  98 */     this.fldx15 = fldx15;
/*  99 */     this.fldx16 = fldx16;
/* 100 */     this.fldx17 = fldx17;
/* 101 */     this.fldx18 = fldx18;
/* 102 */     this.fldx19 = fldx19;
/* 103 */     this.fldx20 = fldx20;
/* 104 */     this.dxctd = dxctd;
/* 105 */     this.bxctd = bxctd;
/* 106 */     this.dxmfdxlst = dxmfdxlst;
/* 107 */     this.bxmfdxlst = bxmfdxlst;
/* 108 */     this.dxcstmrxms = dxcstmrxms;
/*     */   }
/*     */   
/*     */   public BigDecimal getIxbr() {
/* 112 */     return this.ixbr;
/*     */   }
/*     */   
/*     */   public void setIxbr(BigDecimal ixbr) {
/* 116 */     this.ixbr = ixbr;
/*     */   }
/*     */   public String getNmxbr() {
/* 119 */     return this.nmxbr;
/*     */   }
/*     */   
/*     */   public void setNmxbr(String nmxbr) {
/* 123 */     this.nmxbr = nmxbr;
/*     */   }
/*     */   public String getCdexbr() {
/* 126 */     return this.cdexbr;
/*     */   }
/*     */   
/*     */   public void setCdexbr(String cdexbr) {
/* 130 */     this.cdexbr = cdexbr;
/*     */   }
/*     */   public String getRmxbr() {
/* 133 */     return this.rmxbr;
/*     */   }
/*     */   
/*     */   public void setRmxbr(String rmxbr) {
/* 137 */     this.rmxbr = rmxbr;
/*     */   }
/*     */   public String getDrs1xa() {
/* 140 */     return this.drs1xa;
/*     */   }
/*     */   
/*     */   public void setDrs1xa(String drs1xa) {
/* 144 */     this.drs1xa = drs1xa;
/*     */   }
/*     */   public String getDrs2xa() {
/* 147 */     return this.drs2xa;
/*     */   }
/*     */   
/*     */   public void setDrs2xa(String drs2xa) {
/* 151 */     this.drs2xa = drs2xa;
/*     */   }
/*     */   public String getDrs3xa() {
/* 154 */     return this.drs3xa;
/*     */   }
/*     */   
/*     */   public void setDrs3xa(String drs3xa) {
/* 158 */     this.drs3xa = drs3xa;
/*     */   }
/*     */   public String getNmxcty() {
/* 161 */     return this.nmxcty;
/*     */   }
/*     */   
/*     */   public void setNmxcty(String nmxcty) {
/* 165 */     this.nmxcty = nmxcty;
/*     */   }
/*     */   public String getNmxst() {
/* 168 */     return this.nmxst;
/*     */   }
/*     */   
/*     */   public void setNmxst(String nmxst) {
/* 172 */     this.nmxst = nmxst;
/*     */   }
/*     */   public String getCntry() {
/* 175 */     return this.cntry;
/*     */   }
/*     */   
/*     */   public void setCntry(String cntry) {
/* 179 */     this.cntry = cntry;
/*     */   }
/*     */   public String getCdexzp() {
/* 182 */     return this.cdexzp;
/*     */   }
/*     */   
/*     */   public void setCdexzp(String cdexzp) {
/* 186 */     this.cdexzp = cdexzp;
/*     */   }
/*     */   public String getRgnxtxxsrvc() {
/* 189 */     return this.rgnxtxxsrvc;
/*     */   }
/*     */   
/*     */   public void setRgnxtxxsrvc(String rgnxtxxsrvc) {
/* 193 */     this.rgnxtxxsrvc = rgnxtxxsrvc;
/*     */   }
/*     */   public String getIxem() {
/* 196 */     return this.ixem;
/*     */   }
/*     */   
/*     */   public void setIxem(String ixem) {
/* 200 */     this.ixem = ixem;
/*     */   }
/*     */   public String getNoxcntct() {
/* 203 */     return this.noxcntct;
/*     */   }
/*     */   
/*     */   public void setNoxcntct(String noxcntct) {
/* 207 */     this.noxcntct = noxcntct;
/*     */   }
/*     */   public String getNoxfx() {
/* 210 */     return this.noxfx;
/*     */   }
/*     */   
/*     */   public void setNoxfx(String noxfx) {
/* 214 */     this.noxfx = noxfx;
/*     */   }
/*     */   public String getNoxmbl() {
/* 217 */     return this.noxmbl;
/*     */   }
/*     */   
/*     */   public void setNoxmbl(String noxmbl) {
/* 221 */     this.noxmbl = noxmbl;
/*     */   }
/*     */   public String getCntctxprsnxbrch() {
/* 224 */     return this.cntctxprsnxbrch;
/*     */   }
/*     */   
/*     */   public void setCntctxprsnxbrch(String cntctxprsnxbrch) {
/* 228 */     this.cntctxprsnxbrch = cntctxprsnxbrch;
/*     */   }
/*     */   public String getFldx1() {
/* 231 */     return this.fldx1;
/*     */   }
/*     */   
/*     */   public void setFldx1(String fldx1) {
/* 235 */     this.fldx1 = fldx1;
/*     */   }
/*     */   public String getFldx2() {
/* 238 */     return this.fldx2;
/*     */   }
/*     */   
/*     */   public void setFldx2(String fldx2) {
/* 242 */     this.fldx2 = fldx2;
/*     */   }
/*     */   public String getFldx3() {
/* 245 */     return this.fldx3;
/*     */   }
/*     */   
/*     */   public void setFldx3(String fldx3) {
/* 249 */     this.fldx3 = fldx3;
/*     */   }
/*     */   public String getFldx4() {
/* 252 */     return this.fldx4;
/*     */   }
/*     */   
/*     */   public void setFldx4(String fldx4) {
/* 256 */     this.fldx4 = fldx4;
/*     */   }
/*     */   public String getFldx5() {
/* 259 */     return this.fldx5;
/*     */   }
/*     */   
/*     */   public void setFldx5(String fldx5) {
/* 263 */     this.fldx5 = fldx5;
/*     */   }
/*     */   public String getFldx6() {
/* 266 */     return this.fldx6;
/*     */   }
/*     */   
/*     */   public void setFldx6(String fldx6) {
/* 270 */     this.fldx6 = fldx6;
/*     */   }
/*     */   public String getFldx7() {
/* 273 */     return this.fldx7;
/*     */   }
/*     */   
/*     */   public void setFldx7(String fldx7) {
/* 277 */     this.fldx7 = fldx7;
/*     */   }
/*     */   public String getFldx8() {
/* 280 */     return this.fldx8;
/*     */   }
/*     */   
/*     */   public void setFldx8(String fldx8) {
/* 284 */     this.fldx8 = fldx8;
/*     */   }
/*     */   public String getFldx9() {
/* 287 */     return this.fldx9;
/*     */   }
/*     */   
/*     */   public void setFldx9(String fldx9) {
/* 291 */     this.fldx9 = fldx9;
/*     */   }
/*     */   public String getFldx10() {
/* 294 */     return this.fldx10;
/*     */   }
/*     */   
/*     */   public void setFldx10(String fldx10) {
/* 298 */     this.fldx10 = fldx10;
/*     */   }
/*     */   public String getFldx11() {
/* 301 */     return this.fldx11;
/*     */   }
/*     */   
/*     */   public void setFldx11(String fldx11) {
/* 305 */     this.fldx11 = fldx11;
/*     */   }
/*     */   public String getFldx12() {
/* 308 */     return this.fldx12;
/*     */   }
/*     */   
/*     */   public void setFldx12(String fldx12) {
/* 312 */     this.fldx12 = fldx12;
/*     */   }
/*     */   public String getFldx13() {
/* 315 */     return this.fldx13;
/*     */   }
/*     */   
/*     */   public void setFldx13(String fldx13) {
/* 319 */     this.fldx13 = fldx13;
/*     */   }
/*     */   public String getFldx14() {
/* 322 */     return this.fldx14;
/*     */   }
/*     */   
/*     */   public void setFldx14(String fldx14) {
/* 326 */     this.fldx14 = fldx14;
/*     */   }
/*     */   public String getFldx15() {
/* 329 */     return this.fldx15;
/*     */   }
/*     */   
/*     */   public void setFldx15(String fldx15) {
/* 333 */     this.fldx15 = fldx15;
/*     */   }
/*     */   public String getFldx16() {
/* 336 */     return this.fldx16;
/*     */   }
/*     */   
/*     */   public void setFldx16(String fldx16) {
/* 340 */     this.fldx16 = fldx16;
/*     */   }
/*     */   public String getFldx17() {
/* 343 */     return this.fldx17;
/*     */   }
/*     */   
/*     */   public void setFldx17(String fldx17) {
/* 347 */     this.fldx17 = fldx17;
/*     */   }
/*     */   public String getFldx18() {
/* 350 */     return this.fldx18;
/*     */   }
/*     */   
/*     */   public void setFldx18(String fldx18) {
/* 354 */     this.fldx18 = fldx18;
/*     */   }
/*     */   public String getFldx19() {
/* 357 */     return this.fldx19;
/*     */   }
/*     */   
/*     */   public void setFldx19(String fldx19) {
/* 361 */     this.fldx19 = fldx19;
/*     */   }
/*     */   public String getFldx20() {
/* 364 */     return this.fldx20;
/*     */   }
/*     */   
/*     */   public void setFldx20(String fldx20) {
/* 368 */     this.fldx20 = fldx20;
/*     */   }
/*     */   public Date getDxctd() {
/* 371 */     return this.dxctd;
/*     */   }
/*     */   
/*     */   public void setDxctd(Date dxctd) {
/* 375 */     this.dxctd = dxctd;
/*     */   }
/*     */   public String getBxctd() {
/* 378 */     return this.bxctd;
/*     */   }
/*     */   
/*     */   public void setBxctd(String bxctd) {
/* 382 */     this.bxctd = bxctd;
/*     */   }
/*     */   public Date getDxmfdxlst() {
/* 385 */     return this.dxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setDxmfdxlst(Date dxmfdxlst) {
/* 389 */     this.dxmfdxlst = dxmfdxlst;
/*     */   }
/*     */   public String getBxmfdxlst() {
/* 392 */     return this.bxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setBxmfdxlst(String bxmfdxlst) {
/* 396 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */   public Set<Dxcstmrxm> getDxcstmrxms() {
/* 399 */     return this.dxcstmrxms;
/*     */   }
/*     */   
/*     */   public void setDxcstmrxms(Set<Dxcstmrxm> dxcstmrxms) {
/* 403 */     this.dxcstmrxms = dxcstmrxms;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Dxbrnchxm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */