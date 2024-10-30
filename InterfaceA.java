interface A {
    void Adisplay();
    void Ashow();
}

interface B {
    void Bdisplay();
    void Bshow();
}

 class AB implements A,B {
     public void Adisplay() {
         System.out.println("Adisplay");
     }
     public void Ashow() {
         System.out.println("Ashow");
     }
     
     public void Bdisplay() {
         System.out.println("Bdisplay");
     }
     public void Bshow() {
         System.out.println("Bshow");
     }
     

         public static void main(String[] args) {
             AB obj = new AB();
             obj.Adisplay();
             obj.Ashow();
             obj.Bdisplay();
             obj.Bshow();

         
     
       }

 }