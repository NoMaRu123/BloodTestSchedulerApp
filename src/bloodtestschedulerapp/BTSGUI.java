package bloodtestschedulerapp;
/**@author <TeephopAlex MacHugh>*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;


public class BTSGUI extends javax.swing.JFrame {

    private BloodTestSchedulerApp scheduler;
    
    public BTSGUI() {
        initComponents();
        scheduler = new BloodTestSchedulerApp();
        loadPatientsFromFile("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\BloodTestSchedulerApp\\src\\bloodtestschedulerapp\\patients.txt");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        priorityCombo = new javax.swing.JComboBox<>();
        nameTF = new javax.swing.JTextField();
        gpTF = new javax.swing.JTextField();
        AddBtn = new javax.swing.JButton();
        ageTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        wardCheck = new java.awt.Checkbox();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        outputArea = new javax.swing.JTextArea();
        markNoShowBtn = new javax.swing.JButton();
        NextBtn = new javax.swing.JButton();
        ShowPatientsBtn = new javax.swing.JButton();
        NoShowBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        SearchBtn = new javax.swing.JButton();

        jTextField1.setText("jTextField1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        priorityCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Urgent", "Medium", "Low" }));
        priorityCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priorityComboActionPerformed(evt);
            }
        });
        jPanel1.add(priorityCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 230, 130, -1));
        jPanel1.add(nameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 140, 131, -1));
        jPanel1.add(gpTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, 131, -1));

        AddBtn.setText("Add Patient");
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });
        jPanel1.add(AddBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, -1, 35));
        jPanel1.add(ageTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, 131, -1));

        jLabel1.setText("Patient Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, -1, -1));

        jLabel2.setText("Age");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, -1, -1));

        jLabel3.setText("GP Details");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, -1, -1));

        jLabel4.setText("Priority");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, -1, -1));
        jPanel1.add(wardCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, -1, -1));

        jLabel5.setText("Hospital Ward?");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, -1, -1));

        outputArea.setColumns(20);
        outputArea.setRows(5);
        jScrollPane2.setViewportView(outputArea);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 440, 278));

        markNoShowBtn.setText("Mark No Show");
        markNoShowBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markNoShowBtnActionPerformed(evt);
            }
        });
        jPanel1.add(markNoShowBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, -1, 35));

        NextBtn.setText("Next Patient");
        NextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextBtnActionPerformed(evt);
            }
        });
        jPanel1.add(NextBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, 35));

        ShowPatientsBtn.setText("Show All Patients");
        ShowPatientsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowPatientsBtnActionPerformed(evt);
            }
        });
        jPanel1.add(ShowPatientsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, -1, 35));

        NoShowBtn.setText("Show No-Show");
        NoShowBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoShowBtnActionPerformed(evt);
            }
        });
        jPanel1.add(NoShowBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, -1, 35));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Blood Test Scheduler");
        jLabel6.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 200, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("please filled out patient's details you wish to add");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel8.setText("Alex MacHugh");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 60, -1, -1));

        SearchBtn.setText("Search");
        SearchBtn.setBorder(new javax.swing.border.MatteBorder(null));
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });
        jPanel1.add(SearchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, 80, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 751, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void markNoShowBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markNoShowBtnActionPerformed
        markNoShow();
    }//GEN-LAST:event_markNoShowBtnActionPerformed

    private void priorityComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priorityComboActionPerformed
        String selectedPriority = (String) priorityCombo.getSelectedItem();
    }//GEN-LAST:event_priorityComboActionPerformed

    private void NextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextBtnActionPerformed
        nextPatient();
    }//GEN-LAST:event_NextBtnActionPerformed

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        clearOutputArea();
        addPatient();
    }//GEN-LAST:event_AddBtnActionPerformed

    private void ShowPatientsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowPatientsBtnActionPerformed
        clearOutputArea();
        appendOutput("List of All Patients with Priority:\n" + scheduler.printPriorityQueue() + "\n");
    }//GEN-LAST:event_ShowPatientsBtnActionPerformed

    private void NoShowBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoShowBtnActionPerformed
        clearOutputArea();
        String noShowContent = scheduler.getNoShowQueueString();
        outputArea.append(noShowContent + "\n");
    }//GEN-LAST:event_NoShowBtnActionPerformed

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
    performRecursiveSearch();
    }//GEN-LAST:event_SearchBtnActionPerformed
// --- Helper Methods ---

    // Clears the output area
    private void clearOutputArea() {
        outputArea.setText("");
    }

    // Clears all input fields
    private void clearInputFields() {
        nameTF.setText("");
        ageTF.setText("");
        gpTF.setText("");
        wardCheck.setState(false);
        priorityCombo.setSelectedIndex(0);
    }

    // Appends a string to the output area (can be reused everywhere)
    private void appendOutput(String text) {
        outputArea.append(text);
    }

    // Converts the combo box selection to a priority number (e.g., Urgent=1, Medium=2, Low=3)
    private int convertPriority(String priorityStr) {
        if (priorityStr.equalsIgnoreCase("Urgent")) {
            return 1;
        } else if (priorityStr.equalsIgnoreCase("Medium")) {
            return 2;
        } else {
            return 3;
        }
    }

    // Formats patient details for display
    private String formatPatientDetails(Patient p) {
        return "Patient: " + p.getName() + ",\n" +
               "Priority: " + p.getPriority() + ",\n" +
               "Age: " + p.getAge() + ",\n" +
               "GP: " + p.getGpDetails() + ",\n" +
               "From Ward: " + p.isFromWard();
    }

    // Adds a patient based on input fields
    private void addPatient() {
        try {
            String name = nameTF.getText().trim();
            int age = Integer.parseInt(ageTF.getText().trim());
            String gp = gpTF.getText().trim();
            String priorityStr = (String) priorityCombo.getSelectedItem();
            int priority = convertPriority(priorityStr);
            boolean fromWard = wardCheck.getState(); // Using AWT Checkbox methods

            Patient patient = new Patient(name, priority, age, gp, fromWard);
            scheduler.addPatient(patient);
            appendOutput("Added: " + formatPatientDetails(patient) + "\n");

            clearInputFields();
        } catch (NumberFormatException ex) {
            appendOutput("Error: Please enter a valid number for Age.\n");
        }
    }

    private Patient currentPatient = null;

    // Retrieves and displays the next patient; stores current patient for possible no-show marking.
    private void nextPatient() {
        currentPatient = scheduler.nextPatient();
        if (currentPatient != null) {
            clearOutputArea();
            appendOutput("Next Patient:\n" + formatPatientDetails(currentPatient) + "\n");
        } else {
            appendOutput("No more patients in the queue.\n");
        }
    }

    // Marks the currently displayed patient as no-show
    private void markNoShow() {
        if (currentPatient != null) {
            scheduler.markNoShow(currentPatient);
            clearOutputArea();
            appendOutput("Marked as no-show:\n" + formatPatientDetails(currentPatient) + "\n");
            currentPatient = null;
        } else {
            appendOutput("No patient available to mark as no-show.\n");
        }
    }

    // Recursive search: repeatedly prompt user for a name until found or user cancels.
    private void performRecursiveSearch() {
        while (true) {
            String searchName = javax.swing.JOptionPane.showInputDialog(this, "Enter patient name to search:");
            if (searchName == null) { // User cancelled
                break;
            }
            searchName = searchName.trim();
            if (searchName.isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Please enter a valid name.", "Invalid Input", javax.swing.JOptionPane.ERROR_MESSAGE);
                continue;
            }
            Patient found = scheduler.searchPatientByName(searchName);
            if (found == null) {
                int option = javax.swing.JOptionPane.showConfirmDialog(this, "Patient not found. Would you like to search again?", "Not Found", javax.swing.JOptionPane.YES_NO_OPTION);
                if (option != javax.swing.JOptionPane.YES_OPTION) {
                    break;
                }
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "Patient found:\n" + formatPatientDetails(found), "Search Result", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                break;
            }
        }
    }

    // Method to load patients from file remains the same
    private void loadPatientsFromFile(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length < 5) continue;
                String name = parts[0].trim();
                String prioStr = parts[1].trim();
                int priority = convertPriority(prioStr);
                int age = Integer.parseInt(parts[2].trim());
                String gp = parts[3].trim();
                boolean ward = Boolean.parseBoolean(parts[4].trim());

                Patient patient = new Patient(name, priority, age, gp, ward);
                scheduler.addPatient(patient);
            }
            appendOutput("Patients have been loaded. Click 'Next Patient' to see them one by one.\n");
        } catch (IOException e) {
            appendOutput("Error loading patients: " + e.getMessage() + "\n");
        }
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
            java.util.logging.Logger.getLogger(BTSGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BTSGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BTSGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BTSGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BTSGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton NextBtn;
    private javax.swing.JButton NoShowBtn;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JButton ShowPatientsBtn;
    private javax.swing.JTextField ageTF;
    private javax.swing.JTextField gpTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton markNoShowBtn;
    private javax.swing.JTextField nameTF;
    private javax.swing.JTextArea outputArea;
    private javax.swing.JComboBox<String> priorityCombo;
    private java.awt.Checkbox wardCheck;
    // End of variables declaration//GEN-END:variables
}
