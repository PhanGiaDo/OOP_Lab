public class Aims {
    public static void main(String[] args) {
        Cart anOder = new Cart();

        DVD dvd1 = new DVD("1","The Lion King", "Animation",  "Roger Allers", 87, 19.95f);
        anOder.addDVD(dvd1);

        DVD dvd2 = new DVD("2","Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        anOder.addDVD(dvd2);

        DVD dvd3 = new DVD("Aladin", "Animation", 18.99f);
        anOder.addDVD(dvd3);


        
        System.out.println("Total Cost is: ");
        System.out.println(anOder.totalCost());
    }
}
