package lesson030.HomeWork;

public enum Sessons {
    SUMMER("Средняя температура летом: "),
    AUTUMN("Средняя температура осенью: "),
    WINTER("Средняя температура зимой: "),
    SPRING("Средняя температура весной: ");
    private String middleTempRussian;


    Sessons(String middleTempRussian){
        this.middleTempRussian = middleTempRussian;
    }

    public String getMiddleTempRussian() {
        return middleTempRussian;
    }

    public void setMiddleTempRussian(String middleTempRussian) {
        this.middleTempRussian = middleTempRussian;
    }
}
