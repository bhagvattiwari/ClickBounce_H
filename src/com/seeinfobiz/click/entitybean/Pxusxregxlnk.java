/*    */ package com.seeinfobiz.click.entitybean;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.Date;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Pxusxregxlnk
/*    */   implements Serializable
/*    */ {
/*    */   private Long ixrgxu;
/*    */   private Pxusrxm pxusrxm;
/*    */   private Pxregxm pxregxm;
/*    */   private Date dxctd;
/*    */   private String bxctd;
/*    */   private Date dxmfdxlst;
/*    */   private String bxmfdxlst;
/*    */   
/*    */   public Pxusxregxlnk() {}
/*    */   
/*    */   public Pxusxregxlnk(Long ixrgxu) {
/* 27 */     this.ixrgxu = ixrgxu;
/*    */   }
/*    */   public Pxusxregxlnk(Long ixrgxu, Pxusrxm pxusrxm, Pxregxm pxregxm, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst) {
/* 30 */     this.ixrgxu = ixrgxu;
/* 31 */     this.pxusrxm = pxusrxm;
/* 32 */     this.pxregxm = pxregxm;
/* 33 */     this.dxctd = dxctd;
/* 34 */     this.bxctd = bxctd;
/* 35 */     this.dxmfdxlst = dxmfdxlst;
/* 36 */     this.bxmfdxlst = bxmfdxlst;
/*    */   }
/*    */   
/*    */   public Long getIxrgxu() {
/* 40 */     return this.ixrgxu;
/*    */   }
/*    */   
/*    */   public void setIxrgxu(Long ixrgxu) {
/* 44 */     this.ixrgxu = ixrgxu;
/*    */   }
/*    */   public Pxusrxm getPxusrxm() {
/* 47 */     return this.pxusrxm;
/*    */   }
/*    */   
/*    */   public void setPxusrxm(Pxusrxm pxusrxm) {
/* 51 */     this.pxusrxm = pxusrxm;
/*    */   }
/*    */   public Pxregxm getPxregxm() {
/* 54 */     return this.pxregxm;
/*    */   }
/*    */   
/*    */   public void setPxregxm(Pxregxm pxregxm) {
/* 58 */     this.pxregxm = pxregxm;
/*    */   }
/*    */   public Date getDxctd() {
/* 61 */     return this.dxctd;
/*    */   }
/*    */   
/*    */   public void setDxctd(Date dxctd) {
/* 65 */     this.dxctd = dxctd;
/*    */   }
/*    */   public String getBxctd() {
/* 68 */     return this.bxctd;
/*    */   }
/*    */   
/*    */   public void setBxctd(String bxctd) {
/* 72 */     this.bxctd = bxctd;
/*    */   }
/*    */   public Date getDxmfdxlst() {
/* 75 */     return this.dxmfdxlst;
/*    */   }
/*    */   
/*    */   public void setDxmfdxlst(Date dxmfdxlst) {
/* 79 */     this.dxmfdxlst = dxmfdxlst;
/*    */   }
/*    */   public String getBxmfdxlst() {
/* 82 */     return this.bxmfdxlst;
/*    */   }
/*    */   
/*    */   public void setBxmfdxlst(String bxmfdxlst) {
/* 86 */     this.bxmfdxlst = bxmfdxlst;
/*    */   }
/*    */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pxusxregxlnk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */