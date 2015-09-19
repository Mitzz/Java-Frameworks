package com.caveofprogramming.spring.test;

import javax.annotation.Resource;

public class Logger {

	private ConsoleWriter consoleWriter;
	private LogWriter fileWriter;

	@Resource
	public void setConsoleWriter(ConsoleWriter writer) {
		this.consoleWriter = writer;
	}

	@Resource
	public void setFileWriter(LogWriter fileWriter) {
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
