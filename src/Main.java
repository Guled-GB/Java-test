//waiting for you guys
//Create Job Interface which have salary, startShift, endShift, printJobDescription,
// printWorkers, hirePerson, firePerson functions.
//Create OfficeJob abstract class implement Job
//implement necessarry functions from interface and create required fields
//Create OutsideJob abstract class implement Job
//implement necessarry functions from interface and create required fields
//Create Person class without inheriting anything and have basic peson
// information(then you will store person list in the abstract classes)
//Create SoftwareEngineer extends OfficeJob
//Write your main class to have 1 SoftwareEngineer job and 1 TaxiDriver  job
//also create 10 people and assign these people to jobs.

    public class Main {
            public static void main(String[] args) {
                SoftwareEngineer engineer = new SoftwareEngineer(1000, "9:00 AM", "5:00 PM", "Java");
                Person john = new Person("Guled sah", 25, "Male");
                engineer.hirePerson(john);
                engineer.printJobDescription();
                engineer.printWorkers();
            }
        }
