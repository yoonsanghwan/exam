package TechnicalExam.Utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckProcess {

	public static String findProcessName(String data) {

		System.out.println("data = " + data);
		
		String processNmae = "";
		Pattern p = Pattern.compile("[0-9]");
		Matcher m = p.matcher(data);
		
		System.out.println("matcher M  = " + m.find());
		

		return processNmae;
	}

}
