/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package todolist_official;

import java.awt.Image;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author Hocisdabest
 */
public class RewardForm extends javax.swing.JFrame {
    
    /**
     * Creates new form RewardForm
     */
    public RewardForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Heading_productivity = new javax.swing.JLabel();
        Total_task_done = new javax.swing.JLabel();
        Rank_productivity = new javax.swing.JLabel();
        Name_of_rank = new javax.swing.JLabel();
        Daily_goal = new javax.swing.JLabel();
        Quote = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Productivity");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/source_icon/user.png")).getImage());
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Heading_productivity.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Heading_productivity.setText("Your Productivity");

        Total_task_done.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        Name_of_rank.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        Name_of_rank.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Daily_goal.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        Quote.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Quote.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(Rank_productivity, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(Quote, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(Total_task_done, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Heading_productivity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                            .addComponent(Name_of_rank, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Daily_goal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(Heading_productivity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Total_task_done, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Rank_productivity, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Name_of_rank, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Daily_goal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Quote, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Random random = new Random();
        int randomNumber = random.nextInt(11);
        try{
            java.io.FileReader fr = new java.io.FileReader("motivation.txt");
            java.io.BufferedReader br = new java.io.BufferedReader(fr);          
            String line; int a = 0;
            while ((line = br.readLine()) != null){                
                if(a==randomNumber){
                    Quote.setText(line);
                    break;
                }
                a++;
            }
            
            FileReader r_pr = new FileReader("logged.txt");
            BufferedReader br_pr = new BufferedReader(r_pr);
            String line_pr = br_pr.readLine();
            r_pr.close();

            FileReader r1_pr = new FileReader(line_pr +"_pr.txt");
            BufferedReader br1_pr = new BufferedReader(r1_pr);
            String line2 = br1_pr.readLine();
            String[] p = line2.split("\\|");
            int Ttd = Integer.parseInt(p[2]);
            
            Total_task_done.setText(p[2] +" completed tasks.");
            
            if(Integer.parseInt(p[0]) < Integer.parseInt(p[1])){
                Daily_goal.setText("you haven't accomplished your goal today.");
            }
            else{
                Daily_goal.setText("You accomplished your goal today.");
            }
            
            while(true){
            if(Ttd >= 30){
                Rank_productivity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source_icon/ht.jpg")));
                Name_of_rank.setText("Masterful Conqueror");
                break;
            }
            else if(Ttd >= 23){
               Rank_productivity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source_icon/caothu.jpg")));
               Name_of_rank.setText("Elite Prodigy");
               break;
            }
            else if(Ttd >= 20){
                Rank_productivity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source_icon/kc.jpg")));
                Name_of_rank.setText("Accomplished Expert");
                break;
            }
            else if(Ttd >= 14){
                Rank_productivity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source_icon/bk.jpg")));
                Name_of_rank.setText("Persistent Overachiever");
                break;
            }
            else if(Ttd >= 9){
                Rank_productivity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source_icon/vang.jpg")));
                Name_of_rank.setText("Consistent Producer");
                break;
            }
            else if(Ttd >= 5){
                Rank_productivity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source_icon/bac.jpg")));
                Name_of_rank.setText("Aspiring Contributor");
                break;
            }
            else if(Ttd >= 3){
                Rank_productivity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source_icon/dong.jpg")));
                Name_of_rank.setText("Novice Worker");
                break;
            }
            else{
                Rank_productivity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source_icon/norank.jpg")));
                Name_of_rank.setText("Underdog");
                break;
                }
            }
        }
            
        catch(java.io.IOException e){
            System.out.println("Something was wrong");
            e.printStackTrace();
        }
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(RewardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RewardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RewardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RewardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RewardForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Daily_goal;
    private javax.swing.JLabel Heading_productivity;
    private javax.swing.JLabel Name_of_rank;
    private javax.swing.JLabel Quote;
    private javax.swing.JLabel Rank_productivity;
    private javax.swing.JLabel Total_task_done;
    // End of variables declaration//GEN-END:variables
}
