import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;







public class Vokabel {
	
	
	private HashMap de=new HashMap();
	private HashMap ds=new HashMap();
	
	
	
	
	
	public Vokabel() throws FileNotFoundException {

		String []s;
		int i=0;
		Scanner scan=new Scanner(new FileReader("Vokabel.txt"));

		while(scan.hasNext()){
			scan.nextLine();
			i++;
			}
		
			
			System.out.println(i);
			Scanner scan1=new Scanner(new FileReader("Vokabel.txt"));
	s=new String[i];
		
int j=0;
	while(scan1.hasNext()){
		
		s[j]=scan1.next();
		
		
		
		j++;
		
	}
	 for(int k=0;k<s.length-2;k+=3) {
		 
		 de.put(s[k],s[k+1]);
		 
		 ds.put(s[k],s[k+2]);
		 
		 
		 
		 
	 }
		
	}
	
	
	public void Ausgeben() {
		
		

		for(Object obj:de.keySet().toArray())
			System.out.println("Deutsch : "+obj+"     "+"Englisch  :  "+de.get(obj));
		System.out.println("\n");
		 
		for(Object obj1:ds.keySet().toArray())
			System.out.println("Deutsch : "+obj1+"     "+"Spanisch : " +ds.get(obj1));
	
	
	}
	
	
	
	
	
	
	
	
	
	public int abfragen(String sprache) throws IOException {
		
		BufferedReader einlesen=new BufferedReader(new InputStreamReader(System.in));
		int num=0;
		
		
		if(sprache.equals("Deutsch-Englisch")) {
			
			
		for(Object obj:de.keySet().toArray()) {
			
			System.out.println("Deustsch :"+obj+"  übersetzng: ");
			String ein=einlesen.readLine();
			if(ein.equals(de.get(obj))) num++;
			
		}
			
		//System.out.println("Sie haben "+num+"  richtige Antworten ");
			
			
			
		}else if(sprache.equals("Deutsch-Spanisch")){
			
			
			for(Object obj1:ds.keySet().toArray()) {
				
				System.out.println("Deustsch :"+obj1+"  übersetzng: ");
				String ein1=einlesen.readLine();
				if(ein1.equals(ds.get(obj1))) num++;
				
			}
			//System.out.println("Sie haben "+num+"  richtige Antworten ");
			
			
		}
		
		
		
		
		
		return num;
	}
	

}
