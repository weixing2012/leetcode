package leetcode;

public class N9PalindromeNumber {
	public static void main(String[] args){
		int a=13231;
		boolean n=isPalindrome(a);
		System.out.println(n);
		
	}
	 public static boolean isPalindrome(int x) {
	        boolean r=true;
	        String input=Integer.toString(x);
	       
	        for(int i=0;i<input.length()/2;i++){
	        	if(input.charAt(i)!=input.charAt(input.length()-1-i)){
	        		
	        		r=false;
	        		break;
	        	}
	
	        }
	       
	        	return r;
	        
	    }
}
