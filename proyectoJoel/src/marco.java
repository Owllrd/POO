
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JCVELMON
 */
public class marco extends javax.swing.JFrame {

    /**
     * Creates new form marco
     */
    static JLabel j1;
    JButton B[];
    ImageIcon img[]; 
    JPanel a, b,panel;
    JFrame c;
    static JSlider slider; 
    static JLabel label; 
  
    public marco() {
        initComponents();
        	setLayout(new BorderLayout());
    JPanel a=new JPanel(new GridLayout(4,15));
    JPanel b=new JPanel();
    JFrame c=new JFrame();
    JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 5, 2);
    B=new JButton[40];
    for(int i=0;i<40;i++)
    {
        B[i]=new JButton();
        System.out.println(""+getClass().getResource("resources/img/"+i+".jpg"));
        B[i].setIcon(new ImageIcon(getClass().getResource("resources/img/"+i+".jpg")));
        B[i].repaint();
        B[i].addActionListener((ActionListener) this);
        B[i].setBackground(Color.RED);
        a.add(B[i]);
    }
    label = new JLabel("Escala de Imagen");
    j1=new JLabel("Selecciona una Imagen"); //TEXTO A MOSTRAR
    j1.setFont(new Font("Arial",Font.ITALIC,30));  //TAMAÑO Y FUENTE
    j1.setForeground(new Color(128,128,128));   //COLOR DEL TEXTO
    b.add(j1);
    c.add(a,BorderLayout.NORTH);
    c.add(b,BorderLayout.CENTER);
    a.setBackground(Color.YELLOW);
    b.setBackground(Color.YELLOW);
    c.setSize(1000,850); 
    slider.setInverted(false);
    slider.setBounds(10,300,230,35);
    slider.setPaintTicks(true); 
    slider.setMajorTickSpacing(1); 
    slider.setMinorTickSpacing(1); 
    slider.setPaintLabels(true);
    slider.setBorder(BorderFactory.createEmptyBorder(0,0,10,0));
    slider.addChangeListener(new Mosaico.Escala()); 
    b.add(label);
    b.add(slider);  
    c.add(b);
    c.setVisible(true);
    c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    a.add(btnAnterior);
    a.add(btnSiguiente);
   
    }
    public void actionPerformed(ActionEvent e)
{
    JButton b=(JButton)e.getSource();
    String a;
    j1.setText("");
   a=""+b.getIcon(); 
    String a1[]=a.split("/");
    j1.setIcon(new ImageIcon(getClass().getResource("resources/img/"+a1[a1.length-1])));
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAnterior = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAnterior.setText("Anterior");

        btnSiguiente.setText("Siguiente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(btnAnterior)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 276, Short.MAX_VALUE)
                .addComponent(btnSiguiente)
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(323, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnterior)
                    .addComponent(btnSiguiente))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(marco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(marco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(marco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(marco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new marco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnSiguiente;
    // End of variables declaration//GEN-END:variables
}

