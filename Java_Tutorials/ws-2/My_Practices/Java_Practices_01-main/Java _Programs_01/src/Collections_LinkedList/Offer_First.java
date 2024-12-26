package Collections_LinkedList;

import java.util.LinkedList;

public class Offer_First {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("BMW");
		list.add("Volvo");
		list.add("Mercedes");
		
		System.out.println("LinkedList before insertion using OfferFirst "+list);
		list.offerFirst("Jaguar");
		System.out.println("LinkedList after insertion using OfferFirst "+list);

	}

}
