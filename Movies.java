//********************************************************************
//  Movies.java       Author: Lewis/Loftus
//  Modifier: Davis Haden
//  Date Last Modified: 2/25/2021
//  Demonstrates the use of an array of objects.
//********************************************************************
import java.util.*;
public class Movies
{
   //-----------------------------------------------------------------
   //  Creates a DVDCollection object and adds some DVDs to it. Prints
   //  reports on the status of the collection.
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
      DVDCollection movies = new DVDCollection();
      Scanner input = new Scanner(System.in);
      movies.addDVD("Howl's Moving Castle", "Hayao Miyazaki", 2005, 14.99, false);
      movies.addDVD("Castle in the Sky", "Hayao Miyazaki", 1989, 10.99, false);
      movies.addDVD("Interstellar", "Christopher Nolan", 2014, 7.99, true);
      movies.addDVD("Casablanca", "Michael Curtiz", 1942, 19.95, true);
   
      System.out.print("How would you like to sort? (Title/Price/Year/Provider/Director) ");
      String response = input.nextLine();
      if(response.equalsIgnoreCase("Title")){
         //Selection Sort Titles
         DVDSort.selectionSortTitle(movies);
         System.out.println("Movies Sorted by Name: ");
      }else if(response.equalsIgnoreCase("Price")){
         //Selection Sort Price
         DVDSort.selectionSortPrice(movies);
         System.out.println("Movies Sorted by Price (High to Low): ");
      }else if(response.equalsIgnoreCase("Year")){
         //Insertion Sort Year
         DVDSort.insertionSortYear(movies);
         System.out.println("Movies Sorted by Year (Newest to Oldest): ");
      }else if(response.equalsIgnoreCase("Provider")){
         //Selection Sort Provider
         DVDSort.selectionSortProvider(movies);
         System.out.println("Movies only shown who are provided by Netflix:");
      }else if(response.equalsIgnoreCase("Director")){
         //Selection Sort Director
         DVDSort.selectionSortDirector(movies);
         System.out.println("Movies Sorted by Director: ");
      }
      System.out.print(movies);
   }
}
