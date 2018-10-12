package com.mkyong;

public class FindQuadraticRoots
{
	String root1, root2;

	public FindQuadraticRoots(double a, double b, double c)
	{
		double r1, r2;
		double determinant = b * b - 4 * a * c;

		// condition for real and different roots
		if (determinant > 0)
		{
			r1 = (-b + Math.sqrt(determinant)) / (2 * a);
			r2 = (-b - Math.sqrt(determinant)) / (2 * a);
			root1 = String.format("%.2f", r1);
			root2 = String.format("%.2f", r2);
			System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
		}
		// Condition for real and equal roots
		else if (determinant == 0)
		{
			r1 = r2 = -b / (2 * a);
			root1 = String.format("%.2f", r1);
			root2 = String.format("%.2f", r1);
			System.out.format("root1 = root2 = %.2f;", root1);
		}
		// If roots are not real
		else
		{
			double realPart = -b / (2 * a);
			double imaginaryPart = Math.sqrt(-determinant) / (2 * a);
			root1 = String.format("%.2f", realPart) + " + " + String.format("%.2f", imaginaryPart) +"i";
			root2 = String.format("%.2f", realPart) + " - " + String.format("%.2f", imaginaryPart) +"i";

			System.out.format("root1 = %.2f+%.2fi and root2 = %.2f-%.2fi", realPart, imaginaryPart, realPart,
					imaginaryPart);
		}
	}
}
