import java.io.File;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		File myFile = new File("//home//vitalii//newDir//1.txt");
		File rootTmp = new File("//home//vitalii","newDir");
		
		
        boolean exists = rootTmp.exists();
        System.out.println(exists);
        System.out.println(rootTmp.isFile());
        System.out.println(rootTmp.isDirectory());
        
        System.out.println(myFile.isFile());
        System.out.println(myFile.isDirectory());
        
        TreeSet<File> files = new TreeSet<>(new Comparator<File>() {
			@Override
			public int compare(File file1, File file2) {
				return file1.getName().compareTo(file2.getName());
			}});
        
        File[] listFiles = rootTmp.listFiles();
        for(File curr : listFiles) {
            System.out.println(curr.getName());
            files.add(curr);
        }
        System.out.println("-------------------");
        for (File file:files) {
        	System.out.println(file.getName());
        }
	}

}
