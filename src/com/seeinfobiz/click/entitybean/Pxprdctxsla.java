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
/*     */ public class Pxprdctxsla
/*     */   implements Serializable
/*     */ {
/*     */   private Long ixslaxprdt;
/*     */   private Pxprdctxm pxprdctxm;
/*     */   private Date dxctd;
/*     */   private String bxctd;
/*     */   private Date dxmfdxlst;
/*     */   private String bxmfdxlst;
/*     */   private Long extnxdta;
/*     */   private Long genxst;
/*     */   private Long brdcstxdta;
/*     */   
/*     */   public Pxprdctxsla() {}
/*     */   
/*     */   public Pxprdctxsla(Long ixslaxprdt) {
/*  29 */     this.ixslaxprdt = ixslaxprdt;
/*     */   }
/*     */   public Pxprdctxsla(Long ixslaxprdt, Pxprdctxm pxprdctxm, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst, Long extnxdta, Long genxst, Long brdcstxdta) {
/*  32 */     this.ixslaxprdt = ixslaxprdt;
/*  33 */     this.pxprdctxm = pxprdctxm;
/*  34 */     this.dxctd = dxctd;
/*  35 */     this.bxctd = bxctd;
/*  36 */     this.dxmfdxlst = dxmfdxlst;
/*  37 */     this.bxmfdxlst = bxmfdxlst;
/*  38 */     this.extnxdta = extnxdta;
/*  39 */     this.genxst = genxst;
/*  40 */     this.brdcstxdta = brdcstxdta;
/*     */   }
/*     */   
/*     */   public Long getIxslaxprdt() {
/*  44 */     return this.ixslaxprdt;
/*     */   }
/*     */   
/*     */   public void setIxslaxprdt(Long ixslaxprdt) {
/*  48 */     this.ixslaxprdt = ixslaxprdt;
/*     */   }
/*     */   public Pxprdctxm getPxprdctxm() {
/*  51 */     return this.pxprdctxm;
/*     */   }
/*     */   
/*     */   public void setPxprdctxm(Pxprdctxm pxprdctxm) {
/*  55 */     this.pxprdctxm = pxprdctxm;
/*     */   }
/*     */   public Date getDxctd() {
/*  58 */     return this.dxctd;
/*     */   }
/*     */   
/*     */   public void setDxctd(Date dxctd) {
/*  62 */     this.dxctd = dxctd;
/*     */   }
/*     */   public String getBxctd() {
/*  65 */     return this.bxctd;
/*     */   }
/*     */   
/*     */   public void setBxctd(String bxctd) {
/*  69 */     this.bxctd = bxctd;
/*     */   }
/*     */   public Date getDxmfdxlst() {
/*  72 */     return this.dxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setDxmfdxlst(Date dxmfdxlst) {
/*  76 */     this.dxmfdxlst = dxmfdxlst;
/*     */   }
/*     */   public String getBxmfdxlst() {
/*  79 */     return this.bxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setBxmfdxlst(String bxmfdxlst) {
/*  83 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */   public Long getExtnxdta() {
/*  86 */     return this.extnxdta;
/*     */   }
/*     */   
/*     */   public void setExtnxdta(Long extnxdta) {
/*  90 */     this.extnxdta = extnxdta;
/*     */   }
/*     */   public Long getGenxst() {
/*  93 */     return this.genxst;
/*     */   }
/*     */   
/*     */   public void setGenxst(Long genxst) {
/*  97 */     this.genxst = genxst;
/*     */   }
/*     */   public Long getBrdcstxdta() {
/* 100 */     return this.brdcstxdta;
/*     */   }
/*     */   
/*     */   public void setBrdcstxdta(Long brdcstxdta) {
/* 104 */     this.brdcstxdta = brdcstxdta;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pxprdctxsla.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */