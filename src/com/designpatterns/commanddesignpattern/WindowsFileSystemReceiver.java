package com.designpatterns.commanddesignpattern;

public class WindowsFileSystemReceiver implements FileSystemReceiver{

	@Override
	public void openFile() {
		System.out.println("Openinng File");
		
	}

	@Override
	public void writeFile() {
		System.out.println("Writing File");
		
	}

	@Override
	public void closeFile() {
		System.out.println("Closing File");
		
	}

}
