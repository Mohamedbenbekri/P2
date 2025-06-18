package studentclassa;

import java.util.Comparator;
import java.util.LinkedList;

import java.util.Scanner;
import java.util.ArrayList;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author degto
 */
//bubbleSort und SelectSort komplekzität
//und laufzeit
//worskace der kompläkzität
public class StudentApp   {
     static ArrayList<Student> mll = new ArrayList<Student>();
     
    
    public static void main(String[] args){
    	

    	fuellen(); 
    	sort();
    	Scanner sc = new Scanner(System.in);

        System.out.println("Nachname eingeben:");
        String nachname = sc.nextLine();

        System.out.println("Vorname eingeben:");
        String vorname = sc.nextLine();

        System.out.println("Matrikelnummer eingeben:");
        int matrnr = Integer.parseInt(sc.nextLine());
        
        
        insertSortedStudent(vorname, nachname, matrnr);

  

        final int[] index = {0}; // 
        mll.forEach(student -> {//ForEach
            System.out.println("Index " + index[0] + ": " + student);
            index[0]++;
     
        });     
        
    } // END main 
    
    public static void fuellen(){
        mll.add(new Student("Willi ",  "Wichtig  ", 123456));
        mll.add(new Student("Rudi ", "Ratlos ", 123457)); 
        mll.add(new Student("Erna ", "Endlos ", 123458)); 
        mll.add(new Student("Maja ", "Machich ", 123459));
        mll.add(new Student("Kurt ", "Kannich ", 123461));
        mll.add(new Student("Wera ", "Weissnicht ", 123462));
        
      
        
    } // END fuellen  
    
    public static void sort() {
    	int n=mll.size();
    	
    	for(int i=0;i<n-1;i++) {
    	int minIndex=i;
    	
    	for(int j=i+1;j<n;j++) {
    		if(mll.get(j).compareTo(mll.get(minIndex))<0){
    			minIndex=j;
    		}
    	}
    	if(minIndex !=i) {
    		Student temp=mll.get(minIndex);
    		mll.set(minIndex,mll.get(i));
    		mll.set(i,temp);
    	}
    }
    }
    //Sortieren
    public static void bubbleSort(LinkedList<Student> mll, Comparator<Student> comparator) {
	    int n = mll.size();
	    boolean swapped;
	    for (int i = 0; i < n - 1; i++) {
	        swapped = false; 
	        for (int j = 0; j < n - i - 1; j++) {
	            Student s1 = mll.get(j);
	            Student s2 = mll.get(j + 1);
	            if (comparator.compare(s1, s2) > 0) {
	                mll.set(j, s2);
	                mll.set(j + 1, s1);
	                swapped = true;
	            }
	        }
	        if (!swapped) break; 
	    } 
	}
    
   
    //Frage zum Einfügen eines Studenten 

    public static void insertSortedStudent(String vorname, String nachname, int matrnr) {
        Student s = new Student(vorname, nachname, matrnr);

        int position = 0;
        while (position < mll.size() && mll.get(position).compareTo(s) < 0) {
            position++;
        }

        mll.add(position, s);
    }
}


  
    
  