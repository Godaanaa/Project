public class AAA {
	public static void main(String[] args) {
		int a, b, c;
		boolean d;
		Scanner in = new Scanner(System.in);
		System.out.print("전공 학점을 입력하세요: ");
		a = in.nextInt();
		System.out.print("교양 학점을 입력하세요: ");
		b = in.nextInt();
		System.out.print("일반 학점을 입력하세요: ");
		c = in.nextInt();
		d = (a >= 70) && ((b >= 30 && c >= 30) || (b + c >= 80));
		System.out.println(d ? "졸업 가능" : "졸업 불가능");
	}
}
