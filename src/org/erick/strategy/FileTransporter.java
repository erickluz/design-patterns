package org.erick.strategy;

public interface FileTransporter {
	/**
	 * Send a file from source directory to destination directory on a remote machine
	 * 
	 * @param sourceFileDirectory
	 * @param fileDestination TODO
	 */
	void copy(String sourceFileDirectory, String fileDestination);
	
	/**
	 *  Get a file from a remote directory and download the file to downloadDirectory
	 * 
	 * @param sourceFileDirectory
	 * @param fileDestination
	 */
	void move(String sourceFileDirectory, String fileDestination);
}
