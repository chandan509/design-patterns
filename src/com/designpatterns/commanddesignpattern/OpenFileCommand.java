package com.designpatterns.commanddesignpattern;

public class OpenFileCommand implements Command{
	private FileSystemReceiver receiver;
	
	public OpenFileCommand(FileSystemReceiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		this.receiver.openFile();
		
	}

}
