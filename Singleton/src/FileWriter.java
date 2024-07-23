
public class FileWriter {
	private static FileWriter fw;
	
	private FileWriter() {
		
	}
	
	public static FileWriter getInstance() {
		if (fw == null) {
			fw = new FileWriter() ;
		}
		return fw;
	}
	
	public void writeToFile(String s) {
		File.getInstance().fileContent+= s;
	}
	public void clearFile() {
		File.getInstance().fileContent= "";
	}
	public void overrideFile(String s) {
		File.getInstance().fileContent= s;
	}
}
