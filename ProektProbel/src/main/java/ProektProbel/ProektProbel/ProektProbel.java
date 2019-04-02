package ProektProbell.ProektProbel;

import java.util.Scanner;

public class ProektProbel {
 
    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        System.out.print("Input string: ");
        String stroka = in.nextLine();
        int p=0;
        for(char i : stroka.toCharArray()){
            if(i == ' ') p++;
        }
        System.out.printf("Kolichestvo probelov: %d", p);
        in.close();
    }   
}
