package model;
import java.lang.Math;

public class Rectangle{

//Attributes	
	
	private double base;
	private double height;
	
//Constructor
	
	public Rectangle(double a, double b){
		
		base = a;
		height = b;
	}
	
//Gets
	
	public double getBase(){
		
		return base;
	}
	
	public double getHeight(){
		
		return height;
	}
	
//Sets
    
    public void setBase(double base){
		
		this.base = base;
	}
	
	public void setHeight(double height){
		
		this.height = height;
	}
	
//Methods

	public calculateArea(){
		
		double area = base * height;
		
		return area;
	}
	
	public calculatePerimeter(){
		
	double perimeter = (area * 2 + height * 2);
	
		return perimeter;
	}
	
	public calculateDiagonalLenght(){
		
		double diagonal = sqrt(base * base + altura * altura);
	}
}