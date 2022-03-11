package question_1;


	import java.util.ArrayList;
	import java.util.Iterator;
	import java.util.List;
	import java.util.ListIterator;

	public class LinkedListExample {
		public static void main(String[] args) {
			List<String> names=new ArrayList<String>();
			names.add("shameer");
			names.add("uday");
			names.add("mohan");
			names.add("hari");
			names.add("mahi");
			names.add("sekhar");
			names.add("bablu");
			names.add("Vinay");
			names.add("Ganesh");
			names.add("Adarsh");
			names.add("siva");
			System.out.println(names);
			names.add(5, "Satish");
			System.out.println(names);
			System.out.println(names.contains("Akash"));
			names.remove(10);
			System.out.println(names);
			System.out.println("-----------");
			
			Iterator<String> itr=names.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			System.out.println("-----------");
			
			ListIterator<String> lstItr=names.listIterator();
			while(lstItr.hasNext()) {
				System.out.println("Forward "+lstItr.next());
			}
			while(lstItr.hasPrevious()) {
				System.out.println("Backward "+lstItr.previous());
			}
			System.out.println("-----------");
			
			for(String name:names) {
				System.out.println(name);
			}
		}

}
