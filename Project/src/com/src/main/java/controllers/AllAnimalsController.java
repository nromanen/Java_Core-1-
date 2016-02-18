package controllers;

 
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




import model.Animal;
import zoo.ZooService;


 
@WebServlet("/AllAnimalsController")
public class AllAnimalsController extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Animal> animals = new ArrayList<>();
   		try {
   			animals = new ZooService().getAll();
   		} catch (Exception e) {
   		}
    	 
    	 request.setAttribute("animals", animals);
    	 
        RequestDispatcher rd = request.getRequestDispatcher("allAnimals.jsp");
   	 
   	 rd.forward(request, response);
    }
 
    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	try {
			new ZooService().delAnimalById(47);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
    	 
    	RequestDispatcher rd = request.getRequestDispatcher("index.jsp");//AllAnimalsController
       	 
       	 rd.forward(request, response);
    }
 
}