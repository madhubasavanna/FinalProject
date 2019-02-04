package com.example.javajokes;

import java.util.Random;

public class MyJokes {

    private final String[] jokes = {
            "There were two peanuts walking down a dark alley, one was assaulted.",

            "What do you call a sleepwalking nun… A roamin’ Catholic.",

            "How do you make holy water? You boil the hell out of it.",

            "What did the 0 say to the 8? Nice belt!",

            "Why did the orange stop? Because, it ran outta juice.",

            "What’s brown and sounds like a bell? Dung!",

            "Knock knock. Who’s there? Interrupting Cow. Interrupting Cow who- MOOOOOOO!",

            "Why did the storm trooper buy an iphone? He couldn’t find the Droid he was looking for.",

            "Knock knock…who’s there? I eat mop. I eat mop who? Ooooo gross! (now do you get the earlier one?)",

            "Why is six afraid of seven? Because seven ate nine.",

            "How many Alzheimer’s patients does it take to change a light bulb?….. To get to the other side!",

            "What do you call a masturbating cow? Beef stroganoff.",

            "What do you have when you have two little green balls in the palm of your hand?? Answer: Kermit’s undivided attention!",

            "What did one snowman say to the other? Nice balls.",

            "How do you make a tissue dance? You put a little boogie in it.",

            "Why did the policeman smell bad? He was on duty.",

            "Why does Snoop Dogg carry an umbrella? FOR DRIZZLE!",

            "Why can’t you hear a pterodactyl in the bathroom? Because it has a silent pee.",

            "What did the Zen Buddhist say to the hotdog vendor? Make me one with everything.",
    };

    public String getJokes() {
        int index = new Random().nextInt(jokes.length);
        return jokes[index];
    }
}
