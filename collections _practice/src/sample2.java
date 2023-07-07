import java.util.ArrayList;
import java.util.HashSet;


public class sample2 {
	
	String name;
	
     

	@Override
	public String toString() {
		return  name ;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		sample2 other = (sample2) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


	public static void main(String[] args) {
    	   
    	  ArrayList<String>k= new ArrayList<String>();
    	
    	  k.add("shiva");
    	  k.add("shiv");
    	  
    	 // System.out.println(k);
    	  
    	  sample2 n=new sample2();
    	 n.name="hiva";
    	  sample2 n1=new sample2();
    	  n1.name="shiva";
    	  
    	 // System.out.println(n.hashCode());
    	 // System.out.println(n1.hashCode());
    	  
    	  
    	  HashSet<String> set = new HashSet<>();

          // add some elements to the set
          set.add("apple");
          set.add("banana");
          set.add("cherry");
          
        
          // add an element with the same hash code as "banana"
          set.add("aardvark");

          System.out.println("banana".hashCode() );
          System.out.println("aardvark".hashCode());
          
          // print the set
        
          
          String s1 = "apple";
          String s2 = "artichoke";

          int h1 = s1.hashCode(); // hash1 = 97690423
          int h2 = s2.hashCode(); 
          
          System.out.println(h1);
          System.out.println(h2);
          
    	  
       }
}
