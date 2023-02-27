package task5and6.servlet;

import task5and6.dao.StudentDAO;
import task5and6.entity.Student;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/add-student")
public class StudentAddServlet extends HttpServlet {

    private StudentDAO studentDAO = StudentDAO.getInstance();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getSession().setAttribute("students", studentDAO.getAll()); //comment for task 5
        request.getRequestDispatcher(request.getContextPath() + "add-student.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        /** Task 5 version*/
        /*
        HttpSession session = request.getSession();
        List<Student> studentList = (List<Student>) session.getAttribute("students");

        if(studentList == null){
            studentList = new ArrayList<>();
        }

        if(request.getParameter("name").length() > 0 && request.getParameter("surname").length() > 0){
            studentList.add(new Student(request.getParameter("name"),
                    request.getParameter("surname"),
                    request.getParameter("age"),
                    request.getParameter("email"),
                    request.getParameter("group"),
                    request.getParameter("faculty")));
        }
        session.setAttribute("students", studentList);*/

        if(request.getParameter("name").length() > 0 && request.getParameter("surname").length() > 0){
            Student student = new Student(request.getParameter("name"),
                    request.getParameter("surname"),
                    request.getParameter("age"),
                    request.getParameter("email"),
                    request.getParameter("group"),
                    request.getParameter("faculty"));
            studentDAO.save(student);
        }
        response.sendRedirect(request.getContextPath() + "/add-student");
    }
}
