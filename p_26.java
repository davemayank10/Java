class Vehicle {
    int noOfWheels;

    public Vehicle(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }
}

class TwoWheeler extends Vehicle {
    public TwoWheeler() {
        super(2);
    }
}

class FourWheeler extends Vehicle {
    public FourWheeler() {
        super(4);
    }
}

class Bicycle extends TwoWheeler {
    public Bicycle() {
        super();
    }
}

class Motorcycle extends TwoWheeler {
    public Motorcycle() {
        super();
    }
}

class Car extends FourWheeler {
    public Car() {
        super();
    }
}

class Truck extends FourWheeler {
    public Truck() {
        super();
    }
}

class Pra_26{
    public static void main(String[] args){
        TwoWheeler bicycle = new Bicycle();
        System.out.println("Bicycle has " + bicycle.noOfWheels + " wheels");

        TwoWheeler motorcycle = new Motorcycle();
        System.out.println("Motorcycle has " + motorcycle.noOfWheels + " wheels");

        FourWheeler car = new Car();
        System.out.println("Car has " + car.noOfWheels + " wheels");

        FourWheeler truck = new Truck();
        System.out.println("Truck has " + truck.noOfWheels + " wheels");
    }
}

/*
Output:
 Bicycle has 2 wheels
 Motorcycle has 2 wheels
 Car has 4 wheels
 Truck has 4 wheels
 */
