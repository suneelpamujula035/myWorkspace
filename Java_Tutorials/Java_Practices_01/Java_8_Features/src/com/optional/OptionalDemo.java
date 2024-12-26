package com.optional;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {

		String email = "suneelpamujula@gmail.com";
		//String email = null;
		
//		Optional<Object> emptyOptional = Optional.empty();
//		System.out.println(emptyOptional);
		
//		Optional<String> optional = Optional.of(email);
//		System.out.println(optional);
		
		Optional<String> ofNullable = Optional.ofNullable(email);
		//System.out.println(ofNullable.get());
//		System.out.println(ofNullable);
//		if(ofNullable.isPresent())
//		{
//			System.out.println(ofNullable.get().toUpperCase());
//		}else {
//			System.out.println("Sorry don't have object");
//		}
		//System.out.println(ofNullable.orElse("default@gmail.com"));
		//System.out.println(ofNullable.orElseGet(()->"default@gmail.com"));
		//System.out.println(ofNullable.orElseThrow(()->new NoSuchElementException("Email not present")));
		
//		Optional<String> gender = Optional.of("Male");
//		gender.ifPresent((s)->System.out.println(s));
//		Optional<Object> empty = Optional.empty();
//		empty.ifPresent((s)->System.out.println(s));
		
		String result = " abc ";
		if(result!=null && result.contains("abc"))
		{
			System.out.println(result);
		}
		
		Optional<String> optionalString = Optional.of(result);
		optionalString.filter(res->res.contains("abc")).map(String::trim).ifPresent((s)->System.out.println(s));
		
	}
}
