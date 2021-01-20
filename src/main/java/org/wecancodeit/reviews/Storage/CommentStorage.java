package org.wecancodeit.reviews.Storage;

import org.springframework.stereotype.Service;
import org.wecancodeit.reviews.CommentRepository;
import org.wecancodeit.reviews.Models.Comment;

import javax.annotation.Resource;

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

    public Iterable<Comment> getAllCategories() {
        return commentRepo.findAll();
    }
}
