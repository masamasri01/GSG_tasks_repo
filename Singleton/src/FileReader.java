
public class FileReader {
	private int id;
	FileReader(int id){
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void readFile() {
		if (File.getInstance().fileContent == "")
			System.out.println("empty file");
		else System.out.println(File.getInstance().fileContent);
	}
}
