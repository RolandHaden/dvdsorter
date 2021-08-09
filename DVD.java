//********************************************************************
//  DVD.java       Author: Lewis/Loftus
//
//  Represents a DVD video disc.
//********************************************************************

import java.text.NumberFormat;

public class DVD
{
   private String title, director;
   private int year;
   private double cost;
   private boolean netflix;

   //-----------------------------------------------------------------
   //  Creates a new DVD with the specified information.
   //-----------------------------------------------------------------
   public DVD(String title, String director, int year, double cost,
      boolean netflix)
   {
      this.title = title;
      this.director = director;
      this.year = year;
      this.cost = cost;
      this.netflix = netflix;
   }
   
   //-----------------------------------------------------------------
   //  Returns the different attributes to the DVD object.
   //-----------------------------------------------------------------
   public String getTitle(){
      return title;
   }
   public String getDirector(){
      return director;
   }
   public int getYear(){
      return year;
   }
   public double getCost(){
      return cost;
   }
   public boolean getProvider(){
      return netflix;
   }
   //-----------------------------------------------------------------
   //  Returns a string description of this DVD.
   //-----------------------------------------------------------------
   public String toString()
   {
      NumberFormat fmt = NumberFormat.getCurrencyInstance();

      String description;

      description = fmt.format(cost) + "\t" + year + "\t";
      description += title + "\t" + director;

      if (netflix)
         description += "\t" + "Available on Netflix";

      return description;
   }
}
