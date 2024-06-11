/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package footballmanager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author wesker
 */
public class VistaRenovarContrato extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     * @param wor
     */
    public VistaRenovarContrato(Mundo wor,int Elesio, int IndexJugi) {
        initComponents();
        this.wor = wor;
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Java Football Manager");
        this.Eleccion = Elesio;
        this.IndexJug = IndexJugi;
 
        this.RenderizarVista();
    }

    
    //0 es onceinicial 1 es reserva
    
    
   

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
        Avanzar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        NombreJug = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Salary = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Rest = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Ataque = new javax.swing.JLabel();
        Valor = new javax.swing.JLabel();
        Edad1 = new javax.swing.JLabel();
        Atac = new javax.swing.JTextField();
        Atac1 = new javax.swing.JTextField();
        Ataque1 = new javax.swing.JLabel();
        Atac2 = new javax.swing.JTextField();
        Ataque2 = new javax.swing.JLabel();
        Atac3 = new javax.swing.JTextField();
        Ataque3 = new javax.swing.JLabel();
        Ataque4 = new javax.swing.JLabel();
        Ataque5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        PropuestaS = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        AgnosS = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 51));

        NombreEquipo.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        NombreEquipo.setForeground(new java.awt.Color(255, 255, 255));
        NombreEquipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NombreEquipo.setText("jLabel1");

        Avanzar.setBackground(new java.awt.Color(0, 204, 102));
        Avanzar.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        Avanzar.setForeground(new java.awt.Color(255, 255, 255));
        Avanzar.setText("Volver al menú anterior");
        Avanzar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Avanzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AvanzarActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 153, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Futbolista", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 36), new java.awt.Color(255, 255, 255))); // NOI18N

        NombreJug.setEditable(false);
        NombreJug.setBackground(new java.awt.Color(153, 255, 153));
        NombreJug.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        NombreJug.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NombreJug.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Contrato Actual");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Año de contratación:");

        Salary.setEditable(false);
        Salary.setBackground(new java.awt.Color(153, 255, 153));
        Salary.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Salary.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Salary.setText("$");
        Salary.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Salario por temporada");

        Rest.setEditable(false);
        Rest.setBackground(new java.awt.Color(153, 255, 153));
        Rest.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Rest.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Rest.setText("$");
        Rest.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Temporadas restantes de contrato");

        Ataque.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Ataque.setForeground(new java.awt.Color(255, 255, 255));
        Ataque.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Ataque.setText("Ataque:");

        Valor.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Valor.setForeground(new java.awt.Color(255, 255, 255));
        Valor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Valor.setText("Valor:");

        Edad1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Edad1.setForeground(new java.awt.Color(255, 255, 255));
        Edad1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Edad1.setText("Edad");

        Atac.setEditable(false);
        Atac.setBackground(new java.awt.Color(153, 255, 153));
        Atac.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Atac.setText("0");

        Atac1.setEditable(false);
        Atac1.setBackground(new java.awt.Color(153, 255, 153));
        Atac1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Atac1.setText("0");

        Ataque1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Ataque1.setForeground(new java.awt.Color(255, 255, 255));
        Ataque1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Ataque1.setText("Mediocampo:");

        Atac2.setEditable(false);
        Atac2.setBackground(new java.awt.Color(153, 255, 153));
        Atac2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Atac2.setText("0");

        Ataque2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Ataque2.setForeground(new java.awt.Color(255, 255, 255));
        Ataque2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Ataque2.setText("Defensa:");

        Atac3.setEditable(false);
        Atac3.setBackground(new java.awt.Color(153, 255, 153));
        Atac3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Atac3.setText("0");

        Ataque3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Ataque3.setForeground(new java.awt.Color(255, 255, 255));
        Ataque3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Ataque3.setText("Porteria:");

        Ataque4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Ataque4.setForeground(new java.awt.Color(255, 255, 255));
        Ataque4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ataque4.setText("Media:");

        Ataque5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Ataque5.setForeground(new java.awt.Color(255, 255, 255));
        Ataque5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ataque5.setText("Dorsal:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Propuesta de contrato nueva");

        PropuestaS.setBackground(new java.awt.Color(153, 255, 153));
        PropuestaS.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        PropuestaS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PropuestaS.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PropuestaS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PropuestaSKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Salario por temporada");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Años de extensión");

        AgnosS.setBackground(new java.awt.Color(153, 255, 153));
        AgnosS.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        AgnosS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7" }));

        jButton1.setBackground(new java.awt.Color(0, 204, 102));
        jButton1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Ofrecer nuevo contrato");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Ataque4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NombreJug)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Salary)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Rest)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Valor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Edad1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Ataque)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Atac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(Ataque1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Atac1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Ataque2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Atac2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(Ataque3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Atac3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Ataque5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(AgnosS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(610, 610, 610))
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PropuestaS)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NombreJug, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Edad1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Ataque3)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Ataque)
                        .addComponent(Atac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Atac3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Ataque2)
                        .addComponent(Atac2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Ataque1)
                        .addComponent(Atac1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Ataque5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Ataque4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Valor)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Rest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PropuestaS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AgnosS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Avanzar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NombreEquipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NombreEquipo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Avanzar)
                .addGap(14, 14, 14))
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
        VistaPlantel vivi = new VistaPlantel(wor);
        
        vivi.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AvanzarActionPerformed

    private void PropuestaSKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PropuestaSKeyTyped
        // TODO add your handling code here:
        if (!Character.isDigit(evt.getKeyChar()) || PropuestaS.getText().isEmpty() && evt.getKeyChar() == '0'){
            evt.consume();
        }
    }//GEN-LAST:event_PropuestaSKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (!PropuestaS.getText().isEmpty()){
            switch (Eleccion){
            case 0 ->{
                
                Contrato Propo = new Contrato(wor.getEquipoPlayer().NombreEquipo,Integer.parseInt(PropuestaS.getText()),Integer.parseInt(AgnosS.getSelectedItem().toString()),wor.getEquipoPlayer().OnceInicial.get(IndexJug).ContratoJugador.AgnoContratado);
 
                if (wor.getEquipoPlayer().OfrecerContratoJuga(Eleccion,IndexJug,Propo)==true){
                    
                    VistaPlantel vivi = new VistaPlantel(wor);
                    vivi.setVisible(true);
                    this.dispose();
                    
                    
                }else if (wor.getEquipoPlayer().OfrecerContratoJuga(Eleccion,IndexJug,Propo)==false){
                    if (wor.getEquipoPlayer().OnceInicial.get(IndexJug).OfertasSobreContrato==0){
                        VistaPlantel vivi = new VistaPlantel(wor);
                    vivi.setVisible(true);
                    this.dispose();
                    }
                }
            }
            case 1 ->{
                Contrato Propo = new Contrato(wor.getEquipoPlayer().NombreEquipo,Integer.parseInt(PropuestaS.getText()),Integer.parseInt(AgnosS.getSelectedItem().toString()),wor.getEquipoPlayer().Reserva.get(IndexJug).ContratoJugador.AgnoContratado);
 
                if (wor.getEquipoPlayer().OfrecerContratoJuga(Eleccion,IndexJug,Propo)==true){
                    
                    VistaPlantel vivi = new VistaPlantel(wor);
                    vivi.setVisible(true);
                    this.dispose();
                    
                    
                }else if (wor.getEquipoPlayer().OfrecerContratoJuga(Eleccion,IndexJug,Propo)==false){
                    if (wor.getEquipoPlayer().Reserva.get(IndexJug).OfertasSobreContrato==0){
                        VistaPlantel vivi = new VistaPlantel(wor);
                    vivi.setVisible(true);
                    this.dispose();
                    }
                }
                
            }
        }
        }else{
            JOptionPane.showMessageDialog(null, 
                              "No has puesto nada en salario.", 
                              "!!!", 
                              JOptionPane.WARNING_MESSAGE);
        } 
    }//GEN-LAST:event_jButton1ActionPerformed
    
    
    Mundo wor;
    
    // 0 onceciniail 1 reserva
    int Eleccion = 3;
    
    // uindex jufg 
    int IndexJug = 999;
    
    
    public void AjustarGagrit(Futbolista x){
        NombreJug.setText(x.Nombre+" "+x.Apellido+"("+x.Posicion+")");
        Edad1.setText("Edad:"+x.Edad);
        Atac.setText(String.valueOf(x.Tiro));
        Atac1.setText(String.valueOf(x.Pase));
        Atac2.setText(String.valueOf(x.Defensa));
        Atac3.setText(String.valueOf(x.Porteria));
        Ataque4.setText("Media:"+x.Media);
        Valor.setText("Valor:$"+x.Precio);
        Ataque5.setText("Dorsal:"+x.Dorsal);
        Salary.setText("$"+x.ContratoJugador.SalarioPorTemporada);
        Rest.setText(String.valueOf(x.ContratoJugador.TemporadasContrato));
        jLabel5.setText("Año de contratación:"+x.ContratoJugador.AgnoContratado);
    }
    
    public void clearFields(){
        NombreJug.setText("");
        Edad1.setText("Edad");
        Atac.setText("0");
        Atac1.setText("0");
        Atac2.setText("0");
        Atac3.setText("0");
        Ataque4.setText("Media");
        Valor.setText("Valor");
        Ataque5.setText("Dorsal");
        Salary.setText("$");
        Rest.setText("");
        jLabel5.setText("Año de contratación");
    }
    
    public void RenderizarVista(){
        NombreEquipo.setText(wor.getEquipoPlayer().NombreEquipo);
        
        switch (Eleccion){
            case 0 ->{
                AjustarGagrit(wor.getEquipoPlayer().OnceInicial.get(IndexJug));
            }
            case 1 ->{
                AjustarGagrit(wor.getEquipoPlayer().Reserva.get(IndexJug));
            }
        }
    }
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AgnosS;
    private javax.swing.JTextField Atac;
    private javax.swing.JTextField Atac1;
    private javax.swing.JTextField Atac2;
    private javax.swing.JTextField Atac3;
    private javax.swing.JLabel Ataque;
    private javax.swing.JLabel Ataque1;
    private javax.swing.JLabel Ataque2;
    private javax.swing.JLabel Ataque3;
    private javax.swing.JLabel Ataque4;
    private javax.swing.JLabel Ataque5;
    private javax.swing.JButton Avanzar;
    private javax.swing.JLabel Edad1;
    private javax.swing.JLabel NombreEquipo;
    private javax.swing.JTextField NombreJug;
    private javax.swing.JTextField PropuestaS;
    private javax.swing.JTextField Rest;
    private javax.swing.JTextField Salary;
    private javax.swing.JLabel Valor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
