 public class ServiceStation {

     protected String modelName;
     protected int wheelsCount;

     protected ServiceStation() {
         this.modelName = modelName;
         this.wheelsCount = wheelsCount;
     }

     protected String getModelName() {
         return modelName;
     }

     protected int getWheelsCount() {
         return wheelsCount;
     }

     public void updateTyre() {
         System.out.println("Меняем покрышку");
     }

     public void checkEngine() {
         System.out.println("Проверяем двигатель");
     }
     public static void check(Bicycle bicycle, Car car, Truck truck) {

     }

 }


