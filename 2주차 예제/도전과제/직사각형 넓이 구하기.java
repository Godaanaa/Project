package asdfasdf;

import java.util.Scanner;

public class adddfss {

	public static void main(String[] args) {
		double w, h, area;
		Scanner in = new Scanner(System.in);
		System.out.print("직사각형의 가로 길이를 입력하세요 : ");
		w = in.nextDouble();
		System.out.print("직사각형의 세로 길이를 입력하세요 : ");
		h = in.nextDouble();
		System.out.printf("직사각형의 넓이는 %f입니다.\n", w * h);
	}

}
