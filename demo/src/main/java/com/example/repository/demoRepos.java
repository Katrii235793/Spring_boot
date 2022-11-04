/**
 * 
 */
package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Demo;

/**
 * @author ustjavafsdb118
 *
 */
@Repository
public interface demoRepos extends JpaRepository<Demo,Integer>{

}
