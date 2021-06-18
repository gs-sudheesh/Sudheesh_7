/**
 * 
 */
package com.honeywell.search.Sudheesh_75.services;

import java.util.List;

import com.honeywell.search.Sudheesh_75.dtos.Event;

/**
 * @author Sudheesh G S
 *
 */

public interface SearchService {

	List<Event> getEvents(String searchKey, boolean isRegistered);

}
