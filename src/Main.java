public class Main {

    public static void main(String[] args) {

        Bottles song = new Bottles();

        for (int i = song.getNumBottles(); i > 0; i--) {
            if (i > 2) {
                System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer. Take one down, pass it around, " + (i - 1) + " bottles of beer on the wall.");
            } else if (i > 1) {
                System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer. Take one down, pass it around, " + (i - 1) + " bottle of beer on the wall.");
            } else {
                System.out.println(i + " bottle of beer on the wall, " + i + " bottle of beer. Take one down, pass it around, " + (i - 1) + " bottles of beer on the wall.");
            }
        }
    }
}