import java.sql.Array;
import java.util.ArrayList;

public interface Job {
    interface job {
        //waiting for you guys
        //Create Job Interface which have salary, startShift, endShift, printJobDescription, printWorkers, hirePerson, firePerson functions.
        //Create OfficeJob abstract class implement Job
        //implement necessarry functions from interface and create required fields
        //Create OutsideJob abstract class implement Job
        //implement necessarry functions from interface and create required fields

        //Create Person class without inheriting anything and have basic peson information(then you will store person list in the abstract classes)

        //Create SoftwareEngineer extends OfficeJob
        //implement necessarry functions from abstract class and create required fields

        //Create TaxiDriver extends OutsideJob
        //implement necessarry functions from abstract class and create required fields
        //Write your main class to have 1 SoftwareEngineer job and 1 TaxiDriver  job
        //also create 10 people and assign these people to jobs.

        double getSalary ();
        String startShift();
        String endShift();

        void printJobDescription();
        void printWorkers();
        void hirePerson ();
        void firePerson ();

    }

    abstract  class  OfficeJob implements job {
        protected double salary ;
        protected String jobDescription;
        protected List<Person> workers;

        public OfficeJob (int salary , String jobDescription){
            this.salary=salary;
            this.jobDescription=jobDescription;
            this.workers= new ArrayList<>();

            }

            public int getsalary (){
            return salary;

            }

            public String endShift(){
            return  "Offce time work ends at 5pm";

            }


        public String startShift(){
            return  "Offce time work ends at 8pm";

        }
        public  void  printJobDescription(){
            System.out.println("The job detail is: "+jobDescription);

        }
        public void  printWorkers(){
            System.out.println("outside of job workers");
            for (Person p:  workers);
            System.out.println(p);

        }
    }
        public void  firePerson(Person person) {

        }
        
    }
