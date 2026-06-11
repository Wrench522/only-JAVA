class Car{
    String brand;

    
    
  //constructor
    public Car(String brand){
        this.brand=brand;
    }

    void display(){
        System.out.println("Car Brand :"+brand);
    }

}

//child class 1
class sedan extends Car{
    sedan(String brand){ // constructor
        super(brand);
    }

    @Override
    void display(){
        System.out.println("sedan Brand : "+brand);
    }

}

//child class 2
class suv extends Car{
    suv(String brand){  // constructor
        super(brand);

    }

    @Override
    void display(){
        System.out.println("SUV Brand : "+brand);

    }

}
    //main class
    public class carType{
        public static void main(String[]args){

            //object
            Car car1=new sedan("Toyota");
            Car car2=new suv("Ford");

            //polymorphism
            car1.display();
            car2.display();


        }
    } 