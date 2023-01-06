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
/*     */ public class Pxusrxtmpxrgtxm
/*     */   implements Serializable
/*     */ {
/*     */   private Long ixtmpxu;
/*     */   private Pxusrxm pxusrxm;
/*     */   private Date dxstxtmp;
/*     */   private Date dxedxtmp;
/*     */   private Date dxctd;
/*     */   private String bxctd;
/*     */   private Date dxmfdxlst;
/*     */   private String bxmfdxlst;
/*  23 */   private Set<Pxusrxtmpxrgtxdtl> pxusrxtmpxrgtxdtls = new HashSet<Pxusrxtmpxrgtxdtl>(0);
/*     */ 
/*     */   
/*     */   public Pxusrxtmpxrgtxm() {}
/*     */ 
/*     */   
/*     */   public Pxusrxtmpxrgtxm(Long ixtmpxu) {
/*  30 */     this.ixtmpxu = ixtmpxu;
/*     */   }
/*     */   public Pxusrxtmpxrgtxm(Long ixtmpxu, Pxusrxm pxusrxm, Date dxstxtmp, Date dxedxtmp, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst, Set<Pxusrxtmpxrgtxdtl> pxusrxtmpxrgtxdtls) {
/*  33 */     this.ixtmpxu = ixtmpxu;
/*  34 */     this.pxusrxm = pxusrxm;
/*  35 */     this.dxstxtmp = dxstxtmp;
/*  36 */     this.dxedxtmp = dxedxtmp;
/*  37 */     this.dxctd = dxctd;
/*  38 */     this.bxctd = bxctd;
/*  39 */     this.dxmfdxlst = dxmfdxlst;
/*  40 */     this.bxmfdxlst = bxmfdxlst;
/*  41 */     this.pxusrxtmpxrgtxdtls = pxusrxtmpxrgtxdtls;
/*     */   }
/*     */   
/*     */   public Long getIxtmpxu() {
/*  45 */     return this.ixtmpxu;
/*     */   }
/*     */   
/*     */   public void setIxtmpxu(Long ixtmpxu) {
/*  49 */     this.ixtmpxu = ixtmpxu;
/*     */   }
/*     */   public Pxusrxm getPxusrxm() {
/*  52 */     return this.pxusrxm;
/*     */   }
/*     */   
/*     */   public void setPxusrxm(Pxusrxm pxusrxm) {
/*  56 */     this.pxusrxm = pxusrxm;
/*     */   }
/*     */   public Date getDxstxtmp() {
/*  59 */     return this.dxstxtmp;
/*     */   }
/*     */   
/*     */   public void setDxstxtmp(Date dxstxtmp) {
/*  63 */     this.dxstxtmp = dxstxtmp;
/*     */   }
/*     */   public Date getDxedxtmp() {
/*  66 */     return this.dxedxtmp;
/*     */   }
/*     */   
/*     */   public void setDxedxtmp(Date dxedxtmp) {
/*  70 */     this.dxedxtmp = dxedxtmp;
/*     */   }
/*     */   public Date getDxctd() {
/*  73 */     return this.dxctd;
/*     */   }
/*     */   
/*     */   public void setDxctd(Date dxctd) {
/*  77 */     this.dxctd = dxctd;
/*     */   }
/*     */   public String getBxctd() {
/*  80 */     return this.bxctd;
/*     */   }
/*     */   
/*     */   public void setBxctd(String bxctd) {
/*  84 */     this.bxctd = bxctd;
/*     */   }
/*     */   public Date getDxmfdxlst() {
/*  87 */     return this.dxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setDxmfdxlst(Date dxmfdxlst) {
/*  91 */     this.dxmfdxlst = dxmfdxlst;
/*     */   }
/*     */   public String getBxmfdxlst() {
/*  94 */     return this.bxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setBxmfdxlst(String bxmfdxlst) {
/*  98 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */   public Set<Pxusrxtmpxrgtxdtl> getPxusrxtmpxrgtxdtls() {
/* 101 */     return this.pxusrxtmpxrgtxdtls;
/*     */   }
/*     */   
/*     */   public void setPxusrxtmpxrgtxdtls(Set<Pxusrxtmpxrgtxdtl> pxusrxtmpxrgtxdtls) {
/* 105 */     this.pxusrxtmpxrgtxdtls = pxusrxtmpxrgtxdtls;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pxusrxtmpxrgtxm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */