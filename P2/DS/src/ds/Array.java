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
    
    
    ArrayList <Integer>malzwei=new ArrayList<Integer>();
    malzwei.add(1);
    malzwei.add(10);
    System.out.println("Ein ArrayList mit Int verdoplleten Wert und mit Ausgabe des Indexes  ");
    for(Integer a:malzwei) {
    	System.out.println(a*2);
    	System.out.println("Den Index von: "+a+"  ist: "+malzwei.indexOf(a));
    	
    }
    
    
    
    
    
    
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
