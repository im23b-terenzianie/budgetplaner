import java.lang.reflect.Type;

public class transaction {

    private String category;
    private double amount;
    private String type;

    // Konstruktor
    public transaction(String category, double amount, String type){
        this.category = category;
        this.amount = amount;
        this.type = type;
    }
    // Getter
    public String getCategory(){
        return category;
    }

    public double getAmount(){
        return amount;
    }

    public String getType(){
        return type;
    }

    //Setter

    public void setCategory(String category) {
        this.category = category;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setType(String type) {
        this.type = type;
    }
}
