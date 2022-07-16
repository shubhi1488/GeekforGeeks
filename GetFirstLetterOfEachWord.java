/*
Program to get the first letter of each word in java
Example-
Geek for Geeks
output-
GfG
*/
import java.util.Scanner;

public class FirstWord {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter name");
		String x=s.nextLine();
		s.close();
		String[] name=x.split(" ");
		for(int i=0;i<name.length;i++) {
			String str=name[i];
			System.out.print(str.charAt(0));
		}

	}

}
