package com.tdd.app;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	
	double[] set1 = new double[]{ 160, 591, 114, 229, 230, 270, 128, 1657, 624, 1503};
	double[] set2 = new double[]{ 15.0, 69.9, 6.5, 22.4, 28.4, 65.9, 19.4, 198.7, 38.8, 138.2};
	App app = new App();
	
	@Test
	  public void set1() {
	    app.calcularMedia(set1);
	    
	  }
	
	@Test 
	public void mediaSet1() {
		double media = app.calcularMedia(set1);
	    assertEquals(550.6, media, 0.1);
	}
	
	@Test 
	public void desviacionSet1() {
		double desviacion = app.calcularDesviacionStd(set1);
		assertEquals(572.03, desviacion, 0.1);
	}
	
	@Test
	  public void set2() {
	    app.calcularMedia(set2);
	    
	  }
	
	@Test 
	public void mediaSet2() {
		double media = app.calcularMedia(set2);
	    assertEquals(60.32, media, 0.1);
	}
	
	@Test 
	public void desviacionSet2() {
		double desviacion = app.calcularDesviacionStd(set2);
		assertEquals(62.26, desviacion, 0.1);
	}
    
}
