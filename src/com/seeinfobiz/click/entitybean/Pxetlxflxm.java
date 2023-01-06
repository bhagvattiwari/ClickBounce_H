/*    */ package com.seeinfobiz.click.entitybean;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.math.BigDecimal;
/*    */ import java.util.Date;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Pxetlxflxm
/*    */   implements Serializable
/*    */ {
/*    */   private BigDecimal ixflxetl;
/*    */   private Pxprdctxm pxprdctxm;
/*    */   private String nmxflxetl;
/*    */   private String pthxflxetl;
/*    */   private Date dxctd;
/*    */   private String bxctd;
/*    */   private Date dxmfdxlst;
/*    */   private String bxmfdxlst;
/*    */   
/*    */   public Pxetlxflxm() {}
/*    */   
/*    */   public Pxetlxflxm(BigDecimal ixflxetl) {
/* 28 */     this.ixflxetl = ixflxetl;
/*    */   }
/*    */   public Pxetlxflxm(BigDecimal ixflxetl, Pxprdctxm pxprdctxm, String nmxflxetl, String pthxflxetl, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst) {
/* 31 */     this.ixflxetl = ixflxetl;
/* 32 */     this.pxprdctxm = pxprdctxm;
/* 33 */     this.nmxflxetl = nmxflxetl;
/* 34 */     this.pthxflxetl = pthxflxetl;
/* 35 */     this.dxctd = dxctd;
/* 36 */     this.bxctd = bxctd;
/* 37 */     this.dxmfdxlst = dxmfdxlst;
/* 38 */     this.bxmfdxlst = bxmfdxlst;
/*    */   }
/*    */   
/*    */   public BigDecimal getIxflxetl() {
/* 42 */     return this.ixflxetl;
/*    */   }
/*    */   
/*    */   public void setIxflxetl(BigDecimal ixflxetl) {
/* 46 */     this.ixflxetl = ixflxetl;
/*    */   }
/*    */   public Pxprdctxm getPxprdctxm() {
/* 49 */     return this.pxprdctxm;
/*    */   }
/*    */   
/*    */   public void setPxprdctxm(Pxprdctxm pxprdctxm) {
/* 53 */     this.pxprdctxm = pxprdctxm;
/*    */   }
/*    */   public String getNmxflxetl() {
/* 56 */     return this.nmxflxetl;
/*    */   }
/*    */   
/*    */   public void setNmxflxetl(String nmxflxetl) {
/* 60 */     this.nmxflxetl = nmxflxetl;
/*    */   }
/*    */   public String getPthxflxetl() {
/* 63 */     return this.pthxflxetl;
/*    */   }
/*    */   
/*    */   public void setPthxflxetl(String pthxflxetl) {
/* 67 */     this.pthxflxetl = pthxflxetl;
/*    */   }
/*    */   public Date getDxctd() {
/* 70 */     return this.dxctd;
/*    */   }
/*    */   
/*    */   public void setDxctd(Date dxctd) {
/* 74 */     this.dxctd = dxctd;
/*    */   }
/*    */   public String getBxctd() {
/* 77 */     return this.bxctd;
/*    */   }
/*    */   
/*    */   public void setBxctd(String bxctd) {
/* 81 */     this.bxctd = bxctd;
/*    */   }
/*    */   public Date getDxmfdxlst() {
/* 84 */     return this.dxmfdxlst;
/*    */   }
/*    */   
/*    */   public void setDxmfdxlst(Date dxmfdxlst) {
/* 88 */     this.dxmfdxlst = dxmfdxlst;
/*    */   }
/*    */   public String getBxmfdxlst() {
/* 91 */     return this.bxmfdxlst;
/*    */   }
/*    */   
/*    */   public void setBxmfdxlst(String bxmfdxlst) {
/* 95 */     this.bxmfdxlst = bxmfdxlst;
/*    */   }
/*    */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pxetlxflxm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */