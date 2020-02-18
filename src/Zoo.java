public class Zoo {

    public static void main(String[] args) {
        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
        tigger.eat("kibble");
        Bear pooh = new Bear("Pooh");
        pooh.eat("fish");
        pooh.eat("meat");
        Unicorn rarity = new Unicorn("Rarity");
        rarity.eat("marshmallows");
        rarity.sleep();
        Giraffe gemma = new Giraffe("Gemma");
        gemma.eat("meat");
        gemma.eat("leaves");
        gemma.sleep();
        Bee stinger = new Bee("Stinger");
        stinger.eat("ice cream");
        stinger.eat("pollen");
        // fix
        Zookeeper zoebot = new Zookeeper("Zoebot");
        Animal[] animals = {tigger, pooh, rarity, gemma, stinger};
        zoebot.feedAnimals(animals, "peanut butter");
    }
}