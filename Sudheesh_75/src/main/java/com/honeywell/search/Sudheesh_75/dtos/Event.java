package com.honeywell.search.Sudheesh_75.dtos;

public class Event {

	private int id;
	private String name;
	private String location;
	private boolean isRegistered;

	public Event(int id, String name, String location, boolean isRegistered) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.isRegistered = isRegistered;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public boolean isRegistered() {
		return isRegistered;
	}

	public void setRegistered(boolean isRegistered) {
		this.isRegistered = isRegistered;
	}

	@Override
	public String toString() {
		return "Event [id=" + id + ", name=" + name + ", location=" + location + ", isRegistered=" + isRegistered + "]";
	}

}
