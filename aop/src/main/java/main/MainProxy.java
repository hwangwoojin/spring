package main;

import utils.ExecuteTimeCalculator;
import utils.LoopCalculatorImpl;
import utils.RecursionCalculatorImpl;

public class MainProxy {
	public static void main(String[] args) {
		LoopCalculatorImpl loop = new LoopCalculatorImpl();
		ExecuteTimeCalculator calculator = new ExecuteTimeCalculator(loop);
		calculator.factorial(20);
		
		RecursionCalculatorImpl recursion = new RecursionCalculatorImpl();
		ExecuteTimeCalculator calculator2 = new ExecuteTimeCalculator(recursion);
		calculator2.factorial(20);
	}
}
