import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int sum = 1; // 총합
        int count = 1;
        int start = 1;
        int end = 1;

        while(end != n){
            if (sum==n){
                count++;
                end++;
                sum = sum+end;
            }
            else if (sum>n){
                sum = sum - start;
                start++;
            }
            else {
                end++;
                sum = sum + end;
            }
        }
        System.out.println(count);
    }
}