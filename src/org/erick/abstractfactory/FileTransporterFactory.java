package org.erick.abstractfactory;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.erick.factory.FileSystemFileTransporterFactory;
import org.erick.factory.RemoteFileTransporterFactory;
import org.erick.strategy.FileTransporter;

public interface FileTransporterFactory {

	public static FileTransporter configureTransporter() {
		FileTransporter fileTransporter;
		if (isUserChoiceRemoteConfiguration()) {
			FileTransporterFactory remoteFactory = new RemoteFileTransporterFactory();
			fileTransporter = remoteFactory.createTransporter();
		} else {
			FileTransporterFactory fileSystemFactory = new FileSystemFileTransporterFactory();
			fileTransporter = fileSystemFactory.createTransporter();
		}
		return fileTransporter;
	}
	
	private static boolean isUserChoiceRemoteConfiguration() {
		System.out.println("Remote or local configuration? Please choose one of below options:");
		System.out.println("R - Remote");
		System.out.println("L - Local");
		System.out.println("E - Exit");
		BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
		String input = null;
        try {
			input = bufferRead.readLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
        
        if (input.equalsIgnoreCase("R")) {
        	return true;
        } else {
        	return false;
        }
	}
	
	FileTransporter createTransporter();
}
