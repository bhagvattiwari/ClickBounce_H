/*     */ package com.seeinfobiz.click.entitybean;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.math.BigDecimal;
/*     */ import java.util.Date;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Pxemlxcrtraxm
/*     */   implements Serializable
/*     */ {
/*     */   private Long ixcrtraxem;
/*     */   private Pxemlxpsdxm pxemlxpsdxm;
/*     */   private String crtxwdpxem;
/*     */   private String rng;
/*     */   private BigDecimal lnxwdxp;
/*     */   private Date dxctd;
/*     */   private String bxctd;
/*     */   private Date dxmfdxlst;
/*     */   private String bxmfdxlst;
/*     */   
/*     */   public Pxemlxcrtraxm() {}
/*     */   
/*     */   public Pxemlxcrtraxm(Long ixcrtraxem) {
/*  29 */     this.ixcrtraxem = ixcrtraxem;
/*     */   }
/*     */   public Pxemlxcrtraxm(Long ixcrtraxem, Pxemlxpsdxm pxemlxpsdxm, String crtxwdpxem, String rng, BigDecimal lnxwdxp, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst) {
/*  32 */     this.ixcrtraxem = ixcrtraxem;
/*  33 */     this.pxemlxpsdxm = pxemlxpsdxm;
/*  34 */     this.crtxwdpxem = crtxwdpxem;
/*  35 */     this.rng = rng;
/*  36 */     this.lnxwdxp = lnxwdxp;
/*  37 */     this.dxctd = dxctd;
/*  38 */     this.bxctd = bxctd;
/*  39 */     this.dxmfdxlst = dxmfdxlst;
/*  40 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */   
/*     */   public Long getIxcrtraxem() {
/*  44 */     return this.ixcrtraxem;
/*     */   }
/*     */   
/*     */   public void setIxcrtraxem(Long ixcrtraxem) {
/*  48 */     this.ixcrtraxem = ixcrtraxem;
/*     */   }
/*     */   public Pxemlxpsdxm getPxemlxpsdxm() {
/*  51 */     return this.pxemlxpsdxm;
/*     */   }
/*     */   
/*     */   public void setPxemlxpsdxm(Pxemlxpsdxm pxemlxpsdxm) {
/*  55 */     this.pxemlxpsdxm = pxemlxpsdxm;
/*     */   }
/*     */   public String getCrtxwdpxem() {
/*  58 */     return this.crtxwdpxem;
/*     */   }
/*     */   
/*     */   public void setCrtxwdpxem(String crtxwdpxem) {
/*  62 */     this.crtxwdpxem = crtxwdpxem;
/*     */   }
/*     */   public String getRng() {
/*  65 */     return this.rng;
/*     */   }
/*     */   
/*     */   public void setRng(String rng) {
/*  69 */     this.rng = rng;
/*     */   }
/*     */   public BigDecimal getLnxwdxp() {
/*  72 */     return this.lnxwdxp;
/*     */   }
/*     */   
/*     */   public void setLnxwdxp(BigDecimal lnxwdxp) {
/*  76 */     this.lnxwdxp = lnxwdxp;
/*     */   }
/*     */   public Date getDxctd() {
/*  79 */     return this.dxctd;
/*     */   }
/*     */   
/*     */   public void setDxctd(Date dxctd) {
/*  83 */     this.dxctd = dxctd;
/*     */   }
/*     */   public String getBxctd() {
/*  86 */     return this.bxctd;
/*     */   }
/*     */   
/*     */   public void setBxctd(String bxctd) {
/*  90 */     this.bxctd = bxctd;
/*     */   }
/*     */   public Date getDxmfdxlst() {
/*  93 */     return this.dxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setDxmfdxlst(Date dxmfdxlst) {
/*  97 */     this.dxmfdxlst = dxmfdxlst;
/*     */   }
/*     */   public String getBxmfdxlst() {
/* 100 */     return this.bxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setBxmfdxlst(String bxmfdxlst) {
/* 104 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pxemlxcrtraxm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */