import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        int total=0;
        System.out.print("Enter a number : ");
        Scanner input1 = new Scanner(System.in);
        int number = input1.nextInt();
        for(int i =1;i<number;i++){
            if(number%i==0){
                total+=i;
            }

        }
        if(total==number){
            System.out.println("Its a perfect number : "+number);
        }else {
            System.out.println("Its a not perfect number: "+number);
        }
    }
}
