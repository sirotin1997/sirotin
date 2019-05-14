public class Point3d{
private double xCoord;
private double yCoord;
private double zCoord;
public Point3d(double x, double y, double z){
xCoord=x;
yCoord=y;
zCoord=z;
}
public Point3d(){
this(0,0,0);
}
public double getX(){
return xCoord;
}
public double getY(){
return yCoord;
}
public double getZ(){
return zCoord;
}
public void setX(double val){
xCoord=val;
}
public void setY(double val){
yCoord=val;
}
public void setZ(double val){
zCoord=val;
}
public double distanceTo(Point3d SPoint) {
return Math.sqrt(Math.pow(- this.xCoord + SPoint.xCoord, 2)
+ Math.pow(- this.yCoord + SPoint.yCoord, 2)
+ Math.pow(- this.zCoord + SPoint.zCoord, 2));
}
public boolean equals(Point3d SPoint)
{
if(SPoint.xCoord == this.xCoord &&
SPoint.yCoord == this.yCoord &&
SPoint.zCoord == this.zCoord) return true;
else return false;
}
}
