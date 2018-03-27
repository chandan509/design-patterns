package com.designpatterns.commanddesignpattern;

public class Client {
	public static void main(String[] args) {
		FileSystemReceiver fsr = FileSystemReceiverUtil.getUnderlyingFileSystem();
		CommandInvoker invoker = null;
		
		OpenFileCommand open = new OpenFileCommand(fsr);
		invoker = new CommandInvoker(open);
		invoker.execute();
		
		WriteFileCommand write = new WriteFileCommand(fsr);
		invoker = new CommandInvoker(write);
		invoker.execute();
		
		CloseFileCommand close = new CloseFileCommand(fsr);
		invoker = new CommandInvoker(close);
		invoker.execute();
		
		
		
		
	}

}
