package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CSV_Reader {
	
public static List<String[]> Read(String File){
	List<String[]> data = new LinkedList<String[]>();
	String dataRow;

	
	try {
		BufferedReader br = new BufferedReader(new FileReader(File));
		
		while((dataRow=	br.readLine())!=null) {
			
		String[] dataRecords = dataRow.split(",");
		data.add(dataRecords);
		}
		
		br.close();
		
	} catch (FileNotFoundException e) {
		System.out.println("Could not find file");
		e.printStackTrace();
	} catch (IOException e) {
		System.out.println("Could not read file");
		e.printStackTrace();
	}
	
	return data;
}
}
