class CircleMainClass
{
	public static void main(String[] args)
{
Circle c1=new Circle();
Circle c2=new Circle();
c1.r=8;
c2.r=10;
double area1=Circle.pi*c1.r*c1.r;
double area2=Circle.pi*c2.r*c2.r;

double Crmf1=2*Circle.pi*c1.r;
double Crmf2=2*Circle.pi*c2.r;

System.out.println("---Circle Details---");
System.out.println("Radius of Circle 1="+c1.r);
System.out.println("Area of the circle 1="+area1);
System.out.println("Circumference of the circle="+Crmf1);

System.out.println("---Circle Details---");
System.out.println("Radius of Circle 1="+c2.r);
System.out.println("Area of the circle 1="+area2);
System.out.println("Circumference of the circle="+Crmf2);
}
}