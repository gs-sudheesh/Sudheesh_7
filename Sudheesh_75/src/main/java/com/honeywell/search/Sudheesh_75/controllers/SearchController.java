/**
 * 
 */
package com.honeywell.search.Sudheesh_75.controllers;

import java.util.Collections;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.honeywell.search.Sudheesh_75.dtos.Event;

/**
 * @author Sudheesh G S
 *
 */

@RestController
public class SearchController {
	
	private static final Logger LOGGER = LogManager.getLogger(SearchController.class);

	@SuppressWarnings("unchecked")
	@GetMapping("/search")
	public List<Event> findEvents(@RequestParam(value = "key") String searchKey){
		if(searchKey.isBlank()) {
			LOGGER.error("Expected search value, found empty. Returning empty result");
			return Collections.EMPTY_LIST;
		}
		return null;
	}
}
