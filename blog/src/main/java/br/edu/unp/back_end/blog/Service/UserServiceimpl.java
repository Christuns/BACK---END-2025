package br.edu.unp.back_end.blog.Service;

import br.edu.unp.back_end.blog.domainmodel.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceimpl implements UserService  {
    @Override
    public List<User> findAll() {
        return List.of();
    }
}
