package tabuadaapp;

import java.util.Scanner;
public class TabuadaApp {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("TABUADA DE : ");
        int n = sc.nextInt();
        
        System.out.println("-------------- ");
        for(int i=1; i <= 10; i ++){           
            System.out.print(n + " + " + i + " = ");
            System.out.println(n + i);
        }
        
        
        System.out.println("FIM DO PROGRAMA!!!!!!");
    }
    
}
