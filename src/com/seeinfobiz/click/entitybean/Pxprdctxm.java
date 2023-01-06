/*     */ package com.seeinfobiz.click.entitybean;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import java.util.HashSet;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Pxprdctxm
/*     */   implements Serializable
/*     */ {
/*     */   private Long ixprdt;
/*     */   private Long cdexprdt;
/*     */   private Pxbncdxmlxcng pxbncdxmlxcng;
/*     */   private Pxemxsrvxcnfg pxemxsrvxcnfg;
/*     */   private String nmxprdt;
/*     */   private String dscxprdt;
/*     */   private String dr1xfl;
/*     */   private String dr2xfl;
/*     */   private String dr3xfl;
/*     */   private String dr4xfl;
/*     */   private Date dxctd;
/*     */   private String bxctd;
/*     */   private Date dxmfdxlst;
/*     */   private String bxmfdxlst;
/*     */   private String isxflgebp;
/*     */   private Long ixprm;
/*     */   private Long ixdpt;
/*     */   private String pthxexlxprdct;
/*  36 */   private Set pxeshdlrxprsxms = new HashSet(0);
/*  37 */   private Set pxmtxrlxms = new HashSet(0);
/*  38 */   private Set cxsuprsnxms = new HashSet(0);
/*  39 */   private Set cxprcsxms = new HashSet(0);
/*  40 */   private Set dxdmtxsmries = new HashSet(0);
/*  41 */   private Set pxstxarcvxtrns = new HashSet(0);
/*  42 */   private Set pxdlvryxchnlxms = new HashSet(0);
/*  43 */   private Set pxmnlxgnrtnxms = new HashSet(0);
/*  44 */   private Set cxrlbkxms = new HashSet(0);
/*  45 */   private Set pxbncdxtras = new HashSet(0);
/*  46 */   private Set dxtrnsxsmryxms = new HashSet(0);
/*  47 */   private Set pxstxarcvxms = new HashSet(0);
/*  48 */   private Set pxmtxgrpxms = new HashSet(0);
/*  49 */   private Set pxetlxflxms = new HashSet(0);
/*  50 */   private Set pxadxstxms = new HashSet(0);
/*  51 */   private Set dxprxprdtnxms = new HashSet(0);
/*  52 */   private Set pxbncdxrsnxms = new HashSet(0);
/*  53 */   private Set pxprdctxdtls = new HashSet(0);
/*  54 */   private Set pxemlxpsdxms = new HashSet(0);
/*  55 */   private Set dxprdtnxdtlsxms = new HashSet(0);
/*  56 */   private Set pxemlxcngs = new HashSet(0);
/*  57 */   private Set pxprdctxslas = new HashSet(0);
/*  58 */   private Set pxusxprdctxlnks = new HashSet(0);
/*     */ 
/*     */   
/*     */   public Pxprdctxm() {}
/*     */ 
/*     */   
/*     */   public Pxprdctxm(Long ixprdt) {
/*  65 */     this.ixprdt = ixprdt;
/*     */   }
/*     */   public Pxprdctxm(Long ixprdt, Pxbncdxmlxcng pxbncdxmlxcng, Pxemxsrvxcnfg pxemxsrvxcnfg, String nmxprdt, String dscxprdt, String dr1xfl, String dr2xfl, String dr3xfl, String dr4xfl, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst, String isxflgebp, Long ixprm, Long ixdpt, Set pxeshdlrxprsxms, Set pxmtxrlxms, Set cxsuprsnxms, Set cxprcsxms, Set dxdmtxsmries, Set pxstxarcvxtrns, Set pxdlvryxchnlxms, Set pxmnlxgnrtnxms, Set cxrlbkxms, Set pxbncdxtras, Set dxtrnsxsmryxms, Set pxstxarcvxms, Set pxmtxgrpxms, Set pxetlxflxms, Set pxadxstxms, Set dxprxprdtnxms, Set pxbncdxrsnxms, Set pxprdctxdtls, Set pxemlxpsdxms, Set dxprdtnxdtlsxms, Set pxemlxcngs, Set pxprdctxslas, Set pxusxprdctxlnks, Long cdexprdt, String pthxexlxprdct) {
/*  68 */     this.ixprdt = ixprdt;
/*  69 */     this.pxbncdxmlxcng = pxbncdxmlxcng;
/*  70 */     this.pxemxsrvxcnfg = pxemxsrvxcnfg;
/*  71 */     this.nmxprdt = nmxprdt;
/*  72 */     this.dscxprdt = dscxprdt;
/*  73 */     this.dr1xfl = dr1xfl;
/*  74 */     this.dr2xfl = dr2xfl;
/*  75 */     this.dr3xfl = dr3xfl;
/*  76 */     this.dr4xfl = dr4xfl;
/*  77 */     this.dxctd = dxctd;
/*  78 */     this.bxctd = bxctd;
/*  79 */     this.dxmfdxlst = dxmfdxlst;
/*  80 */     this.bxmfdxlst = bxmfdxlst;
/*  81 */     this.isxflgebp = isxflgebp;
/*  82 */     this.ixprm = ixprm;
/*  83 */     this.ixdpt = ixdpt;
/*  84 */     this.pxeshdlrxprsxms = pxeshdlrxprsxms;
/*  85 */     this.pxmtxrlxms = pxmtxrlxms;
/*  86 */     this.cxsuprsnxms = cxsuprsnxms;
/*  87 */     this.cxprcsxms = cxprcsxms;
/*  88 */     this.dxdmtxsmries = dxdmtxsmries;
/*  89 */     this.pxstxarcvxtrns = pxstxarcvxtrns;
/*  90 */     this.pxdlvryxchnlxms = pxdlvryxchnlxms;
/*  91 */     this.pxmnlxgnrtnxms = pxmnlxgnrtnxms;
/*  92 */     this.cxrlbkxms = cxrlbkxms;
/*  93 */     this.pxbncdxtras = pxbncdxtras;
/*  94 */     this.dxtrnsxsmryxms = dxtrnsxsmryxms;
/*  95 */     this.pxstxarcvxms = pxstxarcvxms;
/*  96 */     this.pxmtxgrpxms = pxmtxgrpxms;
/*  97 */     this.pxetlxflxms = pxetlxflxms;
/*  98 */     this.pxadxstxms = pxadxstxms;
/*  99 */     this.dxprxprdtnxms = dxprxprdtnxms;
/* 100 */     this.pxbncdxrsnxms = pxbncdxrsnxms;
/* 101 */     this.pxprdctxdtls = pxprdctxdtls;
/* 102 */     this.pxemlxpsdxms = pxemlxpsdxms;
/* 103 */     this.dxprdtnxdtlsxms = dxprdtnxdtlsxms;
/* 104 */     this.pxemlxcngs = pxemlxcngs;
/* 105 */     this.pxprdctxslas = pxprdctxslas;
/* 106 */     this.pxusxprdctxlnks = pxusxprdctxlnks;
/* 107 */     this.cdexprdt = cdexprdt;
/* 108 */     this.pthxexlxprdct = pthxexlxprdct;
/*     */   }
/*     */   
/*     */   public Long getIxprdt() {
/* 112 */     return this.ixprdt;
/*     */   }
/*     */   
/*     */   public void setIxprdt(Long ixprdt) {
/* 116 */     this.ixprdt = ixprdt;
/*     */   }
/*     */   public Pxbncdxmlxcng getPxbncdxmlxcng() {
/* 119 */     return this.pxbncdxmlxcng;
/*     */   }
/*     */   
/*     */   public void setPxbncdxmlxcng(Pxbncdxmlxcng pxbncdxmlxcng) {
/* 123 */     this.pxbncdxmlxcng = pxbncdxmlxcng;
/*     */   }
/*     */   public Pxemxsrvxcnfg getPxemxsrvxcnfg() {
/* 126 */     return this.pxemxsrvxcnfg;
/*     */   }
/*     */   
/*     */   public void setPxemxsrvxcnfg(Pxemxsrvxcnfg pxemxsrvxcnfg) {
/* 130 */     this.pxemxsrvxcnfg = pxemxsrvxcnfg;
/*     */   }
/*     */   public String getNmxprdt() {
/* 133 */     return this.nmxprdt;
/*     */   }
/*     */   
/*     */   public void setNmxprdt(String nmxprdt) {
/* 137 */     this.nmxprdt = nmxprdt;
/*     */   }
/*     */   public String getDscxprdt() {
/* 140 */     return this.dscxprdt;
/*     */   }
/*     */   
/*     */   public void setDscxprdt(String dscxprdt) {
/* 144 */     this.dscxprdt = dscxprdt;
/*     */   }
/*     */   public String getDr1xfl() {
/* 147 */     return this.dr1xfl;
/*     */   }
/*     */   
/*     */   public void setDr1xfl(String dr1xfl) {
/* 151 */     this.dr1xfl = dr1xfl;
/*     */   }
/*     */   public String getDr2xfl() {
/* 154 */     return this.dr2xfl;
/*     */   }
/*     */   
/*     */   public void setDr2xfl(String dr2xfl) {
/* 158 */     this.dr2xfl = dr2xfl;
/*     */   }
/*     */   public String getDr3xfl() {
/* 161 */     return this.dr3xfl;
/*     */   }
/*     */   
/*     */   public void setDr3xfl(String dr3xfl) {
/* 165 */     this.dr3xfl = dr3xfl;
/*     */   }
/*     */   public String getDr4xfl() {
/* 168 */     return this.dr4xfl;
/*     */   }
/*     */   
/*     */   public void setDr4xfl(String dr4xfl) {
/* 172 */     this.dr4xfl = dr4xfl;
/*     */   }
/*     */   public Date getDxctd() {
/* 175 */     return this.dxctd;
/*     */   }
/*     */   
/*     */   public void setDxctd(Date dxctd) {
/* 179 */     this.dxctd = dxctd;
/*     */   }
/*     */   public String getBxctd() {
/* 182 */     return this.bxctd;
/*     */   }
/*     */   
/*     */   public void setBxctd(String bxctd) {
/* 186 */     this.bxctd = bxctd;
/*     */   }
/*     */   public Date getDxmfdxlst() {
/* 189 */     return this.dxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setDxmfdxlst(Date dxmfdxlst) {
/* 193 */     this.dxmfdxlst = dxmfdxlst;
/*     */   }
/*     */   public String getBxmfdxlst() {
/* 196 */     return this.bxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setBxmfdxlst(String bxmfdxlst) {
/* 200 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */   public String getIsxflgebp() {
/* 203 */     return this.isxflgebp;
/*     */   }
/*     */   
/*     */   public void setIsxflgebp(String isxflgebp) {
/* 207 */     this.isxflgebp = isxflgebp;
/*     */   }
/*     */   public Long getIxprm() {
/* 210 */     return this.ixprm;
/*     */   }
/*     */   
/*     */   public void setIxprm(Long ixprm) {
/* 214 */     this.ixprm = ixprm;
/*     */   }
/*     */   public Long getIxdpt() {
/* 217 */     return this.ixdpt;
/*     */   }
/*     */   
/*     */   public void setIxdpt(Long ixdpt) {
/* 221 */     this.ixdpt = ixdpt;
/*     */   }
/*     */   public Set getPxeshdlrxprsxms() {
/* 224 */     return this.pxeshdlrxprsxms;
/*     */   }
/*     */   
/*     */   public void setPxeshdlrxprsxms(Set pxeshdlrxprsxms) {
/* 228 */     this.pxeshdlrxprsxms = pxeshdlrxprsxms;
/*     */   }
/*     */   public Set getPxmtxrlxms() {
/* 231 */     return this.pxmtxrlxms;
/*     */   }
/*     */   
/*     */   public void setPxmtxrlxms(Set pxmtxrlxms) {
/* 235 */     this.pxmtxrlxms = pxmtxrlxms;
/*     */   }
/*     */   public Set getCxsuprsnxms() {
/* 238 */     return this.cxsuprsnxms;
/*     */   }
/*     */   
/*     */   public void setCxsuprsnxms(Set cxsuprsnxms) {
/* 242 */     this.cxsuprsnxms = cxsuprsnxms;
/*     */   }
/*     */   public Set getCxprcsxms() {
/* 245 */     return this.cxprcsxms;
/*     */   }
/*     */   
/*     */   public void setCxprcsxms(Set cxprcsxms) {
/* 249 */     this.cxprcsxms = cxprcsxms;
/*     */   }
/*     */   public Set getDxdmtxsmries() {
/* 252 */     return this.dxdmtxsmries;
/*     */   }
/*     */   
/*     */   public void setDxdmtxsmries(Set dxdmtxsmries) {
/* 256 */     this.dxdmtxsmries = dxdmtxsmries;
/*     */   }
/*     */   public Set getPxstxarcvxtrns() {
/* 259 */     return this.pxstxarcvxtrns;
/*     */   }
/*     */   
/*     */   public void setPxstxarcvxtrns(Set pxstxarcvxtrns) {
/* 263 */     this.pxstxarcvxtrns = pxstxarcvxtrns;
/*     */   }
/*     */   public Set getPxdlvryxchnlxms() {
/* 266 */     return this.pxdlvryxchnlxms;
/*     */   }
/*     */   
/*     */   public void setPxdlvryxchnlxms(Set pxdlvryxchnlxms) {
/* 270 */     this.pxdlvryxchnlxms = pxdlvryxchnlxms;
/*     */   }
/*     */   public Set getPxmnlxgnrtnxms() {
/* 273 */     return this.pxmnlxgnrtnxms;
/*     */   }
/*     */   
/*     */   public void setPxmnlxgnrtnxms(Set pxmnlxgnrtnxms) {
/* 277 */     this.pxmnlxgnrtnxms = pxmnlxgnrtnxms;
/*     */   }
/*     */   public Set getCxrlbkxms() {
/* 280 */     return this.cxrlbkxms;
/*     */   }
/*     */   
/*     */   public void setCxrlbkxms(Set cxrlbkxms) {
/* 284 */     this.cxrlbkxms = cxrlbkxms;
/*     */   }
/*     */   public Set getPxbncdxtras() {
/* 287 */     return this.pxbncdxtras;
/*     */   }
/*     */   
/*     */   public void setPxbncdxtras(Set pxbncdxtras) {
/* 291 */     this.pxbncdxtras = pxbncdxtras;
/*     */   }
/*     */   public Set getDxtrnsxsmryxms() {
/* 294 */     return this.dxtrnsxsmryxms;
/*     */   }
/*     */   
/*     */   public void setDxtrnsxsmryxms(Set dxtrnsxsmryxms) {
/* 298 */     this.dxtrnsxsmryxms = dxtrnsxsmryxms;
/*     */   }
/*     */   public Set getPxstxarcvxms() {
/* 301 */     return this.pxstxarcvxms;
/*     */   }
/*     */   
/*     */   public void setPxstxarcvxms(Set pxstxarcvxms) {
/* 305 */     this.pxstxarcvxms = pxstxarcvxms;
/*     */   }
/*     */   public Set getPxmtxgrpxms() {
/* 308 */     return this.pxmtxgrpxms;
/*     */   }
/*     */   
/*     */   public void setPxmtxgrpxms(Set pxmtxgrpxms) {
/* 312 */     this.pxmtxgrpxms = pxmtxgrpxms;
/*     */   }
/*     */   public Set getPxetlxflxms() {
/* 315 */     return this.pxetlxflxms;
/*     */   }
/*     */   
/*     */   public void setPxetlxflxms(Set pxetlxflxms) {
/* 319 */     this.pxetlxflxms = pxetlxflxms;
/*     */   }
/*     */   public Set getPxadxstxms() {
/* 322 */     return this.pxadxstxms;
/*     */   }
/*     */   
/*     */   public void setPxadxstxms(Set pxadxstxms) {
/* 326 */     this.pxadxstxms = pxadxstxms;
/*     */   }
/*     */   public Set getDxprxprdtnxms() {
/* 329 */     return this.dxprxprdtnxms;
/*     */   }
/*     */   
/*     */   public void setDxprxprdtnxms(Set dxprxprdtnxms) {
/* 333 */     this.dxprxprdtnxms = dxprxprdtnxms;
/*     */   }
/*     */   public Set getPxbncdxrsnxms() {
/* 336 */     return this.pxbncdxrsnxms;
/*     */   }
/*     */   
/*     */   public void setPxbncdxrsnxms(Set pxbncdxrsnxms) {
/* 340 */     this.pxbncdxrsnxms = pxbncdxrsnxms;
/*     */   }
/*     */   public Set getPxprdctxdtls() {
/* 343 */     return this.pxprdctxdtls;
/*     */   }
/*     */   
/*     */   public void setPxprdctxdtls(Set pxprdctxdtls) {
/* 347 */     this.pxprdctxdtls = pxprdctxdtls;
/*     */   }
/*     */   public Set getPxemlxpsdxms() {
/* 350 */     return this.pxemlxpsdxms;
/*     */   }
/*     */   
/*     */   public void setPxemlxpsdxms(Set pxemlxpsdxms) {
/* 354 */     this.pxemlxpsdxms = pxemlxpsdxms;
/*     */   }
/*     */   public Set getDxprdtnxdtlsxms() {
/* 357 */     return this.dxprdtnxdtlsxms;
/*     */   }
/*     */   
/*     */   public void setDxprdtnxdtlsxms(Set dxprdtnxdtlsxms) {
/* 361 */     this.dxprdtnxdtlsxms = dxprdtnxdtlsxms;
/*     */   }
/*     */   public Set getPxemlxcngs() {
/* 364 */     return this.pxemlxcngs;
/*     */   }
/*     */   
/*     */   public void setPxemlxcngs(Set pxemlxcngs) {
/* 368 */     this.pxemlxcngs = pxemlxcngs;
/*     */   }
/*     */   public Set getPxprdctxslas() {
/* 371 */     return this.pxprdctxslas;
/*     */   }
/*     */   
/*     */   public void setPxprdctxslas(Set pxprdctxslas) {
/* 375 */     this.pxprdctxslas = pxprdctxslas;
/*     */   }
/*     */   public Set getPxusxprdctxlnks() {
/* 378 */     return this.pxusxprdctxlnks;
/*     */   }
/*     */   
/*     */   public void setPxusxprdctxlnks(Set pxusxprdctxlnks) {
/* 382 */     this.pxusxprdctxlnks = pxusxprdctxlnks;
/*     */   }
/*     */   
/*     */   public Long getCdexprdt() {
/* 386 */     return this.cdexprdt;
/*     */   }
/*     */   
/*     */   public void setCdexprdt(Long cdexprdt) {
/* 390 */     this.cdexprdt = cdexprdt;
/*     */   }
/*     */   
/*     */   public String getPthxexlxprdct() {
/* 394 */     return this.pthxexlxprdct;
/*     */   }
/*     */   
/*     */   public void setPthxexlxprdct(String pthxexlxprdct) {
/* 398 */     this.pthxexlxprdct = pthxexlxprdct;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pxprdctxm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */