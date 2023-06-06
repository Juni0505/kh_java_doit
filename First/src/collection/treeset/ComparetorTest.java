package collection.treeset;

import java.util.Set;
import java.util.TreeSet;

public class ComparetorTest {

	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>(new MyCompare());
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		
		System.out.println(set);
	}

}
