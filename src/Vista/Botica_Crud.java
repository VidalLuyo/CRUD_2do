package Vista;

import Conexion.Conexiondb;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Botica_Crud extends javax.swing.JFrame {

    Conexiondb con = new Conexiondb();
    Connection cn;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    int id;

    public Botica_Crud() {
        initComponents();
        setLocationRelativeTo(null);
        listar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        rbtnCNE = new javax.swing.JRadioButton();
        rbtnDNI = new javax.swing.JRadioButton();
        txtnombre = new javax.swing.JTextField();
        cbxGenero = new javax.swing.JComboBox<>();
        snipgrado = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        txtnumdoc = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();
        txtedad = new javax.swing.JTextField();
        Checkboxessalud = new javax.swing.JCheckBox();
        CheckboxEmergencias = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        slideredad = new javax.swing.JSlider();
        txtalergico = new javax.swing.JTextField();
        btnagregar = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnnuevo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Datos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 153));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("BOTICA");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ID:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("TIPO_DOCUMENTO:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("NUM_DOCUMENTO:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("GENERO:");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("NOMBRE:");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("APELLIDO:");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("DIRECCION:");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("ALERGICO:");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("CENTRO_MEDICO:");

        txtId.setEditable(false);
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        rbtnCNE.setBackground(new java.awt.Color(204, 255, 153));
        rbtnCNE.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        rbtnCNE.setForeground(new java.awt.Color(0, 0, 0));
        rbtnCNE.setText("CNE");
        rbtnCNE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnCNEActionPerformed(evt);
            }
        });

        rbtnDNI.setBackground(new java.awt.Color(204, 255, 153));
        rbtnDNI.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        rbtnDNI.setForeground(new java.awt.Color(0, 0, 0));
        rbtnDNI.setText("DNI");
        rbtnDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnDNIActionPerformed(evt);
            }
        });

        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });

        cbxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Masculino", "Femenino" }));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("GRADO:");

        txtnumdoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumdocActionPerformed(evt);
            }
        });

        txtdireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdireccionActionPerformed(evt);
            }
        });

        txtapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapellidoActionPerformed(evt);
            }
        });

        txtedad.setEditable(false);
        txtedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtedadActionPerformed(evt);
            }
        });

        Checkboxessalud.setText("ESSALUD");
        Checkboxessalud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckboxessaludActionPerformed(evt);
            }
        });

        CheckboxEmergencias.setText("EMERGENCIAS");
        CheckboxEmergencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckboxEmergenciasActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("EDAD:");

        slideredad.setMajorTickSpacing(1);
        slideredad.setMinimum(5);
        slideredad.setPaintTicks(true);
        slideredad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slideredadStateChanged(evt);
            }
        });

        txtalergico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtalergicoActionPerformed(evt);
            }
        });

        btnagregar.setText("AGREGAR");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        btneditar.setText("EDITAR");
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });

        btneliminar.setText("ELIMINAR");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btnnuevo.setText("NUEVO");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Checkboxessalud)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CheckboxEmergencias)
                        .addGap(106, 106, 106))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnagregar)
                                .addGap(18, 18, 18)
                                .addComponent(btneditar)
                                .addGap(18, 18, 18)
                                .addComponent(btneliminar)
                                .addGap(18, 18, 18)
                                .addComponent(btnnuevo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnumdoc, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtalergico, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(rbtnDNI)
                                .addGap(21, 21, 21)
                                .addComponent(rbtnCNE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(snipgrado, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(slideredad, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rbtnCNE)
                    .addComponent(rbtnDNI))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtnumdoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtalergico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(snipgrado, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(slideredad, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(Checkboxessalud)
                    .addComponent(CheckboxEmergencias))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnagregar)
                    .addComponent(btneditar)
                    .addComponent(btneliminar)
                    .addComponent(btnnuevo))
                .addGap(16, 16, 16))
        );

        jPanel2.setBackground(new java.awt.Color(153, 255, 204));

        Tabla_Datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "TIPO_DOC", "NUM_DOC", "GENERO", "NOMBRE", "APELLIDOS", "DIRECCION", "ALERGICO", "GRADO", "EDAD", "CENTRO_MEDICO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla_Datos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla_DatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla_Datos);
        if (Tabla_Datos.getColumnModel().getColumnCount() > 0) {
            Tabla_Datos.getColumnModel().getColumn(0).setMinWidth(30);
            Tabla_Datos.getColumnModel().getColumn(0).setPreferredWidth(30);
            Tabla_Datos.getColumnModel().getColumn(0).setMaxWidth(30);
            Tabla_Datos.getColumnModel().getColumn(1).setMinWidth(50);
            Tabla_Datos.getColumnModel().getColumn(1).setPreferredWidth(50);
            Tabla_Datos.getColumnModel().getColumn(1).setMaxWidth(50);
            Tabla_Datos.getColumnModel().getColumn(2).setResizable(false);
            Tabla_Datos.getColumnModel().getColumn(3).setMinWidth(50);
            Tabla_Datos.getColumnModel().getColumn(3).setPreferredWidth(50);
            Tabla_Datos.getColumnModel().getColumn(3).setMaxWidth(50);
            Tabla_Datos.getColumnModel().getColumn(4).setResizable(false);
            Tabla_Datos.getColumnModel().getColumn(5).setResizable(false);
            Tabla_Datos.getColumnModel().getColumn(6).setResizable(false);
            Tabla_Datos.getColumnModel().getColumn(7).setMinWidth(30);
            Tabla_Datos.getColumnModel().getColumn(7).setPreferredWidth(30);
            Tabla_Datos.getColumnModel().getColumn(7).setMaxWidth(30);
            Tabla_Datos.getColumnModel().getColumn(8).setMinWidth(50);
            Tabla_Datos.getColumnModel().getColumn(8).setPreferredWidth(50);
            Tabla_Datos.getColumnModel().getColumn(8).setMaxWidth(50);
            Tabla_Datos.getColumnModel().getColumn(9).setMinWidth(50);
            Tabla_Datos.getColumnModel().getColumn(9).setPreferredWidth(50);
            Tabla_Datos.getColumnModel().getColumn(9).setMaxWidth(50);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 896, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void rbtnCNEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnCNEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnCNEActionPerformed

    private void rbtnDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnDNIActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void txtnumdocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumdocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumdocActionPerformed

    private void txtdireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdireccionActionPerformed

    private void txtapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidoActionPerformed

    private void txtedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtedadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtedadActionPerformed

    private void CheckboxessaludActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckboxessaludActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckboxessaludActionPerformed

    private void CheckboxEmergenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckboxEmergenciasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckboxEmergenciasActionPerformed

    private void txtalergicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtalergicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtalergicoActionPerformed

    private void slideredadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slideredadStateChanged
        txtedad.setText("" + slideredad.getValue());
    }//GEN-LAST:event_slideredadStateChanged

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        agregar();
    }//GEN-LAST:event_btnagregarActionPerformed

    private void Tabla_DatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_DatosMouseClicked
        int fila = Tabla_Datos.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Paciente no seleccionado");
        } else {
            id = Integer.parseInt(Tabla_Datos.getValueAt(fila, 0).toString());
            String tipoDocumento = (String) Tabla_Datos.getValueAt(fila, 1);
            String numDocumento = (String) Tabla_Datos.getValueAt(fila, 2);
            String genero = (String) Tabla_Datos.getValueAt(fila, 3);
            String nombre = (String) Tabla_Datos.getValueAt(fila, 4);
            String apellidos = (String) Tabla_Datos.getValueAt(fila, 5);
            String direccion = (String) Tabla_Datos.getValueAt(fila, 6);
            String alergico = (String) Tabla_Datos.getValueAt(fila, 7);
            int grado = Integer.parseInt(Tabla_Datos.getValueAt(fila, 8).toString());
            int edad = Integer.parseInt(Tabla_Datos.getValueAt(fila, 9).toString());
            String centroMedico = (String) Tabla_Datos.getValueAt(fila, 10);

            txtId.setText("" + id);
            if (tipoDocumento.equals("DNI")) {
                rbtnDNI.setSelected(true);
            } else {
                rbtnCNE.setSelected(true);
            }
            txtnumdoc.setText(numDocumento);
            cbxGenero.setSelectedItem(genero.equals("M") ? "Masculino" : "Femenino");
            txtnombre.setText(nombre);
            txtapellido.setText(apellidos);
            txtdireccion.setText(direccion);
            txtalergico.setText(alergico);
            snipgrado.setValue(grado);
            slideredad.setValue(edad);

            Checkboxessalud.setSelected(centroMedico.contains("ESSALUD"));
            CheckboxEmergencias.setSelected(centroMedico.contains("EMERGENCIAS"));
        }
    }//GEN-LAST:event_Tabla_DatosMouseClicked

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed
        Modificar();
        
    }//GEN-LAST:event_btneditarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        Eliminar();
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
      nuevo();
    }//GEN-LAST:event_btnnuevoActionPerformed

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
            java.util.logging.Logger.getLogger(Botica_Crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Botica_Crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Botica_Crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Botica_Crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Botica_Crud().setVisible(true);
            }
        });
    }

    void listar() {
        String sql = "Select * from paciente";
        try {
            cn = con.getConnection();
            st = cn.createStatement();
            rs = st.executeQuery(sql);

            Object[] usuario = new Object[11];
            modelo = (DefaultTableModel) Tabla_Datos.getModel();

            while (rs.next()) {
                usuario[0] = rs.getInt("id");
                usuario[1] = rs.getString("tipo_documento");
                usuario[2] = rs.getString("numero_documento");
                usuario[3] = rs.getString("genero");
                usuario[4] = rs.getString("nombre");
                usuario[5] = rs.getString("apellidos");
                usuario[6] = rs.getString("direccion");
                usuario[7] = rs.getString("alergico");
                usuario[8] = rs.getString("grado");
                usuario[9] = rs.getString("edad");
                usuario[10] = rs.getString("centro_medico");
                modelo.addRow(usuario);

            }

            Tabla_Datos.setModel(modelo);

        } catch (SQLException e) {
            System.out.println("Error en : " + e);
        }
    }

    void agregar() {
    ButtonGroup grupoDocumento = new ButtonGroup();
    grupoDocumento.add(rbtnDNI);
    grupoDocumento.add(rbtnCNE);

    String tipoDocumento = rbtnDNI.isSelected() ? "DNI" : "CNE";
    String numDocumento = txtnumdoc.getText();
    String genero = "";
    String nombre = txtnombre.getText();
    String apellidos = txtapellido.getText();
    String direccion = txtdireccion.getText();
    String alergico = txtalergico.getText();
    int grado = (int) snipgrado.getValue();
    int edad = slideredad.getValue();
    String centroMedico = "";

    if (!numDocumento.matches("\\d+")) {
        JOptionPane.showMessageDialog(null, "El número de documento solo debe contener dígitos.");
        return;
    }

    if (tipoDocumento.equals("DNI")) {
        if (numDocumento.length() != 8) {
            JOptionPane.showMessageDialog(null, "El DNI debe contener exactamente 8 números.");
            return;
        }
    } else if (tipoDocumento.equals("CNE")) {
        if (numDocumento.length() < 9 || numDocumento.length() > 20) {
            JOptionPane.showMessageDialog(null, "El CNE debe contener entre 9 y 20 números.");
            return;
        }
    }

    if (cbxGenero.getSelectedItem().toString().equals("Masculino")) {
        genero = "M";
    } else if (cbxGenero.getSelectedItem().toString().equals("Femenino")) {
        genero = "F";
    } else {
        JOptionPane.showMessageDialog(null, "Seleccionar género");
        return;
    }

    if (Checkboxessalud.isSelected()) {
        centroMedico += "ESSALUD ";
    }
    if (CheckboxEmergencias.isSelected()) {
        centroMedico += "EMERGENCIAS";
    }

    if (centroMedico.trim().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Debe seleccionar al menos una opción en Centro Médico (ESSALUD o EMERGENCIAS)");
        return;
    }

    if (numDocumento.equals("") || nombre.equals("") || apellidos.equals("") || direccion.equals("") || alergico.equals("")) {
        JOptionPane.showMessageDialog(null, "Completar todos los campos");
        return;
    }

    String sql = "INSERT INTO paciente (tipo_documento, numero_documento, genero, nombre, apellidos, direccion, alergico, grado, edad, centro_medico) "
               + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    try {
        cn = con.getConnection();
        PreparedStatement pst = cn.prepareStatement(sql);
        pst.setString(1, tipoDocumento);
        pst.setString(2, numDocumento);
        pst.setString(3, genero);
        pst.setString(4, nombre);
        pst.setString(5, apellidos);
        pst.setString(6, direccion);
        pst.setString(7, alergico);
        pst.setInt(8, grado);
        pst.setInt(9, edad);
        pst.setString(10, centroMedico.trim());

        int n = pst.executeUpdate();
        if (n > 0) {
            JOptionPane.showMessageDialog(null, "Registro agregado exitosamente");
            limpiar();
            listar();
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error en: " + e.getMessage());
    }
}


    void Modificar() {
        String tipoDocumento = rbtnDNI.isSelected() ? "DNI" : "CNE";
        String numDocumento = txtnumdoc.getText();
        String genero = cbxGenero.getSelectedItem().toString().equals("Masculino") ? "M" : "F";
        String nombre = txtnombre.getText();
        String apellidos = txtapellido.getText();
        String direccion = txtdireccion.getText();
        String alergico = txtalergico.getText();
        int grado = (int) snipgrado.getValue();
        int edad = slideredad.getValue();
        String centroMedico = "";

        if (!numDocumento.matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "El número de documento solo debe contener dígitos.");
            return;
        }

        if (tipoDocumento.equals("DNI")) {
            if (numDocumento.length() != 8) {
                JOptionPane.showMessageDialog(null, "El DNI debe contener exactamente 8 números.");
                return;
            }
        } else if (tipoDocumento.equals("CNE")) {
            if (numDocumento.length() < 9 || numDocumento.length() > 20) {
                JOptionPane.showMessageDialog(null, "El CNE debe contener entre 9 y 20 números.");
                return;
            }
        }

        if (Checkboxessalud.isSelected()) {
            centroMedico += "ESSALUD ";
        }
        if (CheckboxEmergencias.isSelected()) {
            centroMedico += "EMERGENCIAS";
        }

        if (centroMedico.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar al menos una opción en Centro Médico (ESSALUD o EMERGENCIAS)");

            return;
        }

        if (numDocumento.equals("") || nombre.equals("") || apellidos.equals("") || direccion.equals("") || alergico.equals("")) {
            JOptionPane.showMessageDialog(null, "Necesita ingresar cambios");
        } else {
            String sql = "UPDATE paciente SET tipo_documento = ?, numero_documento = ?, genero = ?, nombre = ?, apellidos = ?, direccion = ?, alergico = ?, grado = ?, edad = ?, centro_medico = ? WHERE id = ?";

            try {
                cn = con.getConnection();
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setString(1, tipoDocumento);
                pst.setString(2, numDocumento);
                pst.setString(3, genero);
                pst.setString(4, nombre);
                pst.setString(5, apellidos);
                pst.setString(6, direccion);
                pst.setString(7, alergico);
                pst.setInt(8, grado);
                pst.setInt(9, edad);
                pst.setString(10, centroMedico.trim());
                pst.setInt(11, id);

                int n = pst.executeUpdate();
                if (n > 0) {
                    JOptionPane.showMessageDialog(null, "Actualización completada");
                    limpiar(); 
                    listar();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error en: " + e.getMessage());
            }
        }
    }

    void Eliminar() {
        int fila = Tabla_Datos.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Selecciona a alguien");
        } else {
            String sql = "DELETE FROM paciente WHERE Id = " + id;
            try {
                cn = con.getConnection();
                st = cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Pciente eliminado");
                limpiar();
                listar();

            } catch (SQLException e) {
                System.out.println("Error en: " + e);
            }
        }
    }
    
    
    void limpiar() {
        while (Tabla_Datos.getRowCount() > 0) {
            modelo.removeRow(0);
        }
    }
    
    void nuevo() {
    txtId.setText("");
    txtnumdoc.setText("");
    txtnombre.setText("");
    txtapellido.setText("");
    txtdireccion.setText("");
    txtalergico.setText("");
    snipgrado.setValue(0);
    slideredad.setValue(5);
    cbxGenero.setSelectedIndex(0);
    rbtnDNI.setSelected(true);
    Checkboxessalud.setSelected(false);
    CheckboxEmergencias.setSelected(false);
}

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckboxEmergencias;
    private javax.swing.JCheckBox Checkboxessalud;
    private javax.swing.JTable Tabla_Datos;
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JComboBox<String> cbxGenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbtnCNE;
    private javax.swing.JRadioButton rbtnDNI;
    private javax.swing.JSlider slideredad;
    private javax.swing.JSpinner snipgrado;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtalergico;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnumdoc;
    // End of variables declaration//GEN-END:variables
}
