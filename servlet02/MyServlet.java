package servlet02;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import util.JpaUtil;
import servlet02.Student;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("t1");
		String password = request.getParameter("t2");
		String rememberVal = request.getParameter("remember");
		//out.println(rememberVal);
		
		EntityManager em = JpaUtil.getEntityManager();
		Query query = em.createQuery("select s from Student s");
		int flag = 0;
		List<Student> students = query.getResultList();
		for(Student s:students) {
			if(userName.equals(s.getName()) && password.equalsIgnoreCase(s.getPassword())) {
				flag = 1;
				break;
			}
		}
		
		if(userName!=null && password!=null && flag==1) {
			//response.sendRedirect("next.jsp");
			if(request.getParameter("remember")!=null) {
				String remember = request.getParameter("remember");
				Cookie cUserName = new Cookie("cookuser", userName.trim());
				Cookie cPassword = new Cookie("cookpass", password.trim());
				Cookie cRemember = new Cookie("cookrem", rememberVal.trim());
				cUserName.setMaxAge(60*60*24*15);//15 days
				cPassword.setMaxAge(60*60*24*15);
				cRemember.setMaxAge(60*60*24*15);
				response.addCookie(cUserName);
				response.addCookie(cPassword);
				response.addCookie(cRemember);
			}
			HttpSession httpSession = request.getSession();
			//httpSession.setMaxInactiveInterval(100000);
			httpSession.setAttribute("sessuser", userName.trim());
			RequestDispatcher rd = request.getRequestDispatcher("next1.jsp");
			rd.forward(request, response);
	} else {
		out.println("Authentication failure.");
		request.setAttribute("msg", "Authentication failure");
		RequestDispatcher rd = request.getRequestDispatcher("login3.jsp");
		rd.forward(request, response);
	}
}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
