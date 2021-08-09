public class DVDSort{
   //Sorting by DVD Name A-Z
   public static void selectionSortTitle(DVDCollection m){
      DVD[] sortedCollection = m.returnArray();
      for(int i = 0; i < sortedCollection.length-1; i++){
         String temp;
         String temp2;
         DVD tempObj;
         int tempIndex = 0;
         int j = 0;
         try{
            temp = sortedCollection[i].getTitle();
         }catch(Exception e){
            break;
         }
         for(j = i + 1; j < sortedCollection.length; j++){
            try{
               temp2 = sortedCollection[j].getTitle();
            }catch(Exception e){
               break;
            }
            if(temp.compareTo(temp2) > 0){
               temp = temp2;
               tempObj = sortedCollection[i];
               sortedCollection[i] = sortedCollection[j];
               sortedCollection[j] = tempObj;
            }
         }
      }
   }
   //Sorting by DVD Price
   public static void selectionSortPrice(DVDCollection m){
      DVD[] sortedCollection = m.returnArray();
      DVD temp;
      for(int i = 0; i < sortedCollection.length-1; i++){
         for(int j = i+1; j < sortedCollection.length; j++){
            try{
               if(sortedCollection[j].getCost() > sortedCollection[i].getCost()){
                  temp = sortedCollection[j];
                  sortedCollection[j] = sortedCollection[i];
                  sortedCollection[i] = temp;
                  //i = i - 2;
               }
            }catch(Exception e){
               break;
            }
         }
      }      
   }
   //Sorting DVD by Year
   public static void insertionSortYear(DVDCollection m){
      DVD[] sortedCollection = m.returnArray();
      DVD temp;
      for(int i = 1; i < sortedCollection.length-1; i++){
         int j = i-1;
         try{
            while(sortedCollection[j].getYear() < sortedCollection[i].getYear()){
               temp = sortedCollection[j];
               sortedCollection[j] = sortedCollection[i];
               sortedCollection[i] = temp;
               i = i - 2;
            }
         }catch(Exception e){
            break;
         }
      }
   }
   //Only show Netflix DVD
   public static void selectionSortProvider(DVDCollection m){
      DVD[] sortedCollection = m.returnArray();
      DVD temp;
      for(int i = 0; i < sortedCollection.length-1; i++){
         for(int j = i + 1; j < sortedCollection.length; j++){
            try{
               if(sortedCollection[i].getProvider() == false && sortedCollection[j].getProvider() == true){
                  temp = sortedCollection[i];
                  sortedCollection[i] = sortedCollection[j];
                  sortedCollection[j] = temp;
               }
            }catch(Exception e){
               break;
            }
         }
      }
   }
   //Sorting by the Director
   public static void selectionSortDirector(DVDCollection m){
      DVD[] sortedCollection = m.returnArray();
      for(int i = 0; i < sortedCollection.length-1; i++){
         String temp;
         String temp2;
         DVD tempObj;
         int tempIndex = 0;
         int j = 0;
         try{
            temp = sortedCollection[i].getDirector();
         }catch(Exception e){
            break;
         }
         for(j = i + 1; j < sortedCollection.length; j++){
            try{
               temp2 = sortedCollection[j].getDirector();
            }catch(Exception e){
               break;
            }
            if(temp.compareTo(temp2) > 0){
               temp = temp2;
               tempObj = sortedCollection[i];
               sortedCollection[i] = sortedCollection[j];
               sortedCollection[j] = tempObj;
            }
         }
      }
   }
}