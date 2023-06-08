/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proj2;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author Owner
 */
public class Sports {
    public static String sportsData = GameDatabase.sports;
    public static String ID = null;
    public static String questionText = null;
    public static Map<String, String> PA = null;
    public static String actualAnswer = null;
    
    public static void getQuestion(String QuestionID){
        //System.out.println(mathsData);
        
        Map<String, Question> questionStore = parseQuestions(sportsData);
        
        String[] questionIDList = {"q1", "q2", "q3", "q4", "q5", "q6", "q7", "q8", "q9", "q10"};
        Random random = new Random();
        int randomIndex = random.nextInt(questionIDList.length);
        String randomItem = questionIDList[randomIndex];
        
      
        // Accessing a question by ID
        //String questionID = randomItem;
        Question question = questionStore.get(QuestionID);
        if (question != null) {
            ID = QuestionID;
            questionText = question.getQuestionText();
            PA = question.getPossibleAnswers();
            actualAnswer = question.getAnswer();
//            
//            System.out.println("Question ID: " + questionID);
//            System.out.println("Question: " + question.getQuestionText());
//            System.out.println("Possible Answers: " + question.getPossibleAnswers());
//            System.out.println("Correct Answer: " + question.getAnswer());
        } else {
            System.out.println("Question not found for ID: " + QuestionID);
        }
    }
    
    public static String getID(){
        return ID;
    }
    
    public static String getQuestion1(){
        return questionText;
    }
    
    public static Map<String, String> getPA(){
        return PA;
    }
    
    public static String getActualAnswer(){
        return actualAnswer;
    }
    
    private static Map<String, Question> parseQuestions(String inputString) {
        Map<String, Question> questionStore = new HashMap<>();
        String[] questionData = inputString.split("\\n\\n");

        for (String data : questionData) {
            String[] lines = data.split("\\n");
            String questionID = lines[0].substring(lines[0].indexOf(":") + 2);
            String questionText = lines[1].substring(lines[1].indexOf(":") + 2);

            Map<String, String> possibleAnswers = new HashMap<>();
            String answer = null;

            for (int i = 2; i < lines.length; i++) {
                String line = lines[i];
                String[] parts = line.split(": ");

                if (parts[0].equals("Answer")) {
                    answer = parts[1];
                } else {
                    String paID = parts[0].substring(parts[0].indexOf(":") + 2);
                    String paValue = parts[1];
                    possibleAnswers.put(paID, paValue);
                }
            }

            Question question = new Question(questionText, possibleAnswers, answer);
            questionStore.put(questionID, question);
        }

        return questionStore;
    }
    
    static class Question {
        private final String questionText;
        private final Map<String, String> possibleAnswers;
        private final String answer;

        public Question(String questionText, Map<String, String> possibleAnswers, String answer) {
            this.questionText = questionText;
            this.possibleAnswers = possibleAnswers;
            this.answer = answer;
        }

        public String getQuestionText() {
            return questionText;
        }

        public Map<String, String> getPossibleAnswers() {
            return possibleAnswers;
        }

        public String getAnswer() {
            return answer;
        }
    }
    
    public static String testQuestion(){
        String result = "In which sport do athletes compete for the Davis Cup?";
        
        return result;
    }
}
