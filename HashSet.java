
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kanev
 */
public class HashSet {
    public static void main(String[] args) {
         java.util.HashSet<String> set = new java.util.HashSet<String>();
          set.add("Red");
          set.add("Green");
          set.add("Black");
          set.add("White");
          set.add("Pink");
          set.add("Yellow");
    System.out.println("Original Hash Set: " + set);
    System.out.println("Size of the Hash Set: " + set.size());
   }
}
