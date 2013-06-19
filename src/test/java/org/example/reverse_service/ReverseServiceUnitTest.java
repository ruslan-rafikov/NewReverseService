package org.example.reverse_service;

import org.example.reverse_service.definitions.ReverseService;
import org.example.reverse_service.impl.ReverseServiceImpl;
import static org.hamcrest.CoreMatchers.*;

import static org.junit.Assert.*;
import org.junit.Test;

public class ReverseServiceUnitTest {
	
	private ReverseService service = new ReverseServiceImpl(); 
	
	private static ObjectFactory objectFactory = new ObjectFactory();
	
	@Test
	public void testReverseString() {
		ReverseStringRequest request = objectFactory.createReverseStringRequest();
		request.setInputString("ReverseServiceUnitTest");
		ReverseStringResponse response = service.reverseString(request);
		
		assertThat(response.getReversedString(), is("tseTtinUecivreSesreveR"));
	}
}
