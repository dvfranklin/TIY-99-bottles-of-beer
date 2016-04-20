
public class Bottles {

    // set up configurable variables with default values
    private int numBottles = 99;
    private int bottlesPerRound = 1;
    private String itemBeingTaken = "bottles";
    private String whatsInItem = "beer";
    private String whereIsItem = "on the wall";

    // number of bottles must be positive and within the range for an integer
    public void setNumBottles(int number){
        if(number > 0 && number < 2000000000){
            this.numBottles = number;
        }
    }

    public int getNumBottles(){
        return this.numBottles;
    }

    // number of bottles per round must be positive, and less than or equal to total bottles
    public void setBottlesPerRound(int number){
        if(number > 0 && number <= this.numBottles){
            this.bottlesPerRound = number;
        }
    }

    public int getBottlesPerRound(){
        return this.bottlesPerRound;
    }

    // item taken cannot be empty string
    public void setItemBeingTaken(String item){
        if(!item.equals("")){
            this.itemBeingTaken = item;
        }
    }

    public String getItemBeingTaken(){
        return this.itemBeingTaken;
    }

    // contents of item cannot be empty string
    public void setWhatsInItem(String contents){
        if(!contents.equals("")){
            this.whatsInItem = contents;
        }
    }

    public String getWhatsInItem(){
        return this.whatsInItem;
    }

    // location of item cannot be empty string
    public void setWhereIsItem(String location){
        if(!location.equals("")){
            this.whereIsItem = location;
        }
    }

    public String getWhereIsItem(){
        return this.whereIsItem;
    }
}
