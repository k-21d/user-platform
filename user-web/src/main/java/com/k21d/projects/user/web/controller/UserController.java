package com.k21d.projects.user.web.controller;

import com.k21d.web.mvc.controller.PageController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/user")
public class UserController implements PageController {
    @GET
    @Path("/register")
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        System.out.println("register...");
        return "register.jsp";
    }
}
