package com.k21d.projects.user.web.controller;

import com.k21d.projects.user.domain.User;
import com.k21d.projects.user.repository.DatabaseUserRepository;
import com.k21d.projects.user.sql.DBConnectionManager;
import com.k21d.web.mvc.controller.PageController;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.UUID;

@Path("/doRegister")
public class DoRegisterController implements PageController {
    @GET
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        ServletContext servletContext = request.getServletContext();
        servletContext.log("doRegister：");
        String name = request.getParameter("name");
        String password = request.getParameter("password");


        servletContext.log("name："+name);
        servletContext.log("password："+password);
        User user = new User();
        user.setId(System.currentTimeMillis());
        user.setName(name);
        user.setPassword(password);
        user.setEmail("test@mail.com");
        user.setPhoneNumber("13214234324");
        String databaseURL = "jdbc:derby:/db/user-platform;create=true";
        Connection connection = DriverManager.getConnection(databaseURL);
        DBConnectionManager dbConnectionManager = new DBConnectionManager(connection);
        DatabaseUserRepository databaseUserRepository = new DatabaseUserRepository(dbConnectionManager);
        databaseUserRepository.save(user);
        return "success.jsp";
    }
}
