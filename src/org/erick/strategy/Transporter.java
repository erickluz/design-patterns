package org.erick.strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public enum Transporter {
	GOOGLE_DRIVE		(1, "Google Drive", 	  true),
	SFTP				(2, "SFTP", 			  true),
	SCP					(3, "SCP", 				  true),
	WINDOWS_FILESYSTEM	(4, "Windows FileSystem", false),
	LINUX_FILESYSTEM	(5, "Linux FileSystem",   false),
	APPLE_FILESYSTEM	(6, "Apple FileSystem",   false);
	
	
	private Integer id;
	private String description;
	private Boolean isRemote;
	private static final Map<Integer, Transporter> transporters = new ConcurrentHashMap<>();
	
	static {
		for (Transporter transmitter : Transporter.values()) {
			transporters.put(transmitter.getId(), transmitter);
		}
	}
	
	private Transporter (Integer id, String description, Boolean isRemote){
		this.id = id;
		this.description = description;
		this.isRemote = isRemote;
	}

	public Integer getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}
	
	public Boolean isRemote() {
		return this.isRemote;
	}
	
	public static Transporter fromId(Integer id) {
		if (id == null) {
			throw new IllegalArgumentException();
		}
		return transporters.get(id);
	}
	
	public static List<Transporter> getAllValues(){
		return new ArrayList<>(transporters.values());
	}
	
	public static List<Transporter> getAllRemoteTransporters() {
		return new ArrayList<>(transporters.values()).stream()
				.filter(Transporter::isRemote)
				.collect(Collectors.toList());
	}
	
	public static List<Transporter> getAllLocalTransporters() {
		return new ArrayList<>(transporters.values()).stream()
				.filter(transporter -> !transporter.isRemote())
				.collect(Collectors.toList());
	}
}