package org.erick.strategy.local;

import org.erick.strategy.FileTransporter;

public class LinuxFileSystem implements FileTransporter {

	public String operationalSourceSystem;
	
	public LinuxFileSystem() {
		
	}
	
	public LinuxFileSystem(LinuxFileSystem linuxFileSystem) {
		this.operationalSourceSystem = linuxFileSystem.operationalSourceSystem;
	}
	
	@Override
	public void copy(String sourceFileDirectory, String fileDestination) {
		System.out.println("Linux has been started the process to copy file");
		System.out.println("Copying file...");
		System.out.println("Files copied successfully!");
	}

	@Override
	public void move(String sourceFileDirectory, String fileDestination) {
		System.out.println("Linux has been started the process to move file");
		System.out.println("Moving file...");
		System.out.println("Files moved successfully!");
	}

	@Override
	public FileTransporter clone() {
		return new LinuxFileSystem(this);
	}
	
}
