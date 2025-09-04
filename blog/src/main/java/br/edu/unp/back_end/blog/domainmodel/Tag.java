package br.edu.unp.back_end.blog.domainmodel;

import lombok.*;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Tag {
    private @Getter @Setter Long id;
    private @Getter @Setter String name;
    private @Getter @Setter Set<Post> post;
}
