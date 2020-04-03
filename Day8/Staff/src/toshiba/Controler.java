package toshiba;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controler
 */
@WebServlet("/Controler")
public class Controler extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private StaffDAO staffDAO;
       
  
    public Controler() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public void init() {
     // String jdbcURL = getServletContext().getInitParameter("jdbcURL");
    //  String jdbcUsername = getServletContext().getInitParameter("jdbcUsername");
    //  String jdbcPassword = getServletContext().getInitParameter("jdbcPassword");
      
    	String jdbcURL = "jdbc:mysql://localhost:3306/toshiba";
    	String jdbcUsername = "root";
    	String jdbcPassword = "root";
 
        staffDAO = new StaffDAO(jdbcURL, jdbcUsername, jdbcPassword);

 
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getServletPath();
		 
        try {
            switch (action) {
            case "/new":
               showNewForm(request, response);
                break;
            case "/insert":
                insertStaff(request, response);
                break;
            case "/delete":
                deleteStaff(request, response);
                break;
            case "/edit":
              showEditForm(request, response);
                break;
            case "/update":
              updateStaff(request, response);
                break;
            default:
                listStaff(request, response);
                break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
	}

    private void listStaff(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        List<Staff> listStaff = staffDAO.listAllStaff();
        request.setAttribute("listStaff", listStaff);
        RequestDispatcher dispatcher = request.getRequestDispatcher("StaffList.jsp");
        dispatcher.forward(request, response);
    }
    
    private void showNewForm(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
   RequestDispatcher dispatcher = request.getRequestDispatcher("AddForm.jsp");
        dispatcher.forward(request, response);     
    }
    
    private void showEditForm(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Staff existingDAO = staffDAO.getStaff(id);
        RequestDispatcher dispatcher = request.getRequestDispatcher("AddForm.jsp");
        request.setAttribute("staff", existingDAO);
        dispatcher.forward(request, response);
 
    }
    
    private void insertStaff(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
    	int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        String sex = request.getParameter("sex");
        String email = request.getParameter("email");
        
        Staff staff = new Staff(id, name, age, sex, email);
        staffDAO.insertStaff(staff);
        response.sendRedirect("list");
    }
    
    private void updateStaff(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
    	int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        String sex = request.getParameter("sex");
        String email = request.getParameter("email");
        
        Staff staff = new Staff(id, name, age, sex, email);
        staffDAO.updateStaff(staff);
        response.sendRedirect("list");
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
    private void deleteStaff(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
 
        Staff staff= new Staff(id);
        staffDAO.deleteStaff(staff);
        response.sendRedirect("list");
 
    }

}
