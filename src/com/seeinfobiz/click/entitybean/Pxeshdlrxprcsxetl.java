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
/*     */ public class Pxeshdlrxprcsxetl
/*     */   implements Serializable
/*     */ {
/*     */   private Long ixetlxeshdlr;
/*     */   private Pxeshdlrxprsxm pxeshdlrxprsxm;
/*     */   private Pxeshlrxprcsxmde pxeshlrxprcsxmde;
/*     */   private String nmxflxetl;
/*     */   private Date dxctd;
/*     */   private String bxctd;
/*     */   private Date dxmfdxlst;
/*     */   private String bxmfdxlst;
/*     */   private String BTXCHXNM;
/*     */   private String BTXCHXLOC;
/*     */   
/*     */   public Pxeshdlrxprcsxetl() {}
/*     */   
/*     */   public Pxeshdlrxprcsxetl(Long ixetlxeshdlr) {
/*  30 */     this.ixetlxeshdlr = ixetlxeshdlr;
/*     */   }
/*     */   public Pxeshdlrxprcsxetl(Long ixetlxeshdlr, Pxeshdlrxprsxm pxeshdlrxprsxm, Pxeshlrxprcsxmde pxeshlrxprcsxmde, String nmxflxetl, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst, String BTXCHXNM, String BTXCHXLOC) {
/*  33 */     this.ixetlxeshdlr = ixetlxeshdlr;
/*  34 */     this.pxeshdlrxprsxm = pxeshdlrxprsxm;
/*  35 */     this.pxeshlrxprcsxmde = pxeshlrxprcsxmde;
/*  36 */     this.nmxflxetl = nmxflxetl;
/*  37 */     this.dxctd = dxctd;
/*  38 */     this.bxctd = bxctd;
/*  39 */     this.dxmfdxlst = dxmfdxlst;
/*  40 */     this.bxmfdxlst = bxmfdxlst;
/*  41 */     this.BTXCHXNM = BTXCHXNM;
/*  42 */     this.BTXCHXLOC = BTXCHXLOC;
/*     */   }
/*     */   
/*     */   public Long getIxetlxeshdlr() {
/*  46 */     return this.ixetlxeshdlr;
/*     */   }
/*     */   
/*     */   public void setIxetlxeshdlr(Long ixetlxeshdlr) {
/*  50 */     this.ixetlxeshdlr = ixetlxeshdlr;
/*     */   }
/*     */   public Pxeshdlrxprsxm getPxeshdlrxprsxm() {
/*  53 */     return this.pxeshdlrxprsxm;
/*     */   }
/*     */   
/*     */   public void setPxeshdlrxprsxm(Pxeshdlrxprsxm pxeshdlrxprsxm) {
/*  57 */     this.pxeshdlrxprsxm = pxeshdlrxprsxm;
/*     */   }
/*     */   public Pxeshlrxprcsxmde getPxeshlrxprcsxmde() {
/*  60 */     return this.pxeshlrxprcsxmde;
/*     */   }
/*     */   
/*     */   public void setPxeshlrxprcsxmde(Pxeshlrxprcsxmde pxeshlrxprcsxmde) {
/*  64 */     this.pxeshlrxprcsxmde = pxeshlrxprcsxmde;
/*     */   }
/*     */   public String getNmxflxetl() {
/*  67 */     return this.nmxflxetl;
/*     */   }
/*     */   
/*     */   public void setNmxflxetl(String nmxflxetl) {
/*  71 */     this.nmxflxetl = nmxflxetl;
/*     */   }
/*     */   public Date getDxctd() {
/*  74 */     return this.dxctd;
/*     */   }
/*     */   
/*     */   public void setDxctd(Date dxctd) {
/*  78 */     this.dxctd = dxctd;
/*     */   }
/*     */   public String getBxctd() {
/*  81 */     return this.bxctd;
/*     */   }
/*     */   
/*     */   public void setBxctd(String bxctd) {
/*  85 */     this.bxctd = bxctd;
/*     */   }
/*     */   public Date getDxmfdxlst() {
/*  88 */     return this.dxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setDxmfdxlst(Date dxmfdxlst) {
/*  92 */     this.dxmfdxlst = dxmfdxlst;
/*     */   }
/*     */   public String getBxmfdxlst() {
/*  95 */     return this.bxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setBxmfdxlst(String bxmfdxlst) {
/*  99 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */   
/*     */   public String getBTXCHXLOC() {
/* 103 */     return this.BTXCHXLOC;
/*     */   }
/*     */   
/*     */   public void setBTXCHXLOC(String BTXCHXLOC) {
/* 107 */     this.BTXCHXLOC = BTXCHXLOC;
/*     */   }
/*     */   
/*     */   public String getBTXCHXNM() {
/* 111 */     return this.BTXCHXNM;
/*     */   }
/*     */   
/*     */   public void setBTXCHXNM(String BTXCHXNM) {
/* 115 */     this.BTXCHXNM = BTXCHXNM;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pxeshdlrxprcsxetl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */