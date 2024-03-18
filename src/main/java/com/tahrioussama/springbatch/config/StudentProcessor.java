package com.tahrioussama.springbatch.config;

import com.tahrioussama.springbatch.student.Student;
import org.springframework.batch.item.ItemProcessor;

public class StudentProcessor implements ItemProcessor<Student,Student> {
    @Override
    public Student process(Student student) throws Exception {
        // Setting id to null because we are duplicating the same ids,
        // so it only generate max 100
        student.setId(null);
        return student;
    }
}
