
/**
 *
 * @author Sahil Aggarwal
 */
public class cal extends javax.swing.JFrame {
double firstnumber;
double secondnumber;
double result;
String operations;
String answer;

   
    public cal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jButton11 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        BT7 = new javax.swing.JButton();
        BT1 = new javax.swing.JButton();
        BT8 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        BT9 = new javax.swing.JButton();
        BT4 = new javax.swing.JButton();
        BT5 = new javax.swing.JButton();
        BT6 = new javax.swing.JButton();
        BT2 = new javax.swing.JButton();
        BT3 = new javax.swing.JButton();
        BT0 = new javax.swing.JButton();
        BTDOT = new javax.swing.JButton();
        BTC = new javax.swing.JButton();
        BTF = new javax.swing.JButton();
        BTD = new javax.swing.JButton();
        BTB = new javax.swing.JButton();
        BTE = new javax.swing.JButton();
        BTA = new javax.swing.JButton();
        sin = new javax.swing.JButton();
        cos = new javax.swing.JButton();
        tan = new javax.swing.JButton();
        log = new javax.swing.JButton();
        cosh = new javax.swing.JButton();
        sinh = new javax.swing.JButton();
        tanh = new javax.swing.JButton();
        root = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        log1 = new javax.swing.JButton();

        jButton11.setText("jButton1");

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("calculator SR9422");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jTextArea1.setBackground(new java.awt.Color(255, 255, 153));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        BT7.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        BT7.setForeground(new java.awt.Color(204, 0, 0));
        BT7.setText("7");
        BT7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT7ActionPerformed(evt);
            }
        });

        BT1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        BT1.setForeground(new java.awt.Color(204, 0, 0));
        BT1.setText("1");
        BT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT1ActionPerformed(evt);
            }
        });

        BT8.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        BT8.setForeground(new java.awt.Color(204, 0, 0));
        BT8.setText("8");
        BT8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT8ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 204, 0));
        jButton4.setText("clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        BT9.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        BT9.setForeground(new java.awt.Color(204, 0, 0));
        BT9.setText("9");
        BT9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT9ActionPerformed(evt);
            }
        });

        BT4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        BT4.setForeground(new java.awt.Color(204, 0, 0));
        BT4.setText("4");
        BT4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT4ActionPerformed(evt);
            }
        });

        BT5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        BT5.setForeground(new java.awt.Color(204, 0, 0));
        BT5.setText("5");
        BT5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT5ActionPerformed(evt);
            }
        });

        BT6.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        BT6.setForeground(new java.awt.Color(204, 0, 0));
        BT6.setText("6");
        BT6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT6ActionPerformed(evt);
            }
        });

        BT2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        BT2.setForeground(new java.awt.Color(204, 0, 0));
        BT2.setText("2");
        BT2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT2ActionPerformed(evt);
            }
        });

        BT3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        BT3.setForeground(new java.awt.Color(204, 0, 0));
        BT3.setText("3");
        BT3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT3ActionPerformed(evt);
            }
        });

        BT0.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        BT0.setForeground(new java.awt.Color(204, 0, 0));
        BT0.setText("0");
        BT0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT0ActionPerformed(evt);
            }
        });

        BTDOT.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        BTDOT.setForeground(new java.awt.Color(204, 0, 0));
        BTDOT.setText(".");
        BTDOT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTDOTActionPerformed(evt);
            }
        });

        BTC.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        BTC.setForeground(new java.awt.Color(0, 0, 153));
        BTC.setText("*");
        BTC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTCActionPerformed(evt);
            }
        });

        BTF.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        BTF.setForeground(new java.awt.Color(0, 0, 204));
        BTF.setText("/");
        BTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTFActionPerformed(evt);
            }
        });

        BTD.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        BTD.setForeground(new java.awt.Color(0, 0, 204));
        BTD.setText("-");
        BTD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTDActionPerformed(evt);
            }
        });

        BTB.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        BTB.setForeground(new java.awt.Color(0, 0, 204));
        BTB.setText("%");
        BTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTBActionPerformed(evt);
            }
        });

        BTE.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        BTE.setForeground(new java.awt.Color(0, 0, 204));
        BTE.setText("+");
        BTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTEActionPerformed(evt);
            }
        });

        BTA.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        BTA.setForeground(new java.awt.Color(0, 204, 204));
        BTA.setText("=");
        BTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTAActionPerformed(evt);
            }
        });

        sin.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        sin.setForeground(new java.awt.Color(255, 102, 0));
        sin.setText("sin");
        sin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinActionPerformed(evt);
            }
        });

        cos.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        cos.setForeground(new java.awt.Color(255, 102, 0));
        cos.setText("cos");
        cos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosActionPerformed(evt);
            }
        });

        tan.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        tan.setForeground(new java.awt.Color(255, 102, 0));
        tan.setText("tan");
        tan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanActionPerformed(evt);
            }
        });

        log.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        log.setForeground(new java.awt.Color(204, 0, 204));
        log.setText("ln");
        log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logActionPerformed(evt);
            }
        });

        cosh.setFont(new java.awt.Font("Tahoma", 3, 17)); // NOI18N
        cosh.setForeground(new java.awt.Color(255, 102, 0));
        cosh.setText("cosh");
        cosh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coshActionPerformed(evt);
            }
        });

        sinh.setFont(new java.awt.Font("Tahoma", 3, 20)); // NOI18N
        sinh.setForeground(new java.awt.Color(255, 102, 0));
        sinh.setText("sinh");
        sinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinhActionPerformed(evt);
            }
        });

        tanh.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        tanh.setForeground(new java.awt.Color(255, 102, 0));
        tanh.setText("tanh");
        tanh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanhActionPerformed(evt);
            }
        });

        root.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        root.setForeground(new java.awt.Color(204, 0, 204));
        root.setText("root");
        root.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rootActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("This calculator is radiance based");

        log1.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        log1.setForeground(new java.awt.Color(204, 0, 204));
        log1.setText("log");
        log1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(sin, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cos, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tan, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(sinh, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cosh, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tanh, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(root, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(log, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(log1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(BTC, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BTF, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(BT1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BT2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BT3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BTA, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(BT4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(BT5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(BT6))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addComponent(BTDOT)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(BT0))
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addComponent(BT7)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(BT8)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(BT9)))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(BTB, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(BTE, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(BTD, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 13, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BT1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BT2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BT3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTA, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BT4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BT5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BT6, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BTB, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BT7, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BT8, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BT9, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTE, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTD, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BT0, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTDOT, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTC, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTF, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sin, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cos, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tan, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sinh, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cosh, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tanh, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(root, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(log, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(log1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void BT1ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
        String entrenumber =jTextArea1.getText() + BT1.getText();
        jTextArea1.setText(entrenumber);
    }                                   

    private void BTDActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
       firstnumber = Double.parseDouble(jTextArea1.getText());
        jTextArea1.setText("");
        operations ="-";
    }                                   

    private void BT2ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
         String entrenumber =jTextArea1.getText() + BT2.getText();
        jTextArea1.setText(entrenumber);
    }                                   

    private void BT3ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
         String entrenumber =jTextArea1.getText() + BT3.getText();
        jTextArea1.setText(entrenumber);
    }                                   

    private void BT4ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
         String entrenumber =jTextArea1.getText() + BT4.getText();
        jTextArea1.setText(entrenumber);
    }                                   

    private void BT5ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
         String entrenumber =jTextArea1.getText() + BT5.getText();
        jTextArea1.setText(entrenumber);
    }                                   

    private void BT6ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
         String entrenumber =jTextArea1.getText() + BT6.getText();
        jTextArea1.setText(entrenumber);
    }                                   

    private void BT7ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
         String entrenumber =jTextArea1.getText() + BT7.getText();
        jTextArea1.setText(entrenumber);
    }                                   

    private void BT8ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
         String entrenumber =jTextArea1.getText() + BT8.getText();
        jTextArea1.setText(entrenumber);
    }                                   

    private void BT9ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
         String entrenumber =jTextArea1.getText() + BT9.getText();
        jTextArea1.setText(entrenumber);
    }                                   

    private void BT0ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here: 
        String entrenumber =jTextArea1.getText() + BT0.getText();
        jTextArea1.setText(entrenumber);
    }                                   

    private void BTDOTActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
         String entrenumber =jTextArea1.getText() + BTDOT.getText();
        jTextArea1.setText(entrenumber);
    }                                     

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
          secondnumber =0;
        jTextArea1.setText("");
    }                                        

    private void BTAActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
        String answer;
        secondnumber = Double.parseDouble(jTextArea1.getText());
      if(operations.equals("+"))
          result = firstnumber+secondnumber;
      if(operations.equals("-"))
          result = firstnumber-secondnumber;
      if(operations.equals("*"))
          result = firstnumber*secondnumber;
      if(operations.equals("/"))
          result = firstnumber/secondnumber;
      if(operations.equals("%"))
          result = firstnumber%secondnumber;
      
      jTextArea1.setText(result+" ");
        
    }                                   

    private void BTBActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
       firstnumber = Double.parseDouble(jTextArea1.getText());
        jTextArea1.setText("");
        operations ="%";
    }                                   

    private void BTCActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
        firstnumber = Double.parseDouble(jTextArea1.getText());
        jTextArea1.setText("");
        operations ="*";
    }                                   

    private void BTEActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
        firstnumber = Double.parseDouble(jTextArea1.getText());
        jTextArea1.setText("");
        operations ="+";
    }                                   

    private void BTFActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
        firstnumber = Double.parseDouble(jTextArea1.getText());
        jTextArea1.setText("");
        operations ="/";
    }                                   

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void logActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
      double ops = Double.parseDouble(String.valueOf(jTextArea1.getText()));
       ops = Math.log(ops);
       jTextArea1.setText(String.valueOf(ops));
    }                                   

    private void sinhActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        double ops = Double.parseDouble(String.valueOf(jTextArea1.getText()));
       ops = Math.sinh(ops);
       jTextArea1.setText(String.valueOf(ops));
    }                                    

    private void rootActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
       double ops = Double.parseDouble(String.valueOf(jTextArea1.getText()));
       ops = Math.sqrt(ops);
       jTextArea1.setText(String.valueOf(ops));
    }                                    

    private void sinActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
         double ops = Double.parseDouble(String.valueOf(jTextArea1.getText()));
       ops = Math.sin(ops);
       jTextArea1.setText(String.valueOf(ops));
    }                                   

    private void cosActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
        double ops = Double.parseDouble(String.valueOf(jTextArea1.getText()));
       ops = Math.cos(ops);
       jTextArea1.setText(String.valueOf(ops));
    }                                   

    private void tanActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
        double ops = Double.parseDouble(String.valueOf(jTextArea1.getText()));
       ops = Math.tan(ops);
       jTextArea1.setText(String.valueOf(ops));
    }                                   

    private void coshActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        double ops = Double.parseDouble(String.valueOf(jTextArea1.getText()));
       ops = Math.cosh(ops);
       jTextArea1.setText(String.valueOf(ops));
    }                                    

    private void tanhActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        double ops = Double.parseDouble(String.valueOf(jTextArea1.getText()));
       ops = Math.tanh(ops);
       jTextArea1.setText(String.valueOf(ops));
    }                                    

    private void log1ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        double ops = Double.parseDouble(String.valueOf(jTextArea1.getText()));
       ops = Math.log10(ops);
       jTextArea1.setText(String.valueOf(ops));
    }                                    

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
            java.util.logging.Logger.getLogger(cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton BT0;
    private javax.swing.JButton BT1;
    private javax.swing.JButton BT2;
    private javax.swing.JButton BT3;
    private javax.swing.JButton BT4;
    private javax.swing.JButton BT5;
    private javax.swing.JButton BT6;
    private javax.swing.JButton BT7;
    private javax.swing.JButton BT8;
    private javax.swing.JButton BT9;
    private javax.swing.JButton BTA;
    private javax.swing.JButton BTB;
    private javax.swing.JButton BTC;
    private javax.swing.JButton BTD;
    private javax.swing.JButton BTDOT;
    private javax.swing.JButton BTE;
    private javax.swing.JButton BTF;
    private javax.swing.JButton cos;
    private javax.swing.JButton cosh;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton log;
    private javax.swing.JButton log1;
    private javax.swing.JButton root;
    private javax.swing.JButton sin;
    private javax.swing.JButton sinh;
    private javax.swing.JButton tan;
    private javax.swing.JButton tanh;
    // End of variables declaration                   
}
