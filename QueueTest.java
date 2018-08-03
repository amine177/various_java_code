public class QueueTest {
   public static void main(String[] args) {
      Queue q = new Queue(3);
      for (int i = 0; i < 3; ++i)
         q.enqueue(i);
      while(!q.empty())
         System.out.print(q.dequeue() + "|");
   }
}
