package HomeTasks.TenAndEleven.Ten;

import HomeTasks.TenAndEleven.Ten.Month;

public class MonthUtils {

    public final static Month jan = new Month ("jan", 31, 24);
    public final static Month feb = new Month ("feb", 28, 19);
    public final static Month mar = new Month ("mar", 31, 23);

    public final static Month apr = new Month ("apr", 30, 21);
    public final static Month may = new Month ("may", 31, 23);
    public final static Month jun = new Month ("jun", 30, 22);

    public final static Month jul = new Month ("jul", 31, 23);
    public final static Month aug = new Month ("aug", 31, 24);
    public final static Month sen = new Month ("sen", 30, 22);

    public final static Month oct = new Month ("oct", 31, 24);
    public final static Month nov = new Month ("nov", 30, 22);
    public final static Month dec = new Month ("dec", 31, 23);

    public static Month[] getQ1() {
        return new Month[]{jan, feb, mar};
        }

    public static Month[] getQ2() {
        return new Month[]{apr, may, jun};
    }

    public static Month[] getQ3() {
        return new Month[]{jul, aug, sen};
    }

    public static Month[] getQ4() {
        return new Month[]{oct, nov, dec};
    }

    public static Month[] getHalf1() {
        return new Month[]{jan, feb, mar, apr, may, jun};
    }

    public static Month[] getHalf2() {
        return new Month[]{jul, aug, sen, oct, nov, dec};
    }

    public static Month[] Year() {
        return new Month[]{jan, feb, mar, apr, may, jun, jul, aug, sen, oct, nov, dec};
    }


}
