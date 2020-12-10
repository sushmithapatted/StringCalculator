package com.main.Calculator;

public class MainStringCalculator {

	public static int emptyString(String num) {
		if(num.isEmpty()) {
		 return 0;
		}
		else if(num.contains(",")){
			int sum=0;
			String[] nums=num.split(",");
			sum=Integer.parseInt(nums[0])+Integer.parseInt(nums[1]);
			return sum;
		}
		else {
			return Integer.parseInt(num);
		}
			
	}

	

}
