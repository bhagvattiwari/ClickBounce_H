/*     */ package com.seeinfobiz.click.impl;
/*     */ 
/*     */ import com.seeinfobiz.click.entitybean.Pxprdctxm;
/*     */ import com.seeinfobiz.click.entitybean.Pxshdlrxarcv;
/*     */ import com.seeinfobiz.click.entitybean.Pxshdlrxm;
/*     */ import com.seeinfobiz.click.util.HibernateUtil;
/*     */ import com.seeinfobiz.click.util.HibernateUtil_Main;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import org.hibernate.HibernateException;
/*     */ import org.hibernate.Query;
/*     */ import org.hibernate.SQLQuery;
/*     */ import org.hibernate.Session;
/*     */ import org.hibernate.Transaction;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SchedularDAOImpl
/*     */ {
/*     */   public Pxshdlrxarcv add(Object obj, String archflag) {
/*  25 */     Session session = null;
/*  26 */     if (archflag == null) {
/*  27 */       session = HibernateUtil.getSession();
/*     */     } else {
/*  29 */       session = HibernateUtil_Main.getSession();
/*     */     } 
/*     */     
/*  32 */     Transaction transaction = null;
/*  33 */     Pxshdlrxarcv object = null;
/*  34 */     int cycle = 0;
/*     */     try {
/*  36 */       if (obj instanceof Pxshdlrxarcv) {
/*  37 */         object = (Pxshdlrxarcv)obj;
/*     */       }
/*  39 */       transaction = session.beginTransaction();
/*     */       
/*  41 */       cycle = Integer.parseInt(String.valueOf(object.getPxshdlrxm().getNxcycxle()));
/*  42 */       object.getPxshdlrxm().setNxcycxle((cycle + 1));
/*  43 */       session.saveOrUpdate(object);
/*  44 */       transaction.commit();
/*  45 */     } catch (HibernateException hibernateException) {
/*  46 */       hibernateException.printStackTrace();
/*     */     } finally {
/*  48 */       session.clear();
/*  49 */       session.close();
/*     */     } 
/*  51 */     return object;
/*     */   }
/*     */   
/*     */   public void delete(Object obj) {
/*  55 */     throw new UnsupportedOperationException("Not supported yet.");
/*     */   }
/*     */   
/*     */   public void update(Object obj) {
/*  59 */     throw new UnsupportedOperationException("Not supported yet.");
/*     */   }
/*     */   
/*     */   public List<Object> modify(Object obj) {
/*  63 */     throw new UnsupportedOperationException("Not supported yet.");
/*     */   }
/*     */   
/*     */   public List<Object> display() {
/*  67 */     throw new UnsupportedOperationException("Not supported yet.");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void add(Pxshdlrxarcv schArc, long schdlrMstrId) {
/*  77 */     Session session = HibernateUtil.getSession();
/*  78 */     String hql = "";
/*  79 */     Query query = null;
/*     */     
/*     */     try {
/*  82 */       Pxshdlrxm schdlarMasterObj = (Pxshdlrxm)session.get(Pxshdlrxm.class, Long.valueOf(schdlrMstrId));
/*  83 */       schArc.setPxshdlrxm(schdlarMasterObj);
/*  84 */       session.clear();
/*  85 */       session.close();
/*     */     
/*     */     }
/*  88 */     catch (HibernateException hibernateException) {
/*  89 */       hibernateException.printStackTrace();
/*     */     } finally {}
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void updateSchedular(Pxshdlrxarcv schArch) {
/* 100 */     Session session = HibernateUtil.getSession();
/* 101 */     Transaction transaction = null;
/*     */     try {
/* 103 */       transaction = session.beginTransaction();
/* 104 */       session.saveOrUpdate(schArch);
/* 105 */       transaction.commit();
/* 106 */     } catch (HibernateException hibernateException) {
/* 107 */       hibernateException.printStackTrace();
/*     */     } finally {
/* 109 */       session.clear();
/* 110 */       session.close();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List<Object> getData(String processType) {
/* 120 */     List<Object> schedularList = new ArrayList();
/*     */     
/* 122 */     Session session = null;
/* 123 */     Query query = null;
/*     */     try {
/* 125 */       session = HibernateUtil.getSession();
/*     */       
/* 127 */       String hql = "from Pxshdlrxarcv as schArch where schArch.pxshdlrxm.typxshdlr=:schType and schArch.stts NOT IN ('IN_PROGRESS', 'DONE')";
/* 128 */       query = session.createQuery(hql);
/* 129 */       query.setParameter("schType", processType);
/*     */       
/* 131 */       schedularList = query.list();
/*     */     }
/* 133 */     catch (HibernateException hibernateExcep) {
/*     */       
/* 135 */       hibernateExcep.printStackTrace();
/*     */     } finally {
/* 137 */       session.flush();
/* 138 */       session.clear();
/* 139 */       session.close();
/*     */     } 
/* 141 */     return schedularList;
/*     */   }
/*     */   
/*     */   public List<Object> getName(String prdId) {
/* 145 */     List<Object> prdlst = null;
/* 146 */     Session session = null;
/* 147 */     Query query = null;
/*     */     
/*     */     try {
/* 150 */       session = HibernateUtil.getSession();
/* 151 */       String hql = "from Pxprdctxm where ixprdt=:prdId";
/* 152 */       query = session.createQuery(hql);
/* 153 */       query.setParameter("prdId", Long.valueOf(Long.parseLong(prdId)));
/* 154 */       prdlst = query.list();
/*     */     
/*     */     }
/* 157 */     catch (HibernateException hibernateExcep) {
/* 158 */       hibernateExcep.printStackTrace();
/*     */     } finally {
/* 160 */       session.flush();
/* 161 */       session.clear();
/* 162 */       session.close();
/*     */     } 
/* 164 */     return prdlst;
/*     */   }
/*     */   
/*     */   public Pxprdctxm getProduct(String prdId) {
/* 168 */     Pxprdctxm prdlst = null;
/* 169 */     Session session = null;
/* 170 */     Query query = null;
/*     */     
/*     */     try {
/* 173 */       session = HibernateUtil.getSession();
/* 174 */       String hql = "from Pxprdctxm where ixprdt=:prdId";
/* 175 */       query = session.createQuery(hql);
/* 176 */       query.setParameter("prdId", Long.valueOf(Long.parseLong(prdId)));
/* 177 */       prdlst = (Pxprdctxm)query.uniqueResult();
/*     */     
/*     */     }
/* 180 */     catch (HibernateException hibernateExcep) {
/* 181 */       hibernateExcep.printStackTrace();
/*     */     } finally {
/* 183 */       session.flush();
/* 184 */       session.clear();
/* 185 */       session.close();
/*     */     } 
/* 187 */     return prdlst;
/*     */   }
/*     */   
/*     */   public String getProductIDByName(String productName) {
/* 191 */     Session session = HibernateUtil.getSession();
/* 192 */     String prodId = null;
/*     */     try {
/* 194 */       Query que = session.createQuery("select ixprdt from Pxprdctxm where nmxprdt=" + productName);
/* 195 */       prodId = que.uniqueResult().toString();
/* 196 */     } catch (HibernateException hex) {
/* 197 */       hex.printStackTrace();
/*     */     } finally {}
/*     */     
/* 200 */     return prodId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List<Object> getExtractedProcess(String productID, String processType) {
/* 208 */     List<Object> schedularList = new ArrayList();
/* 209 */     Session session = null;
/* 210 */     Query query = null;
/* 211 */     String hql = "";
/*     */     
/*     */     try {
/* 214 */       session = HibernateUtil.getSession();
/*     */ 
/*     */ 
/*     */       
/* 218 */       if (processType.trim().equalsIgnoreCase("Statement Generation"))
/*     */       {
/*     */         
/* 221 */         hql = "from Cxprcsxm  where ixprdt=:productID and fxprcsxprs='C'";
/*     */       }
/* 223 */       if (processType.trim().equalsIgnoreCase("Email BroadCasting"))
/*     */       {
/*     */         
/* 226 */         hql = "from Cxprcsxm  where ixprdt=:productID and fxprcsxgen='C'";
/*     */       }
/* 228 */       query = session.createQuery(hql);
/* 229 */       query.setParameter("productID", productID);
/*     */       
/* 231 */       schedularList = query.list();
/*     */     }
/* 233 */     catch (HibernateException hibernateExcep) {
/* 234 */       hibernateExcep.printStackTrace();
/*     */     } finally {
/* 236 */       session.flush();
/* 237 */       session.clear();
/* 238 */       session.close();
/*     */     } 
/* 240 */     return schedularList;
/*     */   }
/*     */   
/*     */   public List<Object> getProcessTime(String productID, String billCycleDate, String processType) {
/* 244 */     List<Object> schedularList = new ArrayList();
/* 245 */     Session session = null;
/* 246 */     Query query = null;
/* 247 */     String hql = "";
/*     */     try {
/* 249 */       session = HibernateUtil.getSession();
/* 250 */       if (processType.trim().equalsIgnoreCase("Statement Generation"))
/*     */       {
/*     */         
/* 253 */         hql = "from Cxprcsxm  where ixprdt='" + productID + "'" + " and fxprcsxprs='C' and trunc(dxstmt)='" + billCycleDate + "'";
/*     */       }
/* 255 */       if (processType.trim().equalsIgnoreCase("Email BroadCasting"))
/*     */       {
/*     */         
/* 258 */         hql = "from Cxprcsxm  where ixprdt='" + productID + "'" + " and fxprcsxgen='C' and trunc(dxstmt)='" + billCycleDate + "'";
/*     */       }
/*     */ 
/*     */       
/* 262 */       query = session.createQuery(hql);
/*     */ 
/*     */ 
/*     */       
/* 266 */       schedularList = query.list();
/*     */     }
/* 268 */     catch (HibernateException hibernateExcep) {
/* 269 */       hibernateExcep.printStackTrace();
/*     */     } finally {
/* 271 */       session.flush();
/* 272 */       session.clear();
/* 273 */       session.close();
/*     */     } 
/* 275 */     return schedularList;
/*     */   }
/*     */   
/*     */   public List<Object> getProcessID(String prdId, String billDateStr, String procTime, String type, String archflag) {
/* 279 */     List<Object> processlst = null;
/* 280 */     Session session = null;
/* 281 */     Query query = null;
/* 282 */     String hql = "";
/*     */     try {
/* 284 */       session = HibernateUtil.getSession();
/* 285 */       hql = "from Cxprcsxm where ixprdt ='" + prdId + "'" + "and trunc(dxstmt) = '" + billDateStr + "'" + " and txprcs ='" + procTime + "'";
/* 286 */       System.out.println("Query select * " + hql);
/* 287 */       query = session.createQuery(hql);
/* 288 */       processlst = query.list();
/*     */     }
/* 290 */     catch (HibernateException hibernateExcep) {
/* 291 */       hibernateExcep.getStackTrace();
/*     */     } finally {
/* 293 */       session.flush();
/* 294 */       session.clear();
/* 295 */       session.close();
/*     */     } 
/* 297 */     if (processlst.size() == 0) {
/*     */       try {
/* 299 */         session = HibernateUtil_Main.getSession();
/* 300 */         System.out.println("Query arch  select * " + hql);
/* 301 */         query = session.createQuery(hql);
/* 302 */         processlst = query.list();
/*     */       }
/* 304 */       catch (HibernateException hibernateExcep) {
/* 305 */         hibernateExcep.getStackTrace();
/*     */       } finally {
/* 307 */         session.flush();
/* 308 */         session.clear();
/* 309 */         session.close();
/*     */       } 
/*     */     }
/* 312 */     return processlst;
/*     */   }
/*     */   
/*     */   public List<Object> getProcessedList(String productID, String processType) {
/* 316 */     List<Object> schedularList = new ArrayList();
/* 317 */     Session session = null;
/* 318 */     Query query = null;
/* 319 */     String hql = "";
/*     */     try {
/* 321 */       System.out.println("Process type " + processType);
/* 322 */       session = HibernateUtil.getSession();
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
/* 335 */       hql = "from Pxshdlrxarcv as obj  where obj.pxshdlrxm.ixprdt='" + productID + "' and obj.pxshdlrxm.typxshdlr='Data Extraction'";
/*     */ 
/*     */       
/* 338 */       query = session.createQuery(hql);
/*     */ 
/*     */ 
/*     */       
/* 342 */       schedularList = query.list();
/* 343 */       System.out.println(" list value " + schedularList.size());
/* 344 */     } catch (HibernateException hibernateExcep) {
/* 345 */       hibernateExcep.printStackTrace();
/*     */     } finally {
/* 347 */       session.flush();
/* 348 */       session.clear();
/* 349 */       session.close();
/*     */     } 
/* 351 */     return schedularList;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List<Object> getData(String processType, String schedular) {
/* 361 */     List<Object> schedularList = new ArrayList();
/* 362 */     List<Object> schList = new ArrayList();
/* 363 */     Session session = null;
/* 364 */     Query query = null;
/* 365 */     long id = 0L;
/* 366 */     String hql = "";
/* 367 */     boolean bRun = false;
/*     */     try {
/* 369 */       session = HibernateUtil.getSession();
/* 370 */       if (schedular.equalsIgnoreCase("SG")) {
/* 371 */         hql = "from Pxshdlrxarcv as schArch where schArch.pxshdlrxm.typxshdlr=:schType and schArch.stts NOT IN ('IN_PROGRESS', 'DONE')";
/* 372 */         query = session.createQuery(hql);
/* 373 */         query.setParameter("schType", processType);
/* 374 */         schedularList = query.list();
/* 375 */         session.flush();
/* 376 */         session.clear();
/* 377 */         session.close();
/* 378 */       } else if (schedular.equalsIgnoreCase("DE")) {
/* 379 */         hql = "select max(IXARCVXSHDLR) from PXSHDLRXARCV sa , PXSHDLRXM sm where sa.IXMXSHDLR = sm.IXMXSHDLR and sm.NMXSCHXM='" + processType + "' and sa.stts='DONE'";
/* 380 */         bRun = true;
/* 381 */       } else if (schedular.equalsIgnoreCase("EB")) {
/* 382 */         hql = "select max(IXARCVXSHDLR) from PXSHDLRXARCV sa , PXSHDLRXM sm where sa.IXMXSHDLR = sm.IXMXSHDLR and sm.NMXSCHXM='" + processType + "' and sa.stts='DONE'";
/* 383 */         bRun = true;
/*     */       } 
/*     */       
/* 386 */       if (bRun) {
/* 387 */         SQLQuery sQLQuery = session.createSQLQuery(hql);
/* 388 */         schedularList = sQLQuery.list();
/*     */         
/* 390 */         session.flush();
/* 391 */         session.clear();
/* 392 */         session.close();
/* 393 */         schedularList = getId(schedularList);
/* 394 */         bRun = false;
/*     */       
/*     */       }
/*     */ 
/*     */     
/*     */     }
/* 400 */     catch (HibernateException hibernateExcep) {
/*     */       
/* 402 */       hibernateExcep.printStackTrace();
/*     */     } finally {}
/*     */ 
/*     */     
/* 406 */     return schedularList;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List<Object> getId(List<Object> id) {
/* 415 */     List<Object> schedularList = new ArrayList();
/*     */     
/* 417 */     Session session = null;
/* 418 */     Query query = null;
/*     */ 
/*     */ 
/*     */     
/* 422 */     String st = "";
/* 423 */     for (int t = 0; t < id.size(); t++) {
/* 424 */       st = String.valueOf(id.get(t));
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 429 */     String hql = "";
/*     */     try {
/* 431 */       session = HibernateUtil.getSession();
/*     */       
/* 433 */       hql = "from Pxshdlrxarcv as schArch where schArch.ixarcvxshdlr=" + Long.parseLong(st);
/*     */ 
/*     */       
/* 436 */       query = session.createQuery(hql);
/* 437 */       schedularList = query.list();
/*     */     }
/* 439 */     catch (HibernateException hibernateExcep) {
/*     */       
/* 441 */       hibernateExcep.printStackTrace();
/*     */     } finally {
/* 443 */       session.flush();
/* 444 */       session.clear();
/* 445 */       session.close();
/*     */     } 
/*     */     
/* 448 */     return schedularList;
/*     */   }
/*     */   
/*     */   public Pxshdlrxarcv getScheduleArcv(Long schArcvId) {
/* 452 */     Session session = HibernateUtil.getSession();
/* 453 */     Pxshdlrxarcv schdlarArchObj = (Pxshdlrxarcv)session.get(Pxshdlrxarcv.class, schArcvId);
/* 454 */     session.clear();
/* 455 */     session.close();
/* 456 */     return schdlarArchObj;
/*     */   }
/*     */   
/*     */   public static void main(String[] args) {
/* 460 */     Pxshdlrxarcv Pxshdlrxarcv = (new SchedularDAOImpl()).getScheduleArcv(Long.valueOf(120L));
/* 461 */     System.out.println(Pxshdlrxarcv.getCrnt_stts());
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\impl\SchedularDAOImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */