package com.bridgelabz.factorydesignpattern.factory;

import com.bridgelabz.factorydesignpattern.model.Computer;
import com.bridgelabz.factorydesignpattern.model.Laptop;
import com.bridgelabz.factorydesignpattern.model.PC;
import com.bridgelabz.factorydesignpattern.model.Server;

public class ComputerFactory {

	public static Computer getComputer(String type, String ram, String hdd, String cpu){
		if("PC".equalsIgnoreCase(type)) 
			return new PC(ram, hdd, cpu);
		else if("Server".equalsIgnoreCase(type)) 
			 return new Server(ram, hdd, cpu);
		else if("Laptop".equalsIgnoreCase(type))
			return new Laptop(ram, hdd, cpu);
		
		return null;
	}
}
