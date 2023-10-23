package org.example;

import java.util.List;

public class FP02Excercises {

    public static void main(String[] args) {
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCP", "Azure", "Docker", "Kubernetes");

        // Print all Courses
        courses.stream().forEach(System.out::println);

        // Print Courses containing the word "Spring"
        courses.stream()
                .filter(course -> course.contains("Spring"))
                .forEach(System.out::println);

        // Print Courses whose name has atleast 4 letters
        courses.stream()
                .filter(course -> course.length() > 3)
                .forEach(System.out::println);
    }

}
