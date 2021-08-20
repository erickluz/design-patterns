package org.erick.prototype;

import org.erick.strategy.FileTransporter;

public interface FileTransporterPrototype {
	
	FileTransporter clone();
}
