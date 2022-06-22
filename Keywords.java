	package utils; 
	import java.io.BufferedReader; 
	import java.io.FileReader; 
	import java.io.IOException;
import java.util.ArrayList;
import java.util.List; 
public class Keywords {
	
	    public static void main(String[] args) throws IOException 
	    { 
	        BufferedReader reader1 = new BufferedReader(new FileReader("C:\\Users\\CNAVYA\\Documents\\NAVYA.txt")); 
	        BufferedReader reader2 = new BufferedReader(new FileReader("C:\\Users\\CNAVYA\\Documents\\NAVYA2.txt")); 
	        String line1 = reader1.readLine(); 
	        String line2 = reader2.readLine(); 
	        List<String> matchList = new ArrayList<>();
	        List<String> mismatchList = new ArrayList<>();
	        boolean areEqual = true; 
	        int lineNum = 1; 
	        while (line1 != null || line2 != null) 
	        { 
	            if(line1 == null || line2 == null) 
	            { 
	                areEqual = false; 
	            } 
	            else if(! line1.(linequalsIgnoreCasee2))
	            { 
	                areEqual = false;
	            } 
	            if(areEqual)
	            {
	                matchList.add("Line" + lineNum + " = " + line1);
	            }
	            else{
	               mismatchList.add("Line" + lineNum + " in file1 = " + line1 + " and in file2 = " + line2);
	            }
	            
	            line1 = reader1.readLine();
	            line2 = reader2.readLine();
	            lineNum++; 
	        } 
	        reader1.close(); 
	        reader2.close(); 
	        
	        System.out.println("matchList :\n"+matchList);
	        System.out.println("\nmismatchList:\n"+mismatchList);
	    } 
	
}
