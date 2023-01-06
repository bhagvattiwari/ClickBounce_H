/*     */ package com.seeinfobiz.click.entitybean;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Cxprcsxdtls
/*     */   implements Serializable
/*     */ {
/*     */   private Long ixdtlsxprcs;
/*     */   private Cxprcsxm cxprcsxm;
/*     */   private String mdxgen;
/*     */   private String fxprcsxgen;
/*     */   private String fxsuprsxgen;
/*     */   private String flxfrncyxgen;
/*     */   private String nmxflxsuprsxgen;
/*     */   private String mdxem;
/*     */   private String flxprcsxem;
/*     */   private String prtctxwdpsxem;
/*     */   private String flxfrncyxem;
/*     */   private String flxsuprsxem;
/*     */   private String nmxflexsuprsxem;
/*     */   private String flxrnxem;
/*     */   private Date dtmexrnxem;
/*     */   private Long acntxttl;
/*     */   private String prsdxacntxttl;
/*     */   private Long gnrtdxstmtxttl;
/*     */   private String msdxacntxttl;
/*     */   private Long wbxttl;
/*     */   private Long prntxttl;
/*     */   private Long emxttl;
/*     */   private Long smsxttl;
/*     */   private Long fxxttl;
/*     */   private String msdxwbxttl;
/*     */   private String msdxprntxttl;
/*     */   private String msdxemxttl;
/*     */   private String msdxsmsxttl;
/*     */   private String msdxfxxttl;
/*     */   private Date stxprsxtm;
/*     */   private Date edxprsxtm;
/*     */   private String stxgenxtm;
/*     */   private String edxgenxtm;
/*     */   private String stxemlxtm;
/*     */   private String edxemlxtm;
/*     */   private Long cntrxgenxtmp;
/*     */   private Date dxctd;
/*     */   private String bxctd;
/*     */   private Date dxmfdxlst;
/*     */   private String bxmfdxlst;
/*     */   private Long msdxgnrxacntxttl;
/*     */   private String totxhrdxbncd;
/*     */   private String totxsftxbncd;
/*     */   private String rdxemlxttl;
/*     */   private String urxemlxttl;
/*     */   private String dlvxemlxttl;
/*     */   private String udlvxemlxttl;
/*     */   
/*     */   public Cxprcsxdtls() {}
/*     */   
/*     */   public Cxprcsxdtls(Long ixdtlsxprcs, String fxprcsxgen, String prtctxwdpsxem, String flxrnxem) {
/*  64 */     this.ixdtlsxprcs = ixdtlsxprcs;
/*  65 */     this.fxprcsxgen = fxprcsxgen;
/*  66 */     this.prtctxwdpsxem = prtctxwdpsxem;
/*  67 */     this.flxrnxem = flxrnxem;
/*     */   }
/*     */ 
/*     */   
/*     */   public Cxprcsxdtls(Long ixdtlsxprcs, Cxprcsxm cxprcsxm, String mdxgen, String fxprcsxgen, String fxsuprsxgen, String flxfrncyxgen, String nmxflxsuprsxgen, String mdxem, String flxprcsxem, String prtctxwdpsxem, String flxfrncyxem, String flxsuprsxem, String nmxflexsuprsxem, String flxrnxem, Date dtmexrnxem, Long acntxttl, String prsdxacntxttl, Long gnrtdxstmtxttl, String msdxacntxttl, Long wbxttl, Long prntxttl, Long emxttl, Long smsxttl, Long fxxttl, String msdxwbxttl, String msdxprntxttl, String msdxemxttl, String msdxsmsxttl, String msdxfxxttl, Date stxprsxtm, Date edxprsxtm, String stxgenxtm, String edxgenxtm, String stxemlxtm, String edxemlxtm, Long cntrxgenxtmp, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst, Long msdxgnrxacntxttl, String rdxemlxttl, String urxemlxttl, String dlvxemlxttl, String udlvxemlxttl) {
/*  72 */     this.ixdtlsxprcs = ixdtlsxprcs;
/*  73 */     this.cxprcsxm = cxprcsxm;
/*  74 */     this.mdxgen = mdxgen;
/*  75 */     this.fxprcsxgen = fxprcsxgen;
/*  76 */     this.fxsuprsxgen = fxsuprsxgen;
/*  77 */     this.flxfrncyxgen = flxfrncyxgen;
/*  78 */     this.nmxflxsuprsxgen = nmxflxsuprsxgen;
/*  79 */     this.mdxem = mdxem;
/*  80 */     this.flxprcsxem = flxprcsxem;
/*  81 */     this.prtctxwdpsxem = prtctxwdpsxem;
/*  82 */     this.flxfrncyxem = flxfrncyxem;
/*  83 */     this.flxsuprsxem = flxsuprsxem;
/*  84 */     this.nmxflexsuprsxem = nmxflexsuprsxem;
/*  85 */     this.flxrnxem = flxrnxem;
/*  86 */     this.dtmexrnxem = dtmexrnxem;
/*  87 */     this.acntxttl = acntxttl;
/*  88 */     this.prsdxacntxttl = prsdxacntxttl;
/*  89 */     this.gnrtdxstmtxttl = gnrtdxstmtxttl;
/*  90 */     this.msdxacntxttl = msdxacntxttl;
/*  91 */     this.wbxttl = wbxttl;
/*  92 */     this.prntxttl = prntxttl;
/*  93 */     this.emxttl = emxttl;
/*  94 */     this.smsxttl = smsxttl;
/*  95 */     this.fxxttl = fxxttl;
/*  96 */     this.msdxwbxttl = msdxwbxttl;
/*  97 */     this.msdxprntxttl = msdxprntxttl;
/*  98 */     this.msdxemxttl = msdxemxttl;
/*  99 */     this.msdxsmsxttl = msdxsmsxttl;
/* 100 */     this.msdxfxxttl = msdxfxxttl;
/* 101 */     this.stxprsxtm = stxprsxtm;
/* 102 */     this.edxprsxtm = edxprsxtm;
/* 103 */     this.stxgenxtm = stxgenxtm;
/* 104 */     this.edxgenxtm = edxgenxtm;
/* 105 */     this.stxemlxtm = stxemlxtm;
/* 106 */     this.edxemlxtm = edxemlxtm;
/* 107 */     this.cntrxgenxtmp = cntrxgenxtmp;
/* 108 */     this.dxctd = dxctd;
/* 109 */     this.bxctd = bxctd;
/* 110 */     this.dxmfdxlst = dxmfdxlst;
/* 111 */     this.bxmfdxlst = bxmfdxlst;
/* 112 */     this.msdxgnrxacntxttl = msdxgnrxacntxttl;
/* 113 */     this.rdxemlxttl = rdxemlxttl;
/* 114 */     this.urxemlxttl = urxemlxttl;
/* 115 */     this.dlvxemlxttl = dlvxemlxttl;
/* 116 */     this.udlvxemlxttl = udlvxemlxttl;
/*     */   }
/*     */   
/*     */   public Cxprcsxdtls(Long ixdtlsxprcs, Cxprcsxm cxprcsxm, String mdxgen, String fxprcsxgen, String fxsuprsxgen, String flxfrncyxgen, String nmxflxsuprsxgen, String mdxem, String flxprcsxem, String prtctxwdpsxem, String flxfrncyxem, String flxsuprsxem, String nmxflexsuprsxem, String flxrnxem, Date dtmexrnxem, Long acntxttl, String prsdxacntxttl, Long gnrtdxstmtxttl, String msdxacntxttl, Long wbxttl, Long prntxttl, Long emxttl, Long smsxttl, Long fxxttl, String msdxwbxttl, String msdxprntxttl, String msdxemxttl, String msdxsmsxttl, String msdxfxxttl, Date stxprsxtm, Date edxprsxtm, String stxgenxtm, String edxgenxtm, String stxemlxtm, String edxemlxtm, Long cntrxgenxtmp, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst, Long msdxgnrxacntxttl, String totxhrdxbncd, String totxsftxbncd) {
/* 120 */     this.ixdtlsxprcs = ixdtlsxprcs;
/* 121 */     this.cxprcsxm = cxprcsxm;
/* 122 */     this.mdxgen = mdxgen;
/* 123 */     this.fxprcsxgen = fxprcsxgen;
/* 124 */     this.fxsuprsxgen = fxsuprsxgen;
/* 125 */     this.flxfrncyxgen = flxfrncyxgen;
/* 126 */     this.nmxflxsuprsxgen = nmxflxsuprsxgen;
/* 127 */     this.mdxem = mdxem;
/* 128 */     this.flxprcsxem = flxprcsxem;
/* 129 */     this.prtctxwdpsxem = prtctxwdpsxem;
/* 130 */     this.flxfrncyxem = flxfrncyxem;
/* 131 */     this.flxsuprsxem = flxsuprsxem;
/* 132 */     this.nmxflexsuprsxem = nmxflexsuprsxem;
/* 133 */     this.flxrnxem = flxrnxem;
/* 134 */     this.dtmexrnxem = dtmexrnxem;
/* 135 */     this.acntxttl = acntxttl;
/* 136 */     this.prsdxacntxttl = prsdxacntxttl;
/* 137 */     this.gnrtdxstmtxttl = gnrtdxstmtxttl;
/* 138 */     this.msdxacntxttl = msdxacntxttl;
/* 139 */     this.wbxttl = wbxttl;
/* 140 */     this.prntxttl = prntxttl;
/* 141 */     this.emxttl = emxttl;
/* 142 */     this.smsxttl = smsxttl;
/* 143 */     this.fxxttl = fxxttl;
/* 144 */     this.msdxwbxttl = msdxwbxttl;
/* 145 */     this.msdxprntxttl = msdxprntxttl;
/* 146 */     this.msdxemxttl = msdxemxttl;
/* 147 */     this.msdxsmsxttl = msdxsmsxttl;
/* 148 */     this.msdxfxxttl = msdxfxxttl;
/* 149 */     this.stxprsxtm = stxprsxtm;
/* 150 */     this.edxprsxtm = edxprsxtm;
/* 151 */     this.stxgenxtm = stxgenxtm;
/* 152 */     this.edxgenxtm = edxgenxtm;
/* 153 */     this.stxemlxtm = stxemlxtm;
/* 154 */     this.edxemlxtm = edxemlxtm;
/* 155 */     this.cntrxgenxtmp = cntrxgenxtmp;
/* 156 */     this.dxctd = dxctd;
/* 157 */     this.bxctd = bxctd;
/* 158 */     this.dxmfdxlst = dxmfdxlst;
/* 159 */     this.bxmfdxlst = bxmfdxlst;
/* 160 */     this.msdxgnrxacntxttl = msdxgnrxacntxttl;
/* 161 */     this.totxhrdxbncd = totxhrdxbncd;
/* 162 */     this.totxsftxbncd = totxsftxbncd;
/*     */   }
/*     */   
/*     */   public Long getIxdtlsxprcs() {
/* 166 */     return this.ixdtlsxprcs;
/*     */   }
/*     */   
/*     */   public void setIxdtlsxprcs(Long ixdtlsxprcs) {
/* 170 */     this.ixdtlsxprcs = ixdtlsxprcs;
/*     */   }
/*     */   
/*     */   public Cxprcsxm getCxprcsxm() {
/* 174 */     return this.cxprcsxm;
/*     */   }
/*     */   
/*     */   public void setCxprcsxm(Cxprcsxm cxprcsxm) {
/* 178 */     this.cxprcsxm = cxprcsxm;
/*     */   }
/*     */   
/*     */   public String getMdxgen() {
/* 182 */     return this.mdxgen;
/*     */   }
/*     */   
/*     */   public void setMdxgen(String mdxgen) {
/* 186 */     this.mdxgen = mdxgen;
/*     */   }
/*     */   
/*     */   public String getFxprcsxgen() {
/* 190 */     return this.fxprcsxgen;
/*     */   }
/*     */   
/*     */   public void setFxprcsxgen(String fxprcsxgen) {
/* 194 */     this.fxprcsxgen = fxprcsxgen;
/*     */   }
/*     */   
/*     */   public String getFxsuprsxgen() {
/* 198 */     return this.fxsuprsxgen;
/*     */   }
/*     */   
/*     */   public void setFxsuprsxgen(String fxsuprsxgen) {
/* 202 */     this.fxsuprsxgen = fxsuprsxgen;
/*     */   }
/*     */   
/*     */   public String getFlxfrncyxgen() {
/* 206 */     return this.flxfrncyxgen;
/*     */   }
/*     */   
/*     */   public void setFlxfrncyxgen(String flxfrncyxgen) {
/* 210 */     this.flxfrncyxgen = flxfrncyxgen;
/*     */   }
/*     */   
/*     */   public String getNmxflxsuprsxgen() {
/* 214 */     return this.nmxflxsuprsxgen;
/*     */   }
/*     */   
/*     */   public void setNmxflxsuprsxgen(String nmxflxsuprsxgen) {
/* 218 */     this.nmxflxsuprsxgen = nmxflxsuprsxgen;
/*     */   }
/*     */   
/*     */   public String getMdxem() {
/* 222 */     return this.mdxem;
/*     */   }
/*     */   
/*     */   public void setMdxem(String mdxem) {
/* 226 */     this.mdxem = mdxem;
/*     */   }
/*     */   
/*     */   public String getFlxprcsxem() {
/* 230 */     return this.flxprcsxem;
/*     */   }
/*     */   
/*     */   public void setFlxprcsxem(String flxprcsxem) {
/* 234 */     this.flxprcsxem = flxprcsxem;
/*     */   }
/*     */   
/*     */   public String getPrtctxwdpsxem() {
/* 238 */     return this.prtctxwdpsxem;
/*     */   }
/*     */   
/*     */   public void setPrtctxwdpsxem(String prtctxwdpsxem) {
/* 242 */     this.prtctxwdpsxem = prtctxwdpsxem;
/*     */   }
/*     */   
/*     */   public String getFlxfrncyxem() {
/* 246 */     return this.flxfrncyxem;
/*     */   }
/*     */   
/*     */   public void setFlxfrncyxem(String flxfrncyxem) {
/* 250 */     this.flxfrncyxem = flxfrncyxem;
/*     */   }
/*     */   
/*     */   public String getFlxsuprsxem() {
/* 254 */     return this.flxsuprsxem;
/*     */   }
/*     */   
/*     */   public void setFlxsuprsxem(String flxsuprsxem) {
/* 258 */     this.flxsuprsxem = flxsuprsxem;
/*     */   }
/*     */   
/*     */   public String getNmxflexsuprsxem() {
/* 262 */     return this.nmxflexsuprsxem;
/*     */   }
/*     */   
/*     */   public void setNmxflexsuprsxem(String nmxflexsuprsxem) {
/* 266 */     this.nmxflexsuprsxem = nmxflexsuprsxem;
/*     */   }
/*     */   
/*     */   public String getFlxrnxem() {
/* 270 */     return this.flxrnxem;
/*     */   }
/*     */   
/*     */   public void setFlxrnxem(String flxrnxem) {
/* 274 */     this.flxrnxem = flxrnxem;
/*     */   }
/*     */   
/*     */   public Date getDtmexrnxem() {
/* 278 */     return this.dtmexrnxem;
/*     */   }
/*     */   
/*     */   public void setDtmexrnxem(Date dtmexrnxem) {
/* 282 */     this.dtmexrnxem = dtmexrnxem;
/*     */   }
/*     */   
/*     */   public Long getAcntxttl() {
/* 286 */     return this.acntxttl;
/*     */   }
/*     */   
/*     */   public void setAcntxttl(Long acntxttl) {
/* 290 */     this.acntxttl = acntxttl;
/*     */   }
/*     */   
/*     */   public String getPrsdxacntxttl() {
/* 294 */     return this.prsdxacntxttl;
/*     */   }
/*     */   
/*     */   public void setPrsdxacntxttl(String prsdxacntxttl) {
/* 298 */     this.prsdxacntxttl = prsdxacntxttl;
/*     */   }
/*     */   
/*     */   public Long getGnrtdxstmtxttl() {
/* 302 */     return this.gnrtdxstmtxttl;
/*     */   }
/*     */   
/*     */   public void setGnrtdxstmtxttl(Long gnrtdxstmtxttl) {
/* 306 */     this.gnrtdxstmtxttl = gnrtdxstmtxttl;
/*     */   }
/*     */   
/*     */   public String getMsdxacntxttl() {
/* 310 */     return this.msdxacntxttl;
/*     */   }
/*     */   
/*     */   public void setMsdxacntxttl(String msdxacntxttl) {
/* 314 */     this.msdxacntxttl = msdxacntxttl;
/*     */   }
/*     */   
/*     */   public Long getWbxttl() {
/* 318 */     return this.wbxttl;
/*     */   }
/*     */   
/*     */   public void setWbxttl(Long wbxttl) {
/* 322 */     this.wbxttl = wbxttl;
/*     */   }
/*     */   
/*     */   public Long getPrntxttl() {
/* 326 */     return this.prntxttl;
/*     */   }
/*     */   
/*     */   public void setPrntxttl(Long prntxttl) {
/* 330 */     this.prntxttl = prntxttl;
/*     */   }
/*     */   
/*     */   public Long getEmxttl() {
/* 334 */     return this.emxttl;
/*     */   }
/*     */   
/*     */   public void setEmxttl(Long emxttl) {
/* 338 */     this.emxttl = emxttl;
/*     */   }
/*     */   
/*     */   public Long getSmsxttl() {
/* 342 */     return this.smsxttl;
/*     */   }
/*     */   
/*     */   public void setSmsxttl(Long smsxttl) {
/* 346 */     this.smsxttl = smsxttl;
/*     */   }
/*     */   
/*     */   public Long getFxxttl() {
/* 350 */     return this.fxxttl;
/*     */   }
/*     */   
/*     */   public void setFxxttl(Long fxxttl) {
/* 354 */     this.fxxttl = fxxttl;
/*     */   }
/*     */   
/*     */   public String getMsdxwbxttl() {
/* 358 */     return this.msdxwbxttl;
/*     */   }
/*     */   
/*     */   public void setMsdxwbxttl(String msdxwbxttl) {
/* 362 */     this.msdxwbxttl = msdxwbxttl;
/*     */   }
/*     */   
/*     */   public String getMsdxprntxttl() {
/* 366 */     return this.msdxprntxttl;
/*     */   }
/*     */   
/*     */   public void setMsdxprntxttl(String msdxprntxttl) {
/* 370 */     this.msdxprntxttl = msdxprntxttl;
/*     */   }
/*     */   
/*     */   public String getMsdxemxttl() {
/* 374 */     return this.msdxemxttl;
/*     */   }
/*     */   
/*     */   public void setMsdxemxttl(String msdxemxttl) {
/* 378 */     this.msdxemxttl = msdxemxttl;
/*     */   }
/*     */   
/*     */   public String getMsdxsmsxttl() {
/* 382 */     return this.msdxsmsxttl;
/*     */   }
/*     */   
/*     */   public void setMsdxsmsxttl(String msdxsmsxttl) {
/* 386 */     this.msdxsmsxttl = msdxsmsxttl;
/*     */   }
/*     */   
/*     */   public String getMsdxfxxttl() {
/* 390 */     return this.msdxfxxttl;
/*     */   }
/*     */   
/*     */   public void setMsdxfxxttl(String msdxfxxttl) {
/* 394 */     this.msdxfxxttl = msdxfxxttl;
/*     */   }
/*     */   
/*     */   public Date getEdxprsxtm() {
/* 398 */     return this.edxprsxtm;
/*     */   }
/*     */   
/*     */   public void setEdxprsxtm(Date edxprsxtm) {
/* 402 */     this.edxprsxtm = edxprsxtm;
/*     */   }
/*     */   
/*     */   public Date getStxprsxtm() {
/* 406 */     return this.stxprsxtm;
/*     */   }
/*     */   
/*     */   public void setStxprsxtm(Date stxprsxtm) {
/* 410 */     this.stxprsxtm = stxprsxtm;
/*     */   }
/*     */   
/*     */   public String getStxgenxtm() {
/* 414 */     return this.stxgenxtm;
/*     */   }
/*     */   
/*     */   public void setStxgenxtm(String stxgenxtm) {
/* 418 */     this.stxgenxtm = stxgenxtm;
/*     */   }
/*     */   
/*     */   public String getEdxgenxtm() {
/* 422 */     return this.edxgenxtm;
/*     */   }
/*     */   
/*     */   public void setEdxgenxtm(String edxgenxtm) {
/* 426 */     this.edxgenxtm = edxgenxtm;
/*     */   }
/*     */   
/*     */   public String getStxemlxtm() {
/* 430 */     return this.stxemlxtm;
/*     */   }
/*     */   
/*     */   public void setStxemlxtm(String stxemlxtm) {
/* 434 */     this.stxemlxtm = stxemlxtm;
/*     */   }
/*     */   
/*     */   public String getEdxemlxtm() {
/* 438 */     return this.edxemlxtm;
/*     */   }
/*     */   
/*     */   public void setEdxemlxtm(String edxemlxtm) {
/* 442 */     this.edxemlxtm = edxemlxtm;
/*     */   }
/*     */   
/*     */   public Long getCntrxgenxtmp() {
/* 446 */     return this.cntrxgenxtmp;
/*     */   }
/*     */   
/*     */   public void setCntrxgenxtmp(Long cntrxgenxtmp) {
/* 450 */     this.cntrxgenxtmp = cntrxgenxtmp;
/*     */   }
/*     */   
/*     */   public Date getDxctd() {
/* 454 */     return this.dxctd;
/*     */   }
/*     */   
/*     */   public void setDxctd(Date dxctd) {
/* 458 */     this.dxctd = dxctd;
/*     */   }
/*     */   
/*     */   public String getBxctd() {
/* 462 */     return this.bxctd;
/*     */   }
/*     */   
/*     */   public void setBxctd(String bxctd) {
/* 466 */     this.bxctd = bxctd;
/*     */   }
/*     */   
/*     */   public Date getDxmfdxlst() {
/* 470 */     return this.dxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setDxmfdxlst(Date dxmfdxlst) {
/* 474 */     this.dxmfdxlst = dxmfdxlst;
/*     */   }
/*     */   
/*     */   public String getBxmfdxlst() {
/* 478 */     return this.bxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setBxmfdxlst(String bxmfdxlst) {
/* 482 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */   
/*     */   public Long getMsdxgnrxacntxttl() {
/* 486 */     return this.msdxgnrxacntxttl;
/*     */   }
/*     */   
/*     */   public void setMsdxgnrxacntxttl(Long msdxgnrxacntxttl) {
/* 490 */     this.msdxgnrxacntxttl = msdxgnrxacntxttl;
/*     */   }
/*     */   
/*     */   public String getTotxhrdxbncd() {
/* 494 */     return this.totxhrdxbncd;
/*     */   }
/*     */   
/*     */   public void setTotxhrdxbncd(String totxhrdxbncd) {
/* 498 */     this.totxhrdxbncd = totxhrdxbncd;
/*     */   }
/*     */   
/*     */   public String getTotxsftxbncd() {
/* 502 */     return this.totxsftxbncd;
/*     */   }
/*     */   
/*     */   public void setTotxsftxbncd(String totxsftxbncd) {
/* 506 */     this.totxsftxbncd = totxsftxbncd;
/*     */   }
/*     */   
/*     */   public String getDlvxemlxttl() {
/* 510 */     return this.dlvxemlxttl;
/*     */   }
/*     */   
/*     */   public void setDlvxemlxttl(String dlvxemlxttl) {
/* 514 */     this.dlvxemlxttl = dlvxemlxttl;
/*     */   }
/*     */   
/*     */   public String getRdxemlxttl() {
/* 518 */     return this.rdxemlxttl;
/*     */   }
/*     */   
/*     */   public void setRdxemlxttl(String rdxemlxttl) {
/* 522 */     this.rdxemlxttl = rdxemlxttl;
/*     */   }
/*     */   
/*     */   public String getUdlvxemlxttl() {
/* 526 */     return this.udlvxemlxttl;
/*     */   }
/*     */   
/*     */   public void setUdlvxemlxttl(String udlvxemlxttl) {
/* 530 */     this.udlvxemlxttl = udlvxemlxttl;
/*     */   }
/*     */   
/*     */   public String getUrxemlxttl() {
/* 534 */     return this.urxemlxttl;
/*     */   }
/*     */   
/*     */   public void setUrxemlxttl(String urxemlxttl) {
/* 538 */     this.urxemlxttl = urxemlxttl;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Cxprcsxdtls.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */