//service class

package sg.edu.nus.iss.d12workshop;

import java.util.ArrayList;
import java.util.List;

public class CartService {

    //create a function to list items
    public List<item> getShoppingItems() {

        List<item> lstItems = new ArrayList<>();

        item itm = new item();
        itm.setItemName("Prada Bag");
        itm.setQuantity(5);
        lstItems.add(itm);

        itm = new item();
        itm.setItemName("Chanel Wallet");
        itm.setQuantity(3);
        lstItems.add(itm);

        itm = new item();
        itm.setItemName("Macbook Pro");
        itm.setQuantity(10);
        lstItems.add(itm);

        itm = new item();
        itm.setItemName("LV Totebag");
        itm.setQuantity(8);
        lstItems.add(itm);

        itm = new item();
        itm.setItemName("Chanel Shoes");
        itm.setQuantity(3);
        lstItems.add(itm);

        itm = new item();
        itm.setItemName("Prade Bag");
        itm.setQuantity(5);
        lstItems.add(itm);

        return lstItems;
    }
    
}
