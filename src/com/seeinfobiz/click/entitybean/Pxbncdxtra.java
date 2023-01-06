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
/*     */ 
/*     */ 
/*     */ public class Pxbncdxtra
/*     */   implements Serializable
/*     */ {
/*     */   private Long ixbncdxhrdxsft;
/*     */   private Pxprdctxm pxprdctxm;
/*     */   private String crn;
/*     */   private Date dtxst;
/*     */   private Date dxctd;
/*     */   private String bxctd;
/*     */   private Date dxmfdxlst;
/*     */   private String bxmfdxlst;
/*     */   private String catxbou;
/*     */   private Long cntxres;
/*     */   private String conxbou;
/*     */   private String rexo;
/*     */   private Date dtxprcs;
/*     */   private Long ixprcs;
/*     */   private String sttsxbncd;
/*     */   private String ixemxbncd;
/*     */   private String dtxarrvl;
/*     */   private String prdName;
/*     */   private String ixem;
/*     */   private String logo;
/*     */   private String noxacnt;
/*     */   private String flxdelevry;
/*     */   private String acntxtyp;
/*     */   private String cxfile;
/*     */   private String nmxfst;
/*     */   private String cdexreg;
/*     */   
/*     */   public Pxbncdxtra() {}
/*     */   
/*     */   public Pxbncdxtra(Long ixbncdxhrdxsft) {
/*  48 */     this.ixbncdxhrdxsft = ixbncdxhrdxsft;
/*     */   }
/*     */   
/*     */   public String getCdexreg() {
/*  52 */     return this.cdexreg;
/*     */   }
/*     */   
/*     */   public void setCdexreg(String cdexreg) {
/*  56 */     this.cdexreg = cdexreg;
/*     */   }
/*     */   
/*     */   public String getNmxfst() {
/*  60 */     return this.nmxfst;
/*     */   }
/*     */   
/*     */   public void setNmxfst(String nmxfst) {
/*  64 */     this.nmxfst = nmxfst;
/*     */   }
/*     */   
/*     */   public Pxbncdxtra(Long ixbncdxhrdxsft, Pxprdctxm pxprdctxm, String crn, Date dtxst, Date dxctd, String bxctd, Date dxmfdxlst, String bxmfdxlst, String catxbou, Long cntxres, String conxbou, String rexo, Date dtxprcs, Long ixprcs, String sttsxbncd, String ixemxbncd, String dtxarrvl) {
/*  68 */     this.ixbncdxhrdxsft = ixbncdxhrdxsft;
/*  69 */     this.pxprdctxm = pxprdctxm;
/*  70 */     this.crn = crn;
/*  71 */     this.dtxst = dtxst;
/*  72 */     this.dxctd = dxctd;
/*  73 */     this.bxctd = bxctd;
/*  74 */     this.dxmfdxlst = dxmfdxlst;
/*  75 */     this.bxmfdxlst = bxmfdxlst;
/*  76 */     this.catxbou = catxbou;
/*  77 */     this.cntxres = cntxres;
/*  78 */     this.conxbou = conxbou;
/*  79 */     this.rexo = rexo;
/*  80 */     this.dtxprcs = dtxprcs;
/*  81 */     this.ixprcs = ixprcs;
/*  82 */     this.sttsxbncd = sttsxbncd;
/*  83 */     this.ixemxbncd = ixemxbncd;
/*  84 */     this.dtxarrvl = dtxarrvl;
/*     */   }
/*     */   
/*     */   public Long getIxbncdxhrdxsft() {
/*  88 */     return this.ixbncdxhrdxsft;
/*     */   }
/*     */   
/*     */   public void setIxbncdxhrdxsft(Long ixbncdxhrdxsft) {
/*  92 */     this.ixbncdxhrdxsft = ixbncdxhrdxsft;
/*     */   }
/*     */   public Pxprdctxm getPxprdctxm() {
/*  95 */     return this.pxprdctxm;
/*     */   }
/*     */   
/*     */   public void setPxprdctxm(Pxprdctxm pxprdctxm) {
/*  99 */     this.pxprdctxm = pxprdctxm;
/*     */   }
/*     */   public String getCrn() {
/* 102 */     return this.crn;
/*     */   }
/*     */   
/*     */   public void setCrn(String crn) {
/* 106 */     this.crn = crn;
/*     */   }
/*     */   public Date getDtxst() {
/* 109 */     return this.dtxst;
/*     */   }
/*     */   
/*     */   public void setDtxst(Date dtxst) {
/* 113 */     this.dtxst = dtxst;
/*     */   }
/*     */   public Date getDxctd() {
/* 116 */     return this.dxctd;
/*     */   }
/*     */   
/*     */   public void setDxctd(Date dxctd) {
/* 120 */     this.dxctd = dxctd;
/*     */   }
/*     */   public String getBxctd() {
/* 123 */     return this.bxctd;
/*     */   }
/*     */   
/*     */   public void setBxctd(String bxctd) {
/* 127 */     this.bxctd = bxctd;
/*     */   }
/*     */   public Date getDxmfdxlst() {
/* 130 */     return this.dxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setDxmfdxlst(Date dxmfdxlst) {
/* 134 */     this.dxmfdxlst = dxmfdxlst;
/*     */   }
/*     */   public String getBxmfdxlst() {
/* 137 */     return this.bxmfdxlst;
/*     */   }
/*     */   
/*     */   public void setBxmfdxlst(String bxmfdxlst) {
/* 141 */     this.bxmfdxlst = bxmfdxlst;
/*     */   }
/*     */   public String getCatxbou() {
/* 144 */     return this.catxbou;
/*     */   }
/*     */   
/*     */   public void setCatxbou(String catxbou) {
/* 148 */     this.catxbou = catxbou;
/*     */   }
/*     */   public Long getCntxres() {
/* 151 */     return this.cntxres;
/*     */   }
/*     */   
/*     */   public void setCntxres(Long cntxres) {
/* 155 */     this.cntxres = cntxres;
/*     */   }
/*     */   public String getConxbou() {
/* 158 */     return this.conxbou;
/*     */   }
/*     */   
/*     */   public void setConxbou(String conxbou) {
/* 162 */     this.conxbou = conxbou;
/*     */   }
/*     */   public String getRexo() {
/* 165 */     return this.rexo;
/*     */   }
/*     */   
/*     */   public void setRexo(String rexo) {
/* 169 */     this.rexo = rexo;
/*     */   }
/*     */   public Date getDtxprcs() {
/* 172 */     return this.dtxprcs;
/*     */   }
/*     */   
/*     */   public void setDtxprcs(Date dtxprcs) {
/* 176 */     this.dtxprcs = dtxprcs;
/*     */   }
/*     */   public Long getIxprcs() {
/* 179 */     return this.ixprcs;
/*     */   }
/*     */   
/*     */   public void setIxprcs(Long ixprcs) {
/* 183 */     this.ixprcs = ixprcs;
/*     */   }
/*     */   
/*     */   public String getPrdName() {
/* 187 */     return this.prdName;
/*     */   }
/*     */   
/*     */   public void setPrdName(String prdName) {
/* 191 */     this.prdName = prdName;
/*     */   }
/*     */   
/*     */   public String getDtxarrvl() {
/* 195 */     return this.dtxarrvl;
/*     */   }
/*     */   
/*     */   public void setDtxarrvl(String dtxarrvl) {
/* 199 */     this.dtxarrvl = dtxarrvl;
/*     */   }
/*     */   
/*     */   public String getIxemxbncd() {
/* 203 */     return this.ixemxbncd;
/*     */   }
/*     */   
/*     */   public void setIxemxbncd(String ixemxbncd) {
/* 207 */     this.ixemxbncd = ixemxbncd;
/*     */   }
/*     */   
/*     */   public String getSttsxbncd() {
/* 211 */     return this.sttsxbncd;
/*     */   }
/*     */   
/*     */   public void setSttsxbncd(String sttsxbncd) {
/* 215 */     this.sttsxbncd = sttsxbncd;
/*     */   }
/*     */   
/*     */   public String getFlxdelevry() {
/* 219 */     return this.flxdelevry;
/*     */   }
/*     */   
/*     */   public void setFlxdelevry(String flxdelevry) {
/* 223 */     this.flxdelevry = flxdelevry;
/*     */   }
/*     */   
/*     */   public String getIxem() {
/* 227 */     return this.ixem;
/*     */   }
/*     */   
/*     */   public void setIxem(String ixem) {
/* 231 */     this.ixem = ixem;
/*     */   }
/*     */   
/*     */   public String getLogo() {
/* 235 */     return this.logo;
/*     */   }
/*     */   
/*     */   public void setLogo(String logo) {
/* 239 */     this.logo = logo;
/*     */   }
/*     */   
/*     */   public String getNoxacnt() {
/* 243 */     return this.noxacnt;
/*     */   }
/*     */   
/*     */   public void setNoxacnt(String noxacnt) {
/* 247 */     this.noxacnt = noxacnt;
/*     */   }
/*     */   
/*     */   public String getAcntxtyp() {
/* 251 */     return this.acntxtyp;
/*     */   }
/*     */   
/*     */   public void setAcntxtyp(String acntxtyp) {
/* 255 */     this.acntxtyp = acntxtyp;
/*     */   }
/*     */   
/*     */   public String getCxfile() {
/* 259 */     return this.cxfile;
/*     */   }
/*     */   
/*     */   public void setCxfile(String cxfile) {
/* 263 */     this.cxfile = cxfile;
/*     */   }


/*     */

    @Override
    public String toString() {
        return "Pxbncdxtra{" + "ixbncdxhrdxsft=" + ixbncdxhrdxsft + ", pxprdctxm=" + pxprdctxm + ", crn=" + crn + ", dtxst=" + dtxst + ", dxctd=" + dxctd + ", bxctd=" + bxctd + ", dxmfdxlst=" + dxmfdxlst + ", bxmfdxlst=" + bxmfdxlst + ", catxbou=" + catxbou + ", cntxres=" + cntxres + ", conxbou=" + conxbou + ", rexo=" + rexo + ", dtxprcs=" + dtxprcs + ", ixprcs=" + ixprcs + ", sttsxbncd=" + sttsxbncd + ", ixemxbncd=" + ixemxbncd + ", dtxarrvl=" + dtxarrvl + ", prdName=" + prdName + ", ixem=" + ixem + ", logo=" + logo + ", noxacnt=" + noxacnt + ", flxdelevry=" + flxdelevry + ", acntxtyp=" + acntxtyp + ", cxfile=" + cxfile + ", nmxfst=" + nmxfst + ", cdexreg=" + cdexreg + '}';
    }
 }


