/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proj2;

/**
 *
 * @author Owner
 */
class Utility
{
    private static int sleepTime = 2;
    public static void setSleepTime( int time ){ sleepTime = time; }

    public static void waitFor(){
       try {
          Thread.sleep(sleepTime * 1000L);
       } catch (Exception e) {
          System.out.println(e.toString());
       }
    }
}
