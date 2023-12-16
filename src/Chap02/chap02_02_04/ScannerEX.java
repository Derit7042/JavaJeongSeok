package Chap02.chap02_02_04;

import java.util.Scanner;

public class ScannerEX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //String input1 = scanner.nextLine();
        //int num1 = Integer.parseInt(input1);
        //int num2 = scanner.nextInt();

        System.out.print("두자리 정수를 하나 입력해주세요.: ");
        String input2 = scanner.nextLine();
        int num3 = Integer.parseInt(input2); // 입력받은 문자열을 숫자로 변환

        System.out.println("입력내용: " + input2);
        System.out.printf("num=%d%n", num3);
    }
}
