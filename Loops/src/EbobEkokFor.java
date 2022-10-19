import java.util.Scanner;
public class EbobEkokFor {
    public static void main(String[] args) {
        ///EBOB///
        int ebob = 0;
         Scanner input = new Scanner(System.in);
        System.out.print("Enter a first number : ");
         int firstnum = input.nextInt();
        System.out.print("Enter a second number : ");
        int secondnum = input.nextInt();
        if(firstnum<secondnum){
            for(int i = 1;i<=secondnum;i++){
                if(firstnum%i==0 &&(secondnum%i)==0){
                    ebob=i;
                }
            }
        }else{
            for(int i = 1;i<=firstnum;i++){
                if(firstnum%i==0 &&(secondnum%i)==0){
                    ebob=i;
                }
            }
        }
        System.out.println(ebob);

        ////EKOK///
        int num1,num2;
        int ekok =0;
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter a num1 : ");
        num1 = input2.nextInt();
        System.out.print("Enter a num2 : ");
        num2 = input2.nextInt();
        for(int i = 1;i<=(num1*num2);i++){
            if(num1 %i==0 && num2%i==0){
                ekok=i;
                System.out.println("EKOK RESULT : "+ekok);

            }
        }









    }



}

