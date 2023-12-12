import com.google.gson.annotations.SerializedName;

/**
   Release is a class that simply represents a release from an artist such as an album or a single. It's taken from the MusicBrainz API and read from the JSON file produced. 
   This class includes information such as the date of the release, the type of release, and the release's name.
*/
public class Release
{
   /** The date the release was published. */
   @SerializedName("first-release-date")
   private String releaseDate;
   
   /** The type of release. */
   @SerializedName("primary-type")
   private String releaseType;
   /** The name of a release. */
   private String title;
   
   /**
      Overrides the toString method to return a nicely formatted string of a Release object.
      
      @return A formatted string of a Release class and all of it's values which will be printed to the console.
   */
   public String toString()
   {
      return "Release name: " + title + "\nRelease type: " + releaseType + "\nRelease date: " + releaseDate;
   }
}