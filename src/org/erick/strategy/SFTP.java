package org.erick.strategy;

public class SFTP implements FileTransporter {

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

}
