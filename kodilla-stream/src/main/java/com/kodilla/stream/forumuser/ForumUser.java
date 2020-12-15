package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int identifier;
    private final String username;
    private final char sex;
    private final LocalDate birthDay;
    private final int amountPublicPosts;

    public ForumUser(final int identifier, final String username, final char sex, final int year, final int month, final int dayOfMonth, final int amountPublicPosts) {
        this.identifier = identifier;
        this.username = username;
        this.sex = sex;
        this.birthDay = LocalDate.of(year, month, dayOfMonth);
        this.amountPublicPosts = amountPublicPosts;
    }

    public int getIdentifier() {
        return identifier;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public int getAmountPublicPosts() {
        return amountPublicPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "identifier=" + identifier +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", birthDay=" + birthDay +
                ", amountPublicPosts=" + amountPublicPosts +
                '}';
    }
}


