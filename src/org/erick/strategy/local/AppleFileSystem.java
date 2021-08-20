package org.erick.strategy.local;

import org.erick.strategy.FileTransporter;

public class AppleFileSystem implements FileTransporter {
	
	public String operationalSourceSystem; 
	
	public AppleFileSystem() {
		
	}
	
	public AppleFileSystem(AppleFileSystem fileTransporter) {
		this.operationalSourceSystem = fileTransporter.operationalSourceSystem;
	}
	
	@Override
	public void copy(String sourceFileDirectory, String fileDestination) {
		System.out.println("Apple has been started the process to copy file");
		System.out.println("Copying file...");
		System.out.println("Files copied successfully!");
	}

	@Override
	public void move(String sourceFileDirectory, String fileDestination) {
		System.out.println("Apple has been started the process to move file");
		System.out.println("Moving file...");
		System.out.println("Files moved successfully!");
	}
	
	@Override
	public FileTransporter clone() {
		return new AppleFileSystem(this);
	}
	
}
