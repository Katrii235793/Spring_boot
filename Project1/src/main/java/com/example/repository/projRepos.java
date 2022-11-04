/**
 * 
 */
package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Project1;

/**
 * @author ustjavafsdb118
 *
 */
@Repository
public interface projRepos extends JpaRepository<Project1,Integer> {

}
