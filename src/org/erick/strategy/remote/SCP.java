package org.erick.strategy.remote;

import org.erick.strategy.FileTransporter;

public class SCP implements FileTransporter {

	public String description;

	public SCP() {

	}

	public SCP(SCP scp) {
		this.description = scp.description;
	}
	
	@Override
	public void copy(String sourceFileDirectory, String fileDestination) {
		System.out.println("Sending the file to SCP Server");
		System.out.println("File Sent!");
	}

	@Override
	public void move(String sourceFileDirectory, String fileDestination) {
		System.out.println("Receiving the file from SCP Server");
		System.out.println("File Received!");
	}
	
	@Override
	public FileTransporter clone() {
		return new SCP(this);
	}

}
