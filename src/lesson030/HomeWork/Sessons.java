package lesson030.HomeWork;

public enum Sessons {
    SUMMER("Средняя температура летом: ", 25),
    AUTUMN("Средняя температура осенью: ",15),
    WINTER("Средняя температура зимой: ",-20),
    SPRING("Средняя температура весной: ",12);
    private String middleTempRussian;
    public int middleTemp;


    Sessons(String middleTempRussian, int middleTemp) {
        this.middleTempRussian = middleTempRussian;
        this.middleTemp = middleTemp;
    }

    public int getMiddleTemp() {
        return middleTemp;
    }

    public void setMiddleTemp(int middleTemp) {
        this.middleTemp = middleTemp;
    }

    public String getMiddleTempRussian() {
        return middleTempRussian;
    }


    public void setMiddleTempRussian(String middleTempRussian) {
        this.middleTempRussian = middleTempRussian;
    }
}
