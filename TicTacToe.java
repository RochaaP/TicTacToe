


import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TicTacToe extends JFrame {

    
    public TicTacToe() {
        initComponents();
    }

    
    
    
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                formPropertyChange(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 51));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 153, 255));
        jButton2.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 51));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(153, 153, 255));
        jButton3.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 51));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(153, 153, 255));
        jButton4.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 51));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(153, 153, 255));
        jButton5.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 51));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(153, 153, 255));
        jButton6.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 51));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(153, 153, 255));
        jButton7.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 0, 51));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(153, 153, 255));
        jButton8.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 0, 51));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(153, 153, 255));
        jButton9.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jButton9.setForeground(new java.awt.Color(0, 0, 51));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    static int getCount=0, c=0,check=0;
    int value;
    boolean bttn1=true,bttn2=true,bttn3=true,bttn4=true,bttn5=true;
    boolean bttn6=true,bttn7=true,bttn8=true,bttn9=true;
    public static int[] winner= new int[9];
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       
        
        if(bttn2==true && check==0 ){
            
            jButton2.setText(Integer.toString(getCount%2+1));
            if(getCount%2==1)
                winner[1]=1;
            else
                winner[1]=20;
            
            getCount++;bttn2=false;
            
        check=new TicTacToe().winnerChecking();
        }
        
       
        
    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
         
        if(bttn1==true && check==0 ){
            
            jButton1.setText(Integer.toString(getCount%2+1));
            if(getCount%2==1)
                winner[0]=1;
            else
                winner[0]=20;
            
            getCount++;bttn1=false;
            
        check=new TicTacToe().winnerChecking();
        }
        
        
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
     
        if(bttn3==true && check==0){
            
            jButton3.setText(Integer.toString(getCount%2+1));
            if(getCount%2==1)
                winner[2]=1;
            else
                winner[2]=20;
            
            getCount++;bttn3=false;
            check=new TicTacToe().winnerChecking();
        
        }
        
                // TODO add your handling code here:
    }                                        

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
     
        if(bttn5==true && check==0){
            
            jButton5.setText(Integer.toString(getCount%2+1));
            if(getCount%2==1)
                winner[4]=1;
            else
                winner[4]=20;
            
            getCount++;bttn5=false;
            
        check=new TicTacToe().winnerChecking();
        }
        
                // TODO add your handling code here:
    }                                        

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
     
        if(bttn6==true && check==0){
            
            jButton6.setText(Integer.toString(getCount%2+1));
            if(getCount%2==1)
                winner[5]=1;
            else
                winner[5]=20;
            
            getCount++;bttn6=false;
            
        check=new TicTacToe().winnerChecking();
        }
        
                // TODO add your handling code here:
    }                                        

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                         
     
        if(bttn7==true && check==0){
            
            jButton7.setText(Integer.toString(getCount%2+1));
            if(getCount%2==1)
                winner[6]=1;
            else
                winner[6]=20;
            
            getCount++;bttn7=false;
            
        check=new TicTacToe().winnerChecking();
        }
        
                // TODO add your handling code here:
    }                                        

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {                                         
     
        if(bttn8==true && check==0){
            
            jButton8.setText(Integer.toString(getCount%2+1));
            if(getCount%2==1)
                winner[7]=1;
            else
                winner[7]=20;
            
            getCount++;bttn8=false;
            
        check=new TicTacToe().winnerChecking();
        }
        
                // TODO add your handling code here:
    }                                        

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {                                         
         
        if(bttn9==true && check==0){
            
            jButton9.setText(Integer.toString(getCount%2+1));
            if(getCount%2==1)
                winner[8]=1;
            else
                winner[8]=20;
            
            getCount++;bttn9=false;
            
        check=new TicTacToe().winnerChecking();
        }
        
        
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         

        if(bttn4==true && check==0){

            jButton4.setText(Integer.toString(getCount%2+1));
            if(getCount%2==1)
            winner[3]=1;
            else
            winner[3]=20;

            getCount++;bttn4=false;

            check=new TicTacToe().winnerChecking();
        }

       
    }                                        

    private void formPropertyChange(java.beans.PropertyChangeEvent evt) {                                    
       
    }                                   



    public static void popupInfoBox(String infoMessage, String titleBar){
        JOptionPane.showMessageDialog(null, infoMessage,  titleBar, JOptionPane.INFORMATION_MESSAGE);
        
    } 
    
    
 public int winnerChecking(){
    if(winner[0]+ winner[1]+winner[2]==3){popupInfoBox("Player 2 Wins", "Winner");c=1;}
    else if(winner[3]+ winner[4]+winner[5]==3){popupInfoBox("Player 2 Wins", "Winner");c=1;}
    else if(winner[6]+ winner[7]+winner[8]==3){popupInfoBox("Player 2 Wins", "Winner");c=1;}
    else if(winner[0]+ winner[3]+winner[6]==3){popupInfoBox("Player 2 Wins", "Winner");c=1;}
    else if(winner[1]+ winner[4]+winner[7]==3){popupInfoBox("Player 2 Wins", "Winner");c=1;}
    else if(winner[2]+ winner[5]+winner[8]==3){popupInfoBox("Player 2 Wins", "Winner");c=1;}
    else if(winner[0]+ winner[4]+winner[8]==3){popupInfoBox("Player 2 Wins", "Winner");c=1;}
    else if(winner[2]+ winner[4]+winner[6]==3){popupInfoBox("Player 2 Wins", "Winner");c=1;}
    
    else if(winner[0]+ winner[1]+winner[2]==60){popupInfoBox("Player 1 Wins", "Winner");c=1;}
    else if(winner[3]+ winner[4]+winner[5]==60){popupInfoBox("Player 1 Wins", "Winner");c=1;}
    else if(winner[6]+ winner[7]+winner[8]==60){popupInfoBox("Player 1 Wins", "Winner");c=1;}
    else if(winner[0]+ winner[3]+winner[6]==60){popupInfoBox("Player 1 Wins", "Winner");c=1;}
    else if(winner[1]+ winner[4]+winner[7]==60){popupInfoBox("Player 1 Wins", "Winner");c=1;}
    else if(winner[2]+ winner[5]+winner[8]==60){popupInfoBox("Player 1 Wins", "Winner");c=1;}
    else if(winner[0]+ winner[4]+winner[8]==60){popupInfoBox("Player 1 Wins", "Winner");c=1;}
    else if(winner[2]+ winner[4]+winner[6]==60){popupInfoBox("Player 1 Wins", "Winner");c=1;}
    
    if(getCount==9) popupInfoBox("Game Draw", "NoWinners");
    return c;
}

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
                new TicTacToe().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    // End of variables declaration                   


          
}
