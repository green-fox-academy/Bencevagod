package GreenFoxOrg;

public class Mentor extends Person{
    private String level;

    public Mentor() {
        super();
        this.level = "intermediate";
    }

    public Mentor(String name, int age, String gender, String level) {
        super(name, age, gender);
        this.level = level;
    }

    @Override
    public String specificIntroduce() {
        return " "+this.level+" mentor";
    }

    @Override
    public void getGoal() {
        System.out.println("Educate brilliant junior software developers.");
    }
}
