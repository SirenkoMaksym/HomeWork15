public class Doctor {
    String name;
    String beruf;
    int erfahrung;

    public Doctor(String docName, String docBeruf, int docArbeitAlsDoc){
        name = docName;
       beruf = docBeruf;
       erfahrung = docArbeitAlsDoc;
    }



    void sayDoctor(){
        System.out.println("Du muss einnen Termin machen!");
    }




}
