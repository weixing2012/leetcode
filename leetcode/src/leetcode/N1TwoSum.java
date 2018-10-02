package leetcode;

public class N1TwoSum {
	public static void main(String[] args){
		int[] s = {1,2,3,4,5};
		int target=5;
		int[] result=new int[2];
		result=twoSum(s,target);
		System.out.print(result[0]);
		System.out.print(result[1]);
		
		
	}


	
	public static  int[] twoSum(int[] nums, int target){
		
	
		int[]index = {2,2};
		for(int i=0;i<nums.length;i++){
			for(int a=1;a<nums.length;a++){
				
				if((nums[i]+nums[a])==target){
					
					index[0]=i;
					index[1]=a;
					
					
				}
					
			}			
		}
		
		return index;
	
}
}
