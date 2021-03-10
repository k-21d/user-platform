package com.k21d.projects.user.web.controller;

import com.k21d.projects.user.domain.User;
import com.k21d.projects.user.service.UserService;
import com.k21d.web.mvc.controller.PageController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.Collection;

@Path("/index")
public class IndexController implements PageController {
    @Resource(name = "bean/UserService")
    private UserService userService;

    @GET
    @Path("/show")
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        Collection<User> list = userService.queryAllUser();
        for (User user : list) {
            System.out.println("user:"+user.toString());
        }

        return "index.jsp";
    }
}
