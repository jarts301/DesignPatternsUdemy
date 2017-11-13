package com.jarts.dp.creational.AbstractFactory;

public class ColorFactory extends AbstractFactory{

	@Override
	public Shape getShape(String shape) {
		return null;
	}
	
	@Override
	public Color getColor(String color) {
		switch (color) {
		case "RED":
			return new Red();
		case "GREEN":
			return new Green();
		case "BLUE":
			return new Blue();
		default:
			return null;
		}
	}


}
