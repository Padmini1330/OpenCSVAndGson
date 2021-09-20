package OpenCSVAndGson;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import com.opencsv.CSVReader;

public class OpenCSVReader 
{
    
	 public static final String CSV_FILE_PATH="./users.csv";

	    public static void main(String[] args) throws IOException
	    {
	    	try (
	    		Reader reader=Files.newBufferedReader(Paths.get(CSV_FILE_PATH));
	    		CSVReader csvReader=new CSVReader(reader);
	    	){
	    		String[] nextRecord;
	    		while((nextRecord = csvReader.readNext())!=null) {
	    			System.out.println("Name: "+ nextRecord[0]);
	    			System.out.println("Email: "+ nextRecord[1]);
	    			System.out.println("Phone: "+ nextRecord[2]);
	    			System.out.println("Country: "+ nextRecord[3]);
	    			System.out.println("==================");
	    		}
	    	}
	    }
}