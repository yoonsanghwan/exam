package TechnicalExam;

import TechnicalExam.Utils.CheckProcess;
import TechnicalExam.SubProcess.SubProcess;
import TechnicalExam.SubProcess.Impl.SubProcessImpl;


public class MainProcess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Process start....");
		String inputData = "0123456435472848";
		
		if (inputData.equals("") || inputData == null) {
			System.out.println("パラメータが入力されていません。");
			return;
		}
		
		//　@ TODO パラメータの数をチェックする
		String subProcessName = CheckProcess.findProcessName(inputData);
		System.out.println("subProcess name = " + subProcessName);
		if (subProcessName == null) {
			System.out.println("入力されたパラメータが正しくありません。");
		}
		
		switch (subProcessName) {
			case "SubProcess1":
				// process 1 を呼び出す。
				SubProcess process = new SubProcessImpl();
				process.process1(inputData);
				
				break;
			case "SubProcess2":
				// process2 を呼び出す。
				SubProcess process2 = new SubProcessImpl();
				process2.process2(inputData);
				
				break;
			case "SubProcess3":
				// process3を呼び出す。
				SubProcess process3 = new SubProcessImpl();
				process3.process3(inputData);
				break;

		}
		
		
		
		
	}

}
