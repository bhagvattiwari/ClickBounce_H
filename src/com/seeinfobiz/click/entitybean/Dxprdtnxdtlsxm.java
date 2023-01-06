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
/*     */ 
/*     */ public class Dxprdtnxdtlsxm
/*     */   implements Serializable
/*     */ {
/*     */   private Long ixprdtn;
/*     */   private Pxprdctxm pxprdctxm;
/*     */   private String crn;
/*     */   private Long noxacnt;
/*     */   private Long ixstmt;
/*     */   private Date dxstmt;
/*     */   private String nmxstmt;
/*     */   private String lctnxstmt;
/*     */   private String nmxstmtwol;
/*     */   private String lctnxstmtwol;
/*     */   private String fxerrxgnrtn;
/*     */   private Long ixprcs;
/*     */   private Date dxprcs;
/*     */   private String ixem;
/*     */   private String ixemxalt;
/*     */   private String ixemxtmp;
/*     */   private String rfrncxflxcntntxem;
/*     */   private Long ixbncdxhrdxsft;
/*     */   private Date dxbncdxem;
/*     */   private String fxbncdxem;
/*     */   private Long cntxrsntxem;
/*     */   private String fxrsntxem;
/*     */   private Date dxsntxem;
/*     */   private String fxsntxem;
/*     */   private Date dxsntxemxtmp;
/*     */   private String fxsntxemxtmp;
/*     */   private Date dxsntxfx;
/*     */   private String fxsntxfx;
/*     */   private Date dxprntxstmt;
/*     */   private String fxprntxstmt;
/*     */   private Long ixerlbxbncxem;
/*     */   private Long ixrlxm;
/*     */   private Long ixcfgxem;
/*     */   private String mdxgxgen;
/*     */   private String mdxrxgen;
/*     */   private String mdxpxgen;
/*     */   private String tmpxdsgn;
/*     */   private String fxgen;
/*     */   private String fxtrnc;
/*     */   private String fldx4;
/*     */   private String fldx5;
/*     */   private String NMXSTMTEML;
/*     */   private String LCTNXSTMTEML;
/*     */   private String LCTNXSTMTPRNT;
/*     */   private String NMXSTMTPRNT;
/*     */   private String NMXSTMTXMSK;
/*     */   private String fldx11;
/*     */   private String fldx12;
/*     */   private String GRPXLGO;
/*     */   private String ACNTXTYP;
/*     */   private String FXTXTXGEN;
/*     */   private Long fldx16;
/*     */   private Date fldx17;
/*     */   private String fldx18;
/*     */   private String fldx19;
/*     */   private String fldx20;
/*     */   private Date dxctd;
/*     */   private String bxctd;
/*     */   private Date dxmfdxlst;
/*     */   private String bxmfdxlst;
/*     */   private String flxchnlxdlvy;
/*     */   private String drxrcptxflg;
/*     */   private String rdxrcptxflg;
/*     */   private String fxerrxgnrtnxwo;
/*     */   private String cxfile;
/*     */   
/*     */   public Dxprdtnxdtlsxm() {}
/*     */   
/*     */   public Dxprdtnxdtlsxm(Long ixprdtn) {
/*  86 */     this.ixprdtn = ixprdtn;
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
/*     */   public Dxprdtnxdtlsxm(Long ixprdtn, Pxprdctxm pxprdctxm, String crn, Long noxacnt, Long ixstmt, Date dxstmt, String nmxstmt, String lctnxstmt, String fxerrxgnrtn, Long ixprcs, Date dxprcs, String ixem, String ixemxalt, String ixemxtmp, String rfrncxflxcntntxem, Long ixbncdxhrdxsft, Date dxbncdxem, String fxbncdxem, Long cntxrsntxem, String fxrsntxem, Date dxsntxem, String fxsntxem, Date dxsntxemxtmp, String fxsntxemxtmp, Date dxsntxfx, String fxsntxfx, Date dxprntxstmt, String fxprntxstmt, Long ixerlbxbncxem, Long ixrlxm, Long ixcfgxem, String mdxgxgen, String mdxrxgen, String mdxpxgen, String tmpxdsgn, String fxgen, String fxtrnc, String fldx4, String fldx5, String NMXSTMTEML, String LCTNXSTMTEML, String LCTNXSTMTPRNT, String NMXSTMTPRNT, String NMXSTMTXMSK, String fldx11, String fldx12, String GRPXLGO, String ACNTXTYP, String FXTXTXGEN, Long fldx16, Date fldx17, String fldx18, String fldx19, String fldx20, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst, String flxchnlxdlvy, String rdxrcptxflg, String drxrcptxflg, String fxerrxgnrtnxwo, String nmxstmtwol, String lctnxstmtwol) {
/*  98 */     this.ixprdtn = ixprdtn;
/*  99 */     this.pxprdctxm = pxprdctxm;
/* 100 */     this.crn = crn;
/* 101 */     this.noxacnt = noxacnt;
/* 102 */     this.ixstmt = ixstmt;
/* 103 */     this.dxstmt = dxstmt;
/* 104 */     this.nmxstmt = nmxstmt;
/* 105 */     this.lctnxstmt = lctnxstmt;
/* 106 */     this.nmxstmtwol = nmxstmtwol;
/* 107 */     this.lctnxstmtwol = lctnxstmtwol;
/* 108 */     this.fxerrxgnrtn = fxerrxgnrtn;
/* 109 */     this.ixprcs = ixprcs;
/* 110 */     this.dxprcs = dxprcs;
/* 111 */     this.ixem = ixem;
/* 112 */     this.ixemxalt = ixemxalt;
/* 113 */     this.ixemxtmp = ixemxtmp;
/* 114 */     this.rfrncxflxcntntxem = rfrncxflxcntntxem;
/* 115 */     this.ixbncdxhrdxsft = ixbncdxhrdxsft;
/* 116 */     this.dxbncdxem = dxbncdxem;
/* 117 */     this.fxbncdxem = fxbncdxem;
/* 118 */     this.cntxrsntxem = cntxrsntxem;
/* 119 */     this.fxrsntxem = fxrsntxem;
/* 120 */     this.dxsntxem = dxsntxem;
/* 121 */     this.fxsntxem = fxsntxem;
/* 122 */     this.dxsntxemxtmp = dxsntxemxtmp;
/* 123 */     this.fxsntxemxtmp = fxsntxemxtmp;
/* 124 */     this.dxsntxfx = dxsntxfx;
/* 125 */     this.fxsntxfx = fxsntxfx;
/* 126 */     this.dxprntxstmt = dxprntxstmt;
/* 127 */     this.fxprntxstmt = fxprntxstmt;
/* 128 */     this.ixerlbxbncxem = ixerlbxbncxem;
/* 129 */     this.ixrlxm = ixrlxm;
/* 130 */     this.ixcfgxem = ixcfgxem;
/* 131 */     this.mdxgxgen = mdxgxgen;
/* 132 */     this.mdxrxgen = mdxrxgen;
/* 133 */     this.mdxpxgen = mdxpxgen;
/* 134 */     this.tmpxdsgn = tmpxdsgn;
/* 135 */     this.fxgen = fxgen;
/* 136 */     this.fxtrnc = fxtrnc;
/* 137 */     this.fldx4 = fldx4;
/* 138 */     this.fldx5 = fldx5;
/* 139 */     this.NMXSTMTEML = NMXSTMTEML;
/* 140 */     this.LCTNXSTMTEML = LCTNXSTMTEML;
/* 141 */     this.NMXSTMTPRNT = NMXSTMTPRNT;
/* 142 */     this.LCTNXSTMTPRNT = LCTNXSTMTPRNT;
/* 143 */     this.NMXSTMTXMSK = NMXSTMTXMSK;
/* 144 */     this.fldx11 = fldx11;
/* 145 */     this.fldx12 = fldx12;
/* 146 */     this.GRPXLGO = GRPXLGO;
/* 147 */     this.ACNTXTYP = ACNTXTYP;
/* 148 */     this.FXTXTXGEN = FXTXTXGEN;
/* 149 */     this.fldx16 = fldx16;
/* 150 */     this.fldx17 = fldx17;
/* 151 */     this.fldx18 = fldx18;
/* 152 */     this.fldx19 = fldx19;
/* 153 */     this.fldx20 = fldx20;
/* 154 */     this.dxctd = dxctd;
/* 155 */     this.bxctd = bxctd;
/* 156 */     this.dxmfdxlst = dxmfdxlst;
/* 157 */     this.bxmfdxlst = bxmfdxlst;
/* 158 */     this.flxchnlxdlvy = flxchnlxdlvy;
/* 159 */     this.rdxrcptxflg = rdxrcptxflg;
/* 160 */     this.drxrcptxflg = drxrcptxflg;
/* 161 */     this.fxerrxgnrtnxwo = fxerrxgnrtnxwo;
/*     */   }
/*     */   
/*     */   public Long getIxprdtn() {
/* 165 */     return this.ixprdtn;
/*     */   }
/*     */   
/*     */   public void setIxprdtn(Long ixprdtn) {
/* 169 */     this.ixprdtn = ixprdtn;
/*     */   }
/*     */   public Pxprdctxm getPxprdctxm() {
/* 172 */     return this.pxprdctxm;
/*     */   }
/*     */   
/*     */   public void setPxprdctxm(Pxprdctxm pxprdctxm) {
/* 176 */     this.pxprdctxm = pxprdctxm;
/*     */   }
/*     */   public String getCrn() {
/* 179 */     return this.crn;
/*     */   }
/*     */   
/*     */   public void setCrn(String crn) {
/* 183 */     this.crn = crn;
/*     */   }
/*     */   public Long getNoxacnt() {
/* 186 */     return this.noxacnt;
/*     */   }
/*     */   
/*     */   public void setNoxacnt(Long noxacnt) {
/* 190 */     this.noxacnt = noxacnt;
/*     */   }
/*     */   public Long getIxstmt() {
/* 193 */     return this.ixstmt;
/*     */   }
/*     */   
/*     */   public void setIxstmt(Long ixstmt) {
/* 197 */     this.ixstmt = ixstmt;
/*     */   }
/*     */   public Date getDxstmt() {
/* 200 */     return this.dxstmt;
/*     */   }
/*     */   
/*     */   public void setDxstmt(Date dxstmt) {
/* 204 */     this.dxstmt = dxstmt;
/*     */   }
/*     */   public String getNmxstmt() {
/* 207 */     return this.nmxstmt;
/*     */   }
/*     */   
/*     */   public void setNmxstmt(String nmxstmt) {
/* 211 */     this.nmxstmt = nmxstmt;
/*     */   }
/*     */   public String getLctnxstmt() {
/* 214 */     return this.lctnxstmt;
/*     */   }
/*     */   
/*     */   public void setLctnxstmt(String lctnxstmt) {
/* 218 */     this.lctnxstmt = lctnxstmt;
/*     */   }
/*     */   public String getFxerrxgnrtn() {
/* 221 */     return this.fxerrxgnrtn;
/*     */   }
/*     */   
/*     */   public void setFxerrxgnrtn(String fxerrxgnrtn) {
/* 225 */     this.fxerrxgnrtn = fxerrxgnrtn;
/*     */   }
/*     */   public Long getIxprcs() {
/* 228 */     return this.ixprcs;
/*     */   }
/*     */   
/*     */   public void setIxprcs(Long ixprcs) {
/* 232 */     this.ixprcs = ixprcs;
/*     */   }
/*     */   public Date getDxprcs() {
/* 235 */     return this.dxprcs;
/*     */   }
/*     */   
/*     */   public void setDxprcs(Date dxprcs) {
/* 239 */     this.dxprcs = dxprcs;
/*     */   }
/*     */   public String getIxem() {
/* 242 */     return this.ixem;
/*     */   }
/*     */   
/*     */   public void setIxem(String ixem) {
/* 246 */     this.ixem = ixem;
/*     */   }
/*     */   public String getIxemxalt() {
/* 249 */     return this.ixemxalt;
/*     */   }
/*     */   
/*     */   public void setIxemxalt(String ixemxalt) {
/* 253 */     this.ixemxalt = ixemxalt;
/*     */   }
/*     */   public String getIxemxtmp() {
/* 256 */     return this.ixemxtmp;
/*     */   }
/*     */   
/*     */   public void setIxemxtmp(String ixemxtmp) {
/* 260 */     this.ixemxtmp = ixemxtmp;
/*     */   }
/*     */   public String getRfrncxflxcntntxem() {
/* 263 */     return this.rfrncxflxcntntxem;
/*     */   }
/*     */   
/*     */   public void setRfrncxflxcntntxem(String rfrncxflxcntntxem) {
/* 267 */     this.rfrncxflxcntntxem = rfrncxflxcntntxem;
/*     */   }
/*     */   public Long getIxbncdxhrdxsft() {
/* 270 */     return this.ixbncdxhrdxsft;
/*     */   }
/*     */   
/*     */   public void setIxbncdxhrdxsft(Long ixbncdxhrdxsft) {
/* 274 */     this.ixbncdxhrdxsft = ixbncdxhrdxsft;
/*     */   }
/*     */   public Date getDxbncdxem() {
/* 277 */     return this.dxbncdxem;
/*     */   }
/*     */   
/*     */   public void setDxbncdxem(Date dxbncdxem) {
/* 281 */     this.dxbncdxem = dxbncdxem;
/*     */   }
/*     */   public String getFxbncdxem() {
/* 284 */     return this.fxbncdxem;
/*     */   }
/*     */   
/*     */   public void setFxbncdxem(String fxbncdxem) {
/* 288 */     this.fxbncdxem = fxbncdxem;
/*     */   }
/*     */   public Long getCntxrsntxem() {
/* 291 */     return this.cntxrsntxem;
/*     */   }
/*     */   
/*     */   public void setCntxrsntxem(Long cntxrsntxem) {
/* 295 */     this.cntxrsntxem = cntxrsntxem;
/*     */   }
/*     */   public String getFxrsntxem() {
/* 298 */     return this.fxrsntxem;
/*     */   }
/*     */   
/*     */   public void setFxrsntxem(String fxrsntxem) {
/* 302 */     this.fxrsntxem = fxrsntxem;
/*     */   }
/*     */   public Date getDxsntxem() {
/* 305 */     return this.dxsntxem;
/*     */   }
/*     */   
/*     */   public void setDxsntxem(Date dxsntxem) {
/* 309 */     this.dxsntxem = dxsntxem;
/*     */   }
/*     */   public String getFxsntxem() {
/* 312 */     return this.fxsntxem;
/*     */   }
/*     */   
/*     */   public void setFxsntxem(String fxsntxem) {
/* 316 */     this.fxsntxem = fxsntxem;
/*     */   }
/*     */   public Date getDxsntxemxtmp() {
/* 319 */     return this.dxsntxemxtmp;
/*     */   }
/*     */   
/*     */   public void setDxsntxemxtmp(Date dxsntxemxtmp) {
/* 323 */     this.dxsntxemxtmp = dxsntxemxtmp;
/*     */   }
/*     */   public String getFxsntxemxtmp() {
/* 326 */     return this.fxsntxemxtmp;
/*     */   }
/*     */   
/*     */   public void setFxsntxemxtmp(String fxsntxemxtmp) {
/* 330 */     this.fxsntxemxtmp = fxsntxemxtmp;
/*     */   }
/*     */   public Date getDxsntxfx() {
/* 333 */     return this.dxsntxfx;
/*     */   }
/*     */   
/*     */   public void setDxsntxfx(Date dxsntxfx) {
/* 337 */     this.dxsntxfx = dxsntxfx;
/*     */   }
/*     */   public String getFxsntxfx() {
/* 340 */     return this.fxsntxfx;
/*     */   }
/*     */   
/*     */   public void setFxsntxfx(String fxsntxfx) {
/* 344 */     this.fxsntxfx = fxsntxfx;
/*     */   }
/*     */   public Date getDxprntxstmt() {
/* 347 */     return this.dxprntxstmt;
/*     */   }
/*     */   
/*     */   public void setDxprntxstmt(Date dxprntxstmt) {
/* 351 */     this.dxprntxstmt = dxprntxstmt;
/*     */   }
/*     */   public String getFxprntxstmt() {
/* 354 */     return this.fxprntxstmt;
/*     */   }
/*     */   
/*     */   public void setFxprntxstmt(String fxprntxstmt) {
/* 358 */     this.fxprntxstmt = fxprntxstmt;
/*     */   }
/*     */   public Long getIxerlbxbncxem() {
/* 361 */     return this.ixerlbxbncxem;
/*     */   }
/*     */   
/*     */   public void setIxerlbxbncxem(Long ixerlbxbncxem) {
/* 365 */     this.ixerlbxbncxem = ixerlbxbncxem;
/*     */   }
/*     */   public Long getIxrlxm() {
/* 368 */     return this.ixrlxm;
/*     */   }
/*     */   
/*     */   public void setIxrlxm(Long ixrlxm) {
/* 372 */     this.ixrlxm = ixrlxm;
/*     */   }
/*     */   public Long getIxcfgxem() {
/* 375 */     return this.ixcfgxem;
/*     */   }
/*     */   
/*     */   public void setIxcfgxem(Long ixcfgxem) {
/* 379 */     this.ixcfgxem = ixcfgxem;
/*     */   }
/*     */   public String getMdxgxgen() {
/* 382 */     return this.mdxgxgen;
/*     */   }
/*     */   
/*     */   public void setMdxgxgen(String mdxgxgen) {
/* 386 */     this.mdxgxgen = mdxgxgen;
/*     */   }
/*     */   public String getMdxrxgen() {
/* 389 */     return this.mdxrxgen;
/*     */   }
/*     */   
/*     */   public void setMdxrxgen(String mdxrxgen) {
/* 393 */     this.mdxrxgen = mdxrxgen;
/*     */   }
/*     */   public String getMdxpxgen() {
/* 396 */     return this.mdxpxgen;
/*     */   }
/*     */   
/*     */   public void setMdxpxgen(String mdxpxgen) {
/* 400 */     this.mdxpxgen = mdxpxgen;
/*     */   }
/*     */   public String getTmpxdsgn() {
/* 403 */     return this.tmpxdsgn;
/*     */   }
/*     */   
/*     */   public void setTmpxdsgn(String tmpxdsgn) {
/* 407 */     this.tmpxdsgn = tmpxdsgn;
/*     */   }
/*     */   public String getFxgen() {
/* 410 */     return this.fxgen;
/*     */   }
/*     */   
/*     */   public void setFxgen(String fxgen) {
/* 414 */     this.fxgen = fxgen;
/*     */   }
/*     */   public String getFxtrnc() {
/* 417 */     return this.fxtrnc;
/*     */   }
/*     */   
/*     */   public void setFxtrnc(String fxtrnc) {
/* 421 */     this.fxtrnc = fxtrnc;
/*     */   }
/*     */   
/*     */   public String getFldx4() {
/* 425 */     return this.fldx4;
/*     */   }
/*     */   
/*     */   public void setFldx4(String fldx4) {
/* 429 */     this.fldx4 = fldx4;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFldx5() {
/* 435 */     return this.fldx5;
/*     */   }
/*     */   
/*     */   public void setFldx5(String fldx5) {
/* 439 */     this.fldx5 = fldx5;
/*     */   }
/*     */   
/*     */   public String getNMXSTMTXMSK() {
/* 443 */     return this.NMXSTMTXMSK;
/*     */   }
/*     */   
/*     */   public void setNMXSTMTXMSK(String NMXSTMTXMSK) {
/* 447 */     this.NMXSTMTXMSK = NMXSTMTXMSK;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getFldx11() {
/* 452 */     return this.fldx11;
/*     */   }
/*     */   
/*     */   public void setFldx11(String fldx11) {
/* 456 */     this.fldx11 = fldx11;
/*     */   }
/*     */   public String getFldx12() {
/* 459 */     return this.fldx12;
/*     */   }
/*     */   
/*     */   public void setFldx12(String fldx12) {
/* 463 */     this.fldx12 = fldx12;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getLCTNXSTMTEML() {
/* 468 */     return this.LCTNXSTMTEML;
/*     */   }
/*     */   
/*     */   public void setLCTNXSTMTEML(String LCTNXSTMTEML) {
/* 472 */     this.LCTNXSTMTEML = LCTNXSTMTEML;
/*     */   }
/*     */   
/*     */   public String getLCTNXSTMTPRNT() {
/* 476 */     return this.LCTNXSTMTPRNT;
/*     */   }
/*     */   
/*     */   public void setLCTNXSTMTPRNT(String LCTNXSTMTPRNT) {
/* 480 */     this.LCTNXSTMTPRNT = LCTNXSTMTPRNT;
/*     */   }
/*     */   
/*     */   public String getNMXSTMTEML() {
/* 484 */     return this.NMXSTMTEML;
/*     */   }
/*     */   
/*     */   public void setNMXSTMTEML(String NMXSTMTEML) {
/* 488 */     this.NMXSTMTEML = NMXSTMTEML;
/*     */   }
/*     */   
/*     */   public String getNMXSTMTPRNT() {
/* 492 */     return this.NMXSTMTPRNT;
/*     */   }
/*     */   
/*     */   public void setNMXSTMTPRNT(String NMXSTMTPRNT) {
/* 496 */     this.NMXSTMTPRNT = NMXSTMTPRNT;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Long getFldx16() {
/* 503 */     return this.fldx16;
/*     */   }
/*     */   
/*     */   public void setFldx16(Long fldx16) {
/* 507 */     this.fldx16 = fldx16;
/*     */   }
/*     */   
/*     */   public Date getFldx17() {
/* 511 */     return this.fldx17;
/*     */   }
/*     */   
/*     */   public void setFldx17(Date fldx17) {
/* 515 */     this.fldx17 = fldx17;
/*     */   }
/*     */   public String getFldx18() {
/* 518 */     return this.fldx18;
/*     */   }
/*     */   
/*     */   public void setFldx18(String fldx18) {
/* 522 */     this.fldx18 = fldx18;
/*     */   }
/*     */   public String getFldx19() {
/* 525 */     return this.fldx19;
/*     */   }
/*     */   
/*     */   public void setFldx19(String fldx19) {
/* 529 */     this.fldx19 = fldx19;
/*     */   }
/*     */   public String getFldx20() {
/* 532 */     return this.fldx20;
/*     */   }
/*     */   
/*     */   public void setFldx20(String fldx20) {
/* 536 */     this.fldx20 = fldx20;
/*     */   }
/*     */   public Date getDxctd() {
/* 539 */     return this.dxctd;
/*     */   }
/*     */   
/*     */   public void setDxctd(Date dxctd) {
/* 543 */     this.dxctd = dxctd;
/*     */   }
/*     */   public String getBxctd() {
/* 546 */     return this.bxctd;
/*     */   }
/*     */   
/*     */   public void setBxctd(String bxctd) {
/* 550 */     this.bxctd = bxctd;
/*     */   }
/*     */   public Date getDxmfdxlst() {
/* 553 */     return this.dxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setDxmfdxlst(Date dxmfdxlst) {
/* 557 */     this.dxmfdxlst = dxmfdxlst;
/*     */   }
/*     */   public String getBxmfdxlst() {
/* 560 */     return this.bxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setBxmfdxlst(String bxmfdxlst) {
/* 564 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */   public String getFlxchnlxdlvy() {
/* 567 */     return this.flxchnlxdlvy;
/*     */   }
/*     */   
/*     */   public void setFlxchnlxdlvy(String flxchnlxdlvy) {
/* 571 */     this.flxchnlxdlvy = flxchnlxdlvy;
/*     */   }
/*     */   
/*     */   public String getDrxrcptxflg() {
/* 575 */     return this.drxrcptxflg;
/*     */   }
/*     */   
/*     */   public void setDrxrcptxflg(String drxrcptxflg) {
/* 579 */     this.drxrcptxflg = drxrcptxflg;
/*     */   }
/*     */   
/*     */   public String getRdxrcptxflg() {
/* 583 */     return this.rdxrcptxflg;
/*     */   }
/*     */   
/*     */   public void setRdxrcptxflg(String rdxrcptxflg) {
/* 587 */     this.rdxrcptxflg = rdxrcptxflg;
/*     */   }
/*     */   
/*     */   public String getFxerrxgnrtnxwo() {
/* 591 */     return this.fxerrxgnrtnxwo;
/*     */   }
/*     */   
/*     */   public void setFxerrxgnrtnxwo(String fxerrxgnrtnxwo) {
/* 595 */     this.fxerrxgnrtnxwo = fxerrxgnrtnxwo;
/*     */   }
/*     */   
/*     */   public String getLctnxstmtwol() {
/* 599 */     return this.lctnxstmtwol;
/*     */   }
/*     */   
/*     */   public void setLctnxstmtwol(String lctnxstmtwol) {
/* 603 */     this.lctnxstmtwol = lctnxstmtwol;
/*     */   }
/*     */   
/*     */   public String getNmxstmtwol() {
/* 607 */     return this.nmxstmtwol;
/*     */   }
/*     */   
/*     */   public void setNmxstmtwol(String nmxstmtwol) {
/* 611 */     this.nmxstmtwol = nmxstmtwol;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getGRPXLGO() {
/* 618 */     return this.GRPXLGO;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setGRPXLGO(String GRPXLGO) {
/* 625 */     this.GRPXLGO = GRPXLGO;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getACNTXTYP() {
/* 632 */     return this.ACNTXTYP;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setACNTXTYP(String ACNTXTYP) {
/* 639 */     this.ACNTXTYP = ACNTXTYP;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFXTXTXGEN() {
/* 646 */     return this.FXTXTXGEN;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFXTXTXGEN(String FXTXTXGEN) {
/* 653 */     this.FXTXTXGEN = FXTXTXGEN;
/*     */   }
/*     */   
/*     */   public String getCxfile() {
/* 657 */     return this.cxfile;
/*     */   }
/*     */   
/*     */   public void setCxfile(String cxfile) {
/* 661 */     this.cxfile = cxfile;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Dxprdtnxdtlsxm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */