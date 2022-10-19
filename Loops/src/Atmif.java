import java.util.Scanner;

public class Atmif {
    public static void main(String[] args) {
        int right = 3;
        int a = right - 1;
        int passright = 3;
        int totalbalance = 3000;
        String password = null;
        String username = null;
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.print("Welcome sir Please enter a username : ");
        while (right > 0) {
            username = input1.nextLine();
            if (username.equals("james")) {
                System.out.println("Username is correct.");
                break;
            } else {
                System.out.println("Username is incorrect try again " + a + " Left");
                System.out.print("Enter a username : ");
                right--;
                a--;
            }
        }
        if (username.equals("james")) {
            while (passright > 0) {
                System.out.print("Enter a password MRS." + username + " : ");
                password = input2.nextLine();
                if (password.equals("paul")) {
                    System.out.println("Password is correct.");
                    break;
                } else if (passright == 1) {
                    System.out.println("Your credit card is bloked.");
                    break;
                } else {
                    passright--;
                    System.out.println("Password is incorrect " + passright + " left");
                    System.out.print("Enter a password : ");
                }
            }
            if (password.equals("paul")) {
                Scanner input3 = new Scanner(System.in);
                System.out.println("Press 1 to information.");
                System.out.println("Press 2 to withdraw money.");
                System.out.println("Press 3 to deposit");
                System.out.println("Press 4 to quit.");
                System.out.print("What you want (1 or 2 or 3  : ");
                int press = input3.nextInt();
                if (press == 1) {
                    System.out.println("Your information is " + username + " :");
                    System.out.println("Full name is 'James Smith'");
                    System.out.println("Total balance is " + totalbalance + "$");
                    System.out.println("Address is 'Cool st. Build num 5C Newyork/USA'");
                } else if (press == 2) {
                    System.out.println("Total balance is " + totalbalance + " $");
                    System.out.println("How much money do you want to withdraw? : ");
                    Scanner input4 = new Scanner(System.in);
                    int withdraw = input4.nextInt();
                    if (withdraw <= totalbalance) {
                        System.out.println("Money is preapering now please wait...");
                        totalbalance = totalbalance - withdraw;
                        System.out.println("New balance is " + totalbalance);
                        System.out.println("Have nice day " + username);
                    } else {
                        System.out.println("You can not withdraw this much! ");
                        System.out.print("Please do it again one more time ! :");
                        Scanner input5 = new Scanner(System.in);
                        int try1 = input5.nextInt();
                        if (try1 <= totalbalance) {
                            System.out.println("Please wait Your money is preapering now...");
                            totalbalance = totalbalance - try1;
                            System.out.println("Total balance is " + totalbalance + " Have a nice day " + username);
                        } else {
                            System.out.println("Your credit card is bloced!");
                        }
                    }
                }
                if (press == 3) {
                    System.out.print("How much depoist ypur accout " + username + " : ");
                    Scanner input5 = new Scanner(System.in);
                    int depoist = input5.nextInt();
                    totalbalance = totalbalance + depoist;
                    System.out.println("Total balance is " + totalbalance + " $");
                    System.out.println("Have a nice day MRS." + username + ".");
                }
                if (press == 4) {
                    System.out.println("Okay Have a nice day MRS." + username + ".");
                }
            }
        }
    }
}

