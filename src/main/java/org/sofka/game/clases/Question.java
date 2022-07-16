package org.sofka.game.clases;

import java.util.*;

public class Question {
    private ArrayList<String> questionInformation;
    private ArrayList<String> OPTIONS = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));

    public Question(ArrayList<String> questionInformation) {
        this.questionInformation = questionInformation;
    }

    public Boolean validateAnswer(ArrayList<String> questionInformation, String userAnswer) {
        ArrayList<String> options = getOptions(questionInformation);
        String answer = questionInformation.get(6);
        Map<String, String> questionMap = new HashMap<>();
        for(int i=0; i<options.size(); i++) {
            questionMap.put(OPTIONS.get(i), options.get(i));
        }
        questionMap.put("answer", answer);
        if(questionMap.get(userAnswer).equals(questionMap.get("answer"))) {
            return true;
        }
            return false;



    }

    public ArrayList<String> getOptions(ArrayList<String> questionInformation) {
        ArrayList<String> options = new ArrayList<>();
        for(int i=2; i<=5; i++) {
            options.add(questionInformation.get(i));
        }
        Collections.shuffle(options);
        return options;
    }



    public ArrayList<String> getQuestionInformation() {
        return questionInformation;
    }
}
