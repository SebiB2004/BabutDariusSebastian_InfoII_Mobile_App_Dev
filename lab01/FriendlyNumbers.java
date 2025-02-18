import java.util.Scanner;


public class FriendlyNumbers {

    public static void main(String []args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Introdu primul numar:");
        int a = scn.nextInt();
        System.out.println("Introdu al doilea numar:");
        int b = scn.nextInt();
        if(sumDiv(a) == b && sumDiv(b) == a){
            System.out.println("True");
        } else {
            System.out.println("False");
        }


    }
    public static int sumDiv(int n){
        int s = 0;
        for(int i = 1; i < n; i++){
            if(n % i == 0){
                s+=i;
            }
        }
        return s;

    }
}
