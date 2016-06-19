package TechnicalExam.SubProcess.Impl;

import TechnicalExam.SubProcess.SubProcess;

public class SubProcessImpl implements SubProcess {

	@Override
	public void process1(String data) {
		// TODO Auto-generated method stub
		System.out.println("process1 start.......");
		System.out.println("data in subprocessimpl = " + data);
		
		
	}

	@Override
	public void process2(String data) {
		// TODO Auto-generated method stub
		System.out.println("process2 start.......");
		System.out.println("data in subprocessimpl = " + data);
	}

	@Override
	public void process3(String data) {
		// TODO Auto-generated method stub
		System.out.println("process3 start.......");
		System.out.println("data in subprocessimpl = " + data);
	}

}
