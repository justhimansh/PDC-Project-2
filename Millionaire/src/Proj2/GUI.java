/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proj2;

import java.awt.Color;
import java.util.Random;
import java.util.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.Dimension;
import javax.swing.JDialog;
import javax.swing.JFrame;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Owner
 */
public class GUI extends javax.swing.JFrame {
    ArrayList<String> answered = new ArrayList<>();
    String[] categories = {"Maths", "Science", "Geography", "Pop Culture", "Sports", "History"};
    String currentCategory = "";
    JDialog dialog = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), "Reveal", true);
    JDialog dialog2 = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), "Phone", true);
    JDialog dialog3 = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), "50/50", true);
    JDialog dialog4 = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), "Winner!!!", true);
    static String username="";
    boolean reveal = false;
    boolean phone = false;
    boolean fiftyfifty = false;
    static int points = 0;
    //String saveRNG = RNG.getRandomNumber();
    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        chooseCategory();
    }
    

    
 
    
    private void chooseCategory(){
        jTextField2.setVisible(false);
        jTextField3.setVisible(false);
        jTextField4.setVisible(false);
        jTextField5.setVisible(false);
        jButton1.setVisible(false);
        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jTextPane1.setVisible(false);
        jLabel5.setVisible(true);
        jButton2.setVisible(true);
        jButton3.setVisible(true);
        jButton4.setVisible(true);
        jButton5.setVisible(true);
        jButton6.setVisible(true);
        jButton7.setVisible(true);     
        jLabel6.setVisible(false);
        jLabel8.setVisible(false);
        jLabel7.setVisible(false);
        jLabel9.setVisible(false);
        jLabel10.setVisible(false);
        jLabel18.setVisible(false);
        jLabel17.setVisible(false);
        jLabel16.setVisible(false);
        jLabel15.setVisible(false);
        jLabel14.setVisible(false);
        jLabel13.setVisible(false);
        jLabel12.setVisible(false);
        jLabel11.setVisible(false);
        
            jButton2.setText(categories[0]);
            jButton3.setText(categories[1]);
            jButton4.setText(categories[2]);
            jButton5.setText(categories[3]);
            jButton6.setText(categories[4]);
            jButton7.setText(categories[5]);
    }
    
    private void showComponents(){
        jTextField2.setVisible(true);
        jTextField3.setVisible(true);
        jTextField4.setVisible(true);
        jTextField5.setVisible(true);
        jButton1.setVisible(true);
        jLabel1.setVisible(true);
        jLabel2.setVisible(true);
        jLabel3.setVisible(true);
        jLabel4.setVisible(true);
        jTextPane1.setVisible(true);
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        jButton4.setVisible(false);
        jButton5.setVisible(false);
        jButton6.setVisible(false);
        jButton7.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel8.setVisible(false);
        jLabel7.setVisible(false);
        jLabel9.setVisible(false);
        jLabel10.setVisible(false);
        jLabel18.setVisible(false);
        jLabel17.setVisible(false);
        jLabel16.setVisible(false);
        jLabel15.setVisible(false);
        jLabel14.setVisible(false);
        jLabel13.setVisible(false);
        jLabel12.setVisible(false);
        jLabel11.setVisible(false);
        
    }
    
    public void checkPoints(){
        if(points > 1){
            System.out.println(points);
            jLabel9.setVisible(true);
        jLabel9.setOpaque(true);
        jLabel9.setBackground(new Color(0, 255, 0, 128)); // Set the alpha value to 128 for slight transparency
        jLabel9.setForeground(new Color(jLabel9.getForeground().getRed(), jLabel9.getForeground().getGreen(), jLabel9.getForeground().getBlue(), 128)); // Set the alpha value to 128 for slight transparency
            
            System.out.println(points);
        } 
        if(points > 2){
            jLabel10.setVisible(true);
            jLabel10.setOpaque(true);
        jLabel10.setBackground(new Color(0, 255, 0, 128)); // Set the alpha value to 128 for slight transparency
        jLabel10.setForeground(new Color(jLabel9.getForeground().getRed(), jLabel9.getForeground().getGreen(), jLabel9.getForeground().getBlue(), 128)); // Set the alpha value to 128 for slight transparency
        } if(points > 3){
            jLabel11.setVisible(true);
            jLabel11.setOpaque(true);
        jLabel11.setBackground(new Color(0, 255, 0, 128)); // Set the alpha value to 128 for slight transparency
        jLabel11.setForeground(new Color(jLabel9.getForeground().getRed(), jLabel9.getForeground().getGreen(), jLabel9.getForeground().getBlue(), 128)); // Set the alpha value to 128 for slight transparency
        }if(points > 4){
            jLabel12.setVisible(true);
            jLabel12.setOpaque(true);
        jLabel12.setBackground(new Color(0, 255, 0, 128)); // Set the alpha value to 128 for slight transparency
        jLabel12.setForeground(new Color(jLabel9.getForeground().getRed(), jLabel9.getForeground().getGreen(), jLabel9.getForeground().getBlue(), 128)); // Set the alpha value to 128 for slight transparency
        } if(points > 5){
        jLabel13.setVisible(true);
        jLabel13.setOpaque(true);
    jLabel13.setBackground(new Color(0, 255, 0, 128)); // Set the alpha value to 128 for slight transparency
    jLabel13.setForeground(new Color(jLabel9.getForeground().getRed(), jLabel9.getForeground().getGreen(), jLabel9.getForeground().getBlue(), 128)); // Set the alpha value to 128 for slight transparency
        } if(points > 6){
    jLabel14.setVisible(true);
    jLabel14.setOpaque(true);
    jLabel14.setBackground(new Color(0, 255, 0, 128)); // Set the alpha value to 128 for slight transparency
    jLabel14.setForeground(new Color(jLabel9.getForeground().getRed(), jLabel9.getForeground().getGreen(), jLabel9.getForeground().getBlue(), 128)); // Set the alpha value to 128 for slight transparency
    } if(points > 7){
    jLabel15.setVisible(true);
    jLabel15.setOpaque(true);
jLabel15.setBackground(new Color(0, 255, 0, 128)); // Set the alpha value to 128 for slight transparency
jLabel15.setForeground(new Color(jLabel9.getForeground().getRed(), jLabel9.getForeground().getGreen(), jLabel9.getForeground().getBlue(), 128)); // Set the alpha value to 128 for slight transparency
} if(points > 8){
    jLabel16.setVisible(true);
    jLabel16.setOpaque(true);
jLabel16.setBackground(new Color(0, 255, 0, 128)); // Set the alpha value to 128 for slight transparency
jLabel16.setForeground(new Color(jLabel9.getForeground().getRed(), jLabel9.getForeground().getGreen(), jLabel9.getForeground().getBlue(), 128)); // Set the alpha value to 128 for slight transparency
}if(points > 9){
    jLabel17.setVisible(true);
    jLabel17.setOpaque(true);
jLabel17.setBackground(new Color(0, 255, 0, 128)); // Set the alpha value to 128 for slight transparency
jLabel17.setForeground(new Color(jLabel9.getForeground().getRed(), jLabel9.getForeground().getGreen(), jLabel9.getForeground().getBlue(), 128)); // Set the alpha value to 128 for slight transparency

        System.out.println(points);
} if(points > 10){
    jLabel18.setVisible(true);
    jLabel18.setOpaque(true);
jLabel18.setBackground(new Color(0, 255, 0, 128)); // Set the alpha value to 128 for slight transparency
jLabel18.setForeground(new Color(jLabel9.getForeground().getRed(), jLabel9.getForeground().getGreen(), jLabel9.getForeground().getBlue(), 128)); // Set the alpha value to 128 for slight transparency


} if(points == 11){
    
    System.out.println("cashing rpize");
    cashPrize();
    winner();
    points = 0;
        
    
    
   
}
    }
    
