//controller class

package sg.edu.nus.iss.d12workshop;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

//import sg.edu.nus.iss.d12workshop.CartService;

@Controller
//request mapping is to define how...
@RequestMapping(path = { "/cart"})
public class CartController {

    @GetMapping(produces = { "text/html" })
    public String displayCart(Model model) {
        CartService cs = new CartService();
        List<item> cartItems = cs.getShoppingItems();
        model.addAttribute("cart", cartItems);

        return "cart";
    }

    @GetMapping("{itemname}")
    public String filteredCart(
    @PathVariable(name="itemname", required = true) String itemname,    
    Model model) {
        CartService cs = new CartService();
        List<item> cartItems = cs.getShoppingItems();

        List<item> filteredItems = new ArrayList<>();
        for (item s: cartItems){
            if(s.getItemName().contains(itemname)) {
                filteredItems.add(s);
            }
        }

        model.addAttribute("cart", filteredItems);

        return "cart";
    }
}
