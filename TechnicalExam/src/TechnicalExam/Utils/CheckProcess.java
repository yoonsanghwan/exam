package TechnicalExam.Utils;

import TechnicalExam.Utils.SetValue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckProcess {

	public static String findProcessName(String data) {

		System.out.println("data = " + data);
		
		String processName = null;
		
		// 課題１にマッチするかをチェックする
		Pattern patten = Pattern.compile("^[0-9]+$");
		Matcher firstMatcher = patten.matcher(data);
		
		// 課題2にマッチするかをチェックする
		patten = Pattern.compile("^[0-1]+$");
		Matcher secondMatcher = patten.matcher(data);
		
		// 課題2にマッチするかをチェックする
		patten = Pattern.compile("^[a-zA-Z]+$");
		Matcher thirdMatcher = patten.matcher(data);
		
		
		if(firstMatcher.find()) {
			processName = SetValue.PROCESS_1;
		}
		
		if(secondMatcher.find()) {
			processName = SetValue.PROCESS_2;
		}
	
		if(thirdMatcher.find()) {
			processName = SetValue.PROCESS_3;
		}
		
		return processName;
	}

}
