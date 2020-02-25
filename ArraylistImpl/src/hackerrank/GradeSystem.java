package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class GradeSystem {
	
	public static List<Integer> gradingStudents(List<Integer> grades) {
        
        List<Integer> result=new ArrayList<Integer>();
        for(int i=0;i<grades.size();i++){
        	System.out.println(grades.get(i));
            if(grades.get(i)>40 && grades.get(i)%5>=3){
                result.add(((grades.get(i)/5)+1)*5);
            }
            else 
                result.add(grades.get(i));
        }
        System.out.println(result);
        return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ll=new ArrayList<Integer>();
		ll.add(73);
		ll.add(67);
		ll.add(38);
		ll.add(33);
		
		System.out.println(gradingStudents(ll));

	}

}
