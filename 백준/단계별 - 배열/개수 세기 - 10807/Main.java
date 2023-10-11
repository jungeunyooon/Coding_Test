import java.util.Scanner;

public class Main{
    static public void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] v = new int[n];
        int count = 0;
        for (int i=0;i<n;i++){
            v[i] = in.nextInt();
        }

        int a = in.nextInt();
        in.close();

        for (int i=0;i<n;i++){
            if ( v[i]== a ){
                count += 1;
            }
        }
        System.out.println(count);

    }
}