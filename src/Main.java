import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Bottles song = new Bottles();
        Scanner input = new Scanner(System.in);

        input.useDelimiter("\n");

        // take input from user to configure display
        System.out.println("How many bottles to begin? (default: 99, must be greater than 0 and less than 2,147,483,647)");

        if (input.hasNextInt()) {
            song.setNumBottles(input.nextInt());
        } else {
            input.nextLine();
        }



        System.out.println("How many bottles to take per round? (default: 1, must be greater than 0 and no more than the number on the wall)");

        if(input.hasNextInt()){
            song.setBottlesPerRound(input.nextInt());
        } else {
            input.nextLine();
        }

        System.out.println("What containers to take down? (default: bottles)");

        if(input.hasNextLine()) {
            song.setItemBeingTaken(input.next());
        }

        System.out.println("What is in the containers? (default: beer)");

        if(input.hasNextLine()) {
            song.setWhatsInItem(input.next());
        }

        System.out.println("Where are the containers? (default: on the wall)");
            song.setWhereIsItem(input.next());


        //loop through song from configured number of bottles to 0
        for (int i = song.getNumBottles(); i > 0; i -= song.getBottlesPerRound()) {
            if(i > 2)
                System.out.println(Converter.toText(i) + song.getItemBeingTaken() + " of " + song.getWhatsInItem() + " " + song.getWhereIsItem() + ", " + Converter.toText(i) + song.getItemBeingTaken() + " of " + song.getWhatsInItem() + ". take " + Converter.toText(song.getBottlesPerRound()) + "down, pass it around, " + Converter.toText(i - song.getBottlesPerRound()) + song.getItemBeingTaken() + " of " + song.getWhatsInItem() + " " + song.getWhereIsItem() +  ".");
            else if(i > 1)
                System.out.println(Converter.toText(i) + song.getItemBeingTaken() + " of " + song.getWhatsInItem() + " " + song.getWhereIsItem() + ", " + Converter.toText(i) + song.getItemBeingTaken() + " of " + song.getWhatsInItem() + ". take " + Converter.toText(song.getBottlesPerRound()) + "down, pass it around, " + Converter.toText(i - song.getBottlesPerRound()) + song.getItemBeingTaken() + " of " + song.getWhatsInItem() + " " + song.getWhereIsItem() +  ".");
            else
                System.out.println(Converter.toText(i) + song.getItemBeingTaken() + " of " + song.getWhatsInItem() + " " + song.getWhereIsItem() + ", " + Converter.toText(i) + song.getItemBeingTaken() + " of " + song.getWhatsInItem() + ". take " + Converter.toText(song.getBottlesPerRound()) + "down, pass it around, " + Converter.toText(i - song.getBottlesPerRound()) + song.getItemBeingTaken() + " of " + song.getWhatsInItem() + " " + song.getWhereIsItem() +  ".");

        }

    }
}
