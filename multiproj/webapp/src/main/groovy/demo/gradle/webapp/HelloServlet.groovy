package demo.gradle.webapp

import demo.domain.Person

import javax.servlet.ServletException
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Person person = new Person(name: "Hello Gradle User")

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1> Today is " + new Date() + "</h1>");
        out.println("<h1> Today is " + person + "</h1>");
    }
}