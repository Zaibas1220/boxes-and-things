public class Main {
    public static void main(String[] args) {

        Box box = new Box(15);

        box.add( new Book("Fedor Dostojevski", "Crime and Punishment", 2) ) ;
        box.add( new Book("Robert Martin", "Clean Code", 1) );
        box.add( new Book("Kent Beck", "Test Driven Development", 0.7) );

        box.add( new CD("Pink Floyd", "Dark Side of the Moon", 1973) );
        box.add( new CD("Wigwam", "Nuclear Nightclub", 1975) );
        box.add( new CD("Rendezvous Park", "Closer to Being Here", 2012) );

        Box biggerBox = new Box(30);

        biggerBox.add(box);
        biggerBox.add(new Book("Hedgar Allan Poe", "Necronomicon", 1.2));

        System.out.println(box.toString());
        System.out.println(biggerBox.toString());
    }
}