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

    public static Month[] Q1 = {jan, feb, mar};
    public static Month[] Q2 = {apr, may, jun};
    public static Month[] Q3 = {jul, aug, sen};
    public static Month[] Q4 = {oct, nov, dec};
    public static Month[] Half1 = {jan, feb, mar, apr, may, jun};
//    public static Month[] Half1 = {Month[Q1], Q2[]};
    public static Month[] Half2 = {jul, aug, sen, oct, nov, dec};
//    public static Month[] Half2 = {Q3[], Q4[]};
    public static Month[] Year = {jan, feb, mar, apr, may, jun, jul, aug, sen, oct, nov, dec};
//    public static Month[] Year = {Half1[], Half2[]};


}
