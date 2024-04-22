package array;

public class Array1Ref4 {

    public static void main(String[] args) {
        int[] students = {90,80,70,60,50,40,30}; //선언과 동시에 써야함, {} 여기에 추가하든 빼든 상관 없이 크기 조정 됌.

        for (int i = 0 ; i < students.length ; i++) {
            System.out.println("학생" + (i+1) + " 점수 : " + students[i]); //(i+1) 괄호 조심
        }
    }
}