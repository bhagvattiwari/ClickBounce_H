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
/*     */ 
/*     */ public class Pxeshlrxprcsxmde
/*     */   implements Serializable
/*     */ {
/*     */   private Long ixmdexeshdlr;
/*     */   private Pxeshdlrxprsxm pxeshdlrxprsxm;
/*     */   private String mdexshdlr;
/*     */   private Date dxctd;
/*     */   private String bxctd;
/*     */   private Date dxmfdxlst;
/*     */   private String bxmfdxlst;
/*  23 */   private Set<Pxeshdlrxprcsxetl> pxeshdlrxprcsxetls = new HashSet<Pxeshdlrxprcsxetl>(0);
/*  24 */   private Set<Pxeshlrxprcsxdtls> pxeshlrxprcsxdtlses = new HashSet<Pxeshlrxprcsxdtls>(0);
/*     */ 
/*     */   
/*     */   public Pxeshlrxprcsxmde() {}
/*     */ 
/*     */   
/*     */   public Pxeshlrxprcsxmde(Long ixmdexeshdlr) {
/*  31 */     this.ixmdexeshdlr = ixmdexeshdlr;
/*     */   }
/*     */   public Pxeshlrxprcsxmde(Long ixmdexeshdlr, Pxeshdlrxprsxm pxeshdlrxprsxm, String mdexshdlr, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst, Set<Pxeshdlrxprcsxetl> pxeshdlrxprcsxetls, Set<Pxeshlrxprcsxdtls> pxeshlrxprcsxdtlses) {
/*  34 */     this.ixmdexeshdlr = ixmdexeshdlr;
/*  35 */     this.pxeshdlrxprsxm = pxeshdlrxprsxm;
/*  36 */     this.mdexshdlr = mdexshdlr;
/*  37 */     this.dxctd = dxctd;
/*  38 */     this.bxctd = bxctd;
/*  39 */     this.dxmfdxlst = dxmfdxlst;
/*  40 */     this.bxmfdxlst = bxmfdxlst;
/*  41 */     this.pxeshdlrxprcsxetls = pxeshdlrxprcsxetls;
/*  42 */     this.pxeshlrxprcsxdtlses = pxeshlrxprcsxdtlses;
/*     */   }
/*     */   
/*     */   public Long getIxmdexeshdlr() {
/*  46 */     return this.ixmdexeshdlr;
/*     */   }
/*     */   
/*     */   public void setIxmdexeshdlr(Long ixmdexeshdlr) {
/*  50 */     this.ixmdexeshdlr = ixmdexeshdlr;
/*     */   }
/*     */   public Pxeshdlrxprsxm getPxeshdlrxprsxm() {
/*  53 */     return this.pxeshdlrxprsxm;
/*     */   }
/*     */   
/*     */   public void setPxeshdlrxprsxm(Pxeshdlrxprsxm pxeshdlrxprsxm) {
/*  57 */     this.pxeshdlrxprsxm = pxeshdlrxprsxm;
/*     */   }
/*     */   public String getMdexshdlr() {
/*  60 */     return this.mdexshdlr;
/*     */   }
/*     */   
/*     */   public void setMdexshdlr(String mdexshdlr) {
/*  64 */     this.mdexshdlr = mdexshdlr;
/*     */   }
/*     */   public Date getDxctd() {
/*  67 */     return this.dxctd;
/*     */   }
/*     */   
/*     */   public void setDxctd(Date dxctd) {
/*  71 */     this.dxctd = dxctd;
/*     */   }
/*     */   public String getBxctd() {
/*  74 */     return this.bxctd;
/*     */   }
/*     */   
/*     */   public void setBxctd(String bxctd) {
/*  78 */     this.bxctd = bxctd;
/*     */   }
/*     */   public Date getDxmfdxlst() {
/*  81 */     return this.dxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setDxmfdxlst(Date dxmfdxlst) {
/*  85 */     this.dxmfdxlst = dxmfdxlst;
/*     */   }
/*     */   public String getBxmfdxlst() {
/*  88 */     return this.bxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setBxmfdxlst(String bxmfdxlst) {
/*  92 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */   public Set<Pxeshdlrxprcsxetl> getPxeshdlrxprcsxetls() {
/*  95 */     return this.pxeshdlrxprcsxetls;
/*     */   }
/*     */   
/*     */   public void setPxeshdlrxprcsxetls(Set<Pxeshdlrxprcsxetl> pxeshdlrxprcsxetls) {
/*  99 */     this.pxeshdlrxprcsxetls = pxeshdlrxprcsxetls;
/*     */   }
/*     */   public Set<Pxeshlrxprcsxdtls> getPxeshlrxprcsxdtlses() {
/* 102 */     return this.pxeshlrxprcsxdtlses;
/*     */   }
/*     */   
/*     */   public void setPxeshlrxprcsxdtlses(Set<Pxeshlrxprcsxdtls> pxeshlrxprcsxdtlses) {
/* 106 */     this.pxeshlrxprcsxdtlses = pxeshlrxprcsxdtlses;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pxeshlrxprcsxmde.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */