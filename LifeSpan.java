/**
   LifeSpan is a class that contains additional info about an artist such as when they were born and when they died. This class contains some accessor methods to use in other classes.
*/
public class LifeSpan
{
   /** The date of birth of an artist. */
   private String begin;
   /** The date of death of an artist. */
   private String ended;
   
   /**
      An accessor method that gets the value for an artist's date of birth.
      
      @return The date of birth of the artist.
   */
   public String getDateOfBirth()
   {
      return begin;
   }
   
   /**
      An accessor method that gets the value for an artist's date of death.
      
      @return The date of death of the artist.
   */
   public String getDateOfDeath()
   {
      return ended;
   }
}