//program to reverse the words of string in java .
/*
Example-1
Original String: Geek for Geeks
Reversed String: Geeks for Geek
*/
import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter original string");
		String original=s.nextLine();
		System.out.println("original string is:"+original);
		s.close();
		String word[]=original.split("\\s");
		String reverse="";
		for(int i=0;i<word.length;i++) {
			if(i==word.length-1) {
				reverse=word[i]+reverse;
			}
			else {
				reverse=" "+word[i]+reverse;
			}
		}
		System.out.print("reversed string is:"+reverse);
		

	}

}
