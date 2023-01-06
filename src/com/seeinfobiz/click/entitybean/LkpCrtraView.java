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
/*     */ public class LkpCrtraView
/*     */   implements Serializable
/*     */ {
/*     */   private String lkpid;
/*     */   private String customer_id;
/*     */   private String date_of_birth;
/*     */   private String customer_name;
/*     */   private Long age;
/*     */   private String city;
/*     */   private String state;
/*     */   private String zip;
/*     */   private Long opening_balance;
/*     */   private Long closing_balance;
/*     */   private Long account_no;
/*     */   private Long credit_card_no;
/*     */   private String process_date;
/*     */   private Long product;
/*     */   private String email_id;
/*     */   private String alt_email_id;
/*     */   private Long statemetnId;
/*     */   private String account_type;
/*     */   private String Seleted_Promotional;
/*     */   private String desc_typ;
/*     */   private String trns_amt;
/*     */   
/*     */   public LkpCrtraView() {}
/*     */   
/*     */   public LkpCrtraView(String lkpid) {
/*  54 */     this.lkpid = lkpid;
/*     */   }
/*     */   
/*     */   public LkpCrtraView(String lkpid, String customer_id, String date_of_birth, String customer_name, Long age, String city, String state, String zip, Long opening_balance, Long closing_balance, Long account_no, Long credit_card_no, String process_date, Long product, String email_id, String alt_email_id) {
/*  58 */     this.lkpid = lkpid;
/*  59 */     this.customer_id = customer_id;
/*  60 */     this.date_of_birth = date_of_birth;
/*  61 */     this.customer_name = customer_name;
/*  62 */     this.age = age;
/*  63 */     this.city = city;
/*  64 */     this.state = state;
/*  65 */     this.zip = zip;
/*  66 */     this.opening_balance = opening_balance;
/*  67 */     this.closing_balance = closing_balance;
/*  68 */     this.account_no = account_no;
/*  69 */     this.credit_card_no = credit_card_no;
/*  70 */     this.process_date = process_date;
/*  71 */     this.product = product;
/*  72 */     this.email_id = email_id;
/*  73 */     this.alt_email_id = alt_email_id;
/*     */   }
/*     */   
/*     */   public String getLkpid() {
/*  77 */     return this.lkpid;
/*     */   }
/*     */   
/*     */   public void setLkpid(String lkpid) {
/*  81 */     this.lkpid = lkpid;
/*     */   }
/*     */   
/*     */   public Long getAccount_no() {
/*  85 */     return this.account_no;
/*     */   }
/*     */   
/*     */   public void setAccount_no(Long account_no) {
/*  89 */     this.account_no = account_no;
/*     */   }
/*     */   
/*     */   public Long getAge() {
/*  93 */     return this.age;
/*     */   }
/*     */   
/*     */   public void setAge(Long age) {
/*  97 */     this.age = age;
/*     */   }
/*     */   
/*     */   public String getCity() {
/* 101 */     return this.city;
/*     */   }
/*     */   
/*     */   public void setCity(String city) {
/* 105 */     this.city = city;
/*     */   }
/*     */   
/*     */   public Long getClosing_balance() {
/* 109 */     return this.closing_balance;
/*     */   }
/*     */   
/*     */   public void setClosing_balance(Long closing_balance) {
/* 113 */     this.closing_balance = closing_balance;
/*     */   }
/*     */   
/*     */   public Long getCredit_card_no() {
/* 117 */     return this.credit_card_no;
/*     */   }
/*     */   
/*     */   public void setCredit_card_no(Long credit_card_no) {
/* 121 */     this.credit_card_no = credit_card_no;
/*     */   }
/*     */   
/*     */   public String getCustomer_id() {
/* 125 */     return this.customer_id;
/*     */   }
/*     */   
/*     */   public void setCustomer_id(String customer_id) {
/* 129 */     this.customer_id = customer_id;
/*     */   }
/*     */   
/*     */   public String getCustomer_name() {
/* 133 */     return this.customer_name;
/*     */   }
/*     */   
/*     */   public void setCustomer_name(String customer_name) {
/* 137 */     this.customer_name = customer_name;
/*     */   }
/*     */   
/*     */   public String getDate_of_birth() {
/* 141 */     return this.date_of_birth;
/*     */   }
/*     */   
/*     */   public void setDate_of_birth(String date_of_birth) {
/* 145 */     this.date_of_birth = date_of_birth;
/*     */   }
/*     */   
/*     */   public Long getOpening_balance() {
/* 149 */     return this.opening_balance;
/*     */   }
/*     */   
/*     */   public void setOpening_balance(Long opening_balance) {
/* 153 */     this.opening_balance = opening_balance;
/*     */   }
/*     */   
/*     */   public String getProcess_date() {
/* 157 */     return this.process_date;
/*     */   }
/*     */   
/*     */   public void setProcess_date(String process_date) {
/* 161 */     this.process_date = process_date;
/*     */   }
/*     */   
/*     */   public Long getProduct() {
/* 165 */     return this.product;
/*     */   }
/*     */   
/*     */   public void setProduct(Long product) {
/* 169 */     this.product = product;
/*     */   }
/*     */   
/*     */   public String getState() {
/* 173 */     return this.state;
/*     */   }
/*     */   
/*     */   public void setState(String state) {
/* 177 */     this.state = state;
/*     */   }
/*     */   
/*     */   public String getZip() {
/* 181 */     return this.zip;
/*     */   }
/*     */   
/*     */   public void setZip(String zip) {
/* 185 */     this.zip = zip;
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 190 */     int hash = 0;
/* 191 */     hash += (this.lkpid != null) ? this.lkpid.hashCode() : 0;
/* 192 */     return hash;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean equals(Object object) {
/* 198 */     if (!(object instanceof LkpCrtraView)) {
/* 199 */       return false;
/*     */     }
/* 201 */     LkpCrtraView other = (LkpCrtraView)object;
/* 202 */     if ((this.lkpid == null && other.lkpid != null) || (this.lkpid != null && !this.lkpid.equals(other.lkpid))) {
/* 203 */       return false;
/*     */     }
/* 205 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 210 */     return "com.seeinfobiz.click.entitybean.LkpCrtraView[lkpid=" + this.lkpid + "]";
/*     */   }
/*     */   
/*     */   public String getAlt_email_id() {
/* 214 */     return this.alt_email_id;
/*     */   }
/*     */   
/*     */   public void setAlt_email_id(String alt_email_id) {
/* 218 */     this.alt_email_id = alt_email_id;
/*     */   }
/*     */   
/*     */   public String getEmail_id() {
/* 222 */     return this.email_id;
/*     */   }
/*     */   
/*     */   public void setEmail_id(String email_id) {
/* 226 */     this.email_id = email_id;
/*     */   }
/*     */   
/*     */   public String getAccount_type() {
/* 230 */     return this.account_type;
/*     */   }
/*     */   
/*     */   public void setAccount_type(String account_type) {
/* 234 */     this.account_type = account_type;
/*     */   }
/*     */   
/*     */   public Long getStatemetnId() {
/* 238 */     return this.statemetnId;
/*     */   }
/*     */   
/*     */   public void setStatemetnId(Long statemetnId) {
/* 242 */     this.statemetnId = statemetnId;
/*     */   }
/*     */   
/*     */   public String getSeleted_Promotional() {
/* 246 */     return this.Seleted_Promotional;
/*     */   }
/*     */   
/*     */   public void setSeleted_Promotional(String Seleted_Promotional) {
/* 250 */     this.Seleted_Promotional = Seleted_Promotional;
/*     */   }
/*     */   
/*     */   public String getDesc_typ() {
/* 254 */     return this.desc_typ;
/*     */   }
/*     */   
/*     */   public void setDesc_typ(String desc_typ) {
/* 258 */     this.desc_typ = desc_typ;
/*     */   }
/*     */   
/*     */   public String getTrns_amt() {
/* 262 */     return this.trns_amt;
/*     */   }
/*     */   
/*     */   public void setTrns_amt(String trns_amt) {
/* 266 */     this.trns_amt = trns_amt;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\entitybean\LkpCrtraView.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */