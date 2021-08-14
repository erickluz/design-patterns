package org.erick.strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public enum Transmitter {
	GOOGLE_DRIVE	(1, "Google Drive"),
	SFTP			(2, "SFTP"),
	SCP				(3, "SCP");
	
	private Integer id;
	private String description;
	private static final Map<Integer, Transmitter> transmitters = new ConcurrentHashMap<>();
	
	static {
		for (Transmitter transmitter : Transmitter.values()) {
			transmitters.put(transmitter.getId(), transmitter);
		}
	}
	
	private Transmitter (Integer id, String description){
		this.id = id;
		this.description = description;
	}

	public Integer getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}
	
	public static Transmitter fromId(Integer id) {
		if (id == null) {
			throw new IllegalArgumentException();
		}
		return transmitters.get(id);
	}
	
	public static List<Transmitter> getAllValues(){
		return new ArrayList<>(transmitters.values());
	}
}
