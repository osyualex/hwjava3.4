package ru.netology.movieManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class movieManagerTest {

    @Test
    public void testMovieManagerAdd() {
        movieManager manager = new movieManager();

        manager.add("Film 1");


        String[] expected = {"Film 1"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testMovieManagerAll() {
        movieManager manager = new movieManager();

        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");

        String[] expected = {"Film 1", "Film 2", "Film 3"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testMovieManagerLast() {
        movieManager manager = new movieManager();

        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");

        String[] expected = {"Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }


}
