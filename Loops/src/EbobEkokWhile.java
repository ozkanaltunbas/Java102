import java.util.Scanner;
public class EbobEkokWhile {
    public static void main(String[] args) {
        //EBOB//
        int firstnum,secondnum;
        int i =1;
        int ebob=0;
        System.out.print("Enter a first number : ");
        Scanner input1 = new Scanner(System.in);
        firstnum = input1.nextInt();
        System.out.print("Enter a second number : ");
        secondnum = input1.nextInt();
        if(firstnum<secondnum){
            while(i<=secondnum){
                i++;
                if(firstnum%i==0 &secondnum%i==0){
                    ebob=i;
                }
            }
        }else{
            while(i<=firstnum){
                i++;
                if(firstnum%i==0 &secondnum%i==0){
                    ebob=i;
                }
            }

        }
        System.out.println("Result is: "+ebob);

        //EKOK//
        int num1,num2;
        int x = 0,ekok=0;
        System.out.print("Enter a num1 : ");
        Scanner input2 = new Scanner(System.in);
        num1=input2.nextInt();
        System.out.print("Enter a num2 : ");
        num2=input2.nextInt();
        while(x<=(num1*num2)){
            x++;
            if(num1%x==0 && num2%x==0){
                System.out.println(x);
            }
        }
    }
}
