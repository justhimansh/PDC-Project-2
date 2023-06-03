/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proj2;
import java.util.ArrayList;
import java.util.Random;

public class randomQuestion {
    private static ArrayList<String> questionList = new ArrayList<>();
    private static Random rand = new Random();

    public static String getQ() {
        if (questionList.isEmpty()) {
            initializeQuestions();
        }

        int chosenIndex = rand.nextInt(questionList.size());
        String chosenQuestion = questionList.remove(chosenIndex);
        return chosenQuestion;
    }

    private static void initializeQuestions() {
        questionList.add("q1");
        questionList.add("q2");
        questionList.add("q3");
        questionList.add("q4");
        questionList.add("q5");
        questionList.add("q6");
        questionList.add("q7");
        questionList.add("q8");
        questionList.add("q9");
        questionList.add("q10");
    }
    
    
}

