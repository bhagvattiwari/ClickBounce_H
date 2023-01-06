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
/*     */ public class Pxacnxnm
/*     */   implements Serializable
/*     */ {
/*     */   private Long ixacn;
/*     */   private Pxusxact pxusxact;
/*     */   private Pxmnxds pxmnxds;
/*     */   private String nmxacn;
/*     */   private String nmxmn;
/*     */   private Date dxctd;
/*     */   private String bxctd;
/*     */   private Date dxmfdxlst;
/*     */   private String bxmfdxlst;
/*     */   
/*     */   public Pxacnxnm() {}
/*     */   
/*     */   public Pxacnxnm(Long ixacn) {
/*  29 */     this.ixacn = ixacn;
/*     */   }
/*     */   public Pxacnxnm(Long ixacn, Pxusxact pxusxact, Pxmnxds pxmnxds, String nmxacn, String nmxmn, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst) {
/*  32 */     this.ixacn = ixacn;
/*  33 */     this.pxusxact = pxusxact;
/*  34 */     this.pxmnxds = pxmnxds;
/*  35 */     this.nmxacn = nmxacn;
/*  36 */     this.nmxmn = nmxmn;
/*  37 */     this.dxctd = dxctd;
/*  38 */     this.bxctd = bxctd;
/*  39 */     this.dxmfdxlst = dxmfdxlst;
/*  40 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */   
/*     */   public Long getIxacn() {
/*  44 */     return this.ixacn;
/*     */   }
/*     */   
/*     */   public void setIxacn(Long ixacn) {
/*  48 */     this.ixacn = ixacn;
/*     */   }
/*     */   public Pxusxact getPxusxact() {
/*  51 */     return this.pxusxact;
/*     */   }
/*     */   
/*     */   public void setPxusxact(Pxusxact pxusxact) {
/*  55 */     this.pxusxact = pxusxact;
/*     */   }
/*     */   public Pxmnxds getPxmnxds() {
/*  58 */     return this.pxmnxds;
/*     */   }
/*     */   
/*     */   public void setPxmnxds(Pxmnxds pxmnxds) {
/*  62 */     this.pxmnxds = pxmnxds;
/*     */   }
/*     */   public String getNmxacn() {
/*  65 */     return this.nmxacn;
/*     */   }
/*     */   
/*     */   public void setNmxacn(String nmxacn) {
/*  69 */     this.nmxacn = nmxacn;
/*     */   }
/*     */   public String getNmxmn() {
/*  72 */     return this.nmxmn;
/*     */   }
/*     */   
/*     */   public void setNmxmn(String nmxmn) {
/*  76 */     this.nmxmn = nmxmn;
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


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pxacnxnm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */