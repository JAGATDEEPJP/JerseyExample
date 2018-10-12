package com.mkyong.pojo;

public class QuadraticEquation
{
	float a;
	float b;
	float c;
	
	public float getA()
	{
		return a;
	}
	
	public void setA(float a)
	{
		this.a = a;
	}
	
	public float getB()
	{
		return b;
	}
	
	public void setB(float b)
	{
		this.b = b;
	}
	
	public float getC()
	{
		return c;
	}
	
	public void setC(float c)
	{
		this.c = c;
	}
	
	public String toSting()
	{
		return "(" + a + ")x^2 (" + b + ")x (" + c + ") = 0";
	}
}
