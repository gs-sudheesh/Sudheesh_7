/**
 * 
 */
package com.honeywell.search.Sudheesh_75.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
	
	private static final Logger LOGGER = LogManager.getLogger(SearchServiceImpl.class);


	/**
	 * Events which are matching to the searched key
	 */
	@Override
	public List<Event> getEvents(String searchKey) {
		LOGGER.debug("Entered getEvents method");
		List<Event> filteredEvents = EventData.events.stream().filter(e->e.getName().contains(searchKey) || searchKey.equals(e.getLocation())).collect(Collectors.toList());
		LOGGER.debug("Returned list from all events : {}",filteredEvents);
		return filteredEvents;
	}
	
	/**
	 * Events which are matching to the searched key and registed
	 */
	@Override
	public List<Event> getEventsRegistered(String searchKey) {
		LOGGER.debug("Entered getEvents method");
		List<Event> filteredEvents = EventData.events.stream().filter(e->e.isRegistered() && (e.getName().contains(searchKey) || searchKey.equals(e.getLocation()))).collect(Collectors.toList());
		LOGGER.debug("Returned list from registered : {}",filteredEvents);
		return filteredEvents;
	}

}
