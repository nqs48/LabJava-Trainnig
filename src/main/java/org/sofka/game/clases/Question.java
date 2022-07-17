package org.sofka.game.clases;

import java.util.*;

/**
 * @author Nestor Quiroga
 * @author Victor Roca
 * Class Question
 */
public class Question {
    private ArrayList<String> questionInformation;
    private final ArrayList<String> OPTIONS;
    private ArrayList<String> temporalOptions;

    /**
     * Constructor class Question
     * @param questionInformation Array Questions of Strings to init the game
     */
    public Question(ArrayList<String> questionInformation) {
        this.questionInformation = questionInformation;
        this.OPTIONS = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
    }

    /**
     * Method to validate the user answer
     * @param userAnswer Answer of the user
     * @return Returns false or true
     */
    public Boolean validateAnswer(String userAnswer) {
        ArrayList<String> options = temporalOptions;
        String answer = questionInformation.get(6);
        Map<String, String> questionMap = new HashMap<>();
        for(int i=0; i<options.size(); i++) {
            questionMap.put(OPTIONS.get(i), options.get(i));
        }
        questionMap.put("answer", answer);
        return questionMap.get(userAnswer).equals(questionMap.get("answer"));
    }

    /**
     * Generate the options with shuffle method
     * @return Returs Arraylist of strings
     */
    public ArrayList<String> getOptions() {
        ArrayList<String> options = new ArrayList<>();
        for(int i=2; i<=5; i++) {
            options.add(questionInformation.get(i));
        }
        Collections.shuffle(options);
        return options;
    }

    /**
     * Create a value temporal to options
     */
    public void showQuestionInformation(){
        ArrayList<String> options = getOptions();
        temporalOptions = options;
    }

    /**
     * Gets the current value for temporalOptions
     * @return returns temporalOptions, type ArrayList
     */
    public ArrayList<String> getTemporalOptions() {
        return temporalOptions;
    }


    /**
     * Gets the current value for questionText
     * @return returns questionText, type String
     */
    public String getQuestionText() {
        return questionInformation.get(1);
    }
}
