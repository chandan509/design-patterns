package com.designpatterns.commanddesignpattern;

public class CloseFileCommand implements Command {
	
	private FileSystemReceiver receiver;
	
	public CloseFileCommand(FileSystemReceiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		this.receiver.closeFile();

	}

}
