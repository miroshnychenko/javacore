package com.serhii.app.ThinkFirst;

public class MovieTestDrive {
    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = "How to ...";
        one.genre = "Tragic";
        one.raiting = -2;

        Movie two = new Movie();
        two.title = "Lost in office";
        two.genre = "Comedy";
        two.raiting = 5;
        two.playIt();

        Movie three = new Movie();
        three.title = "Byte club";
        three.genre = "Tragic comedy";
        two.raiting = 127;
    }
}
