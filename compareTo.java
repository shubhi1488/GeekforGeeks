//compare two strings lexicographically.
/*
case-1: if string1>string2 then it will return positive number.
case-2: if string1==string2 then it will return 0.
case-3: if string1<string2 then it will return negative number.
example-
string 1=ram
string 2=shyam
string1 is less than string 2 then it will return -1
*/
//#code-----------------------------------------------------------
public class CompareStrings {

	public static void main(String[] args) {
		String s1="Ram";
		String s2="Shyam";
		String s3="Ram";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		

	}

}
