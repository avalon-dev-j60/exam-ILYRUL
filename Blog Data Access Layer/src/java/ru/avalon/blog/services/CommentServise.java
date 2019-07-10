
package ru.avalon.blog.services;

import java.util.Collections;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import ru.avalon.blog.entities.Comment;






@Stateless
public class CommentServise {

    @PersistenceContext(unitName = "Blog-PU")
    EntityManager em;
    
    public void create(Comment comment) {
        em.persist( comment);
    }
    
    public void update(Comment comment) {
        em.merge( comment);
    }
    
    public void delete(Comment comment) {
        em.remove(  comment);
    }
    
    public Comment  find(long id) {
        try {
            return em
                .createNamedQuery(
                    "find-comment-by-id", 
                    Comment .class
                )
                .setParameter("id", id)
                .getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }
    
    public List<Comment > all() {
        try {
            return em
                .createNamedQuery(
                    "find-all-comment", 
                    Comment .class
                )
                .getResultList();
        } catch (NoResultException e) {
            return Collections.emptyList();
        }
    }
}
