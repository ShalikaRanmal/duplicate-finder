package com.persons;

import com.exceptions.StudentNotFoundException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateFinder {
    public DuplicateFinder(List<Student> student){
        this.student = student;
    }
    private List<Student> student;



    public List<Student> getDuplicates(){
        List<Student> duplicate_std = new ArrayList<>();
        for (int index=0; index<student.size()-1;index++){
        for (int i = index+1; i <student.size() ; i++) {
            if (student.get(index).getName() == student.get(i).getName() &
                    student.get(index).getAge() == student.get(i).getAge() &
                    student.get(index).getSchool() == student.get(i).getSchool()) {
                duplicate_std.add(student.get(i));
            }
        }
        }
        return duplicate_std;
    }
    public List<Student> getDistintList(){
        List<Student> dups = new ArrayList<>(getDuplicates());
        List<Student> distint = new ArrayList<>();

        for (int index=0; index<student.size()-1;index++){

            boolean check_duplicate = false;
            for (Student dup:dups) {
                if(dup.getName().equals(student.get(index).getName())){
                    check_duplicate=true;
                }
            }
            if (!check_duplicate){
                distint.add(student.get(index));
            }
        }


        return distint;
    }
    public Student getStudentByName(String name) throws StudentNotFoundException {
        Student student_by_name;
        for (int i = 0; i <student.size() ; i++) {
            if(student.get(i).getName().equals(name)){
                student_by_name=student.get(i);
                return student_by_name;
            }
        }
        throw new StudentNotFoundException("Student "+ name+ " is not in this list");

    }
}
