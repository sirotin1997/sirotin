import java.io.*;

public class Lab1{
public static void main(String args[]){
System.out.println("A:");
Point3d FirstP = new Point3d(getDouble(), getDouble(), getDouble());
System.out.println("B:");
Point3d SecondP = new Point3d(getDouble(), getDouble(), getDouble());
System.out.println("C:");
Point3d ThirdP = new Point3d(getDouble(), getDouble(), getDouble());
double Area = Check(FirstP, SecondP, ThirdP);
if(Area==0) System.out.println("Error");
else System.out.println("S = " + Area);
}
public static double getDouble() {
try {
BufferedReader br =
new BufferedReader(new InputStreamReader(System.in));
String s = br.readLine();
try {
double d = Double.parseDouble(s);
return d;
}
catch (NumberFormatException e) {
return 0.0;
}}
catch (IOException e) {
return 0.0;
}}
public static double computeArea(double A, double B, double C)
{
double p=(A+B+C)/2;
return Math.sqrt(p*(p-A)*(p-B)*(p-C));
}
public static double Check(Point3d A, Point3d B, Point3d C)
{
if((A.equals(B) || B.equals(C) || C.equals(A))) return 0.0;
else
{
double AB = A.distanceTo(B);
double BC = B.distanceTo(C);
double CA = C.distanceTo(A);
if(AB>BC+CA || BC>AB+CA || CA>AB+BC) return 0.0;
else return computeArea(AB, BC, CA);
}}}
