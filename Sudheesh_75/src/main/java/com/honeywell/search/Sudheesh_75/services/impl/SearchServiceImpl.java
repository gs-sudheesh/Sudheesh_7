/**
 * 
 */
package com.honeywell.search.Sudheesh_75.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.honeywell.search.Sudheesh_75.dtos.Event;
import com.honeywell.search.Sudheesh_75.services.SearchService;
import com.honeywell.search.Sudheesh_75.tempdata.EventData;

/**
 * @author Sudheesh G S
 *
 */
@Service
public class SearchServiceImpl implements SearchService {

	/**
	 * Events which are matching to the searched key
	 */
	@Override
	public List<Event> getEvents(String searchKey) {
		List<Event> filteredEvents = EventData.events.stream().filter(e->searchKey.equals(e.getName()) || searchKey.equals(e.getLocation())).collect(Collectors.toList());
		return filteredEvents;
	}
	
	/**
	 * Events which are matching to the searched key and registed
	 */
	@Override
	public List<Event> getEventsRegistered(String searchKey) {
		List<Event> filteredEvents = EventData.events.stream().filter(e->e.isRegistered() && (searchKey.equals(e.getName()) || searchKey.equals(e.getLocation()))).collect(Collectors.toList());
		return filteredEvents;
	}

}
