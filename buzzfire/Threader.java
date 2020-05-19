package buzzfire;


public class Threader {
	
	   public static void main(String[] args) {
		   objcall t=new objcall();
			 Thread f=new Thread(t);
		f.start();
		try {
			Thread.sleep(720000);
			
			objcall o=new objcall();
	        System.out.println("//////////1");
	        o.print();
	        System.out.println("//////////2");
	        repo r=o.getobj();
	        
			
			
			t.remove();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
	