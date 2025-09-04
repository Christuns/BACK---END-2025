package br.edu.unp.back_end.blog.domainmodel;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Profile {
    private @Getter @Setter Long id;
    private @Getter @Setter String bio;
    private @Getter @Setter String pictureUrl;
    private @Getter @Setter String user;
}
