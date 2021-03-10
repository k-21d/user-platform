package com.k21d.projects.user.web.controller;

import com.k21d.projects.user.domain.User;
import com.k21d.projects.user.service.UserService;
import com.k21d.web.mvc.controller.PageController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 * 注册用户处理
 */
@Path("/doRegister")
public class DoRegisterController implements PageController {
    @Resource(name = "bean/UserService")
    private UserService userService;


    @POST
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Throwable {

        String name = request.getParameter("name");
        String phoneNumber = request.getParameter("phoneNumber");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        User user = new User();
        user.setId(System.currentTimeMillis());
        user.setName(name);
        user.setPhoneNumber(phoneNumber);
        user.setEmail(email);
        user.setPassword(password);
        userService.register(user);
        System.out.println("register user: " + user);
        return "success.jsp";
    }
}
