package br.edu.unp.back_end.blog.Service;

import br.edu.unp.back_end.blog.domainmodel.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
}
