package scanner;

import java.util.Scanner;

public class ScannerWhile3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("0을 입력하면 덧셈 결과를 보여드립니다");
        int sum = 0;
        while (true) {
            System.out.print("숫자를 입력하시오 : ");
            int num = scanner.nextInt();

            sum += num;

            if (num == 0) {
                System.out.print("덧셈 결과 : " + sum);
                break;
            }
        }
    }
}
