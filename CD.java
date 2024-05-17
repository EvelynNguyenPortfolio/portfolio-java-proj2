public class CD extends LibraryItem
{
    //declare instance variables
    private String artist;
    private int numOfTracks;


    //default constructor
    public CD()
    {
        super();
        artist = "";
        numOfTracks = 0;
    }


    //overloaded constructor
    public CD(String title, int year, String artist, int numOfTracks)
    {
        super(title, year);
        this.artist = artist;
        this.numOfTracks = numOfTracks;
    }


    //return value of variable artist
    public String getArtist()
    {
        return artist;
    }

    //return value of variable numOfTracks
    public int getNumOfTracks()
    {
        return numOfTracks;
    }


    //set or change the value of variable artist to the value of the passed argument
    public void setArtist(String artist) {
        this.artist = artist;
    }

    //set or change the value of variable numOfTracks to the value of the passed argument
    public void setNumOfTracks(int numOfTracks)
    {
        this.numOfTracks = numOfTracks;
    }


    //return String stating the information in the object
    public String toString()
    {
        return super.toString()
                + "Artist: " + artist + "\n"
                + "Number of Tracks: " + numOfTracks + "\n";
    }
}
