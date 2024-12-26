package java_programs_05;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocalizationAndInternationalization_22 {

	public static void main(String[] args) {

		String lang = "ge";
		String country = "US";
		
		Locale l = new Locale(lang, country);
		ResourceBundle r = ResourceBundle.getBundle("/Java _Programs_01/Bundle");
		String str = r.getString("wish");
		System.out.println(str);
	}

}
