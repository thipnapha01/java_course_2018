package com.example.demo;

public class FizzBuzz {

	public String say(int input) {
	    //1
		/*if(input == 15){
			return "FizzBuzz";
		}
		if(input%3 == 0){
			return "Fizz";
		}
		if(input%5 == 0){
			return "Buzz";
		}*/
	    //2
	    /*if(input == 15){
            return "FizzBuzz";
        }
		for (int i = 0; i <= input; i+=3) {
		    if(i == input){
	            return "Fizz";
	        }
        }
		for (int i = 0; i <= input; i+=5) {
            if(i == input){
                return "Buzz";
            }
        }*/
		 
	    //3
	    int[] num = {15,3,5};
	    String[] result = {"FizzBuzz","Fizz","Buzz"};
	    for (int i = 0; i < num.length; i++) {
            if(input%num[i]==0){
              return result[i];  
            }
        } 
		return String.valueOf(input);
	}

}
