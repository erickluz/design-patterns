package org.erick.strategy;

public class GoogleDrive implements Transmission {

	@Override
	public void sendFile(String sourceFileDirectory, String fileDestination) {
		System.out.println("Sending the file to Google Drive");
		System.out.println("File Sent!");
	}

	@Override
	public void receiveFile(String downloadDirectory, String remoteDirectoryFile) {
		System.out.println("Receiving the file from Google Drive");
		System.out.println("File Received!");
	}

}
