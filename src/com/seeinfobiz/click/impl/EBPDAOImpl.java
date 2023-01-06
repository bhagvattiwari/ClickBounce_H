/*     */ package com.seeinfobiz.click.impl;
/*     */ 
/*     */ import com.seeinfobiz.click.entitybean.Pxaltxevtxtm;
/*     */ import com.seeinfobiz.click.entitybean.Pxeshdlrxprcsxetl;
/*     */ import com.seeinfobiz.click.entitybean.Pxeshdlrxprsxm;
/*     */ import com.seeinfobiz.click.entitybean.Pxeshlrxprcsxdtls;
/*     */ import com.seeinfobiz.click.entitybean.Pxeshlrxprcsxmde;
/*     */ import com.seeinfobiz.click.entitybean.Pxloclexm;
/*     */ import com.seeinfobiz.click.entitybean.Pxprdctxdtl;
/*     */ import com.seeinfobiz.click.entitybean.Pxprdctxm;
/*     */ import com.seeinfobiz.click.util.HibernateUtil;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import org.apache.log4j.Logger;
/*     */ import org.hibernate.HibernateException;
/*     */ import org.hibernate.Query;
/*     */ import org.hibernate.Session;
/*     */ import org.hibernate.Transaction;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class EBPDAOImpl
/*     */ {
/*  30 */   private static Logger logger = Logger.getLogger(EBPDAOImpl.class);
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void modify(Long schActId, String schTime) {
/*  36 */     Session session = null;
/*  37 */     Transaction trans = null;
/*     */     
/*     */     try {
/*  40 */       session = HibernateUtil.getSession();
/*  41 */       Pxaltxevtxtm schActivityMstr = (Pxaltxevtxtm)session.load(Pxaltxevtxtm.class, schActId);
/*  42 */       schActivityMstr.setTmexschdlr(schTime);
/*  43 */       trans = session.beginTransaction();
/*  44 */       session.save(schActivityMstr);
/*  45 */       trans.commit();
/*     */     }
/*  47 */     catch (HibernateException hibernateExcep) {
/*  48 */       logger.error(EBPDAOImpl.class + ": " + hibernateExcep);
/*  49 */       trans.rollback();
/*     */     } finally {
/*  51 */       session.flush();
/*  52 */       session.clear();
/*  53 */       session.close();
/*     */     } 
/*     */   }
/*     */   
/*     */   public List<Object> displayProductList(Long depId) {
/*  58 */     Session session = HibernateUtil.getSession();
/*  59 */     List<Object> dtlList = null;
/*  60 */     Query query = null;
/*  61 */     String str = "";
/*     */     
/*     */     try {
/*  64 */       str = "from Pxprdctxm where ixdpt = :departmentId order by ixprdt desc";
/*     */       
/*  66 */       query = session.createQuery(str);
/*  67 */       query.setParameter("departmentId", depId);
/*  68 */       dtlList = query.list();
/*     */     }
/*  70 */     catch (HibernateException hex) {
/*     */     
/*     */     } finally {}
/*  73 */     return dtlList;
/*     */   }
/*     */   
/*     */   public List<Object> getPrssMstrId(Long prodID, Long localeID, String strAct) {
/*  77 */     Session session = HibernateUtil.getSession();
/*  78 */     List<Object> procMstrList = null;
/*  79 */     Query query = null;
/*  80 */     String str = "";
/*  81 */     Pxeshdlrxprsxm pxeshdlrxprsxm = null;
/*  82 */     Long ebpProcMstID = Long.valueOf(0L);
/*     */     
/*     */     try {
/*  85 */       str = "from Pxeshdlrxprsxm as prdt where prdt.pxprdctxm.ixprdt =:prdId and prdt.pxloclexm.ixlcl = :LocaleId and mdxprcsxe= :Process";
/*     */       
/*  87 */       query = session.createQuery(str);
/*  88 */       query.setParameter("prdId", prodID);
/*  89 */       query.setParameter("LocaleId", localeID);
/*  90 */       query.setParameter("Process", strAct.trim());
/*  91 */       procMstrList = query.list();
/*     */     }
/*  93 */     catch (Exception a) {
/*  94 */       a.printStackTrace();
/*     */     } 
/*  96 */     return procMstrList;
/*     */   }
/*     */   
/*     */   public List<Object> getPrssModesList(Long processMstrPk) {
/* 100 */     Session session = HibernateUtil.getSession();
/* 101 */     List<Pxeshlrxprcsxmde> procMstrList = null;
/* 102 */     Query query = null;
/* 103 */     String str = "";
/* 104 */     Pxeshdlrxprsxm pxeshdlrxprsxm = null;
/*     */     
/* 106 */     String strPrdctMode = "from Pxeshlrxprcsxmde as prdtMode where prdtMode.pxeshdlrxprsxm = ?";
/* 107 */     Pxeshdlrxprsxm pxeshdlrxprsxm1 = new Pxeshdlrxprsxm();
/* 108 */     pxeshdlrxprsxm1.setIxprcsxeshdlr(processMstrPk);
/* 109 */     query = session.createQuery(strPrdctMode);
/* 110 */     query.setEntity(0, pxeshdlrxprsxm1);
/* 111 */     procMstrList = query.list();
/* 112 */     Pxeshlrxprcsxmde pxeshd = null;
/* 113 */     for (int i = 0; i < procMstrList.size(); i++) {
/* 114 */       pxeshd = procMstrList.get(i);
/* 115 */       Long ebpModeYHQMID = pxeshd.getPxeshdlrxprsxm().getIxprcsxeshdlr();
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 120 */     return (List)procMstrList;
/*     */   }
/*     */   
/*     */   public Long getPrssModeID(Long processMstrPk, String mdexshdlr) {
/* 124 */     Session session = HibernateUtil.getSession();
/* 125 */     List<Pxeshlrxprcsxmde> procMstrList = null;
/* 126 */     Query query = null;
/* 127 */     String str = "";
/* 128 */     Pxeshdlrxprsxm pxeshdlrxprsxm = null;
/*     */     
/* 130 */     String strPrdctMode = "from Pxeshlrxprcsxmde as prdtMode where prdtMode.pxeshdlrxprsxm = ? and prdtMode.mdexshdlr = ?";
/* 131 */     Pxeshdlrxprsxm pxeshdlrxprsxm1 = new Pxeshdlrxprsxm();
/* 132 */     pxeshdlrxprsxm1.setIxprcsxeshdlr(processMstrPk);
/* 133 */     query = session.createQuery(strPrdctMode);
/* 134 */     query.setEntity(0, pxeshdlrxprsxm1);
/* 135 */     query.setString(1, mdexshdlr);
/* 136 */     procMstrList = query.list();
/* 137 */     Pxeshlrxprcsxmde pxeshd = null;
/* 138 */     Long ebpModeYHQMID = Long.valueOf(0L);
/* 139 */     for (int i = 0; i < procMstrList.size(); i++) {
/* 140 */       pxeshd = procMstrList.get(i);
/* 141 */       ebpModeYHQMID = pxeshd.getIxmdexeshdlr();
/*     */     } 
/*     */     
/* 144 */     return ebpModeYHQMID;
/*     */   }
/*     */   
/*     */   public Object getProcessDetails(Long processMstrPk, Long ProcesModePk) {
/* 148 */     Session session = HibernateUtil.getSession();
/* 149 */     List<Pxeshlrxprcsxdtls> procMstrList = null;
/* 150 */     Query query = null;
/* 151 */     String str = "";
/*     */     
/* 153 */     Pxeshlrxprcsxdtls pxeshlrxprcsxdtls = null;
/* 154 */     Pxeshdlrxprsxm pxMstr = new Pxeshdlrxprsxm();
/* 155 */     pxMstr.setIxprcsxeshdlr(processMstrPk);
/* 156 */     Pxeshlrxprcsxmde pxeshdMode = new Pxeshlrxprcsxmde();
/* 157 */     pxeshdMode.setIxmdexeshdlr(ProcesModePk);
/* 158 */     String strPrdctModeDTLS = "from Pxeshlrxprcsxdtls as prdtModeDtls where prdtModeDtls.pxeshdlrxprsxm = ? and prdtModeDtls.pxeshlrxprcsxmde = ?";
/*     */     
/*     */     try {
/* 161 */       query = session.createQuery(strPrdctModeDTLS);
/* 162 */       query.setEntity(0, pxMstr);
/* 163 */       query.setEntity(1, pxeshdMode);
/* 164 */       procMstrList = query.list();
/* 165 */     } catch (HibernateException he) {}
/*     */ 
/*     */     
/* 168 */     for (int i = 0; i < procMstrList.size(); i++) {
/* 169 */       pxeshlrxprcsxdtls = procMstrList.get(i);
/*     */     }
/*     */     
/* 172 */     return pxeshlrxprcsxdtls;
/*     */   }
/*     */   
/*     */   public List<Object> getETLs(Long processMstrPk, Long ProcesModePk) {
/* 176 */     Session session = HibernateUtil.getSession();
/* 177 */     List<Object> etlList = null;
/* 178 */     Query query = null;
/* 179 */     String str = "";
/* 180 */     Pxeshdlrxprsxm pxMstr = new Pxeshdlrxprsxm();
/* 181 */     pxMstr.setIxprcsxeshdlr(processMstrPk);
/* 182 */     Pxeshlrxprcsxmde pxeshdMode = new Pxeshlrxprcsxmde();
/* 183 */     pxeshdMode.setIxmdexeshdlr(ProcesModePk);
/* 184 */     String strPrdctEtlDTLS = "from Pxeshdlrxprcsxetl as etl where etl.pxeshdlrxprsxm = ? and etl.pxeshlrxprcsxmde = ?";
/*     */     
/*     */     try {
/* 187 */       query = session.createQuery(strPrdctEtlDTLS);
/* 188 */       query.setEntity(0, pxMstr);
/* 189 */       query.setEntity(1, pxeshdMode);
/* 190 */       etlList = query.list();
/* 191 */     } catch (HibernateException he) {
/* 192 */       he.printStackTrace();
/*     */     } 
/* 194 */     return etlList;
/*     */   }
/*     */   
/*     */   public Object displayEBP(Long prodID, String ebtAct) {
/* 198 */     Session session = HibernateUtil.getSession();
/* 199 */     List<Pxeshdlrxprsxm> dtlList = null;
/* 200 */     List<Pxeshlrxprcsxmde> ebpModeList = null;
/* 201 */     List<Pxeshlrxprcsxdtls> ebpModeDtlsList = null;
/* 202 */     Query query = null;
/* 203 */     String str = "";
/*     */     
/* 205 */     Pxeshdlrxprsxm pxeshdlrxprsxm = null;
/* 206 */     Pxeshlrxprcsxdtls pxeshlrxprcsxdtls = null;
/* 207 */     Long ebpProcMstID = Long.valueOf(0L);
/* 208 */     Long ebpModeYHQMID = Long.valueOf(0L);
/*     */     try {
/* 210 */       str = "from Pxeshdlrxprsxm as prdt where prdt.pxprdctxm = ?";
/* 211 */       query = session.createQuery(str);
/* 212 */       Pxprdctxm pxprdctxm = new Pxprdctxm();
/* 213 */       pxprdctxm.setIxprdt(Long.valueOf(28L));
/* 214 */       query.setEntity(0, pxprdctxm);
/* 215 */       dtlList = query.list();
/* 216 */       if (dtlList != null) {
/* 217 */         for (int j = 0; j < dtlList.size(); j++) {
/* 218 */           pxeshdlrxprsxm = dtlList.get(j);
/* 219 */           ebpProcMstID = pxeshdlrxprsxm.getIxprcsxeshdlr();
/*     */         } 
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 228 */       String strPrdctMode = "from Pxeshlrxprcsxmde as prdtMode where prdtMode.pxeshdlrxprsxm = ?";
/* 229 */       Pxeshdlrxprsxm pxeshdlrxprsxm1 = new Pxeshdlrxprsxm();
/* 230 */       pxeshdlrxprsxm1.setIxprcsxeshdlr(ebpProcMstID);
/* 231 */       query = session.createQuery(strPrdctMode);
/* 232 */       query.setEntity(0, pxeshdlrxprsxm1);
/* 233 */       ebpModeList = query.list();
/* 234 */       Pxeshlrxprcsxmde pxeshd = null;
/*     */       
/* 236 */       for (int i = 0; i < ebpModeList.size(); i++)
/*     */       {
/* 238 */         pxeshd = ebpModeList.get(i);
/*     */       }
/*     */ 
/*     */       
/* 242 */       if (ebpModeList != null) {
/* 243 */         ebpModeYHQMID = pxeshd.getPxeshdlrxprsxm().getIxprcsxeshdlr();
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 250 */       String strPrdctModeDTLS = "from Pxeshlrxprcsxdtls as prdtModeDtls where prdtModeDtls.pxeshdlrxprsxm = ? and prdtModeDtls.pxeshlrxprcsxmde = ?";
/* 251 */       query = session.createQuery(strPrdctModeDTLS);
/* 252 */       query.setEntity(0, pxeshdlrxprsxm);
/* 253 */       query.setEntity(1, pxeshd);
/* 254 */       ebpModeDtlsList = query.list();
/*     */ 
/*     */       
/* 257 */       if (ebpModeDtlsList != null) {
/* 258 */         for (int j = 0; j < ebpModeDtlsList.size(); j++) {
/* 259 */           pxeshlrxprcsxdtls = ebpModeDtlsList.get(j);
/*     */         }
/*     */       }
/*     */     }
/* 263 */     catch (HibernateException hex) {
/* 264 */       hex.printStackTrace();
/*     */     } finally {}
/*     */     
/* 267 */     return pxeshlrxprcsxdtls;
/*     */   }
/*     */ 
/*     */   
/*     */   public List<Object> display(Object obj) {
/* 272 */     Session session = HibernateUtil.getSession();
/* 273 */     Transaction transaction = null;
/*     */     
/* 275 */     String sql = "";
/* 276 */     List<Object> detailsList = null;
/*     */     
/* 278 */     sql = "from Pxloclexm";
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
/*     */     try {
/* 290 */       transaction = session.beginTransaction();
/* 291 */       Query query = session.createQuery(sql);
/* 292 */       detailsList = query.list();
/* 293 */       transaction.commit();
/*     */     
/*     */     }
/* 296 */     catch (HibernateException hibernateException) {
/* 297 */       hibernateException.printStackTrace();
/*     */     } finally {
/* 299 */       session.clear();
/* 300 */       session.close();
/*     */     } 
/* 302 */     return detailsList;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isEbpExist(Long localeId, Long productId, String ebProcessMode) {
/* 307 */     boolean existFl = false;
/* 308 */     Session see = HibernateUtil.getSession();
/* 309 */     List li = null;
/*     */     try {
/* 311 */       see = HibernateUtil.getSession();
/* 312 */       Pxeshdlrxprsxm psxm = new Pxeshdlrxprsxm();
/* 313 */       Pxloclexm pxloclexm = new Pxloclexm();
/* 314 */       Pxprdctxm pxprdctxm = new Pxprdctxm();
/* 315 */       pxloclexm.setIxlcl(localeId);
/* 316 */       psxm.setPxloclexm(pxloclexm);
/* 317 */       pxprdctxm.setIxprdt(productId);
/* 318 */       psxm.setPxprdctxm(pxprdctxm);
/* 319 */       psxm.setMdxprcsxe(ebProcessMode);
/* 320 */       Query que = see.createQuery("from Pxeshdlrxprsxm as prdt where prdt.pxprdctxm =? and prdt.pxloclexm = ? and prdt.mdxprcsxe= ? ");
/* 321 */       que.setEntity(0, pxprdctxm);
/* 322 */       que.setEntity(1, pxloclexm);
/* 323 */       que.setString(2, ebProcessMode);
/* 324 */       li = que.list();
/* 325 */     } catch (HibernateException hex) {
/* 326 */       hex.printStackTrace();
/*     */     } finally {
/* 328 */       see.clear();
/* 329 */       see.close();
/*     */     } 
/* 331 */     if (li.size() > 0) {
/* 332 */       existFl = true;
/*     */     }
/* 334 */     return existFl;
/*     */   }
/*     */ 
/*     */   
/*     */   public void createEbpSchdlr(Object obj) {
/* 339 */     Session session = HibernateUtil.getSession();
/*     */     try {
/* 341 */       Pxeshdlrxprsxm psxm = new Pxeshdlrxprsxm();
/* 342 */       Transaction tx = session.beginTransaction();
/* 343 */       psxm = (Pxeshdlrxprsxm)obj;
/* 344 */       session.save(psxm);
/* 345 */       tx.commit();
/* 346 */     } catch (HibernateException hex) {
/* 347 */       hex.printStackTrace();
/*     */     } finally {
/* 349 */       session.clear();
/* 350 */       session.close();
/*     */     } 
/*     */   }
/*     */   
/*     */   public void add(Object obj) {
/* 355 */     Session session = HibernateUtil.getSession();
/*     */     
/*     */     try {
/* 358 */       Object object = null;
/* 359 */       Transaction tx = session.beginTransaction();
/* 360 */       if (obj instanceof Pxeshdlrxprcsxetl) {
/* 361 */         object = obj;
/* 362 */       } else if (obj instanceof Pxeshlrxprcsxdtls) {
/* 363 */         object = obj;
/*     */       } 
/*     */       
/* 366 */       session.save(object);
/* 367 */       tx.commit();
/* 368 */     } catch (HibernateException hex) {
/* 369 */       logger.error(EBPDAOImpl.class + ":" + hex.getMessage());
/*     */     } finally {
/* 371 */       session.clear();
/* 372 */       session.close();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void addTimeDate(Object obj) {
/* 378 */     Session session = HibernateUtil.getSession();
/*     */     
/*     */     try {
/* 381 */       Object object = null;
/* 382 */       Transaction tx = session.beginTransaction();
/* 383 */       if (obj instanceof Pxeshlrxprcsxmde) {
/* 384 */         object = obj;
/* 385 */       } else if (obj instanceof Pxeshlrxprcsxdtls) {
/* 386 */         object = obj;
/*     */       } 
/*     */       
/* 389 */       session.save(object);
/* 390 */       tx.commit();
/* 391 */     } catch (HibernateException hex) {
/* 392 */       logger.error(EBPDAOImpl.class + ":" + hex.getMessage());
/*     */     } finally {
/* 394 */       session.clear();
/* 395 */       session.close();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void delete(Object obj) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public void update(Object obj) {}
/*     */ 
/*     */   
/*     */   public List<Object> display() {
/* 409 */     List<Object> li = null;
/* 410 */     Session see = HibernateUtil.getSession();
/*     */     try {
/* 412 */       see = HibernateUtil.getSession();
/* 413 */       Query que = see.createQuery("from Pxaltxevtxtm");
/* 414 */       li = que.list();
/* 415 */     } catch (HibernateException hex) {
/*     */     
/*     */     } finally {
/* 418 */       see.clear();
/* 419 */       see.close();
/*     */     } 
/* 421 */     return li;
/*     */   }
/*     */   
/*     */   public List<Object> modify(Object obj) {
/* 425 */     List<Object> f = null;
/* 426 */     return f;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getIntMonthName(String intMonth) {
/* 431 */     String strMonth = "";
/* 432 */     if (intMonth.equalsIgnoreCase("Jan")) {
/* 433 */       strMonth = "1";
/*     */     }
/* 435 */     if (intMonth.equalsIgnoreCase("Feb")) {
/* 436 */       strMonth = "2";
/*     */     }
/* 438 */     if (intMonth.equalsIgnoreCase("Mar")) {
/* 439 */       strMonth = "3";
/*     */     }
/* 441 */     if (intMonth.equalsIgnoreCase("Apr")) {
/* 442 */       strMonth = "4";
/*     */     }
/* 444 */     if (intMonth.equalsIgnoreCase("May")) {
/* 445 */       strMonth = "5";
/*     */     }
/* 447 */     if (intMonth.equalsIgnoreCase("Jun")) {
/* 448 */       strMonth = "6";
/*     */     }
/* 450 */     if (intMonth.equalsIgnoreCase("Jul")) {
/* 451 */       strMonth = "7";
/*     */     }
/* 453 */     if (intMonth.equalsIgnoreCase("Aug")) {
/* 454 */       strMonth = "8";
/*     */     }
/* 456 */     if (intMonth.equalsIgnoreCase("Sep")) {
/* 457 */       strMonth = "9";
/*     */     }
/* 459 */     if (intMonth.equalsIgnoreCase("Oct")) {
/* 460 */       strMonth = "10";
/*     */     }
/* 462 */     if (intMonth.equalsIgnoreCase("Nov")) {
/* 463 */       strMonth = "11";
/*     */     }
/* 465 */     if (intMonth.equalsIgnoreCase("Dec")) {
/* 466 */       strMonth = "12";
/*     */     }
/*     */     
/* 469 */     return strMonth;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public List<Object> getETLList(Long processMstrPk, Long processModePk) {
/* 475 */     List<Pxeshdlrxprcsxetl> procETLList = null;
/* 476 */     Query query = null;
/* 477 */     String str = "";
/* 478 */     Pxeshdlrxprcsxetl etlPxeshdlrxprcsx = null;
/*     */     try {
/* 480 */       Session session = HibernateUtil.getSession();
/*     */       
/* 482 */       String strPrdctMode = "from Pxeshdlrxprcsxetl as etl where etl.pxeshdlrxprsxm = ? and etl.pxeshlrxprcsxmde = ?";
/*     */       
/* 484 */       Pxeshdlrxprsxm pxeshdlrxprsxm1 = new Pxeshdlrxprsxm();
/* 485 */       pxeshdlrxprsxm1.setIxprcsxeshdlr(processMstrPk);
/*     */       
/* 487 */       Pxeshlrxprcsxmde pxeshlrxprcsxmde = new Pxeshlrxprcsxmde();
/* 488 */       pxeshlrxprcsxmde.setIxmdexeshdlr(processModePk);
/*     */       
/* 490 */       query = session.createQuery(strPrdctMode);
/* 491 */       query.setEntity(0, pxeshdlrxprsxm1);
/* 492 */       query.setEntity(1, pxeshlrxprcsxmde);
/* 493 */       procETLList = query.list();
/*     */       
/* 495 */       Pxeshdlrxprcsxetl pxEtl = null;
/*     */       
/* 497 */       for (int i = 0; i < procETLList.size(); i++) {
/* 498 */         pxEtl = procETLList.get(i);
/* 499 */         Long etlPkId = pxEtl.getPxeshdlrxprsxm().getIxprcsxeshdlr();
/*     */       
/*     */       }
/*     */     
/*     */     }
/* 504 */     catch (Exception gf) {}
/*     */     
/* 506 */     return (List)procETLList;
/*     */   }
/*     */   
/*     */   public List<Object> getAllScedulingDetailsList() {
/* 510 */     Session session = HibernateUtil.getSession();
/* 511 */     List<Object> dtlsList = null;
/* 512 */     Query query = null;
/*     */     
/*     */     try {
/* 515 */       String strDtlsAll = "from Pxeshlrxprcsxdtls where pxeshdlrxprsxm.flxjbxtrm!='Rejected' and pxeshdlrxprsxm.flxjbxtrm!='Done'";
/* 516 */       query = session.createQuery(strDtlsAll);
/* 517 */       dtlsList = query.list();
/*     */       
/* 519 */       if (dtlsList != null);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     }
/* 526 */     catch (Exception e) {
/* 527 */       e.printStackTrace();
/*     */     } finally {}
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 533 */     return dtlsList;
/*     */   }
/*     */   
/*     */   public List<String> getPrdEtlsList(String ixprdt) {
/* 537 */     Session session = HibernateUtil.getSession();
/* 538 */     List<Pxprdctxdtl> prdDtlsList = null;
/* 539 */     List<String> etlFilesList = new ArrayList<String>();
/*     */     try {
/* 541 */       Query que = session.createQuery("from Pxprdctxdtl where pxprdctxm.ixprdt = :prdID");
/* 542 */       que.setParameter("prdID", Long.valueOf(Long.parseLong(ixprdt)));
/* 543 */       prdDtlsList = que.list();
/* 544 */       for (Pxprdctxdtl prdDtl : prdDtlsList) {
/* 545 */         etlFilesList.add(prdDtl.getNmxzpxetl());
/*     */       }
/*     */     }
/* 548 */     catch (HibernateException hex) {
/*     */     
/*     */     } finally {}
/*     */     
/* 552 */     return etlFilesList;
/*     */   }
/*     */ 
/*     */   
/*     */   public List<Object> getProcesEtlsList(String prdId) {
/* 557 */     Session session = HibernateUtil.getSession();
/* 558 */     List<Object> etlFilesList = null;
/*     */     
/*     */     try {
/* 561 */       Query que = session.createQuery("from Pxeshdlrxprcsxetl as eshPrcFDtl where eshPrcFDtl.pxeshdlrxprsxm.pxprdctxm.ixprdt = :prdID");
/* 562 */       que.setParameter("prdID", Long.valueOf(Long.parseLong(prdId)));
/* 563 */       etlFilesList = que.list();
/* 564 */     } catch (HibernateException hex) {
/*     */     
/*     */     } finally {}
/*     */     
/* 568 */     return etlFilesList;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Pxeshdlrxprsxm add(Pxeshdlrxprsxm schPrcMaster, String localeId, String prdId) {
/* 574 */     Pxloclexm localeObj = null;
/* 575 */     Pxprdctxm prdObj = null;
/* 576 */     Session session = HibernateUtil.getSession();
/* 577 */     if (localeId != null) {
/* 578 */       localeObj = (Pxloclexm)session.get(Pxloclexm.class, Long.valueOf(Long.parseLong(localeId.trim())));
/* 579 */       schPrcMaster.setPxloclexm(localeObj);
/*     */     } 
/* 581 */     if (prdId != null) {
/* 582 */       prdObj = (Pxprdctxm)session.get(Pxprdctxm.class, Long.valueOf(Long.parseLong(prdId.trim())));
/* 583 */       schPrcMaster.setPxprdctxm(prdObj);
/* 584 */       session.close();
/*     */     } 
/* 586 */     return schPrcMaster;
/*     */   }
/*     */   
/*     */   public List<Object> display(String prdId, Pxprdctxm prdObj) {
/* 590 */     Session session = HibernateUtil.getSession();
/* 591 */     List<Object> etlFilesList = null;
/*     */ 
/*     */     
/*     */     try {
/* 595 */       Query que = session.createQuery("from Pxprdctxdtl as prdDtl where prdDtl.pxprdctxm.ixprdt = :prdID");
/* 596 */       que.setParameter("prdID", Long.valueOf(Long.parseLong(prdId)));
/* 597 */       etlFilesList = que.list();
/* 598 */     } catch (HibernateException hex) {
/*     */     
/*     */     } finally {
/* 601 */       session.clear();
/* 602 */       session.close();
/*     */     } 
/* 604 */     return etlFilesList;
/*     */   }
/*     */ 
/*     */   
/*     */   public void delete(String localeId, String prdId, String processMode) {
/* 609 */     Session session = HibernateUtil.getSession();
/* 610 */     List delList = null;
/*     */ 
/*     */     
/*     */     try {
/* 614 */       Query que = session.createQuery("delete from Pxeshdlrxprsxm as processMstr where processMstr.pxloclexm.ixlcl= :localeId and processMstr.pxprdctxm.ixprdt = :prdiD and processMstr.mdxprcsxe =:mode");
/* 615 */       que.setParameter("prdiD", Long.valueOf(Long.parseLong(prdId)));
/* 616 */       que.setParameter("localeId", Long.valueOf(Long.parseLong(localeId)));
/* 617 */       que.setParameter("mode", processMode);
/*     */       
/* 619 */       int val = que.executeUpdate();
/*     */     }
/* 621 */     catch (HibernateException hex) {
/*     */     
/*     */     } finally {
/* 624 */       session.clear();
/* 625 */       session.close();
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\impl\EBPDAOImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */