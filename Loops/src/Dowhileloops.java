import java.util.Scanner;
public class Dowhileloops {
    public static void main(String[] args) {
        System.out.print("Please enter a username : ");
        Scanner input1 = new Scanner(System.in);
        String username = input1.next();
        boolean ispasswordsuccess = false;
        int time = 3;
        do {
            time = time-1;
            System.out.print("Welcome "+username+ " Enter a passsword please : ");
            Scanner input2 = new Scanner(System.in);
            int password = input2.nextInt();
            if (password==123){
                System.out.println("Paswword is correct ! ");
                ispasswordsuccess =true;
            }else{
                if(time>0){
                    System.out.println("Check your Password !");
                    System.out.println("Remain a "+time+ " times !");
                }else{
                    System.out.println("You'were used to 3 times !");
                }

            }
        }while (!ispasswordsuccess & time>0);


    }
}
