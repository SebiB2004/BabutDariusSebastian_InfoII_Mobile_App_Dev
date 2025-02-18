import java.util.Scanner;

public class CuvantSort {
    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);
        String cuvant = scn.nextLine();
        StringBuilder cuvantSortat = new StringBuilder();
        for(int i = 0; i < cuvant.length(); i++){
            if(Character.isLowerCase(cuvant.charAt(i))){
                cuvantSortat.append(cuvant.charAt(i));
            }
        }
        for(int i = 0; i < cuvant.length(); i++){
            if(Character.isUpperCase(cuvant.charAt(i))){
                cuvantSortat.append(cuvant.charAt(i));
            }
        }
        System.out.println("Cuvantul sortat este: " + cuvantSortat);
    }
}