package challengequestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class JavaSort {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
        
           Comparator<Student> score = new Comparator<Student>() {
            public int compare(Student a, Student b){
                if(a.getCgpa() < b.getCgpa())
                return 1;
                else if(a.getCgpa() > b.getCgpa())
                return -1;
                else if(a.getFname().compareTo(b.getFname()) > 0)
                return 1;
                else if(a.getFname().compareTo(b.getFname()) == 0 && a.getId()<b.getCgpa())
                return 1;                
                else
                return -1;
            } 
        };
        Collections.sort(studentList, score);
        
      
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
    }

}
