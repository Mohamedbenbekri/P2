package ds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author Benbekri
 */
public class DS {

    public DS(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

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
        final DS other = (DS) obj;
        if (this.a != other.a) {
            return false;
        }
        return this.b == other.b;
    }
    
    public int a;
    public int b;

    public static void main(String[] args) {
        // -------------------------------
        // ArrayList erstellen und befüllen
        // -------------------------------
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> array = new ArrayList<>();
        
        array.add(15);

        arr.add(1);
        arr.add(52);
        
        arr.set(0, 5);
                arr.set(1, 5);
                
                System.out.println("ist mein array Empty:"+arr.isEmpty());


        
        arr.addAll(array);
        
        

        

        System.out.println("=== ArrayList ===");
        for (int a : arr) {
            System.out.print(a );
            System.out.println(); // neue Zeile
        }

        // -------------------------------
        // Queue erstellen und befüllen
        // -------------------------------
        Queue<Integer> b = new LinkedList<>();
        b.add(1);
        b.add(2); 
      
        

        System.out.println("=== Queue ===");
        for (int a : b) {
            System.out.print(a );
            System.out.println(); // neue Zeile
        }
        //andere Methode
         while (!b.isEmpty()) {
            System.out.println("Entfernt: " + b.poll()); // poll() = Element entfernen & zurückgeben
        }
         // -------------------------------
        // Queue erstellen und befüllen
        // -------------------------------
        
        System.out.println("===Stack===");
        Stack <String> stack =new Stack<String>();
        stack.add("hier ist ein Stack "+"  ");
        stack.add("Zweites Stack ");
        stack.pop();
        stack.push("Mit Pusch einfügen");
         for(String a : stack){
             System.out.println(a);
         }
         
         //Andere Methode 
         while (!stack.isEmpty()) {
    System.out.println(stack.pop()); // gibt 12, dann 11 aus
}

        
        
    }
}

    

