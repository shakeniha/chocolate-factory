abstract class Chocolate {
    String type;

    public void describe() {
        System.out.println("This is a " + type + " chocolate.");
    }
}

class DarkChocolate extends Chocolate {
    public DarkChocolate() {
        type = "dark";
    }
}

class MilkChocolate extends Chocolate {
    public MilkChocolate() {
        type = "milk";
    }
}

class WhiteChocolate extends Chocolate {
    public WhiteChocolate() {
        type = "white";
    }
}

class VeganChocolate extends Chocolate {
    public VeganChocolate() {
        type = "vegan";
    }
}

class SugarFreeChocolate extends Chocolate {
    public SugarFreeChocolate() {
        type = "sugar-free";
    }
}

class ChocolateFactory {
    public Chocolate createChocolate(String type) {
        switch (type.toLowerCase()) {
            case "dark":
                return new DarkChocolate();
            case "milk":
                return new MilkChocolate();
            case "white":
                return new WhiteChocolate();
            case "vegan":
                return new VeganChocolate();
            case "sugar-free":
                return new SugarFreeChocolate();
            default:
                throw new IllegalArgumentException("Unknown chocolate type: " + type);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ChocolateFactory factory = new ChocolateFactory();
        Chocolate darkChocolate = factory.createChocolate("dark");
        Chocolate milkChocolate = factory.createChocolate("milk");
        Chocolate whiteChocolate = factory.createChocolate("white");
        Chocolate veganChocolate = factory.createChocolate("vegan");
        Chocolate sugarFreeChocolate = factory.createChocolate("sugar-free");

        darkChocolate.describe();
        milkChocolate.describe();
        whiteChocolate.describe();
        veganChocolate.describe();
        sugarFreeChocolate.describe();
    }
}
