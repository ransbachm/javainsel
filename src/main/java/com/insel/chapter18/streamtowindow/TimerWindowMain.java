package com.insel.chapter18.streamtowindow;

import java.io.IOException;
import java.io.PrintStream;

public class TimerWindowMain implements Runnable {
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		TextAreaOutputStream st = new TextAreaOutputStream(TimerWindow.textArea, "NOMA");
		//System.setOut(new PrintStream(st));
		try {
			st.write(("The girl that time forgot\n").getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//TimerWindow.textArea.append("FIGHT");
	}

}
