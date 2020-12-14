package com.kodilla.testing.forum2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ForumUserRe {
    private String name;
    private String realName;
    private List<ForumPostRe> posts = new ArrayList<>();
    private List<ForumCommentRe> comments = new LinkedList<>();

    public ForumUserRe(String name, String realName) {
        this.name = name;
        this.realName = realName;
    }

    public void addPost(String author, String postBody) {
        ForumPostRe thePost = new ForumPostRe(postBody, author);
        posts.add(thePost);
    }

    public void addComment(ForumPostRe forumPostRe, String author, String commentBody){
        ForumCommentRe theComment = new ForumCommentRe(forumPostRe, author, commentBody);
        comments.add(theComment);
    }

    public int getPostsQuantity() {
        return posts.size();
    }

    public int getCommentsQuantity() {
        return comments.size();
    }

    public ForumPostRe getPost(int postNumber){
        if(postNumber >= 0 && postNumber < posts.size()) {
            return posts.get(postNumber);
        }
        return null;
    }

    public ForumCommentRe getComment(int commentNumber){
        ForumCommentRe theComment = null;
        if(commentNumber >= 0 && commentNumber < comments.size()) {
            theComment = comments.get(commentNumber);
        }
        return theComment;
    }

    public boolean removePost(ForumPostRe thePost){
        boolean result = false;

        if(posts.contains(thePost)){
            posts.remove(thePost);
            result = true;
        }
        return result;
    }

    public boolean removeComment(ForumCommentRe theComment){
        boolean result = false;
        if(comments.contains(theComment)) {
            comments.remove(theComment);
            result = true;
        }
        return result;
    }

    public String getName() {
        return name;
    }

    public String getRealName() {
        return realName;
    }
}
