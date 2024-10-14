public interface Job {
    double getSalary();
    String getStartShift();
    String getEndShift();
    void printJobDescription();
    void printWorkers();
    void hirePerson(Person person);
    void firePerson(Person person);
}
