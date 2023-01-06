/*     */ package com.seeinfobiz.click.impl;
/*     */ 
/*     */ import com.seeinfobiz.click.entitybean.Cxprcsxm;
/*     */ import com.seeinfobiz.click.entitybean.Dxprdtnxdtlsxm;
/*     */ import com.seeinfobiz.click.entitybean.Pxbncdxlstxrd;
/*     */ import com.seeinfobiz.click.entitybean.Pxbncdxmlxcng;
/*     */ import com.seeinfobiz.click.entitybean.Pxbncdxtra;
/*     */ import com.seeinfobiz.click.entitybean.Pxemlxcng;
/*     */ import com.seeinfobiz.click.entitybean.Pxprdctxm;
/*     */ import com.seeinfobiz.click.entitybean.Pxrdxrcpt;
/*     */ import com.seeinfobiz.click.util.DateUtil;
/*     */ import com.seeinfobiz.click.util.HibernateUtil;
/*     */ import com.seeinfobiz.click.util.HibernateUtil_Main;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Date;
/*     */ import java.util.List;
/*     */ import org.apache.log4j.Logger;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class BounceTrapReptReSendDAOImpl
/*     */ {
/*     */   public void add(Object paramObject) {
/*  40 */     Session session = HibernateUtil_Main.getSession();
/*  41 */     Transaction transaction = null;
/*  42 */     Object object = null;
/*     */     try {
/*  44 */       if (paramObject instanceof Pxbncdxtra) {
/*  45 */         object = paramObject;
/*     */       }
/*  47 */       else if (paramObject instanceof com.seeinfobiz.click.entitybean.Pxprmxemlxlgxdtls) {
/*  48 */         object = paramObject;
/*     */       }
/*  50 */       else if (paramObject instanceof Pxrdxrcpt) {
/*  51 */         System.out.println("read receipt object............");
/*  52 */         object = paramObject;
/*     */       } 
/*  54 */       transaction = session.beginTransaction();
/*  55 */       session.save(object);
/*  56 */       System.out.println("commiting......");
/*  57 */       transaction.commit();
/*     */     }
/*  59 */     catch (HibernateException hibernateException) {
/*  60 */       hibernateException.printStackTrace();
/*     */     } finally {
/*     */       
/*  63 */       session.clear();
/*  64 */       session.close();
/*     */     } 
/*     */   }
/*     */   
/*     */   public void delete(Object paramObject) {
/*  69 */     throw new UnsupportedOperationException("Not supported yet.");
/*     */   }
/*     */   
/*     */   public List<Object> getBillCycDate(Long paramLong) {
/*  73 */     Session session = HibernateUtil.getSession();
/*  74 */     Query query = null;
/*  75 */     List<Object> list = null;
/*  76 */     Transaction transaction = null;
/*     */     try {
/*  78 */       transaction = session.beginTransaction();
/*  79 */       String str = "from Dxprdtnxdtlsxm as prodDtls where prodDtls.pxprdctxm.ixprdt= :prdId  and prodDtls.fldx5 is null";
/*  80 */       query = session.createQuery(str);
/*  81 */       query.setParameter("prdId", paramLong);
/*  82 */       list = query.list();
/*  83 */       transaction.commit();
/*     */     }
/*  85 */     catch (HibernateException hibernateException) {
/*  86 */       logger.error(hibernateException.getMessage() + ":" + BounceTrapReptReSendDAOImpl.class);
/*     */     } 
/*  88 */     return list;
/*     */   }
/*     */   
/*     */   public void update(Object paramObject) {
/*  92 */     throw new UnsupportedOperationException("Not supported yet.");
/*     */   }
/*     */   
/*     */   public List<Object> modify(Object paramObject) {
/*  96 */     throw new UnsupportedOperationException("Not supported yet.");
/*     */   }
/*     */   
/*     */   public List<Object> display() {
/* 100 */     throw new UnsupportedOperationException("Not supported yet.");
/*     */   }
/*     */   
/*     */   public List<Object> display(Object paramObject) {
/* 104 */     Session session = HibernateUtil.getSession();
/* 105 */     Query query = null;
/* 106 */     List<Object> list = null;
/* 107 */     String str = "";
/* 108 */     Transaction transaction = null;
/*     */     try {
/* 110 */       transaction = session.beginTransaction();
/* 111 */       if (paramObject instanceof com.seeinfobiz.click.entitybean.Pxbncdxfrmxhdr) {
/* 112 */         str = "from Pxbncdxfrmxhdr";
/*     */       }
/* 114 */       else if (paramObject instanceof Pxprdctxm) {
/* 115 */         str = "from Pxprdctxm";
/*     */       }
/* 117 */       else if (paramObject instanceof com.seeinfobiz.click.entitybean.Pxbncdxsbjct) {
/* 118 */         str = "from Pxbncdxsbjct";
/*     */       }
/* 120 */       else if (paramObject instanceof com.seeinfobiz.click.entitybean.Pxbncdxerlbxm) {
/* 121 */         str = "from Pxbncdxerlbxm";
/*     */       }
/* 123 */       else if (paramObject instanceof Pxbncdxtra) {
/* 124 */         str = "from Pxbncdxtra";
/*     */       }
/* 126 */       else if (paramObject instanceof Pxbncdxmlxcng) {
/* 127 */         str = "from Pxbncdxmlxcng";
/*     */       }
/* 129 */       else if (paramObject instanceof com.seeinfobiz.click.entitybean.Pxprmxemlxm) {
/* 130 */         str = "from Pxprmxemlxm";
/*     */       }
/* 132 */       else if (paramObject instanceof com.seeinfobiz.click.entitybean.Dxcstmrxm) {
/* 133 */         str = "from Dxcstmrxm";
/*     */       } 
/* 135 */       query = session.createQuery(str);
/* 136 */       list = query.list();
/* 137 */       transaction.commit();
/*     */     }
/* 139 */     catch (HibernateException hibernateException) {
/* 140 */       logger.error(hibernateException.getMessage() + ":" + BounceTrapReptReSendDAOImpl.class);
/*     */     } 
/* 142 */     return list;
/*     */   }
/*     */   
/*     */   public List<Object> display(String paramString1, String paramString2) {
/* 146 */     Session session = HibernateUtil.getSession();
/* 147 */     Query query = null;
/* 148 */     List<Object> list = null;
/* 149 */     Transaction transaction = null;
/*     */     try {
/* 151 */       transaction = session.beginTransaction();
/* 152 */       String str = "from Dxprdtnxdtlsxm as prodDtls where prodDtls.pxprdctxm.ixprdt=" + Long.parseLong(paramString1) + " and trunc(prodDtls.dxstmt)='" + paramString2 + "'";
/* 153 */       query = session.createQuery(str);
/* 154 */       list = query.list();
/* 155 */       transaction.commit();
/*     */     }
/* 157 */     catch (HibernateException hibernateException) {
/* 158 */       logger.error(hibernateException.getMessage() + ":" + BounceTrapReptReSendDAOImpl.class);
/*     */     } 
/* 160 */     return list;
/*     */   }
/*     */   
/*     */   public List<Object> display(String paramString) {
/* 164 */     Session session = HibernateUtil.getSession();
/* 165 */     Query query = null;
/* 166 */     List<Object> list = null;
/* 167 */     Transaction transaction = null;
/*     */     try {
/* 169 */       transaction = session.beginTransaction();
/* 170 */       String str = "from Pxprdctxm as prd where prd.ixprdt='" + Long.parseLong(paramString) + "'";
/* 171 */       query = session.createQuery(str);
/* 172 */       list = query.list();
/* 173 */       transaction.commit();
/*     */     }
/* 175 */     catch (HibernateException hibernateException) {
/* 176 */       logger.error(hibernateException.getMessage() + ":" + BounceTrapReptReSendDAOImpl.class);
/*     */     } finally {
/*     */       
/* 179 */       session.clear();
/* 180 */       session.close();
/*     */     } 
/* 182 */     return list;
/*     */   }
/*     */   
/*     */   public void UpdateMain(String paramString1, String paramString2, int paramInt, String paramString3) {
/* 186 */     Session session = HibernateUtil.getSession();
/* 187 */     String str = "";
/* 188 */     Query query = null;
/*     */     try {
/* 190 */       str = "update Dxprdtnxdtlsxm as productionDtls set productionDtls.fxrsntxem = :mailsSt , productionDtls.dxbncdxem= :bndDate , productionDtls.ixerlbxbncxem= :errorLibID where productionDtls.pxprdctxm.ixprdt= :prdiD and productionDtls.ixem= :emailID";
/* 191 */       query = session.createQuery(str);
/* 192 */       query.setParameter("mailsSt", "B");
/* 193 */       query.setParameter("bndDate", DateUtil.getDate(paramString3));
/* 194 */       query.setParameter("errorLibID", Long.valueOf(Long.parseLong(String.valueOf(paramInt))));
/* 195 */       query.setParameter("prdiD", Long.valueOf(Long.parseLong(paramString1)));
/* 196 */       query.setParameter("emailID", paramString2.trim());
/* 197 */       int i = query.executeUpdate();
/*     */     }
/* 199 */     catch (HibernateException hibernateException) {
/* 200 */       logger.error(hibernateException.getMessage() + ":" + BounceTrapReptReSendDAOImpl.class);
/*     */     } finally {
/*     */       
/* 203 */       session.clear();
/* 204 */       session.close();
/*     */     } 
/*     */   }
/*     */   
/*     */   public void add(Object paramObject, String paramString) {
/* 209 */     Pxbncdxtra pxbncdxtra = null;
/* 210 */     Pxrdxrcpt pxrdxrcpt = null;
/* 211 */     Object object = null;
/*     */     try {
                 System.out.println("ProductId : ||"+paramString+"||");
/* 213 */       if (paramObject instanceof Pxbncdxtra) {
/* 214 */         pxbncdxtra = (Pxbncdxtra)paramObject;
/* 215 */         Session session = HibernateUtil_Main.getSession();
/* 216 */         if (paramString != "") {
/* 217 */           Pxprdctxm pxprdctxm = (Pxprdctxm)session.get(Pxprdctxm.class, Long.valueOf(Long.parseLong(paramString.trim())));
                    System.out.println("ProductID:"+pxprdctxm.getIxprdt()+":"+pxprdctxm.getNmxprdt());
                    System.out.println("Bounce Details:"+pxbncdxtra.toString());
/* 218 */           pxbncdxtra.setPxprdctxm(pxprdctxm);
/*     */         } 
/* 220 */         session.close();
/* 221 */         add(pxbncdxtra);
/*     */       } 
/* 223 */       if (paramObject instanceof Pxrdxrcpt) {
/* 224 */         System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
/* 225 */         pxrdxrcpt = (Pxrdxrcpt)paramObject;
/* 226 */         Session session = HibernateUtil.getSession();
/* 227 */         session.close();
/* 228 */         add(pxrdxrcpt);
/*     */       }
/*     */     
/* 231 */     } catch (Exception exception) {
/* 232 */       exception.printStackTrace();
/*     */     } 
/*     */   }
/*     */   
/*     */   public List<Object> getEmailRecords(long paramLong, String paramString1, String paramString2) {
/* 237 */     Session session = null;
/* 238 */     session = HibernateUtil.getSession();
/* 239 */     String str = "";
/* 240 */     Query query = null;
/* 241 */     List<Object> list = null;
/*     */     try {
/* 243 */       str = "from Dxprdtnxdtlsxm D where  ixprcs=" + paramLong + " and crn='" + paramString1 + "' and ixem is not null and flxchnlxdlvy like '%Email%' ";
/* 244 */       System.out.println(" hql-------------  " + str);
/* 245 */       query = session.createQuery(str);
/* 246 */       list = query.list();
/*     */     }
/* 248 */     catch (HibernateException hibernateException) {
/* 249 */       hibernateException.printStackTrace();
/* 250 */       logger.error(hibernateException.getMessage() + ":" + BounceTrapReptReSendDAOImpl.class);
/*     */     } finally {
/*     */       
/* 253 */       session.clear();
/* 254 */       session.close();
/* 255 */       System.out.println(" hql1-------------  " + list.size());
/*     */     } 
/* 257 */     if (list.size() == 0) {
/*     */       try {
/* 259 */         System.out.println(" hql-----ARCH--------  " + str);
/* 260 */         session = HibernateUtil_Main.getSession();
/* 261 */         query = session.createQuery(str);
/* 262 */         list = query.list();
/*     */       }
/* 264 */       catch (HibernateException hibernateException) {
/* 265 */         hibernateException.printStackTrace();
/* 266 */         logger.error(hibernateException.getMessage() + ":" + BounceTrapReptReSendDAOImpl.class);
/*     */       } finally {
/*     */         
/* 269 */         session.clear();
/* 270 */         session.close();
/*     */       } 
/*     */     }
/* 273 */     return list;
/*     */   }
/*     */   
/*     */   public void addReadReceipt(Object paramObject) {
/* 277 */     System.out.println("sadfsadfsafsadf");
/* 278 */     Session session = HibernateUtil.getSession();
/* 279 */     Transaction transaction = null;
/* 280 */     Object object = null;
/*     */     try {
/* 282 */       if (paramObject instanceof Pxrdxrcpt) {
/* 283 */         object = paramObject;
/*     */       }
/* 285 */       transaction = session.beginTransaction();
/* 286 */       session.save(object);
/* 287 */       transaction.commit();
/*     */     }
/* 289 */     catch (Exception exception) {
/* 290 */       exception.printStackTrace();
/*     */     } finally {
/*     */       
/* 293 */       session.clear();
/* 294 */       session.close();
/*     */     } 
/*     */   }
/*     */   
/*     */   public List<Object> display(Pxbncdxtra paramPxbncdxtra, Date paramDate, String paramString1, String paramString2) {
/* 299 */     Session session = HibernateUtil.getSession();
/* 300 */     Query query = null;
/* 301 */     List<Object> list = null;
/* 302 */     String str = "";
/* 303 */     Transaction transaction = null;
/*     */     try {
/* 305 */       transaction = session.beginTransaction();
/* 306 */       if (paramString2.equalsIgnoreCase("S") || paramString2.equalsIgnoreCase("H")) {
/* 307 */         str = "from Pxbncdxtra as bnTrap where bnTrap.dtxst= :bilCycDt  and bnTrap.pxprdctxm.ixprdt= :prdID and bnTrap.catxbou= :bnCat";
/* 308 */         query = session.createQuery(str);
/* 309 */         query.setParameter("bilCycDt", paramDate);
/* 310 */         query.setParameter("prdID", Long.valueOf(Long.parseLong(paramString1)));
/* 311 */         query.setParameter("bnCat", paramString2);
/*     */       } else {
/*     */         
/* 314 */         str = "from Pxbncdxtra as bnTrap where bnTrap.dtxst= :bilCycDt  and bnTrap.pxprdctxm.ixprdt= :prdID ";
/* 315 */         query = session.createQuery(str);
/* 316 */         query.setParameter("bilCycDt", paramDate);
/* 317 */         query.setParameter("prdID", Long.valueOf(Long.parseLong(paramString1)));
/*     */       } 
/* 319 */       list = query.list();
/* 320 */       transaction.commit();
/*     */     }
/* 322 */     catch (HibernateException hibernateException) {
/* 323 */       logger.error(hibernateException.getMessage() + ":" + BounceTrapReptReSendDAOImpl.class);
/*     */     } 
/* 325 */     return list;
/*     */   }
/*     */   
/*     */   public void deleteAll(String paramString) {
/* 329 */     Session session = HibernateUtil.getSession();
/* 330 */     Transaction transaction = null;
/*     */     try {
/* 332 */       transaction = session.beginTransaction();
/* 333 */       if (!paramString.equals("")) {
/* 334 */         Query query = session.createQuery("delete from Pxbncdxtra where ixbncdxhrdxsft in (" + paramString + ")");
/* 335 */         query.executeUpdate();
/*     */       }
/*     */     
/* 338 */     } catch (HibernateException hibernateException) {
/* 339 */       hibernateException.printStackTrace();
/* 340 */       logger.error(BounceTrapReptReSendDAOImpl.class + ": " + hibernateException);
/* 341 */       transaction.rollback();
/*     */     } finally {
/*     */       
/* 344 */       session.flush();
/* 345 */       session.clear();
/* 346 */       session.close();
/*     */     } 
/*     */   }
/*     */   
/*     */   public void updateLastRead(int paramInt, String paramString1, String paramString2, String paramString3) {
/* 351 */     Session session = HibernateUtil.getSession();
/* 352 */     Transaction transaction = null;
/* 353 */     Object object = null;
/* 354 */     Pxbncdxlstxrd pxbncdxlstxrd = new Pxbncdxlstxrd();
/* 355 */     Pxbncdxmlxcng pxbncdxmlxcng = null;
/*     */     try {
/* 357 */       pxbncdxlstxrd.setIxmsg(paramString2);
/* 358 */       pxbncdxmlxcng = getMiilConfigID(paramInt);
/* 359 */       pxbncdxlstxrd.setPxbncdxmlxcng(pxbncdxmlxcng);
/* 360 */       pxbncdxlstxrd.setDxrdxlst(paramString1);
/* 361 */       pxbncdxlstxrd.setBxctd(paramString3);
/* 362 */       pxbncdxlstxrd.setDxctd(DateUtil.getSysDate());
/* 363 */       pxbncdxlstxrd.setBxmfdxlst(paramString3);
/* 364 */       pxbncdxlstxrd.setDxmfdxlst(DateUtil.getSysDate());
/* 365 */       transaction = session.beginTransaction();
/* 366 */       session.save(pxbncdxlstxrd);
/* 367 */       transaction.commit();
/*     */     }
/* 369 */     catch (HibernateException hibernateException) {
/* 370 */       hibernateException.printStackTrace();
/*     */     } finally {
/*     */       
/* 373 */       session.clear();
/* 374 */       session.close();
/*     */     } 
/*     */   }
/*     */   
/*     */   public List getTotalEmilProductionDataDetails(Date paramDate, long paramLong, String paramString) {
/* 379 */     ArrayList<Dxprdtnxdtlsxm> arrayList = new ArrayList();
/* 380 */     List<Dxprdtnxdtlsxm> list = gettotalEmailRecords(paramDate, paramLong, paramString);
/* 381 */     for (byte b = 0; b < list.size(); b++) {
/* 382 */       arrayList.add(list.get(b));
/*     */     }
/* 384 */     return arrayList;
/*     */   }
/*     */   
/*     */   public List gettotalEmailRecords(Date paramDate, long paramLong, String paramString) {
/* 388 */     Session session = HibernateUtil.getSession();
/* 389 */     String str1 = "";
/* 390 */     if (paramString.length() > 0) {
/* 391 */       str1 = " noxacnt in (" + paramString + ")";
/*     */     }
/* 393 */     boolean bool = false;
/* 394 */     String str2 = "";
/* 395 */     Query query = null;
/* 396 */     List list = null;
/*     */     try {
/* 398 */       str2 = "from Dxprdtnxdtlsxm D where ixem is not null and dxstmt=:stmtDate and ixprcs=:PrcessId  and " + str1;
/* 399 */       query = session.createQuery(str2);
/* 400 */       query.setParameter("stmtDate", paramDate);
/* 401 */       query.setParameter("PrcessId", Long.valueOf(paramLong));
/* 402 */       list = query.list();
/*     */     }
/* 404 */     catch (HibernateException hibernateException) {
/* 405 */       logger.error(hibernateException.getMessage() + ":" + BounceTrapReptReSendDAOImpl.class);
/*     */     } finally {
/*     */       
/* 408 */       session.clear();
/* 409 */       session.close();
/*     */     } 
/* 411 */     return list;
/*     */   }
/*     */   
/*     */   public List getEmailConfigurationDetails(long paramLong) {
/* 415 */     ArrayList<Pxemlxcng> arrayList = new ArrayList();
/* 416 */     List<Pxemlxcng> list = getEmailConfigDetails(paramLong);
/* 417 */     for (byte b = 0; b < list.size(); b++) {
/* 418 */       arrayList.add(list.get(b));
/*     */     }
/* 420 */     return arrayList;
/*     */   }
/*     */   
/*     */   public List getBounceEmailConfiguration(String paramString) {
/* 424 */     Session session = HibernateUtil.getSession();
/* 425 */     List list = null;
/* 426 */     Query query = null;
/*     */     try {
/* 428 */       String str = "from Pxbncdxmlxcng as pbncng  where pbncng.ixmlxsndrxbncd='" + paramString + "'";
/* 429 */       query = session.createQuery(str);
/* 430 */       list = query.list();
/*     */     }
/* 432 */     catch (HibernateException hibernateException) {
/* 433 */       hibernateException.printStackTrace();
/*     */     } finally {
/*     */       
/* 436 */       session.clear();
/* 437 */       session.close();
/*     */     } 
/* 439 */     return list;
/*     */   }
/*     */   
/*     */   public List<Object> getProduct(long paramLong, String paramString) {
/* 443 */     Session session = HibernateUtil.getSession();
/* 444 */     List<Object> list = null;
/* 445 */     Query query = null;
/*     */     try {
/* 447 */       String str = "from Pcxprmxprdtx as pbncng  where pbncng.ixprm=" + paramLong;
/* 448 */       query = session.createQuery(str);
/* 449 */       list = query.list();
/*     */     }
/* 451 */     catch (HibernateException hibernateException) {
/* 452 */       hibernateException.printStackTrace();
/*     */     } finally {
/*     */       
/* 455 */       session.clear();
/* 456 */       session.close();
/*     */     } 
/* 458 */     return list;
/*     */   }
/*     */   
/*     */   public List getEmailConfigDetails(long paramLong) {
/* 462 */     Session session = HibernateUtil.getSession();
/* 463 */     List list = null;
/* 464 */     Query query = null;
/*     */     try {
/* 466 */       String str = "from Pxemlxcng as pcng  where pcng.ixcfgxem=" + paramLong;
/* 467 */       query = session.createQuery(str);
/* 468 */       list = query.list();
/*     */     }
/* 470 */     catch (HibernateException hibernateException) {
/* 471 */       hibernateException.printStackTrace();
/*     */     } finally {
/*     */       
/* 474 */       session.clear();
/* 475 */       session.close();
/*     */     } 
/* 477 */     return list;
/*     */   }
/*     */   
/*     */   public void updateSentFlag(long paramLong1, long paramLong2, String paramString) {
/* 481 */     Session session = HibernateUtil.getSession();
/* 482 */     int i = 0;
/* 483 */     String str = "";
/* 484 */     Query query = null;
/*     */     try {
/* 486 */       str = "update Dxprdtnxdtlsxm set fxsntxem = '" + paramString + "', dxsntxem=:stmtDt  where ixprcs = " + paramLong2 + " and noxacnt=" + paramLong1 + "";
/* 487 */       query = session.createQuery(str);
/* 488 */       query.setParameter("stmtDt", DateUtil.getSysDate());
/* 489 */       i = query.executeUpdate();
/*     */     }
/* 491 */     catch (HibernateException hibernateException) {
/* 492 */       logger.error(hibernateException.getMessage() + ":" + BounceTrapReptReSendDAOImpl.class);
/*     */     } finally {
/*     */       
/* 495 */       session.clear();
/* 496 */       session.close();
/*     */     } 
/*     */   }
/*     */   
/*     */   public void updatCountLogs(long paramLong, int paramInt, String paramString) {
/* 501 */     Session session = HibernateUtil.getSession();
/* 502 */     int i = 0;
/* 503 */     String str = "";
/* 504 */     Query query = null;
/*     */     try {
/* 506 */       if (paramString.equalsIgnoreCase("S")) {
/* 507 */         str = "update Cxprcsxdtls set emxttl = " + paramInt + " where ixprcs = " + paramLong + " ";
/*     */       }
/* 509 */       else if (paramString.equalsIgnoreCase("N")) {
/* 510 */         str = "update Cxprcsxdtls set msdxemxttl = '" + String.valueOf(paramInt) + "' where ixprcs = " + paramLong + " ";
/*     */       } 
/* 512 */       query = session.createQuery(str);
/* 513 */       i = query.executeUpdate();
/*     */     }
/* 515 */     catch (HibernateException hibernateException) {
/* 516 */       logger.error(hibernateException.getMessage() + ":" + BounceTrapReptReSendDAOImpl.class);
/*     */     } finally {
/*     */       
/* 519 */       session.clear();
/* 520 */       session.close();
/*     */     } 
/*     */   }
/*     */   
/*     */   public void updateReSentCount(long paramLong1, long paramLong2, String paramString, int paramInt) {
/* 525 */     Session session = HibernateUtil.getSession();
/* 526 */     String str = "";
/* 527 */     Query query = null;
/*     */     try {
/* 529 */       str = "update Pxbncdxtra as bnTrap set bnTrap.cntxres = :count  where bnTrap.ixprcs= :processID and bnTrap.crn= :crn";
/* 530 */       query = session.createQuery(str);
/* 531 */       query.setParameter("count", Long.valueOf(Long.parseLong(String.valueOf(paramInt))));
/* 532 */       query.setParameter("processID", Long.valueOf(paramLong2));
/* 533 */       query.setParameter("crn", String.valueOf(paramLong1));
/* 534 */       int i = query.executeUpdate();
/*     */     }
/* 536 */     catch (HibernateException hibernateException) {
/* 537 */       logger.error(hibernateException.getMessage() + ":" + BounceTrapReptReSendDAOImpl.class);
/*     */     } finally {
/*     */       
/* 540 */       session.clear();
/* 541 */       session.close();
/*     */     } 
/*     */   }
/*     */   
/*     */   public void updateReSentDtls(String[] paramArrayOfString, String paramString) {
/* 546 */     System.out.println(" Calling Rebounce Update Method");
/* 547 */     Session session = HibernateUtil_Main.getSession();
/* 548 */     System.out.println(" Calling Rebounce Update Method1");
/* 549 */     System.out.println(" Calling Rebounce Update Method0" + paramString);
/* 550 */     System.out.println(" Calling Rebounce Update Method0" + paramArrayOfString[0]);
/* 551 */     System.out.println(" Calling Rebounce Update Method1" + paramArrayOfString[1]);
/* 552 */     System.out.println(" Calling Rebounce Update Method2" + paramArrayOfString[2]);
/* 553 */     System.out.println(" Calling Rebounce Update Method3" + paramArrayOfString[3]);
/* 554 */     System.out.println(" Calling Rebounce Update Method4" + paramArrayOfString[4]);
/* 555 */     System.out.println(" Calling Rebounce Update Method5" + paramArrayOfString[5]);
/* 556 */     String str = "";
/* 557 */     SQLQuery sQLQuery = null;
/* 558 */     Transaction transaction = null;
/*     */     try {
/* 560 */       transaction = session.beginTransaction();
/* 561 */       str = "update pxbncdxtra set rcatxbou=:rcatxbou,rixemxbncd=:rixemxbncd,rsttsxbncd=:rsttsxbncd,rdtxarrvl=:rdtxarrvl,rrexo=:rrexo,rdxctd=SYSDATE where ixbncdxhrdxsft=:ixbncdxhrdxsft";
/* 562 */       sQLQuery = session.createSQLQuery(str);
/* 563 */       System.out.println(" Calling Rebounce Update Method2" + str);
/* 564 */       sQLQuery.setParameter("rcatxbou", paramString);
/* 565 */       sQLQuery.setParameter("rixemxbncd", (paramArrayOfString[1] != null) ? paramArrayOfString[1].trim() : paramArrayOfString[1]);
/* 566 */       sQLQuery.setParameter("rsttsxbncd", (paramArrayOfString[2] != null) ? paramArrayOfString[2].trim() : paramArrayOfString[2]);
/* 567 */       sQLQuery.setParameter("rdtxarrvl", (paramArrayOfString[3] != null) ? paramArrayOfString[3].trim() : paramArrayOfString[3]);
/* 568 */       sQLQuery.setParameter("rrexo", (paramArrayOfString[4] != null) ? paramArrayOfString[4].trim() : paramArrayOfString[4]);
/* 569 */       sQLQuery.setParameter("ixbncdxhrdxsft", (paramArrayOfString[5] != null) ? new Long(paramArrayOfString[5].trim()) : new Long(paramArrayOfString[5]));
/* 570 */       System.out.println(" Calling Rebounce Update Method3" + str);
/* 571 */       int i = sQLQuery.executeUpdate();
/* 572 */       transaction.commit();
/* 573 */       System.out.println(" Calling Rebounce Update Method4" + i);
/*     */     
/*     */     }
/* 576 */     catch (Exception exception) {
/* 577 */       exception.printStackTrace();
/* 578 */       logger.error(exception.getMessage() + ":" + BounceTrapReptReSendDAOImpl.class);
/* 579 */       transaction.rollback();
/*     */     } finally {
/*     */       
/* 582 */       session.clear();
/* 583 */       session.close();
/*     */     } 
/*     */   }
/*     */   
/*     */   public List getMaxProcessID(Date paramDate, String paramString) {
/* 588 */     Session session = HibernateUtil.getSession();
/* 589 */     List list = null;
/* 590 */     SQLQuery sQLQuery = null;
/* 591 */     String str = DateUtil.getFormattedStrDate(paramDate);
/*     */     try {
/* 593 */       String str1 = "select Max(IXPRCS), count(IXPRCS) from CXPRCSXM where DXSTMT='" + str + "'and IXPRDT=" + paramString + "";
/* 594 */       sQLQuery = session.createSQLQuery(str1);
/* 595 */       list = sQLQuery.list();
/*     */     }
/* 597 */     catch (HibernateException hibernateException) {
/* 598 */       logger.error(hibernateException.getMessage() + ":" + BounceTrapReptReSendDAOImpl.class);
/*     */     } finally {
/*     */       
/* 601 */       session.clear();
/* 602 */       session.close();
/*     */     } 
/* 604 */     return list;
/*     */   }
/*     */   
/*     */   private Pxbncdxmlxcng getMiilConfigID(int paramInt) {
/* 608 */     Pxbncdxmlxcng pxbncdxmlxcng = null;
/* 609 */     Object object = null;
/* 610 */     Session session = HibernateUtil.getSession();
/* 611 */     if (paramInt != 0) {
/* 612 */       pxbncdxmlxcng = (Pxbncdxmlxcng)session.get(Pxprdctxm.class, Long.valueOf(Long.parseLong(String.valueOf(paramInt))));
/*     */     }
/* 614 */     session.close();
/* 615 */     return pxbncdxmlxcng;
/*     */   }
/*     */   
/*     */   public List<Object> display(Object paramObject, long paramLong) {
/* 619 */     Session session = HibernateUtil.getSession();
/* 620 */     Query query = null;
/* 621 */     List<Object> list = null;
/* 622 */     String str = "";
/* 623 */     Transaction transaction = null;
/*     */     try {
/* 625 */       transaction = session.beginTransaction();
/* 626 */       if (paramObject instanceof Pxbncdxlstxrd) {
/* 627 */         str = "from Pxbncdxlstxrd as bnLstRd where bnLstRd.pxbncdxmlxcng.ixcfgxmlxbncd =:bounceLstReadObj";
/*     */       }
/* 629 */       query = session.createQuery(str);
/* 630 */       query.setParameter("bounceLstReadObj", Long.valueOf(paramLong));
/* 631 */       list = query.list();
/* 632 */       transaction.commit();
/*     */     }
/* 634 */     catch (HibernateException hibernateException) {
/* 635 */       logger.error(hibernateException.getMessage() + ":" + BounceTrapReptReSendDAOImpl.class);
/*     */     } 
/* 637 */     return list;
/*     */   }
/*     */   
/*     */   public List<Object> getPrmLog(Long paramLong, String paramString) {
/* 641 */     Session session = HibernateUtil.getSession();
/* 642 */     Query query = null;
/* 643 */     List<Object> list = null;
/* 644 */     String str = "";
/* 645 */     Transaction transaction = null;
/*     */     try {
/* 647 */       transaction = session.beginTransaction();
/* 648 */       if (paramString.equalsIgnoreCase("prmLog")) {
/* 649 */         str = "from Pxprmxemlxlg as bnLstRd where bnLstRd.ixprm=" + paramLong;
/*     */       } else {
/*     */         
/* 652 */         str = "from Pxprmxemlxlgxdtls as bnLstRd where bnLstRd.pxprmxemlxlg.ixprmxlg=" + paramLong;
/*     */       } 
/* 654 */       query = session.createQuery(str);
/* 655 */       list = query.list();
/* 656 */       transaction.commit();
/*     */     }
/* 658 */     catch (HibernateException hibernateException) {
/* 659 */       logger.error(hibernateException.getMessage() + ":" + BounceTrapReptReSendDAOImpl.class);
/*     */     } 
/* 661 */     return list;
/*     */   }
/*     */   
/*     */   public void updatCountLogs(long paramLong, int paramInt, String paramString1, String paramString2) {
/* 665 */     Session session = HibernateUtil.getSession();
/* 666 */     int i = 0;
/* 667 */     String str = "";
/* 668 */     Query query = null;
/*     */     try {
/* 670 */       if (paramString1.equalsIgnoreCase("Soft")) {
/* 671 */         str = "update Cxprcsxdtls set totxsftxbncd = " + paramInt + " where ixprcs = " + paramLong + " ";
/*     */       }
/* 673 */       else if (paramString1.equalsIgnoreCase("Hard")) {
/* 674 */         str = "update Cxprcsxdtls set totxhrdxbncd = " + paramInt + " where ixprcs = " + paramLong + " ";
/*     */       } 
/* 676 */       query = session.createQuery(str);
/* 677 */       i = query.executeUpdate();
/*     */     }
/* 679 */     catch (HibernateException hibernateException) {
/* 680 */       logger.error(hibernateException.getMessage() + ":" + BounceTrapReptReSendDAOImpl.class);
/*     */     } finally {
/*     */       
/* 683 */       session.clear();
/* 684 */       session.close();
/*     */     } 
/*     */   }
/*     */   
/*     */   public String getProcessdate(long paramLong, String paramString) {
/* 689 */     Session session = null;
/* 690 */     session = HibernateUtil.getSession();
/* 691 */     String str1 = null;
/* 692 */     String str2 = "";
/* 693 */     Query query = null;
/* 694 */     List list = null;
/* 695 */     Cxprcsxm cxprcsxm = null;
/*     */     try {
/* 697 */       str2 = " from  Cxprcsxm where ixprcs = " + paramLong + " ";
/* 698 */       query = session.createQuery(str2);
/* 699 */       list = query.list();
/* 700 */       if (list.size() > 0) {
/* 701 */         for (Object cxprcsxm1 : list) {
/* 702 */           cxprcsxm = (Cxprcsxm) cxprcsxm1;
/* 703 */           str1 = cxprcsxm.getDxprcs() + "";
/*     */         }
/*     */       
/*     */       }
/* 707 */     } catch (HibernateException hibernateException) {
/* 708 */       hibernateException.printStackTrace();
/* 709 */       logger.error(hibernateException.getMessage() + ":" + BounceTrapReptReSendDAOImpl.class);
/*     */     } finally {
/*     */       
/* 712 */       session.clear();
/* 713 */       session.close();
/*     */     } 
/* 715 */     if (cxprcsxm == null) {
/*     */       try {
/* 717 */         session = HibernateUtil_Main.getSession();
/* 718 */         query = session.createQuery(str2);
/* 719 */         list = query.list();
/* 720 */         if (list.size() > 0) {
/* 721 */           for (Object cxprcsxm1 : list) {
/* 722 */             cxprcsxm = (Cxprcsxm) cxprcsxm1;
/* 723 */             str1 = cxprcsxm.getDxprcs() + "";
/*     */           }
/*     */         
/*     */         }
/* 727 */       } catch (HibernateException hibernateException) {
/* 728 */         hibernateException.printStackTrace();
/* 729 */         logger.error(hibernateException.getMessage() + ":" + BounceTrapReptReSendDAOImpl.class);
/*     */       } finally {
/*     */         
/* 732 */         session.clear();
/* 733 */         session.close();
/*     */       } 
/*     */     }
/* 736 */     return str1;
/*     */   }
/*     */   
/*     */   public void update(Long paramLong, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5) {
/* 740 */     Session session = HibernateUtil.getSession();
/* 741 */     String str = "";
/* 742 */     Query query = null;
/*     */     try {
/* 744 */       if (paramString5.equalsIgnoreCase("ADHOCMail")) {
/* 745 */         str = "update Pxprmxemlxlgxdtls as prmLog set catxbou= :bounceCat,fxsntxem='B',fxbncdxem='Y', bxctd= :createdBy , dxctd =:CreatedDate where prmLog.pxprmxemlxlg.ixprmxlg = :prmLogId and prmLog.ixem = :emailID";
/*     */       } else {
/*     */         
/* 748 */         str = "update Pxprmxemlxlgxdtls as prmLog set catxbou= :bounceCat,fxsntxem='B',fxbncdxem='Y', bxctd= :createdBy , dxctd =:CreatedDate where prmLog.pxprmxemlxlg.ixprmxlg = :prmLogId and prmLog.crn = :crnVlaue";
/*     */       } 
/* 750 */       query = session.createQuery(str);
/* 751 */       if (paramString5.equalsIgnoreCase("ADHOCMail")) {
/* 752 */         query.setParameter("emailID", paramString4.trim());
/*     */       } else {
/*     */         
/* 755 */         query.setParameter("crnVlaue", paramString1.trim());
/*     */       } 
/* 757 */       query.setParameter("bounceCat", paramString2.trim());
/* 758 */       query.setParameter("createdBy", paramString3);
/* 759 */       query.setParameter("CreatedDate", DateUtil.getSysDate());
/* 760 */       query.setParameter("prmLogId", paramLong);
/* 761 */       int i = query.executeUpdate();
/*     */     }
/* 763 */     catch (HibernateException hibernateException) {
/* 764 */       hibernateException.printStackTrace();
/*     */     } finally {
/*     */       
/* 767 */       session.clear();
/* 768 */       session.close();
/*     */     } 
/*     */   }
/*     */   
/*     */   public void updatePromotionalLog(Long paramLong1, String paramString, int paramInt, Long paramLong2) {
/* 773 */     Session session = HibernateUtil.getSession();
/* 774 */     String str = "";
/* 775 */     Query query = null;
/*     */     try {
/* 777 */       str = "update Pxprmxemlxlg as prmLog set ttlxbncd= :totalBounce, bxmfdxlst= :modifyedBy , dxmfdxlst= :modifyedLastDate where prmLog.ixprmxlg= :prmLogId and prmLog.ixprm= :prmId";
/* 778 */       query = session.createQuery(str);
/* 779 */       query.setParameter("totalBounce", Long.valueOf(Long.parseLong(String.valueOf(paramInt))));
/* 780 */       query.setParameter("modifyedBy", paramString);
/* 781 */       query.setParameter("modifyedLastDate", DateUtil.getSysDate());
/* 782 */       query.setParameter("prmLogId", paramLong1);
/* 783 */       query.setParameter("prmId", paramLong2);
/* 784 */       int i = query.executeUpdate();
/*     */     }
/* 786 */     catch (HibernateException hibernateException) {
/* 787 */       hibernateException.printStackTrace();
/*     */     } finally {
/*     */       
/* 790 */       session.clear();
/* 791 */       session.close();
/*     */     } 
/*     */   }
/*     */   
/*     */   public List<Object> getEmailRecords(long paramLong1, long paramLong2) {
/* 796 */     Session session = HibernateUtil.getSession();
/* 797 */     String str = "";
/* 798 */     Query query = null;
/* 799 */     List<Object> list = null;
/*     */     try {
/* 801 */       str = "from Dxprdtnxdtlsxm D where  ixprcs=" + paramLong1 + " and ixprdt=" + paramLong2 + " and ixem is not null and flxchnlxdlvy like '%Email%' ";
/* 802 */       query = session.createQuery(str);
/* 803 */       list = query.list();
/*     */     }
/* 805 */     catch (HibernateException hibernateException) {
/* 806 */       logger.error(hibernateException.getMessage() + ":" + BounceTrapReptReSendDAOImpl.class);
/*     */     } finally {
/*     */       
/* 809 */       session.clear();
/* 810 */       session.close();
/*     */     } 
/* 812 */     return list;
/*     */   }
/*     */   
/*     */   public String getName(long paramLong, String paramString1, String paramString2) {
/* 816 */     Session session = null;
/* 817 */     session = HibernateUtil.getSession();
/* 818 */     String str1 = "";
/* 819 */     SQLQuery sQLQuery = null;
/* 820 */     String str2 = null;
/*     */     try {
/* 822 */       str1 = "select nmxfst||'ixcst'||ixcst from Dxcstmrxm D where ixprcs=" + paramLong + " and crn='" + paramString1 + "' ";
/* 823 */       System.out.println(" hql-------------  " + str1);
/* 824 */       sQLQuery = session.createSQLQuery(str1);
/* 825 */       str2 = String.valueOf(sQLQuery.list().get(0));
/*     */     }
/* 827 */     catch (Exception exception) {
/* 828 */       System.out.println("Exception in getName " + exception.getMessage());
/* 829 */       logger.error(exception.getMessage() + ":" + BounceTrapReptReSendDAOImpl.class);
/*     */     } finally {
/*     */       
/* 832 */       session.clear();
/* 833 */       session.close();
/*     */     } 
/* 835 */     if (str2 == null) {
/*     */       try {
/* 837 */         session = HibernateUtil_Main.getSession();
/* 838 */         sQLQuery = session.createSQLQuery(str1);
/* 839 */         str2 = String.valueOf(sQLQuery.list().get(0));
/*     */       }
/* 841 */       catch (Exception exception) {
/* 842 */         System.out.println("Exception in getName " + exception.getMessage());
/* 843 */         logger.error(exception.getMessage() + ":" + BounceTrapReptReSendDAOImpl.class);
/*     */       } finally {
/*     */         
/* 846 */         session.clear();
/* 847 */         session.close();
/*     */       } 
/*     */     }
/* 850 */     return str2;
/*     */   }
/*     */   
/*     */   public String getRegioncode(long paramLong1, long paramLong2, String paramString) {
/* 854 */     Session session = null;
/* 855 */     session = HibernateUtil.getSession();
/* 856 */     String str1 = "";
/* 857 */     SQLQuery sQLQuery = null;
/* 858 */     String str2 = null;
/*     */     try {
/* 860 */       str1 = "select cdexreg from Dxcstmrxdtls D where ixprcs=" + paramLong1 + " and ixcst='" + paramLong2 + "' ";
/* 861 */       System.out.println(" hql-------------  " + str1);
/* 862 */       sQLQuery = session.createSQLQuery(str1);
/* 863 */       str2 = String.valueOf(sQLQuery.list().get(0));
/*     */     }
/* 865 */     catch (Exception exception) {
/* 866 */       System.out.println("Exception in main getRegioncode " + exception.getMessage());
/* 867 */       logger.error(exception.getMessage() + ":" + BounceTrapReptReSendDAOImpl.class);
/*     */     } finally {
/*     */       
/* 870 */       session.clear();
/* 871 */       session.close();
/*     */     } 
/* 873 */     if (str2 == null) {
/*     */       try {
/* 875 */         session = HibernateUtil_Main.getSession();
/* 876 */         sQLQuery = session.createSQLQuery(str1);
/* 877 */         str2 = String.valueOf(sQLQuery.list().get(0));
/*     */       }
/* 879 */       catch (Exception exception) {
/* 880 */         System.out.println("Exception in arch getRegioncode " + exception.getMessage());
/* 881 */         logger.error(exception.getMessage() + ":" + BounceTrapReptReSendDAOImpl.class);
/*     */       } finally {
/*     */         
/* 884 */         session.clear();
/* 885 */         session.close();
/*     */       } 
/*     */     }
/* 888 */     return str2;
/*     */   }
/*     */   
/*     */   public void updatBouncedCountLogs(long paramLong) {
/* 892 */     Session session = HibernateUtil.getSession();
/* 893 */     int i = 0;
/* 894 */     String str = "";
/*     */     try {
/* 896 */       Transaction transaction = session.beginTransaction();
/* 897 */       str = "update  CXPRCSXDTLS set TOTXHRDXBNCD=(select count(CATXBOU) from PXBNCDXTRA where IXPRCS=" + paramLong + " and CATXBOU='H'), TOTXSFTXBNCD=(select count(CATXBOU) from PXBNCDXTRA where IXPRCS=" + paramLong + " and CATXBOU='S') where IXPRCS = " + paramLong;
/* 898 */       System.out.println("hql  " + str);
/* 899 */       SQLQuery sQLQuery = session.createSQLQuery(str);
/* 900 */       i = sQLQuery.executeUpdate();
/* 901 */       transaction.commit();
/* 902 */       System.out.println("rowCount ---------- " + i);
/*     */     }
/* 904 */     catch (HibernateException hibernateException) {
/* 905 */       logger.error(hibernateException.getMessage() + ":" + BounceTrapReptReSendDAOImpl.class);
/*     */     } finally {
/*     */       
/* 908 */       session.clear();
/* 909 */       session.close();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/* 914 */   private static Logger logger = Logger.getLogger(BounceTrapReptReSendDAOImpl.class);
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\impl\BounceTrapReptReSendDAOImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */