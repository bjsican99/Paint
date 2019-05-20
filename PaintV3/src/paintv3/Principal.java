/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintv3;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Component;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.*;
import say.swing.JFontChooser;

public class Principal extends javax.swing.JFrame {
   
  
    Lienzo dibujo;
    int grados=0;
    Font tipoaletra;
    public Principal() {
      
        initComponents();
        dibujo = new Lienzo();
        dibujo.setBounds(240, 140, 940, 620);
        this.add(dibujo);
        cmbtamaño.setEnabled(false);

    }
    
 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cmdlapiz = new javax.swing.JButton();
        cmdmarcador = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cmbtamaño = new javax.swing.JComboBox<>();
        cmdborrar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cmdgc = new javax.swing.JButton();
        cmdcir = new javax.swing.JButton();
        cmdrcir = new javax.swing.JButton();
        cmdcolor = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        cmdcuar = new javax.swing.JButton();
        cmdcua = new javax.swing.JButton();
        cmdgcua = new javax.swing.JButton();
        cmdlin = new javax.swing.JButton();
        cmdglin = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txttexto = new javax.swing.JTextField();
        txttletra = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        mninuevo = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));

        jButton2.setText("cambiar tamaño");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Insertar Imagenl");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Convertir Blanco y negro");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Cortar Imagen");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Rotar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton1.setText("Convertir a Color");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 153));

        jLabel4.setText("Tipo De Trazo:");

        cmdlapiz.setText("Lapiz");
        cmdlapiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdlapizActionPerformed(evt);
            }
        });

        cmdmarcador.setText("Marcador");
        cmdmarcador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdmarcadorActionPerformed(evt);
            }
        });

        jLabel5.setText("Tamaño:");

        cmbtamaño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8", "9", "10", "11", "12", "14", "16", "18", "20", "22", "24", "26", "28", "36", "48", "72", "100" }));
        cmbtamaño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbtamañoActionPerformed(evt);
            }
        });

        cmdborrar.setText("BORRADOR");
        cmdborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdborrarActionPerformed(evt);
            }
        });

        jLabel6.setText("Figuras:");

        cmdgc.setText("Gusano De Circulo");
        cmdgc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdgcActionPerformed(evt);
            }
        });

        cmdcir.setText("Circulo");
        cmdcir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdcirActionPerformed(evt);
            }
        });

        cmdrcir.setText("Circulo Relleno");
        cmdrcir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdrcirActionPerformed(evt);
            }
        });

        cmdcolor.setText("Cambiar color");
        cmdcolor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdcolorActionPerformed(evt);
            }
        });

        cmdcuar.setText("Cuadrado Relleno");
        cmdcuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdcuarActionPerformed(evt);
            }
        });

        cmdcua.setText("Cuadrado");
        cmdcua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdcuaActionPerformed(evt);
            }
        });

        cmdgcua.setText("Gusano Del Cuadrado");
        cmdgcua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdgcuaActionPerformed(evt);
            }
        });

        cmdlin.setText("Linea desde 0,0");
        cmdlin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdlinActionPerformed(evt);
            }
        });

        cmdglin.setText("Gusano De Lineas desde 0,0");
        cmdglin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdglinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(cmdcolor, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jLabel6)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmdlapiz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmdmarcador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmdglin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmdborrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmdgc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmdcir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmdrcir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmdcua, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmdcuar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmdgcua, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmdlin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbtamaño, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(6, 6, 6))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdlapiz)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmdmarcador)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbtamaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmdcolor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cmdborrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdgc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdgcua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdglin)
                .addGap(18, 18, 18)
                .addComponent(cmdcir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdcua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdlin)
                .addGap(18, 18, 18)
                .addComponent(cmdrcir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdcuar)
                .addContainerGap(193, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 153));

        jLabel7.setText("Escriba Su Texto:");

        txttexto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txttextoKeyPressed(evt);
            }
        });

        txttletra.setText("<html>\n<p>\nTipo De\n</p>\n<p>\nLetra\n</p>\n</html>\n");
        txttletra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttletraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txttexto, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(txttletra, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txttletra, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(txttexto))
                .addContainerGap())
        );

        jMenu1.setText("ARCHIVO");

        jMenu5.setText("NUEVO");

        mninuevo.setText("Lienzo En Blanco");
        mninuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mninuevoActionPerformed(evt);
            }
        });
        jMenu5.add(mninuevo);

        jMenuItem2.setText("Cargar Imagnel...");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem2);

        jMenu1.add(jMenu5);
        jMenu1.add(jSeparator1);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Guardar Imagen");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem1.setText("Guardar Lienzo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("ACERCA DE");

        jMenuItem7.setText("Programa");
        jMenu3.add(jMenuItem7);

        jMenuItem8.setText("Creadores");
        jMenu3.add(jMenuItem8);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 630, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdlapizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdlapizActionPerformed
dibujo.grosor=2;
        dibujo.borrar = false;
        dibujo.cuadrado = false;
        dibujo.circulo= false;
        dibujo.cir = false;
        dibujo.cua = false;
        dibujo.linea = false;
        dibujo.lin = false;
        dibujo.cirr = false;
        dibujo.cuar = false;
        cmbtamaño.setEnabled(false);
    }//GEN-LAST:event_cmdlapizActionPerformed

    private void cmdborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdborrarActionPerformed
        
        dibujo.grosor = 8;
        dibujo.borrar = true;
        dibujo.cuadrado = false;
        dibujo.circulo= false;
        dibujo.cir = false;
        dibujo.cua = false;
        dibujo.linea = false;
        dibujo.lin = false;
        dibujo.cirr = false;
        dibujo.cuar = false;
        cmbtamaño.setEnabled(true);
    }//GEN-LAST:event_cmdborrarActionPerformed

    private void cmdcolorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdcolorActionPerformed
        dibujo.colorparadibujaroescribir();
    }//GEN-LAST:event_cmdcolorActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        dibujo.Abririmagen();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       dibujo.Abririmagen();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dibujo.cambiartamaño();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       try {
           repaint();  //llamamada del metodo rotar imagen
           dibujo.rotar();
    
        } catch (Exception e) {
            System.out.println("no se puede prro");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      dibujo.byn();
      repaint();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void cmdcirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdcirActionPerformed

dibujo.grosor=2;
dibujo.borrar = false;
        dibujo.cuadrado = false;
        dibujo.circulo= false;
        dibujo.cir = true;
        dibujo.cua = false;
        dibujo.linea = false;
        dibujo.lin = false;
        dibujo.cirr = false;
        dibujo.cuar = false;
        cmbtamaño.setEnabled(true);
    }//GEN-LAST:event_cmdcirActionPerformed

    private void cmdcuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdcuaActionPerformed
dibujo.grosor=2;
        dibujo.borrar = false;
        dibujo.cuadrado = false;
        dibujo.circulo= false;
        dibujo.cir = false;
        dibujo.cua = true;
        dibujo.linea = false;
        dibujo.lin = false;
        dibujo.cirr = false;
        dibujo.cuar = false;
        cmbtamaño.setEnabled(true);
    }//GEN-LAST:event_cmdcuaActionPerformed

    private void cmbtamañoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbtamañoActionPerformed
        switch(cmbtamaño.getSelectedItem().toString()){
            case "8": dibujo.grosor = 8;break;
            case "9": dibujo.grosor = 9;break;
            case "10": dibujo.grosor = 10;break;
            case "11": dibujo.grosor = 11;break;
            case "12": dibujo.grosor = 12;break;
            case "14": dibujo.grosor = 14;break;
            case "16": dibujo.grosor = 16;break;
            case "18": dibujo.grosor = 18;break;
            case "20": dibujo.grosor = 20;break;
            case "22": dibujo.grosor = 22;break;
            case "24": dibujo.grosor = 24;break;
            case "26": dibujo.grosor = 26;break;
            case "28": dibujo.grosor = 28;break;
            case "36": dibujo.grosor = 36;break;
            case "48": dibujo.grosor = 48;break;
            case "72": dibujo.grosor = 72;break;
            case "100": dibujo.grosor = 100;break;
        }
    }//GEN-LAST:event_cmbtamañoActionPerformed

    private void cmdmarcadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdmarcadorActionPerformed
dibujo.grosor=2;
        dibujo.borrar = false;
        dibujo.cuadrado = false;
        dibujo.circulo= false;
        dibujo.cir = false;
        dibujo.cua = false;
        dibujo.linea = false;
        dibujo.lin = false;
        dibujo.cirr = false;
        dibujo.cuar = false;
        cmbtamaño.setEnabled(true);
    }//GEN-LAST:event_cmdmarcadorActionPerformed

    private void cmdgcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdgcActionPerformed
