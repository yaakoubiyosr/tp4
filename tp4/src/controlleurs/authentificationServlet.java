package controlleurs;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modeles.authentificationBean;

/**
 * Servlet implementation class authentification
 */
@WebServlet("/authentification")
public class authentificationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public authentificationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		authentificationBean authentificationBean= (authentificationBean)session.getAttribute("authentificationBean");
		if(authentificationBean == null){
			String prenom = request.getParameter("prenom");
			String nom = request.getParameter("nom");
			
			authentificationBean nameBean = new authentificationBean();
			nameBean.setNom(prenom);
			nameBean.setPrenom(nom);
			session.setAttribute("nameBean", nameBean);
		}
		String address ="authentification.jsp";
	     RequestDispatcher dispatcher =request.getRequestDispatcher(address);
	     dispatcher.forward(request, response);
	}

}