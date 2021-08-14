package org.erick.strategy;

public interface Transmission {
	/**
	 * Send a file from source directory to destination directory on a remote machine
	 * 
	 * @param sourceFileDirectory
	 * @param fileDestination TODO
	 */
	void sendFile(String sourceFileDirectory, String fileDestination);
	
	/**
	 *  Get a file from a remote directory and download the file to downloadDirectory
	 * 
	 * @param downloadDirectory
	 * @param remoteDirectoryFile
	 */
	void receiveFile(String downloadDirectory, String remoteDirectoryFile);
}
