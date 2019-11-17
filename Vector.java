public class Vector {
    double x3, y3;
    double lenght;
    public double Summ(double x1, double x2, double y1, double y2)
    {
        x3 = x1 + x2;
        y3 = y1 + y2;
        x3 = x3 * x3;
        y3 = y3 * y3;
        lenght = Math.sqrt(x3 + y3);
        return lenght;
    }
    public double Subs(double x1, double x2, double y1, double y2)
    {
        if (Math.sqrt(x1 * x1 + y1 * y1) > Math.sqrt(x2 * x2 + y2 * y2))
        {
            x3 = x1 - x2;
            y3 = y1 - y2;
        }
        else {
            x3 = x2 - x1;
            y3 = y2 - y1;
        }
        lenght = Math.sqrt(x3 * x3 + y3 * y3);
        return lenght;
    }
    public double Multi(double x1, double y1, double num)
    {
        num = num * num;
        x1 = x1 * x1;
        y1 = y1 * y1;
        lenght = Math.sqrt(x1 * num + y1 * num);
        return lenght;
    }
    public double Scalar_prod(double x1, double x2, double y1, double y2)
    {
        lenght = x1 * x2 + y1 * y2;
        return lenght;
    }
    public double Vector_prod(double x1, double x2, double y1, double y2)
    {
        lenght = x1*y2 - x2*y1;
        return lenght;
    }
    public double Vector_mixed(double x1, double x2, double x3, double y1, double y2, double y3, double z1, double z2, double z3)
    {
        lenght = x1 * y2 * z3 + x2 * y3 * z1 + x3 * y1 * z2 - x3 * y2 * z1 - x1 * y3 * z2 - x2 * y1 * z3;
        return lenght;
    }
}
