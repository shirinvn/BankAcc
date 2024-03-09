import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static BankAc bankAc;
    static Scanner scanner;
    public static void main(String[] args) {


         bankAc = new BankAc(234, 243.234,"Shirin","shirin@gmail.com", "09147771939" );


        int num ;
        do {
            System.out.println("please enter your request number: \n 1.addMoney \n 2.takeMoney");
            scanner = new Scanner(System.in);
            num = scanner.nextInt();
            switch (num){
                case 1: add();
                case 2: take();
            }

        }while (num != 0);

    }
    private static void add(){
        System.out.println("please enter your wanted add money form your account: ");
        double money= scanner.nextDouble();
        bankAc.depositMoney(money);
    }

    private static void take(){
        System.out.println("please enter your wanted take money form your account: ");
        double money= scanner.nextDouble();
        bankAc.withdrawalMoney(money);
    }
}