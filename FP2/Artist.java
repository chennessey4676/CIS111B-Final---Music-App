import com.google.gson.annotations.SerializedName;

/**
   Artist is a class that simply represents an artist. It's taken from the MusicBrainz API and read from the JSON file produced. This class includes information 
   such as the type of artist, their name, the lifeSpan class (which includes more information), their gender, and what country they reside in.
*/
public class Artist
{
   /** The type of artist or genre of the artist. */
   private String disambiguation;
   /** The full name of an artist. */
   private String name;
   
   /** The lifeSpan class initialized as a variable. */
   @SerializedName("life-span") //This allows us to name the variable whatever we want while it grabs the proper name from the JSON as the name "life-span" wouldn't work.
   private LifeSpan lifeSpan;
   /** The gender of an artist. */
   private String gender;
   /** The country that an artist resides in. */
   private String country;
   
   /**
      Overrides the toString method to return a nicely formatted string of an Artist object. It includes an if statement to check if the artist death boolean in the LifeSpan 
      class is true or false. Depending on the result, it will return the formatted string to the console.
      
      @return A formatted string of an Artist class and all of it's values which will be printed to the console.
   */
   public String toString()
   {
      if (lifeSpan.getIsDead() == true)
      {
         return "Artist: " + name + "\nGenre/Type: " + disambiguation + "\nDate of Birth: " + lifeSpan.getDateOfBirth() + "\nDate of Death: " + lifeSpan.getDateOfDeath() + "\nGender: " + gender + "\nCountry: " + country;
      }
      
      else
      {
         return "Artist: " + name + "\nGenre/Type: " + disambiguation + "\nAre they dead? " + lifeSpan.getIsDead() + "\nDate of Birth: " + lifeSpan.getDateOfBirth() + "\nGender: " + gender + "\nCountry: " + country;
      }
   }
}