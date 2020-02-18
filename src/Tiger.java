public class Tiger extends Animal{

    public Tiger(String name) {
        super(name, "meat");
    }

    public void sleep() {
        System.out.println(this.name + " sleeps for 8 hours");
    }

    public void eat(String food) {
        System.out.println(this.name + " eats " + food);
        if (food == this.favoriteFood) {
            System.out.println("YUM!!! " + this.name + " wants more " + food);
        } else {
            sleep();
        }
    }
}