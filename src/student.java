public class student {
    private String name;
    private String id;
    private String major;
    private double gpa;
    private int credits;

    public student(String name, String id, String major) {
        this.name = name;
        this.id = id;
        this.major = major;
        this.gpa = 0.0;
        this.credits = 0;
    }

    // getters & setters
    public String getName() { return name; }
    public String getId() { return id; }
    public String getMajor() { return major; }
    public double getGpa() { return gpa; }
    public int getCredits() { return credits; }

    public void setGpa(double gpa) {
        if (gpa >= 0 && gpa <= 4.0)
            this.gpa = gpa;
    }

    public void addCredits(int c) {
        if (c > 0)
            credits += c;
    }

    public boolean isHonors() {
        return gpa >= 3.5;
    }

    public String toString() {
        return "Name: " + name +
                ", ID: " + id +
                ", Major: " + major +
                ", GPA: " + gpa +
                ", Credits: " + credits;
    }
}

