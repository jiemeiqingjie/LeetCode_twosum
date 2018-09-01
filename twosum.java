package test;

import java.util.ArrayList;
import java.util.Arrays;

public class string {
	 
	//System.out.println(t);
	
	public static void main(String[] args) {
		int[] data = {2,5,5,6};
		int[] test = new string().twoSum(data,10);
		System.out.println(Arrays.toString(test));	 
	}
	
	 public int[] twoSum(int[] nums, int target) {
		 
	     int[] result ={0,0};
	     ArrayList list = new ArrayList();
	     	     
	     for(int i=0;i<nums.length;i++){
	    	 list.add(nums[i]);	    	
	     }
	
	     for(int i=nums.length-1;i>0;i--){
	    	 int cha = target - nums[i];
	    	 if(list.contains(cha) && list.indexOf(cha)!=i){
	    		 System.out.println(list.indexOf(cha));
	    		 result[0]=list.indexOf(cha);
	    		 result[1]=i;
	    		 break;
	    	 }
	     }    

	         return result;
	    }
}
