package com.insel.chapter18.streamtowindow;

import java.io.IOException;
import java.io.OutputStream;

import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class TextAreaOutputStream extends OutputStream {
	private final JTextArea textArea;
	private final StringBuilder sb = new StringBuilder();
	private String title;
	
	public TextAreaOutputStream(final JTextArea textArea, String title) {
		this.textArea = textArea;
		this.title = title;
		sb.append(title + "> ");
	}
	
	@Override
	public void write(int b) throws IOException {
		System.out.println("write " + (char) b);
		if(b=='\r') return;
		if(b=='\n') {
			final String text = sb.toString() + "\n";
			SwingUtilities.invokeLater(new Runnable() {
				@Override
				public void run() {
					textArea.append(text);
				}
			});
			sb.setLength(0);
			sb.append(title + "> ");
			return;
		}
		sb.append((char) b);
		System.out.println("Done write");
		
	}

}