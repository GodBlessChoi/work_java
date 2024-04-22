package cond;

public class CondOp2 {

    public static void main(String[] args) {
        int age = 15;
        String status = (age >= 18) ? "성인" : "미성년자"; //삼항 연산자 : (조건문) ? "(맞을 때)" : "(아닐 때)"
        System.out.println("age = " + age + " status = " + status);
    }
}
