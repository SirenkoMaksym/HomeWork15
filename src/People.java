public class People {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Shulc", "ZahnArzt", 15);
        Student student = new Student("Petya", "cohort41", 25);
        Teacher teacher = new Teacher("Olaf", "Deutsch", "Geschihte");

        System.out.println("Ich bin "+ teacher.name + ". Ich spreche nur " + teacher.sprache + ". Ich erlerne " +
                teacher.fach);
        teacher.sayTeacher();
        teacher.teacherFahigkeit();


        System.out.println("Ich bin " + student.name + ". Ich bin in " + student.group + ". Ich bin schon " + student.age
                + " Jahre jung)");
        student.sayStudent();
        student.studentFagigkeit();

        System.out.println(doctor.name + " ist mein name. Ich bin " + doctor.beruf + ". Ich habe schon " +
                doctor.erfahrung + " Jahren arbeiten als Artz ");

        doctor.sayDoctor();
    }
}
