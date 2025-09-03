package br.edu.unp.back_end.blog.domainmodel;

import lombok.*;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class User {
    private @Getter @Setter long id;
    private  @Getter @Setter String Name;
    private  @Getter @Setter String email;
    private  @Getter @Setter String password;
    private  @Getter @Setter List<Role> roles;
    private  @Getter @Setter Profile profile;

    public User() {
    }

    public User(long id, String name, String email, String password, List<Role> roles, Profile profile) {
        this.id = id;
        Name = name;
        this.email = email;
        this.password = password;
        this.roles = roles;
        this.profile = profile;
    }
}
