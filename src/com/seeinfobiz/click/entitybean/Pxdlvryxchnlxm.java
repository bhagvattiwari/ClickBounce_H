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
/*     */ public class Pxdlvryxchnlxm
/*     */   implements Serializable
/*     */ {
/*     */   private Long idxchnl;
/*     */   private Pxprdctxm pxprdctxm;
/*     */   private String typxstp;
/*     */   private Date dxctd;
/*     */   private String bxctd;
/*     */   private Date dxmfdxlst;
/*     */   private String bxmfdxlst;
/*     */   private String fmtxst;
/*     */   private String wdpxprctn;
/*     */   private String sgnxdgtl;
/*     */   private String flxcmprs;
/*     */   private String szxcmprs;
/*     */   private String flxgrp;
/*     */   private String szxgrp;
/*     */   private String flxprnt;
/*     */   private String flxem;
/*     */   private String flxfx;
/*     */   private String flxxprt;
/*     */   private String flxsrch;
/*     */   private String flxrptxpl;
/*     */   private Long prrty;
/*     */   
/*     */   public Pxdlvryxchnlxm() {}
/*     */   
/*     */   public Pxdlvryxchnlxm(Long idxchnl) {
/*  41 */     this.idxchnl = idxchnl;
/*     */   }
/*     */   public Pxdlvryxchnlxm(Long idxchnl, Pxprdctxm pxprdctxm, String typxstp, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst, String fmtxst, String wdpxprctn, String sgnxdgtl, String flxcmprs, String szxcmprs, String flxgrp, String szxgrp, String flxprnt, String flxem, String flxfx, String flxxprt, String flxsrch, String flxrptxpl, Long prrty) {
/*  44 */     this.idxchnl = idxchnl;
/*  45 */     this.pxprdctxm = pxprdctxm;
/*  46 */     this.typxstp = typxstp;
/*  47 */     this.dxctd = dxctd;
/*  48 */     this.bxctd = bxctd;
/*  49 */     this.dxmfdxlst = dxmfdxlst;
/*  50 */     this.bxmfdxlst = bxmfdxlst;
/*  51 */     this.fmtxst = fmtxst;
/*  52 */     this.wdpxprctn = wdpxprctn;
/*  53 */     this.sgnxdgtl = sgnxdgtl;
/*  54 */     this.flxcmprs = flxcmprs;
/*  55 */     this.szxcmprs = szxcmprs;
/*  56 */     this.flxgrp = flxgrp;
/*  57 */     this.szxgrp = szxgrp;
/*  58 */     this.flxprnt = flxprnt;
/*  59 */     this.flxem = flxem;
/*  60 */     this.flxfx = flxfx;
/*  61 */     this.flxxprt = flxxprt;
/*  62 */     this.flxsrch = flxsrch;
/*  63 */     this.flxrptxpl = flxrptxpl;
/*  64 */     this.prrty = prrty;
/*     */   }
/*     */   
/*     */   public Long getIdxchnl() {
/*  68 */     return this.idxchnl;
/*     */   }
/*     */   
/*     */   public void setIdxchnl(Long idxchnl) {
/*  72 */     this.idxchnl = idxchnl;
/*     */   }
/*     */   public Pxprdctxm getPxprdctxm() {
/*  75 */     return this.pxprdctxm;
/*     */   }
/*     */   
/*     */   public void setPxprdctxm(Pxprdctxm pxprdctxm) {
/*  79 */     this.pxprdctxm = pxprdctxm;
/*     */   }
/*     */   public String getTypxstp() {
/*  82 */     return this.typxstp;
/*     */   }
/*     */   
/*     */   public void setTypxstp(String typxstp) {
/*  86 */     this.typxstp = typxstp;
/*     */   }
/*     */   public Date getDxctd() {
/*  89 */     return this.dxctd;
/*     */   }
/*     */   
/*     */   public void setDxctd(Date dxctd) {
/*  93 */     this.dxctd = dxctd;
/*     */   }
/*     */   public String getBxctd() {
/*  96 */     return this.bxctd;
/*     */   }
/*     */   
/*     */   public void setBxctd(String bxctd) {
/* 100 */     this.bxctd = bxctd;
/*     */   }
/*     */   public Date getDxmfdxlst() {
/* 103 */     return this.dxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setDxmfdxlst(Date dxmfdxlst) {
/* 107 */     this.dxmfdxlst = dxmfdxlst;
/*     */   }
/*     */   public String getBxmfdxlst() {
/* 110 */     return this.bxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setBxmfdxlst(String bxmfdxlst) {
/* 114 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */   public String getFmtxst() {
/* 117 */     return this.fmtxst;
/*     */   }
/*     */   
/*     */   public void setFmtxst(String fmtxst) {
/* 121 */     this.fmtxst = fmtxst;
/*     */   }
/*     */   public String getWdpxprctn() {
/* 124 */     return this.wdpxprctn;
/*     */   }
/*     */   
/*     */   public void setWdpxprctn(String wdpxprctn) {
/* 128 */     this.wdpxprctn = wdpxprctn;
/*     */   }
/*     */   public String getSgnxdgtl() {
/* 131 */     return this.sgnxdgtl;
/*     */   }
/*     */   
/*     */   public void setSgnxdgtl(String sgnxdgtl) {
/* 135 */     this.sgnxdgtl = sgnxdgtl;
/*     */   }
/*     */   public String getFlxcmprs() {
/* 138 */     return this.flxcmprs;
/*     */   }
/*     */   
/*     */   public void setFlxcmprs(String flxcmprs) {
/* 142 */     this.flxcmprs = flxcmprs;
/*     */   }
/*     */   public String getSzxcmprs() {
/* 145 */     return this.szxcmprs;
/*     */   }
/*     */   
/*     */   public void setSzxcmprs(String szxcmprs) {
/* 149 */     this.szxcmprs = szxcmprs;
/*     */   }
/*     */   public String getFlxgrp() {
/* 152 */     return this.flxgrp;
/*     */   }
/*     */   
/*     */   public void setFlxgrp(String flxgrp) {
/* 156 */     this.flxgrp = flxgrp;
/*     */   }
/*     */   public String getSzxgrp() {
/* 159 */     return this.szxgrp;
/*     */   }
/*     */   
/*     */   public void setSzxgrp(String szxgrp) {
/* 163 */     this.szxgrp = szxgrp;
/*     */   }
/*     */   public String getFlxprnt() {
/* 166 */     return this.flxprnt;
/*     */   }
/*     */   
/*     */   public void setFlxprnt(String flxprnt) {
/* 170 */     this.flxprnt = flxprnt;
/*     */   }
/*     */   public String getFlxem() {
/* 173 */     return this.flxem;
/*     */   }
/*     */   
/*     */   public void setFlxem(String flxem) {
/* 177 */     this.flxem = flxem;
/*     */   }
/*     */   public String getFlxfx() {
/* 180 */     return this.flxfx;
/*     */   }
/*     */   
/*     */   public void setFlxfx(String flxfx) {
/* 184 */     this.flxfx = flxfx;
/*     */   }
/*     */   public String getFlxxprt() {
/* 187 */     return this.flxxprt;
/*     */   }
/*     */   
/*     */   public void setFlxxprt(String flxxprt) {
/* 191 */     this.flxxprt = flxxprt;
/*     */   }
/*     */   public String getFlxsrch() {
/* 194 */     return this.flxsrch;
/*     */   }
/*     */   
/*     */   public void setFlxsrch(String flxsrch) {
/* 198 */     this.flxsrch = flxsrch;
/*     */   }
/*     */   public String getFlxrptxpl() {
/* 201 */     return this.flxrptxpl;
/*     */   }
/*     */   
/*     */   public void setFlxrptxpl(String flxrptxpl) {
/* 205 */     this.flxrptxpl = flxrptxpl;
/*     */   }
/*     */   public Long getPrrty() {
/* 208 */     return this.prrty;
/*     */   }
/*     */   
/*     */   public void setPrrty(Long prrty) {
/* 212 */     this.prrty = prrty;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pxdlvryxchnlxm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */