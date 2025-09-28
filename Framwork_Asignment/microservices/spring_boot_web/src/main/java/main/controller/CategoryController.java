package main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import main.model.Category;
import main.repository.CategoryRepo;
import main.service.categoryservice;

@Controller
public class CategoryController {

    @Autowired
    private CategoryRepo ser;

    @GetMapping("/")
    public String categoryForm(Model model) {
        model.addAttribute("category", new Category());
        return "categorysave"; // HTML file in templates/
    }

    @PostMapping("/save_category")
    public String sdeta(@ModelAttribute Category c) {
        ser.save(c);
        return "redirect:/";
        
    }
    
    
    
    @GetMapping("/viewallcategory")
    public String listCategories(Model model) {
        List<Category> categories = ser.findAll(); // DB से सारी category लाई गई
        model.addAttribute("categories", categories); // ये view में भेज दी
        return "viewallcategory";
    }

}

