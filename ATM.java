import java.util.Scanner;

public class ATM {
   private Account97[] Accounts;

   public ATM() {
      this(10, 100);
   }
   public ATM(int numberOfAccounts, int initialBalance) {
      this.Accounts = new Account97[numberOfAccounts];
      for (int i = 0; i < numberOfAccounts; i++) {
         this.Accounts[i] = new Account97(i, initialBalance);
      }
   }

   public void run() {
      Scanner input = new Scanner(System.in);
      Account97 sA;
      // Run forever
      while (true) {
      // Get Id
         System.out.println("Enter an id: ");
         int id = input.nextInt();
         if (id >= Accounts.length || id < 0)
            System.out.println("ID not found!");
         else {
            sA = Accounts[id];
      // Get choice on Id
            int choice;
            do {
               System.out.println(
                     "Main menu:\n"+
                     "1: check balance\n"+
                     "2: withdraw\n"+
                     "3: deposit\n"+
                     "4: exit");
               System.out.print("Enter choice :");
               choice = input.nextInt();
               if (choice == 1) {
                  System.out.println(
                     "The balance" +
                     " is: " +
                     sA.getBalance()
                     );
               }
               else if (choice == 2) {
                  System.out.println(
                     "Enter an" +
                     " amount: ");
                  sA.withdraw(
                     input.nextInt());
                  System.out.println(
                     "Your current" +
                     " balance is: " +
                     sA.getBalance());
               }
               else if (choice == 3) {
                  System.out.println(
                     "Enter an amount: ");
                  sA.deposit(input.nextInt());
                  System.out.println(
                     "Your current balance is: " +
                     sA.getBalance());
               }
            } while((choice > 3) || (choice < 1));
         }
      // Branch on choice
      }
   }
}
