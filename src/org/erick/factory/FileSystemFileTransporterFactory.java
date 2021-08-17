package org.erick.factory;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.erick.abstractfactory.FileTransporterFactory;
import org.erick.strategy.FileTransporter;
import org.erick.strategy.Transporter;
import org.erick.strategy.local.AppleFileSystem;
import org.erick.strategy.local.LinuxFileSystem;
import org.erick.strategy.local.WindowsFileSystem;

public class FileSystemFileTransporterFactory implements FileTransporterFactory {

	@Override
	public FileTransporter createTransporter() {
		Transporter transporter = getUserChoiceTransporter();
		FileTransporter fileTransporter;
		switch (transporter) {
			case APPLE_FILESYSTEM: 
				fileTransporter = new AppleFileSystem();
				break;
			case LINUX_FILESYSTEM: 
				fileTransporter = new LinuxFileSystem();
				break;
			case WINDOWS_FILESYSTEM: 
				fileTransporter = new WindowsFileSystem();
				break;
			default: throw new IllegalArgumentException();
		}
		return fileTransporter;
	}

	public static Transporter getUserChoiceTransporter() {
		System.out.println("Please choose one of bellow Transporters");
		Transporter.getAllLocalTransporters().forEach(transmitter -> System.out.println(transmitter.getId() + " - " + transmitter.getDescription()));
		BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
		Transporter choice = null;
        try {
			String input = bufferRead.readLine();
			choice = Transporter.fromId(Integer.valueOf(input));
		} catch (Exception e) {
			e.printStackTrace();
		}
        return choice;
	}
}
