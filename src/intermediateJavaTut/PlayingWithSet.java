package intermediateJavaTut;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PlayingWithSet {
public static void main(String[] args) {
	String[] pokemon = { "eevve", "jolteon", "Flareon", "Vaporeon", "Flareon", "Vaporeon" };
	List<String> list= Arrays.asList(pokemon);
	
	System.out.println(list);
	
	Set<String> set= new HashSet<String>(list);
	System.out.println(set);
}
}
