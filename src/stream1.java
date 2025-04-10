import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class stream1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a=new ArrayList<String>();
		a.add("ert");
		a.add("ddg");
		a.add("Adgdam");
		a.add("Adgdgbhilekya");
		a.add("Ddgon");
		a.add("TdgYU");
		
		long xcv = a.stream().filter(s ->s.startsWith("a")).count();
		//System.out.println(xcv);
		
		//Stream.of("Abhijeet","rama","Adam","Abhilekya","Don").filter(s->s.endsWith("a")).limit(1).forEach(s ->System.out.println(s));
		//Stream.of("Axhijeet","rama","Adam","Abhilekya","Don").filter(s->s.endsWith("a")).map(s ->s.toUpperCase()).forEach(s -> System.out.println(s));
		List<String> names = Arrays.asList("Axhijeet","Rama","Adam","Abhilekya","Don");
		//names.stream().sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	   Stream<String> newstreams = Stream.concat(a.stream(),names.stream());
		//newstreams.sorted().forEach(s ->System.out.println(s));
		//boolean status = newstreams.anyMatch(s->s.equalsIgnoreCase("Adam"));
		//System.out.println(status);
	   
	   List<String> ls = newstreams.filter(s->s.startsWith("A")).map(s->s.toUpperCase()).collect(Collectors.toList());
	  //System.out.println(ls.get(0));
	  
	  
	   List<Integer> values = Arrays.asList(1,2,3,4,5,1,5,9,5,4,4,2,1,7);
	  values.stream().distinct().sorted().forEach(s->System.out.println(s));
	  
	  
	  
	  
	  
	  
	  
	}}
