package com.designpatterns.commanddesignpattern;

public class WriteFileCommand implements Command {
	
	private FileSystemReceiver receiver;
	
	public WriteFileCommand(FileSystemReceiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		this.receiver.writeFile();

	}

}
