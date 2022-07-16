/*
Reverse the string.
Example-
Geek for geeks
output-
skeeg rof keeg
*/
import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
		String str=s.nextLine();
		s.close();
		StringBuilder sb=new StringBuilder();
		sb.append(str);
		sb.reverse();
		System.out.println("reversed string is:");
		System.out.println(sb);

	}

}
