package denispetre.food.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/products", produces = {MediaType.TEXT_HTML_VALUE})
public class ProductController {

    @GetMapping("/")
    public String getAllProducts(Model model){

        return "products/index";
    }

    @GetMapping("/{id}")
    public String product(@PathVariable("id") long id, Model model){

        return "product/show";
    }
}
