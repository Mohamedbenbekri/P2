package studentclassa;

import java.util.Objects;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author degto
 */ //Mit impelment comparable warum 
public class Student implements Comparable<Student> {
             private String vorname;
	    private String nachname;
	    private int matnr;
	    
	    
	    
	    
	    public Student(String vorname, String nachname, int matnr) {
	        this.vorname = vorname;
	        this.nachname = nachname;
	        this.matnr=matnr;
	       
	    }
	    //setters
	    public void setVorname(String vorname) {
	        this.vorname = vorname;
	    }
	    
	    public void setNachname(String nachname) {
	        this.nachname = nachname;
	    }

	    public void setMatnr(int matnr) {
	        this.matnr = matnr;

	    }
	    //getters
	    public String getVorname() {
	        return vorname;
	    }

	    public String getNachname() {
	        return nachname;
	    }
	    
	    public int getMatnr() { 
	    	return matnr;
	    } 
	       //ToString Methode  
	    @Override
	    public String toString() {
	        return "Student{" + "name= " + this.nachname + 
	                ", vorname= " + this.vorname + 
	                ", matnr= " + this.matnr + "}";
	    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }
//was wäre wenn man matrikel nummer vergleichen möchte ??
    @Override
   public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (!Objects.equals(this.vorname, other.vorname)) {
            return false;
        }
        return Objects.equals(this.nachname, other.nachname);
    }
    @Override
    
   /* public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        return Objects.equals(nachname, other.nachname) &&
               Objects.equals(vorname, other.vorname);
    }
  */
    
     //CompareTo methode
    
	    public int compareTo(Student other) {  
	        int lastNameCompare = this.nachname.compareToIgnoreCase(other.nachname);
	         if (lastNameCompare != 0) {  
	            return lastNameCompare;    
	        }
	        return this.vorname.compareToIgnoreCase(other.vorname);
			//return lastNameCompare;
	    }  
     
	    	
}