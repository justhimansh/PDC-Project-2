/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proj2;
import static Proj2.randomQuestion.getQ;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Owner
 * 
 */
public class Maths extends Information{
    
    public static String questions = "";
    public static String mathsData = Information.maths;
    static ArrayList<String> testing = new ArrayList<>();
    static Map<String, Question> questionStore = parseQuestions(mathsData);
    public static String testing3 = mathsData;
    public static String answer1 = mathsData;
    public static String answer2 = mathsData;
    public static String answer3 = mathsData;
    public static String answer4 = mathsData;
    public static String answer5 = mathsData;
    public static String q = mathsData;
    
    public static String testing () {
        String questionID = null;
        
        for (int i = 0; i < 10; i++) {
            String ID = randomQuestion.getQ();
            questionID = ID;
            //System.out.println(ID);
            testing.add(ID);
        }
        
        String questionID1 = "q2";
        Question question = questionStore.get(questionID1);
        if (question != null) {
            System.out.println("Question ID: " + questionID1);
            System.out.println("Question: " + question.getQuestionText());
            System.out.println("Possible Answers: " + question.getPossibleAnswers());
            System.out.println("Correct Answer: " + question.getAnswer());
        } else {
            System.out.println("Question not found for ID: " + questionID1);
        }
        
        
        for (int i = 0; i < testing.size(); i++) {
            String test1 = testing.get(i);
            
            questions = test1;
            String PLAESE = getUsername(questions);
            Map answers = getAnswers(questions);
            String real = getRealAnswer(questions);
            //System.out.println(PLAESE);
            //System.out.println(answers);
            
            answer1 = answers.get("A1").toString();
            answer2 = answers.get("A2").toString();
            answer3 = answers.get("A3").toString();
            answer4 = answers.get("A4").toString();
            answer5 = real;
            testing3 = PLAESE;
            System.out.println("123"+PLAESE);
            return PLAESE;
        }
        return "no work";
    }
    

    
    public static String getUsername(String questions){
        
        Question question = questionStore.get(questions);
        
        if(question != null){
            return question.getQuestionText();
        } else {
            System.out.println("Question not found for ID: " + questions);
        }
        return question.getQuestionText();
    }
    
    public static Map getAnswers(String questions){
        Question question = questionStore.get(questions);
        
        if(question != null){
            return question.getPossibleAnswers();
        } else {
            System.out.println("Question not found for ID: " + questions);
        }
        return question.getPossibleAnswers();
    }
    
    public static String getRealAnswer(String questions){
        Question question = questionStore.get(questions);
        
        if(question != null){
            return question.getAnswer();
        } else {
            System.out.println("Question not found for ID: " + questions);
        }
        return question.getAnswer();
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
    
    public static String getAnswer1(){
        return answer1;
    }
    
    public static String getAnswer2(){
        return answer2;
    }
    
    public static String getAnswer3(){
        return answer3;
    }
    
    public static String getAnswer4(){
        return answer4;
    }
    
    public static String getAnswer5(){
        return answer5;
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
            q = questionText;
            return questionText;
        }

        public Map<String, String> getPossibleAnswers() {
            return possibleAnswers;
        }

        public String getAnswer() {
            return answer;
        }
    
    }
    
}
