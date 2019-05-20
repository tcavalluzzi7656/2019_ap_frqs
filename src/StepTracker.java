public class StepTracker {
    private int days;
    private int activeDays;
    private int totalSteps;
    private int minSteps;

    public StepTracker(int minSteps)
    {
        this.minSteps=minSteps;
        this.days=0;
        this.activeDays=0;
        this.totalSteps=0;
    }

    public void addDailySteps(int num)
    {
        totalSteps+= num;
        days++;
        if(num>=minSteps)
        {
            activeDays++;
        }
    }

    public int activeDays()
    {
        return activeDays;
    }

    public double averageSteps()
    {
        return ((double)totalSteps/(double)days);
    }
}
