/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ds;

/**
 *
 * @author Benbekri
 * 
 * 
 * 
 */



//Hier werden alle die Array methoden geschrieben 
public class arraytest {
    public static void main(String[] args) {
        int []original ={1,3,5,7,9};


            int value=45;
        int[]resultat_Einfugen =insertSortedArray(value, original);
        
        
        System.out.print("Original Array");
        for(int i: original){
            System.out.print(i+" ");
        }
        System.out.println();
        
        //Einfügen und Löschen von einem Wert im Array 
        System.out.print("Original  Array nach dem Einfuegen  von '45': ");
        
        for(int ii : resultat_Einfugen){
            System.out.print(ii+ " ");
        }
                 System.out.println();

        System.out.print("Original  Array nach Loeschung nach dem Index 1 : ");
        int []resultat_löschen_nach_index =deleteElement(original, 0);
        int [] resultat_löschen_nach_wert=deleteElementByValue(original, value);
         for(int i : resultat_löschen_nach_index){
            System.out.print(i+ " ");
            

        }
         System.out.println();
                 System.out.print("Original  Array nach Loeschung nach dem Wert 1 : ");

            for(int i : resultat_löschen_nach_wert){
            System.out.print(i+ " ");
            }
         //Binäre Suche sowie sequenntiele Suche 
                 int [] sortiert = {1,2,3,4,5,6,6,7};

         System.out.println();
                          System.out.println("Hier ist Binare Suche Rekursiv : "+binarySearchRec(sortiert, 3, 1, 7));
                          System.out.println("Hier ist Binare Suche Iterativ : "+ binarySearchIteratir(sortiert, 5));
                          System.out.println("Hier ist Binare Suche Sequentiel :"+search(sortiert, value));


        
    
    
    // Die Anwendung von Bubble Sort 
            int []bubbleList_int ={1,33,45,757,878,78,787,8788798,7,87878};
        
    
            BubbleSort1Int(bubbleList_int);
            System.out.println("Sortiertes Int Array aufsteigend: " +
        java.util.Arrays.toString(bubbleList_int));

            
            BubbleSort1IntReverse(bubbleList_int);
            System.out.println("Sortiertes Int Array absteigend: " +
        java.util.Arrays.toString(bubbleList_int));

                    String []bubbleList_string={"a","z","Z","d","b"};

            BubbleSort1String(bubbleList_string);
            System.out.println("Sortiertes String Array  aufsteigend: " +
        java.util.Arrays.toString(bubbleList_string));

            BubbleSort1StringReverse(bubbleList_string);
            System.out.println("Sortiertes String Array absteigend: " +
        java.util.Arrays.toString(bubbleList_string));


    }
    
    
    // Mit dieser Methode kann man ein Element im Array Einfügen 
    public static int[] insertSortedArray(int value, int[] arr) { 
    // Wenn das Ursprungsarray null ist → neues Array mit dem Wert zurückgeben 
    if (arr == null) { 
        return new int[] { value }; 
    } 
 
    // Neues Array mit einem Platz mehr erstellen 
    int[] nArr = new int[arr.length + 1]; 
    int j = 0; 
    boolean flag = false; 
 
    // Durchlaufe ursprüngliches Array und füge 'value' an richtiger Stelle ein 
    for (int i = 0; i < arr.length; i++) { 
        if (!flag && value < arr[i]) { 
            nArr[j++] = value; 
            flag = true; 
        } 
        nArr[j++] = arr[i]; 
    } 
 
    // Falls 'value' größer als alle anderen Werte war, am Ende einfügen 
    if (!flag) { 
        nArr[j] = value; 
    } 
 
    return nArr; 
} 
    public static int[] deleteElement(int[] array, int index) { 
    // Prüfen, ob der Index gültig ist 
    if (index < 0 || index >= array.length) { 
        throw new IllegalArgumentException("Index außerhalb der Array-Grenzen"); 
    } 
 
    // Neues Array mit einer Größe weniger erstellen 
    int[] newArray = new int[array.length - 1]; 
    int j = 0; 
 
    // Alle Elemente außer das zu löschende kopieren 
    for (int i = 0; i < array.length; i++) { 
 
        if (i != index) { 
            newArray[j++] = array[i]; 
        } 
    } 
 
    return newArray; 
} 
    public static int binarySearchIteratir(int[] a, int value) {
    int first = 0;
    int last = a.length - 1;

    while (first <= last) {
        int mid = (first + last) / 2;

        if (a[mid] == value) {
            return mid; // Wert gefunden
        }

        if (a[mid] < value) {
            first = mid + 1; // rechts weitersuchen
        } else {
            last = mid - 1;  // links weitersuchen
        }
    }

    return -1; // Wert nicht gefunden
}

//🔍 Binäre Suche (rekursiv) in einem int[]-Array

public static int binarySearchRec(int[] a, int value, int first, int last) {
    // Abbruchbedingung: Bereich leer
    if (first > last)
        return -1;

    int mid = (first + last) / 2;

    // Wert gefunden
    if (a[mid] == value)
        return mid;

    // Rekursiv links oder rechts weitersuchen
    if (a[mid] < value)
        return binarySearchRec(a, value, mid + 1, last);
    else
        return binarySearchRec(a, value, first, mid - 1);
}

//🔍 Sequentielle Suche 
public static int search(int[] A, int x) {
    int n = A.length;
    
    for (int i = 0; i < n; i++) {
        if (A[i] == x) {
            return i;
        }
    }
    
    return -1; // Null im Pseudocode, -1 in Java für "nicht gefunden"
}



public static void BubbleSort1Int(int []ia) { 
    int n =ia.length; 
 
    for (int j = 0; j < n - 1; j++) { 
        boolean swapped = false; 
 
        for (int i = 0; i < n - j - 1; i++) { 
            if (ia[i] > ia[i + 1]) { 
                int temp = ia[i]; 
                ia[i] = ia[i + 1]; 
                ia[i + 1] = temp; 
                swapped = true; 
            } 
        } 
 
        if (!swapped) break; // falls kein Tausch mehr nötig 
    } 
} 

