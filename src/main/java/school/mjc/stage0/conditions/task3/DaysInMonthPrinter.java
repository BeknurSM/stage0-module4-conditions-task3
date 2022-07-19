package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        int days;
        if(month<=12 && month>=1)
        {
            if(month==1 || month==3 ||month==5 ||month==7||month==8||month==10||month==12)
            {
                days=31;
            }
            else if(month==4 || month  ==6 || month==9 || month == 11)
            {
                days=30;
            }
            else
            {
                if(month==2)
                {
                    if(2022%400==0&&2022%100==0)
                    {
                        days=28;
                    }
                    else
                    {
                        if(2022%4==0&&2022%100!=0)
                        {
                            days=29;
                        }
                        else
                            days=28;
                    }
                }

            }
            System.out.println(days);
        }
        else
            System.out.println("wrong number!");

    }
}
