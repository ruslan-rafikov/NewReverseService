package org.example.reverse_service.impl;

import org.example.reverse_service.ObjectFactory;
import org.example.reverse_service.ReverseStringRequest;
import org.example.reverse_service.ReverseStringResponse;
import org.example.reverse_service.definitions.ReverseService;

public class ReverseServiceImpl implements ReverseService {

	private final ObjectFactory objectFactory = new ObjectFactory();

	public ReverseStringResponse reverseString(ReverseStringRequest reverseStringRequest) {

		StringBuilder builder = new StringBuilder(reverseStringRequest.getInputString());
		ReverseStringResponse response = objectFactory.createReverseStringResponse();
		response.setReversedString(builder.reverse().toString());

		return response;
	}
}
