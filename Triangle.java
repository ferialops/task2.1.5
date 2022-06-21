package ru.vsu.cs.kunakhova_a_y;

public class Triangle {
    public final Dots A;
    public final Dots B;
    public final Dots C;
    public double BA;
    public double CB;
    public double AC;

    public Triangle(Dots A, Dots B, Dots C) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.BA = Math.sqrt(Math.pow((A.x - B.x), 2) + Math.pow((A.y - B.y), 2));
        this.CB = Math.sqrt(Math.pow((B.x - C.x), 2) + Math.pow((B.y - C.y), 2));
        this.AC = Math.sqrt(Math.pow((C.x - A.x), 2) + Math.pow((C.y - A.y), 2));

    }

    public double CalculatePerimeter() {
        return  BA + CB + AC;
    }
    public double CalculateArea() {
        double HalfPerimeter = CalculatePerimeter()/2;
        return Math.sqrt(HalfPerimeter * (HalfPerimeter - BA) * (HalfPerimeter -CB) * (HalfPerimeter - AC));
    }
    public boolean ifDotInTriangle(Dots dots) {
       double a = (A.x-dots.x)*(B.y-A.y)-(B.x-A.x)*(A.y-dots.y);
       double b = (B.x-dots.x)*(C.y-B.y)-(C.x-B.x)*(B.y-dots.y);
       double c = (C.x-dots.x)*(A.y-C.y)-(A.x-C.x)*(C.y-dots.y);

       if((a >= 0 && b >= 0 && c >=0)||(a <= 0 && b <= 0 && c <=0)){
           return true;
       } else {
           return false;
       }
    }
}
