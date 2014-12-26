package org.song.git.cglibproxy;

/**
 * Created with IntelliJ IDEA.
 * User: rodsong
 * Date: 2014-23-12 12:47
 * To change
 */

public class TestCglib {

    public static void main(String[] args) {
        BookFacadeCglib cglib=new BookFacadeCglib();
        Book bookCglib=(Book)cglib.getInstance(new Book());
        bookCglib.addBook();
    }
}