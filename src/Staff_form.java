
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Almas Asghar
 */
public class Staff_form extends javax.swing.JFrame {

   StaffCtrl st;
    public Staff_form() {
        initComponents();
       st=new StaffCtrl(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        emp_pan = new javax.swing.JPanel();
        stf_title = new javax.swing.JLabel();
        emp_name = new javax.swing.JLabel();
        std_sal = new javax.swing.JLabel();
        std_desg = new javax.swing.JLabel();
        std_adr = new javax.swing.JLabel();
        std_phn = new javax.swing.JLabel();
        emp_dob = new javax.swing.JLabel();
        emp_age = new javax.swing.JLabel();
        std_hstl_id = new javax.swing.JLabel();
        emp_id = new javax.swing.JLabel();
        tf_emp_id = new javax.swing.JTextField();
        tf_designtn = new javax.swing.JTextField();
        tf_emp_addrs = new javax.swing.JTextField();
        tf_emp_age = new javax.swing.JTextField();
        tf_hstl_id = new javax.swing.JTextField();
        tf_emp_name = new javax.swing.JTextField();
        tf_emp_sal = new javax.swing.JTextField();
        tf_phn = new javax.swing.JTextField();
        date = new org.jdesktop.swingx.JXDatePicker();
        jScrollPane1 = new javax.swing.JScrollPane();
        staff_table = new javax.swing.JTable();
        Update_btn = new javax.swing.JButton();
        back_btn1 = new javax.swing.JButton();
        Add_btn = new javax.swing.JButton();
        Logout_btn3 = new javax.swing.JButton();
        Reset_btn6 = new javax.swing.JButton();
        delet_btn2 = new javax.swing.JButton();
        std_hstl_id1 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        search_btn = new javax.swing.JButton();
        View_btn = new javax.swing.JButton();
        valid = new javax.swing.JLabel();
        Attendance_btn = new javax.swing.JButton();
        ClearT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Employe_Information");
        setName("emp_frame"); // NOI18N
        setResizable(false);

        emp_pan.setBackground(new java.awt.Color(0, 204, 204));
        emp_pan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 10));
        emp_pan.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N

        stf_title.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        stf_title.setText("Employe Information Page");

        emp_name.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        emp_name.setText("Employe Name");

        std_sal.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        std_sal.setText("Salary");

        std_desg.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        std_desg.setText("Designation");

        std_adr.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        std_adr.setText("Address");

        std_phn.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        std_phn.setText("Phone No.");

        emp_dob.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        emp_dob.setText("Employe DOB");

        emp_age.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        emp_age.setText("Employe Age");

        std_hstl_id.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        std_hstl_id.setText("Hostel Id");

        emp_id.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        emp_id.setText("Employe Id");

