/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package footballmanager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author wesker
 */
public class VistaFinanzasEquipo extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     * @param wor
     */
    public VistaFinanzasEquipo(Mundo wor) {
        initComponents();
        this.wor = wor;
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Java Football Manager");
 
        this.RenderizarVista();
    }

    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        NombreEquipo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Valor = new javax.swing.JLabel();
        Sueldo = new javax.swing.JLabel();
        Avanzar = new javax.swing.JButton();
        GastosTo = new javax.swing.JLabel();
        Fondos1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Valor2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 51));

        NombreEquipo.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        NombreEquipo.setForeground(new java.awt.Color(255, 255, 255));
        NombreEquipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NombreEquipo.setText("jLabel1");

        jPanel2.setBackground(new java.awt.Color(0, 153, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Gastos plantel", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 36), new java.awt.Color(255, 255, 255))); // NOI18N

        Valor.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Valor.setForeground(new java.awt.Color(255, 255, 255));
        Valor.setText("Valor total del plantel:$");

        Sueldo.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Sueldo.setForeground(new java.awt.Color(255, 255, 255));
        Sueldo.setText("Sueldos:$");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Valor, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Sueldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Valor)
                .addGap(41, 41, 41)
                .addComponent(Sueldo)
                .addContainerGap(334, Short.MAX_VALUE))
        );

        Avanzar.setBackground(new java.awt.Color(0, 204, 102));
        Avanzar.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        Avanzar.setForeground(new java.awt.Color(255, 255, 255));
        Avanzar.setText("Volver al menu anterior");
        Avanzar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Avanzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AvanzarActionPerformed(evt);
            }
        });

        GastosTo.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        GastosTo.setForeground(new java.awt.Color(255, 255, 255));
        GastosTo.setText("Gastos totales:$");

        Fondos1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        Fondos1.setForeground(new java.awt.Color(255, 255, 255));
        Fondos1.setText("Fondos:$");

        jPanel3.setBackground(new java.awt.Color(0, 153, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Gastos Estadio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 36), new java.awt.Color(255, 255, 255))); // NOI18N

        Valor2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Valor2.setForeground(new java.awt.Color(255, 255, 255));
        Valor2.setText("Mantencion Estadio:$");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Valor2, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Valor2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NombreEquipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Avanzar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GastosTo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Fondos1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NombreEquipo)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(68, 68, 68)
                .addComponent(GastosTo)
                .addGap(28, 28, 28)
                .addComponent(Fondos1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Avanzar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AvanzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AvanzarActionPerformed
        // TODO add your handling code here:
        VistaEquipo vivi = new VistaEquipo(wor);
        vivi.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AvanzarActionPerformed

    
    
    Mundo wor;


    public void RenderizarVista(){
        NombreEquipo.setText(wor.getEquipoPlayer().NombreEquipo);
        Valor.setText("Valor total del plantel:$"+wor.getEquipoPlayer().getValorTotalPlantel());
        Sueldo.setText("Sueldos plantel(x Temporada):$"+wor.getEquipoPlayer().getGastoSueldo());
        Valor2.setText("Mantención estadio:$"+wor.getEquipoPlayer().EstEquipo.GastoMantencion);
        GastosTo.setText("Gastos totales:$"+wor.getEquipoPlayer().getUtilidadesTotales());
        Fondos1.setText("Fondos:$"+wor.getEquipoPlayer().Dinero);
    }
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Avanzar;
    private javax.swing.JLabel Fondos1;
    private javax.swing.JLabel GastosTo;
    private javax.swing.JLabel NombreEquipo;
    private javax.swing.JLabel Sueldo;
    private javax.swing.JLabel Valor;
    private javax.swing.JLabel Valor2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
