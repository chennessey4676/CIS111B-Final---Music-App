import com.google.gson.annotations.SerializedName;

/**
   SearchResult is a class that is the search results from the user entering an artist name and sending that data to the API to search for an artist, and then getting the ID of the artist. 
   It returns all of the search results as an array, which we use to then initialize the Artist and Release classes to get the JSON information from that array.
*/
public class SearchResult
{
   /** The Artist class initialized as an array. */
   @SerializedName("artists")
   private Artist[] artist;
   
   /** The Release class initialized as an array. */
   @SerializedName("releases")
   private Release[] release;
   
   /**
      An accessor method that gets the Artist class array.
      
      @return The Artist class array.
   */
   public Artist[] getArtist()
   {
      return artist;
   }
   
   /**
      An accessor method that gets the Release class array.
      
      @return The Release class array.
   */
   public Release[] getRelease()
   {
      return release;
   }
}