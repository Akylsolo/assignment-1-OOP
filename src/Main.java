public class Main {

    public static student getTopStudent(student[] arr) {
        student top = arr[0];
        for (student s : arr) {
            if (s.getGpa() > top.getGpa())
                top = s;
        }
        return top;
    }

    public static int countHonors(student[] arr) {
        int count = 0;
        for (student s : arr)
            if (s.isHonors())
                count++;
        return count;
    }

    public static int totalCredits(student[] arr) {
        int sum = 0;
        for (student s : arr)
            sum += s.getCredits();
        return sum;
    }

    public static void main(String[] args) {

        student[] students = new student[5];

        students[0] = new student("Aimuhamet Aldiar", "S001", "CS");
        students[1] = new student("Nayanuly Maksat", "S002", "IT");
        students[2] = new student("Muratbek Akyl", "S003", "SE");
        students[3] = new student("Maksut Alibi", "S004", "CS");
        students[4] = new student("Maratov Nursultan", "S005", "DS");

        students[0].setGpa(3.8); students[0].addCredits(90);
        students[1].setGpa(3.2); students[1].addCredits(75);
        students[2].setGpa(3.9); students[2].addCredits(100);
        students[3].setGpa(2.9); students[3].addCredits(60);
        students[4].setGpa(3.6); students[4].addCredits(85);

        course course = new course("OOP", "Aidana Aidynkyzy ", 5);
        for (int i = 0; i < 5; i++)
            course.addStudent(students[i], i);

        System.out.println(course);
        System.out.println("Average GPA: " + course.courseAverageGPA());
        System.out.println("Highest Credit Student: " + course.highestCreditStudent());

        System.out.println("Top GPA Student: " + getTopStudent(students));
        System.out.println("Honors Students: " + countHonors(students));
        System.out.println("Total Credits: " + totalCredits(students));
    }
}
