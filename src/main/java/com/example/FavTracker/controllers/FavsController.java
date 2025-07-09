package com.example.FavTracker.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping
public class FavsController{

    @GetMapping("/")
    public String hello() {
        return "<html>" +
                "<body>" +
                "<h1>Welcome to the Favorite's Tracker!</h1>" +
                "<h2>Here you can track all of your favorite colors. You can choose from the options below:</h2>" +
                "<ol>" +
                "<li>Fuchsia</li>" +
                "<li>Onyx</li>" +
                "<li>Indigo</li>" +
                "<li>Scarlet</li>" +
                "<li>Yellow</li>" +
                "</ol>";

    }

    @GetMapping("/form")
    public String favForm(){
        return "<html>" +
                "<body>" +
                "<form action = '/form' method = 'post'>" + // submit a request to /hello
                "<input type='text' name='name' placeholder='Enter Your Name'>" +
                "<select name='color' id='color'>" +
                "<option value='fuchsia'>fuchsia</option>" +
                "<option value='onyx'>onyx</option>" +
                "<option value='indigo'>indigo</option>" +
                "<option value='scarlet'>scarlet</option>" +
                "<option value='yellow'>yellow</option>" +
                "<input type='submit' value='Thanks!'>" +
                "</select>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    // TODO: Also at localhost:8080/form, use @PostMapping and @RequestParam
    //  to update the HTML with an h1 stating the user’s name and an ol showing
    //  the three programming languages in the order they chose.

    @PostMapping("/form")
    public String greetUser(@RequestParam String name, @RequestParam String color) {
        if (name == null) {
            name = "World";
        }
        return createMessage(name, color);
    }



}
