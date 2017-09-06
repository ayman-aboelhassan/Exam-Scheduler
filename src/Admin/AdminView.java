package Admin;

import DataBase.Connection_MySQL;
import algorithm.AlgorithmApp;
import java.awt.Color;

public class AdminView extends javax.swing.JFrame {

    public AdminView(Connection_MySQL Connection, AlgorithmApp app, boolean modal) {
        MainApp = app;
        Manager = new AdminApp(Connection);
        initComponents();
        Manager.SetView(this);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EditStudentButton = new javax.swing.JButton();
        EditLecturerButton = new javax.swing.JButton();
        EditCourseButton = new javax.swing.JButton();
        ConstraintButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        CloseRegButton = new javax.swing.JButton();
        OpenRegButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        GenerateTableButton = new javax.swing.JButton();
        ConflictTableButton = new javax.swing.JButton();
        CourseButton = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        EditDataButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        DepButton = new javax.swing.JButton();
        State = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(431, 231));
        setName("Form"); // NOI18N
        setResizable(false);

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(algorithm.AlgorithmApp.class).getContext().getResourceMap(AdminView.class);
        EditStudentButton.setText(resourceMap.getString("EditStudentButton.text")); // NOI18N
        EditStudentButton.setName("EditStudentButton"); // NOI18N
        EditStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditStudentButtonActionPerformed(evt);
            }
        });

        EditLecturerButton.setText(resourceMap.getString("EditLecturerButton.text")); // NOI18N
        EditLecturerButton.setName("EditLecturerButton"); // NOI18N

        EditCourseButton.setText(resourceMap.getString("EditCourseButton.text")); // NOI18N
        EditCourseButton.setName("EditCourseButton"); // NOI18N

        ConstraintButton.setText(resourceMap.getString("ConstraintButton.text")); // NOI18N
        ConstraintButton.setName("ConstraintButton"); // NOI18N

        jSeparator1.setName("jSeparator1"); // NOI18N

        CloseRegButton.setText(resourceMap.getString("CloseRegButton.text")); // NOI18N
        CloseRegButton.setName("CloseRegButton"); // NOI18N
        CloseRegButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseRegButtonActionPerformed(evt);
            }
        });

        OpenRegButton.setText(resourceMap.getString("OpenRegButton.text")); // NOI18N
        OpenRegButton.setEnabled(false);
        OpenRegButton.setName("OpenRegButton"); // NOI18N
        OpenRegButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenRegButtonActionPerformed(evt);
            }
        });

        jSeparator2.setName("jSeparator2"); // NOI18N

        GenerateTableButton.setText(resourceMap.getString("GenerateTableButton.text")); // NOI18N
        GenerateTableButton.setEnabled(false);
        GenerateTableButton.setName("GenerateTableButton"); // NOI18N
        GenerateTableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateTableButtonActionPerformed(evt);
            }
        });

        ConflictTableButton.setText(resourceMap.getString("ConflictTableButton.text")); // NOI18N
        ConflictTableButton.setEnabled(false);
        ConflictTableButton.setName("ConflictTableButton"); // NOI18N
        ConflictTableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConflictTableButtonActionPerformed(evt);
            }
        });

        CourseButton.setText(resourceMap.getString("CourseButton.text")); // NOI18N
        CourseButton.setEnabled(false);
        CourseButton.setName("CourseButton"); // NOI18N

        jSeparator3.setName("jSeparator3"); // NOI18N

        EditDataButton.setText(resourceMap.getString("EditDataButton.text")); // NOI18N
        EditDataButton.setName("EditDataButton"); // NOI18N
        EditDataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditDataButtonActionPerformed(evt);
            }
        });

        ExitButton.setText(resourceMap.getString("ExitButton.text")); // NOI18N
        ExitButton.setName("ExitButton"); // NOI18N
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        DepButton.setText(resourceMap.getString("DepButton.text")); // NOI18N
        DepButton.setName("DepButton"); // NOI18N
        DepButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepButtonActionPerformed(evt);
            }
        });

        State.setEditable(false);
        State.setForeground(resourceMap.getColor("State.foreground")); // NOI18N
        State.setText(resourceMap.getString("State.text")); // NOI18N
        State.setBorder(null);
        State.setName("State"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(EditStudentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EditLecturerButton))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(EditCourseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ConstraintButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(DepButton))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(CloseRegButton)
                        .addGap(18, 18, 18)
                        .addComponent(OpenRegButton)
                        .addGap(18, 18, 18)
                        .addComponent(State, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(EditDataButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(GenerateTableButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ConflictTableButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CourseButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditDataButton)
                    .addComponent(ExitButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EditStudentButton)
                            .addComponent(EditCourseButton))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EditLecturerButton)
                            .addComponent(ConstraintButton)))
                    .addComponent(DepButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CloseRegButton)
                    .addComponent(OpenRegButton)
                    .addComponent(State, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GenerateTableButton)
                    .addComponent(ConflictTableButton)
                    .addComponent(CourseButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void EditDataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditDataButtonActionPerformed
        MainApp.RunDialog(1);
        Manager.ShowDataFrame();
    }//GEN-LAST:event_EditDataButtonActionPerformed

    private void DepButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepButtonActionPerformed
        Manager.ShowDepFrame();
    }//GEN-LAST:event_DepButtonActionPerformed

    private void EditStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditStudentButtonActionPerformed
        Manager.ShowStdFrame();
    }//GEN-LAST:event_EditStudentButtonActionPerformed

    private void CloseRegButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseRegButtonActionPerformed
        //Close the Registeration
        OpenRegButton.setEnabled(true);
        ConflictTableButton.setEnabled(true);
        CourseButton.setEnabled(true);
        GenerateTableButton.setEnabled(true);
        CloseRegButton.setEnabled(false);
        EditCourseButton.setEnabled(false);
        DepButton.setEnabled(false);
        EditLecturerButton.setEnabled(false);
        EditStudentButton.setEnabled(false);
        ConstraintButton.setEnabled(false);
        State.setForeground(Color.red);
        State.setText("Closed");
        System.out.println("The Registeration is Closed");
        //Create the conflict table used in the coloring
        System.out.println("Creating Conflict Table & Conflict Graph");
        Manager.CreateConflict();
        Manager.CreateTimeTable();
    }//GEN-LAST:event_CloseRegButtonActionPerformed

    private void OpenRegButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenRegButtonActionPerformed
        //Open the Registeration again
        OpenRegButton.setEnabled(false);
        ConflictTableButton.setEnabled(false);
        CourseButton.setEnabled(false);
        GenerateTableButton.setEnabled(false);
        CloseRegButton.setEnabled(true);
        EditCourseButton.setEnabled(true);
        DepButton.setEnabled(true);
        EditLecturerButton.setEnabled(true);
        EditStudentButton.setEnabled(true);
        ConstraintButton.setEnabled(true);
        State.setForeground(Color.green);
        State.setText("Openned");
        System.out.println("The Registeration is Openned");
    }//GEN-LAST:event_OpenRegButtonActionPerformed

    private void ConflictTableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConflictTableButtonActionPerformed
        Manager.ShowConflictTable();
    }//GEN-LAST:event_ConflictTableButtonActionPerformed

    private void GenerateTableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateTableButtonActionPerformed
        Manager.ShowTimeTable();
    }//GEN-LAST:event_GenerateTableButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CloseRegButton;
    private javax.swing.JButton ConflictTableButton;
    private javax.swing.JButton ConstraintButton;
    private javax.swing.JButton CourseButton;
    private javax.swing.JButton DepButton;
    private javax.swing.JButton EditCourseButton;
    private javax.swing.JButton EditDataButton;
    private javax.swing.JButton EditLecturerButton;
    private javax.swing.JButton EditStudentButton;
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton GenerateTableButton;
    private javax.swing.JButton OpenRegButton;
    private javax.swing.JTextField State;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables

    //Set of Variables used by the Class
    private AlgorithmApp MainApp;
    private AdminApp Manager;

    public void setDialog(AdminData D) {
        Manager.SetDataFrame(D);
    }

}