package utils;

public class ExecuteTimeCalculator implements Calculator {
	
	private Calculator delegate;
	
	public ExecuteTimeCalculator(Calculator delegate) {
		this.delegate = delegate;
	}

	public long factorial(long num) {
		long start = System.nanoTime();
		long result = delegate.factorial(num);
		long end = System.nanoTime();
		String className = delegate.getClass().getSimpleName();
		System.out.printf("%s.factorial(%d) 실행 시간 = %d%n", className, num, (end - start));
		return result;
	}
}
