package br.edu.unp.back_end.blog.domainmodel;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

public class Role {
    private @Getter @Setter Long id;
    private @Getter @Setter String name;
    private @Getter @Setter Set<User> user;

}
