package br.edu.unp.back_end.blog.controler;

import br.edu.unp.back_end.blog.Service.UserService;
import br.edu.unp.back_end.blog.domainmodel.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
//http://localhost:8080/users

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    //@Autowired
    private final UserService userService;

    @GetMapping
    public List<User> findAll() {
    return this.userService.findAll();    
    }
}
