package org.erick.strategy;

public class GoogleDrive implements FileTransporter {

	@Override
	public void copy(String sourceFileDirectory, String fileDestination) {
		System.out.println("Sending the file to Google Drive");
		System.out.println("File Sent!");
	}

	@Override
	public void move(String sourceFileDirectory, String fileDestination) {
		System.out.println("Receiving the file from Google Drive");
		System.out.println("File Received!");
	}

}
