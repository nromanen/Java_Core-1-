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


 
/**
 * Servlet implementation class HelloWorld
 */
@WebServlet("/AnimalController")
public class AnimalController extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	 RequestDispatcher rd = req.getRequestDispatcher("addAnimal.jsp");
    	 
    	 rd.forward(req, resp);
    }
 
    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     String name = request.getParameter("name");
     if (name ==null)name ="";
     Animal animal = new Animal();
     animal.setName(name);
     try {
		new ZooService().addAnimal2(animal);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     List<Animal> animals = new ArrayList<>();
		try {
			animals = new ZooService().getAll();
		} catch (Exception e) {
		}
 	 
 	 request.setAttribute("animals", animals);
 	 
     RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
	 
	 rd.forward(request, response);
    }
 
}