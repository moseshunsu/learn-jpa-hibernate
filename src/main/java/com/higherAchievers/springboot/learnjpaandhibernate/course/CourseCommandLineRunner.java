package com.higherAchievers.springboot.learnjpaandhibernate.course;

import com.higherAchievers.springboot.learnjpaandhibernate.course.springDataJpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJdbcRepository repository;

//    @Autowired
//    private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1, "Learn AWS Jpa!", "inTwentySomethingMinutes"));
        repository.save(new Course(2, "Learn Azure Jpa!", "inTwentySomethingMinutes"));
        repository.save(new Course(3, "Learn DevOps Jpa!", "inTwentySomethingMinutes"));

        repository.deleteById(1L);

        System.out.println(repository.findById(2L));
        System.out.println(repository.findById(3L));

        System.out.println(repository.findAll());
        System.out.println(repository.count());
        System.out.println(repository.count());

        System.out.println(repository.findByAuthor("inTwentySomethingMinutes"));
        System.out.println(repository.  findByAuthor(""));

        System.out.println(repository.findByName("Learn Azure Jpa!"));
        System.out.println(repository.findByName(""));
    }
}
