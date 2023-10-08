import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner en = new Scanner(System.in);
        int N = en.nextInt();

        en.close();

        for (int i=1;i<10;i++){
            System.out.println(N + " * " + i + " = " + (i*N));
        }
    }
}