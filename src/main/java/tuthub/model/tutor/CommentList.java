package tuthub.model.tutor;

import java.util.ArrayList;

/**
 * Represents the list of comments attached to each tutor.
 *
 */
public class CommentList {
    private final ArrayList<Comment> comments = new ArrayList<>();

    public CommentList addComment(Comment comment) {
        this.comments.add(comment);
        return this;
    }

    public Comment getComment(int index) {
        return comments.get(index);
    }

    public void deleteComment(int index) {
        comments.remove(index);
    }

    public void clearComments() {
        comments.clear();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Comment comment : comments) {
            result.append(comment.toString()).append("\n");
        }
        return result.toString();
    }
}
