import java.util.*;
public class JobName {
    String jobName;
    private void set(){
        String name;
        System.out.println("Job Name:");
        Scanner setName = new Scanner(System.in);
        name = setName.nextLine();
        jobName = name;
    }

    private String get(){
        return jobName;
    }

}//ends class
