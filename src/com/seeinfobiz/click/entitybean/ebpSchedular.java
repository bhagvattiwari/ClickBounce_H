/*     */ package com.seeinfobiz.click.entitybean;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ebpSchedular
/*     */   implements Serializable
/*     */ {
/*     */   private String ebpid;
/*     */   private String product_id;
/*     */   private String product_name;
/*     */   private String processType;
/*     */   private String status;
/*     */   private String processMode;
/*     */   private String process_date;
/*     */   private String process_month;
/*     */   
/*     */   public ebpSchedular() {}
/*     */   
/*     */   public ebpSchedular(String ebpid) {
/*  31 */     this.ebpid = ebpid;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ebpSchedular(String ebpid, String product_id, String product_name, String processType, String status, String processMode, String process_date, String process_month) {
/*  37 */     this.ebpid = ebpid;
/*  38 */     this.product_id = product_id;
/*  39 */     this.product_name = product_name;
/*  40 */     this.status = status;
/*  41 */     this.processMode = processMode;
/*  42 */     this.process_date = process_date;
/*  43 */     this.process_month = process_month;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getEbpid() {
/*  48 */     return this.ebpid;
/*     */   }
/*     */   
/*     */   public void setEbpid(String ebpid) {
/*  52 */     this.ebpid = ebpid;
/*     */   }
/*     */   
/*     */   public String getProcessMode() {
/*  56 */     return this.processMode;
/*     */   }
/*     */   
/*     */   public void setProcessMode(String processMode) {
/*  60 */     this.processMode = processMode;
/*     */   }
/*     */   
/*     */   public String getProcessType() {
/*  64 */     return this.processType;
/*     */   }
/*     */   
/*     */   public void setProcessType(String processType) {
/*  68 */     this.processType = processType;
/*     */   }
/*     */   
/*     */   public String getProcess_date() {
/*  72 */     return this.process_date;
/*     */   }
/*     */   
/*     */   public void setProcess_date(String process_date) {
/*  76 */     this.process_date = process_date;
/*     */   }
/*     */   
/*     */   public String getProcess_month() {
/*  80 */     return this.process_month;
/*     */   }
/*     */   
/*     */   public void setProcess_month(String process_month) {
/*  84 */     this.process_month = process_month;
/*     */   }
/*     */   
/*     */   public String getProduct_id() {
/*  88 */     return this.product_id;
/*     */   }
/*     */   
/*     */   public void setProduct_id(String product_id) {
/*  92 */     this.product_id = product_id;
/*     */   }
/*     */   
/*     */   public String getProduct_name() {
/*  96 */     return this.product_name;
/*     */   }
/*     */   
/*     */   public void setProduct_name(String product_name) {
/* 100 */     this.product_name = product_name;
/*     */   }
/*     */   
/*     */   public String getStatus() {
/* 104 */     return this.status;
/*     */   }
/*     */   
/*     */   public void setStatus(String status) {
/* 108 */     this.status = status;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\ebpSchedular.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */