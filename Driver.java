import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Driver
{
    public static void main (String[] args)
    {
        //declare and initialize objects of the subclasses
        Book book1 = new Book("Paradise Lost", 1667, "John Milton", "9780898866537");
        Book book2 = new Book("War and Peace", 1865, "Leo Tolstoy", "9780393096729");
        Book book3 = new Book("The Three Musketeers", 1884, "Alexandre Dumas", "9788085585704");
        CD cd1 = new CD("Let It Bleed", 1969, "Rolling Stones", 9);
        CD cd2 = new CD("Thriller", 1982, "Michael Jackson", 9);
        CD cd3 = new CD("Let It Be", 1970, "Beatles", 12);
        DVD dvd1 = new DVD("The Book Thief", 2013, "Brian Percival", 127);
        DVD dvd2 = new DVD("The Sound of Music", 1965, "Robert Wise", 172);
        DVD dvd3 = new DVD("La La Land", 2016, "Damien Chazelle", 128);

        //declare ArrayList
        ArrayList<LibraryItem> libraryItems = new ArrayList<>();

        //add initialized objects into ArrayList libraryItems
        libraryItems.add(book1);
        libraryItems.add(book2);
        libraryItems.add(book3);
        libraryItems.add(cd1);
        libraryItems.add(cd2);
        libraryItems.add(cd3);
        libraryItems.add(dvd1);
        libraryItems.add(dvd2);
        libraryItems.add(dvd3);

        //declare and initialize boolean repeat
        boolean repeat = true;

        //declare input variable
        int input;

        //declare Scanner object scan
        Scanner scan = new Scanner(System.in);

        //output the menu for the program
        do
        {
            //print Strings explaining menu
            System.out.println("1 - Display Entire Library Catalog");
            System.out.println("2 - Display Books");
            System.out.println("3 - Display CDs");
            System.out.println("4 - Display DVDs");
            System.out.println("5 - Search by Title");
            System.out.println("6 - Add a new item");
            System.out.println("7 - Add new items through a file");
            System.out.println("8 - Export Library Catalogue items as a file");
            System.out.println("9 - Exit");

            //execute try-block
            try
            {
                //set the value of variable input to value of the user's input
                input = scan.nextInt();

                //execute code in if-block if the value of variable input is equal to 1
                if (input == 1)
                {
                    //invoke method displayLibraryCatalogue()
                    displayLibraryCatalog(libraryItems);
                }
                //execute code in else if-block if the value of variable input is equal to 2
                else if (input == 2)
                {
                    //invoke method displayBooks()
                    displayBooks(libraryItems);
                }
                //execute code in else if-block if the value of variable input is equal to 3
                else if (input == 3)
                {
                    //invoke method displayCDs()
                    displayCDs(libraryItems);
                }
                //execute code in else if-block if the value of variable input is equal to 4
                else if (input == 4)
                {
                    //invoke method displayDVDs()
                    displayDVDs(libraryItems);
                }
                //execute code in else if-block if the value of variable input is equal to 5
                else if (input == 5)
                {
                    //invoke method searchByTitle()
                    searchByTitle(libraryItems);
                }
                //execute code in else if-block if the value of variable input is equal to 6
                else if (input == 6)
                {
                    //invoke method addNewItem()
                    addNewItem(libraryItems);
                }
                //execute code in else if-block if the value of variable input is equal to 7
                else if (input == 7)
                {
                    //invoke method addWithFile()
                    addWithFile(libraryItems);
                }
                //execute code in else if-block if the value of variable input is equal to 8
                else if (input == 8)
                {
                    //invoke method exportItemsFile()
                    exportItemsFile(libraryItems);
                }
                //execute code in else if-block if the value of variable input is equal to 9
                else if (input == 9)
                {
                    //set value of boolean repeat to false
                    repeat = false;
                }
                //execute code in else if-block if the value of variable input is NOT an integer from 1-9
                else
                {
                    //throw exception
                    throw new Exception ("Exception: Input did not match menu options");
                }
            }
            //execute code in catch-block if the value of variable input is NOT an integer
            catch (InputMismatchException l)
            {
                //print String stating that the input must be an integer
                System.err.println("Error occurred! Input must be an integer");

                scan.nextLine();
            }
            //execute code in catch-block if the value of variable input is NOT an integer from 1-9
            catch(Exception e)
            {
                //print String stating that the input did not match the menu options
                System.err.println(e.getMessage());

                scan.nextLine();
            }

            //print empty line
            System.out.println();
        }
        //repeat do-loop while value of boolean repeat is true
        while(repeat);
    }

    public static void displayLibraryCatalog(ArrayList<LibraryItem> libraryItems)
    {
        //print String stating that the program will display all the items in the library catalogue
        System.out.println("The program will now display all the items in the Library Catalogue.");
        System.out.println("Library Catalogue: ");

        //loop through ArrayList libraryItems
        for(int i = 0; i < libraryItems.size(); i++)
        {
            //print String stating the information of each object/element in the ArrayList libraryItems
            System.out.println(libraryItems.get(i).toString());
        }
    }


    public static void displayBooks(ArrayList<LibraryItem> libraryItems)
    {
        //print String stating that the program will display all the books in the library catalogue
        System.out.println("The program will now display all the books in the Library Catalogue.");
        System.out.println("Books: ");

        //loop through ArrayList libraryItems
        for(int i = 0; i < libraryItems.size(); i++)
        {
            //execute code in if-block if the object/element in ArrayList libraryItems is of the subclass Book
            if(libraryItems.get(i).getClass().equals(Book.class))//could have done libraryItems.get(i) instanceof Book
            {
                //print String stating the information of the objects of subclass Book in the ArrayList libraryItems
                System.out.println(libraryItems.get(i));
            }
        }
    }


    public static void displayCDs(ArrayList<LibraryItem> libraryItems)
    {
        //print String stating that the program will display all the CDs in the library catalogue
        System.out.println("The program will now display all the CDs in the Library Catalogue.");
        System.out.println("CDs: ");

        //loop through ArrayList libraryItems
        for(int i = 0; i < libraryItems.size(); i++)
        {
            //execute code in if-block if the object/element in ArrayList libraryItems is of the subclass CD
            if(libraryItems.get(i).getClass().equals(CD.class))
            {
                //print String stating the information of the objects of subclass CD in the ArrayList libraryItems
                System.out.println(libraryItems.get(i));
            }
        }
    }


    public static void displayDVDs(ArrayList<LibraryItem> libraryItems)
    {
        //print String stating that the program will display all the DVDs in the library catalogue
        System.out.println("The program will now display all the DVDs in the Library Catalogue.");
        System.out.println("DVDs: ");

        //loop through ArrayList libraryItems
        for(int i = 0; i < libraryItems.size(); i++)
        {
            //execute code in if-block if the object/element in ArrayList libraryItems is of the subclass DVD
            if(libraryItems.get(i).getClass().equals(DVD.class))
            {
                //print String stating the information of the objects of subclass DVD in the ArrayList libraryItems
                System.out.println(libraryItems.get(i));
            }
        }
    }


    public static void searchByTitle(ArrayList<LibraryItem> libraryItems)
    {
        //declare Scanner object scan
        Scanner scan = new Scanner(System.in);

        //print String stating that the program will search for an item based on the user's input
        System.out.println("The program will now search for a specific item.");

        //print String prompting user to enter the title of the item
        System.out.println("Please enter the title of the item.");

        //declare and initialize the value of variable search to be the value of the user's input
        String search = scan.nextLine();

        //declare and initialize boolean exist
        boolean exist = false;

        //loop through ArrayList libraryItems
        for(int i = 0; i < libraryItems.size(); i++)
        {
            //execute code in if-block if value of variable title of the object/element in ArrayList libraryItems is equal to variable search
            if (libraryItems.get(i).getTitle().equals(search))
            {
                //set value of boolean exist to true
                exist = true;

                //print String stating the information of the object/element in ArrayList libraryItems
                System.out.println(libraryItems.get(i));
            }
        }

        //execute code in if-block if value of variable exist is false
        if(!exist)
        {
            //print String stating that item does not exist in the library catalogue
            System.out.println("Sorry! This item does not exist in the Library Catalogue.");

            //print empty line
            System.out.println();
        }
    }


    public static void addNewItem(ArrayList<LibraryItem> libraryItems)
    {
        //print String stating that the program will now allow user to enter a new item into the library catalogue
        System.out.println("The program will now add a new item to the Library Catalogue");

        //declare Scanner object scan
        Scanner scan = new Scanner(System.in);

        //declare boolean repeat
        boolean repeat;

        do
        {
            //print String prompting user to enter what type of item it is
            System.out.println("Please enter Book, CD, or DVD to indicate the type of the item.");

            //declare and initialize the variable itemType to be the value of the user's input
            String itemType = scan.nextLine();

            //set value of boolean repeat to false
            repeat = false;

            //execute code in if-block if value of variable itemType equals String value "Book"
            if (itemType.equalsIgnoreCase("Book"))
            {
                //print String prompting user to enter the title of the book
                System.out.println("Please enter the title of the book");

                //declare and initialize the variable bookTitle to be the value of the user's input
                String bookTitle = scan.nextLine();

                //print String prompting user to enter the year the book was created
                System.out.println("Please enter the year the book was created");

                //declare and initialize the variable bookYear to be the value of the user's input
                int bookYear = scan.nextInt();

                scan.nextLine();

                //print String prompting user to enter the author of the book
                System.out.println("Please enter the author of the book");

                //declare and initialize the variable bookAuthor to be the value of the user's input
                String bookAuthor = scan.nextLine();

                //print String prompting user to enter the isbn of the book
                System.out.println("Please enter the isbn of the book");

                //declare and initialize the variable bookIsbn to be the value of the user's input
                String bookIsbn= scan.nextLine();

                //declare and initialize a new object of subclass Book
                Book newBook = new Book(bookTitle, bookYear, bookAuthor, bookIsbn);

                //loop through ArrayList libraryItems
                for(int i = 0; i < libraryItems.size(); i++)
                {
                    //execute code in if-block if the object/element in ArrayList libraryItems is of the subclass Book
                    if(libraryItems.get(i).getClass().equals(Book.class))
                    {
                        //add new object to ArrayList libraryItems
                        libraryItems.add(i,newBook);

                        //break out of for-loop
                        break;
                    }
                }
            }
            //execute code in else if-block if value of variable itemType equals String value "CD"
            else if (itemType.equalsIgnoreCase("CD"))
            {
                //print String prompting user to enter the title of the CD
                System.out.println("Please enter the title of the CD");

                //declare and initialize the variable cdTitle to be the value of the user's input
                String cdTitle = scan.nextLine();

                //print String prompting user to enter the year the CD was created
                System.out.println("Please enter the year the CD was created");

                //declare and initialize the variable cdYear to be the value of the user's input
                int cdYear = scan.nextInt();

                scan.nextLine();

                //print String prompting user to enter the artist of the CD
                System.out.println("Please enter the artist of the CD");

                //declare and initialize the variable cdArtist to be the value of the user's input
                String cdArtist = scan.nextLine();

                //print String prompting user to enter the number of tracks in the CD
                System.out.println("Please enter the number of tracks in the CD");

                //declare and initialize the variable cdNumOfTracks to be the value of the user's input
                int cdNumOfTracks = scan.nextInt();

                //declare and initialize a new object of subclass CD
                CD newCd = new CD(cdTitle, cdYear, cdArtist , cdNumOfTracks);

                //loop through ArrayList libraryItems
                for(int i = 0; i < libraryItems.size(); i++)
                {
                    //execute code in if-block if the object/element in ArrayList libraryItems is of the subclass CD
                    if(libraryItems.get(i).getClass().equals(CD.class))
                    {
                        //add new object to ArrayList libraryItems
                        libraryItems.add(i,newCd);

                        //break out of for-loop
                        break;
                    }
                }
            }
            //execute code in else if-block if value of variable itemType equals String value "DVD"
            else if (itemType.equalsIgnoreCase("DVD"))
            {
                //print String prompting user to enter the title of the DVD
                System.out.println("Please enter the title of the DVD");

                //declare and initialize the variable dvdTitle to be the value of the user's input
                String dvdTitle = scan.nextLine();

                //print String prompting user to enter the year the DVD was created
                System.out.println("Please enter the year the DVD was created");

                //declare and initialize the variable dvdYear to be the value of the user's input
                int dvdYear = scan.nextInt();

                scan.nextLine();

                //print String prompting user to enter the director of the DVD
                System.out.println("Please enter the director of the DVD");

                //declare and initialize the variable dvdDirector to be the value of the user's input
                String dvdDirector = scan.nextLine();

                //print String prompting user to enter the length of the DVD in minutes
                System.out.println("Please enter the length of the DVD in minutes");

                //declare and initialize the variable minutes to be the value of the user's input
                int minutes = scan.nextInt();

                //declare and initialize a new object of subclass DVD
                DVD newDvd = new DVD(dvdTitle, dvdYear, dvdDirector , minutes);

                //loop through ArrayList libraryItems
                for(int i = 0; i < libraryItems.size(); i++)
                {
                    //execute code in if-block if the object/element in ArrayList libraryItems is of the subclass DVD
                    if(libraryItems.get(i).getClass().equals(DVD.class))
                    {
                        //add new object to ArrayList libraryItems
                        libraryItems.add(i,newDvd);

                        //break out of for-loop
                        break;
                    }
                }
            }
            //execute code in else-block if the value of variable itemType does not equal String values "Book", "CD", or "DVD"
            else
            {
                //print String stating that an error occurred and prompting user to try again (in red)
                System.err.println("Error occurred! Please try again and make sure you enter a valid item type: Book, CD, or DVD.");

                //set value of boolean repeat to true
                repeat = true;
            }
        }
        //repeat do-loop while the value of boolean repeat is true
        while (repeat);

        //print empty line
        System.out.println();
    }


    public static void addWithFile(ArrayList<LibraryItem> libraryItems)
    {
        //declare Scanner object scan
        Scanner scan = new Scanner(System.in);

        //declare boolean repeat
        boolean repeat;

        //declare and initialize Scanner object inputStream as null
        Scanner inputStream = null;

        //add items to library catalogue using a file
        do
        {
            //set value of repeat to false
            repeat = false;

            //print String asking user to enter the name of the file
            System.out.println("Enter the name of your file");

            //declare and initialize variable fileName to be the value of the user's input
            String fileName = scan.next();

            //execute try block
            try
            {
                //initialize Scanner object inputStream by passing a FileInputStream object (constructed by passing variable fileName) as an argument
                inputStream = new Scanner(new FileInputStream(fileName));

            }
            //execute catch-block if file can not be found and/or opened
            catch (FileNotFoundException e)
            {
                //print String stating that the file can not be found and/or opened
                System.err.println("File could not be found and/or opened. Try again.");

                //set value of boolean repeat to true
                repeat = true;
            }

        }
        //repeat do-loop while value of boolean repeat is true
        while(repeat);

        //repeat while-loop if inputStream.hasNextLine() is true
        while(inputStream.hasNextLine())
        {
            //declare and initialize Scanner object aLine by passing the value of inputStream.nextLine() as an argument (object aLine only contains the current line of the file)
            Scanner aLine = new Scanner(inputStream.nextLine());

            //set delimiter for object aLine as ","
            aLine.useDelimiter(",");

            //declare and initialize variable itemType to be the value of the first (String) value of the current line aLine delimited by ","
            String itemType = aLine.next();

            //execute code in if-block if the value of variable itemType equals String value "Book"
            if (itemType.equalsIgnoreCase("Book"))
            {
                //declare and initialize variable titleFileB to be the value of the second (String) value of the current line aLine delimited by ","
                String titleFileB = aLine.next();

                //declare and initialize variable yearFileB to be the value of the third (int) value of the current line aLine delimited by ","
                int yearFileB = aLine.nextInt();

                //declare and initialize variable authorFileB to be the value of the fourth (String) value of the current line aLine delimited by ","
                String authorFileB = aLine.next();

                //declare and initialize variable isbnFileB to be the value of the fifth (String) value of the current line aLine delimited by ","
                String isbnFileB = aLine.next();

                //declare and initialize a new object of subclass Book passing values from current line aLine of the file
                Book newBook = new Book(titleFileB, yearFileB, authorFileB, isbnFileB);

                //loop through ArrayList libraryItems
                for(int i = 0; i < libraryItems.size(); i++)
                {
                    //execute code in if-block if the object/element in ArrayList libraryItems is of the subclass Book
                    if(libraryItems.get(i).getClass().equals(Book.class))
                    {
                        //add new object to ArrayList libraryItems
                        libraryItems.add(i,newBook);

                        //break out of for-loop
                        break;
                    }
                }
            }
            //execute code in else if-block if the value of variable itemType equals String value "CD"
            else if (itemType.equalsIgnoreCase("CD"))
            {
                //declare and initialize variable titleFileC to be the value of the second (String) value of the current line aLine delimited by ","
                String titleFileC = aLine.next();

                //declare and initialize variable yearFileC to be the value of the third (int) value of the current line aLine delimited by ","
                int yearFileC = aLine.nextInt();

                //declare and initialize variable artistFileC to be the value of the fourth (String) value of the current line aLine delimited by ","
                String artistFileC = aLine.next();

                //declare and initialize variable numOfTrackFileC to be the value of the fifth (int) value of the current line aLine delimited by ","
                int numOfTrackFileC = aLine.nextInt();

                //declare and initialize a new object of subclass CD passing values from current line aLine of the file
                CD newCd = new CD(titleFileC, yearFileC, artistFileC, numOfTrackFileC);

                //loop through ArrayList libraryItems
                for(int i = 0; i < libraryItems.size(); i++)
                {
                    //execute code in if-block if the object/element in ArrayList libraryItems is of the subclass CD
                    if(libraryItems.get(i).getClass().equals(CD.class))
                    {
                        //add new object to ArrayList libraryItems
                        libraryItems.add(i,newCd);

                        //break out of for-loop
                        break;
                    }
                }
            }
            //execute code in else-block assuming the value of variable itemType equals String value "DVD"
            else
            {
                //declare and initialize variable titleFileD to be the value of the second (String) value of the current line aLine delimited by ","
                String titleFileD = aLine.next();

                //declare and initialize variable yearFileD to be the value of the third (int) value of the current line aLine delimited by ","
                int yearFileD = aLine.nextInt();

                //declare and initialize variable directorFileD to be the value of the fourth (String) value of the current line aLine delimited by ","
                String directorFileD = aLine.next();

                //declare and initialize variable minutesFileD to be the value of the fifth (int) value of the current line aLine delimited by ","
                int minutesFileD = aLine.nextInt();

                //declare and initialize a new object of subclass DVD passing values from current line aLine of the file
                DVD newDvd = new DVD(titleFileD, yearFileD, directorFileD, minutesFileD);

                //loop through ArrayList libraryItems
                for(int i = 0; i < libraryItems.size(); i++)
                {
                    //execute code in if-block if the object/element in ArrayList libraryItems is of the subclass DVD
                    if(libraryItems.get(i).getClass().equals(DVD.class))
                    {
                        //add new object to ArrayList libraryItems
                        libraryItems.add(i,newDvd);

                        //break out of for-loop
                        break;
                    }
                }
            }
        }

        //close file
        inputStream.close();

        //print empty line
        System.out.println();
    }


    public static void exportItemsFile(ArrayList<LibraryItem> libraryItems)
    {
        //declare and initialize PrintWriter object outputStream as null
        PrintWriter outputStream = null;

        //declare Scanner object scan
        Scanner scan = new Scanner(System.in);

        //declare boolean repeat
        boolean repeat;

        //execute do-loop
        do
        {
            //set value of boolean repeat to false
            repeat = false;

            //print String asking user to enter the name of the file being exported
            System.out.println("Enter the name of the file you will export");

            //declare and initialize variable fileExport to be the value of the user's input
            String fileExport = scan.next();

            //execute try-block
            try
            {
                //initialize PrintWriter object outputStream by passing a FileOutputStream object (constructed by passing variable fileExport) as an argument
                outputStream = new PrintWriter(new FileOutputStream(fileExport, true));
            }
            //execute catch-block if file can not be found and/or opened
            catch (FileNotFoundException e)
            {
                //print String stating that the file can not be found and/or opened
                System.err.println("File could not be found and/or opened. Try again.");

                //set value of boolean repeat to true
                repeat = true;
            }
        }
        //repeat do-loop while boolean repeat is true
        while (repeat);

        //loop through ArrayList libraryItems
        for(int i = 0; i < libraryItems.size(); i++)
        {
            //execute code in if-block if the object/element in ArrayList libraryItems is of the subclass Book
            if (libraryItems.get(i).getClass().equals(Book.class))
            {
                //declare and initialize Book object bookExport to be the value of the object/element in ArrayList libraryItems
                Book bookExport = ((Book) libraryItems.get(i));

                //declare and initialize variable itemType to be the value of String "Book"
                String itemType = "Book";

                //declare and initialize variable titleExportB to be the value of the object's/element's instance variable title
                String titleExportB = bookExport.getTitle();

                //declare and initialize variable yearExportB to be the value of the object's/element's instance variable year
                int yearExportB = bookExport.getYear();

                //declare and initialize variable authorExportB to be the value of the object's/element's instance variable author
                String authorExportB = bookExport.getAuthor();

                //declare and initialize variable isbnExportB to be the value of the object's/element's instance variable isbn
                String isbnExportB = bookExport.getIsbn();

                //append values of variables into the current line in file
                outputStream.println(itemType + "," + titleExportB + "," + yearExportB + "," + authorExportB + "," + isbnExportB);

            }
            //execute code in else if-block if the object/element in ArrayList libraryItems is of the subclass CD
            else if (libraryItems.get(i).getClass().equals(CD.class))
            {
                //declare and initialize CD object cdExport to be the value of the object/element in ArrayList libraryItems
                CD cdExport = ((CD) libraryItems.get(i));

                //declare and initialize variable itemType to be the value of String "CD"
                String itemType = "CD";

                //declare and initialize variable titleExportC to be the value of the object's/element's instance variable title
                String titleExportC = cdExport.getTitle();

                //declare and initialize variable yearExportC to be the value of the object's/element's instance variable year
                int yearExportC = cdExport.getYear();

                //declare and initialize variable artistExportC to be the value of the object's/element's instance variable artist
                String artistExportC = cdExport.getArtist();

                //declare and initialize variable numOfTracksExportC to be the value of the object's/element's instance variable numOfTracks
                int numOfTracksExportC = cdExport.getNumOfTracks();

                //append values of variables into the current line in file
                outputStream.println(itemType + "," + titleExportC + "," + yearExportC + "," + artistExportC + "," + numOfTracksExportC);
            }
            //execute code in else-block assuming the object/element in ArrayList libraryItems is of the subclass DVD
            else
            {
                //declare and initialize DVD object dvdExport to be the value of the object/element in ArrayList libraryItems
                DVD dvdExport = ((DVD) libraryItems.get(i));

                //declare and initialize variable itemType to be the value of String "DVD"
                String itemType = "DVD";

                //declare and initialize variable titleExportD to be the value of the object's/element's instance variable title
                String titleExportD = dvdExport.getTitle();

                //declare and initialize variable yearExportD to be the value of the object's/element's instance variable year
                int yearExportD = dvdExport.getYear();

                //declare and initialize variable directorExportD to be the value of the object's/element's instance variable director
                String directorExportD = dvdExport.getDirector();

                //declare and initialize variable minutesExportD to be the value of the object's/element's instance variable minutes
                int minutesExportD = dvdExport.getMinutes();

                //append values of variables into the current line in file
                outputStream.println(itemType + "," + titleExportD + "," + yearExportD + "," + directorExportD + "," + minutesExportD);
            }
        }

        //close outputStream
        outputStream.close();

        //print empty line
        System.out.println();
    }
}

