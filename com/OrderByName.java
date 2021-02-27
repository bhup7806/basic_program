package rays.com;

import java.util.Comparator;

public class OrderByName implements Comparator<MarkSheet>{

	@Override
	public int compare(MarkSheet a, MarkSheet b) {
	   if(a.getFname().equals(b.getFname()))  
	   {   
	 return(a.getLname().compareTo(b.getLname()));
	  
	   }
	   else
	   {
		return a.getFname().compareTo(b.getFname());
	}
	   }
	

}
