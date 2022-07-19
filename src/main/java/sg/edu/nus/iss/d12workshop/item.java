package sg.edu.nus.iss.d12workshop;


//model class - do not need to annotate model
public class item {
    private String itemName;
    private Integer quantity;

    //getters and setters for the instance variables of this model class
    public String getItemName(){
        return itemName;
    }
    public void setItemName(String n){
        itemName = n;
    }

    public Integer getQuantity(){
        return quantity;
    }

    public void setQuantity(Integer i){
        quantity=i;
    }
    
}
