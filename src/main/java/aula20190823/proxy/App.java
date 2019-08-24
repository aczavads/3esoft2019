package aula20190823.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class App {

	public static void main(String[] args) {
		
		CoisaQueVoa treco;
		
		treco = (CoisaQueVoa) Proxy.newProxyInstance(
				App.class.getClassLoader(), 
				new Class[] {CoisaQueVoa.class}, 
			new InvocationHandler() {
			
			@Override
			public Object invoke(Object arg0, Method m, Object[] arg2) throws Throwable {
				if (m.getName().equalsIgnoreCase("voar")) {					
					System.out.println("Rapaz.. vooou!");
				}
				return null;
			}
		});
		
		treco.voar();
		treco.toString();
		
	}

}
