import java.util.Scanner;

public class ValleyCounter {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String hiker = new String();
        hiker = sc.nextLine();
        int SeaLevel = 0;
        int valley = 0;

        for (int i = 0; i < hiker.length(); i++) {
        int SeaLevelPrecedent = SeaLevel;
            char directie = hiker.charAt(i);
            if (directie == 'D') {
                SeaLevel--;
            } else {
                SeaLevel++;
            }
            if(SeaLevelPrecedent == -1 && SeaLevel == 0){
                valley++;
            }
        }

        System.out.println(valley);
    }
}
