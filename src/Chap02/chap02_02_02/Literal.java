package Chap02.chap02_02_02;

public class Literal {
    public static void main(String[] args) {
        int year = 2014;
        final int MAX_VALUE = 100;
        // year 은 변수, MAX_VALUE 는 상수, 2014, 100은 리터럴

        int triangleArea = (20 * 10) / 2; // 삼각형의 면적을 구하는 공식
        int rectangleArea = (20 * 10); // 사각형의 면적을 구하는 공식

        final int WIDTH = 20; // 폭
        final int HEIGHT = 10; // 높이

        triangleArea = (WIDTH * HEIGHT) / 2; // 삼각형의 면적을 구하는 공식
        rectangleArea = (WIDTH * HEIGHT); // 사각형의 면적을 구하는 공식

        // 상수는 리터럴에 '의미있는 이름'을 붙여서 코드의 이해와 수정을 쉽게 만든다.
    }
}
