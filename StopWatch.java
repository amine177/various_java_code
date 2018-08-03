public class StopWatch {
   
   private long startTime;
   private long endTime;

   StopWatch() {
      startTime = System.currentTimeMillis();
      endTime = System.currentTimeMillis();
   }

   public void start() {
      startTime = System.currentTimeMillis();
   }

   public void stop() {
      endTime = System.currentTimeMillis();
   }

   public long getElapsedTime() {
      return this.endTime - this.startTime;
   }

   public long getStartTime() {
      return this.startTime;
   }

   public long getEndtime() {
      return this.endTime;
   }
}
