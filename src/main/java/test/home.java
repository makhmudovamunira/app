package test;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class home extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println(req);
        PrintWriter printWriter=resp.getWriter();
        resp.setContentType("text/html");
        printWriter.write("<h2>Bosh sahifaga xush kelibiz!!!</h2>");
        printWriter.write("<a href='/Kirish'>Tizimga kirish</a>");
    }
}
