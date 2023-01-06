/*    */ package com.seeinfobiz.click.entitybean;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.Date;
/*    */ import java.util.HashSet;
/*    */ import java.util.Set;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Pxemlxpsdxm
/*    */   implements Serializable
/*    */ {
/*    */   private Long ixwdpsxem;
/*    */   private Pxprdctxm pxprdctxm;
/*    */   private Date dxctd;
/*    */   private String bxctd;
/*    */   private Date dxmfdxlst;
/*    */   private String bxmfdxlst;
/* 21 */   private Set<Pxemlxcrtraxm> pxemlxcrtraxms = new HashSet<Pxemlxcrtraxm>(0);
/*    */ 
/*    */   
/*    */   public Pxemlxpsdxm() {}
/*    */ 
/*    */   
/*    */   public Pxemlxpsdxm(Long ixwdpsxem) {
/* 28 */     this.ixwdpsxem = ixwdpsxem;
/*    */   }
/*    */   public Pxemlxpsdxm(Long ixwdpsxem, Pxprdctxm pxprdctxm, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst, Set<Pxemlxcrtraxm> pxemlxcrtraxms) {
/* 31 */     this.ixwdpsxem = ixwdpsxem;
/* 32 */     this.pxprdctxm = pxprdctxm;
/* 33 */     this.dxctd = dxctd;
/* 34 */     this.bxctd = bxctd;
/* 35 */     this.dxmfdxlst = dxmfdxlst;
/* 36 */     this.bxmfdxlst = bxmfdxlst;
/* 37 */     this.pxemlxcrtraxms = pxemlxcrtraxms;
/*    */   }
/*    */   
/*    */   public Long getIxwdpsxem() {
/* 41 */     return this.ixwdpsxem;
/*    */   }
/*    */   
/*    */   public void setIxwdpsxem(Long ixwdpsxem) {
/* 45 */     this.ixwdpsxem = ixwdpsxem;
/*    */   }
/*    */   public Pxprdctxm getPxprdctxm() {
/* 48 */     return this.pxprdctxm;
/*    */   }
/*    */   
/*    */   public void setPxprdctxm(Pxprdctxm pxprdctxm) {
/* 52 */     this.pxprdctxm = pxprdctxm;
/*    */   }
/*    */   public Date getDxctd() {
/* 55 */     return this.dxctd;
/*    */   }
/*    */   
/*    */   public void setDxctd(Date dxctd) {
/* 59 */     this.dxctd = dxctd;
/*    */   }
/*    */   public String getBxctd() {
/* 62 */     return this.bxctd;
/*    */   }
/*    */   
/*    */   public void setBxctd(String bxctd) {
/* 66 */     this.bxctd = bxctd;
/*    */   }
/*    */   public Date getDxmfdxlst() {
/* 69 */     return this.dxmfdxlst;
/*    */   }
/*    */   
/*    */   public void setDxmfdxlst(Date dxmfdxlst) {
/* 73 */     this.dxmfdxlst = dxmfdxlst;
/*    */   }
/*    */   public String getBxmfdxlst() {
/* 76 */     return this.bxmfdxlst;
/*    */   }
/*    */   
/*    */   public void setBxmfdxlst(String bxmfdxlst) {
/* 80 */     this.bxmfdxlst = bxmfdxlst;
/*    */   }
/*    */   public Set<Pxemlxcrtraxm> getPxemlxcrtraxms() {
/* 83 */     return this.pxemlxcrtraxms;
/*    */   }
/*    */   
/*    */   public void setPxemlxcrtraxms(Set<Pxemlxcrtraxm> pxemlxcrtraxms) {
/* 87 */     this.pxemlxcrtraxms = pxemlxcrtraxms;
/*    */   }
/*    */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\Pxemlxpsdxm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */