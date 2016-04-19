
public class Bottles {

    private int numBottles = 99;
    private int bottlesPerRound = 1;
    private String itemBeingTaken = "bottles";
    private String whatsInItem = "beer";
    private String whereIsItem = "on the wall";

    public void setNumBottles(int number){
        if(number > 0 && number < 1000000000){
            this.numBottles = number;
        }
    }

    public int getNumBottles(){
        return this.numBottles;
    }

    public void setBottlesPerRound(int number){
        if(number > 0 && number < this.numBottles){
            this.bottlesPerRound = number;
        }
    }

    public int getBottlesPerRound(){
        return this.bottlesPerRound;
    }

    public void setItemBeingTaken(String item){
        if(!item.equals("")){
            this.itemBeingTaken = item;
        }
    }

    public String getItemBeingTaken(){
        return this.itemBeingTaken;
    }

    public void setWhatsInItem(String contents){
        if(!contents.equals("")){
            this.whatsInItem = contents;
        }
    }

    public String getWhatsInItem(){
        return this.whatsInItem;
    }

    public void setWhereIsItem(String location){
        if(!location.equals("")){
            this.whereIsItem = location;
        }
    }

    public String getWhereIsItem(){
        return this.whereIsItem;
    }
}
