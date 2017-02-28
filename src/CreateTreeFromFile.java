import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Class tp create a tree from a given file
 * @author jfran
 *
 */
public class CreateTreeFromFile {
	private String file;
	private Tree familyTree;
	
	public CreateTreeFromFile(String s){
		file = s;
		familyTree = new Tree();
		read();
	}
	
	private void read(){
		try{
			File input = new File(file);
			Scanner in = new Scanner(input);
			
			while (in.hasNextLine()){
				String s = in.nextLine();
				String[] pair = s.split(",");
				pair[0] = pair[0].trim();
				pair[1] = pair[1].trim();
//				System.out.println(pair[0] + pair[1]);
				familyTree.add(pair[0], pair[1]);
			}
		}
		catch(FileNotFoundException f){
			f.printStackTrace();
		}
		
	}
	
	public Tree getTree(){
		return familyTree;
	}
	
}
