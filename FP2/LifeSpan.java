/**
   LifeSpan is a class that contains additional info about an artist such as when they were born, when they died, and a boolean that tells us if an artist 
   is dead or alive. This class contains some accessor methods to use in other classes.
*/
public class LifeSpan
{
   /** A boolean value for if the artist is dead or alive. */
   private boolean ended;
   /** The date of birth of an artist. */
   private String begin;
   /** The date of death of an artist. */
   private String end;
   
   /**
      An accessor method that gets the boolean value for if an artist is dead or alive.
      
      @return The boolean value for if the artist is dead or alive.
   */
   public boolean getIsDead()
   {
      return ended;
   }
   
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
      return end;
   }
}