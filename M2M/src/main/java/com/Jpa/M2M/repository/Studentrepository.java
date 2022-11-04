/**
 * 
 */
package com.Jpa.M2M.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Jpa.M2M.entity.Student;

/**
 * @author ustjavafsdb109
 *
 */
public interface Studentrepository  extends JpaRepository<Student,Long>{

}
