package cond;

public class If5 {
    public static void main(String[] args) {
        int price = 10000, age = 10, discount = 0;

        if (price >= 10000) {
            discount += 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        }

        if (age <= 10) {
            discount += 1000;
            System.out.println("10살 이하, 1000원 할인");
        }

        else {
            System.out.println("할인 없음");
        }

        price = price - discount;

        System.out.println("할인된 금액 = " + discount + "원, 총 금액 = " + price);
    }
}
