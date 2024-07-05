package HybrdenFrameWork;

import java.io.FileInputStream;
import java.util.Properties;

public class lib implements IAutoconstant {

	public static String getproperty(String CONFIG_PATH, String key) {
		String property = "";
		Properties prop = new Properties();
		try {
			FileInputStream file = new FileInputStream(CONFIG_PATH);
			prop.load(file);
			property = prop.getProperty(key);
		} catch (Exception e) {

		}
		return property;
	}
}
