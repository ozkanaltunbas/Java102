import java.util.Scanner;
public class Atmcase {
    public static void main(String[] args) {
        int right = 3;
        int press;
        int totalbalance=3000;
        String username,password = null;
        while(right>0){
            System.out.print("Please enter a username : ");
            Scanner input1 = new Scanner(System.in);
            username = input1.nextLine();
            if(username.equals("james")){
                System.out.print("Please enter a password : ");
                Scanner input2 = new Scanner(System.in);
                password = input2.nextLine();
                if(password.equals("paul")){
                    System.out.println("Username and Password correct !");
                }else{
                    System.out.println("Try again to login!");
                    break;
                }
            }
            if(username.equals("james")&&(password.equals("paul"))){
                System.out.println("Welcome MRS."+username+".");
                System.out.println("Press 1 to information.");
                System.out.println("Press 2 to withdraw money.");
                System.out.println("Press 3 to deposit");
                System.out.println("Press 4 to quit.");
                System.out.print("What you want to do ? (1 or 2 or 3 or 4 : ");
                Scanner input3 = new Scanner(System.in);
                press=input3.nextInt();
                switch (press){
                    case 1:
                        System.out.println("Your information is " + username + " :");
                        System.out.println("Full name is 'James Smith'");
                        System.out.println("Total balance is " + totalbalance + "$");
                        System.out.println("Address is 'Cool st. Build num 5C Newyork/USA'");
                        break;
                    case 2 :
                        System.out.println("Total balance is " + totalbalance + " $");
                        System.out.print("How much money do you want to withdraw? : ");
                        Scanner input4 = new Scanner(System.in);
                        int withdraw = input4.nextInt();
                        if(withdraw<=totalbalance){
                            totalbalance=totalbalance-withdraw;
                            System.out.println("Total balance is "+totalbalance+"$");
                            System.out.println("Have a nice day MRS."+username);
                        }else{
                            System.out.print("Insufficient balance. Please try again one more time :  ");
                            Scanner input5 = new Scanner(System.in);
                            int try1 = input5.nextInt();
                            if(try1<=totalbalance){
                                totalbalance=totalbalance-try1;
                                System.out.println("Your money is preapering please wait...");
                                System.out.println("Total balance is "+totalbalance);
                            }else{
                                System.out.println("Account is bloced!");
                            }
                        }break;
                    case 3:
                        System.out.println("Your total balance is "+totalbalance+"$");
                        System.out.print("How much will you add? : ");
                        Scanner input6 = new Scanner(System.in);
                        int add= input6.nextInt();
                        totalbalance=totalbalance+add;
                        System.out.println("Total balance is "+totalbalance+"$");
                        System.out.println("Have a nice day MRS."+username);
                        break;
                    case 4 :
                        System.out.println("Have a nice day MRS."+username);
                        break;
                    default:
                        System.out.println("Please enter a (1 / 2 / 3 / 4)!");
                        break;
               }

            }else if (right==1){
                System.out.println("Please try 30 min later!");
                break;
            }
            else{
                right--;
                System.out.println("Please check your input! "+right+" left");
                break;
            }
            break;
        }


























    }
}
