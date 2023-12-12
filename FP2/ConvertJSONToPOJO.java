import com.google.gson.Gson;

public class ConvertJSONToPOJO
{
   public static void main(String[] args)
   {
      // MusicBrainz API - https://musicbrainz.org/doc/MusicBrainz_API
      
      // https://musicbrainz.org/ws/2/artist/f90e8b26-9e52-4669-a5c9-e28529c47894?fmt=json
      String artistData = """
      {"disambiguation":"US rapper","type":"Person","gender-id":"36d3d30a-839d-3eda-8cb3-29be4384e4a9","isnis":["0000000120269646"],"id":"f90e8b26-9e52-4669-a5c9-e28529c47894","name":"Snoop Dogg","life-span":{"ended":false,"begin":"1971-10-20","end":null},"ipis":[],"end-area":null,"type-id":"b6e035f4-3ce9-331c-97df-83397230b0df","sort-name":"Snoop Dogg","gender":"Male","country":"US","area":{"sort-name":"United States","disambiguation":"","id":"489ce91b-6658-3307-9877-795b68554c98","name":"United States","type":null,"type-id":null,"iso-3166-1-codes":["US"]},"begin_area":{"name":"Long Beach","id":"e183ffae-1d35-4c78-b552-957535e40af1","type":null,"sort-name":"Long Beach","disambiguation":"","type-id":null},"end_area":null,"begin-area":{"name":"Long Beach","id":"e183ffae-1d35-4c78-b552-957535e40af1","type":null,"sort-name":"Long Beach","disambiguation":"","type-id":null}}
      """;
      
      // https://musicbrainz.org/ws/2/release-group/649762c9-8785-3d9c-803d-2f0496f168e5?fmt=json
      String releaseData = """
      {"first-release-date":"1993-11-23","disambiguation":"","secondary-type-ids":[],"secondary-types":[],"primary-type":"Album","id":"649762c9-8785-3d9c-803d-2f0496f168e5","title":"Doggystyle","primary-type-id":"f529b476-6e62-324f-b0aa-1f3e33d313fc"}
      """;
      
      Gson gson = new Gson();
      
      Artist artist = gson.fromJson(artistData, Artist.class);
      Release release = gson.fromJson(releaseData, Release.class);
      
      System.out.println(artist);
      System.out.println();
      System.out.println(release);
   }
}