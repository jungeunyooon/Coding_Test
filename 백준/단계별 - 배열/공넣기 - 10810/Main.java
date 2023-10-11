import java.util.Scanner;

public class Main{
    static public void main(String[] args){
        Scanner in = new Scanner(System.in);

        int index = in.nextInt();
        int[] n = new int[index];
        int m = in.nextInt();

        for (int a=0;a<m;a++){
            int i = in.nextInt();
            int j = in.nextInt();
            int k = in.nextInt();
            for (int x = i;x<=j;x++){
                n[x-1] = k; // 인덱스는 0부터 시작이지만, 바구니와 공의 번호는 1부터 시작한다.
            }
        }
        for (int i = 0; i < index; i++) {
            System.out.print(n[i] + " ");
        }
    }
}