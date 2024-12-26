package com.suneel.Spring_01;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Qualcom implements MobileProcessor {

	public void process() {

		System.out.println("Second best CPU");
	}

}
