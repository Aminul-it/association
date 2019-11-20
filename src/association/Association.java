
package association;


public class Association {
    

    
    public static void main(String[] args) {
        
        
        
            student s1=new student("aminul","21");
        s1.setContact(new studentContact("Dhaka", "67688", "aminulit@gmail.com", "017578976"));
        System.out.println(s1.getContact().getCity());
        
    }
    
}
