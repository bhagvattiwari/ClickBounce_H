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
/*     */ public class Pxprdctxdtl
/*     */   implements Serializable
/*     */ {
/*     */   private Long ixprdtxdtls;
/*     */   private Pxprdctxm pxprdctxm;
/*     */   private String ptxbatxetl;
/*     */   private String nmxzpxetl;
/*     */   private Date dxctd;
/*     */   private String bxctd;
/*     */   private Date dxmfdxlst;
/*     */   private String bxmfdxlst;
/*     */   private String nmxflxetl;
/*     */   
/*     */   public Pxprdctxdtl() {}
/*     */   
/*     */   public Pxprdctxdtl(Long ixprdtxdtls) {
/*  29 */     this.ixprdtxdtls = ixprdtxdtls;
/*     */   }
/*     */   public Pxprdctxdtl(Long ixprdtxdtls, Pxprdctxm pxprdctxm, String ptxbatxetl, String nmxzpxetl, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst, String nmxflxetl) {
/*  32 */     this.ixprdtxdtls = ixprdtxdtls;
/*  33 */     this.pxprdctxm = pxprdctxm;
/*  34 */     this.ptxbatxetl = ptxbatxetl;
/*  35 */     this.nmxzpxetl = nmxzpxetl;
/*  36 */     this.dxctd = dxctd;
/*  37 */     this.bxctd = bxctd;
/*  38 */     this.dxmfdxlst = dxmfdxlst;
/*  39 */     this.bxmfdxlst = bxmfdxlst;
/*  40 */     this.nmxflxetl = nmxflxetl;
/*     */   }
/*     */   
/*     */   public Long getIxprdtxdtls() {
/*  44 */     return this.ixprdtxdtls;
/*     */   }
/*     */   
/*     */   public void setIxprdtxdtls(Long ixprdtxdtls) {
/*  48 */     this.ixprdtxdtls = ixprdtxdtls;
/*     */   }
/*     */   public Pxprdctxm getPxprdctxm() {
/*  51 */     return this.pxprdctxm;
/*     */   }
/*     */   
/*     */   public void setPxprdctxm(Pxprdctxm pxprdctxm) {
/*  55 */     this.pxprdctxm = pxprdctxm;
/*     */   }
/*     */   public String getPtxbatxetl() {
/*  58 */     return this.ptxbatxetl;
/*     */   }
/*     */   
/*     */   public void setPtxbatxetl(String ptxbatxetl) {
/*  62 */     this.ptxbatxetl = ptxbatxetl;
/*     */   }
/*     */   public String getNmxzpxetl() {
/*  65 */     return this.nmxzpxetl;
/*     */   }
/*     */   
/*     */   public void setNmxzpxetl(String nmxzpxetl) {
/*  69 */     this.nmxzpxetl = nmxzpxetl;
/*     */   }
/*     */   public Date getDxctd() {
/*  72 */     return this.dxctd;
/*     */   }
/*     */   
/*     */   public void setDxctd(Date dxctd) {
/*  76 */     this.dxctd = dxctd;
/*     */   }
/*     */   public String getBxctd() {
/*  79 */     return this.bxctd;
/*     */   }
/*     */   
/*     */   public void setBxctd(String bxctd) {
/*  83 */     this.bxctd = bxctd;
/*     */   }
/*     */   public Date getDxmfdxlst() {
/*  86 */     return this.dxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setDxmfdxlst(Date dxmfdxlst) {
/*  90 */     this.dxmfdxlst = dxmfdxlst;
/*     */   }
/*     */   public String getBxmfdxlst() {
/*  93 */     return this.bxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setBxmfdxlst(String bxmfdxlst) {
/*  97 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */   public String getNmxflxetl() {
/* 100 */     return this.nmxflxetl;
/*     */   }
/*     */   
/*     */   public void setNmxflxetl(String nmxflxetl) {
/* 104 */     this.nmxflxetl = nmxflxetl;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pxprdctxdtl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */