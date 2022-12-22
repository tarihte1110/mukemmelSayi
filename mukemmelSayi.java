import java.util.Scanner;

public class mukemmelSayi {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Bir sayı giriniz:");
        int number= input.nextInt();

        int toplam=0;
        for(int i=1;i<number;i++){

            if(number%i==0){
                toplam+=i;
            }
        }
        if(toplam==number){
            System.out.print(number+" mükemmel sayıdır.");
        }
        else{
            System.out.print(number+" mükemmel sayı değildir.");
        }
    }
}