 //Bubble Sort für String[] – alphabetisch sortieren 
 
 
public static void BubbleSort1String(String []ia2) { 
    int na = ia2.length; 
 
    for (int j = 0; j < na - 1; j++) { 
        boolean swapped = false; 
 
        for (int i = 0; i < na - j - 1; i++) { 
            if (ia2[i].compareTo(ia2[i + 1]) > 0) { 
                String temp = ia2[i]; 
                ia2[i] = ia2[i + 1]; 
                ia2[i + 1] = temp; 
                swapped = true; 
            } 
        } 
 
        if (!swapped) break; // keine weiteren Vertauschungen nötig 
 
    } 
} 
 

 //Bubble Sort für int[] – absteigend sortieren (Reverse) 
 
public static void BubbleSort1IntReverse(int[]ia) { 
    int n = ia.length; 
 
    for (int j = 0; j < n - 1; j++) { 
        boolean swapped = false; 
 
        for (int i = 0; i < n - j - 1; i++) { 
            if (ia[i] < ia[i + 1]) { 
                int temp = ia[i]; 
                ia[i] = ia[i + 1]; 
                ia[i + 1] = temp; 
                swapped = true; 
            } 
        } 
 
        if (!swapped) break; 
    } 
} 
 
 

// Bubble Sort für String[] – absteigend sortieren (Reverse) 
 
 
 
public static void BubbleSort1StringReverse(String []ia2) { 
    int na = ia2.length; 
 
    for (int j = 0; j < na - 1; j++) { 
        boolean swapped = false; 
 
        for (int i = 0; i < na - j - 1; i++) { 
            // Vergleich umgedreht für absteigende Reihenfolge 
            if (ia2[i].compareTo(ia2[i + 1]) < 0) { 
                String temp = ia2[i]; 
                ia2[i] = ia2[i + 1]; 
 
                ia2[i + 1] = temp; 
                swapped = true; 
            } 
        } 
 
        if (!swapped) break; 
    }



    
}
public static int[] deleteElementByValue(int[] array, int value) {
    // Zählen, wie oft der Wert vorkommt
    int count = 0;
    for (int i : array) {
        if (i == value) count++;
    }

    // Wenn der Wert nicht vorhanden ist, das Original zurückgeben
    if (count == 0) return array;

    // Neues Array mit weniger Plätzen für jeden Treffer
    int[] newArray = new int[array.length - count];
    int j = 0;

    for (int i = 0; i < array.length; i++) {
        if (array[i] != value) {
            newArray[j++] = array[i];
        }
    }

    return newArray;
}

}