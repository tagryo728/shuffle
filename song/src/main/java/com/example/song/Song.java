package com.example.song;



public class Song {

   // 項番
   public int id;
   // 曲名
   public String music;

   public void song(int id, String music) {
      this.id = id;
      this.music = music;
   }

   public int getId() {
      return id;
   }

   public String getMusic() {
      return music;
   }

   public void setId(int id) {
      this.id = id;
   }

   public void setMusic(String music) {
      this.music = music;
   }

}