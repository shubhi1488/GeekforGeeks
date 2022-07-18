//method-1

public class SearchingElement {

	public static void main(String[] args) {
		String str="Shubhi is a computer science student";
		 int firstIndex = str.indexOf('s');
	        System.out.println("First occurrence of char 's'"
	                           + " is found at : "
	                           + firstIndex);
	        int lastIndex=str.lastIndexOf('c');
	        System.out.println("occurrance of char 'c'"+"is found at:"+lastIndex);
	        int firstin=str.indexOf('s', 10);
	        System.out.println("occurrance of char 's'"+"is found at:"+firstin);
	        int lastin=str.lastIndexOf('c', 20);
	        System.out.println("occurrance of char 'c'"+"is found at:"+lastin);
	        int charat=str.charAt(15);
	        System.out.println("element at index is:"+charat);
	        
	        
	}

}
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//method-2
