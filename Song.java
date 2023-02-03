/**
 * File for a Song class to be used in the Playlist Project
 * @author Phoebe Salvati
 * @version January 2023
 */
public class Song {
    //Fields-- what information do we want each Song to store?
    private String title;
    private String artist;
    private boolean liked;
    private int duration;

    /**
     * Constructor-- what information needs to be given to make a Song?
     * How will you handle 'liked' songs? It makes sense for a Song not be 'liked' by default
     */
    public Song(String myTitle, String myArtist, String myDuration){
        title  = myTitle;
        artist = myArtist;
        liked = false;
        int minSum = Integer.parseInt(myDuration.substring(0,1));
        int secSum = Integer.parseInt(myDuration.substring(2,4));
        duration = minSum*60 + secSum;
        
        

        
    }


     /**
      * Methods-- what will you want each Song to do?
      * Consider all the getter methods (getName, getArtist, etc.)
      * You should probably have a toString method to be able to get the information for the full
      * song easily as well!
      * What kind of mutator (setter) methods will you need?
      */
      public String getName(){
        return title;
      }
      public String getArtist(){
        return artist;
      }
      public void like(){
        liked = true;
      }
      public void unlike(){
        liked = false;
      }
      public int getLength(){
        return duration;
      }

      public boolean getLiked(){
        return liked;
      }
}
