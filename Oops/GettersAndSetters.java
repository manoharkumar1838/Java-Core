package Oops;

public class GettersAndSetters {

    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Red");
        System.out.println(p1.getColor());

        p1.setTip(5);
        System.out.println(p1.getTip());

    }

}

class Pen {
   private String color;
   private int tip;

   // GET to return the value.
   String getColor() {
       return this.color;
   }

   int getTip() {
       return this.tip;
   }

   // SET to modify the value
   //THIS : this keyword is used to refer to the current object
   void setColor(String newcolor) {
       color = newcolor;
   }

   void setTip(int newTip) {
       tip = newTip;
   }
}