/*
"C:\Program Files\Java\jdk-20\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2023.2.1\lib\idea_rt.jar=57113:C:\Program Files\JetBrains\IntelliJ IDEA 2023.2.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\enngu\IdeaProjects\CSC121Project2\out\production\CSC121Project2 Driver
1 - Display Entire Library Catalog
2 - Display Books
3 - Display CDs
4 - Display DVDs
5 - Search by Title
6 - Add a new item
7 - Add new items through a file
8 - Export Library Catalogue items as a file
9 - Exit
one
Error occurred! Input must be an integer

1 - Display Entire Library Catalog
2 - Display Books
3 - Display CDs
4 - Display DVDs
5 - Search by Title
6 - Add a new item
7 - Add new items through a file
8 - Export Library Catalogue items as a file
9 - Exit
10
Exception: Input did not match menu options

1 - Display Entire Library Catalog
2 - Display Books
3 - Display CDs
4 - Display DVDs
5 - Search by Title
6 - Add a new item
7 - Add new items through a file
8 - Export Library Catalogue items as a file
9 - Exit
1
The program will now display all the items in the Library Catalogue.
Library Catalogue:
Item Information:
Title: Paradise Lost
Year: 1667
Author: John Milton
ISBN: 9780898866537

Item Information:
Title: War and Peace
Year: 1865
Author: Leo Tolstoy
ISBN: 9780393096729

Item Information:
Title: The Three Musketeers
Year: 1884
Author: Alexandre Dumas
ISBN: 9788085585704

Item Information:
Title: Let It Bleed
Year: 1969
Artist: Rolling Stones
Number of Tracks: 9

Item Information:
Title: Thriller
Year: 1982
Artist: Michael Jackson
Number of Tracks: 9

Item Information:
Title: Let It Be
Year: 1970
Artist: Beatles
Number of Tracks: 12

Item Information:
Title: The Book Thief
Year: 2013
Director: Brian Percival
Minutes: 127min

Item Information:
Title: The Sound of Music
Year: 1965
Director: Robert Wise
Minutes: 172min

Item Information:
Title: La La Land
Year: 2016
Director: Damien Chazelle
Minutes: 128min


1 - Display Entire Library Catalog
2 - Display Books
3 - Display CDs
4 - Display DVDs
5 - Search by Title
6 - Add a new item
7 - Add new items through a file
8 - Export Library Catalogue items as a file
9 - Exit
2
The program will now display all the books in the Library Catalogue.
Books:
Item Information:
Title: Paradise Lost
Year: 1667
Author: John Milton
ISBN: 9780898866537

Item Information:
Title: War and Peace
Year: 1865
Author: Leo Tolstoy
ISBN: 9780393096729

Item Information:
Title: The Three Musketeers
Year: 1884
Author: Alexandre Dumas
ISBN: 9788085585704


1 - Display Entire Library Catalog
2 - Display Books
3 - Display CDs
4 - Display DVDs
5 - Search by Title
6 - Add a new item
7 - Add new items through a file
8 - Export Library Catalogue items as a file
9 - Exit
3
The program will now display all the CDs in the Library Catalogue.
CDs:
Item Information:
Title: Let It Bleed
Year: 1969
Artist: Rolling Stones
Number of Tracks: 9

Item Information:
Title: Thriller
Year: 1982
Artist: Michael Jackson
Number of Tracks: 9

Item Information:
Title: Let It Be
Year: 1970
Artist: Beatles
Number of Tracks: 12


1 - Display Entire Library Catalog
2 - Display Books
3 - Display CDs
4 - Display DVDs
5 - Search by Title
6 - Add a new item
7 - Add new items through a file
8 - Export Library Catalogue items as a file
9 - Exit
4
The program will now display all the DVDs in the Library Catalogue.
DVDs:
Item Information:
Title: The Book Thief
Year: 2013
Director: Brian Percival
Minutes: 127min

Item Information:
Title: The Sound of Music
Year: 1965
Director: Robert Wise
Minutes: 172min

Item Information:
Title: La La Land
Year: 2016
Director: Damien Chazelle
Minutes: 128min


1 - Display Entire Library Catalog
2 - Display Books
3 - Display CDs
4 - Display DVDs
5 - Search by Title
6 - Add a new item
7 - Add new items through a file
8 - Export Library Catalogue items as a file
9 - Exit
5
The program will now search for a specific item.
Please enter the title of the item.
The Little Prince
Sorry! This item does not exist in the Library Catalogue.


1 - Display Entire Library Catalog
2 - Display Books
3 - Display CDs
4 - Display DVDs
5 - Search by Title
6 - Add a new item
7 - Add new items through a file
8 - Export Library Catalogue items as a file
9 - Exit
5
The program will now search for a specific item.
Please enter the title of the item.
La La Land
Item Information:
Title: La La Land
Year: 2016
Director: Damien Chazelle
Minutes: 128min


1 - Display Entire Library Catalog
2 - Display Books
3 - Display CDs
4 - Display DVDs
5 - Search by Title
6 - Add a new item
7 - Add new items through a file
8 - Export Library Catalogue items as a file
9 - Exit
6
The program will now add a new item to the Library Catalogue
Please enter Book, CD, or DVD to indicate the type of the item.
item
Error occurred! Please try again and make sure you enter a valid item type: Book, CD, or DVD.
Please enter Book, CD, or DVD to indicate the type of the item.
Book
Please enter the title of the book
The Little Prince
Please enter the year the book was created
1943
Please enter the author of the book
Antoine de Saint-Exupéry
Please enter the isbn of the book
9780156465113


1 - Display Entire Library Catalog
2 - Display Books
3 - Display CDs
4 - Display DVDs
5 - Search by Title
6 - Add a new item
7 - Add new items through a file
8 - Export Library Catalogue items as a file
9 - Exit
1
The program will now display all the items in the Library Catalogue.
Library Catalogue:
Item Information:
Title: The Little Prince
Year: 1943
Author: Antoine de Saint-Exupéry
ISBN: 9780156465113

Item Information:
Title: Paradise Lost
Year: 1667
Author: John Milton
ISBN: 9780898866537

Item Information:
Title: War and Peace
Year: 1865
Author: Leo Tolstoy
ISBN: 9780393096729

Item Information:
Title: The Three Musketeers
Year: 1884
Author: Alexandre Dumas
ISBN: 9788085585704

Item Information:
Title: Let It Bleed
Year: 1969
Artist: Rolling Stones
Number of Tracks: 9

Item Information:
Title: Thriller
Year: 1982
Artist: Michael Jackson
Number of Tracks: 9

Item Information:
Title: Let It Be
Year: 1970
Artist: Beatles
Number of Tracks: 12

Item Information:
Title: The Book Thief
Year: 2013
Director: Brian Percival
Minutes: 127min

Item Information:
Title: The Sound of Music
Year: 1965
Director: Robert Wise
Minutes: 172min

Item Information:
Title: La La Land
Year: 2016
Director: Damien Chazelle
Minutes: 128min


1 - Display Entire Library Catalog
2 - Display Books
3 - Display CDs
4 - Display DVDs
5 - Search by Title
6 - Add a new item
7 - Add new items through a file
8 - Export Library Catalogue items as a file
9 - Exit
5
The program will now search for a specific item.
Please enter the title of the item.
The Little Prince
Item Information:
Title: The Little Prince
Year: 1943
Author: Antoine de Saint-Exupéry
ISBN: 9780156465113


1 - Display Entire Library Catalog
2 - Display Books
3 - Display CDs
4 - Display DVDs
5 - Search by Title
6 - Add a new item
7 - Add new items through a file
8 - Export Library Catalogue items as a file
9 - Exit
7
Enter the name of your file
file.csv
File could not be found and/or opened. Try again.
Enter the name of your file
newItems.csv


1 - Display Entire Library Catalog
2 - Display Books
3 - Display CDs
4 - Display DVDs
5 - Search by Title
6 - Add a new item
7 - Add new items through a file
8 - Export Library Catalogue items as a file
9 - Exit
1
The program will now display all the items in the Library Catalogue.
Library Catalogue:
Item Information:
Title: The Swiss Family Robinson
Year: 1812
Author: Johann David Wyss
ISBN: 9780582541573

Item Information:
Title: The Little Prince
Year: 1943
Author: Antoine de Saint-Exupéry
ISBN: 9780156465113

Item Information:
Title: Paradise Lost
Year: 1667
Author: John Milton
ISBN: 9780898866537

Item Information:
Title: War and Peace
Year: 1865
Author: Leo Tolstoy
ISBN: 9780393096729

Item Information:
Title: The Three Musketeers
Year: 1884
Author: Alexandre Dumas
ISBN: 9788085585704

Item Information:
Title: Let's Talk About Love
Year: 1895
Artist: Modern Talking
Number of Tracks: 10

Item Information:
Title: Let It Bleed
Year: 1969
Artist: Rolling Stones
Number of Tracks: 9

Item Information:
Title: Thriller
Year: 1982
Artist: Michael Jackson
Number of Tracks: 9

Item Information:
Title: Let It Be
Year: 1970
Artist: Beatles
Number of Tracks: 12

Item Information:
Title: Ratatouille
Year: 2007
Director: Brad Bird
Minutes: 111min

Item Information:
Title: The Book Thief
Year: 2013
Director: Brian Percival
Minutes: 127min

Item Information:
Title: The Sound of Music
Year: 1965
Director: Robert Wise
Minutes: 172min

Item Information:
Title: La La Land
Year: 2016
Director: Damien Chazelle
Minutes: 128min


1 - Display Entire Library Catalog
2 - Display Books
3 - Display CDs
4 - Display DVDs
5 - Search by Title
6 - Add a new item
7 - Add new items through a file
8 - Export Library Catalogue items as a file
9 - Exit
8
Enter the name of the file you will export
exportFile.csv


1 - Display Entire Library Catalog
2 - Display Books
3 - Display CDs
4 - Display DVDs
5 - Search by Title
6 - Add a new item
7 - Add new items through a file
8 - Export Library Catalogue items as a file
9 - Exit
9


Process finished with exit code 0
 */