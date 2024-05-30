package com.spring.music.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("songs")
public class Song {
    @Id
    private String id;
    private String name;
    private String artist;
    private String genre;
    private String releaseDate;
    private double reproductions;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public double getReproductions() {
        return reproductions;
    }

    public void setReproductions(double reproductions) {
        this.reproductions = reproductions;
    }

}

