package com.sivajavatechie.datastructure;

import java.util.Stack;

public class BalancedExpressions {

	public static void main(String[] args) {

		String inputExpression = "{[()]()}";
		System.out.println(isBalancedExpression(inputExpression));

	}

	/**
	 * Algorithm:  We use stack implementation to verify the balanced expression. logic.. open and close brackets should always match in pop.
	 * @param inputExpression
	 * @return
	 */

	// iteration1  charInput --> {  -->stack -- } 
	// iteration2  charInput --> [  -->stack -- ],}
	// iteration1  charInput --> }  -->stack -- ],} -  } not equal to ] --exit
	
	
	public static boolean isBalancedExpression(String inputExpression) {
		if ((inputExpression.length() % 2) == 1) {
			return false;
		} else {
			Stack<Character> s = new Stack<>();
			for (char charInput : inputExpression.toCharArray())
				switch (charInput) {
				case '{':
					s.push('}');
					break;
				case '(':
					s.push(')');
					break;
				case '[':
					s.push(']');
					break;
				default:
					if (s.isEmpty() || charInput != s.peek()) {
						return false;
					}
					s.pop();
				}
			return s.isEmpty();
		}
	}
}
