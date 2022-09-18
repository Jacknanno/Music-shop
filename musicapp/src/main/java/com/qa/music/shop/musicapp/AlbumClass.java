package com.qa.music.shop.musicapp;
import org.springframework.cglib.reflect.MethodDelegate.Generator;

import org.apache.tomcat.util.threads.TaskThread;
import com.qa.music.shop.musicapp.entity.Entity;
import com.qa.music.shop.musicapp.entity.GeneratedValue;
import javax.persistence.column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;







@Entity 
public class AlbumClass {
   @com.qa.music.shop.musicapp.entity.Id 
   @GeneratedValue(strategy = Generator.AUTO)
    private String album_id;
    private String[] artist;
    private Int[] price;
    private String album_name;
    private Float[] length;
    private String genre;
   

    //Constructors
    public AlbumClass(String album_name, String[] artist, Int[] price, String album_id, Float[] length, String genre) {
        this.album_name = album_name;
        this.artist = artist;
        this.price = price;
        this.album_id = album_id;
        this.length = length;
        this.genre = genre;
    }

    //Getters and Setters
    public String getAlbum_name() {
        return album_name;
    }

    public void setAlbum_name(String album_name) {
        this.album_name = album_name;
    }

    public String[] getArtist() {
        return artist;
    }

    public void setArtist(String[] artist) {
        this.artist = artist;
    }

    public Int[] getPrice() {
        return price;
    }

    public void setPrice(Int[] price) {
        this.price = price;
    }

    public String getAlbum_id() {
        return album_id;
    }

    public void setAlbum_id(String album_id) {
        this.album_id = album_id;
    }

    public Float[] getLength() {
        return length;
    }

    public void setLength(Float[] length) {
        this.length = length;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


    

    
}
