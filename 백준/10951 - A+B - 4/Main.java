import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()) {
            //hasNext() 메서드는 Boolean 값을 통해 다음 줄이 없으면 false을 반환하고 EOF의 끝을 알려 줍니다.
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a+b);
        }
    }
}