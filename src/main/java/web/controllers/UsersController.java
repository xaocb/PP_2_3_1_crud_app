package web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import web.service.UserService;

//@Controller
//public class UsersController {
//    private final UserService userService;
//
//    public UsersController(UserService userService) {
//        this.userService = userService;
//    }
//
//    @GetMapping
//    public String index(Model model){
//        model.addAttribute("users", userService.index());
//        return "users";
//    }
//    @GetMapping("/{id}")
//    public String show(@PathVariable("id") int id, Model model){
//        model.addAttribute("user", userService.show(id));
//        return "allusers/show";
//    }
//}
