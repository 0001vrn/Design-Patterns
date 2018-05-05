package com.pluralsight.prototype;

public class PrototypeDemo {
    public static void main(String[] args) {
        Registry registry = new Registry();
        Movie movie = (Movie) registry.createItem("Movie");
        movie.setTitle("Creational Pattern in java");

        System.out.println("movie = " + movie);
        System.out.println("movie.getRuntime() = " + movie.getRuntime());
        System.out.println("movie.getTitle() = " + movie.getTitle());
        System.out.println("movie.getUrl() = " + movie.getUrl());

        Movie anotherMovie = (Movie) registry.createItem("Movie");
        anotherMovie.setTitle("Gang of Four");

        System.out.println("anotherMovie = " + anotherMovie);
        System.out.println("anotherMovie.getRuntime() = " + anotherMovie.getRuntime());
        System.out.println("anotherMovie.getTitle() = " + anotherMovie.getTitle());
        System.out.println("anotherMovie.getUrl() = " + anotherMovie.getUrl());
    }
}
