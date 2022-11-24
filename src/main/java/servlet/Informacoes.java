package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet(name="Informacoes", urlPatterns = {"/Informacoes"})
public class Informacoes extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String nome = request.getParameter("nome");
        String sobrenome = request.getParameter("sobrenome");
        String telephone = request.getParameter("telephone");
        String email = request.getParameter("email");
        String rua = request.getParameter("rua");
        String cep = request.getParameter("cep");

        request.setAttribute("nome", nome);
        request.setAttribute("sobrenome", sobrenome);
        request.setAttribute("telephone", telephone);
        request.setAttribute("email", email);
        request.setAttribute("rua", rua);
        request.setAttribute("cep", cep);

        request.getRequestDispatcher("components/Pagina/pagina.jsp").forward(request, response);
    }

}
