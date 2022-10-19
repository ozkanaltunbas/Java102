import java.util.Scanner;
public class KuvvetFour_five {
    public static void main(String[] args) {
        System.out.print("Enter a Limit number : ");
        Scanner input1 = new Scanner(System.in);
        int number = input1.nextInt();
        for (int i =1;i<number;i=i*4){
            System.out.println("Just for 4 numbers "+i);
        }
        for (int i =1;i<number;i=i*5){
            System.out.println("Just for 5 numbers "+i);
        }
    }
}
