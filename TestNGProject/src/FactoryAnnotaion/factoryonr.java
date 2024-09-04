package FactoryAnnotaion;

import org.testng.annotations.Factory;

public class factoryonr {

	@Factory
	public Object[] factoryGeneration() {
		Object[] obj = {new simple(),
		         		new simple(),	
		         		new simple(),
		         		new simple(),
		         		new demo(),
		         		new demo(),
		         		new demo()};
		return obj;
	}
}
