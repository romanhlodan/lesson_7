package ua.com.hrv;

public class CY_27 extends Paner implements Special {

   private int maxSpeed;
   private String bodyColor;
   private Aircraft_control aircraft_control = new Aircraft_control();

 public int getMaxSpeed() {
  return maxSpeed;
 }

 public String getBodyColor() {
  return bodyColor;
 }

 public void setBodyColor(String bodyColor) {
  this.bodyColor = bodyColor;
 }

 public Aircraft_control getAircraft_control() {
  return aircraft_control;
 }

 public void setAircraft_control(Aircraft_control aircraft_control) {
  this.aircraft_control = aircraft_control;
 }

 @Override
    public int turbo() {
     this.maxSpeed = 1200;
      int maxTurboSpeed = 1900;
      return (int)Math.floor(Math.random() * (maxTurboSpeed - maxSpeed + 1) + maxSpeed);
    }

    @Override
    public int stels() {
     int minStels = 5;
     int maxStels = 60;
     return (int)Math.floor(Math.random()*(maxStels - minStels + 1) + minStels);
    }

    @Override
    public int nuclear() {
     int minNuclear = 1;
     int maxNuclear = 10;
     return (int)Math.floor(Math.random()*(maxNuclear - minNuclear + 1) + minNuclear);
    }

 @Override
 public int engineStart() {
  int min = 20;
  int max = 88;
  return (int)Math.floor(Math.random() * (max - min + 1) + min);
 }

 @Override
 public double distance() {
  return (double) (Math.random()*1000);
 }

 @Override
 public void planeLanding() {
  System.out.println("Planer is landing");
 }


}

