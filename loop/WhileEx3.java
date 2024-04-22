package loop;

public class WhileEx3 {

    public static void main(String[] args) {
        int max = 3, i = 1, sum = 0;
        while (i <= max) { // 부등호 방향 생각!
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }
}
