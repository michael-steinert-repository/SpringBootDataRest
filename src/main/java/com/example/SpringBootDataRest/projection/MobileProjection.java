package com.example.SpringBootDataRest.projection;

import com.example.SpringBootDataRest.entity.Student;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "mobile", types = Student.class)
public interface MobileProjection {
    /* Example generated Endpoints from Spring Data REST: */
    /* ../students/search/findByName?studentName=Michael&projection=mobile */
    /* ../students/search/findByName?studentName=Michael&projection=mobile */
    /* ../students?projection=mobile */
    /* ../students?page=0&size=2&sort=name,desc&projection=mobile */
    Long getId();
    String getName();
}
