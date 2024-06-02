public class ConvertTime {
    private int initValue = 0;
    private int minutes = 60;
    private int days = 24;

    public int getInitValue() {
        return this.initValue;
    }

    public void setInitValue(int initValue) {
        this.initValue = initValue;
    }
    public int convertHourToMinutes(){
        return this.initValue * this.minutes;
    }
    public int convertDaysToMinutes(){
            return this.initValue * (this.days * this.minutes);
    }
}
