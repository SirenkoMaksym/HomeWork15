public class Teacher {
    String name;
    String sprache;
    String fach;
    public Teacher(String nameLehrer, String spracheTeacher, String fachTeacher){
        name = nameLehrer;
        sprache = spracheTeacher;
        fach = fachTeacher;

    }

    void teacherFahigkeit(){
        System.out.println("Ich erziene ");
    }
    void sayTeacher(){
        System.out.println("Meiner Studente ist am besten");
    }
}