//    public void Display(){
//        GameDatabase.Retrieve();
//
//        
//        Science.getQuestion(saveRNG);
//        answered.add(saveRNG);
//        System.out.println(Science.ID);
//        System.out.println(Science.questionText);
//        System.out.println(Science.PA);
//        System.out.println(Science.actualAnswer);
//        
//        jTextPane1.setText(Science.questionText);
//      
//        jTextField2.setBackground(Color.WHITE);
//        jTextField3.setBackground(Color.WHITE);
//        jTextField4.setBackground(Color.WHITE);
//        jTextField5.setBackground(Color.WHITE);
//        
//        jTextField2.setText(Science.PA.get("A1"));
//        jTextField3.setText(Science.PA.get("A2"));
//        jTextField4.setText(Science.PA.get("A3"));
//        jTextField5.setText(Science.PA.get("A4"));
//        
//        
//    }
    
    public void DisplayScience(){
        String saveRNG = RNG.getRandomNumber();
        GameDatabase.Retrieve();
        
        points++;
        
        Science.getQuestion(saveRNG);
        answered.add(saveRNG);
        System.out.println(Science.ID);
        System.out.println(Science.questionText);
        System.out.println(Science.PA);
        System.out.println(Science.actualAnswer);
        
        jTextPane1.setText(Science.questionText);
      
        jTextField2.setBackground(Color.WHITE);
        jTextField3.setBackground(Color.WHITE);
        jTextField4.setBackground(Color.WHITE);
        jTextField5.setBackground(Color.WHITE);
        
        jTextField2.setText(Science.PA.get("A1"));
        jTextField3.setText(Science.PA.get("A2"));
        jTextField4.setText(Science.PA.get("A3"));
        jTextField5.setText(Science.PA.get("A4"));
        
        checkPoints();
        
        
    }
    
    public void DisplayMaths(){
        String saveRNG = RNG.getRandomNumber();
        GameDatabase.Retrieve();
        
        points++;
        
        Maths.getQuestion(saveRNG);
        answered.add(saveRNG);
        System.out.println(Maths.ID);
        System.out.println(Maths.questionText);
        System.out.println(Maths.PA);
        System.out.println(Maths.actualAnswer);
        
        jTextPane1.setText(Maths.questionText);
      
        jTextField2.setBackground(Color.WHITE);
        jTextField3.setBackground(Color.WHITE);
        jTextField4.setBackground(Color.WHITE);
        jTextField5.setBackground(Color.WHITE);
        
        jTextField2.setText(Maths.PA.get("A1"));
        jTextField3.setText(Maths.PA.get("A2"));
        jTextField4.setText(Maths.PA.get("A3"));
        jTextField5.setText(Maths.PA.get("A4"));
        
        checkPoints();
    }
    
    public void DisplaySports(){
        String saveRNG = RNG.getRandomNumber();
        GameDatabase.Retrieve();
        
        points++;
        
        Sports.getQuestion(saveRNG);
        answered.add(saveRNG);
        System.out.println(Sports.ID);
        System.out.println(Sports.questionText);
        System.out.println(Sports.PA);
        System.out.println(Sports.actualAnswer);
        
        jTextPane1.setText(Sports.questionText);
      
        jTextField2.setBackground(Color.WHITE);
        jTextField3.setBackground(Color.WHITE);
        jTextField4.setBackground(Color.WHITE);
        jTextField5.setBackground(Color.WHITE);
        
        jTextField2.setText(Sports.PA.get("A1"));
        jTextField3.setText(Sports.PA.get("A2"));
        jTextField4.setText(Sports.PA.get("A3"));
        jTextField5.setText(Sports.PA.get("A4"));
        
        checkPoints();
    }
    
    public void DisplayGeography(){
        String saveRNG = RNG.getRandomNumber();
        GameDatabase.Retrieve();
        
        points++;
        
        Geography.getQuestion(saveRNG);
        answered.add(saveRNG);
        System.out.println(Geography.ID);
        System.out.println(Geography.questionText);
        System.out.println(Geography.PA);
        System.out.println(Geography.actualAnswer);
        
        jTextPane1.setText(Geography.questionText);
      
        jTextField2.setBackground(Color.WHITE);
        jTextField3.setBackground(Color.WHITE);
        jTextField4.setBackground(Color.WHITE);
        jTextField5.setBackground(Color.WHITE);
        
        jTextField2.setText(Geography.PA.get("A1"));
        jTextField3.setText(Geography.PA.get("A2"));
        jTextField4.setText(Geography.PA.get("A3"));
        jTextField5.setText(Geography.PA.get("A4"));
        
        checkPoints();
    }
    
    public void DisplayPopCulture(){
        String saveRNG = RNG.getRandomNumber();
        GameDatabase.Retrieve();
        
        points++;
        
        PopCulture.getQuestion(saveRNG);
        answered.add(saveRNG);
        System.out.println(PopCulture.ID);
        System.out.println(PopCulture.questionText);
        System.out.println(PopCulture.PA);
        System.out.println(PopCulture.actualAnswer);
        
        jTextPane1.setText(PopCulture.questionText);
      
        jTextField2.setBackground(Color.WHITE);
        jTextField3.setBackground(Color.WHITE);
        jTextField4.setBackground(Color.WHITE);
        jTextField5.setBackground(Color.WHITE);
        
        jTextField2.setText(PopCulture.PA.get("A1"));
        jTextField3.setText(PopCulture.PA.get("A2"));
        jTextField4.setText(PopCulture.PA.get("A3"));
        jTextField5.setText(PopCulture.PA.get("A4"));
        
        checkPoints();
    }
    
    public void DisplayHistory(){
        
        String saveRNG = RNG.getRandomNumber();
        points++;
        GameDatabase.Retrieve();
        
        History.getQuestion(saveRNG);
        answered.add(saveRNG);
        System.out.println(History.ID);
        System.out.println(History.questionText);
        System.out.println(History.PA);
        System.out.println(History.actualAnswer);
        
        jTextPane1.setText(History.questionText);
      
        jTextField2.setBackground(Color.WHITE);
        jTextField3.setBackground(Color.WHITE);
        jTextField4.setBackground(Color.WHITE);
        jTextField5.setBackground(Color.WHITE);
        
        jTextField2.setText(History.PA.get("A1"));
        jTextField3.setText(History.PA.get("A2"));
        jTextField4.setText(History.PA.get("A3"));
        jTextField5.setText(History.PA.get("A4"));
        
        
       checkPoints();
    }
    
    public void winner(){
        Container contentPane = dialog4.getContentPane();
        
       

        // Set the text directly on the content pane
        contentPane.add(new JLabel("    CONGRATULATION, "+username.toUpperCase()+" YOU WIN A MILLION DOLLARS \n"));
        
       
        

        // Set the size and location of the dialog
        dialog4.setSize(400, 200);

        
        dialog4.setLocationRelativeTo(this);

        // Make the dialog visible
        dialog4.setVisible(true);
//        jLabel3.setEnabled(false);
//        jLabel3.setVisible(false);
//        jLabel6.setVisible(true);
    }

    public void Reveal(String answer) {
        
        Container contentPane = dialog.getContentPane();
       

        // Set the text directly on the content pane
        contentPane.add(new JLabel("              Psssst... Here's the reveal! "+answer));

        // Set the size and location of the dialog
        dialog.setSize(400, 200);

        
        dialog.setLocationRelativeTo(this);

        // Make the dialog visible
        dialog.setVisible(true);
        jLabel3.setEnabled(false);
        jLabel3.setVisible(false);
        jLabel6.setVisible(true);
    }
    
    

    public void Phone(String answer){
        JDialog dialog2 = new JDialog(this, "Phone");
    
    // Create an ImageIcon with the path to your image
    ImageIcon imageIcon = new ImageIcon("./Proj2/images/Bob.jpg");

    // Create a JLabel with the ImageIcon as its icon
    JLabel photoLabel = new JLabel(imageIcon);

    // Retrieve the content pane of the dialog
    Container contentPane = dialog2.getContentPane();

    // Add the photo label and answer text to the content pane
    contentPane.add(photoLabel);
    contentPane.add(new JLabel("               Bob answered your call and he believes the answer is... " + answer));
    

    dialog2.setSize(600, 200);
    dialog2.setLocationRelativeTo(this);
    dialog2.setVisible(true);
    jLabel2.setVisible(false);
    jLabel8.setVisible(true);
    
    
        
}
    
    public void FiftyFifty(Map PA, String answer){
        JDialog dialog3 = new JDialog(this, "Phone");
        Container contentPane = dialog3.getContentPane();
        
        String actualAnswer = answer;
        
        String answer1 = PA.get("A1").toString();
        String answer2 = PA.get("A2").toString();
        String answer3 = PA.get("A3").toString();
        String answer4 = PA.get("A4").toString();
        
        
        if(actualAnswer.equals(answer1)){
            contentPane.add(new JLabel("                 The answer is " + answer2 + " OR " + actualAnswer));
        } else if (actualAnswer.equals(answer2)){
            contentPane.add(new JLabel("                 The answer is " + answer1 + " OR " + actualAnswer));
        } else if (actualAnswer.equals(answer3)){
            contentPane.add(new JLabel("                 The answer is " + answer4 + " OR " + actualAnswer));
        } else if (actualAnswer.equals(answer4)){
            contentPane.add(new JLabel("                 The answer is " + answer3 + " OR " + actualAnswer));
        }
     
        
        
        
    dialog3.setSize(500, 200);
    dialog3.setLocationRelativeTo(this);
    dialog3.setVisible(true);
    jLabel1.setVisible(false);
    jLabel7.setVisible(true);
    
  }
    
    public void run() {
                StartScreen playGame = new StartScreen();
                playGame.setVisible(true);
                
    }
    
    public void cashPrize(){
        // Specify the file name
    String fileName = "cash.txt";
    
    // Check if the file exists
    File file = new File(fileName);
    if (!file.exists()) {
        try {
            // Create the file if it doesn't exist
            file.createNewFile();
        } catch (IOException e) {
            System.err.println("Failed to create the file: " + e.getMessage());
            return;
        }
    } file.delete();

    try (FileWriter writer = new FileWriter(file, true)) {
        // Append "hello" to the file
        
        
        writer.append("/////////////////////////////////////////////\n");
        writer.append("/                 YOU WON                   /\n");
        writer.append("/                $1,000,000                 /\n");
        writer.append("/                                           /\n");
        writer.append("/             TO: "+username.toUpperCase()+"                      /\n");
        writer.append("/////////////////////////////////////////////\n");
        writer.flush();
    } catch (IOException e) {
        System.err.println("Failed to write to the file: " + e.getMessage());
    }
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(java.awt.Color.white);
        setPreferredSize(new java.awt.Dimension(1200, 900));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Proj2/images/5050.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 31, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Proj2/images/phone.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 31, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Proj2/images/icon rev-14.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 31, -1, -1));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 674, 250, 40));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 604, 250, 30));
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 520, 240, 40));
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 444, 240, 30));
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 354, 240, 40));
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 284, 250, 30));
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 190, 240, 40));
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 110, 240, 40));
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 34, 270, 30));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 754, 260, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Proj2/images/MoneyLevel.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(738, 11, -1, -1));

        jButton9.setText("Exit Game");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 580, -1, -1));

        jTextField2.setEditable(false);
        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField2MouseClicked(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 688, 231, 72));

        jTextField3.setEditable(false);
        jTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField3MouseClicked(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 688, 233, 72));

        jTextField4.setEditable(false);
        jTextField4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField4MouseClicked(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 766, 231, 72));

        jTextField5.setEditable(false);
        jTextField5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField5MouseClicked(evt);
            }
        });
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 766, 233, 72));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Proj2/images/logo-10.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setDefaultCapable(false);
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton1FocusGained(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 330, -1, -1));

        jButton8.setText("Go to Menu");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 550, -1, -1));

        jTextPane1.setEditable(false);
        jTextPane1.setBackground(new java.awt.Color(102, 102, 102));
        jTextPane1.setBorder(null);
        jTextPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextPane1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextPane1.setFocusable(false);
        jTextPane1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextPane1.setOpaque(false);
        jTextPane1.setSelectedTextColor(new java.awt.Color(102, 102, 102));
        jTextPane1.setVerifyInputWhenFocusTarget(false);
        jScrollPane2.setViewportView(jTextPane1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 548, 453, 63));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Choose Category");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, -1, -1));

        jButton2.setText("jButton2");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 320, -1, -1));

        jButton3.setText("jButton3");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, -1, -1));

        jButton4.setText("jButton4");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, -1, -1));

        jButton5.setText("jButton5");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 370, -1, -1));

        jButton6.setText("jButton6");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, -1, -1));

        jButton7.setText("jButton7");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 420, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Proj2/images/icon rev-15.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Proj2/images/nophone.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Proj2/images/no5050.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        GameDatabase.Retrieve();
    }//GEN-LAST:event_formMouseMoved

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
//        GameDatabase.Retrieve(); 
//        Display();
    }//GEN-LAST:event_formWindowActivated

    private void jButton1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton1FocusGained
        
    }//GEN-LAST:event_jButton1FocusGained

    private void jTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseClicked
        if(currentCategory.equals("Science")){
            if (Science.PA.get("A1").equals(Science.getActualAnswer())) {
                jTextField2.setBackground(Color.GREEN);
                System.out.println("WORKING");
            DisplayScience();
            } else {
                jTextField2.setBackground(Color.RED);
            }
        } else if (currentCategory.equals("Maths")){
            if (Maths.PA.get("A1").equals(Maths.getActualAnswer())) {
                jTextField2.setBackground(Color.GREEN);
            DisplayMaths();
            } else {
                jTextField2.setBackground(Color.RED);
            }
        } else if (currentCategory.equals("History")){
            if (History.PA.get("A1").equals(History.getActualAnswer())) {
                jTextField2.setBackground(Color.GREEN);
            DisplayHistory();
            } else {
                jTextField2.setBackground(Color.RED);
            }
        } else if (currentCategory.equals("PopCulture")){
            if (PopCulture.PA.get("A1").equals(PopCulture.getActualAnswer())) {
                jTextField2.setBackground(Color.GREEN);
            DisplayPopCulture();
            } else {
                jTextField2.setBackground(Color.RED);
            }
        } else if (currentCategory.equals("Sports")){
            if (Sports.PA.get("A1").equals(Sports.getActualAnswer())) {
                jTextField2.setBackground(Color.GREEN);
            DisplaySports();
            } else {
                jTextField2.setBackground(Color.RED);
            }
        } else if (currentCategory.equals("Geography")){
            if (Geography.PA.get("A1").equals(Geography.getActualAnswer())) {
                jTextField2.setBackground(Color.GREEN);
            DisplayGeography();
            } else {
                jTextField2.setBackground(Color.RED);
            }
        }
       
        
    }//GEN-LAST:event_jTextField2MouseClicked

    private void jTextField3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3MouseClicked
        if(currentCategory.equals("Science")){
            if (Science.PA.get("A2").equals(Science.getActualAnswer())) {
                jTextField3.setBackground(Color.GREEN);
            DisplayScience();
            } else {
                jTextField3.setBackground(Color.RED);
            }
        } else if (currentCategory.equals("Maths")){
            if (Maths.PA.get("A2").equals(Maths.getActualAnswer())) {
                jTextField3.setBackground(Color.GREEN);
            DisplayMaths();
            } else {
                jTextField3.setBackground(Color.RED);
            }
        } else if (currentCategory.equals("History")){
            if (History.PA.get("A2").equals(History.getActualAnswer())) {
                jTextField3.setBackground(Color.GREEN);
            DisplayHistory();
            } else {
                jTextField3.setBackground(Color.RED);
            }
        } else if (currentCategory.equals("PopCulture")){
            if (PopCulture.PA.get("A2").equals(PopCulture.getActualAnswer())) {
                jTextField3.setBackground(Color.GREEN);
            DisplayPopCulture();
            } else {
                jTextField3.setBackground(Color.RED);
            }
        } else if (currentCategory.equals("Sports")){
            if (Sports.PA.get("A2").equals(Sports.getActualAnswer())) {
                jTextField3.setBackground(Color.GREEN);
            DisplaySports();
            } else {
                jTextField3.setBackground(Color.RED);
            }
        } else if (currentCategory.equals("Geography")){
            if (Geography.PA.get("A2").equals(Geography.getActualAnswer())) {
                jTextField3.setBackground(Color.GREEN);
            DisplayGeography();
            } else {
                jTextField3.setBackground(Color.RED);
            }
        }
    }//GEN-LAST:event_jTextField3MouseClicked

    private void jTextField4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField4MouseClicked
        if(currentCategory.equals("Science")){
            if (Science.PA.get("A3").equals(Science.getActualAnswer())) {
                jTextField4.setBackground(Color.GREEN);
            DisplayScience();
            } else {
                jTextField4.setBackground(Color.RED);
            }
        } else if (currentCategory.equals("Maths")){
            if (Maths.PA.get("A3").equals(Maths.getActualAnswer())) {
                jTextField4.setBackground(Color.GREEN);
            DisplayMaths();
            } else {
                jTextField4.setBackground(Color.RED);
            }
        } else if (currentCategory.equals("History")){
            if (History.PA.get("A3").equals(History.getActualAnswer())) {
                jTextField4.setBackground(Color.GREEN);
            DisplayHistory();
            } else {
                jTextField4.setBackground(Color.RED);
            }
        } else if (currentCategory.equals("PopCulture")){
            if (PopCulture.PA.get("A3").equals(PopCulture.getActualAnswer())) {
                jTextField4.setBackground(Color.GREEN);
            DisplayPopCulture();
            } else {
                jTextField4.setBackground(Color.RED);
            }
        } else if (currentCategory.equals("Sports")){
            if (Sports.PA.get("A3").equals(Sports.getActualAnswer())) {
                jTextField4.setBackground(Color.GREEN);
            DisplaySports();
            } else {
                jTextField4.setBackground(Color.RED);
            }
        } else if (currentCategory.equals("Geography")){
            if (Geography.PA.get("A3").equals(Geography.getActualAnswer())) {
                jTextField4.setBackground(Color.GREEN);
            DisplayGeography();
            } else {
                jTextField4.setBackground(Color.RED);
            }
        }
    }//GEN-LAST:event_jTextField4MouseClicked

    private void jTextField5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField5MouseClicked
                if(currentCategory.equals("Science")){
            if (Science.PA.get("A4").equals(Science.getActualAnswer())) {
                jTextField5.setBackground(Color.GREEN);
            DisplayScience();
            } else {
                jTextField5.setBackground(Color.RED);
            }
        } else if (currentCategory.equals("Maths")){
            if (Maths.PA.get("A4").equals(Maths.getActualAnswer())) {
                jTextField5.setBackground(Color.GREEN);
            DisplayMaths();
            } else {
                jTextField5.setBackground(Color.RED);
            }
        } else if (currentCategory.equals("History")){
            if (History.PA.get("A4").equals(History.getActualAnswer())) {
                jTextField5.setBackground(Color.GREEN);
            DisplayHistory();
            } else {
                jTextField5.setBackground(Color.RED);
            }
        } else if (currentCategory.equals("PopCulture")){
            if (PopCulture.PA.get("A4").equals(PopCulture.getActualAnswer())) {
                jTextField5.setBackground(Color.GREEN);
            DisplayPopCulture();
            } else {
                jTextField5.setBackground(Color.RED);
            }
        } else if (currentCategory.equals("Sports")){
            if (Sports.PA.get("A4").equals(Sports.getActualAnswer())) {
                jTextField5.setBackground(Color.GREEN);
            DisplaySports();
            } else {
                jTextField5.setBackground(Color.RED);
            }
        } else if (currentCategory.equals("Geography")){
            if (Geography.PA.get("A4").equals(Geography.getActualAnswer())) {
                jTextField5.setBackground(Color.GREEN);
            DisplayGeography();
            } else {
                jTextField5.setBackground(Color.RED);
            }
        }
    }//GEN-LAST:event_jTextField5MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        //GameDatabase.Retrieve();
        currentCategory = "Science";
        showComponents();
        DisplayScience();           
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        //GameDatabase.Retrieve();
        currentCategory = "Maths";
        showComponents();
        DisplayMaths();
    }//GEN-LAST:event_jButton2MouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        //DisplayGeography();
    }//GEN-LAST:event_formMouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        //GameDatabase.Retrieve();
        currentCategory = "Geography";
        showComponents();
        DisplayGeography();
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        currentCategory = "PopCulture";
        showComponents();
        DisplayPopCulture();
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        currentCategory = "Sports";
        showComponents();
        DisplaySports();
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        currentCategory = "History";
        showComponents();
        DisplayHistory();
    }//GEN-LAST:event_jButton7MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        reveal = true;
        if(reveal && currentCategory.equals("History")){
            Reveal(History.actualAnswer);
            reveal = false;
        } else if (reveal && currentCategory.equals("Sports")){
            Reveal(Sports.actualAnswer);
            reveal = false;
        } else if (reveal && currentCategory.equals("PopCulture")){
            Reveal(PopCulture.actualAnswer);
            reveal = false;
        } else if (reveal && currentCategory.equals("Maths")){
            Reveal(Maths.actualAnswer);
            reveal = false;
        } else if (reveal && currentCategory.equals("Science")){
            Reveal(Science.actualAnswer);
            reveal = false;
        } else if (reveal && currentCategory.equals("Geography")){
            Reveal(Geography.actualAnswer);
            reveal = false;
        }
        
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        
       
        phone = true;
        if(phone && currentCategory.equals("History")){
            Phone(History.actualAnswer);
            phone = false;
        } else if (phone && currentCategory.equals("Sports")){
            Phone(Sports.actualAnswer);
            phone = false;
        } else if (phone && currentCategory.equals("PopCulture")){
            Phone(PopCulture.actualAnswer);
            phone = false;
        } else if (phone && currentCategory.equals("Maths")){
            Phone(Maths.actualAnswer);
            phone = false;
        } else if (phone && currentCategory.equals("Science")){
            Phone(Science.actualAnswer);
            phone = false;
        } else if (phone && currentCategory.equals("Geography")){
            Phone(Geography.actualAnswer);
            phone = false;
        }
        
        
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        fiftyfifty = true;
        
                if(fiftyfifty && currentCategory.equals("History")){
            FiftyFifty(History.PA, History.actualAnswer);
            fiftyfifty = false;
        } else if (fiftyfifty && currentCategory.equals("Sports")){
            FiftyFifty(Sports.PA, Sports.actualAnswer);
            fiftyfifty = false;
        } else if (fiftyfifty && currentCategory.equals("PopCulture")){
            FiftyFifty(PopCulture.PA, PopCulture.actualAnswer);
            fiftyfifty = false;
        } else if (fiftyfifty && currentCategory.equals("Maths")){
            FiftyFifty(Maths.PA, Maths.actualAnswer);
            fiftyfifty = false;
        } else if (fiftyfifty && currentCategory.equals("Science")){
            FiftyFifty(Science.PA, Science.actualAnswer);
            fiftyfifty = false;
        } else if (fiftyfifty && currentCategory.equals("Geography")){
            FiftyFifty(Geography.PA, Geography.actualAnswer);
            fiftyfifty = false;
        }   
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        points = 0;
        run();
        dispose();
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jButton9MouseClicked

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
