package question_6;

public class OverLoading {
	public int Overloading(int x, int y)
    {
        return (x + y);
    }
    public int Overloading(int x, int y, int z)
    {
        return (x + y + z);
    }
    public double Overloading(double x, double y)
    {
        return (x + y);
    }

    public static void main(String args[])
    {
    	OverLoading s = new OverLoading();
        System.out.println(s.Overloading(10, 20));
        System.out.println(s.Overloading(10, 20, 30));
        System.out.println(s.Overloading(10.5, 20.5));
    }


}
