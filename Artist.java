import com.google.gson.annotations.SerializedName;

/**
   Artist is a class that simply represents an artist. It's taken from the MusicBrainz API and read from the JSON file produced. This class includes information 
   such as the type of artist, their name, the lifeSpan class (which includes more information), their gender, and what country they reside in.
*/
public class Artist
{
   /** The ID of an artist on the MusicBrainz database. */
   private String id;
   /** The full name of an artist. */
   private String name;
   /** The gender of an artist. */
   private String gender;
   /** The country that an artist resides in. */
   private String country;
   /** The type of artist or genre of the artist. */
   private String disambiguation;
   
   /** The lifeSpan class initialized as a variable. */
   @SerializedName("life-span") //This allows us to name the variable whatever we want while it grabs the proper name from the JSON as the name "life-span" wouldn't work.
   private LifeSpan lifeSpan;
   
   /**
      An accessor method that gets the ID of an artist on the MusicBrainz database.
      
      @return The ID of the artist on the MusicBrainz database.
   */
   public String getArtistID()
   {
      return id;
   }
   
   /**
      An accessor method that gets the full name of an artist.
      
      @return The full name of the artist.
   */
   public String getArtistName()
   {
      return name;
   }
   
   /**
      An accessor method that gets the gender of an artist. It also takes the JSON data and makes the first letter capitalized, then returns this.
      
      @return The gender of the artist.
   */
   public String getGender()
   {
      gender = gender.substring(0, 1).toUpperCase() + gender.substring(1);
      
      return gender;
   }
   
   /**
      An accessor method that gets the country that an artist resides in.
      
      @return The country that the artist resides in.
   */
   public String getCountry()
   {
      return country;
   }
   
   /**
      An accessor method that gets the type of artist or genre of an artist.
      
      @return The type of artist or genre of the artist.
   */
   public String getGenre()
   {
      return disambiguation;
   }
   
   /**
      An accessor method that gets the lifeSpan class.
      
      @return The lifeSpan class.
   */
   public LifeSpan getLifeSpan()
   {
      return lifeSpan;
   }
}