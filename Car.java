class Car{
private Integer year;
private String make;
private Double speed;

Car (int year,String make,double speed){
      
       this.year=year;
	   this.make=make;
       this.speed=speed;
}

public int getyear(){

   return this.year;
}
public String getmake(){

   return this.make;
}
public double getspeed(){

   return this.speed;
}

void accelerate(){
    
	  speed=speed+1;
	  System.out.println("The new speed is"+" "+speed);
  
}
}