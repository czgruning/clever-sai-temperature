import java.util.Scanner;

public class Helloworld {
	/*
	 * public static int getResult(String str) { int len = str.length(); while (str
	 * != str.replaceAll("01", "") || str != str.replaceAll("10", "")) {
	 * 
	 * } return len - str.length(); }
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// char[] ch = new char[n];
		String str = sc.nextLine();

		// for(int i =0;i<n;i++){
		// ch[i] = sc.nextCharecter();
		// }
		// String str = new String(ch);
		System.out.println(getResult(str));
		sc.close();
	}
}