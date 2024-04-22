package cond;

public class Switch2 {
    public static void main(String[] args) {

        int grade = 2;

        int coupon = 0;

        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            case 2: //break 없을 때 : grade = 2 여도 case 3으로 넘어가서 3000 저장
            case 3:
                coupon = 3000;
                break;
            default:
                System.out.println("할인 없음");
        }
        System.out.println("발급받은 쿠폰 : " + coupon);
    }
}
