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
/*     */ public class Pxarcvxshdlrxm
/*     */   implements Serializable
/*     */ {
/*     */   private Long ixshdlrxarcv;
/*     */   private Pxstxarcvxm pxstxarcvxmByIxrl;
/*     */   private Pxstxarcvxm pxstxarcvxmByIxprs;
/*     */   private Date dxctd;
/*     */   private String bxctd;
/*     */   private Date dxmfdxlst;
/*     */   private String bxmfdxlst;
/*     */   private String fr;
/*     */   private Long dy1xsch;
/*     */   private Long dy2xsch;
/*     */   private Long dy3xsch;
/*     */   private Long dy4xsch;
/*     */   private String mntxschldrx1;
/*     */   private String mntxschldrx2;
/*     */   private String mntxschldrx3;
/*     */   private String mntxschldrx4;
/*     */   private Long wd;
/*     */   private String tm;
/*     */   private String dy;
/*     */   
/*     */   public Pxarcvxshdlrxm() {}
/*     */   
/*     */   public Pxarcvxshdlrxm(Long ixshdlrxarcv) {
/*  39 */     this.ixshdlrxarcv = ixshdlrxarcv;
/*     */   }
/*     */   public Pxarcvxshdlrxm(Long ixshdlrxarcv, Pxstxarcvxm pxstxarcvxmByIxrl, Pxstxarcvxm pxstxarcvxmByIxprs, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst, String fr, Long dy1xsch, Long dy2xsch, Long dy3xsch, Long dy4xsch, String mntxschldrx1, String mntxschldrx2, String mntxschldrx3, String mntxschldrx4, Long wd, String tm, String dy) {
/*  42 */     this.ixshdlrxarcv = ixshdlrxarcv;
/*  43 */     this.pxstxarcvxmByIxrl = pxstxarcvxmByIxrl;
/*  44 */     this.pxstxarcvxmByIxprs = pxstxarcvxmByIxprs;
/*  45 */     this.dxctd = dxctd;
/*  46 */     this.bxctd = bxctd;
/*  47 */     this.dxmfdxlst = dxmfdxlst;
/*  48 */     this.bxmfdxlst = bxmfdxlst;
/*  49 */     this.fr = fr;
/*  50 */     this.dy1xsch = dy1xsch;
/*  51 */     this.dy2xsch = dy2xsch;
/*  52 */     this.dy3xsch = dy3xsch;
/*  53 */     this.dy4xsch = dy4xsch;
/*  54 */     this.mntxschldrx1 = mntxschldrx1;
/*  55 */     this.mntxschldrx2 = mntxschldrx2;
/*  56 */     this.mntxschldrx3 = mntxschldrx3;
/*  57 */     this.mntxschldrx4 = mntxschldrx4;
/*  58 */     this.wd = wd;
/*  59 */     this.tm = tm;
/*  60 */     this.dy = dy;
/*     */   }
/*     */   
/*     */   public Long getIxshdlrxarcv() {
/*  64 */     return this.ixshdlrxarcv;
/*     */   }
/*     */   
/*     */   public void setIxshdlrxarcv(Long ixshdlrxarcv) {
/*  68 */     this.ixshdlrxarcv = ixshdlrxarcv;
/*     */   }
/*     */   public Pxstxarcvxm getPxstxarcvxmByIxrl() {
/*  71 */     return this.pxstxarcvxmByIxrl;
/*     */   }
/*     */   
/*     */   public void setPxstxarcvxmByIxrl(Pxstxarcvxm pxstxarcvxmByIxrl) {
/*  75 */     this.pxstxarcvxmByIxrl = pxstxarcvxmByIxrl;
/*     */   }
/*     */   public Pxstxarcvxm getPxstxarcvxmByIxprs() {
/*  78 */     return this.pxstxarcvxmByIxprs;
/*     */   }
/*     */   
/*     */   public void setPxstxarcvxmByIxprs(Pxstxarcvxm pxstxarcvxmByIxprs) {
/*  82 */     this.pxstxarcvxmByIxprs = pxstxarcvxmByIxprs;
/*     */   }
/*     */   public Date getDxctd() {
/*  85 */     return this.dxctd;
/*     */   }
/*     */   
/*     */   public void setDxctd(Date dxctd) {
/*  89 */     this.dxctd = dxctd;
/*     */   }
/*     */   public String getBxctd() {
/*  92 */     return this.bxctd;
/*     */   }
/*     */   
/*     */   public void setBxctd(String bxctd) {
/*  96 */     this.bxctd = bxctd;
/*     */   }
/*     */   public Date getDxmfdxlst() {
/*  99 */     return this.dxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setDxmfdxlst(Date dxmfdxlst) {
/* 103 */     this.dxmfdxlst = dxmfdxlst;
/*     */   }
/*     */   public String getBxmfdxlst() {
/* 106 */     return this.bxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setBxmfdxlst(String bxmfdxlst) {
/* 110 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */   public String getFr() {
/* 113 */     return this.fr;
/*     */   }
/*     */   
/*     */   public void setFr(String fr) {
/* 117 */     this.fr = fr;
/*     */   }
/*     */   public Long getDy1xsch() {
/* 120 */     return this.dy1xsch;
/*     */   }
/*     */   
/*     */   public void setDy1xsch(Long dy1xsch) {
/* 124 */     this.dy1xsch = dy1xsch;
/*     */   }
/*     */   public Long getDy2xsch() {
/* 127 */     return this.dy2xsch;
/*     */   }
/*     */   
/*     */   public void setDy2xsch(Long dy2xsch) {
/* 131 */     this.dy2xsch = dy2xsch;
/*     */   }
/*     */   public Long getDy3xsch() {
/* 134 */     return this.dy3xsch;
/*     */   }
/*     */   
/*     */   public void setDy3xsch(Long dy3xsch) {
/* 138 */     this.dy3xsch = dy3xsch;
/*     */   }
/*     */   public Long getDy4xsch() {
/* 141 */     return this.dy4xsch;
/*     */   }
/*     */   
/*     */   public void setDy4xsch(Long dy4xsch) {
/* 145 */     this.dy4xsch = dy4xsch;
/*     */   }
/*     */   public String getMntxschldrx1() {
/* 148 */     return this.mntxschldrx1;
/*     */   }
/*     */   
/*     */   public void setMntxschldrx1(String mntxschldrx1) {
/* 152 */     this.mntxschldrx1 = mntxschldrx1;
/*     */   }
/*     */   public String getMntxschldrx2() {
/* 155 */     return this.mntxschldrx2;
/*     */   }
/*     */   
/*     */   public void setMntxschldrx2(String mntxschldrx2) {
/* 159 */     this.mntxschldrx2 = mntxschldrx2;
/*     */   }
/*     */   public String getMntxschldrx3() {
/* 162 */     return this.mntxschldrx3;
/*     */   }
/*     */   
/*     */   public void setMntxschldrx3(String mntxschldrx3) {
/* 166 */     this.mntxschldrx3 = mntxschldrx3;
/*     */   }
/*     */   public String getMntxschldrx4() {
/* 169 */     return this.mntxschldrx4;
/*     */   }
/*     */   
/*     */   public void setMntxschldrx4(String mntxschldrx4) {
/* 173 */     this.mntxschldrx4 = mntxschldrx4;
/*     */   }
/*     */   public Long getWd() {
/* 176 */     return this.wd;
/*     */   }
/*     */   
/*     */   public void setWd(Long wd) {
/* 180 */     this.wd = wd;
/*     */   }
/*     */   public String getTm() {
/* 183 */     return this.tm;
/*     */   }
/*     */   
/*     */   public void setTm(String tm) {
/* 187 */     this.tm = tm;
/*     */   }
/*     */   public String getDy() {
/* 190 */     return this.dy;
/*     */   }
/*     */   
/*     */   public void setDy(String dy) {
/* 194 */     this.dy = dy;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pxarcvxshdlrxm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */