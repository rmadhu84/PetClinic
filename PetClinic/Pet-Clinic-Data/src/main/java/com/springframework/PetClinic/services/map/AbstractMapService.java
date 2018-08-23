/**
 * 
 */
package com.springframework.PetClinic.services.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import com.springframework.PetClinic.Model.BaseEntity;

/**
 * @author Madhu
 *
 */
public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

	Long ID;
	
	protected Map<Long, T> map = new HashMap<>();

	Set<T> findAll(){
		return new HashSet<>(map.values());
	}

	T findById(ID id) {
		return map.get(id);
	}

	//	T save(ID id, T object) {
	T save(T object) {
		if(object != null) {
			if(object.getId() == null) {
				object.setId(this.getNextId());
				map.put(object.getId(), object);
			}
		}
		//		 map.put(id, object);
		return object;
	}

	void deleteById(ID id) {
		map.remove(id);
	}

	void delete(T object) {
		map.entrySet().removeIf(entry -> entry.getValue().equals(object));
	}

	private Long getNextId() {
		try {
			return Collections.max(map.keySet()) + 1;
		}
		catch(NoSuchElementException e) {
			return 1L;
		}
	}
}
