import java.util.ArrayList;

public class File {
	private static File f ;
	private File() {fileContent = "";}
	public static File getInstance() {
		if (f==null) {
			f = new File();
		}
		return f;
	}
	
	public String  fileContent;
	//The file has only one writer and multiple readers.
	FileWriter fw = FileWriter.getInstance();
	private ArrayList <FileReader> frs = new ArrayList<>();
	
	public void addReader(FileReader fr) {
		frs.add(fr);
	}
	public ArrayList <FileReader> getReaders(){
		return this.frs;
	}
	public  FileReader getReader(int id){
		for (FileReader r : frs) {
			if ( r.getId() == id)
				return r;
		}
		System.out.println("Reader doesnt exist");
		return null;
	}
}
