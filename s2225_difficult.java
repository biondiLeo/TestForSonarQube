public class ExampleClass {
   public String toString() {
      Random r = new Random();
      if(r.nextInt(10) == r.nextInt(10)){
          return null; // Noncompliant
      }
      else if(r.nextInt(10) == r.nextInt(10)){
         return "null";
      }
      return "";
   }
}
