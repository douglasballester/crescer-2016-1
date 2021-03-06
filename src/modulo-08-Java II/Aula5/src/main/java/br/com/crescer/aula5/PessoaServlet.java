package br.com.crescer.aula5;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="pessoa", urlPatterns= {"/pessoa"})
public class PessoaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            
        process(response, request);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       process(response, request);
    }

    
//response.setContentType("text/html");
//        try (final PrintWriter out = response.getWriter();) {
//            out.append("<!DOCTYPE html>");
//            out.append("<html>");
//            out.append("<head>");
//            out.append("<title>Java - aula5</title>");
//            out.append("<meta charset=\"UTF-8\">");
//            out.append("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
//            out.append("</head>");
//            out.append("<body>");
//            out.append("<h1>Pessoa</h1>");
//            out.append("</body>");
//            out.append("</html>");
//        }
    

    private void process(HttpServletResponse response, HttpServletRequest request) throws IOException {
        response.setContentType("text/html");
        try(final PrintWriter out = response.getWriter();){
            out.append(request.getParameter("pessoa.sexo")).append("<br>");
            out.append(request.getParameter("pessoa.nome")).append("<br>");
            out.append(request.getParameter("pessoa.idade")).append("<br>");
        }
    }
    
    
}
