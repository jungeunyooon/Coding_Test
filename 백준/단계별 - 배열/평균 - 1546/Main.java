import java.util.Scanner;

public class Main{
    static public void main(String[] args){
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        double[] a = new double[num];
        double max = a[0];
        double sum = 0.0;
        double avg = 0.0;

        for (int i=0;i<num;i++){
            a[i] = in.nextDouble();
            if(a[i]>max){
                max = a[i];
            }
        }
        for (int i = 0; i < num; i++) {
            a[i] = a[i] * 100 / max;
            sum += a[i];
        }
        avg = sum /num;
        System.out.println(avg);
    }
}