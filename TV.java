public class TV {
   final MAX_CHANNELS = 100;
   int channel = 1;
   int volumeLevel = 1;
   boolean on = false;

   public TV() {
   }

   public void turnOn() {
      if (!on)
         on = true;
   }

   public void turnOff() {
      if (on)
         on = false;
   }

   public void setChannel() {
   }

   public void setVolume() {
   }

   public void channelUp() {
   }

   public void ChannelDown() {
   }

   public void volumeUp() {
   }

   public void volumeDown() {
   }
}
