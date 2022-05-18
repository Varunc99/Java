class RaceTrack{

  public static void main (String [] args){
  
  Car c1 = new Car(2010,"Porsche",25.0);
  System.out.println (c1.getyear());
  System.out.println (c1.getmake());
  System.out.println (c1.getspeed());
  
  c1.accelerate();
  
  }
}