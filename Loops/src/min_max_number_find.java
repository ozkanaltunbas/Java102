import java.util.Scanner;

public class min_max_number_find {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner input1  = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter? ? :");
        int count = input1.nextInt();
        int top = 0;
        int lower = 0;
        int [] list1 = new int[count];
        for(int i = 0; i < count; i++)
        {
            System.out.print("Enter a number : ");
            list1[i] = scan.nextInt();
            if(list1[i] > top) {
                top = list1[i];
            }
            if (list1[i]<lower){
                lower=list1[i];
        }

        }
        System.out.println("Grand number is : "+top);
        System.out.println("Lower number is : "+lower);
    }
}
