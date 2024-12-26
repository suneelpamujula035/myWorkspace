package com.suneel.Spring_01;

import org.springframework.stereotype.Component;

@Component
public class MediaTek implements MobileProcessor {

	public void process() {

		System.out.println("Third best CPU");
	}

}
