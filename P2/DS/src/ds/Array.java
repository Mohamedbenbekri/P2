/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ds;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Benbekri
 */
public class Array {
    
    public static void main(String[] args) {
        
    
        LinkedList<String> msl=new LinkedList<String>();
        msl.add("One ");
        msl.add("Two");
        
        
        msl.forEach(s->
            System.out.println(s));
        
        
        msl.forEach((s)-> {
            System.out.println(s);
            System.out.println(msl.indexOf(msl)); });
    
    ArrayList<String> mohamed =new ArrayList<String>();
    mohamed.add("Benbekri");
    mohamed.add("Meryem");
    
    Iterator it =mohamed.iterator();

    while(it.hasNext()){
                System.out.println("Iterator Sort");

        System.out.println(it.next());
    }

    
    for(String a : mohamed){
        
                System.out.println("Das ist short Array");

      
        System.out.println(a);
    }
    
            System.out.println("Ende von short Array");

    mohamed.forEach(System.out::println);
    
    
            }
    
    
}
