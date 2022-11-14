package oopsParttwo.Polymorphism;
class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return(super.getName() + " engine is starting");
    }

    @Override
    public String accelerate() {
        return(super.getName() +" is accelerating");
    }

    @Override
    public String brake() {
        return(super.getName() +" is braking");
    }
}