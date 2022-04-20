package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import client.Client;
import config.AppContext;

public class Main {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);
		
		Client client = new Client();
		client.trace();
		
		ctx.close();
	}
}
