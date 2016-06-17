package TechnicalExam;

import TechnicalExam.Utils.CheckProcess;

public class MainProcess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Process start....");
		String inputData = "123456435472848";
		
		if (inputData.equals("") || inputData == null) {
			System.out.println("パラメータが入力されていません。");
			return;
		}
		
		//　@ TODO パラメータの数をチェックする
		String subProcessName = CheckProcess.findProcessName(inputData);
		
		
	}

}
