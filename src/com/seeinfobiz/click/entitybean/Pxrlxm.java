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
/*     */ public class Pxrlxm
/*     */   implements Serializable
/*     */ {
/*     */   private Long ixrl;
/*     */   private String nmxrl;
/*     */   private String dsxrl;
/*     */   private Date dxctd;
/*     */   private String bxctd;
/*     */   private Date dxmfdxlst;
/*     */   private String bxmfdxlst;
/*  23 */   private Set<Pxusxrlxlnk> pxusxrlxlnks = new HashSet<Pxusxrlxlnk>(0);
/*  24 */   private Set<Pxrlxmnxlnk> pxrlxmnxlnks = new HashSet<Pxrlxmnxlnk>(0);
/*     */ 
/*     */   
/*     */   public Pxrlxm() {}
/*     */ 
/*     */   
/*     */   public Pxrlxm(Long ixrl) {
/*  31 */     this.ixrl = ixrl;
/*     */   }
/*     */   public Pxrlxm(Long ixrl, String nmxrl, String dsxrl, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst, Set<Pxusxrlxlnk> pxusxrlxlnks, Set<Pxrlxmnxlnk> pxrlxmnxlnks) {
/*  34 */     this.ixrl = ixrl;
/*  35 */     this.nmxrl = nmxrl;
/*  36 */     this.dsxrl = dsxrl;
/*  37 */     this.dxctd = dxctd;
/*  38 */     this.bxctd = bxctd;
/*  39 */     this.dxmfdxlst = dxmfdxlst;
/*  40 */     this.bxmfdxlst = bxmfdxlst;
/*  41 */     this.pxusxrlxlnks = pxusxrlxlnks;
/*  42 */     this.pxrlxmnxlnks = pxrlxmnxlnks;
/*     */   }
/*     */   
/*     */   public Long getIxrl() {
/*  46 */     return this.ixrl;
/*     */   }
/*     */   
/*     */   public void setIxrl(Long ixrl) {
/*  50 */     this.ixrl = ixrl;
/*     */   }
/*     */   public String getNmxrl() {
/*  53 */     return this.nmxrl;
/*     */   }
/*     */   
/*     */   public void setNmxrl(String nmxrl) {
/*  57 */     this.nmxrl = nmxrl;
/*     */   }
/*     */   public String getDsxrl() {
/*  60 */     return this.dsxrl;
/*     */   }
/*     */   
/*     */   public void setDsxrl(String dsxrl) {
/*  64 */     this.dsxrl = dsxrl;
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
/*     */   public Set<Pxusxrlxlnk> getPxusxrlxlnks() {
/*  95 */     return this.pxusxrlxlnks;
/*     */   }
/*     */   
/*     */   public void setPxusxrlxlnks(Set<Pxusxrlxlnk> pxusxrlxlnks) {
/*  99 */     this.pxusxrlxlnks = pxusxrlxlnks;
/*     */   }
/*     */   public Set<Pxrlxmnxlnk> getPxrlxmnxlnks() {
/* 102 */     return this.pxrlxmnxlnks;
/*     */   }
/*     */   
/*     */   public void setPxrlxmnxlnks(Set<Pxrlxmnxlnk> pxrlxmnxlnks) {
/* 106 */     this.pxrlxmnxlnks = pxrlxmnxlnks;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pxrlxm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */