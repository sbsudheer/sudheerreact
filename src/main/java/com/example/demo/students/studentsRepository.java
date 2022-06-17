
package com.example.demo.students;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.demo.students.*;
public interface studentsRepository extends MongoRepository<students,String> {
}