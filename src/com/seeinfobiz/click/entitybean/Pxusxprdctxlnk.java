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
/*    */ public class Pxusxprdctxlnk
/*    */   implements Serializable
/*    */ {
/*    */   private Long ixprdtxu;
/*    */   private Pxusrxm pxusrxm;
/*    */   private Pxprdctxm pxprdctxm;
/*    */   private Date dxctd;
/*    */   private String bxctd;
/*    */   private Date dxmfdxlst;
/*    */   private String bxmfdxlst;
/*    */   
/*    */   public Pxusxprdctxlnk() {}
/*    */   
/*    */   public Pxusxprdctxlnk(Long ixprdtxu) {
/* 27 */     this.ixprdtxu = ixprdtxu;
/*    */   }
/*    */   public Pxusxprdctxlnk(Long ixprdtxu, Pxusrxm pxusrxm, Pxprdctxm pxprdctxm, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst) {
/* 30 */     this.ixprdtxu = ixprdtxu;
/* 31 */     this.pxusrxm = pxusrxm;
/* 32 */     this.pxprdctxm = pxprdctxm;
/* 33 */     this.dxctd = dxctd;
/* 34 */     this.bxctd = bxctd;
/* 35 */     this.dxmfdxlst = dxmfdxlst;
/* 36 */     this.bxmfdxlst = bxmfdxlst;
/*    */   }
/*    */   
/*    */   public Long getIxprdtxu() {
/* 40 */     return this.ixprdtxu;
/*    */   }
/*    */   
/*    */   public void setIxprdtxu(Long ixprdtxu) {
/* 44 */     this.ixprdtxu = ixprdtxu;
/*    */   }
/*    */   public Pxusrxm getPxusrxm() {
/* 47 */     return this.pxusrxm;
/*    */   }
/*    */   
/*    */   public void setPxusrxm(Pxusrxm pxusrxm) {
/* 51 */     this.pxusrxm = pxusrxm;
/*    */   }
/*    */   public Pxprdctxm getPxprdctxm() {
/* 54 */     return this.pxprdctxm;
/*    */   }
/*    */   
/*    */   public void setPxprdctxm(Pxprdctxm pxprdctxm) {
/* 58 */     this.pxprdctxm = pxprdctxm;
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


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pxusxprdctxlnk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */