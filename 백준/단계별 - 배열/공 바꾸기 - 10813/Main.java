import java.util.Scanner;

public class Main{
    static public void main(String[] args){
        Scanner in = new Scanner(System.in);

        int index = in.nextInt();
        int m = in.nextInt();
        int[] n = new int[index];
        for (int i=0;i<index;i++){
            n[i]=i+1;
        }

        for (int x=0;x<m;x++){
            int i = in.nextInt()-1;
            int j = in.nextInt()-1;
            int temp = n[i];
            n[i] = n[j];
            n[j] = temp;
        }

        for (int i = 0; i < index; i++) {
            System.out.print(n[i] + " ");
        }
    }
}