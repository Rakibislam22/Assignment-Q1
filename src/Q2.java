interface Product {
    Colour getColour();
}

class Colour {
    private String colour;

    public Colour(String colour) {
        this.colour = colour;
    }

    public String getColourName() {
        return colour;
    }
}

 class Shelf implements Product {
    private Colour colour;

    public Shelf(Colour colour) {
        this.colour = colour;
    }

    @Override
    public Colour getColour() {
        return colour;
    }
}

 class Desk implements Product {
    private Colour colour;

    public Desk(Colour colour) {
        this.colour = colour;
    }

    @Override
    public Colour getColour() {
        return colour;
    }
}


public class Q2 {
    public static void main(String[] args) {
        Colour red = new Colour("Red");
        Colour blue = new Colour("Blue");

        Product shelf = new Shelf(red);
        Product desk = new Desk(blue);

        System.out.println("Shelf colour: " + shelf.getColour().getColourName());
        System.out.println("Desk colour: " + desk.getColour().getColourName());
    }
}