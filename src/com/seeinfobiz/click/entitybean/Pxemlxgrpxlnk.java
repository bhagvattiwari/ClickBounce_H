/*     */ package com.seeinfobiz.click.entitybean;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Pxemlxgrpxlnk
/*     */   implements Serializable
/*     */ {
/*     */   private Long ixgrpxemxlnk;
/*     */   private Pxemlxgrpxm pxemlxgrpxm;
/*     */   private Pxemlxcng pxemlxcng;
/*     */   private String prrty;
/*     */   private Long noxcustxsfy;
/*     */   private Date dxctd;
/*     */   private String bxctd;
/*     */   private Date dxmfdxlst;
/*     */   private String bxmfdxlst;
/*     */   private Long ixdpt;
/*     */   
/*     */   public Pxemlxgrpxlnk() {}
/*     */   
/*     */   public Pxemlxgrpxlnk(Long ixgrpxemxlnk, Pxemlxgrpxm pxemlxgrpxm, String prrty, Long ixdpt) {
/*  26 */     this.ixgrpxemxlnk = ixgrpxemxlnk;
/*  27 */     this.pxemlxgrpxm = pxemlxgrpxm;
/*  28 */     this.prrty = prrty;
/*  29 */     this.ixdpt = ixdpt;
/*     */   }
/*     */   
/*     */   public Pxemlxgrpxlnk(Long ixgrpxemxlnk, Long ixdpt, Pxemlxgrpxm pxemlxgrpxm, Pxemlxcng pxemlxcng, Long ixcnfgxem, String prrty, Long noxcustxsfy, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst) {
/*  33 */     this.ixgrpxemxlnk = ixgrpxemxlnk;
/*  34 */     this.pxemlxgrpxm = pxemlxgrpxm;
/*  35 */     this.pxemlxcng = pxemlxcng;
/*  36 */     this.prrty = prrty;
/*  37 */     this.noxcustxsfy = noxcustxsfy;
/*  38 */     this.dxctd = dxctd;
/*  39 */     this.bxctd = bxctd;
/*  40 */     this.dxmfdxlst = dxmfdxlst;
/*  41 */     this.bxmfdxlst = bxmfdxlst;
/*  42 */     this.ixdpt = ixdpt;
/*     */   }
/*     */   
/*     */   public Long getIxgrpxemxlnk() {
/*  46 */     return this.ixgrpxemxlnk;
/*     */   }
/*     */   
/*     */   public void setIxgrpxemxlnk(Long ixgrpxemxlnk) {
/*  50 */     this.ixgrpxemxlnk = ixgrpxemxlnk;
/*     */   }
/*     */   
/*     */   public Pxemlxgrpxm getPxemlxgrpxm() {
/*  54 */     return this.pxemlxgrpxm;
/*     */   }
/*     */   
/*     */   public void setPxemlxgrpxm(Pxemlxgrpxm pxemlxgrpxm) {
/*  58 */     this.pxemlxgrpxm = pxemlxgrpxm;
/*     */   }
/*     */   
/*     */   public Pxemlxcng getPxemlxcng() {
/*  62 */     return this.pxemlxcng;
/*     */   }
/*     */   
/*     */   public void setPxemlxcng(Pxemlxcng pxemlxcng) {
/*  66 */     this.pxemlxcng = pxemlxcng;
/*     */   }
/*     */   
/*     */   public String getPrrty() {
/*  70 */     return this.prrty;
/*     */   }
/*     */   
/*     */   public void setPrrty(String prrty) {
/*  74 */     this.prrty = prrty;
/*     */   }
/*     */   
/*     */   public Long getNoxcustxsfy() {
/*  78 */     return this.noxcustxsfy;
/*     */   }
/*     */   
/*     */   public void setNoxcustxsfy(Long noxcustxsfy) {
/*  82 */     this.noxcustxsfy = noxcustxsfy;
/*     */   }
/*     */   
/*     */   public Date getDxctd() {
/*  86 */     return this.dxctd;
/*     */   }
/*     */   
/*     */   public void setDxctd(Date dxctd) {
/*  90 */     this.dxctd = dxctd;
/*     */   }
/*     */   
/*     */   public String getBxctd() {
/*  94 */     return this.bxctd;
/*     */   }
/*     */   
/*     */   public void setBxctd(String bxctd) {
/*  98 */     this.bxctd = bxctd;
/*     */   }
/*     */   
/*     */   public Date getDxmfdxlst() {
/* 102 */     return this.dxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setDxmfdxlst(Date dxmfdxlst) {
/* 106 */     this.dxmfdxlst = dxmfdxlst;
/*     */   }
/*     */   
/*     */   public String getBxmfdxlst() {
/* 110 */     return this.bxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setBxmfdxlst(String bxmfdxlst) {
/* 114 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */   
/*     */   public Long getIxdpt() {
/* 118 */     return this.ixdpt;
/*     */   }
/*     */   
/*     */   public void setIxdpt(Long ixdpt) {
/* 122 */     this.ixdpt = ixdpt;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pxemlxgrpxlnk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */