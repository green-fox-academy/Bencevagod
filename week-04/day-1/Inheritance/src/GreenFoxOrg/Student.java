package GreenFoxOrg;

public class Student extends Person{
    private String preivousOrganization;
    private int skippedDays;

    public Student() {
        super();
        this.preivousOrganization = "The School of Life";
        this.skippedDays = 0;
    }

    public Student(String name, int age, String gender, String preivousOrganization) {
        super(name, age, gender);
        this.preivousOrganization = preivousOrganization;
        this.skippedDays = 0;
    }

    @Override
    public void getGoal() {
        System.out.println("Be a junior software developer");
    }

    @Override
    public String specificIntroduce() {
        return " from " +this.preivousOrganization+" who skipped "+skippedDays+" days";
    }

    public void skipDays(int days) {
        this.skippedDays += days;
    }
}
