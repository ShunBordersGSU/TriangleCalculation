import static org.junit.Assert.*;

import org.junit.Test;


public class TriangleTest {

	@Test
	public void testCalculateEquilateralOne() {
		Triangle test = new Triangle();
		assertEquals("Equilateral Tri With Area: 1.73",test.calculate(2,2,2));
	}

	@Test
	public void testCalculateEquilateralTwo() {
		Triangle test = new Triangle();
		assertEquals("Equilateral Tri With Area: 35.07",test.calculate(9,9,9));
	}

	@Test
	public void testCalculateEquilateralThree() {
		Triangle test = new Triangle();
		assertEquals("Equilateral Tri With Area: 4,330.13",test.calculate(100,100,100));
	}

	@Test
	public void testCalculateScaleneOne() {
		Triangle test = new Triangle();
		assertEquals("Scalene Tri With Area: 14.7",test.calculate(5,6,7));
	}

	@Test
	public void testCalculateScaleneTwo() {
		Triangle test = new Triangle();
		assertEquals("Scalene Tri With Area: 96.56",test.calculate(14,15,16));
	}

	@Test
	public void testCalculateScaleneThree() {
		Triangle test = new Triangle();
		assertEquals("Scalene Tri With Area: 4,416.3",test.calculate(100,101,102));
	}

	@Test
	public void testCalculateIsoscelesOne() {
		Triangle test = new Triangle();
		assertEquals("Isosceles Tri With Area: 16.35",test.calculate(5,7,7));
	}

	@Test
	public void testCalculateIsoscelesTwo() {
		Triangle test = new Triangle();
		assertEquals("Isosceles Tri With Area: 123.64",test.calculate(19,19,14));
	}

	@Test
	public void testCalculateIsoscelesThree() {
		Triangle test = new Triangle();
		assertEquals("Isosceles Tri With Area: 4,960.78",test.calculate(100,100,150));
	}

	@Test
	public void testCalculateNegativeSide() {
		Triangle test = new Triangle();
		assertEquals("Not a Valid Triangle",test.calculate(5,7,-7));
	}

	@Test
	public void testCalculateZeroSide() {
		Triangle test = new Triangle();
		assertEquals("Not a Valid Triangle",test.calculate(5,7,0));
	}

	@Test
	public void testCalculateNotValidSidesOne() {
		Triangle test = new Triangle();
		assertEquals("Not a Valid Triangle",test.calculate(1,2,3));
	}

	@Test
	public void testCalculateNotValidSidesTwo() {
		Triangle test = new Triangle();
		assertEquals("Not a Valid Triangle",test.calculate(6,7,13));
	}

	@Test
	public void testCalculateNotValidSidesThree() {
		Triangle test = new Triangle();
		assertEquals("Not a Valid Triangle",test.calculate(95,5,100));
	}

	@Test
	public void testCalculateSumTwoLessThirdOne() {
		Triangle test = new Triangle();
		assertEquals("Not a Valid Triangle",test.calculate(5,6,12));
	}

	@Test
	public void testCalculateSumTwoLessThirdTwo() {
		Triangle test = new Triangle();
		assertEquals("Not a Valid Triangle",test.calculate(30,5,45));
	}

	@Test
	public void testCalculateSumTwoLessThirdThird() {
		Triangle test = new Triangle();
		assertEquals("Not a Valid Triangle",test.calculate(5,90,150));
	}

	@Test
	public void testCalculateNotEnoughnput() {
		Triangle test = new Triangle();
		assertEquals("Not a Valid Triangle",test.calculate(0,0,3));
	}

	@Test
	public void testAllThreeZero() {
		Triangle test = new Triangle();
		assertEquals("Not a Valid Triangle",test.calculate(0,0,0));
	}


}
