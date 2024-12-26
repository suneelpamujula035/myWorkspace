package collections;

import java.util.Comparator;
import java.util.PriorityQueue;
class My_Comparator_Demo implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		String s1 = (String)o1;
		String s2 = (String)o2;
		return s2.compareTo(s1);
	}
}
public class PriorityQueueDemo_02 {

	public static void main(String[] args) {

		PriorityQueue q = new PriorityQueue(new My_Comparator_Demo());
		q.offer("A");
		q.offer("Z");
		q.offer("L");
		q.offer("B");
		System.out.println(q);
	}

}
