package com.sj.test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.sj.CalcService;
import com.sj.MathApplication;



@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTest2 {

	@InjectMocks
	MathApplication mathApp = new MathApplication();
	
	@Mock
	CalcService calc;
	
	
	@Test
	public void testInvokeAdd() {
		
		when(calc.add(10.0, 20.0)).thenReturn(30.0);
		
		org.junit.Assert.assertEquals(mathApp.invokeAdd(10.0, 20.0), 30.0,0);
		//org.junit.Assert.assertEquals(, 30.0,0);
		//Assert.assertEquals(mathApp.invokeAdd(10.0,3.0), 13.0);
		//verify(calc).add(10.0, 20.0);
	}

}
