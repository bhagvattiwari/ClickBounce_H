/*     */ package com.seeinfobiz.click.impl;
/*     */ 
/*     */ import com.seeinfobiz.click.entitybean.Cxprcsxm;
/*     */ import com.seeinfobiz.click.entitybean.Pxprdctxdtl;
/*     */ import com.seeinfobiz.click.entitybean.Pxprdctxm;
/*     */ import com.seeinfobiz.click.entitybean.Pxshdlrxarcv;
/*     */ import com.seeinfobiz.click.entitybean.Pxshdlrxm;
/*     */ import com.seeinfobiz.click.util.DateUtil;
/*     */ import java.util.Calendar;
/*     */ import java.util.Date;
/*     */ import java.util.List;
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
/*     */ public class SchedularManager
/*     */ {
/*     */   private SchedularDAOImpl schedularDAO;
/*     */   private EBPDAOImpl ebpDAOImpl;
/*  27 */   private String returnMessage = "";
/*     */   
/*     */   public SchedularManager() {
/*  30 */     this.ebpDAOImpl = new EBPDAOImpl();
/*  31 */     this.schedularDAO = new SchedularDAOImpl();
/*     */   }
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
/*     */   public Pxshdlrxarcv saveProcessSchedule(String processMode, String scheduledate, String processType, String productName, String time, String etlFileName, String loginNm, String processName, String fileNetBatchFlag, String withOrWitihOutLogo, String emailingFlag, String manualEBPSchFlag, String recursiveFlag, String processlst) {
/*  49 */     Pxshdlrxarcv schArc = new Pxshdlrxarcv();
/*  50 */     Pxshdlrxm schMstr = new Pxshdlrxm();
/*  51 */     Date currentProcessDate = DateUtil.getDate(scheduledate);
/*  52 */     Pxprdctxm prdObj = new Pxprdctxm();
/*     */     
/*  54 */     this.returnMessage = "SUCCESS";
/*  55 */     List<Object> objList = this.ebpDAOImpl.display(productName.trim(), prdObj);
/*     */ 
/*     */ 
/*     */     
/*  59 */     schMstr.setDxshdlrxcur(currentProcessDate);
/*     */     
/*  61 */     schMstr.setMdexshdlr(processMode);
/*  62 */     schMstr.setTypxshdlr(processType);
/*  63 */     schMstr.setIxprdt(productName.trim());
/*  64 */     schMstr.setNmxschxm(processName);
/*     */     
/*  66 */     if (withOrWitihOutLogo.trim().equalsIgnoreCase("WithLogo$WithoutLogo")) {
/*  67 */       schMstr.setFlgxlgoxw("WithLogo");
/*  68 */       schMstr.setFlgxlgoxwo("WithoutLogo");
/*     */     } 
/*  70 */     if (withOrWitihOutLogo.trim().equalsIgnoreCase("WithLogo")) {
/*  71 */       schMstr.setFlgxlgoxw("WithLogo");
/*  72 */       schMstr.setFlgxlgoxwo("");
/*     */     } 
/*     */     
/*  75 */     if (withOrWitihOutLogo.trim().equalsIgnoreCase("WithoutLogo")) {
/*  76 */       schMstr.setFlgxlgoxwo("WithoutLogo");
/*  77 */       schMstr.setFlgxlgoxw("");
/*     */     } 
/*  79 */     schMstr.setNmxschxprxm(processlst);
/*  80 */     schMstr.setFlgxlgoxeml(emailingFlag);
/*  81 */     schMstr.setFlgxbpxfp(fileNetBatchFlag);
/*  82 */     schMstr.setFlgxrecsv(recursiveFlag);
/*  83 */     schMstr.setBxctd(loginNm);
/*  84 */     schMstr.setDxctd(DateUtil.getSysDate());
/*  85 */     schMstr.setBxmfdxlst(loginNm);
/*  86 */     schMstr.setDxmfdxlst(DateUtil.getSysDate());
/*     */ 
/*     */     
/*  89 */     schArc.setIxrndxshdlr(currentProcessDate);
/*  90 */     schArc.setIxtmexshdlr(time);
/*  91 */     schArc.setPxshdlrxm(schMstr);
/*  92 */     schArc.setFlgxschxebpxmnl(manualEBPSchFlag);
/*     */ 
/*     */ 
/*     */     
/*  96 */     schArc.setStts("SCHEDULED");
/*  97 */     schArc.setBxctd(loginNm);
/*  98 */     schArc.setNmxschxm(processName);
/*  99 */     schArc.setDxctd(DateUtil.getSysDate());
/* 100 */     schArc.setBxmfdxlst(loginNm);
/* 101 */     schArc.setDxmfdxlst(DateUtil.getSysDate());
/*     */ 
/*     */ 
/*     */     
/* 105 */     if (processType.equalsIgnoreCase("Data Extraction")) {
/* 106 */       schArc.setNmxzpxetl(etlFileName);
/* 107 */       schArc.setCrnt_stts("DATA EXTRACTION IN PROGRESS");
/*     */       
/* 109 */       int t = 0; if (t < objList.size()) {
/* 110 */         Pxprdctxdtl prdDtlObj = (Pxprdctxdtl)objList.get(t);
/*     */         
/* 112 */         schArc.setPtxbatxetl(prdDtlObj.getPtxbatxetl());
/* 113 */         schArc.setNmxzpxetl(prdDtlObj.getNmxzpxetl());
/*     */       }
/*     */     
/*     */     }
/* 117 */     else if (processType.equalsIgnoreCase("Statement Generation")) {
/* 118 */       schArc.setCrnt_stts("STATEMENT GENERATION IN PROGRESS");
/*     */     } 
/*     */     
/* 121 */     return null;
/*     */   }
/*     */   
/*     */   public void saveProcessStatus(Pxshdlrxarcv pxshdlrxarcv, String archflag) {
/* 125 */     this.schedularDAO.add(pxshdlrxarcv, archflag);
/*     */   }
/*     */ 
/*     */   
/*     */   public Date getCurrentDate(Date currentProcessDate, String time) {
/* 130 */     Calendar calendar = Calendar.getInstance();
/*     */     
/* 132 */     String strDate = DateUtil.getStrDate(currentProcessDate);
/*     */ 
/*     */     
/* 135 */     String[] strTime = time.split("-");
/* 136 */     String hr = strTime[0].substring(0, 2);
/* 137 */     String min = strTime[0].substring(3, 5);
/* 138 */     String ampm = strTime[1];
/*     */     
/* 140 */     calendar.set(Integer.parseInt(strDate.split("/")[2]), Integer.parseInt(strDate.split("/")[1]) - 1, Integer.parseInt(strDate.split("/")[0]), (ampm.equalsIgnoreCase("PM") && Integer.parseInt(strDate.split("/")[0]) > 12) ? (Integer.parseInt(hr) + 12) : Integer.parseInt(hr), Integer.parseInt(min));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 145 */     return calendar.getTime();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List<Object> getExtractedProcesstLst(String productId, String processType) {
/* 154 */     List<Object> extDoneList = this.schedularDAO.getExtractedProcess(productId, processType);
/* 155 */     return extDoneList;
/*     */   }
/*     */   
/*     */   public List<Object> getProcessTime(String productId, String billcycleDate, String processType) {
/* 159 */     List<Object> extDoneList = this.schedularDAO.getProcessTime(productId, billcycleDate, processType);
/* 160 */     return extDoneList;
/*     */   }
/*     */   
/*     */   public List<Object> getProcessedList(String productId, String processType) {
/* 164 */     List<Object> extDoneList = this.schedularDAO.getProcessedList(productId, processType);
/* 165 */     return extDoneList;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List<Object> getPrdouctName(String prdId) {
/* 174 */     return this.schedularDAO.getName(prdId);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getPrdouctIdByName(String productName) {
/* 183 */     return this.schedularDAO.getProductIDByName(productName);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Pxprdctxm getProduct(String prdId) {
/* 192 */     return this.schedularDAO.getProduct(prdId);
/*     */   }
/*     */   
/*     */   public Pxshdlrxarcv getScheduleArcv(Long schArcvId) {
/* 196 */     return this.schedularDAO.getScheduleArcv(schArcvId);
/*     */   }
/*     */   
/*     */   public Long getProcessId(String prdId, String billDateStr, String procTime, String type, String archflag) {
/* 200 */     Long processID = null;
/*     */     
/* 202 */     List<Object> list = this.schedularDAO.getProcessID(prdId, billDateStr, procTime, type, archflag);
/*     */     
/* 204 */     for (int i = 0; i < list.size(); i++) {
/* 205 */       Cxprcsxm p = new Cxprcsxm();
/* 206 */       p = (Cxprcsxm)list.get(i);
/* 207 */       processID = p.getIxprcs();
/*     */     } 
/*     */     
/* 210 */     return processID;
/*     */   }
/*     */   
/*     */   public EBPDAOImpl getEbpDAOImpl() {
/* 214 */     return this.ebpDAOImpl;
/*     */   }
/*     */   
/*     */   public void setEbpDAOImpl(EBPDAOImpl ebpDAOImpl) {
/* 218 */     this.ebpDAOImpl = ebpDAOImpl;
/*     */   }
/*     */   
/*     */   public SchedularDAOImpl getSchedularDAO() {
/* 222 */     return this.schedularDAO;
/*     */   }
/*     */   
/*     */   public void setSchedularDAO(SchedularDAOImpl schedularDAO) {
/* 226 */     this.schedularDAO = schedularDAO;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getReturnMessage() {
/* 231 */     return this.returnMessage;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setReturnMessage(String returnMessage) {
/* 236 */     this.returnMessage = returnMessage;
/*     */   }
/*     */ }


/* Location:              C:\Users\aurionpro\Downloads\POP3_Oulook_Migration\SeebizBT.jar!\com\seeinfobiz\click\impl\SchedularManager.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */