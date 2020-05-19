package buzzfire;

public class repo {
 private String username,pass,head,con;
	public String getusername() {
	return username;
	}
	public String getpass() {
	return pass;
	}
	public void setusername(String n)
	{
		username=n;
	}
	public void setpass(String p)
	{
		pass=p;
	}
	
	public void seth(String h)
	{
		head=h;
	}
	public void setc(String h)
	{
		con=h;
	}
	
	public String geth() {
	return head;
	}

	public String getc() {
		return con;
		}
public static void main(String [] args)
{
	repo r=new repo();
	r.setusername("shalini");
	r.seth("corona");
	r.setc("pandemic");
	objcall o=new objcall();
	o.setobj(r);
	}
	
}