dibujo.grosor=2;
        dibujo.borrar = false;
        dibujo.cuadrado = false;
        dibujo.circulo= true;
        dibujo.cir = false;
        dibujo.cua = false;
        dibujo.linea = false; 
        dibujo.lin = false;
        dibujo.cirr = false;
        dibujo.cuar = false;
        cmbtamaño.setEnabled(true);
    }//GEN-LAST:event_cmdgcActionPerformed

    private void cmdrcirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdrcirActionPerformed

        dibujo.borrar = false;
        dibujo.cuadrado = false;
        dibujo.circulo= false;
        dibujo.cir = false;
        dibujo.cua = false;
        dibujo.linea = false;
        dibujo.lin = false;
        dibujo.cirr = true;
        dibujo.cuar = false;
        cmbtamaño.setEnabled(true);
    }//GEN-LAST:event_cmdrcirActionPerformed

    private void cmdgcuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdgcuaActionPerformed
dibujo.grosor=2;
        dibujo.borrar = false;
        dibujo.cuadrado = true;
        dibujo.circulo= false;
        dibujo.cir = false;
        dibujo.cua = false;
        dibujo.linea = false;
        dibujo.lin = false;
        dibujo.cirr = false;
        dibujo.cuar = false;
        cmbtamaño.setEnabled(true);
    }//GEN-LAST:event_cmdgcuaActionPerformed

    private void mninuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mninuevoActionPerformed
        dibujo.LimpiarPantalla();
    }//GEN-LAST:event_mninuevoActionPerformed

    private void cmdlinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdlinActionPerformed
dibujo.grosor=2;
        dibujo.borrar = false;
        dibujo.cuadrado = false;
        dibujo.circulo= false;
        dibujo.cir = false;
        dibujo.cua = false;
        dibujo.linea = false; 
        dibujo.lin = true;
        dibujo.cirr = false;
        dibujo.cuar = false;
        cmbtamaño.setEnabled(true);
    }//GEN-LAST:event_cmdlinActionPerformed

    private void cmdglinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdglinActionPerformed
dibujo.grosor=2;
        dibujo.borrar = false;
        dibujo.cuadrado = false;
        dibujo.circulo= false;
        dibujo.cir = false;
        dibujo.cua = false;
        dibujo.linea = true;
        dibujo.lin = false;
        dibujo.cirr = false;
        dibujo.cuar = false;
        cmbtamaño.setEnabled(true);
    }//GEN-LAST:event_cmdglinActionPerformed

    private void cmdcuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdcuarActionPerformed
        dibujo.borrar = false;
        dibujo.cuadrado = false;
        dibujo.circulo= false;
        dibujo.cir = false;
        dibujo.cua = false;
        dibujo.linea = false;
        dibujo.lin = false;
        dibujo.cirr = false;
        dibujo.cuar = true;
        cmbtamaño.setEnabled(true);
    }//GEN-LAST:event_cmdcuarActionPerformed

    private void txttextoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttextoKeyPressed
        dibujo.borrar= true;
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            dibujo.text = txttexto.getText();
            txttexto.setText("");
            dibujo.texto = true;
        }
        dibujo.borrar = false;
    }//GEN-LAST:event_txttextoKeyPressed

    private void txttletraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttletraActionPerformed
        JFontChooser tipodelaletraseleccion = new JFontChooser();
        int tl = tipodelaletraseleccion.showDialog(this);
        if(tl == JFontChooser.OK_OPTION){
            tipoaletra = tipodelaletraseleccion.getSelectedFont();
            txttexto.setFont(tipoaletra);
            dibujo.letra = tipoaletra;
        }   
    }//GEN-LAST:event_txttletraActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      dibujo.cortar();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
dibujo.guardar();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
dibujo.regresaracolor();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
dibujo.guardardibujo();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed
   

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbtamaño;
    private javax.swing.JButton cmdborrar;
    private javax.swing.JButton cmdcir;
    private javax.swing.JButton cmdcolor;
    private javax.swing.JButton cmdcua;
    private javax.swing.JButton cmdcuar;
    private javax.swing.JButton cmdgc;
    private javax.swing.JButton cmdgcua;
    private javax.swing.JButton cmdglin;
    private javax.swing.JButton cmdlapiz;
    private javax.swing.JButton cmdlin;
    private javax.swing.JButton cmdmarcador;
    private javax.swing.JButton cmdrcir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JMenuItem mninuevo;
    private javax.swing.JTextField txttexto;
    private javax.swing.JButton txttletra;
    // End of variables declaration//GEN-END:variables

    private void initComponents(Component add) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
