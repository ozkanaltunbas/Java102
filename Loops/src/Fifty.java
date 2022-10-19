import java.util.Scanner;
public class Fifty {
    public static void main(String[] args) {
       /*
        System.out.print("Welcome please enter a number : ");
        Scanner input1 = new Scanner(System.in);
        int num = input1.nextInt();
        for(int i = 1;i<=num;i=i+1){
            if (i %2==0){
                System.out.println(i);
            }else{
                System.out.println("its not "+i);
            }

        }

        */
        System.out.print("Enter a number : ");
        Scanner input2 = new Scanner(System.in);
        int number = input2.nextInt();
        while (number>0){
            number--;
            if(number%2==0){
                System.out.println(number);
            }
        }







        }







    }

