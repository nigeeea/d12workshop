package sg.edu.nus.iss.d12workshop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(path={"/weather"})
public class WeatherController {

    @GetMapping
    public String weather(
        @RequestParam(required=true) String city,
        @RequestParam(name="units", defaultValue = "kilometers") String units,
        Model model) {

        model.addAttribute("city", city);
        model.addAttribute("units", units);
        return "weather";
        //when weather is called it will return to a page call weather.html.. so go create the weather.html file in templates
        // as city is a required paramete.. see above.. use the following url: http://localhost:8085/weather?city=Singapore
        //you can also try the following URL: http://localhost:8085/weather?city=Singapore&units=miles to change teh default unit from
        //kilometers to miles
    }

    @GetMapping("{city}")
    public String weather2(
        @PathVariable(name="city", required = true) String city,
        @RequestParam(name="units", defaultValue = "kilometers") String units,
        Model model
    ) {


        model.addAttribute("city", city);
        model.addAttribute("units", units);
        return "weather";
    }
    
}
