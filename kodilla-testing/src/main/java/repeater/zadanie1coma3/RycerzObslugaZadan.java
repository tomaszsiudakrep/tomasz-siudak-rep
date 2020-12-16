package repeater.zadanie1coma3;

public class RycerzObslugaZadan {

    QuestQuest questQuest;

    public RycerzObslugaZadan(QuestQuest questQuest) {
        this.questQuest = questQuest;
    }

    public void doProcess() {
        questQuest.process();
    }
}