        tf_emp_id.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        tf_emp_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        tf_designtn.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        tf_designtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        tf_emp_addrs.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        tf_emp_addrs.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        tf_emp_age.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        tf_emp_age.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        tf_emp_age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_emp_ageActionPerformed(evt);
            }
        });
        tf_emp_age.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_emp_ageKeyPressed(evt);
            }
        });

        tf_hstl_id.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        tf_hstl_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        tf_emp_name.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        tf_emp_name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        tf_emp_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_emp_nameKeyPressed(evt);
            }
        });

        tf_emp_sal.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        tf_emp_sal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        tf_emp_sal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_emp_salKeyPressed(evt);
            }
        });

        tf_phn.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        tf_phn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        tf_phn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_phnActionPerformed(evt);
            }
        });
        tf_phn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_phnKeyPressed(evt);
            }
        });

        date.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        date.setPreferredSize(new java.awt.Dimension(130, 34));
        date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActionPerformed(evt);
            }
        });

        staff_table.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        staff_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Emp_id", "Emp_name", "Salary", "Designation", "Address", "Phone_no", "Emp_dob", "Emp_age", "Hostel_id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        staff_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                staff_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(staff_table);

        Update_btn.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Update_btn.setText("Update Info");
        Update_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Update_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_btnActionPerformed(evt);
            }
        });

        back_btn1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        back_btn1.setText("Back");
        back_btn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        back_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btn1ActionPerformed(evt);
            }
        });

        Add_btn.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Add_btn.setText("Add Info");
        Add_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_btnActionPerformed(evt);
            }
        });

        Logout_btn3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Logout_btn3.setText("Logout");
        Logout_btn3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Logout_btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Logout_btn3ActionPerformed(evt);
            }
        });

        Reset_btn6.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Reset_btn6.setText("ResetFields");
        Reset_btn6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Reset_btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reset_btn6ActionPerformed(evt);
            }
        });

        delet_btn2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        delet_btn2.setText("Delete Info");
        delet_btn2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        delet_btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delet_btn2ActionPerformed(evt);
            }
        });

        std_hstl_id1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        std_hstl_id1.setForeground(new java.awt.Color(255, 0, 0));

        search.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        search.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        search_btn.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        search_btn.setText("Search");
        search_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        search_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_btnActionPerformed(evt);
            }
        });

        View_btn.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        View_btn.setText("View Info");
        View_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        View_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View_btnActionPerformed(evt);
            }
        });

        valid.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        valid.setForeground(new java.awt.Color(255, 0, 0));

        Attendance_btn.setBackground(new java.awt.Color(255, 204, 204));
        Attendance_btn.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Attendance_btn.setText("Add Attendance");
        Attendance_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Attendance_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Attendance_btnActionPerformed(evt);
            }
        });

        ClearT.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        ClearT.setText("ClearTable");
        ClearT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        ClearT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout emp_panLayout = new javax.swing.GroupLayout(emp_pan);
        emp_pan.setLayout(emp_panLayout);
        emp_panLayout.setHorizontalGroup(
            emp_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(emp_panLayout.createSequentialGroup()
                .addGroup(emp_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(emp_panLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(emp_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(emp_panLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(emp_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(valid, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(emp_panLayout.createSequentialGroup()
                                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(search_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(emp_panLayout.createSequentialGroup()
                                        .addGroup(emp_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(std_sal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(std_desg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(std_adr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(std_phn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(emp_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(emp_dob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(emp_age, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(std_hstl_id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(emp_id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(emp_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tf_emp_id)
                                            .addComponent(tf_hstl_id)
                                            .addComponent(tf_emp_age)
                                            .addComponent(tf_emp_addrs)
                                            .addComponent(tf_designtn)
                                            .addComponent(tf_emp_name)
                                            .addComponent(tf_emp_sal)
                                            .addComponent(tf_phn)
                                            .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)))))
                            .addGroup(emp_panLayout.createSequentialGroup()
                                .addComponent(Add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(View_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(Reset_btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(emp_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(emp_panLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(Update_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(delet_btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(emp_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(emp_panLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(std_hstl_id1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(emp_panLayout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(ClearT, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addComponent(Attendance_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addComponent(back_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addComponent(Logout_btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(emp_panLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 846, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(emp_panLayout.createSequentialGroup()
                        .addGap(468, 468, 468)
                        .addComponent(stf_title, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        emp_panLayout.setVerticalGroup(
            emp_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(emp_panLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(stf_title, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(emp_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(emp_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(emp_panLayout.createSequentialGroup()
                        .addGroup(emp_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emp_id)
                            .addComponent(tf_emp_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(emp_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emp_name)
                            .addComponent(tf_emp_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(emp_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(std_sal)
                            .addComponent(tf_emp_sal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(emp_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(emp_panLayout.createSequentialGroup()
                                .addComponent(std_desg)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(emp_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(std_adr)
                                    .addComponent(tf_emp_addrs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(emp_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(std_phn)
                                    .addComponent(tf_phn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(emp_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(emp_panLayout.createSequentialGroup()
                                        .addComponent(emp_dob)
                                        .addGap(46, 46, 46)
                                        .addGroup(emp_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(std_hstl_id)
                                            .addComponent(tf_hstl_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(emp_panLayout.createSequentialGroup()
                                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(emp_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(tf_emp_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(emp_age)))))
                            .addComponent(tf_designtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addComponent(valid, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(emp_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(emp_panLayout.createSequentialGroup()
                        .addComponent(std_hstl_id1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(emp_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(emp_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(back_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Logout_btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(emp_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ClearT, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Attendance_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, emp_panLayout.createSequentialGroup()
                        .addGap(0, 8, Short.MAX_VALUE)
                        .addGroup(emp_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(emp_panLayout.createSequentialGroup()
                                .addGroup(emp_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Reset_btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Update_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, emp_panLayout.createSequentialGroup()
                                .addGroup(emp_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(View_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(delet_btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29))))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(emp_pan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(emp_pan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_emp_ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_emp_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_emp_ageActionPerformed

    private void dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateActionPerformed

    private void tf_phnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_phnKeyPressed
        st.NumberValidation(evt);
    }//GEN-LAST:event_tf_phnKeyPressed

    private void tf_phnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_phnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_phnActionPerformed

    private void back_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btn1ActionPerformed
       st.BackPage();
    }//GEN-LAST:event_back_btn1ActionPerformed

    private void Logout_btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Logout_btn3ActionPerformed
        st.LogOut();
    }//GEN-LAST:event_Logout_btn3ActionPerformed

    private void Add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_btnActionPerformed
        st.InsertInfo();
    }//GEN-LAST:event_Add_btnActionPerformed

    private void search_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_btnActionPerformed
       //st.Search();
        st.SearchTable();
    }//GEN-LAST:event_search_btnActionPerformed

    private void View_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View_btnActionPerformed
        st.ViewTableData();
    }//GEN-LAST:event_View_btnActionPerformed

    private void Update_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_btnActionPerformed
        st.UpdateInfo();
    }//GEN-LAST:event_Update_btnActionPerformed

    private void delet_btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delet_btn2ActionPerformed
        st.DeleteInfo();
    }//GEN-LAST:event_delet_btn2ActionPerformed

    private void Reset_btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reset_btn6ActionPerformed
        st.Reset();
    }//GEN-LAST:event_Reset_btn6ActionPerformed

    private void staff_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_staff_tableMouseClicked
        st.FillDataInFields();
    }//GEN-LAST:event_staff_tableMouseClicked

    private void tf_emp_salKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_emp_salKeyPressed
       st.NumberValidation(evt);
    }//GEN-LAST:event_tf_emp_salKeyPressed

    private void tf_emp_ageKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_emp_ageKeyPressed
        st.NumberValidation(evt);
    }//GEN-LAST:event_tf_emp_ageKeyPressed

    private void Attendance_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Attendance_btnActionPerformed
        st.OpenAttendanceForm();
    }//GEN-LAST:event_Attendance_btnActionPerformed

    private void ClearTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearTActionPerformed
        st.ClearTable();                                                        // TODO add your handling code here:
    }//GEN-LAST:event_ClearTActionPerformed

    private void tf_emp_nameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_emp_nameKeyPressed
        st.CharValidation(evt);
    }//GEN-LAST:event_tf_emp_nameKeyPressed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_btn;
    private javax.swing.JButton Attendance_btn;
    private javax.swing.JButton ClearT;
    private javax.swing.JButton Logout_btn3;
    private javax.swing.JButton Reset_btn6;
    private javax.swing.JButton Update_btn;
    javax.swing.JButton View_btn;
    private javax.swing.JButton back_btn1;
    org.jdesktop.swingx.JXDatePicker date;
    private javax.swing.JButton delet_btn2;
    private javax.swing.JLabel emp_age;
    private javax.swing.JLabel emp_dob;
    private javax.swing.JLabel emp_id;
    private javax.swing.JLabel emp_name;
    private javax.swing.JPanel emp_pan;
    private javax.swing.JScrollPane jScrollPane1;
    javax.swing.JTextField search;
    private javax.swing.JButton search_btn;
    javax.swing.JTable staff_table;
    private javax.swing.JLabel std_adr;
    private javax.swing.JLabel std_desg;
    private javax.swing.JLabel std_hstl_id;
    javax.swing.JLabel std_hstl_id1;
    private javax.swing.JLabel std_phn;
    private javax.swing.JLabel std_sal;
    private javax.swing.JLabel stf_title;
    javax.swing.JTextField tf_designtn;
    javax.swing.JTextField tf_emp_addrs;
    javax.swing.JTextField tf_emp_age;
    javax.swing.JTextField tf_emp_id;
    javax.swing.JTextField tf_emp_name;
    javax.swing.JTextField tf_emp_sal;
    javax.swing.JTextField tf_hstl_id;
    javax.swing.JTextField tf_phn;
    javax.swing.JLabel valid;
    // End of variables declaration//GEN-END:variables
}
