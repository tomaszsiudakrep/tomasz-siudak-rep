package com.kodilla.testing.forum2;

public class ForumCommentRe {
    private ForumPostRe forumPostRe;
    private String commentBody;
    private String author;

    public ForumPostRe getForumPost() {
        return forumPostRe;
    }

    public String getCommentBody() {
        return commentBody;
    }

    public String getAuthor() {
        return author;
    }

    public ForumCommentRe(ForumPostRe forumPost, String commentBody, String author) {
        this.forumPostRe = forumPost;
        this.commentBody = commentBody;
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ForumCommentRe that = (ForumCommentRe) o;

        if (forumPostRe != null ? !forumPostRe.equals(that.forumPostRe) : that.forumPostRe != null) return false;
        if (commentBody != null ? !commentBody.equals(that.commentBody) : that.commentBody != null) return false;
        return author != null ? author.equals(that.author) : that.author == null;
    }

    @Override
    public int hashCode() {
        int result = forumPostRe != null ? forumPostRe.hashCode() : 0;
        result = 31 * result + (commentBody != null ? commentBody.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        return result;
    }
}


