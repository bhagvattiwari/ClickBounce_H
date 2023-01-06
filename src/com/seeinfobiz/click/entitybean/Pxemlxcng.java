/*     */ package com.seeinfobiz.click.entitybean;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Pxemlxcng
/*     */   implements Serializable
/*     */ {
/*     */   private Long ixcfgxem;
/*     */   private Pxprdctxm pxprdctxm;
/*     */   private String nmxcngxem;
/*     */   private String sbxem;
/*     */   private String adsxfrmxem;
/*     */   private String ixbncdxem;
/*     */   private String ixemxrply;
/*     */   private String fxprsnl;
/*     */   private String prsnlxmsgx1;
/*     */   private String prsnlxcolx1;
/*     */   private String prsnlxmsgx2;
/*     */   private String prsnlxcolx2;
/*     */   private String prsnlxmsgx3;
/*     */   private String prsnlxcolx3;
/*     */   private String srcxbdyxem;
/*     */   private String bdyxem;
/*     */   private Long fxatchxem;
/*     */   private String nm1xflxatchxem;
/*     */   private String lc1xflxatchxem;
/*     */   private String nm2xflxatchxem;
/*     */   private String lc2xflxatchxem;
/*     */   private String nm3xflxatchxem;
/*     */   private String lc3xflxatchxem;
/*     */   private String crtraxadnce;
/*     */   private String prmtrxqryxem;
/*     */   private String rmksxem;
/*     */   private String rmxmkrs;
/*     */   private String fxsttsxem;
/*     */   private Date dxctd;
/*     */   private String bxctd;
/*     */   private Date dxmfdxlst;
/*     */   private String bxmfdxlst;
/*     */   private String fxflxpathxem;
/*     */   private Long ixdpt;
/*     */   
/*     */   public Pxemlxcng() {}
/*     */   
/*     */   public Pxemlxcng(Long ixcfgxem) {
/*  50 */     this.ixcfgxem = ixcfgxem;
/*     */   }
/*     */   
/*     */   public Pxemlxcng(Long ixcfgxem, Pxprdctxm pxprdctxm, String nmxcngxem, String sbxem, String adsxfrmxem, String ixbncdxem, String ixemxrply, String fxprsnl, String prsnlxmsgx1, String prsnlxcolx1, String prsnlxmsgx2, String prsnlxcolx2, String prsnlxmsgx3, String prsnlxcolx3, String srcxbdyxem, String bdyxem, Long fxatchxem, String nm1xflxatchxem, String lc1xflxatchxem, String nm2xflxatchxem, String lc2xflxatchxem, String nm3xflxatchxem, String lc3xflxatchxem, String crtraxadnce, String prmtrxqryxem, String rmksxem, String rmxmkrs, String fxsttsxem, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst, String fxflxpathxem, Long ixdpt) {
/*  54 */     this.ixcfgxem = ixcfgxem;
/*  55 */     this.pxprdctxm = pxprdctxm;
/*  56 */     this.nmxcngxem = nmxcngxem;
/*  57 */     this.sbxem = sbxem;
/*  58 */     this.adsxfrmxem = adsxfrmxem;
/*  59 */     this.ixbncdxem = ixbncdxem;
/*  60 */     this.ixemxrply = ixemxrply;
/*  61 */     this.fxprsnl = fxprsnl;
/*  62 */     this.prsnlxmsgx1 = prsnlxmsgx1;
/*  63 */     this.prsnlxcolx1 = prsnlxcolx1;
/*  64 */     this.prsnlxmsgx2 = prsnlxmsgx2;
/*  65 */     this.prsnlxcolx2 = prsnlxcolx2;
/*  66 */     this.prsnlxmsgx3 = prsnlxmsgx3;
/*  67 */     this.prsnlxcolx3 = prsnlxcolx3;
/*  68 */     this.srcxbdyxem = srcxbdyxem;
/*  69 */     this.bdyxem = bdyxem;
/*  70 */     this.fxatchxem = fxatchxem;
/*  71 */     this.nm1xflxatchxem = nm1xflxatchxem;
/*  72 */     this.lc1xflxatchxem = lc1xflxatchxem;
/*  73 */     this.nm2xflxatchxem = nm2xflxatchxem;
/*  74 */     this.lc2xflxatchxem = lc2xflxatchxem;
/*  75 */     this.nm3xflxatchxem = nm3xflxatchxem;
/*  76 */     this.lc3xflxatchxem = lc3xflxatchxem;
/*  77 */     this.crtraxadnce = crtraxadnce;
/*  78 */     this.prmtrxqryxem = prmtrxqryxem;
/*  79 */     this.rmksxem = rmksxem;
/*  80 */     this.rmxmkrs = rmxmkrs;
/*  81 */     this.fxsttsxem = fxsttsxem;
/*  82 */     this.dxctd = dxctd;
/*  83 */     this.bxctd = bxctd;
/*  84 */     this.dxmfdxlst = dxmfdxlst;
/*  85 */     this.bxmfdxlst = bxmfdxlst;
/*  86 */     this.fxflxpathxem = fxflxpathxem;
/*  87 */     this.ixdpt = ixdpt;
/*     */   }
/*     */   
/*     */   public String getFxflxpathxem() {
/*  91 */     return this.fxflxpathxem;
/*     */   }
/*     */   
/*     */   public void setFxflxpathxem(String fxflxpathxem) {
/*  95 */     this.fxflxpathxem = fxflxpathxem;
/*     */   }
/*     */   
/*     */   public Long getIxcfgxem() {
/*  99 */     return this.ixcfgxem;
/*     */   }
/*     */   
/*     */   public void setIxcfgxem(Long ixcfgxem) {
/* 103 */     this.ixcfgxem = ixcfgxem;
/*     */   }
/*     */   
/*     */   public Pxprdctxm getPxprdctxm() {
/* 107 */     return this.pxprdctxm;
/*     */   }
/*     */   
/*     */   public void setPxprdctxm(Pxprdctxm pxprdctxm) {
/* 111 */     this.pxprdctxm = pxprdctxm;
/*     */   }
/*     */   
/*     */   public String getNmxcngxem() {
/* 115 */     return this.nmxcngxem;
/*     */   }
/*     */   
/*     */   public void setNmxcngxem(String nmxcngxem) {
/* 119 */     this.nmxcngxem = nmxcngxem;
/*     */   }
/*     */   
/*     */   public String getSbxem() {
/* 123 */     return this.sbxem;
/*     */   }
/*     */   
/*     */   public void setSbxem(String sbxem) {
/* 127 */     this.sbxem = sbxem;
/*     */   }
/*     */   
/*     */   public String getAdsxfrmxem() {
/* 131 */     return this.adsxfrmxem;
/*     */   }
/*     */   
/*     */   public void setAdsxfrmxem(String adsxfrmxem) {
/* 135 */     this.adsxfrmxem = adsxfrmxem;
/*     */   }
/*     */   
/*     */   public String getIxbncdxem() {
/* 139 */     return this.ixbncdxem;
/*     */   }
/*     */   
/*     */   public void setIxbncdxem(String ixbncdxem) {
/* 143 */     this.ixbncdxem = ixbncdxem;
/*     */   }
/*     */   
/*     */   public String getIxemxrply() {
/* 147 */     return this.ixemxrply;
/*     */   }
/*     */   
/*     */   public void setIxemxrply(String ixemxrply) {
/* 151 */     this.ixemxrply = ixemxrply;
/*     */   }
/*     */   
/*     */   public String getFxprsnl() {
/* 155 */     return this.fxprsnl;
/*     */   }
/*     */   
/*     */   public void setFxprsnl(String fxprsnl) {
/* 159 */     this.fxprsnl = fxprsnl;
/*     */   }
/*     */   
/*     */   public String getPrsnlxmsgx1() {
/* 163 */     return this.prsnlxmsgx1;
/*     */   }
/*     */   
/*     */   public void setPrsnlxmsgx1(String prsnlxmsgx1) {
/* 167 */     this.prsnlxmsgx1 = prsnlxmsgx1;
/*     */   }
/*     */   
/*     */   public String getPrsnlxcolx1() {
/* 171 */     return this.prsnlxcolx1;
/*     */   }
/*     */   
/*     */   public void setPrsnlxcolx1(String prsnlxcolx1) {
/* 175 */     this.prsnlxcolx1 = prsnlxcolx1;
/*     */   }
/*     */   
/*     */   public String getPrsnlxmsgx2() {
/* 179 */     return this.prsnlxmsgx2;
/*     */   }
/*     */   
/*     */   public void setPrsnlxmsgx2(String prsnlxmsgx2) {
/* 183 */     this.prsnlxmsgx2 = prsnlxmsgx2;
/*     */   }
/*     */   
/*     */   public String getPrsnlxcolx2() {
/* 187 */     return this.prsnlxcolx2;
/*     */   }
/*     */   
/*     */   public void setPrsnlxcolx2(String prsnlxcolx2) {
/* 191 */     this.prsnlxcolx2 = prsnlxcolx2;
/*     */   }
/*     */   
/*     */   public String getPrsnlxmsgx3() {
/* 195 */     return this.prsnlxmsgx3;
/*     */   }
/*     */   
/*     */   public void setPrsnlxmsgx3(String prsnlxmsgx3) {
/* 199 */     this.prsnlxmsgx3 = prsnlxmsgx3;
/*     */   }
/*     */   
/*     */   public String getPrsnlxcolx3() {
/* 203 */     return this.prsnlxcolx3;
/*     */   }
/*     */   
/*     */   public void setPrsnlxcolx3(String prsnlxcolx3) {
/* 207 */     this.prsnlxcolx3 = prsnlxcolx3;
/*     */   }
/*     */   
/*     */   public String getSrcxbdyxem() {
/* 211 */     return this.srcxbdyxem;
/*     */   }
/*     */   
/*     */   public void setSrcxbdyxem(String srcxbdyxem) {
/* 215 */     this.srcxbdyxem = srcxbdyxem;
/*     */   }
/*     */   
/*     */   public String getBdyxem() {
/* 219 */     return this.bdyxem;
/*     */   }
/*     */   
/*     */   public void setBdyxem(String bdyxem) {
/* 223 */     this.bdyxem = bdyxem;
/*     */   }
/*     */   
/*     */   public Long getFxatchxem() {
/* 227 */     return this.fxatchxem;
/*     */   }
/*     */   
/*     */   public void setFxatchxem(Long fxatchxem) {
/* 231 */     this.fxatchxem = fxatchxem;
/*     */   }
/*     */   
/*     */   public String getNm1xflxatchxem() {
/* 235 */     return this.nm1xflxatchxem;
/*     */   }
/*     */   
/*     */   public void setNm1xflxatchxem(String nm1xflxatchxem) {
/* 239 */     this.nm1xflxatchxem = nm1xflxatchxem;
/*     */   }
/*     */   
/*     */   public String getLc1xflxatchxem() {
/* 243 */     return this.lc1xflxatchxem;
/*     */   }
/*     */   
/*     */   public void setLc1xflxatchxem(String lc1xflxatchxem) {
/* 247 */     this.lc1xflxatchxem = lc1xflxatchxem;
/*     */   }
/*     */   
/*     */   public String getNm2xflxatchxem() {
/* 251 */     return this.nm2xflxatchxem;
/*     */   }
/*     */   
/*     */   public void setNm2xflxatchxem(String nm2xflxatchxem) {
/* 255 */     this.nm2xflxatchxem = nm2xflxatchxem;
/*     */   }
/*     */   
/*     */   public String getLc2xflxatchxem() {
/* 259 */     return this.lc2xflxatchxem;
/*     */   }
/*     */   
/*     */   public void setLc2xflxatchxem(String lc2xflxatchxem) {
/* 263 */     this.lc2xflxatchxem = lc2xflxatchxem;
/*     */   }
/*     */   
/*     */   public String getNm3xflxatchxem() {
/* 267 */     return this.nm3xflxatchxem;
/*     */   }
/*     */   
/*     */   public void setNm3xflxatchxem(String nm3xflxatchxem) {
/* 271 */     this.nm3xflxatchxem = nm3xflxatchxem;
/*     */   }
/*     */   
/*     */   public String getLc3xflxatchxem() {
/* 275 */     return this.lc3xflxatchxem;
/*     */   }
/*     */   
/*     */   public void setLc3xflxatchxem(String lc3xflxatchxem) {
/* 279 */     this.lc3xflxatchxem = lc3xflxatchxem;
/*     */   }
/*     */   
/*     */   public String getCrtraxadnce() {
/* 283 */     return this.crtraxadnce;
/*     */   }
/*     */   
/*     */   public void setCrtraxadnce(String crtraxadnce) {
/* 287 */     this.crtraxadnce = crtraxadnce;
/*     */   }
/*     */   
/*     */   public String getPrmtrxqryxem() {
/* 291 */     return this.prmtrxqryxem;
/*     */   }
/*     */   
/*     */   public void setPrmtrxqryxem(String prmtrxqryxem) {
/* 295 */     this.prmtrxqryxem = prmtrxqryxem;
/*     */   }
/*     */   
/*     */   public String getRmksxem() {
/* 299 */     return this.rmksxem;
/*     */   }
/*     */   
/*     */   public void setRmksxem(String rmksxem) {
/* 303 */     this.rmksxem = rmksxem;
/*     */   }
/*     */   
/*     */   public String getRmxmkrs() {
/* 307 */     return this.rmxmkrs;
/*     */   }
/*     */   
/*     */   public void setRmxmkrs(String rmxmkrs) {
/* 311 */     this.rmxmkrs = rmxmkrs;
/*     */   }
/*     */   
/*     */   public String getFxsttsxem() {
/* 315 */     return this.fxsttsxem;
/*     */   }
/*     */   
/*     */   public void setFxsttsxem(String fxsttsxem) {
/* 319 */     this.fxsttsxem = fxsttsxem;
/*     */   }
/*     */   
/*     */   public Date getDxctd() {
/* 323 */     return this.dxctd;
/*     */   }
/*     */   
/*     */   public void setDxctd(Date dxctd) {
/* 327 */     this.dxctd = dxctd;
/*     */   }
/*     */   
/*     */   public String getBxctd() {
/* 331 */     return this.bxctd;
/*     */   }
/*     */   
/*     */   public void setBxctd(String bxctd) {
/* 335 */     this.bxctd = bxctd;
/*     */   }
/*     */   
/*     */   public Date getDxmfdxlst() {
/* 339 */     return this.dxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setDxmfdxlst(Date dxmfdxlst) {
/* 343 */     this.dxmfdxlst = dxmfdxlst;
/*     */   }
/*     */   
/*     */   public String getBxmfdxlst() {
/* 347 */     return this.bxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setBxmfdxlst(String bxmfdxlst) {
/* 351 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */   
/*     */   public Long getIxdpt() {
/* 355 */     return this.ixdpt;
/*     */   }
/*     */   
/*     */   public void setIxdpt(Long ixdpt) {
/* 359 */     this.ixdpt = ixdpt;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pxemlxcng.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */