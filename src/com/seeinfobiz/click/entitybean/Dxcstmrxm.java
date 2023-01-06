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
/*     */ public class Dxcstmrxm
/*     */   implements Serializable
/*     */ {
/*     */   private BigDecimal ixcst;
/*     */   private Dxbrnchxm dxbrnchxm;
/*     */   private String crn;
/*     */   private String nmxintl;
/*     */   private String nmxfst;
/*     */   private String nmxmdl;
/*     */   private String nmxlst;
/*     */   private Date dob;
/*     */   private String noxpan;
/*     */   private String ocptxn;
/*     */   private String typxcstmr;
/*     */   private String noxcdextrdg;
/*     */   private String cdexclntxunq;
/*     */   private String flxnmn;
/*     */   private String noxhldrxjnt;
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
/*     */   private Long ixprdt;
/*  56 */   private Set<Dxprdtnxdtlsxm> dxprdtnxdtlsxms = new HashSet<Dxprdtnxdtlsxm>(0);
/*  57 */   private Set<Dxcstmrxjntldrxdtls> dxcstmrxjntldrxdtlses = new HashSet<Dxcstmrxjntldrxdtls>(0);
/*  58 */   private Set<Dxtrnsxsmryxm> dxtrnsxsmryxms = new HashSet<Dxtrnsxsmryxm>(0);
/*  59 */   private Set<Dxcstmrxdtls> dxcstmrxdtlses = new HashSet<Dxcstmrxdtls>(0);
/*     */ 
/*     */   
/*     */   public Dxcstmrxm() {}
/*     */ 
/*     */   
/*     */   public Dxcstmrxm(BigDecimal ixcst) {
/*  66 */     this.ixcst = ixcst;
/*     */   }
/*     */   public Dxcstmrxm(BigDecimal ixcst, Dxbrnchxm dxbrnchxm, String crn, String nmxintl, String nmxfst, String nmxmdl, String nmxlst, Date dob, String noxpan, String ocptxn, String typxcstmr, String noxcdextrdg, String cdexclntxunq, String flxnmn, String noxhldrxjnt, String fldx1, String fldx2, String fldx3, String fldx4, String fldx5, String fldx6, String fldx7, String fldx8, String fldx9, String fldx10, String fldx11, String fldx12, String fldx13, String fldx14, String fldx15, String fldx16, String fldx17, String fldx18, String fldx19, String fldx20, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst, Set<Dxprdtnxdtlsxm> dxprdtnxdtlsxms, Set<Dxcstmrxjntldrxdtls> dxcstmrxjntldrxdtlses, Set<Dxtrnsxsmryxm> dxtrnsxsmryxms, Set<Dxcstmrxdtls> dxcstmrxdtlses, Long ixprdt) {
/*  69 */     this.ixcst = ixcst;
/*  70 */     this.dxbrnchxm = dxbrnchxm;
/*  71 */     this.crn = crn;
/*  72 */     this.nmxintl = nmxintl;
/*  73 */     this.nmxfst = nmxfst;
/*  74 */     this.nmxmdl = nmxmdl;
/*  75 */     this.nmxlst = nmxlst;
/*  76 */     this.dob = dob;
/*  77 */     this.noxpan = noxpan;
/*  78 */     this.ocptxn = ocptxn;
/*  79 */     this.typxcstmr = typxcstmr;
/*  80 */     this.noxcdextrdg = noxcdextrdg;
/*  81 */     this.cdexclntxunq = cdexclntxunq;
/*  82 */     this.flxnmn = flxnmn;
/*  83 */     this.noxhldrxjnt = noxhldrxjnt;
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
/* 108 */     this.dxprdtnxdtlsxms = dxprdtnxdtlsxms;
/* 109 */     this.dxcstmrxjntldrxdtlses = dxcstmrxjntldrxdtlses;
/* 110 */     this.dxtrnsxsmryxms = dxtrnsxsmryxms;
/* 111 */     this.dxcstmrxdtlses = dxcstmrxdtlses;
/* 112 */     this.ixprdt = ixprdt;
/*     */   }
/*     */   
/*     */   public BigDecimal getIxcst() {
/* 116 */     return this.ixcst;
/*     */   }
/*     */   
/*     */   public void setIxcst(BigDecimal ixcst) {
/* 120 */     this.ixcst = ixcst;
/*     */   }
/*     */   public Dxbrnchxm getDxbrnchxm() {
/* 123 */     return this.dxbrnchxm;
/*     */   }
/*     */   
/*     */   public void setDxbrnchxm(Dxbrnchxm dxbrnchxm) {
/* 127 */     this.dxbrnchxm = dxbrnchxm;
/*     */   }
/*     */   public String getCrn() {
/* 130 */     return this.crn;
/*     */   }
/*     */   
/*     */   public void setCrn(String crn) {
/* 134 */     this.crn = crn;
/*     */   }
/*     */   public String getNmxintl() {
/* 137 */     return this.nmxintl;
/*     */   }
/*     */   
/*     */   public void setNmxintl(String nmxintl) {
/* 141 */     this.nmxintl = nmxintl;
/*     */   }
/*     */   public String getNmxfst() {
/* 144 */     return this.nmxfst;
/*     */   }
/*     */   
/*     */   public void setNmxfst(String nmxfst) {
/* 148 */     this.nmxfst = nmxfst;
/*     */   }
/*     */   public String getNmxmdl() {
/* 151 */     return this.nmxmdl;
/*     */   }
/*     */   
/*     */   public void setNmxmdl(String nmxmdl) {
/* 155 */     this.nmxmdl = nmxmdl;
/*     */   }
/*     */   public String getNmxlst() {
/* 158 */     return this.nmxlst;
/*     */   }
/*     */   
/*     */   public void setNmxlst(String nmxlst) {
/* 162 */     this.nmxlst = nmxlst;
/*     */   }
/*     */   public Date getDob() {
/* 165 */     return this.dob;
/*     */   }
/*     */   
/*     */   public void setDob(Date dob) {
/* 169 */     this.dob = dob;
/*     */   }
/*     */   public String getNoxpan() {
/* 172 */     return this.noxpan;
/*     */   }
/*     */   
/*     */   public void setNoxpan(String noxpan) {
/* 176 */     this.noxpan = noxpan;
/*     */   }
/*     */   public String getOcptxn() {
/* 179 */     return this.ocptxn;
/*     */   }
/*     */   
/*     */   public void setOcptxn(String ocptxn) {
/* 183 */     this.ocptxn = ocptxn;
/*     */   }
/*     */   public String getTypxcstmr() {
/* 186 */     return this.typxcstmr;
/*     */   }
/*     */   
/*     */   public void setTypxcstmr(String typxcstmr) {
/* 190 */     this.typxcstmr = typxcstmr;
/*     */   }
/*     */   public String getNoxcdextrdg() {
/* 193 */     return this.noxcdextrdg;
/*     */   }
/*     */   
/*     */   public void setNoxcdextrdg(String noxcdextrdg) {
/* 197 */     this.noxcdextrdg = noxcdextrdg;
/*     */   }
/*     */   public String getCdexclntxunq() {
/* 200 */     return this.cdexclntxunq;
/*     */   }
/*     */   
/*     */   public void setCdexclntxunq(String cdexclntxunq) {
/* 204 */     this.cdexclntxunq = cdexclntxunq;
/*     */   }
/*     */   public String getFlxnmn() {
/* 207 */     return this.flxnmn;
/*     */   }
/*     */   
/*     */   public void setFlxnmn(String flxnmn) {
/* 211 */     this.flxnmn = flxnmn;
/*     */   }
/*     */   public String getNoxhldrxjnt() {
/* 214 */     return this.noxhldrxjnt;
/*     */   }
/*     */   
/*     */   public void setNoxhldrxjnt(String noxhldrxjnt) {
/* 218 */     this.noxhldrxjnt = noxhldrxjnt;
/*     */   }
/*     */   public String getFldx1() {
/* 221 */     return this.fldx1;
/*     */   }
/*     */   
/*     */   public void setFldx1(String fldx1) {
/* 225 */     this.fldx1 = fldx1;
/*     */   }
/*     */   public String getFldx2() {
/* 228 */     return this.fldx2;
/*     */   }
/*     */   
/*     */   public void setFldx2(String fldx2) {
/* 232 */     this.fldx2 = fldx2;
/*     */   }
/*     */   public String getFldx3() {
/* 235 */     return this.fldx3;
/*     */   }
/*     */   
/*     */   public void setFldx3(String fldx3) {
/* 239 */     this.fldx3 = fldx3;
/*     */   }
/*     */   public String getFldx4() {
/* 242 */     return this.fldx4;
/*     */   }
/*     */   
/*     */   public void setFldx4(String fldx4) {
/* 246 */     this.fldx4 = fldx4;
/*     */   }
/*     */   public String getFldx5() {
/* 249 */     return this.fldx5;
/*     */   }
/*     */   
/*     */   public void setFldx5(String fldx5) {
/* 253 */     this.fldx5 = fldx5;
/*     */   }
/*     */   public String getFldx6() {
/* 256 */     return this.fldx6;
/*     */   }
/*     */   
/*     */   public void setFldx6(String fldx6) {
/* 260 */     this.fldx6 = fldx6;
/*     */   }
/*     */   public String getFldx7() {
/* 263 */     return this.fldx7;
/*     */   }
/*     */   
/*     */   public void setFldx7(String fldx7) {
/* 267 */     this.fldx7 = fldx7;
/*     */   }
/*     */   public String getFldx8() {
/* 270 */     return this.fldx8;
/*     */   }
/*     */   
/*     */   public void setFldx8(String fldx8) {
/* 274 */     this.fldx8 = fldx8;
/*     */   }
/*     */   public String getFldx9() {
/* 277 */     return this.fldx9;
/*     */   }
/*     */   
/*     */   public void setFldx9(String fldx9) {
/* 281 */     this.fldx9 = fldx9;
/*     */   }
/*     */   public String getFldx10() {
/* 284 */     return this.fldx10;
/*     */   }
/*     */   
/*     */   public void setFldx10(String fldx10) {
/* 288 */     this.fldx10 = fldx10;
/*     */   }
/*     */   public String getFldx11() {
/* 291 */     return this.fldx11;
/*     */   }
/*     */   
/*     */   public void setFldx11(String fldx11) {
/* 295 */     this.fldx11 = fldx11;
/*     */   }
/*     */   public String getFldx12() {
/* 298 */     return this.fldx12;
/*     */   }
/*     */   
/*     */   public void setFldx12(String fldx12) {
/* 302 */     this.fldx12 = fldx12;
/*     */   }
/*     */   public String getFldx13() {
/* 305 */     return this.fldx13;
/*     */   }
/*     */   
/*     */   public void setFldx13(String fldx13) {
/* 309 */     this.fldx13 = fldx13;
/*     */   }
/*     */   public String getFldx14() {
/* 312 */     return this.fldx14;
/*     */   }
/*     */   
/*     */   public void setFldx14(String fldx14) {
/* 316 */     this.fldx14 = fldx14;
/*     */   }
/*     */   public String getFldx15() {
/* 319 */     return this.fldx15;
/*     */   }
/*     */   
/*     */   public void setFldx15(String fldx15) {
/* 323 */     this.fldx15 = fldx15;
/*     */   }
/*     */   public String getFldx16() {
/* 326 */     return this.fldx16;
/*     */   }
/*     */   
/*     */   public void setFldx16(String fldx16) {
/* 330 */     this.fldx16 = fldx16;
/*     */   }
/*     */   public String getFldx17() {
/* 333 */     return this.fldx17;
/*     */   }
/*     */   
/*     */   public void setFldx17(String fldx17) {
/* 337 */     this.fldx17 = fldx17;
/*     */   }
/*     */   public String getFldx18() {
/* 340 */     return this.fldx18;
/*     */   }
/*     */   
/*     */   public void setFldx18(String fldx18) {
/* 344 */     this.fldx18 = fldx18;
/*     */   }
/*     */   public String getFldx19() {
/* 347 */     return this.fldx19;
/*     */   }
/*     */   
/*     */   public void setFldx19(String fldx19) {
/* 351 */     this.fldx19 = fldx19;
/*     */   }
/*     */   public String getFldx20() {
/* 354 */     return this.fldx20;
/*     */   }
/*     */   
/*     */   public void setFldx20(String fldx20) {
/* 358 */     this.fldx20 = fldx20;
/*     */   }
/*     */   public Date getDxctd() {
/* 361 */     return this.dxctd;
/*     */   }
/*     */   
/*     */   public void setDxctd(Date dxctd) {
/* 365 */     this.dxctd = dxctd;
/*     */   }
/*     */   public String getBxctd() {
/* 368 */     return this.bxctd;
/*     */   }
/*     */   
/*     */   public void setBxctd(String bxctd) {
/* 372 */     this.bxctd = bxctd;
/*     */   }
/*     */   public Date getDxmfdxlst() {
/* 375 */     return this.dxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setDxmfdxlst(Date dxmfdxlst) {
/* 379 */     this.dxmfdxlst = dxmfdxlst;
/*     */   }
/*     */   public String getBxmfdxlst() {
/* 382 */     return this.bxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setBxmfdxlst(String bxmfdxlst) {
/* 386 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */   public Set<Dxprdtnxdtlsxm> getDxprdtnxdtlsxms() {
/* 389 */     return this.dxprdtnxdtlsxms;
/*     */   }
/*     */   
/*     */   public void setDxprdtnxdtlsxms(Set<Dxprdtnxdtlsxm> dxprdtnxdtlsxms) {
/* 393 */     this.dxprdtnxdtlsxms = dxprdtnxdtlsxms;
/*     */   }
/*     */   public Set<Dxcstmrxjntldrxdtls> getDxcstmrxjntldrxdtlses() {
/* 396 */     return this.dxcstmrxjntldrxdtlses;
/*     */   }
/*     */   
/*     */   public void setDxcstmrxjntldrxdtlses(Set<Dxcstmrxjntldrxdtls> dxcstmrxjntldrxdtlses) {
/* 400 */     this.dxcstmrxjntldrxdtlses = dxcstmrxjntldrxdtlses;
/*     */   }
/*     */   public Set<Dxtrnsxsmryxm> getDxtrnsxsmryxms() {
/* 403 */     return this.dxtrnsxsmryxms;
/*     */   }
/*     */   
/*     */   public void setDxtrnsxsmryxms(Set<Dxtrnsxsmryxm> dxtrnsxsmryxms) {
/* 407 */     this.dxtrnsxsmryxms = dxtrnsxsmryxms;
/*     */   }
/*     */   public Set<Dxcstmrxdtls> getDxcstmrxdtlses() {
/* 410 */     return this.dxcstmrxdtlses;
/*     */   }
/*     */   
/*     */   public void setDxcstmrxdtlses(Set<Dxcstmrxdtls> dxcstmrxdtlses) {
/* 414 */     this.dxcstmrxdtlses = dxcstmrxdtlses;
/*     */   }
/*     */   
/*     */   public Long getIxprdt() {
/* 418 */     return this.ixprdt;
/*     */   }
/*     */   
/*     */   public void setIxprdt(Long ixprdt) {
/* 422 */     this.ixprdt = ixprdt;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Dxcstmrxm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */