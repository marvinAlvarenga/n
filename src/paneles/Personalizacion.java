/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import cache.UtilCache;
import configuraciones.EspecificacionCache;
import configuraciones.EspecificacionRam;
import configuraciones.EstadoEspecificacion;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utilidades.UnidadMedida;
import utilidades.Validador;

/**
 * Configurar los componentes arquitectónicos y sus capacidades a soportar.
 *
 * @author Marvin
 */
public class Personalizacion extends javax.swing.JPanel {

    private EspecificacionCache especificacionCache;
    private EspecificacionRam especificacionRam;

    /**
     * Creates new form Personalizacion
     */
    public Personalizacion() {
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

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCapacidadRam = new javax.swing.JTextField();
        comboBytesRam = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        comboDireccionable = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtTamBloques = new javax.swing.JTextField();
        etiTamBloques = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        comboLlenadoRam = new javax.swing.JComboBox<>();
        etiTamPalabra = new javax.swing.JLabel();
        txtTamPalabra = new javax.swing.JTextField();
        etiTamPalabraMedida = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtCapacidadCache = new javax.swing.JTextField();
        comboBytesCache = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        comboCorrespondencia = new javax.swing.JComboBox<>();
        etiReemplazo = new javax.swing.JLabel();
        comboAlgoReemplazo = new javax.swing.JComboBox<>();
        etiNumLineasConjunto = new javax.swing.JLabel();
        txtLineasConjunto = new javax.swing.JTextField();
        etiLineas = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tlbDetallesConfig = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(902, 506));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setText("Configuración de la Arquitectura del Simulador.");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("RAM"));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Capacidad:");

        txtCapacidadRam.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCapacidadRam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCapacidadRamKeyTyped(evt);
            }
        });

        comboBytesRam.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        comboBytesRam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "KiloByte", "MegaByte" }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Direccionable:");

        comboDireccionable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        comboDireccionable.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Byte", "Palabra" }));
        comboDireccionable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDireccionableActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Tamaño de Bloques:");

        txtTamBloques.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTamBloques.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTamBloquesKeyTyped(evt);
            }
        });

        etiTamBloques.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        etiTamBloques.setText("Bytes");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Llenado de posiciones de memoria:");

        comboLlenadoRam.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        comboLlenadoRam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manual", "Aleatorio" }));

        etiTamPalabra.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        etiTamPalabra.setText("Tamaño palabra:");
        etiTamPalabra.setEnabled(false);

        txtTamPalabra.setEditable(false);
        txtTamPalabra.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTamPalabra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTamPalabraKeyTyped(evt);
            }
        });

        etiTamPalabraMedida.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        etiTamPalabraMedida.setText("Bytes");
        etiTamPalabraMedida.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etiTamPalabra)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCapacidadRam, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboBytesRam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(comboDireccionable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTamBloques, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboLlenadoRam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiTamBloques))
                        .addGap(245, 245, 245))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtTamPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiTamPalabraMedida)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCapacidadRam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBytesRam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtTamBloques, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiTamBloques))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboDireccionable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboLlenadoRam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiTamPalabra)
                    .addComponent(txtTamPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiTamPalabraMedida))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("CACHE"));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Capacidad:");

        txtCapacidadCache.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCapacidadCache.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCapacidadCacheKeyTyped(evt);
            }
        });

        comboBytesCache.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        comboBytesCache.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "KiloByte", "MegaByte" }));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("F. Correspondencia:");

        comboCorrespondencia.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        comboCorrespondencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Directa", "Asociativa", "Por Conjunto" }));
        comboCorrespondencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCorrespondenciaActionPerformed(evt);
            }
        });

        etiReemplazo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        etiReemplazo.setText("Algoritmo de Reemplazo:");
        etiReemplazo.setEnabled(false);

        comboAlgoReemplazo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        comboAlgoReemplazo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LRU", "FIFO", "Aleatorio" }));
        comboAlgoReemplazo.setEnabled(false);

        etiNumLineasConjunto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        etiNumLineasConjunto.setText("Num. Lineas del Conjunto:");
        etiNumLineasConjunto.setEnabled(false);

        txtLineasConjunto.setEditable(false);
        txtLineasConjunto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtLineasConjunto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLineasConjuntoKeyTyped(evt);
            }
        });

        etiLineas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        etiLineas.setText("Lineas");
        etiLineas.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtCapacidadCache, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboBytesCache, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(etiReemplazo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboAlgoReemplazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(comboCorrespondencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(etiNumLineasConjunto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtLineasConjunto, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiLineas)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCapacidadCache, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBytesCache, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiReemplazo)
                    .addComponent(comboAlgoReemplazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(comboCorrespondencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiNumLineasConjunto)
                    .addComponent(txtLineasConjunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiLineas))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        btnGuardar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Resumen"));

        tlbDetallesConfig.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tlbDetallesConfig.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Detalles"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tlbDetallesConfig);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(232, 232, 232)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(207, 207, 207)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 232, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnGuardar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCapacidadRamKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCapacidadRamKeyTyped
        Validador.validarNumero(evt);
    }//GEN-LAST:event_txtCapacidadRamKeyTyped

    private void txtTamBloquesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTamBloquesKeyTyped
        Validador.validarNumero(evt);
    }//GEN-LAST:event_txtTamBloquesKeyTyped

    private void txtCapacidadCacheKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCapacidadCacheKeyTyped
        Validador.validarNumero(evt);
    }//GEN-LAST:event_txtCapacidadCacheKeyTyped

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        EspecificacionRam auxRam = null;
        EspecificacionCache auxCache = null;

        String capaRam = txtCapacidadRam.getText();
        String tamBloques = txtTamBloques.getText();
        String tamPalabra = txtTamPalabra.getText();
        String capaCache = txtCapacidadCache.getText();
        String numLineasConjunto = txtLineasConjunto.getText();
        String mensaje = "";
        int direccionableRam = comboDireccionable.getSelectedIndex();

        if (!capaRam.isEmpty() && !tamBloques.isEmpty() && !capaCache.isEmpty()) {

            if (Validador.esPotenciaDeDos(capaRam) < 0) {
                mensaje = "La capacidad de RAM debe ser potencia de 2.";
            } else if (Validador.esPotenciaDeDos(tamBloques) < 0) {
                mensaje = "El tamaño de bloques debe ser potencia de 2.";
            } else if (Validador.esPotenciaDeDos(capaCache) < 0) {
                mensaje = "La capacidad de CACHE debe de ser potencia de 2";
            } else {
                // Comparar las capacidades de RAM  y  CACHE
                long capacidadRAM = 0;
                switch (comboBytesRam.getSelectedIndex()) {
                    case UnidadMedida.KILO_BYTE:
                        capacidadRAM = Integer.parseInt(capaRam) * (long) Math.pow(2, 10);
                        break;
                    case UnidadMedida.MEGA_BYTE:
                        capacidadRAM = Integer.parseInt(capaRam) * (long) Math.pow(2, 20);
                        break;
                    case UnidadMedida.GIGA_BYTE:
                        capacidadRAM = Integer.parseInt(capaRam) * (long) Math.pow(2, 30);
                        break;
                }
                long capacidadCACHE = 0;
                switch (comboBytesCache.getSelectedIndex()) {
                    case UnidadMedida.KILO_BYTE:
                        capacidadCACHE = Integer.parseInt(capaCache) * (long) Math.pow(2, 10);
                        break;
                    case UnidadMedida.MEGA_BYTE:
                        capacidadCACHE = Integer.parseInt(capaCache) * (long) Math.pow(2, 20);
                        break;
                    case UnidadMedida.GIGA_BYTE:
                        capacidadCACHE = Integer.parseInt(capaCache) * (long) Math.pow(2, 30);
                        break;
                }
                if (capacidadRAM > capacidadCACHE) {
                    auxRam = new EspecificacionRam(Integer.parseInt(capaRam),
                            comboBytesRam.getSelectedIndex(),
                            comboDireccionable.getSelectedIndex(),
                            Integer.parseInt(tamBloques), comboLlenadoRam.getSelectedIndex());

                    if (direccionableRam == UnidadMedida.PALABRA && !tamPalabra.isEmpty() && Validador.esPotenciaDeDos(tamPalabra) >= 0) { //Direccionamiento por palabra
                        auxRam.setTamañoPalabra(Integer.parseInt(tamPalabra));
                    } else if (direccionableRam == UnidadMedida.PALABRA) {
                        mensaje = "El tamaño de palabra no es valido.";
                    }

                    auxRam.realizarCalculos();

                    auxCache = new EspecificacionCache(Integer.parseInt(capaCache),
                            comboBytesCache.getSelectedIndex(), comboCorrespondencia.getSelectedIndex(),
                            comboAlgoReemplazo.getSelectedIndex(), auxRam);

                    if (comboCorrespondencia.getSelectedIndex() == UtilCache.POR_CONJUNTO && !numLineasConjunto.isEmpty() && Integer.parseInt(numLineasConjunto) > 1) {
                        auxCache.setCantidadLineasPorConjunto(Integer.parseInt(numLineasConjunto));
                    } else if (comboCorrespondencia.getSelectedIndex() == UtilCache.POR_CONJUNTO) {
                        mensaje = "Numero de lineas para el conjunto debe ser mayor que 1.";
                    }

                    auxCache.realizarCalculos();
                }else{
                    mensaje = "La capacidad de RAM debe ser mayor a la de la CACHE";
                }

            }

        } else {
            mensaje = "Hay campos sin completar";
        }

        if (!mensaje.isEmpty()) {
            JOptionPane.showMessageDialog(this, mensaje, "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else if (especificacionCache == null && especificacionRam == null) {
            especificacionCache = auxCache;
            especificacionRam = auxRam;
            pintarDetallesEnTabla();
        } else {
            if (!especificacionCache.equals(auxCache)) {
                especificacionCache = null;
                especificacionCache = auxCache;
                EstadoEspecificacion.setEspeciCacheEnHome(false); //Especificacion sin aplicar
                EstadoEspecificacion.setEspeciCacheEnCompo(false); //Especificacion sin aplicar
                pintarDetallesEnTabla();
            }
            if (!especificacionRam.equals(auxRam)) {
                especificacionRam = null;
                especificacionRam = auxRam;
                EstadoEspecificacion.setEspeciRamEnHome(false); //Especificacion sin aplicar
                EstadoEspecificacion.setEspeciRamEnCompo(false);//Especificacion sin aplicar
                pintarDetallesEnTabla();
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void comboDireccionableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboDireccionableActionPerformed
        if (comboDireccionable.getSelectedIndex() == UnidadMedida.BYTE) {
            etiTamPalabra.setEnabled(false);
            etiTamPalabraMedida.setEnabled(false);
            txtTamPalabra.setEditable(false);
            etiTamBloques.setText("Bytes");
        } else {
            etiTamPalabra.setEnabled(true);
            etiTamPalabraMedida.setEnabled(true);
            txtTamPalabra.setEditable(true);
            etiTamBloques.setText("Palabras");
        }
    }//GEN-LAST:event_comboDireccionableActionPerformed

    private void txtTamPalabraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTamPalabraKeyTyped
        Validador.validarNumero(evt);
    }//GEN-LAST:event_txtTamPalabraKeyTyped

    private void txtLineasConjuntoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLineasConjuntoKeyTyped
        Validador.validarNumero(evt);
    }//GEN-LAST:event_txtLineasConjuntoKeyTyped

    private void comboCorrespondenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCorrespondenciaActionPerformed
        if (comboCorrespondencia.getSelectedIndex() == UtilCache.POR_CONJUNTO) {//Asociativa por conjunto
            etiLineas.setEnabled(true);
            etiNumLineasConjunto.setEnabled(true);
            txtLineasConjunto.setEditable(true);
        } else {
            etiLineas.setEnabled(false);
            etiNumLineasConjunto.setEnabled(false);
            txtLineasConjunto.setEditable(false);
        }

        if (comboCorrespondencia.getSelectedIndex() == UtilCache.DIRECTA) {
            etiReemplazo.setEnabled(false);
            comboAlgoReemplazo.setEnabled(false);
        } else {
            etiReemplazo.setEnabled(true);
            comboAlgoReemplazo.setEnabled(true);
        }
    }//GEN-LAST:event_comboCorrespondenciaActionPerformed

    private void pintarDetallesEnTabla() {
        String aux;

        //Limpiar tabla de detalles
        DefaultTableModel tablaDetalles = (DefaultTableModel) tlbDetallesConfig.getModel();
        for (int i = tablaDetalles.getRowCount() - 1; i >= 0; i--) {
            tablaDetalles.removeRow(i);
        }

        tablaDetalles.addRow(new Object[]{"---------RAM-----------"});

        //Capacidad de la RAM
        aux = String.valueOf(especificacionRam.getCapacidadMP());
        switch (especificacionRam.getUnidadMedidaMP()) {
            case UnidadMedida.KILO_BYTE:
                aux += " KiloBytes";
                break;
            case UnidadMedida.MEGA_BYTE:
                aux += " MegaBytes";
                break;
            case UnidadMedida.GIGA_BYTE:
                aux += " GigaBytes";
        }
        tablaDetalles.addRow(new Object[]{"Capacidad RAM: " + aux});

        //Tamaño de bloque RAM
        aux = String.valueOf(especificacionRam.getTamañoBloque());
        switch (especificacionRam.getNivelDireccionable()) {
            case UnidadMedida.BYTE:
                aux += " Bytes";
                break;
            case UnidadMedida.PALABRA:
                aux += " Palabras";
        }
        tablaDetalles.addRow(new Object[]{"Tamaño de bloques: " + aux});

        //Total de numero de bloques
        aux = String.valueOf(especificacionRam.getTotalNumeroBloques());
        tablaDetalles.addRow(new Object[]{"Num. Tot. de bloques: " + aux + " -->(2^" + Validador.esPotenciaDeDos(String.valueOf(especificacionRam.getTotalNumeroBloques())) + ")"});

        //Maximo direccionable
        aux = String.valueOf(especificacionRam.getMaxDireccionable());
        tablaDetalles.addRow(new Object[]{"Máximo direccionable: " + aux + " bits"});

        tablaDetalles.addRow(new Object[]{"--------CACHE-----------"});

        //Capacidad de la cache
        aux = String.valueOf(especificacionCache.getCapacidadCache());
        switch (especificacionCache.getUnidadMedidaCache()) {
            case UnidadMedida.KILO_BYTE:
                aux += " KiloBytes";
                break;
            case UnidadMedida.MEGA_BYTE:
                aux += " MegaBytes";
                break;
            case UnidadMedida.GIGA_BYTE:
                aux += " GigaBytes";
        }
        tablaDetalles.addRow(new Object[]{"Capacidad Cache: " + aux});

        //Funcion de correspondencia
        switch (especificacionCache.getFuncionCorrespondencia()) {
            case UtilCache.DIRECTA:
                aux = "Directa";
                break;
            case UtilCache.ASOCIATIVA:
                aux = "Totalmente Asociativa";
                break;
            case UtilCache.POR_CONJUNTO:
                aux = "Asociativa por conjunto";
        }
        tablaDetalles.addRow(new Object[]{"Correspondencia: " + aux});

        //Algoritmo de reemplazo
        switch (especificacionCache.getAlgoReemplazo()) {
            case UtilCache.LRU:
                aux = "LRU";
                break;
            case UtilCache.FIFO:
                aux = "FIFO";
                break;
            case UtilCache.ALEATORIO:
                aux = "Aleatorio";
        }
        tablaDetalles.addRow(new Object[]{"Algorimo reemplazo: " + aux});

        //Tamaño de linea cache
        aux = String.valueOf(especificacionCache.getRam().getTamañoBloque());
        switch (especificacionCache.getRam().getNivelDireccionable()) {
            case UnidadMedida.BYTE:
                aux += " Bytes";
                break;
            case UnidadMedida.PALABRA:
                aux += " Palabras";
        }
        tablaDetalles.addRow(new Object[]{"Tamaño de linea: " + aux});

        //Numero de lineas
        aux = String.valueOf(especificacionCache.getNumTotalLineas());
        tablaDetalles.addRow(new Object[]{"Num. Tot. de lineas: " + aux});

        //Tamaño de direcciones
        aux = String.valueOf(especificacionCache.getRam().getMaxDireccionable());
        tablaDetalles.addRow(new Object[]{"Tamaño direcciones: " + aux + " bits"});

        //Numero de Lineas por conjunto
        if (especificacionCache.getFuncionCorrespondencia() == UtilCache.POR_CONJUNTO) {
            tablaDetalles.addRow(new Object[]{"Conjuntos de: " + especificacionCache.getCantidadLineasPorConjunto() + " lineas"});
            tablaDetalles.addRow(new Object[]{"Num. Tot. de conjuntos: " + especificacionCache.getCantidadDeConjuntos() + " conjuntos"});
        }
    }

    public EspecificacionCache getEspecificacionCache() {
        return especificacionCache;
    }

    public void setEspecificacionCache(EspecificacionCache especificacionCache) {
        this.especificacionCache = especificacionCache;
    }

    public EspecificacionRam getEspecificacionRam() {
        return especificacionRam;
    }

    public void setEspecificacionRam(EspecificacionRam especificacionRam) {
        this.especificacionRam = especificacionRam;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> comboAlgoReemplazo;
    private javax.swing.JComboBox<String> comboBytesCache;
    private javax.swing.JComboBox<String> comboBytesRam;
    private javax.swing.JComboBox<String> comboCorrespondencia;
    private javax.swing.JComboBox<String> comboDireccionable;
    private javax.swing.JComboBox<String> comboLlenadoRam;
    private javax.swing.JLabel etiLineas;
    private javax.swing.JLabel etiNumLineasConjunto;
    private javax.swing.JLabel etiReemplazo;
    private javax.swing.JLabel etiTamBloques;
    private javax.swing.JLabel etiTamPalabra;
    private javax.swing.JLabel etiTamPalabraMedida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tlbDetallesConfig;
    private javax.swing.JTextField txtCapacidadCache;
    private javax.swing.JTextField txtCapacidadRam;
    private javax.swing.JTextField txtLineasConjunto;
    private javax.swing.JTextField txtTamBloques;
    private javax.swing.JTextField txtTamPalabra;
    // End of variables declaration//GEN-END:variables
}
