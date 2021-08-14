package org.erick.strategy;

public class SFTP implements Transmission {

	@Override
	public void sendFile(String sourceFileDirectory, String fileDestination) {
		System.out.println("Sending the file to SFTP Server");
		System.out.println("File Sent!");
	}

	@Override
	public void receiveFile(String downloadDirectory, String remoteDirectoryFile) {
		System.out.println("Receiving the file from SFTP Server");
		System.out.println("File Received!");
	}

}
