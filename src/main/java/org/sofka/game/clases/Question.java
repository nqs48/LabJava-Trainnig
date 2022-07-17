package org.sofka.game.clases;

import java.util.*;

public class Question {
    private ArrayList<String> questionInformation;
    private final ArrayList<String> OPTIONS;

    private ArrayList<String> temporalOptions;

    public Question(ArrayList<String> questionInformation) {
        this.questionInformation = questionInformation;
        this.OPTIONS = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
    }

    public Boolean validateAnswer(String userAnswer) {
        ArrayList<String> options = temporalOptions;
        String answer = questionInformation.get(6);
        Map<String, String> questionMap = new HashMap<>();
        for(int i=0; i<options.size(); i++) {
            questionMap.put(OPTIONS.get(i), options.get(i));
        }
        questionMap.put("answer", answer);
        System.out.println(questionMap);
        if(questionMap.get(userAnswer).equals(questionMap.get("answer"))) {
            return true;
        }
            return false;



    }
    public ArrayList<String> getOptions() {
        ArrayList<String> options = new ArrayList<>();
        for(int i=2; i<=5; i++) {
            options.add(questionInformation.get(i));
        }
        Collections.shuffle(options);
        return options;
    }

    public void showQuestionInformation(){
        ArrayList<String> options = getOptions();
        temporalOptions = options;
    }

    public ArrayList<String> getTemporalOptions() {
        return temporalOptions;
    }

    public ArrayList<String> getQuestionInformation() {
        return questionInformation;
    }
}
