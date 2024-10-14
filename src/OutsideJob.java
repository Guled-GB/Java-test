import java.util.ArrayList;
import java.util.List;

public abstract class OutsideJob implements Job {
    protected double salary;
    protected String startShift;
    protected String endShift;
    protected List<Person> workers;

    public OutsideJob(double salary, String startShift, String endShift) {
        this.salary = salary;
        this.startShift = startShift;
        this.endShift = endShift;
        this.workers = new ArrayList<>();
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public String getStartShift() {
        return startShift;
    }

    @Override
    public String getEndShift() {
        return endShift;
    }

    public void printWorkers() {
        if (workers.isEmpty()) {
            System.out.println("No workers hired.");
        } else {
            System.out.println("Workers:");
            for (Person worker : workers) {
                System.out.println(worker.getName());
            }
        }
    }
    public void hirePerson(Person person) {
        workers.add(person);
        System.out.println(person.getName() + " hired.");
    }
    public void firePerson(Person person) {
        workers.remove(person);
        System.out.println(person.getName() + " fired.");
    }
}
