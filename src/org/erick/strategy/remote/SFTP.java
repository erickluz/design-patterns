package org.erick.strategy.remote;

import org.erick.strategy.FileTransporter;

public class SFTP implements FileTransporter {

	public String description;
	
	public SFTP() {
		
	}
	
	public SFTP(SFTP sftp) {
		this.description = sftp.description;
	}
	
	@Override
	public void copy(String sourceFileDirectory, String fileDestination) {
		System.out.println("Sending the file to SFTP Server");
		System.out.println("File Sent!");
	}

	@Override
	public void move(String sourceFileDirectory, String fileDestination) {
		System.out.println("Receiving the file from SFTP Server");
		System.out.println("File Received!");
	}
	
	@Override
	public FileTransporter clone() {
		return new SFTP(this); 
	}

}
