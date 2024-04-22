package scanner.scanner.ex;

import java.util.Scanner;

public class ScannerEx4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("하나의 정수를 입력하시오 : ");
        int num = scanner.nextInt();

        System.out.println(num + "단의 구구단 :");

        for (int i = 1 ;  i <= 9 ; i++) {
            System.out.println(num + " * " + i + " = " + num*i);
        }
    }
}
