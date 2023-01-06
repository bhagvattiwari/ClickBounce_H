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
/*    */ public class Pxusxlocxlnk
/*    */   implements Serializable
/*    */ {
/*    */   private Long ixlnxlclxu;
/*    */   private Pxloclexm pxloclexm;
/*    */   private Pxusrxm pxusrxm;
/*    */   private Date dxctd;
/*    */   private String bxctd;
/*    */   private Date dxmfdxlst;
/*    */   private String bxmfdxlst;
/*    */   
/*    */   public Pxusxlocxlnk() {}
/*    */   
/*    */   public Pxusxlocxlnk(Long ixlnxlclxu) {
/* 27 */     this.ixlnxlclxu = ixlnxlclxu;
/*    */   }
/*    */   public Pxusxlocxlnk(Long ixlnxlclxu, Pxloclexm pxloclexm, Pxusrxm pxusrxm, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst) {
/* 30 */     this.ixlnxlclxu = ixlnxlclxu;
/* 31 */     this.pxloclexm = pxloclexm;
/* 32 */     this.pxusrxm = pxusrxm;
/* 33 */     this.dxctd = dxctd;
/* 34 */     this.bxctd = bxctd;
/* 35 */     this.dxmfdxlst = dxmfdxlst;
/* 36 */     this.bxmfdxlst = bxmfdxlst;
/*    */   }
/*    */   
/*    */   public Long getIxlnxlclxu() {
/* 40 */     return this.ixlnxlclxu;
/*    */   }
/*    */   
/*    */   public void setIxlnxlclxu(Long ixlnxlclxu) {
/* 44 */     this.ixlnxlclxu = ixlnxlclxu;
/*    */   }
/*    */   public Pxloclexm getPxloclexm() {
/* 47 */     return this.pxloclexm;
/*    */   }
/*    */   
/*    */   public void setPxloclexm(Pxloclexm pxloclexm) {
/* 51 */     this.pxloclexm = pxloclexm;
/*    */   }
/*    */   public Pxusrxm getPxusrxm() {
/* 54 */     return this.pxusrxm;
/*    */   }
/*    */   
/*    */   public void setPxusrxm(Pxusrxm pxusrxm) {
/* 58 */     this.pxusrxm = pxusrxm;
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


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pxusxlocxlnk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */