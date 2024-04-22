package operator;

public class Operator1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        int sum = a + b;
        int diff = a - b;
        int multi = a * b;
        int div = a / b;
        int mod = a % b;

        System.out.println("a + b =" + sum); // "String"+ variable 기억
        System.out.println("a - b =" + diff);
        System.out.println("a * b =" + multi);
        System.out.println("a / b =" + div); //결과는 2.5 지만 div 변수가 int 형 이기에 소수점 버림
        System.out.println("a % b =" + mod);
    }
}
