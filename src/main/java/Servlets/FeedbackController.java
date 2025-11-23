package Servlets;

import java.io.IOException;
import java.sql.SQLException;

import DAO.FeedbackDAO;
import DAO.JDBCConnection;
import Structures.FeedbackStructure;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/feedback")
public class FeedbackController extends HttpServlet{
	JDBCConnection jdbcConnection;
	private  FeedbackDAO feedbackDAO =new FeedbackDAO();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setCharacterEncoding("UTF-8");
		
		//First Process the data
		String email=req.getParameter("email");
		String username=req.getParameter("username");
		String phone=req.getParameter("number");
		String feedbackmsg=req.getParameter("feedbackmsg");
		
		
        // basic validation (server-side)
        if (email == null || email.isBlank() || feedbackmsg == null || feedbackmsg.isBlank()) {
            req.setAttribute("error", "Email and message are required");
            //req.getRequestDispatcher("/WEB-INF/feedbackForm.jsp").forward(req, resp);
            return;
        }
		
		//Save data to db: first needed DAO class
		
		//setting data to strucure and now strucure is storein to db
		FeedbackStructure fbs=new FeedbackStructure();
		fbs.setEmail(email);
		fbs.setFeedbackmsg(feedbackmsg);
		fbs.setName(username);
		fbs.setPhone(phone);
		
		//saving data to db
		
		try {
			
			int responseid = feedbackDAO.saveToDB(fbs);
			if(responseid > 0) {
				
				//req.setAttribute("Success", "Data has been saved to Database");
				resp.sendRedirect(req.getContextPath()+"/feedback?success=1");
			}
			else {
                req.setAttribute("error", "Could not save feedback");
                //req.getRequestDispatcher("/WEB-INF/feedbackForm.jsp").forward(req, resp);
            }
			
			
			
		}catch (Exception e) {
			throw new ServletException(e);
		}
		
				

	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String action=req.getParameter("success");
		req.setAttribute("success", "Sucess screen is sending");
		int res=Integer.parseInt(action);
		if (res > 0) {
			req.getRequestDispatcher("/views/thankyou.jsp").forward(req, resp);
		}
		
		
		
	}

}
