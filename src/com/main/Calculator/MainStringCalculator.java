package com.main.Calculator;

import Utils.Constants;

public class MainStringCalculator {

	public static int emptyString(String num) throws Exception{
		if(num.contains("-")) {
		int indexOfNeg=num.indexOf(num, 0);
		if(Character.isDigit(num.charAt(indexOfNeg+1))) {
			throw new Exception(Constants.NEGATIVE_EXCEP_MSG);
		}
		}
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
		else if(!num.contains(",")&&num.length()>2){
			int sum=0;
			String num1="0,";
			for(int i=0;i<num.length();i++) {
				if(Character.isDigit(num.charAt(i))) {
					num1=num1+num.charAt(i)+",";
				}
			}
			String[] nums=num1.split(",");
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
