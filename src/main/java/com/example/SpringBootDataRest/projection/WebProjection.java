package com.example.SpringBootDataRest.projection;

import com.example.SpringBootDataRest.entity.Student;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "web", types = Student.class)
public interface WebProjection {
    /* Example generated Endpoints from Spring Data REST : */
    /*  ../students/search/findByName?studentName=Michael&projection=web */
    Long getId();
    String getName();
    int getAge();
}
