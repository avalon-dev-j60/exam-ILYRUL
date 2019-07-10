package ru.avalon.blog.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import ru.avalon.blog.entities.User;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-07-10T00:13:00")
@StaticMetamodel(Comment.class)
public class Comment_ { 

    public static volatile SingularAttribute<Comment, Date> createdAt;
    public static volatile SingularAttribute<Comment, User> author;
    public static volatile SingularAttribute<Comment, Long> id;
    public static volatile SingularAttribute<Comment, String> title;
    public static volatile SingularAttribute<Comment, String> content;

}