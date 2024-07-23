
public class TestClass {
/*
 * This program implement a one file that has only one writer,
 * and multiple reader
 * so i implemented Singleton design pattern to both file & fileWriter classes
 */
	public static void main(String[] args) {
		File f =  File.getInstance();
		FileReader fr1 = new FileReader(1);
		FileReader fr2 = new FileReader(2);
		FileReader fr3 = new FileReader(3);
		
		f.addReader(fr1);
		f.addReader(fr2);
		f.addReader(fr3);
		
		f.fw.writeToFile("hello, im starting to write ");
		f.getReader(2).readFile();
		f.fw.writeToFile("Im appending  ");
		f.getReader(1).readFile();
		f.getReader(2).readFile();
		f.fw.overrideFile("override it");
	
		f.getReader(1).readFile();
		
		f.fw.clearFile();
		f.getReader(2).readFile();
		f.getReader(3).readFile();
	}

}
