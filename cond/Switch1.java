package cond;

public class Switch1 {
    public static void main(String[] args) {

        int grade = 2, coupon=0;

        /*
        if (grade == 1) {
            coupon = 1000;
        }
        else if (grade == 2) {
            coupon = 2000;
        }
        else if (grade == 3) {
            coupon = 3000;
        }
        else {
            System.out.println("할인 없음");
        }

        System.out.println("발급받은 쿠폰 : " + coupon);
         */

        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            case 2:
                coupon = 2000;
                break;
            case 3:
                coupon = 3000;
                break;
            default:
                System.out.println("할인 없음");
        }
        System.out.println("발급받은 쿠폰 : " + coupon);
    }
}
