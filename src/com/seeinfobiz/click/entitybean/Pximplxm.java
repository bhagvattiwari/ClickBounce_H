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
/*    */ public class Pximplxm
/*    */   implements Serializable
/*    */ {
/*    */   private Long iximpl;
/*    */   private Pxmnxds pxmnxds;
/*    */   private String nmximl;
/*    */   private Date dxctd;
/*    */   private String bxctd;
/*    */   private Date dxmfdxlst;
/*    */   private String bxmfdxlst;
/*    */   
/*    */   public Pximplxm() {}
/*    */   
/*    */   public Pximplxm(Long iximpl) {
/* 27 */     this.iximpl = iximpl;
/*    */   }
/*    */   public Pximplxm(Long iximpl, Pxmnxds pxmnxds, String nmximl, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst) {
/* 30 */     this.iximpl = iximpl;
/* 31 */     this.pxmnxds = pxmnxds;
/* 32 */     this.nmximl = nmximl;
/* 33 */     this.dxctd = dxctd;
/* 34 */     this.bxctd = bxctd;
/* 35 */     this.dxmfdxlst = dxmfdxlst;
/* 36 */     this.bxmfdxlst = bxmfdxlst;
/*    */   }
/*    */   
/*    */   public Long getIximpl() {
/* 40 */     return this.iximpl;
/*    */   }
/*    */   
/*    */   public void setIximpl(Long iximpl) {
/* 44 */     this.iximpl = iximpl;
/*    */   }
/*    */   public Pxmnxds getPxmnxds() {
/* 47 */     return this.pxmnxds;
/*    */   }
/*    */   
/*    */   public void setPxmnxds(Pxmnxds pxmnxds) {
/* 51 */     this.pxmnxds = pxmnxds;
/*    */   }
/*    */   public String getNmximl() {
/* 54 */     return this.nmximl;
/*    */   }
/*    */   
/*    */   public void setNmximl(String nmximl) {
/* 58 */     this.nmximl = nmximl;
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


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pximplxm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */