/*    */ package seebizbt;
/*    */ 
/*    */ import com.seeinfobiz.click.impl.ScheduleBounceTrap;
/*    */ import javax.mail.MessagingException;

/*    */ public class Main
/*    */ {
/*    */   public static void main(String[] args) throws MessagingException, Exception {
/* 20 */     (new ScheduleBounceTrap()).execute(Long.valueOf(Long.parseLong(args[0])));
/*    */   }
/*    */ }


