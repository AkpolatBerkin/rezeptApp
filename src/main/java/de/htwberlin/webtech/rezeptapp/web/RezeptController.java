package de.htwberlin.webtech.rezeptapp.web;

import de.htwberlin.webtech.rezeptapp.Rezept;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class RezeptController {

    @GetMapping(path = "/")
    public String showHelloWorldPage() {
        return "rezepte";
    }

    @GetMapping(path = "/rezepte")
    public String showRezepte(Model model) {

        List<Rezept> rezeptListe = Arrays.asList(
                new Rezept("Pizza", "Teig, Tomaten, Käse", "Backen", 2),
                new Rezept("Spaghetti", "Nudeln, Sauce", "Kochen", 3)

        );

        model.addAttribute("rezepte", rezeptListe);

        return "rezepte";
    }
}
