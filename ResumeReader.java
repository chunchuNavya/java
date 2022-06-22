package utils;
	import java.io.File;
	import java.io.IOException;
	import org.apache.pdfbox.pdmodel.PDDocument; 
	import org.apache.pdfbox.text.PDFTextStripper; 


	public class ResumeReader {

		public void searchKeywords(String[] str) throws IOException
		{		
			
			 String path = "C:\\Users\\CNAVYA\\Downloads\\yourresume";
		     
			 File file = new File(path);      
			 File[] listOfFiles = file.listFiles();
			 
		      for (File eachfile : listOfFiles) {
		         
		    	  if (eachfile.isFile()) 
		    	  {	   
		    		  //String extension = FilenameUtils.getExtension(path+eachfile);
		    		  
			             PDDocument document = PDDocument.load(eachfile);
		                  PDFTextStripper pdfStripper = new PDFTextStripper();    //Instantiate PDFTextStripper class
		    
			            //Retrieving text from PDF document
			            String[] lines= pdfStripper.getText(document).split("\r\n|\r|\n");
			            int count=0;
			            for(String temp:lines)
			            {
			            	for(int i=0;i<str.length;i++)
			            	{
			            		if(temp.toLowerCase().contains(str[i]))
			            		{
			            			//System.out.println(str[i]);
			    	                count++;
			            		}
			            		continue;
			            	}
			            }
			            //System.out.println(count);
			            
			            //Finding %match of resume to requirement
			            int match=100*count/(str.length);
			            System.out.println(match+"% matched");
			            if(match<=50) {
			            	System.out.println(eachfile.getName()+" Not selected: "+match+"% matched to our requirement.");	
			            }
			            else
			            {
			            	System.out.println(eachfile.getName()+" Selected: "+match+"% matched to our requirement.");
			            }
		           
			            document.close();                     //Closing the document
		          }
		      } 
		}
		}

	  

	//-----------------------------------------------------------------------------------------------------
	/*String fname=eachfile.getName();
	String name =  FilenameUtils.removeExtension(fname);    
	System.out.println(name);//getting name without extension
//		  String s = FileUtils.readFileToString(eachfile);  
	fileTypeCoversion fcon = new fileTypeCoversion();
	 fcon.convertToPDF("C:\\Users\\MANAPANI\\eclipse-workspace\\javaAssignment\\resumes\\"+fname+"\\","C:\\Users\\MANAPANI\\eclipse-workspace\\javaAssignment\\resumes\\"+name+"1.pdf\\");
	 System.out.println(eachfile.getName());o*/
	//---------------------------------------