/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicScrollBarUI;

/**
 *
 * @author ambro
 */
public class Informacion extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Informacion() {
        initComponents();
        
        
         SwingUtilities.invokeLater(() -> {
            jScrollPane1.getViewport().setViewPosition(new Point(200,0)); // Ajusta (x, y)
        });
         
         // Personalizar las barras de desplazamiento
        JScrollBar verticalScrollBar = jScrollPane1.getVerticalScrollBar();
        verticalScrollBar.setUI(new Principal2.CustomScrollBarUI());

        JScrollBar horizontalScrollBar = jScrollPane1.getHorizontalScrollBar();
        horizontalScrollBar.setUI(new Principal2.CustomScrollBarUI());
       
 
       
    }
  




    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Panel1 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextArea3 = new javax.swing.JTextArea();
        jTextArea4 = new javax.swing.JTextArea();
        jTextArea5 = new javax.swing.JTextArea();

        jPanel6.setBackground(new java.awt.Color(0, 38, 79));
        jPanel6.setForeground(new java.awt.Color(0, 38, 79));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Modelo para el Futuro de Oaxaca de Juárez");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(293, 293, 293)
                .addComponent(jLabel1)
                .addContainerGap(1101, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addComponent(jLabel1)
                .addContainerGap(823, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(940, 570));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setMaximumSize(new java.awt.Dimension(940, 570));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(940, 570));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(940, 570));

        Panel1.setBackground(new java.awt.Color(255, 255, 255));
        Panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setForeground(new java.awt.Color(153, 153, 153));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Información");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BackButton.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel5)
                .addGap(330, 330, 330)
                .addComponent(jLabel4)
                .addContainerGap(393, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        Panel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 940, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fabrica.png"))); // NOI18N
        Panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 190, -1, -1));

        jTextArea3.setEditable(false);
        jTextArea3.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextArea3.setRows(5);
        jTextArea3.setText("                                                                                            VARIABLES\n\n1. Tasa de natalidad\n\tEs el porcentaje de personas que nacen en un período determinado. Se ve afectado por factores\n\tcomo la salud general de la población y el daño ambiental.\n\n2. Nacimientos\n\tEs la cantidad total de personas que nacen en un período específico.           Depende de cuántas \n\tpersonas estén sanas y de la tasa de natalidad.\n\n3. Población Sana\n\tEs el número de personas que se encuentran en buen estado de salud.          Este número se ve \n\tinfluenciado por los nacimientos, la recuperación de enfermedades y    la incidencia de nuevas \n\tenfermedades.\n\n4. Recuperación\n\tEs el proceso mediante el cual una persona mejora su estado de salud. Se relaciona con la canti-\n\tdad de personas enfermas y la efectividad de los tratamientos.\n\n5. Incidencia\n\tEs el momento en el que una persona sana se convierte en enferma. Este indicador muestra cuán-\n\ttas personas sanas contraen enfermedades en un período dado.\n\n6. Población Enfermería\n\tEs el número de personas que tienen alguna enfermedad o complicación de salud. Este grupo se \n\tdetermina por la cantidad de nuevas enfermedades, muertes y recuperaciones.\n\n7. Muertes\n\tEs la cantidad de personas que fallecen en un período determinado, ya sea por enfermedades o \n\tcausas naturales. Este dato refleja la salud general de la población enferma.\n\n8. Esperanza de vida\n\tEs el tiempo promedio que se espera que una persona viva. Se ve afectado por condiciones gene-\n\trales de salud y factores ambientales.\n\n9. Daño Ambiental para Natalidad\n\tSe refiere a los efectos negativos del entorno, como la contaminación, que pueden influir en la ca-\n\tpacidad de las personas paratener hijos.\n\n10. Discrepancia\n\tEs la diferencia entre la capacidad de un relleno sanitario y su ocupación real. Muestra cuán bien \n\tse están gestionando los desechos.\n\n11. Inadecuada Ocupación del Relleno\n\tSe refiere a la cantidad de desechos producidos que no están siendo gestionados adecuadame-\n\tte. Indica problemas en el manejo de residuos.\n\n\t\t\t\n\t\t\t          MÉTODOS\n\n•Modelado Matemático por Ecuaciones Diferenciales\n\tSe   utilizan    ecuaciones    diferenciales   para    modelar el    comportamiento    dinámico de    \n\tlas variables en el tiempo  (como nacimientos, muertes   y la evolución de la población sana y \n\tenferma).\n\n•Regresión lineal múltiple\n\tEste método estadístico permite evaluar la influencia de múltiples factores independientes (co-\n\tmo contaminación del aire y rersiduos) sobre una ariable dependiente (esperanza de vida o ta-\n\tsa de enfermedades)\n\n•Análisis de sensibilidad\n\tSe emplea   para   determinar   cómo los cambios en los parámetros (como la frecuencia de \n\trecolección de basura)   afectan   los resultados del modelo. Esto permite identificar las varia-\n\tbles más críticas para la salud pública.\n\n•Análisis de correlación\n\tSe    calcula el coeficiente     de evaluación entre     variables (por ejemplo,   entre   desechos \n\tno   recolectados   y   enfermedades respiratorias) para entender la intensidad de sus relaciones.\n");
        jTextArea3.setBorder(null);
        Panel1.add(jTextArea3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 810, 1590));

        jTextArea4.setEditable(false);
        jTextArea4.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextArea4.setRows(5);
        jTextArea4.setText("El    impacto de     los factores ambientales,   como la contaminación\ndel aire y la deficiencia de gestión de residuos, tiene efectos directos\nen la salud pública y la esperanza de vida.             Este  proyecto   de\n simulación  se enfoca en analizar cómo estas variables afectan a   los\nhabitantes de Oaxaca de   Juárez. A través de un modelo matemático, \nse   establecen   relaciones   entre la  calidad del   aire,  los   residuos \ngenerados y la incidencia de enfermedades,   proyectando    distintos \n");
        jTextArea4.setBorder(null);
        Panel1.add(jTextArea4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 490, 220));

        jTextArea5.setEditable(false);
        jTextArea5.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea5.setColumns(20);
        jTextArea5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextArea5.setRows(5);
        jTextArea5.setText("puntos críticos y proponer  mejoras en la gestión ambiental para aumentar  la  calidad  de vida y mitigar los efectos.");
        jTextArea5.setBorder(null);
        Panel1.add(jTextArea5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 810, 40));

        jScrollPane1.setViewportView(Panel1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
      this.dispose();
        Principal2 ventana2= new Principal2();
        ventana2.setVisible(true); 
    }//GEN-LAST:event_jLabel5MouseClicked

    
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
                new Informacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    // End of variables declaration//GEN-END:variables

    static class CustomScrollBarUI extends BasicScrollBarUI {
        private static final int THUMB_SIZE = 10;

        @Override
        protected void configureScrollBarColors() {
            this.thumbColor = new Color(0, 0, 0); // Color del "pulgar"
            this.trackColor = new Color(230, 230, 230); // Color de la pista
        }

        protected Dimension getThumbSize() {
            return new Dimension(THUMB_SIZE, THUMB_SIZE);
        }

        @Override
        protected JButton createDecreaseButton(int orientation) {
            return createZeroButton(); // Sin botones
        }

        @Override
        protected JButton createIncreaseButton(int orientation) {
            return createZeroButton(); // Sin botones
        }

        private JButton createZeroButton() {
            JButton button = new JButton();
            button.setPreferredSize(new Dimension(0, 0));
            button.setMinimumSize(new Dimension(0, 0));
            button.setMaximumSize(new Dimension(0, 0));
            return button;
        }
    }

}