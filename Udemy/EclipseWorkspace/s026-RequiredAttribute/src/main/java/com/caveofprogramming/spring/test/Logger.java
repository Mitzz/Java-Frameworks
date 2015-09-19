package com.caveofprogramming.spring.test;

import org.springframework.beans.factory.annotation.Autowired;

public class Logger {

	private ConsoleWriter consoleWriter;
	private FileWriter fileWriter;
	
	@Autowired(required=false)
	public void setConsoleWriter(ConsoleWriter consoleWriter) {
		this.consoleWriter = consoleWriter;
	}

	@Autowired
	public void setFileWriter(FileWriter fileWriter) {
		this.fileWriter = fileWriter;
	}

	public void writeFile(String text) {
		fileWriter.write(text);
	}
	
	public void writeConsole(String text) {
		if(consoleWriter != null)
			consoleWriter.write(text);
	}

}
