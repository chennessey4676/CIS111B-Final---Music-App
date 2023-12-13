/**
   Release is a class that simply represents a release from an artist such as an album or a single. It's taken from the MusicBrainz API and read from the JSON file produced.
*/
public class Release
{
   /** The name of a release. */
   private String title;
   
   /**
      An accessor method that gets the name of a release.
      
      @return The name of the release.
   */
   public String getReleaseTitle()
   {
      return title;
   }
}