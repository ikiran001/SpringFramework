package com.in28Minutes.learnspringframework.examples.C1;

import java.util.Arrays;

import org.springframework.stereotype.Component;
@Component
//all the bussiness calculation logic is provided
public class BussineessLogicService {
	private DataService dataService;

	public BussineessLogicService(DataService dataService) {
		super();
		this.dataService = dataService;
	}

	public int findMax() {
		return Arrays.stream(dataService.retriveData()).max().orElse(0);
	}

}
