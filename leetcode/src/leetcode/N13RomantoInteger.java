package leetcode;

public class N13RomantoInteger {
	public static int RomantoInteger(String x){
		int i=0;
		int output=0;
		System.out.println(x.length());
		
		for(i=0;i<x.length();i++){
			
			switch(x.charAt(i)){
				case 'M':
					output+=1000;
					break;
				case 'D':
					output+=500;break;
				case 'C':
					
					if(i<x.length()-1&&(x.charAt(i+1)=='D'||x.charAt(i+1)=='M')){
						output-=100;
						}	
					else{
						output+=100;}break;
				case 'L':
					
							output+=50;break;
				case 'X':
					
					if(i<x.length()-1&&(x.charAt(i+1)=='L'||x.charAt(i+1)=='C')){
						output-=10;
					}
					else{
						output+=10;}break;
				case 'V':
						output+=5;break;
				case 'I':
					
						if(i<x.length()-1&&(x.charAt(i+1)=='V'||x.charAt(i+1)=='X')){	
							output-=1;
							}
						else{
						output+=1;
						}
					
					break;
				}
			}
		
		
		
		return output;
		}
	public static void main (String[] args){
		String a="LVIII";
		int input=RomantoInteger(a);
		System.out.println(input);
		
	}
}
