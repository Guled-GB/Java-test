public class SoftwareEngineer extends OfficeJob {
    private String programmingLanguage;

    public SoftwareEngineer(double salary, String startShift, String endShift, String programmingLanguage) {
        super(salary, startShift, endShift);
        this.programmingLanguage = programmingLanguage;
    }

    public void printJobDescription() {
        System.out.println("Software Engineer working in " + programmingLanguage);
    }
}
