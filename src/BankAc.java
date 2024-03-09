import java.io.IOException;

public class BankAc {
    int accountNumber ;
    double accountBalance;
    String customerName;
    String customerEmail;
    String phoneNumber;


    public BankAc(int accountNumber, double accountBalance, String customerName, String customerEmail, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.phoneNumber = phoneNumber;
    }


    public BankAc(int accountNumber, double accountBalance, String customerName) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
    }


    public void addMoney(double money){
        try {
            if (money > 0){
                accountBalance += money;
                System.out.println(customerName + "your account balance now is:" + accountBalance);
            }else
                System.out.println("invalid");
        }catch (Exception e){
            System.out.println("please enter number ! for add money");
        }
    }

    public void takeMoney(double money){

        try {
            if (money < accountBalance) {
                accountBalance -=  money;
                System.out.println(  customerName +"your account balance now is:" + accountBalance);
            }else {
                System.out.println("money that you want must loser than account balance");
            }
        }catch (Exception e){

                System.out.println("please enter number ! for add money");
            }

    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}
