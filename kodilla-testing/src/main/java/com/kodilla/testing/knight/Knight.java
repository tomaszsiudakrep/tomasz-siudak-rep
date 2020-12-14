package com.kodilla.testing.knight;

public class Knight {
    private final Quest quest;

    public Knight(Quest quest) {
        this.quest = quest;
    }

    public void runQuest() {
        System.out.println("Starting..");
        this.quest.process();
        System.out.println("End of app");
    }
}
