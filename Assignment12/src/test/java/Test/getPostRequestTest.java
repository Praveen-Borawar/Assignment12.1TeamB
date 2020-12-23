package Test;


import org.testng.annotations.Test;

import Base.initializeBase;




public class getPostRequestTest {

	@Test
	public void test1() {
		initializeBase.getMethod();
		
	}

	@Test
	public void test2() {
		initializeBase.getQueryMethod();
	}

	@Test
	public void test3() {

		initializeBase.postMethod();		
	}
	
}
