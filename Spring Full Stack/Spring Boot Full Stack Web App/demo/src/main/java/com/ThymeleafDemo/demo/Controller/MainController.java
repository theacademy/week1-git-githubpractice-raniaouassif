package com.ThymeleafDemo.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.thymeleaf.templateparser.markup.HTMLTemplateParser;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller // indicate that it should be loaded up as a bean by Spring
public class MainController {

    String name = "John";
    int number = 42;

    @GetMapping("test") //give us the page that is being loaded
    public String testPage(Model model) {
        //Model is an object where we can put any data we want to render on the page
        // as key-value pairs & pick them up from the page using the key

        model.addAttribute("number", number);
        model.addAttribute("firstName", name);

        return "test";
    }

    @PostMapping("testForm")
    public String testForm(HttpServletRequest request) {
        name = request.getParameter("formFirstName");
        number = Integer.parseInt(request.getParameter("formNumber"));

        return "redirect:/test"; // to force the browser to go back to the test page and reload it.
    }

    @GetMapping("testList")
    public String testList(Model model) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(0);
        numbers.add(10);
        numbers.add(6);
        numbers.add(35);

        model.addAttribute("numberList", numbers);

        return "testList";
    }

    boolean bool = true;
    int theNumber =33;
    String aString = "testing";
    @GetMapping("testConditional")
    public String testConditional(Model model) {

        model.addAttribute("truth", bool);
        model.addAttribute("theNumber", theNumber);
        model.addAttribute("aString", aString);

        return "testConditional";
    }

    @PostMapping("testConditionalForm")
    public String testConditionalForm(HttpServletRequest request ) {
        bool = Boolean.parseBoolean(request.getParameter("formBool"));
        theNumber = Integer.parseInt(request.getParameter("formTheNumber"));
        aString = request.getParameter("formAString");

        return "redirect:/testConditional"; // to force the browser to go back to the test page and reload it.

    }
}