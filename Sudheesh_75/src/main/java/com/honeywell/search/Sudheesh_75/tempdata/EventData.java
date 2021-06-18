package com.honeywell.search.Sudheesh_75.tempdata;

import java.time.LocalDate;
import java.util.List;

import com.honeywell.search.Sudheesh_75.dtos.Event;

/**
 * Temporary data. We can move to DB.
 * @author Sudheesh G S
 *
 */
public final class EventData {

	public static final List<Event> events = List.of(
			 new Event(1, "Spring 2.5", "New Delhi", false),
			 new Event(1, "Azure", "Bangalore", false),
			 new Event(1, "AWS Re-invent", "Bangalore", true),
			 new Event(1, "Mobile Conference", "Bangalore", true),
			 new Event(1, "Jakarta EE", "Kochi", false)
			);
	private EventData() {
	}
}
