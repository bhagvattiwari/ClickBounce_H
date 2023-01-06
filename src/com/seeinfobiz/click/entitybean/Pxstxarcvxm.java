/*     */ package com.seeinfobiz.click.entitybean;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import java.util.HashSet;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Pxstxarcvxm
/*     */   implements Serializable
/*     */ {
/*     */   private Long ixrlxarcv;
/*     */   private Pxprdctxm pxprdctxm;
/*     */   private String nmxrlxarcv;
/*     */   private Long mntsxfnxarcv;
/*     */   private Long ixprcs;
/*     */   private String rm;
/*     */   private Date dxctd;
/*     */   private String bxctd;
/*     */   private Date dxmfdxlst;
/*     */   private String bxmfdxlst;
/*     */   private String lcxflxem;
/*     */   private Boolean arcxrarxfrmt;
/*     */   private Boolean arcxzipxfrmt;
/*     */   private String arcxflxnm;
/*  27 */   private Set pxarcvxshdlrxms = new HashSet(0);
/*  28 */   private Set pxstxarcvxdtlses = new HashSet(0);
/*     */   
/*     */   private String prodcutName;
/*     */   
/*     */   private String sxsttuxs;
/*     */   private Long ixdpt;
/*     */   
/*     */   public Pxstxarcvxm() {}
/*     */   
/*     */   public Pxstxarcvxm(Long ixrlxarcv) {
/*  38 */     this.ixrlxarcv = ixrlxarcv;
/*     */   }
/*     */   
/*     */   public Pxstxarcvxm(Long ixrlxarcv, Pxprdctxm pxprdctxm, String nmxrlxarcv, Long mntsxfnxarcv, Long ixprcs, String rm, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst, String lcxflxem, Boolean arcxrarxfrmt, Boolean arcxzipxfrmt, String arcxflxnm, Set pxarcvxshdlrxms, Set pxstxarcvxdtlses, String sxsttuxs, Long ixdpt) {
/*  42 */     this.ixrlxarcv = ixrlxarcv;
/*  43 */     this.pxprdctxm = pxprdctxm;
/*  44 */     this.nmxrlxarcv = nmxrlxarcv;
/*  45 */     this.mntsxfnxarcv = mntsxfnxarcv;
/*  46 */     this.ixprcs = ixprcs;
/*  47 */     this.rm = rm;
/*  48 */     this.dxctd = dxctd;
/*  49 */     this.bxctd = bxctd;
/*  50 */     this.dxmfdxlst = dxmfdxlst;
/*  51 */     this.bxmfdxlst = bxmfdxlst;
/*  52 */     this.lcxflxem = lcxflxem;
/*  53 */     this.arcxrarxfrmt = arcxrarxfrmt;
/*  54 */     this.arcxzipxfrmt = arcxzipxfrmt;
/*  55 */     this.arcxflxnm = arcxflxnm;
/*  56 */     this.pxarcvxshdlrxms = pxarcvxshdlrxms;
/*  57 */     this.pxstxarcvxdtlses = pxstxarcvxdtlses;
/*  58 */     this.sxsttuxs = sxsttuxs;
/*  59 */     this.ixdpt = ixdpt;
/*     */   }
/*     */   
/*     */   public Long getIxrlxarcv() {
/*  63 */     return this.ixrlxarcv;
/*     */   }
/*     */   
/*     */   public void setIxrlxarcv(Long ixrlxarcv) {
/*  67 */     this.ixrlxarcv = ixrlxarcv;
/*     */   }
/*     */   
/*     */   public Pxprdctxm getPxprdctxm() {
/*  71 */     return this.pxprdctxm;
/*     */   }
/*     */   
/*     */   public void setPxprdctxm(Pxprdctxm pxprdctxm) {
/*  75 */     this.pxprdctxm = pxprdctxm;
/*     */   }
/*     */   
/*     */   public String getNmxrlxarcv() {
/*  79 */     return this.nmxrlxarcv;
/*     */   }
/*     */   
/*     */   public void setNmxrlxarcv(String nmxrlxarcv) {
/*  83 */     this.nmxrlxarcv = nmxrlxarcv;
/*     */   }
/*     */   
/*     */   public Long getMntsxfnxarcv() {
/*  87 */     return this.mntsxfnxarcv;
/*     */   }
/*     */   
/*     */   public void setMntsxfnxarcv(Long mntsxfnxarcv) {
/*  91 */     this.mntsxfnxarcv = mntsxfnxarcv;
/*     */   }
/*     */   
/*     */   public Long getIxprcs() {
/*  95 */     return this.ixprcs;
/*     */   }
/*     */   
/*     */   public void setIxprcs(Long ixprcs) {
/*  99 */     this.ixprcs = ixprcs;
/*     */   }
/*     */   
/*     */   public String getRm() {
/* 103 */     return this.rm;
/*     */   }
/*     */   
/*     */   public void setRm(String rm) {
/* 107 */     this.rm = rm;
/*     */   }
/*     */   
/*     */   public Date getDxctd() {
/* 111 */     return this.dxctd;
/*     */   }
/*     */   
/*     */   public void setDxctd(Date dxctd) {
/* 115 */     this.dxctd = dxctd;
/*     */   }
/*     */   
/*     */   public String getBxctd() {
/* 119 */     return this.bxctd;
/*     */   }
/*     */   
/*     */   public void setBxctd(String bxctd) {
/* 123 */     this.bxctd = bxctd;
/*     */   }
/*     */   
/*     */   public Date getDxmfdxlst() {
/* 127 */     return this.dxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setDxmfdxlst(Date dxmfdxlst) {
/* 131 */     this.dxmfdxlst = dxmfdxlst;
/*     */   }
/*     */   
/*     */   public String getBxmfdxlst() {
/* 135 */     return this.bxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setBxmfdxlst(String bxmfdxlst) {
/* 139 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */   
/*     */   public String getLcxflxem() {
/* 143 */     return this.lcxflxem;
/*     */   }
/*     */   
/*     */   public void setLcxflxem(String lcxflxem) {
/* 147 */     this.lcxflxem = lcxflxem;
/*     */   }
/*     */   
/*     */   public Boolean getArcxrarxfrmt() {
/* 151 */     return this.arcxrarxfrmt;
/*     */   }
/*     */   
/*     */   public void setArcxrarxfrmt(Boolean arcxrarxfrmt) {
/* 155 */     this.arcxrarxfrmt = arcxrarxfrmt;
/*     */   }
/*     */   
/*     */   public Boolean getArcxzipxfrmt() {
/* 159 */     return this.arcxzipxfrmt;
/*     */   }
/*     */   
/*     */   public void setArcxzipxfrmt(Boolean arcxzipxfrmt) {
/* 163 */     this.arcxzipxfrmt = arcxzipxfrmt;
/*     */   }
/*     */   
/*     */   public String getArcxflxnm() {
/* 167 */     return this.arcxflxnm;
/*     */   }
/*     */   
/*     */   public void setArcxflxnm(String arcxflxnm) {
/* 171 */     this.arcxflxnm = arcxflxnm;
/*     */   }
/*     */   
/*     */   public Set getPxarcvxshdlrxms() {
/* 175 */     return this.pxarcvxshdlrxms;
/*     */   }
/*     */   
/*     */   public void setPxarcvxshdlrxms(Set pxarcvxshdlrxms) {
/* 179 */     this.pxarcvxshdlrxms = pxarcvxshdlrxms;
/*     */   }
/*     */   
/*     */   public Set getPxstxarcvxdtlses() {
/* 183 */     return this.pxstxarcvxdtlses;
/*     */   }
/*     */   
/*     */   public void setPxstxarcvxdtlses(Set pxstxarcvxdtlses) {
/* 187 */     this.pxstxarcvxdtlses = pxstxarcvxdtlses;
/*     */   }
/*     */   
/*     */   public String getProdcutName() {
/* 191 */     return this.prodcutName;
/*     */   }
/*     */   
/*     */   public void setProdcutName(String prodcutName) {
/* 195 */     this.prodcutName = prodcutName;
/*     */   }
/*     */   
/*     */   public String getSxsttuxs() {
/* 199 */     return this.sxsttuxs;
/*     */   }
/*     */   
/*     */   public void setSxsttuxs(String sxsttuxs) {
/* 203 */     this.sxsttuxs = sxsttuxs;
/*     */   }
/*     */   
/*     */   public Long getIxdpt() {
/* 207 */     return this.ixdpt;
/*     */   }
/*     */   
/*     */   public void setIxdpt(Long ixdpt) {
/* 211 */     this.ixdpt = ixdpt;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pxstxarcvxm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */