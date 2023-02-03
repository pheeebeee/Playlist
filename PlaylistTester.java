/**
 * Sample of a tester file for the Playlist class. This file should demonstrate all the capability of your
 * playlist in the main method. You don't need to follow the testing specifications of this exactly
 * if you want to write your own separate tester instead.
 * Note that there's no need for a Scanner in this project-- all of the playlist can be 'hardcoded' into main.
 * @author
 * @version
 */
import java.util.*;
public class PlaylistTester {
    public static void main(String[] args) {
        System.out.println("Initializing a Playlist...\n");
        //Make your playlist here
        Playlist p = new Playlist();

        System.out.println("Adding songs to the Playlist...\n");
        /**
         * Add some songs here. Note that the format for adding a Song to a Playlist p
         * is something like...
         * p.addSong(new Song(..., ..., ...))
         */
        
        p.addSong(new Song("Bigmouth Strikes Again", "The Smiths", "3:24"));
        p.addSong(new Song("Where The Streets Have No Name", "U2", "5:38"));
        p.addSong(new Song("Police And Thieves", "The Clash", "6:03"));
        p.addSong(new Song("Roxanne", "The Police", "3:12"));
        p.addSong(new Song("Step To My Girl", "Souls of Mischief", "4:08"));
        p.addSong(new Song("I Confess", "English Beat", "4:31"));
        p.addSong(new Song("Dim All The Lights", "Donna Summer", "4:40"));
        p.addSong(new Song("Passin Me By", "The Pharcyde", "5:03"));
    


        System.out.println("Printing the songs...\n");
        //Print out all the songs in the playlist to verify it's working correctly
        ArrayList<String> summary = new ArrayList<>();
        summary = p.examineSongs();
        System.out.println(summary);

        System.out.println("\nLiking the songs in position X, Y, Z, etc....\n");
        //Once your songs are 'liked', this should be reflected in the next printout
        p.likeSong(4);
        p.likeSong(5);
        p.likeSong(2);


        System.out.println("Printing the songs...\n");
        summary = p.examineSongs();
        System.out.println(summary);

        System.out.println("\nRemoving the song in position A, B, C, etc...\n");
        p.removeSong(1);
        p.removeSong(3);


        System.out.println("Printing the songs...\n");
        summary = p.examineSongs();
        System.out.println(summary);


        System.out.println("\nPrinting only the liked songs...\n");
        //Your Playlist should be able to do this without looping while in main!


        System.out.println("\nPrinting the total duration of all songs...\n");
        //Note that the format should look something like minutes:seconds


        System.out.println("\nRemoving all unliked songs from the playlist...\n");
        //This should be doable with a single method call


        System.out.println("Printing all songs...\n");
        //This should now look like only the liked songs list from before
    }
}
