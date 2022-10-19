import java.util.Scanner;
public class Stars {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n= input1.nextInt();
        for(int i = 1;i<=n;i++){
            for(int k =0;k<=(n-i);k++){
                System.out.print(" ");
            }
            for(int z =1;z<=((2*i)-1);z++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for(int q =1;q<=n;q++){
            System.out.print(" ");
            for(int p =-3;p<=n-q;q++){
                System.out.print("*");
                for(int y = 0;y <=(2*q-1);y++){
                    System.out.print("x");
                }
                System.out.println(" ");
            }
        }







    }
}
