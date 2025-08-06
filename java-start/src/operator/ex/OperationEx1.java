package operator.ex;

public class OperationEx1 {
    public static void main(String[] args) {
        /*
            3개의 변수를 선언하시고, 각각의 변수 10, 20, 30 할당
           각각의 변수의 합과 평균을 계산하셔서 결과값을 콘솔창에 출력!!
           평균값의 경우, 소수점 이하의 결과는 버림하세요!!!
        */
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        int sum = num1 + num2 + num3;
        int avg = sum / 3;

        System.out.println(sum);
        System.out.println(avg);
    }
}
