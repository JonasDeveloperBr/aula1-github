import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class ProgramSetAndTreeSet {

	public static void main(String[] args) {

		Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,6,8,10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10,11));
		
		//union - Joins the two lists, but do not repeat the same element
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		System.out.println(c);
		
		//intersection - similar to inner join do SQL
		Set<Integer> d = new TreeSet<>(a);
		c.retainAll(b);
		System.out.println(d);
		
		//difference - return all that exists in the first list that not exists in the second list
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		System.out.println(e);

	}

}
