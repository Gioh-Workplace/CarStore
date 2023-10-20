package br.com.carstore.servlet;

import br.com.carstore.dao.CarDao;
import br.com.carstore.model.Car;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/create-car")
public class CreateCarServlet extends HttpServlet {

    private CarDao carDao = new CarDao();
   // private Car car = new Car();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String carName = req.getParameter("car-name");

        Car car = new Car(carName);

        car.setName(carName);

        carDao.createCar(car);


        resp.sendRedirect("/find-all-cars");
    }


}
