package QuanLi;

import QuanLi.Model.Person;
import QuanLi.Model.Student;

import java.util.Comparator;

public class StudentComporator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        if((o1 instanceof Student) && (o2 instanceof Student)){
            if(((Student) o1).getAvengerPoint()<((Student) o2).getAvengerPoint()){
                return -1;
            }else if(((Student) o1).getAvengerPoint()>((Student) o2).getAvengerPoint()){
                return 1;
            }else {
                return 0;
            }
        }
        else {
            return 0;
        }
    }
}
