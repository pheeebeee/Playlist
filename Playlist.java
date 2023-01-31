import java.util.*;


/**
 * The Playlist class, which will keep track of a playlist of Song objects
 * Refer to the project description to make sure you have access to all available methods
 */
public class Playlist {
    /**
     * Fields-- This will likely just need to be the ArrayList of Songs. Reference our previous problems
     * (CarDealership, Zoo) for structure on how this will look
     */
    private ArrayList<Song> songs;




     /**
      * Constructor-- this doesn't need any parameters. You should just initialize the ArrayList and
      * then use additional methods to add Songs in one-by-one
      */
      public Playlist(){
        songs = new ArrayList<Song>();
      }


      

      /**
       * Methods-- Remember that you need to be able to complete all of the following:
       * Adding a song
       * 'liking' a song
       * Removing a specific song
       * Examining all Songs (a String return or void print makes sense here)
       * Examining a sublist of all liked songs
       * Determining the total duration of all songs
       * Removing all unliked songs from the playlist (careful with this one!)
       */
      public void addSong(Song song){
        songs.add(song);
      }
      public void removeSong(int index){
        songs.remove(index-1);
      }
      public ArrayList<String> examineSongs(){
        ArrayList<String> allSongs = new ArrayList<>();
        for(int i =0; i<songs.size(); i++){
          Song current = songs.get(i);
          String currName = current.getName();
          int currLength = current.getLength();
          String currFinalLength = " (" + currLength / 60 + " : " + currLength % 60 + ") ";
          String currArtist = current.getArtist();
          boolean currLiked = current.getLiked();
          String summary = "\"" + currName + "\"" + "by" + currArtist + currFinalLength;
          if(currLiked == true){
            summary += "--liked";
          }
          allSongs.add(summary);
        }
        return allSongs; 
      }
      public ArrayList<String> examineLikedSongs(){
        ArrayList<String> likedSongs = new ArrayList<>();
        for(int i =0; i<songs.size(); i++){
          Song current = songs.get(i);
          String currName = current.getName();
          int currLength = current.getLength();
          String currFinalLength = " (" + currLength / 60 + " : " + currLength % 60 + ") ";
          String currArtist = current.getArtist();
          boolean currLiked = current.getLiked();
          String summary = "\"" + currName + "\"" + "by" + currArtist + currFinalLength;
          if(currLiked == true){
            summary += "--liked";
            likedSongs.add(summary);
          }
        }
        return likedSongs;
      }
      public String totalDuration(){
        int totalDuration = 0;
        for(int i = 0; i<songs.size(); i++){
          Song current = songs.get(i);
          int currLength = current.getLength();
          totalDuration +=currLength;
        }
        String finalTotalDuration = " (" + totalDuration / 60 + " : " + totalDuration % 60 + ") ";
        return finalTotalDuration;

      }
      public void likeSong(){
        
      }
      public void removeSong(int index){
        songs.remove(index);

}
}
