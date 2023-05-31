public class Titik 
{
    double absis;
    double ordinat;
    static int CounterTitik;

    Titik()
	{
        CounterTitik = CounterTitik+1;
    }
	
    Titik(double a, double o)
	{
        absis = a;
        ordinat = o;
        CounterTitik = CounterTitik+1;
    }
	
    static int getCounterTitik()
	{
        return CounterTitik;
    }

    void setAbsis(double a)
	{
        absis = a;
    }
	
    void setOrdinat(double o)
	{
        ordinat=o;
    }

    double getAbsis()
	{
        return absis;
    }
	
    double getOrdinat()
	{
        return ordinat;
    }

}
