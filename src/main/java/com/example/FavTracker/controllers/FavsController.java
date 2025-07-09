package com.example.FavTracker.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

    // TODO: At localhost:8080/form,
    //  add a form that lets the user enter their name and choose their favorite,
    //  second favorite, and third favorite programming languages on your list.
    //  Use select elements for each of the rankings.

    @GetMapping("/form")
    public String favForm(){
        return "<html>" +
                "<body>" +
                "<form action = '/form' method = 'post'>" + // submit a request to /hello
                "<input type='text' name='name'>" +
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
}
