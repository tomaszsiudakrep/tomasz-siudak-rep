//package com.kodilla.testing.forum.tdd;
//
//import com.kodilla.testing.forum2.ForumCommentRe;
//import com.kodilla.testing.forum2.ForumPostRe;
//import com.kodilla.testing.forum2.ForumUserRe;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.jupiter.api.*;
//
//@DisplayName("TDD: Forum Test Suite Re")
//public class ForumTestSuiteRe {
//    private static int testCounter = 0;
//
//    @BeforeAll
//    public static void beforeAllTests() {
//        System.out.println("This i the beginning of tests.");
//    }
//
//    @AfterAll
//    public static void afterAllTests(){
//        System.out.println("All tests are finished");
//    }
//
//    @Before
//    public void beforeEveryTest() {
//        testCounter++;
//        System.out.println("Preparing to execute test #" + testCounter);
//    }
//
//    @Test
//    public void testAddPost() {
//        //given
//        ForumUserRe forumUserRe = new ForumUserRe("MrTom", "Tomasz Siudak");
//        //when
//        forumUserRe.addPost("MrTom", "This is my first comment here!");
//        //then
//        Assertions.assertEquals(1, forumUserRe.getPostsQuantity());
//    }
//
//    @Test
//    public void testAddComment() {
//        //given
//        ForumUserRe forumUserRe = new ForumUserRe("Siudi", "Tomasz Siudakson");
//        ForumPostRe thePost = new ForumPostRe("Siema", "Siudi");
//        //when
//        forumUserRe.addComment(thePost, "Siudi", "Thanks");
//        //then
//        Assertions.assertEquals(1, forumUserRe.getCommentsQuantity());
//    }
//
//    @Test
//    public void testGetPost() {
//        //given
//        ForumUserRe forumUserRe = new ForumUserRe("MrTom", "Tomasz Siudak");
//        ForumPostRe thePost = new ForumPostRe("Siema siema", "MrTom");
//        forumUserRe.addPost(thePost.getAuthor(), thePost.getPostBody());
//        //when
//        ForumPostRe retrivedPost;
//        retrivedPost = forumUserRe.getPost(0);
//        //then
//        Assertions.assertEquals(thePost, retrivedPost);
//    }
//
//    @Test
//    public void testGetComment() {
//        //given
//        ForumUserRe forumUserRe = new ForumUserRe("Ewc", "Ewa Lalewicz");
//        ForumPostRe thePost = new ForumPostRe("New comment", "Ewc");
//        ForumCommentRe theComment = new ForumCommentRe(thePost, "Ziom ziom", "Ewc");
//        forumUserRe.addComment(thePost, theComment.getCommentBody(), theComment.getAuthor());
//        //when
//        ForumCommentRe retrivedComment;
//        retrivedComment = forumUserRe.getComment(0);
//        //then
//        Assertions.assertEquals(theComment, retrivedComment);
//    }
//    @Test
//    public void testRemovePostNotExisting() {
//        //given
//        ForumUserRe forumUserRe = new ForumUserRe("Ewc", "Ewa Lalewicz");
//        ForumPostRe thePost = new ForumPostRe("Post to del.", "Ewc");
//        //when
//        boolean result = forumUserRe.removePost(thePost);
//        //then
//        Assertions.assertFalse(result);
//    }
//
//    @Test
//    public void testRemoveCommentNotExisiting() {
//        //given
//        ForumUserRe forumUserRe = new ForumUserRe("Tom", "Tomasz Siudak");
//        ForumPostRe thePost = new ForumPostRe("Ziom elo ziom", "Tom");
//        ForumCommentRe theComment = new ForumCommentRe(thePost, "Ty gościu", "Tom");
//        //when
//        boolean result = forumUserRe.removeComment(theComment);
//        //then
//        Assertions.assertFalse(result);
//    }
//
//    @Test
//    public void testRemovePost() {
//        //given
//        ForumUserRe forumUserRe = new ForumUserRe("Ewuś", "Ewcik");
//        ForumPostRe thePost = new ForumPostRe("TO jest moj post", "Ewuś");
//        forumUserRe.addPost(thePost.getAuthor(), thePost.getPostBody());
//        //when
//        boolean result = forumUserRe.removePost(thePost);
//        //then
//        Assertions.assertTrue(result);
//    }
//
//    @Test
//    public void testRemoveComment() {
//        ForumUserRe forumUserRe = new ForumUserRe("T", "TS");
//        ForumPostRe thePost = new ForumPostRe("Kommentarz", "T");
//        ForumCommentRe theComment = new ForumCommentRe(thePost, "Ty..", "T");
//        forumUserRe.addComment(thePost, theComment.getCommentBody(), theComment.getAuthor());
//
//        //when
//        boolean result = forumUserRe.removeComment(theComment);
//        //then
//        Assertions.assertTrue(result);
//        Assertions.assertEquals(0, forumUserRe.getCommentsQuantity());
//
//    }
//}
