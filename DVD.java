public class DVD extends LibraryItem
{
    //declare instance variables
    private String director;
    private int minutes;


    //default constructor
    public DVD()
    {
        super();
        director = "";
        minutes = 0;
    }


    //overloaded constructor
    public DVD(String title, int year, String director, int minutes)
    {
        super(title, year);
        this.director = director;
        this.minutes = minutes;
    }


    //return value of variable director
    public String getDirector()
    {
        return director;
    }

    //return value of variable minute
    public int getMinutes()
    {
        return minutes;
    }


    //set or change the value of variable director to the value of the passed argument
    public void setDirector(String director)
    {
        this.director = director;
    }

    //set or change the value of variable minute to the value of the passed argument
    public void setMinutes(int minutes)
    {
        this.minutes = minutes;
    }


    //return String stating the information in the object
    public String toString()
    {
        return super.toString()
                + "Director: " + director +  "\n"
                + "Minutes: " + minutes + "min" +  "\n";
    }
}
