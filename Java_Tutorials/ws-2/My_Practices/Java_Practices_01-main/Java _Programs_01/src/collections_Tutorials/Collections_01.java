package collections_Tutorials;

public class Collections_01 {

	public static void main(String[] args) {

		System.out.println("Hello world");
	}

}
//collections in Java:
//--------------------
//1)The collection in Java is a framework that provides an architecture to store and manipulate the group of objects
//2)Java Collections can achieve all the operations that you perform on a data such as searching, sorting, insertion, modifying, and deletion.
//3)Java Collection framework that provides many interfaces(Set, List, Queue, Deque)  and classes(ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet).
//4)The Collection interface and Map interface are the two main "root" interfaces of Java Collection classes.

//collections = framework
//Collection = interface

//Iterator is an interface that iterates the elements. It is used to traverse the list and modify the elements. Iterator interface has three methods : hasNext(), next(), remove()

//Collection : Root interface with basic methods like add(), remove(), contains(), isEmpty(), addAll(),....etc.

//List: Can contain duplicate elements  and elements are ordered. You can access many elements from its index. List is more like array with dynamic lengths. example implementations are ArrayList and LinkedList. list interface provides useful methods to add an element at specific index, remove/replace element based on index and to get a sub-list using index.

//Set: Doesn't allpw duplicate elements. Example implementations of set interface are hashSet, TreeSet, LinkedHashSet. Set interface does not allow random-access to an element in tye Collection. You can use Iterator or forEach loop to traverse the elements of a set.

//Queue: Typically ordered elements in FIFO order except xceptions like PriorityQueue. In a FIFO queue, all new elements are inserted at the tail of the queue.

//Deque: Elements can be inserted and removed at both ends. Allows both LIFO and FIFO. The name dequee is short for "double ended queue" and is usually pronounced "deck".

//Map: Contains Key n=and Value pair. A map cannot contain dupicate keys: Each key can map to at most one value. Example implementations are HashMap, LinkedHashMap, TreeMap.


//1)List(allows duplicate, ordered) - LinkesList and ArraList random access
//2)Set(Doesn't allow duplicates) - HashSet, TreeSet and LinkedHashSet doesn't come in random access(doesn't come in order)
//3)Queue(FIFO)-PriorityQueue - added at the Last
//4)Deque(FIFO, LIFO) - ArrayDeque
//5)Map(Key and Value pair) (cannot duplicate keys) - HashMap, LinkedHashMap, TreeMap

//List Interface: List interface is a substance of collection. It contains index based methods and delete elements. It is a factory of ListIterator interface.
//*)void add(int index, E element)  It is used to insert the specified element at the specified position in a list.
//*)boolean add(E e) It is used to append the element at the end of the list.
//*)boolean addAll(Collection<? extends E>c) It is used to append all of the elements in the specified collection to the end of a list.
//*)boolean addAll(int index, Collection<? extends E>c) It is used to append all the elements in tye specified collection, starting at the specified position of the list.
//*)void clear() It is used to remove all the elements from this list.
//*)boolean equals(object o) it is used to compare the specified object with the element of a list.
//*)Object get(int index) It is used fetch the element from  the particular position of the list.
//*)boolean isEmpty() It returns true if the list is empty, otherwise false.
//*)int lastInsexOf(Object o) It is used to return the index in this list of the last occurrence of the  specified element or -1 if the list does not contain ths element.
//*)Object[] toArray() It is used to return an array containing all of the element in this list in the correct order.
//*)boolean contains(Object o) It returns true if the list contain specified element.
//*)int indexOf(Object o) It is used to return the index in this list of the first occurrence of the specified element, or -1 if the list does not contain this element.
//*)E remove(int index) It is used to remove the present element present at the specified position in the list.
//boolean remove(Object o) It is used to remove the first occurrence of the specified element.
//*)boolean removeAll(Collection<?> c) It is used to remove all the elements from the list.
//*)E set(int index, E element) It is used to replace the specified element in the list, present at the specified position.
//*)void sort(Comparator<? super E> c) It is used to sort the element of the list on the basis specified comparator.
//*)List<E> sublist(int fromIndex, int toIndex) It is used to fetch all the elements lies within the given range.
//*)int size() It is used to return the number of elements present in the list.


