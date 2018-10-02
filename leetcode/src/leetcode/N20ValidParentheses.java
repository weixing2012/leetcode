package leetcode;

public class N20ValidParentheses {
	public static boolean isValid(String s) {
        int p1L=0;
        int p2L=0;
        int p3L=0;
        int i;
        boolean output=false;
        for(i=0;i<s.length();i++){
        	if(s.charAt(i)=='('&&p1L>=0){
        		p1L++;
        	}
        	else if(p1L<0){
        		output=false;
        		break;
        	}
        	if(s.charAt(i)=='['&&p2L>=0){
        		p2L++;
        	}
        	else if(p2L<0){
        		output=false;
        		break;
        	}
        	if(s.charAt(i)=='{'&&p3L>=0){
        		p3L++;
        	}
        	else if(p3L<0){
        		output=false;
        		break;
        	}
        
        	if(s.charAt(i)==')'&&p1L>=0){
        		p1L--;
        	}
        	else if(p1L<0){
        		output=false;
        		break;
        	}
        	if(s.charAt(i)==']'){
        		p2L--;
        	}
        	else if(p2L<0){
        		output=false;
        		break;
        	}
        	if(s.charAt(i)=='}'){
        		p3L--;	
        	}
        
        	else if(p3L<0){
    		output=false;
    		break;
        	}
    	}
        if(p1L==0&&p2L==0&&p3L==0){
        	output=true;
		}
		return output;
    }
	public static void main(String[] args){
		String s="([)]";
		boolean output=isValid(s);
		System.out.print(output);
	}
}
