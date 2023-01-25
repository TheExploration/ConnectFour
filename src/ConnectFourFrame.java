
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class ConnectFourFrame extends javax.swing.JFrame {

    private Image ib;  //we do all drawing onto this image, it acts as an image buffer
    private Graphics ibg;  //will be set to our image buffer's graphic object
    private int[][] board = new int[7][6];
    private int turn = 1;
    private SoundManager SFX = new SoundManager();
    

    public ConnectFourFrame() {
        initComponents();
        setLocationRelativeTo(null);
        setUpImageBuffer();
        
        System.out.println(panelDraw.getWidth() + "," + panelDraw.getHeight() );
        
    }

    //set our image (buffer) to a new image of the correct size
    public void setUpImageBuffer(){
        ib=this.createImage(panelDraw.getWidth(), panelDraw.getHeight() );
        ibg=ib.getGraphics();
    }
    
    public void draw(){
 
        
        //clear the area, draw white background
        ibg.clearRect(0, 0, panelDraw.getWidth(), panelDraw.getHeight() );
        ibg.setColor(Color.white);
        ibg.fillRect(0, 0, panelDraw.getWidth(), panelDraw.getHeight() );
        
        //draws individual squares (pass this method the frames graphics object
        drawBoard();
        
        //draws a black border around edge of grid
        ibg.setColor(Color.black);
        ibg.drawRect(0,0,panelDraw.getWidth(), panelDraw.getHeight());
        
        //all done drawing your stuff onto the image buffer?
        //get the frame's graphics object and draw our image buffer onto the frame
        Graphics g = panelDraw.getGraphics();
        g.drawImage(ib,0,0,this);
        
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                if (board[r][c] == 1) {
                    g.setColor(Color.RED);
                    g.fillOval(r*25+103,c*25+27, 20, 20);
                }
                if (board[r][c] == 2) {
                    g.setColor(Color.BLUE);
                    g.fillOval(r*25+103,c*25+27, 20, 20);
                }
            }
        }
        
        
    }
    
    public void drawBoard() {
        ibg.setColor(Color.BLACK);
        for (int i = 1; i < 8; i++) {
            ibg.drawLine(100,i*25,275,i*25);
        }
        for (int k = 1; k < 9; k++) {
            ibg.drawLine(k*25+75,25,k*25+75,175);
        }
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        button0 = new javax.swing.JButton();
        button1 = new javax.swing.JButton();
        button2 = new javax.swing.JButton();
        button3 = new javax.swing.JButton();
        button4 = new javax.swing.JButton();
        button5 = new javax.swing.JButton();
        button6 = new javax.swing.JButton();
        panelDraw = new javax.swing.JPanel();
        textInfo = new javax.swing.JTextField();
        labelStats = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuGame = new javax.swing.JMenu();
        mnuStartNewGame = new javax.swing.JMenuItem();
        mnuResetStats = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        button0.setText("0");
        button0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button0ActionPerformed(evt);
            }
        });

        button1.setText("1");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button2.setText("2");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        button3.setText("3");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        button4.setText("4");
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        button5.setText("5");
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });

        button6.setText("6");
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button0, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button0)
                    .addComponent(button1)
                    .addComponent(button2)
                    .addComponent(button3)
                    .addComponent(button4)
                    .addComponent(button5)
                    .addComponent(button6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelDraw.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelDrawLayout = new javax.swing.GroupLayout(panelDraw);
        panelDraw.setLayout(panelDrawLayout);
        panelDrawLayout.setHorizontalGroup(
            panelDrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelDrawLayout.setVerticalGroup(
            panelDrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 219, Short.MAX_VALUE)
        );

        textInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textInfoActionPerformed(evt);
            }
        });

        labelStats.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelStats.setText("Stats:  Player 01:  0 Wins    Player 2:  0 Wins");

        mnuGame.setText("Game");

        mnuStartNewGame.setText("Start New Game");
        mnuStartNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuStartNewGameActionPerformed(evt);
            }
        });
        mnuGame.add(mnuStartNewGame);

        mnuResetStats.setText("Reset Stats");
        mnuResetStats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuResetStatsActionPerformed(evt);
            }
        });
        mnuGame.add(mnuResetStats);

        jMenuBar1.add(mnuGame);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(textInfo)
            .addComponent(labelStats, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelDraw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDraw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelStats)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuStartNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuStartNewGameActionPerformed
        //replace this later!
        try {
            SFX.playSFX("43578 - pilot_killed_indicator_BU.wav");
        } catch (Exception e) {
        }
        board = null;
        board = new int[7][6];
   
        draw();
        
    }//GEN-LAST:event_mnuStartNewGameActionPerformed
 
    
    private void button0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button0ActionPerformed
        buttonPressed(0);
        

    }//GEN-LAST:event_button0ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        buttonPressed(1);
        
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        buttonPressed(2);
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        buttonPressed(3);
    }//GEN-LAST:event_button3ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        buttonPressed(4);
    }//GEN-LAST:event_button4ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        buttonPressed(5);
    }//GEN-LAST:event_button5ActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
        buttonPressed(6);
    }//GEN-LAST:event_button6ActionPerformed

    private void mnuResetStatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuResetStatsActionPerformed
        board = null;
        board = new int[7][6];
    }//GEN-LAST:event_mnuResetStatsActionPerformed

    private void textInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textInfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textInfoActionPerformed

    private void buttonPressed(int col) {
        System.out.println("Pressed: " + col);
        for (int r = board[0].length-1; r >= 0 ; r--) {
            if (board[col][r] == 0) {
                board[col][r] = turn;
                
                if (checkWin()&&turn == 1) System.out.println("Player Red Won!!!");
                turn = turn%2+1;
                try {
                    SFX.playSFX("Walkie Talkie beep.wav");
                } catch (Exception e) {
                }
                textInfo.setText("Player " +turn+ " turn.");
                break;
            }
        }
        draw();
      
    }
    
    public boolean checkWin() {
        int rows = board.length;
        int cols = board[0].length;
        int winCount = 4;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols - winCount + 1; col++) {
                int piece = board[row][col];
                if (piece == 0) {
                    continue;
                }
                boolean win = true;
                for (int i = 1; i < winCount; i++) {
                    if (board[row][col + i] != piece) {
                        win = false;
                        break;
                    }
                }
                if (win) {
                    return true;
                }
            }
        }

        for (int row = 0; row < rows - winCount + 1; row++) {
            for (int col = 0; col < cols; col++) {
                int piece = board[row][col];
                if (piece == 0) {
                    continue;
                }
                boolean win = true;
                for (int i = 1; i < winCount; i++) {
                    if (board[row + i][col] != piece) {
                        win = false;
                        break;
                    }
                }
                if (win) {
                    return true;
                }
            }
    }

    for (int row = 0; row < rows - winCount + 1; row++) {
        for (int col = 0; col < cols - winCount + 1; col++) {
            int piece = board[row][col];
            if (piece == 0) {
                continue;
            }
            boolean win = true;
            for (int i = 1; i < winCount; i++) {
                if (board[row + i][col + i] != piece) {
                    win = false;
                    break;
                }
            }
            if (win) {
                return true;
            }
        }
    }

    for (int row = 0; row < rows - winCount + 1; row++) {
        for (int col = winCount - 1; col < cols; col++) {
            int piece = board[row][col];
            if (piece == 0) {
                continue;
            }
            boolean win = true;
            for (int i = 1; i < winCount; i++) {
                if (board[row + i][col - i] != piece) {
                    win = false;
                    break;
                }
            }
            if (win) {
                return true;
            }
        }
    }

    return false;
        
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
            java.util.logging.Logger.getLogger(ConnectFourFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConnectFourFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConnectFourFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConnectFourFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConnectFourFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button0;
    private javax.swing.JButton button1;
    private javax.swing.JButton button2;
    private javax.swing.JButton button3;
    private javax.swing.JButton button4;
    private javax.swing.JButton button5;
    private javax.swing.JButton button6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelStats;
    private javax.swing.JMenu mnuGame;
    private javax.swing.JMenuItem mnuResetStats;
    private javax.swing.JMenuItem mnuStartNewGame;
    private javax.swing.JPanel panelDraw;
    private javax.swing.JTextField textInfo;
    // End of variables declaration//GEN-END:variables
}
