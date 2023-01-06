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
/*     */ public class Dxtrnsxsmryxm
/*     */   implements Serializable
/*     */ {
/*     */   private BigDecimal ixsmryxtrns;
/*     */   private Dxcstmrxm dxcstmrxm;
/*     */   private Pxprdctxm pxprdctxm;
/*     */   private BigDecimal noxact;
/*     */   private Date dxst;
/*     */   private Date dxfrmxst;
/*     */   private Date dxtoxst;
/*     */   private String cdexcrncy;
/*     */   private BigDecimal amtxln;
/*     */   private String dtlsxnmn;
/*     */   private String acntxstts;
/*     */   private BigDecimal balxopng;
/*     */   private BigDecimal balxclsg;
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
/*  53 */   private Set<Dxdmtxsmry> dxdmtxsmries = new HashSet<Dxdmtxsmry>(0);
/*  54 */   private Set<Dxtelomxsmry> dxtelomxsmries = new HashSet<Dxtelomxsmry>(0);
/*  55 */   private Set<Dxtrnsxccxsmry> dxtrnsxccxsmries = new HashSet<Dxtrnsxccxsmry>(0);
/*  56 */   private Set<Dxtrnsxdtls> dxtrnsxdtlses = new HashSet<Dxtrnsxdtls>(0);
/*  57 */   private Set<Dxinsuxsmry> dxinsuxsmries = new HashSet<Dxinsuxsmry>(0);
/*  58 */   private Set<Dxtrnsxchrgxdtls> dxtrnsxchrgxdtlses = new HashSet<Dxtrnsxchrgxdtls>(0);
/*  59 */   private Set<Dxtrnsxsmryxdtls> dxtrnsxsmryxdtlses = new HashSet<Dxtrnsxsmryxdtls>(0);
/*     */ 
/*     */   
/*     */   public Dxtrnsxsmryxm() {}
/*     */ 
/*     */   
/*     */   public Dxtrnsxsmryxm(BigDecimal ixsmryxtrns) {
/*  66 */     this.ixsmryxtrns = ixsmryxtrns;
/*     */   }
/*     */   public Dxtrnsxsmryxm(BigDecimal ixsmryxtrns, Dxcstmrxm dxcstmrxm, Pxprdctxm pxprdctxm, BigDecimal noxact, Date dxst, Date dxfrmxst, Date dxtoxst, String cdexcrncy, BigDecimal amtxln, String dtlsxnmn, String acntxstts, BigDecimal balxopng, BigDecimal balxclsg, String fldx1, String fldx2, String fldx3, String fldx4, String fldx5, String fldx6, String fldx7, String fldx8, String fldx9, String fldx10, String fldx11, String fldx12, String fldx13, String fldx14, String fldx15, String fldx16, String fldx17, String fldx18, String fldx19, String fldx20, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst, Set<Dxdmtxsmry> dxdmtxsmries, Set<Dxtelomxsmry> dxtelomxsmries, Set<Dxtrnsxccxsmry> dxtrnsxccxsmries, Set<Dxtrnsxdtls> dxtrnsxdtlses, Set<Dxinsuxsmry> dxinsuxsmries, Set<Dxtrnsxchrgxdtls> dxtrnsxchrgxdtlses, Set<Dxtrnsxsmryxdtls> dxtrnsxsmryxdtlses) {
/*  69 */     this.ixsmryxtrns = ixsmryxtrns;
/*  70 */     this.dxcstmrxm = dxcstmrxm;
/*  71 */     this.pxprdctxm = pxprdctxm;
/*  72 */     this.noxact = noxact;
/*  73 */     this.dxst = dxst;
/*  74 */     this.dxfrmxst = dxfrmxst;
/*  75 */     this.dxtoxst = dxtoxst;
/*  76 */     this.cdexcrncy = cdexcrncy;
/*  77 */     this.amtxln = amtxln;
/*  78 */     this.dtlsxnmn = dtlsxnmn;
/*  79 */     this.acntxstts = acntxstts;
/*  80 */     this.balxopng = balxopng;
/*  81 */     this.balxclsg = balxclsg;
/*  82 */     this.fldx1 = fldx1;
/*  83 */     this.fldx2 = fldx2;
/*  84 */     this.fldx3 = fldx3;
/*  85 */     this.fldx4 = fldx4;
/*  86 */     this.fldx5 = fldx5;
/*  87 */     this.fldx6 = fldx6;
/*  88 */     this.fldx7 = fldx7;
/*  89 */     this.fldx8 = fldx8;
/*  90 */     this.fldx9 = fldx9;
/*  91 */     this.fldx10 = fldx10;
/*  92 */     this.fldx11 = fldx11;
/*  93 */     this.fldx12 = fldx12;
/*  94 */     this.fldx13 = fldx13;
/*  95 */     this.fldx14 = fldx14;
/*  96 */     this.fldx15 = fldx15;
/*  97 */     this.fldx16 = fldx16;
/*  98 */     this.fldx17 = fldx17;
/*  99 */     this.fldx18 = fldx18;
/* 100 */     this.fldx19 = fldx19;
/* 101 */     this.fldx20 = fldx20;
/* 102 */     this.dxctd = dxctd;
/* 103 */     this.bxctd = bxctd;
/* 104 */     this.dxmfdxlst = dxmfdxlst;
/* 105 */     this.bxmfdxlst = bxmfdxlst;
/* 106 */     this.dxdmtxsmries = dxdmtxsmries;
/* 107 */     this.dxtelomxsmries = dxtelomxsmries;
/* 108 */     this.dxtrnsxccxsmries = dxtrnsxccxsmries;
/* 109 */     this.dxtrnsxdtlses = dxtrnsxdtlses;
/* 110 */     this.dxinsuxsmries = dxinsuxsmries;
/* 111 */     this.dxtrnsxchrgxdtlses = dxtrnsxchrgxdtlses;
/* 112 */     this.dxtrnsxsmryxdtlses = dxtrnsxsmryxdtlses;
/*     */   }
/*     */   
/*     */   public BigDecimal getIxsmryxtrns() {
/* 116 */     return this.ixsmryxtrns;
/*     */   }
/*     */   
/*     */   public void setIxsmryxtrns(BigDecimal ixsmryxtrns) {
/* 120 */     this.ixsmryxtrns = ixsmryxtrns;
/*     */   }
/*     */   public Dxcstmrxm getDxcstmrxm() {
/* 123 */     return this.dxcstmrxm;
/*     */   }
/*     */   
/*     */   public void setDxcstmrxm(Dxcstmrxm dxcstmrxm) {
/* 127 */     this.dxcstmrxm = dxcstmrxm;
/*     */   }
/*     */   public Pxprdctxm getPxprdctxm() {
/* 130 */     return this.pxprdctxm;
/*     */   }
/*     */   
/*     */   public void setPxprdctxm(Pxprdctxm pxprdctxm) {
/* 134 */     this.pxprdctxm = pxprdctxm;
/*     */   }
/*     */   public BigDecimal getNoxact() {
/* 137 */     return this.noxact;
/*     */   }
/*     */   
/*     */   public void setNoxact(BigDecimal noxact) {
/* 141 */     this.noxact = noxact;
/*     */   }
/*     */   public Date getDxst() {
/* 144 */     return this.dxst;
/*     */   }
/*     */   
/*     */   public void setDxst(Date dxst) {
/* 148 */     this.dxst = dxst;
/*     */   }
/*     */   public Date getDxfrmxst() {
/* 151 */     return this.dxfrmxst;
/*     */   }
/*     */   
/*     */   public void setDxfrmxst(Date dxfrmxst) {
/* 155 */     this.dxfrmxst = dxfrmxst;
/*     */   }
/*     */   public Date getDxtoxst() {
/* 158 */     return this.dxtoxst;
/*     */   }
/*     */   
/*     */   public void setDxtoxst(Date dxtoxst) {
/* 162 */     this.dxtoxst = dxtoxst;
/*     */   }
/*     */   public String getCdexcrncy() {
/* 165 */     return this.cdexcrncy;
/*     */   }
/*     */   
/*     */   public void setCdexcrncy(String cdexcrncy) {
/* 169 */     this.cdexcrncy = cdexcrncy;
/*     */   }
/*     */   public BigDecimal getAmtxln() {
/* 172 */     return this.amtxln;
/*     */   }
/*     */   
/*     */   public void setAmtxln(BigDecimal amtxln) {
/* 176 */     this.amtxln = amtxln;
/*     */   }
/*     */   public String getDtlsxnmn() {
/* 179 */     return this.dtlsxnmn;
/*     */   }
/*     */   
/*     */   public void setDtlsxnmn(String dtlsxnmn) {
/* 183 */     this.dtlsxnmn = dtlsxnmn;
/*     */   }
/*     */   public String getAcntxstts() {
/* 186 */     return this.acntxstts;
/*     */   }
/*     */   
/*     */   public void setAcntxstts(String acntxstts) {
/* 190 */     this.acntxstts = acntxstts;
/*     */   }
/*     */   public BigDecimal getBalxopng() {
/* 193 */     return this.balxopng;
/*     */   }
/*     */   
/*     */   public void setBalxopng(BigDecimal balxopng) {
/* 197 */     this.balxopng = balxopng;
/*     */   }
/*     */   public BigDecimal getBalxclsg() {
/* 200 */     return this.balxclsg;
/*     */   }
/*     */   
/*     */   public void setBalxclsg(BigDecimal balxclsg) {
/* 204 */     this.balxclsg = balxclsg;
/*     */   }
/*     */   public String getFldx1() {
/* 207 */     return this.fldx1;
/*     */   }
/*     */   
/*     */   public void setFldx1(String fldx1) {
/* 211 */     this.fldx1 = fldx1;
/*     */   }
/*     */   public String getFldx2() {
/* 214 */     return this.fldx2;
/*     */   }
/*     */   
/*     */   public void setFldx2(String fldx2) {
/* 218 */     this.fldx2 = fldx2;
/*     */   }
/*     */   public String getFldx3() {
/* 221 */     return this.fldx3;
/*     */   }
/*     */   
/*     */   public void setFldx3(String fldx3) {
/* 225 */     this.fldx3 = fldx3;
/*     */   }
/*     */   public String getFldx4() {
/* 228 */     return this.fldx4;
/*     */   }
/*     */   
/*     */   public void setFldx4(String fldx4) {
/* 232 */     this.fldx4 = fldx4;
/*     */   }
/*     */   public String getFldx5() {
/* 235 */     return this.fldx5;
/*     */   }
/*     */   
/*     */   public void setFldx5(String fldx5) {
/* 239 */     this.fldx5 = fldx5;
/*     */   }
/*     */   public String getFldx6() {
/* 242 */     return this.fldx6;
/*     */   }
/*     */   
/*     */   public void setFldx6(String fldx6) {
/* 246 */     this.fldx6 = fldx6;
/*     */   }
/*     */   public String getFldx7() {
/* 249 */     return this.fldx7;
/*     */   }
/*     */   
/*     */   public void setFldx7(String fldx7) {
/* 253 */     this.fldx7 = fldx7;
/*     */   }
/*     */   public String getFldx8() {
/* 256 */     return this.fldx8;
/*     */   }
/*     */   
/*     */   public void setFldx8(String fldx8) {
/* 260 */     this.fldx8 = fldx8;
/*     */   }
/*     */   public String getFldx9() {
/* 263 */     return this.fldx9;
/*     */   }
/*     */   
/*     */   public void setFldx9(String fldx9) {
/* 267 */     this.fldx9 = fldx9;
/*     */   }
/*     */   public String getFldx10() {
/* 270 */     return this.fldx10;
/*     */   }
/*     */   
/*     */   public void setFldx10(String fldx10) {
/* 274 */     this.fldx10 = fldx10;
/*     */   }
/*     */   public String getFldx11() {
/* 277 */     return this.fldx11;
/*     */   }
/*     */   
/*     */   public void setFldx11(String fldx11) {
/* 281 */     this.fldx11 = fldx11;
/*     */   }
/*     */   public String getFldx12() {
/* 284 */     return this.fldx12;
/*     */   }
/*     */   
/*     */   public void setFldx12(String fldx12) {
/* 288 */     this.fldx12 = fldx12;
/*     */   }
/*     */   public String getFldx13() {
/* 291 */     return this.fldx13;
/*     */   }
/*     */   
/*     */   public void setFldx13(String fldx13) {
/* 295 */     this.fldx13 = fldx13;
/*     */   }
/*     */   public String getFldx14() {
/* 298 */     return this.fldx14;
/*     */   }
/*     */   
/*     */   public void setFldx14(String fldx14) {
/* 302 */     this.fldx14 = fldx14;
/*     */   }
/*     */   public String getFldx15() {
/* 305 */     return this.fldx15;
/*     */   }
/*     */   
/*     */   public void setFldx15(String fldx15) {
/* 309 */     this.fldx15 = fldx15;
/*     */   }
/*     */   public String getFldx16() {
/* 312 */     return this.fldx16;
/*     */   }
/*     */   
/*     */   public void setFldx16(String fldx16) {
/* 316 */     this.fldx16 = fldx16;
/*     */   }
/*     */   public String getFldx17() {
/* 319 */     return this.fldx17;
/*     */   }
/*     */   
/*     */   public void setFldx17(String fldx17) {
/* 323 */     this.fldx17 = fldx17;
/*     */   }
/*     */   public String getFldx18() {
/* 326 */     return this.fldx18;
/*     */   }
/*     */   
/*     */   public void setFldx18(String fldx18) {
/* 330 */     this.fldx18 = fldx18;
/*     */   }
/*     */   public String getFldx19() {
/* 333 */     return this.fldx19;
/*     */   }
/*     */   
/*     */   public void setFldx19(String fldx19) {
/* 337 */     this.fldx19 = fldx19;
/*     */   }
/*     */   public String getFldx20() {
/* 340 */     return this.fldx20;
/*     */   }
/*     */   
/*     */   public void setFldx20(String fldx20) {
/* 344 */     this.fldx20 = fldx20;
/*     */   }
/*     */   public Date getDxctd() {
/* 347 */     return this.dxctd;
/*     */   }
/*     */   
/*     */   public void setDxctd(Date dxctd) {
/* 351 */     this.dxctd = dxctd;
/*     */   }
/*     */   public String getBxctd() {
/* 354 */     return this.bxctd;
/*     */   }
/*     */   
/*     */   public void setBxctd(String bxctd) {
/* 358 */     this.bxctd = bxctd;
/*     */   }
/*     */   public Date getDxmfdxlst() {
/* 361 */     return this.dxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setDxmfdxlst(Date dxmfdxlst) {
/* 365 */     this.dxmfdxlst = dxmfdxlst;
/*     */   }
/*     */   public String getBxmfdxlst() {
/* 368 */     return this.bxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setBxmfdxlst(String bxmfdxlst) {
/* 372 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */   public Set<Dxdmtxsmry> getDxdmtxsmries() {
/* 375 */     return this.dxdmtxsmries;
/*     */   }
/*     */   
/*     */   public void setDxdmtxsmries(Set<Dxdmtxsmry> dxdmtxsmries) {
/* 379 */     this.dxdmtxsmries = dxdmtxsmries;
/*     */   }
/*     */   public Set<Dxtelomxsmry> getDxtelomxsmries() {
/* 382 */     return this.dxtelomxsmries;
/*     */   }
/*     */   
/*     */   public void setDxtelomxsmries(Set<Dxtelomxsmry> dxtelomxsmries) {
/* 386 */     this.dxtelomxsmries = dxtelomxsmries;
/*     */   }
/*     */   public Set<Dxtrnsxccxsmry> getDxtrnsxccxsmries() {
/* 389 */     return this.dxtrnsxccxsmries;
/*     */   }
/*     */   
/*     */   public void setDxtrnsxccxsmries(Set<Dxtrnsxccxsmry> dxtrnsxccxsmries) {
/* 393 */     this.dxtrnsxccxsmries = dxtrnsxccxsmries;
/*     */   }
/*     */   public Set<Dxtrnsxdtls> getDxtrnsxdtlses() {
/* 396 */     return this.dxtrnsxdtlses;
/*     */   }
/*     */   
/*     */   public void setDxtrnsxdtlses(Set<Dxtrnsxdtls> dxtrnsxdtlses) {
/* 400 */     this.dxtrnsxdtlses = dxtrnsxdtlses;
/*     */   }
/*     */   public Set<Dxinsuxsmry> getDxinsuxsmries() {
/* 403 */     return this.dxinsuxsmries;
/*     */   }
/*     */   
/*     */   public void setDxinsuxsmries(Set<Dxinsuxsmry> dxinsuxsmries) {
/* 407 */     this.dxinsuxsmries = dxinsuxsmries;
/*     */   }
/*     */   public Set<Dxtrnsxchrgxdtls> getDxtrnsxchrgxdtlses() {
/* 410 */     return this.dxtrnsxchrgxdtlses;
/*     */   }
/*     */   
/*     */   public void setDxtrnsxchrgxdtlses(Set<Dxtrnsxchrgxdtls> dxtrnsxchrgxdtlses) {
/* 414 */     this.dxtrnsxchrgxdtlses = dxtrnsxchrgxdtlses;
/*     */   }
/*     */   public Set<Dxtrnsxsmryxdtls> getDxtrnsxsmryxdtlses() {
/* 417 */     return this.dxtrnsxsmryxdtlses;
/*     */   }
/*     */   
/*     */   public void setDxtrnsxsmryxdtlses(Set<Dxtrnsxsmryxdtls> dxtrnsxsmryxdtlses) {
/* 421 */     this.dxtrnsxsmryxdtlses = dxtrnsxsmryxdtlses;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Dxtrnsxsmryxm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */