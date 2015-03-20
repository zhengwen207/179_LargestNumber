import java.util.*;

public class test{
   
    // main function
    public static void main(String[] args){
 
         int[] A= {1,2,31, 32, 4,5, 9};

         String s=computeLargestNumber(A);

         System.out.println(s);
      }

    // compute the largest number
    public static String computeLargestNumber(int[] A){

         // convert integers into strings
         ArrayList<String> list = new ArrayList<String> ();

         for (int i=0; i<A.length; ++i){

             list.add(Integer.toString(A[i]));

         }

         // Set up comparator
         MyStringComp mycomp = new MyStringComp();

         // sort based on Collections
         Collections.sort(list, mycomp);
          
         // Output the result
         String result="";
        
         for (int i=0; i<list.size(); ++i){

              result += list.get(i);
         }

         return result;
    
     } 

    
    // 

}

class MyStringComp implements Comparator<String>{


   // return negative if int(s1+s2)>int(s2+s1)
   // return positive if int(s1+s2)<int(s2+s1)
   // return 0 if int(s1+s2)==int(s2+s1)

   @Override
   public int compare(String s1, String s2){

       int a1 = Integer.parseInt(s1+s2);
       int a2 = Integer.parseInt(s2+s1);

       return a2-a1;
       
   }
}

