public class Book extends LibraryItem
{
    //declare instance variables
    private String author;
    private String isbn;


    //default constructor
    public Book()
    {
        super();
        author = "";
        isbn = "";
    }


    //overloaded constructor
    public Book(String title, int year, String author, String isbn)
    {
        super(title, year);
        this.author = author;
        this.isbn = isbn;
    }


    //return value of variable author
    public String getAuthor()
    {
        return author;
    }

    //return value of variable isbn
    public String getIsbn()
    {
        return isbn;
    }


    //set or change the value of variable author to the value of the passed argument
    public void setAuthor(String author)
    {
        this.author = author;
    }

    //set or change the value of variable isbn to the value of the passed argument
    public void setIsbn(String isbn)
    {
        this.isbn = isbn;
    }


    //return String stating the information in the object
    public String toString()
    {
        return super.toString()
                + "Author: " + author+  "\n"
                + "ISBN: " +isbn + "\n";
    }
}
