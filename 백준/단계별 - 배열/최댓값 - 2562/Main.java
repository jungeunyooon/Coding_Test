import java.util.Scanner;

public class Main {
    static public void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = 9;
        int v[] = new int[n];
        int max = 0;
        int maxIndex = -1;

        for (int i=0;i<n;i++){
            v[i] = in.nextInt();
            if (v[i]>max){
                max = v[i];
                maxIndex = i;
            }
        }
        in.close();
        System.out.println(max);
        System.out.println(maxIndex+1);
    }
}