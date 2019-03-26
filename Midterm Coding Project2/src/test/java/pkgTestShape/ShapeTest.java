package pkgTestShape;

import static org.junit.Assert.*;
import org.junit.Test;

import pkgShape.Rectangle;
import pkgShape.Cuboid;

import java.util.ArrayList;
import java.util.Collections;

public class ShapeTest {
	
	@Test
	public void RectangleConstructor_Test1() {
		
		Rectangle rec = new Rectangle(5,4);
		
		assertEquals(rec.getLength(),5);
		assertEquals(rec.getWidth(),4);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void RectangleConstructor_Test2() {
		Rectangle rec = new Rectangle(-5,-4);

	}
	@Test
	public void CuboidConstructor_Test1() {
		Cuboid cube = new Cuboid(5,4,3);
		
		assertEquals(cube.getLength(),5);
		assertEquals(cube.getWidth(),4);
		assertEquals(cube.getHeight(),3);
	}
	

	@Test(expected = IllegalArgumentException.class)
	public void CuboidConstructor_Test2() {
		Cuboid cube = new Cuboid(-5,-4,-3);
	}
	
	@Test
	public void RectArea_Test1() {
		Rectangle rec = new Rectangle(5,4);
		
		assertEquals(rec.area(), 20.0, 0);
	}
	@Test
	public void RectPeri_Test1() {
		Rectangle rec = new Rectangle(5,4);
		
		assertEquals(rec.perimeter(), 18.0, 0);
	}
	@Test
	public void CuboidArea_Test1() {
		Cuboid cube = new Cuboid(5,4,3);
		assertEquals(cube.area(), 60.0, 0);
	}
	@Test
	public void CuboidPeri_Test1() {
		Cuboid cube = new Cuboid(5,4,3);
		assertEquals(cube.perimeter(), 48.0, 0);
	}
	


}
