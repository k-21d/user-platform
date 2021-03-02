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
import java.util.Collection;

@Path("/user")
public class ShowController implements PageController {

    @GET
    @Path("/show")
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        String databaseURL = "jdbc:derby:/db/user-platform;create=true";
        Connection connection = DriverManager.getConnection(databaseURL);
        DBConnectionManager dbConnectionManager = new DBConnectionManager(connection);
        DatabaseUserRepository databaseUserRepository = new DatabaseUserRepository(dbConnectionManager);
        Collection<User> all = databaseUserRepository.getAll();
        System.out.println("==================================");
        System.out.println("get users:");
        for (User user : all) {
            System.out.println("user:"+user.toString());
        }
        System.out.println("==================================");
        return "index.jsp";
    }
}
