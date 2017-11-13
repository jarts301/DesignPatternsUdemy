package com.jarts.dp.creational.AbstractFactory;

public class ShapeFactory extends AbstractFactory{

	@Override
	public Shape getShape(String shape) {
		switch (shape) {
		case "CIRCLE":
			return new Circle();
		case "RECTANGLE":
			return new Rectangle();
		case "SQUARE":
			return new Square();
		default:
			return null;
		}
	}
	
	@Override
	public Color getColor(String color) {
		return null;
	}


}
