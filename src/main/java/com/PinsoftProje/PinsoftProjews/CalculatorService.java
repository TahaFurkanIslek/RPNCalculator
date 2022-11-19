package com.PinsoftProje.PinsoftProjews;

import java.util.HashMap;
import java.util.Stack;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
	public HashMap<String,Integer> calculate(Expression exprs) {
	   String[] values=exprs.getExprs().split("\\s+");
	   Stack<Integer> stack=new Stack<Integer>();
	   for(String value:values){
           try{
        	stack.push(Integer.parseInt(value));               
           }catch (Exception e){
               Integer number2;
               Integer number1;
               switch (value) {
                   case "+":
                       number2 =  stack.pop();
                       number1 =  stack.pop();
                       stack.push(number1+number2);
                       break;
                   case "-":
                	   number2 =  stack.pop();
                	   number1 =  stack.pop();
                       stack.push(number1-number2);
                       break;
                   case "*":
                	   number2 =  stack.pop();
                	   number1 =  stack.pop();
                       stack.push(number1*number2);
                       break;
                   case "/":
                	   number2 =  stack.pop();
                	   number1 =  stack.pop();
                       stack.push(number1/number2);
                       break;
               }
           }
	   }
	   HashMap<String,Integer> response = new HashMap<>();
       response.put("result",stack.pop());
       return response;
	
	}	
}	
				
			
		
	
