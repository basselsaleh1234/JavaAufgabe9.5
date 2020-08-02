import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;



public class Aufgabe95 {

	public static void main(String[] args) throws IOException {
		/*		PrintWriter print=new PrintWriter("Vokabel.txt");
		

		
		java.util.HashMap de=new HashMap(); //Deutsch English
		
		java.util.HashMap ds=new HashMap(); // Deutsch Spanish
		
		de.put("Schlue", "school");
		de.put("Maus", "mouse");
		de.put("Hund", "dog");
		de.put("Katze", "cat");
		de.put("Haare", "hair");
		de.put("Klasse", "class");
		de.put("Haus", "house");
		de.put("Auto", "car");
		
		
		

		ds.put("Schlue", "escuela");
		ds.put("Maus", "Ratón");
		ds.put("Hund", "Perro");
		ds.put("Katze", "Gato");
		ds.put("Haare", "Cabello");
		ds.put("Klasse", "Genial");
		ds.put("Haus", "Casa");
		ds.put("Auto", "Coche");
		
		
		
		for(Object obj:de.keySet().toArray()) {
			print.println(obj);
			
		
			print.println(de.get(obj));
			print.println(ds.get(obj));
			
		}
		print.close();
		//System.out.println(obj+"         "+de.get(obj));
		//System.out.println("\n");
		/*print.println();
	
		
		for(Object obj1:ds.keySet().toArray()) {
			
			print.println(obj1);
			
			print.println(ds.get(obj1));
			
			*/
		
		 Vokabel v=new Vokabel();
		BufferedReader einlesen=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("VOKABELPROGRAMM VERSION 1.0");
		System.out.println("AUSWAHL");
		System.out.println("<1> Alle Vokabeln anzeigen");
		System.out.println("<2> Vokabelabfrage Deutsch-Englsisch");
		System.out.println("<3> Vokabelabfrage Deutsch-Spanisch");
		System.out.println("<4> ENDE");
		
		
		
	String  a="4";
	
	a=einlesen.readLine();
	while(a!=null) {

	

  
	   
		if(a.equals("1")) {v.Ausgeben(); a=einlesen.readLine();}

       if(a.equals("2")) {  int de= v.abfragen("Deutsch-Englisch");  System.out.println("Sie haben    "+ de +"    richtige Antworten");a=einlesen.readLine();}
       
       if(a.equals("3")) { int ds=v.abfragen("Deutsch-Spanisch");     System.out.println("Sie haben    "+ds+"   richtige Antworten");a=einlesen.readLine();}
       
       if(a.equals("4")) {System.exit(0);}
	}

		//System.out.println(obj1+"         "+ds.get(obj1));
	}

}
