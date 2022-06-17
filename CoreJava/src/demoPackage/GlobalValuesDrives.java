package demoPackage;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValuesDrives {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Properties property = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\lenovo\\eclipse-workspace\\CoreJava\\src\\data.Properties");
		property.load(file);
		System.out.println(property.getProperty("browser"));
		System.out.println(property.getProperty("url"));
		property.setProperty("browser", "firefox");
		System.out.println(property.getProperty("browser"));
		FileOutputStream fileout = new FileOutputStream("C:\\Users\\lenovo\\eclipse-workspace\\CoreJava\\src\\data.Properties");
		property.store(fileout, null);
	}

}
