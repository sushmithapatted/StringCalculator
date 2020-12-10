package com.main.Calculator;

public class MainStringCalculator {

	public static int emptyString(String num) {
		if(num.isEmpty()) {
		 return 0;
		}
		else if(num.contains(",")){
			if(num.contains("\n")) {
				num=num.replace("\n", ",");
			}
			
			int sum=0;
			String[] nums=num.split(",");
			for(int i=0;i<nums.length;i++) {
				sum=sum+Integer.parseInt(nums[i]);
			}
			
			return sum;
		}
		else {
			return Integer.parseInt(num);
		}
			
	}

	

}
