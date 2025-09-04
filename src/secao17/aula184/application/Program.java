package secao17.aula184.application;

import java.util.TreeSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;


public class Program {
	public static void main (String[] args) {
	
        peculiaridade(new HashSet<>());
        peculiaridade(new TreeSet<>());
        peculiaridade(new LinkedHashSet<>());
	}

    public static void peculiaridade(Set<String> set) {
        set.add("Tv");
        set.add("Tablet");
		set.add("Notebook");
		
		set.removeIf(x -> x.charAt(0) == 'T');
		
        System.out.println(set.contains("Notebook"));

		for (String p : set) {
			System.out.println(p);
		}
    }
}