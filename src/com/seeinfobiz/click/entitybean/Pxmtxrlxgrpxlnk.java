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
/*     */ public class Pxmtxrlxgrpxlnk
/*     */   implements Serializable
/*     */ {
/*     */   private Long ixmkxrlxgrpxlnk;
/*     */   private Pxmtxrlxm pxmtxrlxm;
/*     */   private Pxmtxgrpxm pxmtxgrpxm;
/*     */   private String prrty;
/*     */   private Long noxofxcustxsafy;
/*     */   private Date dxctd;
/*     */   private String bxctd;
/*     */   private Date dxmfdxlst;
/*     */   private String bxmfdxlst;
/*     */   
/*     */   public Pxmtxrlxgrpxlnk() {}
/*     */   
/*     */   public Pxmtxrlxgrpxlnk(Long ixmkxrlxgrpxlnk, Pxmtxrlxm pxmtxrlxm, Pxmtxgrpxm pxmtxgrpxm, String prrty) {
/*  27 */     this.ixmkxrlxgrpxlnk = ixmkxrlxgrpxlnk;
/*  28 */     this.pxmtxrlxm = pxmtxrlxm;
/*  29 */     this.pxmtxgrpxm = pxmtxgrpxm;
/*  30 */     this.prrty = prrty;
/*     */   }
/*     */   public Pxmtxrlxgrpxlnk(Long ixmkxrlxgrpxlnk, Pxmtxrlxm pxmtxrlxm, Pxmtxgrpxm pxmtxgrpxm, String prrty, Long noxofxcustxsafy, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst) {
/*  33 */     this.ixmkxrlxgrpxlnk = ixmkxrlxgrpxlnk;
/*  34 */     this.pxmtxrlxm = pxmtxrlxm;
/*  35 */     this.pxmtxgrpxm = pxmtxgrpxm;
/*  36 */     this.prrty = prrty;
/*  37 */     this.noxofxcustxsafy = noxofxcustxsafy;
/*  38 */     this.dxctd = dxctd;
/*  39 */     this.bxctd = bxctd;
/*  40 */     this.dxmfdxlst = dxmfdxlst;
/*  41 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */   
/*     */   public Long getIxmkxrlxgrpxlnk() {
/*  45 */     return this.ixmkxrlxgrpxlnk;
/*     */   }
/*     */   
/*     */   public void setIxmkxrlxgrpxlnk(Long ixmkxrlxgrpxlnk) {
/*  49 */     this.ixmkxrlxgrpxlnk = ixmkxrlxgrpxlnk;
/*     */   }
/*     */   
/*     */   public Pxmtxgrpxm getPxmtxgrpxm() {
/*  53 */     return this.pxmtxgrpxm;
/*     */   }
/*     */   
/*     */   public void setPxmtxgrpxm(Pxmtxgrpxm pxmtxgrpxm) {
/*  57 */     this.pxmtxgrpxm = pxmtxgrpxm;
/*     */   }
/*     */   
/*     */   public Pxmtxrlxm getPxmtxrlxm() {
/*  61 */     return this.pxmtxrlxm;
/*     */   }
/*     */   
/*     */   public void setPxmtxrlxm(Pxmtxrlxm pxmtxrlxm) {
/*  65 */     this.pxmtxrlxm = pxmtxrlxm;
/*     */   }
/*     */   
/*     */   public String getPrrty() {
/*  69 */     return this.prrty;
/*     */   }
/*     */   
/*     */   public void setPrrty(String prrty) {
/*  73 */     this.prrty = prrty;
/*     */   }
/*     */   public Long getNoxofxcustxsafy() {
/*  76 */     return this.noxofxcustxsafy;
/*     */   }
/*     */   
/*     */   public void setNoxofxcustxsafy(Long noxofxcustxsafy) {
/*  80 */     this.noxofxcustxsafy = noxofxcustxsafy;
/*     */   }
/*     */   public Date getDxctd() {
/*  83 */     return this.dxctd;
/*     */   }
/*     */   
/*     */   public void setDxctd(Date dxctd) {
/*  87 */     this.dxctd = dxctd;
/*     */   }
/*     */   public String getBxctd() {
/*  90 */     return this.bxctd;
/*     */   }
/*     */   
/*     */   public void setBxctd(String bxctd) {
/*  94 */     this.bxctd = bxctd;
/*     */   }
/*     */   public Date getDxmfdxlst() {
/*  97 */     return this.dxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setDxmfdxlst(Date dxmfdxlst) {
/* 101 */     this.dxmfdxlst = dxmfdxlst;
/*     */   }
/*     */   public String getBxmfdxlst() {
/* 104 */     return this.bxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setBxmfdxlst(String bxmfdxlst) {
/* 108 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pxmtxrlxgrpxlnk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */