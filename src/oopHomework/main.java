package oopHomework;

public class main {
    public static void main(String[] args) {

        Student student1=new Student(7,"Baris",
                "Kiziltas","MALE");

        Student [] students={student1};

        for (Student student: students) {
            System.out.println(student1.studentId);
            System.out.println(student1.studentName);
            System.out.println(student1.studentLastName);
        }

        Teacher teacher1=new Teacher(10,"Engin","Demirog", "JAVA","Male");

        Teacher [] teachers={teacher1};

        for (Teacher teacher:teachers) {
            System.out.println(teacher.teacherDepartment);
            System.out.println(teacher.teacherID);
            System.out.println(teacher.teacherLastName);
            System.out.println(teacher.teacherName);
        }

        StudentManager manager = new StudentManager();
        manager.add(student1);
        manager.remove(student1);
    }
}
