package com.example;

import java.util.Random;


public class MyClass {
    private String[] jokes = {
            "I dreamt I was forced to eat a giant marshmallow. When I woke up, my pillow was gone.",
            "My dog used to chase people on a bike a lot. It got so bad, finally I had to take his bike away.",
            "My wife\'s cooking is so bad we usually pray after our food.",
            "I\'d like to buy a new boomerang please. Also, can you tell me how to throw the old one away?",
            "Coco Chanel once said that you should put perfume on places where you want to be kissed by a man. But hell does that burn!",
            "When my wife starts to sing I always go out and do some garden work so our neighbors can see there\'s no domestic violence going on.",
            "It is so cold outside I saw a politician with his hands in his own pockets.",
            "Two Elephants meet a totally naked guy. After a while one elephant says to the other: \"I really don\'t get how he can feed himself with that thing!\"",
            "I wanted to grow my own food but I couldn’t get bacon seeds anywhere.",
            "I can\'t believe I forgot to go to the gym today. That\'s 7 years in a row now.",
            "A naked women robbed a bank. Nobody could remember her face.",
            "The 21st century: Deleting history is often more important than making it.",
            "How do you tell that a crab is drunk? It walks forwards.",
            "I\'ve no home, I haven\'t got control, I can\'t see any escape. Way past the time I got a new keyboard.",
            "They threw me out of the cinema today for bringing my own food. But come on – the prices are way too high, plus I haven\'t had a barbecue in months.",
            "Why haven\'t you ever seen any elephants hiding up trees? Because they\'re really, really good at it.",
            "Why did the physics teacher break up with the biology teacher? There was no chemistry.",
            "I got another letter from this lawyer today. It said \"Final Notice\". Good that he will not bother me anymore.",
            "You\'ll never believe who I bumped into on my way to the eye doctor! Everybody!"
    };

    public String newJoke(){
        return jokes[new Random().nextInt(jokes.length)];
    }
}
