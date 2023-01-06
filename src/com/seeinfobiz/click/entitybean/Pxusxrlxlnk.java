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
/*    */ public class Pxusxrlxlnk
/*    */   implements Serializable
/*    */ {
/*    */   private Long ixrlxu;
/*    */   private Pxusrxm pxusrxm;
/*    */   private Pxrlxm pxrlxm;
/*    */   private Date dxctd;
/*    */   private String bxctd;
/*    */   private Date dxmfdxlst;
/*    */   private String bxmfdxlst;
/*    */   
/*    */   public Pxusxrlxlnk() {}
/*    */   
/*    */   public Pxusxrlxlnk(Long ixrlxu) {
/* 27 */     this.ixrlxu = ixrlxu;
/*    */   }
/*    */   public Pxusxrlxlnk(Long ixrlxu, Pxusrxm pxusrxm, Pxrlxm pxrlxm, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst) {
/* 30 */     this.ixrlxu = ixrlxu;
/* 31 */     this.pxusrxm = pxusrxm;
/* 32 */     this.pxrlxm = pxrlxm;
/* 33 */     this.dxctd = dxctd;
/* 34 */     this.bxctd = bxctd;
/* 35 */     this.dxmfdxlst = dxmfdxlst;
/* 36 */     this.bxmfdxlst = bxmfdxlst;
/*    */   }
/*    */   
/*    */   public Long getIxrlxu() {
/* 40 */     return this.ixrlxu;
/*    */   }
/*    */   
/*    */   public void setIxrlxu(Long ixrlxu) {
/* 44 */     this.ixrlxu = ixrlxu;
/*    */   }
/*    */   public Pxusrxm getPxusrxm() {
/* 47 */     return this.pxusrxm;
/*    */   }
/*    */   
/*    */   public void setPxusrxm(Pxusrxm pxusrxm) {
/* 51 */     this.pxusrxm = pxusrxm;
/*    */   }
/*    */   public Pxrlxm getPxrlxm() {
/* 54 */     return this.pxrlxm;
/*    */   }
/*    */   
/*    */   public void setPxrlxm(Pxrlxm pxrlxm) {
/* 58 */     this.pxrlxm = pxrlxm;
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


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pxusxrlxlnk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */