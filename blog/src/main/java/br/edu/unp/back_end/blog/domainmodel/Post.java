package br.edu.unp.back_end.blog.domainmodel;

import lombok.*;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Post {
    private @Getter @Setter Long id;
    private @Getter @Setter String tittle;
    private @Getter @Setter String content;
    private @Getter @Setter String user;
    private @Getter @Setter Set<Tag> tags;

}
