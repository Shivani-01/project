package buzzfire;

import java.util.ArrayList;



 public class objcall implements Runnable{
	 public static ArrayList<repo> l = new ArrayList<>();
	 	 
	 
	 public void setobj(repo o)
	 {
		 
		 l.add(o);
	 }
	 
	   public repo getobj()
	   {
		   return l.get(l.size() - 1);
	   }
	   
	   public void print()
	   {
		   for (int i=0; i<l.size(); i++) 
	            System.out.println(l.get(i)+" "); 
	   }
	 
	   repo o;
	public void run()
	{
		System.out.println("hi i'm running");
			   l.add(o);
			   System.out.println(l.size() +"is size of arraylist");
	}	
	public void remove()
	{
		 int index = l.size() - 1; 
	        l.remove(index);
	}
}

