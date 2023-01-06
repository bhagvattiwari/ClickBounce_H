/*     */ package com.seeinfobiz.click.entitybean;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Pxmtxrlxdtls
/*     */   implements Serializable
/*     */ {
/*     */   private Long ixdtlsxm;
/*     */   private Pxmtxrlxm pxmtxrlxm;
/*     */   private String imgxm;
/*     */   private String msgxm;
/*     */   private Long sltsxm;
/*     */   private Date dxctd;
/*     */   private String bxctd;
/*     */   private Date dxmfdxlst;
/*     */   private String bxmfdxlst;
/*     */   
/*     */   public Pxmtxrlxdtls() {}
/*     */   
/*     */   public Pxmtxrlxdtls(Long ixdtlsxm) {
/*  26 */     this.ixdtlsxm = ixdtlsxm;
/*     */   }
/*     */   public Pxmtxrlxdtls(Long ixdtlsxm, Pxmtxrlxm pxmtxrlxm, String imgxm, String msgxm, Long sltsxm, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst) {
/*  29 */     this.ixdtlsxm = ixdtlsxm;
/*  30 */     this.pxmtxrlxm = pxmtxrlxm;
/*  31 */     this.imgxm = imgxm;
/*  32 */     this.msgxm = msgxm;
/*  33 */     this.sltsxm = sltsxm;
/*  34 */     this.dxctd = dxctd;
/*  35 */     this.bxctd = bxctd;
/*  36 */     this.dxmfdxlst = dxmfdxlst;
/*  37 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */   
/*     */   public Long getIxdtlsxm() {
/*  41 */     return this.ixdtlsxm;
/*     */   }
/*     */   
/*     */   public void setIxdtlsxm(Long ixdtlsxm) {
/*  45 */     this.ixdtlsxm = ixdtlsxm;
/*     */   }
/*     */   
/*     */   public Pxmtxrlxm getPxmtxrlxm() {
/*  49 */     return this.pxmtxrlxm;
/*     */   }
/*     */   
/*     */   public void setPxmtxrlxm(Pxmtxrlxm pxmtxrlxm) {
/*  53 */     this.pxmtxrlxm = pxmtxrlxm;
/*     */   }
/*     */   
/*     */   public String getImgxm() {
/*  57 */     return this.imgxm;
/*     */   }
/*     */   
/*     */   public void setImgxm(String imgxm) {
/*  61 */     this.imgxm = imgxm;
/*     */   }
/*     */   public String getMsgxm() {
/*  64 */     return this.msgxm;
/*     */   }
/*     */   
/*     */   public void setMsgxm(String msgxm) {
/*  68 */     this.msgxm = msgxm;
/*     */   }
/*     */   public Long getSltsxm() {
/*  71 */     return this.sltsxm;
/*     */   }
/*     */   
/*     */   public void setSltsxm(Long sltsxm) {
/*  75 */     this.sltsxm = sltsxm;
/*     */   }
/*     */   public Date getDxctd() {
/*  78 */     return this.dxctd;
/*     */   }
/*     */   
/*     */   public void setDxctd(Date dxctd) {
/*  82 */     this.dxctd = dxctd;
/*     */   }
/*     */   public String getBxctd() {
/*  85 */     return this.bxctd;
/*     */   }
/*     */   
/*     */   public void setBxctd(String bxctd) {
/*  89 */     this.bxctd = bxctd;
/*     */   }
/*     */   public Date getDxmfdxlst() {
/*  92 */     return this.dxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setDxmfdxlst(Date dxmfdxlst) {
/*  96 */     this.dxmfdxlst = dxmfdxlst;
/*     */   }
/*     */   public String getBxmfdxlst() {
/*  99 */     return this.bxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setBxmfdxlst(String bxmfdxlst) {
/* 103 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pxmtxrlxdtls.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */