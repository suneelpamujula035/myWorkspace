package com.suneel.Spring_01;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary//First priority
public class Snapdragon implements MobileProcessor {

	public void process() {

		System.out.println("World best CPU");
	}

}
