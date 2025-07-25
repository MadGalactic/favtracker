package com.example.FavTracker.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
//@RequestMapping
public class FavsController{

    @GetMapping("/")
    public String hello() {
        return "<html>" +
                "<body>" +
                "<h1>Welcome to the Favorite's Tracker!</h1>" +
                "<h2>Here you can track all of your favorite of your favorite things. You can choose from the options below:</h2>" +
                "<ol>" +
                "<li>Your Favorite Color</li>" +
                "<li>Your Favorite Food</li>" +
                "<li>Your Favorite Hobby</li>" +
                "</ol>";

    }

    @GetMapping("/form")
    public String favForm(){
        return "<html>" +
                "<body>" +
                "<form action = '/greeting' method = 'post'>" +
                "<h2>Name:</h2>" +
                "<input type='text' name='name' placeholder='Enter Your Name'>" +
                "<p>My Favorite Color:</p>" +
                "<select name='color' id='color'>" +
                "<option value='fuchsia'>fuchsia</option>" +
                "<option value='onyx'>onyx</option>" +
                "<option value='indigo'>indigo</option>" +
                "<option value='scarlet'>scarlet</option>" +
                "<option value='yellow'>yellow</option>" +
                "</select>" +
                "<p>My Favorite Food:</p>" +
                "<select name='food' id='food'>" +
                "<option value='pasta'>pasta</option>" +
                "<option value='sushi'>sushi</option>" +
                "<option value='tacos'>tacos</option>" +
                "<option value='dumplings'>dumplings</option>" +
                "<option value='salads'>salads</option>" +
                "</select>" +
                "<p>My Favorite Hobby:</p>" +
                "<select name='hobby' id='sports'>" +
                "<option value='music'>music</option>" +
                "<option value='dancing'>dancing</option>" +
                "<option value='drawing'>drawing</option>" +
                "<option value='skateboarding'>skateboarding</option>" +
                "<option value='cooking'>cooking</option>" +
                "</select>" +
                "<br>" +
                "<input type='submit' value='Enter'>" +
                 "</form>" +
                "</body>" +
                "</html>";
    }

//    @PostMapping("/form")
//    public String greetUser(@RequestParam String name, @RequestParam String color, @RequestParam String food, @RequestParam String hobby) {
//        if (name == null) {
//            name = "World";
//        }
//        return createMessage(name, color, food, hobby);
//    }

    @RequestMapping(value="greeting", method = {RequestMethod.GET, RequestMethod.POST})
    public String greetUser(@RequestParam String name, @RequestParam String color, @RequestParam String food, @RequestParam String hobby) {
        if (name == null) {
            name = "World";
        }
        return createMessage(name, color, food, hobby);
    }

//    public static String createMessage(String n, String l) {
//        String color = "";
//
//        if (l.equals("fuchsia")){
//            color = "fuchsia";
//        } else if (l.equals("onyx")) {
//            color = "onyx";
//        } else if (l.equals("indigo")) {
//            color = "indigo";
//        } else if (l.equals("scarlet")){
//            color = "scarlet";
//        } else if (l.equals("yellow")){
//            color = "yellow";
//        }
//        return n +"'s favorite color is " + color ;
//    }

    public static String createMessage(String n, String l, String h, String f) {
        String color;
        String food;
        String hobby;

        if (l.equals("fuchsia")){
            color = "fuchsia";
        } else if (l.equals("onyx")) {
            color = "onyx";
        } else if (l.equals("indigo")) {
            color = "indigo";
        } else if (l.equals("scarlet")){
            color = "scarlet";
        } else {
            color = "yellow";
        }

        if (f.equals("pasta")){
            food = "pasta";
        } else if (f.equals("sushi")) {
            food = "sushi";
        } else if (f.equals("tacos")) {
            food = "tacos";
        } else if (f.equals("dumplings")){
            food = "dumplings";
        } else {
            food = "salads";
        }

        if (h.equals("music")){
            hobby = "music";
        } else if (h.equals("dancing")) {
            hobby = "dancing";
        } else if (h.equals("drawing")) {
            hobby = "drawing";
        } else if (h.equals("skateboarding")){
            hobby = "skateboarding";
        } else {
            hobby = "cooking";
        }

        // return  n + "\n" +"1." + color + "\n" + "2." + food + "\n" + "3." + hobby;
        return  "<html>" +
                "<body>"+
                "<h1>" + n + "</h1>" +
                "<ol>" +
                "<li>" + l + "</li>" +
                "<li>" + f + "</li>" +
                "<li>" + h + "</li>" +
                "</ol>" +
                "</body>" +
                "<html>";


    }




}
