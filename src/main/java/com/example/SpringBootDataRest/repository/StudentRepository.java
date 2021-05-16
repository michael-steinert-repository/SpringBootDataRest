package com.example.SpringBootDataRest.repository;

import com.example.SpringBootDataRest.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    /* Custom Property for URL to hide the Property from Entity */
    Page<Student> findByNameContains(@Param("studentName") String name, Pageable pageable);
}
