/**
 * 
 */
package com.UST.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.UST.api.model.User;

/**
 * @author ustjavafsdb118
 *
 */

public interface UserRepository extends JpaRepository<User,Integer> {

	
}
