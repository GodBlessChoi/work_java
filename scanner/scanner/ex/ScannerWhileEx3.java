package scanner.scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0, count = 0;

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요 : ");
        while (true) {
            int i = input.nextInt();

            if (i == -1) {
                break;
            }

            sum += i;
            count++;

        }

        System.out.println("입력한 숫자들의 합계 : " + sum);
        System.out.println("입력한 숫자들의 평균 : " + (double)sum/count); //명시적 형변환 중요
    }
}
