/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proj2;

import java.util.Random;

/**
 *
 * @author Owner
 */
public class RNG {
    public static String[] questionIDList = {"q1", "q2", "q3", "q4", "q5", "q6", "q7", "q8", "q9", "q10"};
    private static boolean isIterated = false;

    public static String getRandomNumber(){
        if (isIterated) {
            // All questions have been iterated, stop here
//            System.out.println("hellooo");
            return null;
        }

        Random random = new Random();
        int randomIndex;
        do {
            randomIndex = random.nextInt(questionIDList.length);
        } while (questionIDList[randomIndex] == null);

        String randomItem = questionIDList[randomIndex];
        questionIDList[randomIndex] = null;
        //GUI.points++;

        System.out.println("rng is " + randomItem);

        // Check if all questions have been iterated
        isIterated = true;
        for (String question : questionIDList) {
            if (question != null) {
                isIterated = false;
                break;
            }
        }

        return randomItem;
    }
    
    public static String forTest(){
        return questionIDList[1];
    }
}
