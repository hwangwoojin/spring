package helloWorld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);
		Hello hello = ctx.getBean("hello", Hello.class);
		String msg = hello.hello();
		System.out.println(msg);
		ctx.close();
	}
}
