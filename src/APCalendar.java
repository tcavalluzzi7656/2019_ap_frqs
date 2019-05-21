import java.util.ArrayList;

public class APCalendar {
    private static boolean isLeapYear(int year)
    {
        if(year%4==0)
        {
            return  true;
        }
        return false;
    }


    public static int numberOfLeapYears (int year1, int year2)
    {
        int count=0;
        for(int i=year1;i<=year2;i++)
        {
            if(isLeapYear(i))
            {
                count++;
            }
        }
        return count;
    }

    private static int firstDayOfYear(int year)
    {
        return (1+5*(year-1%4)+4*(year-1%100)+6*(year-1%400))%7;
    }

    public static int dayOfYear (int month, int day, int year) {
        int count = 0;

        ArrayList<Integer> months = new ArrayList<>();
        months.add(31);
        if (isLeapYear(year)) {
            months.add(29);
        }
        else {months.add(28);}
            months.add(31);
            months.add(30);
            months.add(31);
            months.add(30);
            months.add(31);
            months.add(31);
            months.add(30);
            months.add(31);
            months.add(30);
            months.add(31);

            for (int i = 0; i < months.size(); i++) {
                if (i != month - 1) {
                    count += months.get(i);
                } else {
                    break;
                }
            }

            for (int i = 1; i <= day; i++) {
                count++;
            }

            return count;
        }



    public static int dayOfWeek(int month, int day, int year)
    {
        return (firstDayOfYear(year)+dayOfYear(month,day,year)-1)%7;
    }
}
