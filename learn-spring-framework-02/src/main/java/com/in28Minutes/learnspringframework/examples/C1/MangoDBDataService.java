package com.in28Minutes.learnspringframework.examples.C1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MangoDBDataService implements DataService {

	@Override
	public int[] retriveData() {

		return new int[] {1,2,3,4,5,6};
		
	}

}
