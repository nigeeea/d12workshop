//creating the controller class

package sg.edu.nus.iss.d12workshop;

import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path={"/indexresource", "/indexresource.html"})
public class IndexResource {

    @GetMapping(produces = {"text/html"})
    //Model model for dynamic content
    public String index(Model model) {

        //adding dynamic attributes to the webpage, such as the current time and current hour
        model.addAttribute("currTime", (new Date()).toString());

        Calendar cal = Calendar.getInstance();
        model.addAttribute("currHour", cal.get(Calendar.HOUR_OF_DAY));

        return "indexresource";
        //create indexresource.html in template folder
    }
    
}
