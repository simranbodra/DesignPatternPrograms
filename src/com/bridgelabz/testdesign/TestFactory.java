package com.bridgelabz.testdesign;

import com.bridgelabz.factorydesignpattern.factory.ComputerFactory;
import com.bridgelabz.factorydesignpattern.model.Computer;

public class TestFactory {

	public static void main(String[] args) {
		
		Computer pc = ComputerFactory.getComputer("pc","2 GB","500 GB","2.4 GHz");
		Computer server = ComputerFactory.getComputer("server","16 GB","1 TB","2.9 GHz");
		Computer laptop = ComputerFactory.getComputer("laptop","4 GB","1 TB","2.4 GHz");
		System.out.println("Factory PC Config::"+pc);
		System.out.println("Factory Server Config::"+server);
		System.out.println("Factory Laptop Config::"+laptop);
		
	}

}
