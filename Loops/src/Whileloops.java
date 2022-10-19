import java.util.Scanner;
public class Whileloops {
    public static void main(String[] args) {
        System.out.println("Welcome to Whileloops app");
        Scanner input1 = new Scanner(System.in);
        int password = 0;
        boolean isspasswordtrue= false;
        while (!isspasswordtrue){
            System.out.print("Enter a password : ");
            password=input1.nextInt();
            if (password==123){
                System.out.println("Password is correct !");
                isspasswordtrue=true;
            }else{
                System.out.println("Password is wrong !");
            }

        }






    }
}
