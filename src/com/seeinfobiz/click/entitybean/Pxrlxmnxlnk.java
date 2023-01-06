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
/*     */ public class Pxrlxmnxlnk
/*     */   implements Serializable
/*     */ {
/*     */   private Long ixlnkxmnxrl;
/*     */   private Pxrlxm pxrlxm;
/*     */   private Long ixmn;
/*     */   private String tskxmn;
/*     */   private String rgtxrl;
/*     */   private Date dxctd;
/*     */   private String bxctd;
/*     */   private Date dxmfdxlst;
/*     */   private String bxmfdxlst;
/*     */   
/*     */   public Pxrlxmnxlnk() {}
/*     */   
/*     */   public Pxrlxmnxlnk(Long ixlnkxmnxrl) {
/*  29 */     this.ixlnkxmnxrl = ixlnkxmnxrl;
/*     */   }
/*     */   public Pxrlxmnxlnk(Long ixlnkxmnxrl, Pxrlxm pxrlxm, Long ixmn, String tskxmn, String rgtxrl, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst) {
/*  32 */     this.ixlnkxmnxrl = ixlnkxmnxrl;
/*  33 */     this.pxrlxm = pxrlxm;
/*  34 */     this.ixmn = ixmn;
/*  35 */     this.tskxmn = tskxmn;
/*  36 */     this.rgtxrl = rgtxrl;
/*  37 */     this.dxctd = dxctd;
/*  38 */     this.bxctd = bxctd;
/*  39 */     this.dxmfdxlst = dxmfdxlst;
/*  40 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */   
/*     */   public Long getIxlnkxmnxrl() {
/*  44 */     return this.ixlnkxmnxrl;
/*     */   }
/*     */   
/*     */   public void setIxlnkxmnxrl(Long ixlnkxmnxrl) {
/*  48 */     this.ixlnkxmnxrl = ixlnkxmnxrl;
/*     */   }
/*     */   public Pxrlxm getPxrlxm() {
/*  51 */     return this.pxrlxm;
/*     */   }
/*     */   
/*     */   public void setPxrlxm(Pxrlxm pxrlxm) {
/*  55 */     this.pxrlxm = pxrlxm;
/*     */   }
/*     */   public Long getIxmn() {
/*  58 */     return this.ixmn;
/*     */   }
/*     */   
/*     */   public void setIxmn(Long ixmn) {
/*  62 */     this.ixmn = ixmn;
/*     */   }
/*     */   public String getTskxmn() {
/*  65 */     return this.tskxmn;
/*     */   }
/*     */   
/*     */   public void setTskxmn(String tskxmn) {
/*  69 */     this.tskxmn = tskxmn;
/*     */   }
/*     */   public String getRgtxrl() {
/*  72 */     return this.rgtxrl;
/*     */   }
/*     */   
/*     */   public void setRgtxrl(String rgtxrl) {
/*  76 */     this.rgtxrl = rgtxrl;
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


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pxrlxmnxlnk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */