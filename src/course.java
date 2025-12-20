public class course {
    private String courseName;
    private String instructor;
    private student[] students;

    public course(String courseName, String instructor, int size) {
        this.courseName = courseName;
        this.instructor = instructor;
        students = new student[size];
    }

    public void addStudent(student s, int index) {
        if (index >= 0 && index < students.length)
            students[index] = s;
    }

    public double courseAverageGPA() {
        double sum = 0;
        int count = 0;
        for (student s : students) {
            if (s != null) {
                sum += s.getGpa();
                count++;
            }
        }
        return count == 0 ? 0 : sum / count;
    }

    public student highestCreditStudent() {
        student max = null;
        for (student s : students) {
            if (s != null && (max == null || s.getCredits() > max.getCredits()))
                max = s;
        }
        return max;
    }

    public String toString() {
        return "Course: " + courseName + ", Instructor: " + instructor;
    }
}

