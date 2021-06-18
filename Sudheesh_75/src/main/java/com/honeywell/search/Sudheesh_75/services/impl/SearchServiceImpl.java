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
	 * Events which are matching to the searched key. If registered is true, the method searches from registered list else all events.
	 * @param searchKey Key to search
	 * @param isRegistered is registered by the user
	 * @return List of events matching the criteria
	 */
	@Override
	public List<Event> getEvents(String searchKey, boolean isRegistered) {
		LOGGER.info("Entered getEvents method");
		List<Event> searchList = isRegistered ? EventData.events.stream().filter(Event::isRegistered).collect(Collectors.toList()):EventData.events;
		List<Event> filteredEvents = searchList.stream().filter(e-> e.getName().contains(searchKey) || searchKey.equals(e.getLocation())).collect(Collectors.toList());
		LOGGER.debug("Returned list from all events : {}",filteredEvents);
		return filteredEvents;
	}

}
