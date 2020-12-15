package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> forumUserDirectory = new ArrayList<>();

    public Forum() {
        forumUserDirectory.add(new ForumUser(001, "tomaszEs", 'M', 1993, 06, 06, 333));
        forumUserDirectory.add(new ForumUser(002, "guest", 'F', 1994, 05, 05, 3));
        forumUserDirectory.add(new ForumUser(003, "hunter", 'M', 2000, 10, 05, 121));
        forumUserDirectory.add(new ForumUser(004, "ona", 'F', 2001, 12, 31, 51));

    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(forumUserDirectory);
    }
}
