package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "이름";
        int hour = 15;

        System.out.println(name + "님, 배송이 시작됩니다." + hour + "시에 방문 에정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");

        double score = 90.5;
        char grade = 'A';
        name = "김이름";
        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요? " + pass);

        double d = 3.14123456789;
        float f = 3.14123456789F;
        System.out.println(d);
        System.out.println(f);
        
        long l = 1000000000L;
        l = 1_000_000_000L;
        System.out.println(l);

        /* 정리
        - 정수를 표현하기 위한 자료형
        int: -21억~21억 사이의 값 출력
        long: int보다 큰 값

        - 실수를 표현하기 위한 자료형
        double: 정밀한 소숫점 자리까지 다룰 때 사용
        float: 완벽한 소숫점 자리까지 필요 없을 때 사용

        char: 하나의 문자를 표현
        String: 여러 문자를 표현

        boolean: 참과 거짓을 가짐
         */
    }
}
