package kr.co.ejbt.undergroundpollution.home;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    private Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    HomeService homeService;

    @GetMapping("/home")
    public String home(Model model) {
        List<Home> list = homeService.list();

        model.addAttribute("list", list);

        model.addAttribute("name", "devfuner");

        return "home/home";
    }
}
