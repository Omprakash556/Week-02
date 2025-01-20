public class BankAccount {
    // Instance Variable
    private static String bankName = "Central Bank";
    private static  int totalAccount = 0;
    private String accountHolderName;
    private final String accountNumber;

    // Parametrised Constructor
    BankAccount(String accountHolderName, String accountNumber){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccount++;
    }

    // Method of counting total account
    public static int getTotalAccount(int totalAccount){
        return totalAccount;
    }

    // Displaying final results
    public  void displayDetails(){
        if(this instanceof BankAccount){
            System.out.println("Bank Name is: "+bankName);
            System.out.println("Account Holder Name: "+accountHolderName);
            System.out.println("Account Number: "+ accountNumber);
            System.out.println();
        }else System.out.println("This is not object of this class. ");
    }

    public static void main(String[] args) {

        // Create object of Parametrised Constructor
        BankAccount bankAccount = new BankAccount("Om Prakash", "sbin08");
        BankAccount bankAccount1 = new BankAccount("Abhinav", "pnb01");
        bankAccount.displayDetails();
        bankAccount1.displayDetails();

        // print Total Account created by user
        System.out.println("Total Account created: "+getTotalAccount(totalAccount));

    }
}
