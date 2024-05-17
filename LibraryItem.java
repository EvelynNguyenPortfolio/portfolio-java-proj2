public class LibraryItem
{
    //declare instance variables
    private String title;
    private int year;


    //default constructor
    public LibraryItem()
    {
        title = "";
        year = 0;
    }


    //overloaded constructor
    public LibraryItem(String title, int year)
    {
        this.title = title;
        this.year = year;
    }


    //return value of variable title
    public String getTitle()
    {
        return title;
    }

    //return value of variable year
    public int getYear()
    {
        return year;
    }


    //set or change the value of variable title to the value of the passed argument
    public void setTitle(String title)
    {
        this.title = title;
    }

    //set or change the value of variable year to the value of the passed argument
    public void setYear(int year)
    {
        this.year = year;
    }


    //return String stating the information in the object
    public String toString()
    {
        return "Item Information:" + "\n"
                + "Title: " + title +  "\n"
                + "Year: " + year +  "\n";
    }
}
