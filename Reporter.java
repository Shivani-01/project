
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import buzzfire.Threader;
import buzzfire.objcall;
import buzzfire.repo;


/**
 * Servlet implementation class Reporter
 */


@WebServlet("/Reporter")
public class Reporter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Reporter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String head=request.getParameter("headline");
        String cont=request.getParameter("content");
        System.out.println("//////////");
        //Threader.main(null);
        objcall o=new objcall();
        
        o.print();
        System.out.println("//////////2");
        repo r=o.getobj();
        r.seth(head);
        r.setc(cont);
        
        RequestDispatcher rd=request.getRequestDispatcher("sucess.html");  
        rd.forward(request,response);
        System.out.println("//////////3");
   /*     System.out.println(r.getpass()+r.getusername());
        
        
        String a=r.getusername();
        System.out.println("//////////4");
        String Uid="root";
        String password="root";
        String DB_URL="jdbc:mysql://localhost:3306/buzzfire";
        String query="insert into repocon values ("+'"'+a+'"'+","+'"'+head+'"'+","+'"'+cont+'"'+");";
        try {
        	
        	Class.forName("com.mysql.jdbc.Driver");
			
		        Connection con= DriverManager.getConnection(DB_URL,Uid,password);
		        
	        Statement stmt=con.createStatement();
	        int rs=stmt.executeUpdate(query);
	        
	     System.out.println(rs);
	      
	        stmt.close();
	        con.close();
	        
	        System.out.println("done");
        }
        catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
        
        
        
        
        
        
        


}
