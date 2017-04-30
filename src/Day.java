
public class Day {
    private String [] days = {"Sunday","Monday","Tuesday","Wednesday"," Thursday","Friday","Saturday"};
    private int day;

    public Day() {
        day=0;
    }

    public Day(int day) {
        this.day=day;
    }

    /**
     * To get the current day
     * @return to current day
     */
    public String getDay(){
        return days[day];
    }

    /**
     * To set the day
     * @return to set day
     */
    public void setDay(int day){
        this.day=day;
    }

    /**
     *To get the next day
     * @return to next day
     */
    public String nextDay(){
        return days[(day+1)%7];
    }

    /**
     * To get the previous day
     * @return to previous day
     */
    public String previousDay(){
        return days[(day+6)%7];
    }

    /**
     * to get the certain day after today
     * @param adds
     * @return to future day
     */
    public String futureDay(int adds){
        return days [(day+adds)%7];
    }

    /**
     * to know the certain day before day
     * @param minus
     * @return to pass day
     */
    public String passDay(int minus){
        return days [day-(minus%7)+7];

    }
    public String toString() {
        return days[day];
    }
}
