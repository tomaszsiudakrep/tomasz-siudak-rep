package com.kodilla.stream.forum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ForumUserTestSuite {

    @Test
    void testGetLocationsOfFriends() {
        //given
        //create users
        com.kodilla.stream.forum.ForumUser user1 = new com.kodilla.stream.forum.ForumUser("tomaszs", "Tomasz S", "Cracow");
        com.kodilla.stream.forum.ForumUser user2 = new com.kodilla.stream.forum.ForumUser("ewc", "Ewa", "Cracow");
        com.kodilla.stream.forum.ForumUser user3 = new com.kodilla.stream.forum.ForumUser("xyz", "Anonim", "www");
        ForumUser user4 = new com.kodilla.stream.forum.ForumUser("hunter", "hunter", "hunter");

        //when
        //create relations for user1
        user1.addFriend(user2);
        user1.addFriend(user3);
        user1.addFriend(user4);

        //create relations for user2
        user2.addFriend(user1);
        user2.addFriend(user4);
        user2.addFriend(user3);

        //create relations for user3
        user3.addFriend(user1);
        user3.addFriend(user2);

        //create relations for user4
        user4.addFriend(user1);
        user4.addFriend(user2);
        user4.addFriend(user3);

      //  then
        assertEquals(3, user1.getLocationsOfFriends().size());
        assertTrue(user1.getLocationsOfFriends().contains("Cracow"));
        assertTrue(user1.getLocationsOfFriends().contains("www"));
        assertTrue(user1.getLocationsOfFriends().contains("hunter"));
    }

    @Test
    void testGetLocationOfFriendsOfFriends() {
        //given
        com.kodilla.stream.forum.ForumUser user1 = new com.kodilla.stream.forum.ForumUser("tomaszs", "Tomasz S", "Cracow");
        com.kodilla.stream.forum.ForumUser user2 = new com.kodilla.stream.forum.ForumUser("ewc", "Ewa", "Cracow");
        com.kodilla.stream.forum.ForumUser user3 = new com.kodilla.stream.forum.ForumUser("xyz", "Anonim", "www");
        ForumUser user4 = new com.kodilla.stream.forum.ForumUser("hunter", "hunter", "hunter");
        com.kodilla.stream.forum.ForumUser user5 = new ForumUser("ziomke", "ziom", "Warsaw");
        //when
        //create relations for user1
        user1.addFriend(user2);
        user1.addFriend(user3);
        user1.addFriend(user4);

        //create relations for user2
        user2.addFriend(user1);
        user2.addFriend(user4);
        user2.addFriend(user3);

        //create relations for user3
        user3.addFriend(user1);

        //create relations for user4
        user4.addFriend(user1);
        user4.addFriend(user2);

        //then
        assertEquals(3, user1.getLocationsOfFriendsOfFriends().size());
        assertTrue(user1.getLocationsOfFriendsOfFriends().contains("Cracow"));
        assertTrue(user1.getLocationsOfFriendsOfFriends().contains("www"));
        assertTrue(user1.getLocationsOfFriendsOfFriends().contains("hunter"));
        assertFalse(user1.getLocationsOfFriendsOfFriends().contains("XXX"));

    }
}
