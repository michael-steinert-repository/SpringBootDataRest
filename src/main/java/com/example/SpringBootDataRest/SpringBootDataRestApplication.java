package com.example.SpringBootDataRest;

import com.example.SpringBootDataRest.entity.Student;
import com.example.SpringBootDataRest.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.List;

@SpringBootApplication
public class SpringBootDataRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDataRestApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(StudentRepository studentRepository, RepositoryRestConfiguration repositoryRestConfiguration) {
        return args -> {
            repositoryRestConfiguration.exposeIdsFor(Student.class);
            studentRepository.saveAll(List.of(
                    new Student(1L, "Michael", 27),
                    new Student(2L, "Marie", 26)
            ));
            studentRepository.findAll().forEach(student -> {
                System.out.println(String.format("Name: %s, Age: %s", student.getName(), student.getAge()));
            });
        };
    }
}





