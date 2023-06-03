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
    
    public static String getRandomNumber(){
        String[] questionIDList = {"q1", "q2", "q3", "q4", "q5", "q6", "q7", "q8", "q9", "q10"};
        Random random = new Random();
        int randomIndex = random.nextInt(questionIDList.length);
        String randomItem = questionIDList[randomIndex];
        
        System.out.println("rng is "+randomItem);
        
        return randomItem;
        
        
    }
    
}
