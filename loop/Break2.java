package loop;

public class Break2 {

    public static void main(String[] args) { //1부터 시작하여 숫자를 계속 누적해서 더하다가 합계가 10보다 큰 처음 값은 얼마인가?
        int sum = 0;
        int i = 1;

        for ( ; ; ) { //for문으로 무한반복
            sum += i;
            i++;
            if (sum > 10) {
                System.out.println(sum);
                break;
            }
        }
    }
}
