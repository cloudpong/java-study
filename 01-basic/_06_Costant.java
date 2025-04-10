package chap_01;

public class _06_Costant {
    public static void main(String[] args) {
        final String KR_COUNTRY_CODE = "+82";
        // KR_COUNTRY_CODE = "+8282";
        System.out.println(KR_COUNTRY_CODE);

        final double PI = 3.141592;
        final String  DATE_OF_BIRTH = "2001-12-31";

        /* 절대 변하지 않는 상수는 대문자로
        `final` : 절대 변하지 않는 문장 앞에 포함
         
        대문자로 적는 예시
        `final String CODE = “KR”`
        `final double PI = 3.141592;`
        `final String  DATE_OF_BIRTH = "2001-12-31";` */
    }
}
