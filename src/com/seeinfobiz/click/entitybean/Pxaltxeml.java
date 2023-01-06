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
/*     */ public class Pxaltxeml
/*     */   implements Serializable
/*     */ {
/*     */   private Long ixaltxeml;
/*     */   private String crn;
/*     */   private String tyxevntxeml;
/*     */   private String flxsnt;
/*     */   private BigDecimal noxaccsxcnt;
/*     */   private Date dxctd;
/*     */   private String bxctd;
/*     */   private Date dxmfdxlst;
/*     */   private String bxmfdxlst;
/*     */   
/*     */   public Pxaltxeml() {}
/*     */   
/*     */   public Pxaltxeml(Long ixaltxeml) {
/*  29 */     this.ixaltxeml = ixaltxeml;
/*     */   }
/*     */   public Pxaltxeml(Long ixaltxeml, String crn, String tyxevntxeml, String flxsnt, BigDecimal noxaccsxcnt, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst) {
/*  32 */     this.ixaltxeml = ixaltxeml;
/*  33 */     this.crn = crn;
/*  34 */     this.tyxevntxeml = tyxevntxeml;
/*  35 */     this.flxsnt = flxsnt;
/*  36 */     this.noxaccsxcnt = noxaccsxcnt;
/*  37 */     this.dxctd = dxctd;
/*  38 */     this.bxctd = bxctd;
/*  39 */     this.dxmfdxlst = dxmfdxlst;
/*  40 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */   
/*     */   public Long getIxaltxeml() {
/*  44 */     return this.ixaltxeml;
/*     */   }
/*     */   
/*     */   public void setIxaltxeml(Long ixaltxeml) {
/*  48 */     this.ixaltxeml = ixaltxeml;
/*     */   }
/*     */   public String getCrn() {
/*  51 */     return this.crn;
/*     */   }
/*     */   
/*     */   public void setCrn(String crn) {
/*  55 */     this.crn = crn;
/*     */   }
/*     */   public String getTyxevntxeml() {
/*  58 */     return this.tyxevntxeml;
/*     */   }
/*     */   
/*     */   public void setTyxevntxeml(String tyxevntxeml) {
/*  62 */     this.tyxevntxeml = tyxevntxeml;
/*     */   }
/*     */   public String getFlxsnt() {
/*  65 */     return this.flxsnt;
/*     */   }
/*     */   
/*     */   public void setFlxsnt(String flxsnt) {
/*  69 */     this.flxsnt = flxsnt;
/*     */   }
/*     */   public BigDecimal getNoxaccsxcnt() {
/*  72 */     return this.noxaccsxcnt;
/*     */   }
/*     */   
/*     */   public void setNoxaccsxcnt(BigDecimal noxaccsxcnt) {
/*  76 */     this.noxaccsxcnt = noxaccsxcnt;
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


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pxaltxeml.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */