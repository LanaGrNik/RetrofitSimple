package com.example.afrodita.retrofityandex;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Afrodita on 04.12.2017.
 */

public class Item implements Serializable {

   public int id;
   public String name;
   public ArrayList<String> genres;
   public int tracks;
   public int albums;
   public String link;
   public String description;
   public Cover cover;


   public int getId(){ return id;}

   public void setId(int id){this.id = id;}

   public String getName() {
      return name;
   }

   public void setName(String name){this.name = name;}


   public ArrayList<String> getGenres() {
      return genres;
   }

   public void setGenres(ArrayList<String> genres) {
      this.genres = genres;
   }

   public int getTracks() {
      return tracks;
   }

   public void setTracks(int tracks) {
      this.tracks = tracks;
   }

   public int getAlbums() {
      return albums;
   }

   public void setAlbums(int albums) {
      this.albums = albums;
   }

   public String getLink() {
      return link;
   }

   public void setLink(String link) {
      this.link = link;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public Cover getCover() {
      return cover;
   }

   public void setCover(Cover cover) {
      this.cover = cover;
   }

   @Override
   public String toString() {
      return  name +"\n" + genres +"\n"+ tracks + " tracks, " + albums + " albums";
   }
}

