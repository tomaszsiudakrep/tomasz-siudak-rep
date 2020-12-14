package com.kodilla.testing.forum2;

public class ForumPostRe {
    private String postBody;
    private String author;

    public ForumPostRe(String postBody, String author) {
        this.postBody = postBody;
        this.author = author;
    }

    public String getPostBody() {
        return postBody;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ForumPostRe that = (ForumPostRe) o;

        if (postBody != null ? !postBody.equals(that.postBody) : that.postBody != null) return false;
        return author != null ? author.equals(that.author) : that.author == null;
    }

    @Override
    public int hashCode() {
        int result = postBody != null ? postBody.hashCode() : 0;
        result = 31 * result + (author != null ? author.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ForumPostRe{" +
                "postBody='" + postBody + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
