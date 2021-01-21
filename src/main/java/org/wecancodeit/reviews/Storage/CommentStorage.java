package org.wecancodeit.reviews.Storage;

import org.springframework.stereotype.Service;
import org.wecancodeit.reviews.CommentRepository;
import org.wecancodeit.reviews.Models.Comment;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

@Service
public class CommentStorage {
    @Resource
    private CommentRepository commentRepo;

    public CommentStorage(CommentRepository commentRepo) {
        this.commentRepo = commentRepo;
    }

    public void addComment(Comment inComment) {
        commentRepo.save(inComment);
    }

    public Iterable<Comment> getAllComments() {
        return commentRepo.findAll();
    }

    public Comment getOneComment(Long id) {
        //return reviewRepo.findById(id);
        Optional<Comment> retrieveCommentOptional = commentRepo.findById(id);
        if (retrieveCommentOptional.isPresent()) {
            Comment foundComment = retrieveCommentOptional.get();
            return foundComment;
            //could condense to return retrieveMovieReviewOptional.get();
        }
        return null;
    }

    public Collection<Comment> getReviewComments(Long id) {
        Collection<Comment> comments = new ArrayList<>();
        for (Comment i: getAllComments()){
            if(i.getReview().getId() == id)
                comments.add(i);
        }
        return comments;
    }
}
