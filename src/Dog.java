public class Dog {

    int age;
    String name;

    public Dog(String name,int age){
        this.name=name;
        this.age=age;
    }


   public void myDog() {
        System.out.println("my dog " + this.name);
   }

}
