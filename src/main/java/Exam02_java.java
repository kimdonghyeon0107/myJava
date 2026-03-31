import java.util.Scanner;

public class Exam02_java {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력하세요:");
        int num = sc.nextInt();

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("3과 5의 배수 둘다 만족합니다");
        } else if (num % 3 == 0) {
            System.out.println("3의 배수입니다.");
        } else if (num % 5 == 0) {
            System.out.println("5의 배수입니다");
        } else {
            System.out.println("해당 없음");
        }
        sc.close();
    }
}
