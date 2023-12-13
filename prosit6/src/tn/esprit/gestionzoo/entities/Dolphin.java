package tn.esprit.gestionzoo.entities;

public final class Dolphin extends Aquatic {
   private float swimmingSpeed;

   public Dolphin() {
      System.out.println("hiii dolphin");
   }

   public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
      super(family, name, age, isMammal, habitat);
      this.swimmingSpeed = swimmingSpeed;
   }

   public float getSwimmingSpeed() {
      return swimmingSpeed;
   }

   public void setSwimmingSpeed(float swimmingSpeed) {
      this.swimmingSpeed = swimmingSpeed;
   }
   @Override
   public String toString() {
      return super.toString()+ "swimmingSpeed:" + this.swimmingSpeed;
   }

   public void swim(){
      System.out.println("This dolphin is swimming.");
   }
}
