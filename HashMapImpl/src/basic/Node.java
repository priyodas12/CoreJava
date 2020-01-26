package basic;

public class Node<K,V> {
	 int hashcode;
	 K key;
	 V value;
	 Node<K,V> next;
}

/**
 *primary length n=16(length->0 to 15);
 *
 *put(K k,V v)::
 *do the hash(k):keys to some integer values
 *index=hash(k) & (n-1);
 *put the V to the same index;
 *and next will be assigned as null, untill same index value put() was done.
 *
 *
 *get(K k)::
 *do the hash(k):keys to some integer values
 *index=hash(k) & (n-1);
 *go the index and run hashcode() check hascode is same or not,if yes then equals() if that also
 *same then return object.
 *if not same then check next node hascode() and equals()
 *
 *in java 8: once the threasold(8) has reached data structure will be chnaged to balanced tree.
 */
