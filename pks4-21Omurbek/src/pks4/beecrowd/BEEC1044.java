package pks4.beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class BEEC1044 {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        if ((b % a == 0) || (a % b == 0)){
            System.out.println("Sao Multiplos");
        }
        else{
            System.out.println("Nao sao Multiplos");
        }
    }
}