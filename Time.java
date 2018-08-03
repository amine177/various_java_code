public class Time {
   private int hour;
   private int minute;
   private int second;

   public Time() {
      this(System.currentTimeMillis());
   }

   public Time(long elapsedTimeSince1970) {
      setTime(elapsedTimeSince1970);
   }

   public Time(int hour, int minute, int second) {
      this.hour   = hour;
      this.minute = minute;
      this.second = second;
   }

   public int getSecond() {
   return this.second;
   }

   public int getMinute() {
      return this.minute;
   }

   public int getHour() {
      return this.hour;
   }

   public void setTime(long elapsedTime) {
      long totalSeconds = elapsedTime / 1000;
      this.second = (int)(totalSeconds % 60);
      long totalMinutes = totalSeconds / 60;
      this.minute = (int) (totalMinutes % 60);
      long totalHours   = totalMinutes / 60;
      this.hour = (int) (totalHours % 24);
   }

   public String toString() {
      return this.hour + "h:" +
         this.minute + "m:" +
         this.second + "s";
   }
}
