	package Arrayprogramms;

public class ReverseaString {

	public static void main(String[] args) {
		
		//Approach-1 length(), charAt()
		
		String s ="welcome";
		String rev ="";
		for(int i=s.length()-1; i>=0; i--) {	
			
			rev=rev+s.charAt(i);	 
		}
		System.out.println("Reverse of a string:"+rev);
		
		//Approach-2 without using string methods and by converting string to char array type
		
		String s1 ="Hyderabad";
		String rev1 ="";
		
		char a[]= s1.toCharArray();
// toCharArray() will convert string into Char Array
		for(int i=a.length-1;i>=0;i--) {
			rev1=rev1+a[i];
		}
		System.out.println("Reverese a String:"+rev1);
		
		//Approach-3 using StringBuffer Class
		StringBuffer sbf = new StringBuffer("Bangalore");
		System.out.println("Reverse of string:"+sbf.reverse());
		
		// Approach-4 using StringBuilder class
		
		StringBuilder sb= new StringBuilder("Dubai");
		System.out.println("Reverse of String:"+ sb.reverse());
			
			
	}
	
	
     
}
