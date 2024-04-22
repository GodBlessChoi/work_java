package casting;

public class Casting1 {

    public static void main(String[] args) { // 작은 걸 큰 거에 넣는 건 아무 문제 없음(묵시적 형변환)
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue; // int -> long
        System.out.println("longValue = " + longValue);
        
        doubleValue = intValue; // int -> double
        System.out.println("doubleValue = " + doubleValue);

        doubleValue = 20L; // long -> double
        System.out.println("doubleValue2 = " + doubleValue);
    }
}
