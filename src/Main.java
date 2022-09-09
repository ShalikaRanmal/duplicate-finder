import com.exceptions.StudentNotFoundException;
import com.persons.DuplicateFinder;
import com.persons.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student std1 = new Student("Vimukthi",20,"HillWood");
        Student std2 = new Student("Kasun",21,"HighSchool");
        Student std3 = new Student("Danushka",20,"HighSchool");
        Student std4 = new Student("Ruwan",20,"HillWood");
        Student std5 = new Student("Chamara",20,"HighSchool");
        Student std6 = new Student("Lakshan",20,"HighSchool");
        Student std7 = new Student("Ruwan",20,"HillWood");
        Student std8 = new Student("Amara",20,"HighScool");
        Student std9 = new Student("Kasun",21,"HighSchool");
        Student std10 = new Student("Chamara",20,"HighSchool");

        List<Student> list = List.of(std1,std2,std3,std4,std5,std6,std7,std8,std9,std10);

        DuplicateFinder finder = new DuplicateFinder(list);
        try {
            List<Student> duplicates = finder.getDuplicates();
            System.out.println("duplicted Students---------------------------");
            for (int i = 0; i < duplicates.size(); i++) {
                System.out.println(duplicates.get(i).getName());
            }
            System.out.println("--end-----------------------------------------");

            List<Student> distint_list = finder.getDistintList();
            System.out.println("distint Students--------------------------------");
            System.out.println(distint_list.size());
            for (int i = 0; i < distint_list.size(); i++) {
                System.out.println(distint_list.get(i).getName());
            }
            System.out.println("--end-----------------------------------------");


            finder.getStudentByName("sahan");

        }catch (StudentNotFoundException e){
            System.out.println(e);
        }catch (Exception e){
            System.out.println(e);
        }

    }
}