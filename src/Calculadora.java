import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;

public class Calculadora extends javax.swing.JFrame {
    boolean decimal = false;
    public Calculadora() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelAbajo = new Redondo();
        BorrarTodo = new javax.swing.JButton();
        Signo = new javax.swing.JButton();
        Porsentaje = new javax.swing.JButton();
        Division = new javax.swing.JButton();
        Multiplicacion = new javax.swing.JButton();
        Resta = new javax.swing.JButton();
        Suma = new javax.swing.JButton();
        N7 = new javax.swing.JButton();
        N8 = new javax.swing.JButton();
        N9 = new javax.swing.JButton();
        N4 = new javax.swing.JButton();
        N5 = new javax.swing.JButton();
        N6 = new javax.swing.JButton();
        BorrarPaso = new javax.swing.JButton();
        N0 = new javax.swing.JButton();
        Igual = new javax.swing.JButton();
        N1 = new javax.swing.JButton();
        N2 = new javax.swing.JButton();
        N3 = new javax.swing.JButton();
        Punto = new javax.swing.JButton();
        PanelArriba = new javax.swing.JPanel();
        txtResultado = new javax.swing.JLabel();
        txtOperaciones = new javax.swing.JLabel();
        Finalizar = new javax.swing.JLabel();
        Minimizar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Panel"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelAbajo.setBackground(new java.awt.Color(39, 41, 46));
        PanelAbajo.setForeground(new java.awt.Color(43, 48, 54));
        PanelAbajo.setAlignmentX(0.0F);
        PanelAbajo.setAlignmentY(0.0F);
        PanelAbajo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BorrarTodo.setBackground(new java.awt.Color(39, 41, 46));
        BorrarTodo.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        BorrarTodo.setForeground(new java.awt.Color(18, 245, 217));
        BorrarTodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ap/Boton.jpg"))); // NOI18N
        BorrarTodo.setText("AC");
        BorrarTodo.setAlignmentY(0.0F);
        BorrarTodo.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        BorrarTodo.setFocusPainted(false);
        BorrarTodo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BorrarTodo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Ap/BotonP.jpg"))); // NOI18N
        BorrarTodo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Ap/Boton.jpg"))); // NOI18N
        BorrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarTodoActionPerformed(evt);
            }
        });
        PanelAbajo.add(BorrarTodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 60, 60));

        Signo.setBackground(new java.awt.Color(39, 41, 46));
        Signo.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        Signo.setForeground(new java.awt.Color(18, 245, 217));
        Signo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ap/Boton.jpg"))); // NOI18N
        Signo.setText("+/–");
        Signo.setAlignmentY(0.0F);
        Signo.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Signo.setFocusPainted(false);
        Signo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Signo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Ap/BotonP.jpg"))); // NOI18N
        Signo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Ap/Boton.jpg"))); // NOI18N
        Signo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignoActionPerformed(evt);
            }
        });
        PanelAbajo.add(Signo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 60, 60));

        Porsentaje.setBackground(new java.awt.Color(39, 41, 46));
        Porsentaje.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        Porsentaje.setForeground(new java.awt.Color(18, 245, 217));
        Porsentaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ap/Boton.jpg"))); // NOI18N
        Porsentaje.setText("%");
        Porsentaje.setAlignmentY(0.0F);
        Porsentaje.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Porsentaje.setFocusPainted(false);
        Porsentaje.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Porsentaje.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Ap/BotonP.jpg"))); // NOI18N
        Porsentaje.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Ap/Boton.jpg"))); // NOI18N
        Porsentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PorsentajeActionPerformed(evt);
            }
        });
        PanelAbajo.add(Porsentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 60, 60));

        Division.setBackground(new java.awt.Color(39, 41, 46));
        Division.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        Division.setForeground(new java.awt.Color(195, 66, 65));
        Division.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ap/Boton.jpg"))); // NOI18N
        Division.setText("÷");
        Division.setAlignmentY(0.0F);
        Division.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Division.setFocusPainted(false);
        Division.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Division.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Ap/BotonP.jpg"))); // NOI18N
        Division.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Ap/Boton.jpg"))); // NOI18N
        Division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivisionActionPerformed(evt);
            }
        });
        PanelAbajo.add(Division, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 60, 60));

        Multiplicacion.setBackground(new java.awt.Color(39, 41, 46));
        Multiplicacion.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        Multiplicacion.setForeground(new java.awt.Color(195, 66, 65));
        Multiplicacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ap/Boton.jpg"))); // NOI18N
        Multiplicacion.setText("×");
        Multiplicacion.setAlignmentY(0.0F);
        Multiplicacion.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Multiplicacion.setFocusPainted(false);
        Multiplicacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Multiplicacion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Ap/BotonP.jpg"))); // NOI18N
        Multiplicacion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Ap/Boton.jpg"))); // NOI18N
        Multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultiplicacionActionPerformed(evt);
            }
        });
        PanelAbajo.add(Multiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 98, 60, 60));

        Resta.setBackground(new java.awt.Color(39, 41, 46));
        Resta.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        Resta.setForeground(new java.awt.Color(195, 66, 65));
        Resta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ap/Boton.jpg"))); // NOI18N
        Resta.setText("–");
        Resta.setToolTipText("");
        Resta.setAlignmentY(0.0F);
        Resta.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Resta.setFocusPainted(false);
        Resta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Resta.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Ap/BotonP.jpg"))); // NOI18N
        Resta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Ap/Boton.jpg"))); // NOI18N
        Resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestaActionPerformed(evt);
            }
        });
        PanelAbajo.add(Resta, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 172, 60, 60));

        Suma.setBackground(new java.awt.Color(39, 41, 46));
        Suma.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        Suma.setForeground(new java.awt.Color(195, 66, 65));
        Suma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ap/Boton.jpg"))); // NOI18N
        Suma.setText("+");
        Suma.setToolTipText("");
        Suma.setAlignmentY(0.0F);
        Suma.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Suma.setFocusPainted(false);
        Suma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Suma.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Ap/BotonP.jpg"))); // NOI18N
        Suma.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Ap/Boton.jpg"))); // NOI18N
        Suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SumaActionPerformed(evt);
            }
        });
        PanelAbajo.add(Suma, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 247, 60, 60));

        N7.setBackground(new java.awt.Color(39, 41, 46));
        N7.setFont(new java.awt.Font("Yu Gothic UI", 0, 23)); // NOI18N
        N7.setForeground(new java.awt.Color(255, 255, 255));
        N7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ap/Boton.jpg"))); // NOI18N
        N7.setText("7");
        N7.setAlignmentY(0.0F);
        N7.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        N7.setFocusPainted(false);
        N7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        N7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Ap/BotonP.jpg"))); // NOI18N
        N7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Ap/Boton.jpg"))); // NOI18N
        N7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N7ActionPerformed(evt);
            }
        });
        PanelAbajo.add(N7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 98, 60, 60));

        N8.setBackground(new java.awt.Color(39, 41, 46));
        N8.setFont(new java.awt.Font("Yu Gothic UI", 0, 23)); // NOI18N
        N8.setForeground(new java.awt.Color(255, 255, 255));
        N8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ap/Boton.jpg"))); // NOI18N
        N8.setText("8");
        N8.setAlignmentY(0.0F);
        N8.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        N8.setFocusPainted(false);
        N8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        N8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Ap/BotonP.jpg"))); // NOI18N
        N8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Ap/Boton.jpg"))); // NOI18N
        N8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N8ActionPerformed(evt);
            }
        });
        PanelAbajo.add(N8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 98, 60, 60));

        N9.setBackground(new java.awt.Color(39, 41, 46));
        N9.setFont(new java.awt.Font("Yu Gothic UI", 0, 23)); // NOI18N
        N9.setForeground(new java.awt.Color(255, 255, 255));
        N9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ap/Boton.jpg"))); // NOI18N
        N9.setText("9");
        N9.setAlignmentY(0.0F);
        N9.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        N9.setFocusPainted(false);
        N9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        N9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Ap/BotonP.jpg"))); // NOI18N
        N9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Ap/Boton.jpg"))); // NOI18N
        N9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N9ActionPerformed(evt);
            }
        });
        PanelAbajo.add(N9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 98, 60, 60));

        N4.setBackground(new java.awt.Color(39, 41, 46));
        N4.setFont(new java.awt.Font("Yu Gothic UI", 0, 23)); // NOI18N
        N4.setForeground(new java.awt.Color(255, 255, 255));
        N4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ap/Boton.jpg"))); // NOI18N
        N4.setText("4");
        N4.setAlignmentY(0.0F);
        N4.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        N4.setFocusPainted(false);
        N4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        N4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Ap/BotonP.jpg"))); // NOI18N
        N4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Ap/Boton.jpg"))); // NOI18N
        N4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N4ActionPerformed(evt);
            }
        });
        PanelAbajo.add(N4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 172, 60, 60));

        N5.setBackground(new java.awt.Color(39, 41, 46));
        N5.setFont(new java.awt.Font("Yu Gothic UI", 0, 23)); // NOI18N
        N5.setForeground(new java.awt.Color(255, 255, 255));
        N5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ap/Boton.jpg"))); // NOI18N
        N5.setText("5");
        N5.setAlignmentY(0.0F);
        N5.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        N5.setFocusPainted(false);
        N5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        N5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Ap/BotonP.jpg"))); // NOI18N
        N5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Ap/Boton.jpg"))); // NOI18N
        N5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N5ActionPerformed(evt);
            }
        });
        PanelAbajo.add(N5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 172, 60, 60));

        N6.setBackground(new java.awt.Color(39, 41, 46));
        N6.setFont(new java.awt.Font("Yu Gothic UI", 0, 23)); // NOI18N
        N6.setForeground(new java.awt.Color(255, 255, 255));
        N6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ap/Boton.jpg"))); // NOI18N
        N6.setText("6");
        N6.setAlignmentY(0.0F);
        N6.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        N6.setFocusPainted(false);
        N6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        N6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Ap/BotonP.jpg"))); // NOI18N
        N6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Ap/Boton.jpg"))); // NOI18N
        N6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N6ActionPerformed(evt);
            }
        });
        PanelAbajo.add(N6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 172, 60, 60));

        BorrarPaso.setBackground(new java.awt.Color(39, 41, 46));
        BorrarPaso.setFont(new java.awt.Font("Serif", 1, 28)); // NOI18N
        BorrarPaso.setForeground(new java.awt.Color(255, 255, 255));
        BorrarPaso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ap/Boton.jpg"))); // NOI18N
        BorrarPaso.setText("↺");
        BorrarPaso.setAlignmentY(0.0F);
        BorrarPaso.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        BorrarPaso.setFocusPainted(false);
        BorrarPaso.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BorrarPaso.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Ap/BotonP.jpg"))); // NOI18N
        BorrarPaso.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Ap/Boton.jpg"))); // NOI18N
        BorrarPaso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarPasoActionPerformed(evt);
            }
        });
        PanelAbajo.add(BorrarPaso, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 60, 60));

        N0.setBackground(new java.awt.Color(39, 41, 46));
        N0.setFont(new java.awt.Font("Yu Gothic UI", 0, 23)); // NOI18N
        N0.setForeground(new java.awt.Color(255, 255, 255));
        N0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ap/Boton.jpg"))); // NOI18N
        N0.setText("0");
        N0.setAlignmentY(0.0F);
        N0.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        N0.setFocusPainted(false);
        N0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        N0.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Ap/BotonP.jpg"))); // NOI18N
        N0.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Ap/Boton.jpg"))); // NOI18N
        N0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N0ActionPerformed(evt);
            }
        });
        PanelAbajo.add(N0, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 60, 60));

        Igual.setBackground(new java.awt.Color(39, 41, 46));
        Igual.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        Igual.setForeground(new java.awt.Color(195, 66, 65));
        Igual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ap/Boton.jpg"))); // NOI18N
        Igual.setText("=");
        Igual.setAlignmentY(0.0F);
        Igual.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Igual.setFocusPainted(false);
        Igual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Igual.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Ap/BotonP.jpg"))); // NOI18N
        Igual.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Ap/Boton.jpg"))); // NOI18N
        Igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IgualActionPerformed(evt);
            }
        });
        PanelAbajo.add(Igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 60, 60));

        N1.setBackground(new java.awt.Color(39, 41, 46));
        N1.setFont(new java.awt.Font("Yu Gothic UI", 0, 23)); // NOI18N
        N1.setForeground(new java.awt.Color(255, 255, 255));
        N1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ap/Boton.jpg"))); // NOI18N
        N1.setText("1");
        N1.setToolTipText("");
        N1.setAlignmentY(0.0F);
        N1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        N1.setFocusPainted(false);
        N1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        N1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Ap/BotonP.jpg"))); // NOI18N
        N1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Ap/Boton.jpg"))); // NOI18N
        N1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N1ActionPerformed(evt);
            }
        });
        PanelAbajo.add(N1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 247, 60, 60));

        N2.setBackground(new java.awt.Color(39, 41, 46));
        N2.setFont(new java.awt.Font("Yu Gothic UI", 0, 23)); // NOI18N
        N2.setForeground(new java.awt.Color(255, 255, 255));
        N2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ap/Boton.jpg"))); // NOI18N
        N2.setText("2");
        N2.setAlignmentY(0.0F);
        N2.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        N2.setFocusPainted(false);
        N2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        N2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Ap/BotonP.jpg"))); // NOI18N
        N2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Ap/Boton.jpg"))); // NOI18N
        N2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N2ActionPerformed(evt);
            }
        });
        PanelAbajo.add(N2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 247, 60, 60));

        N3.setBackground(new java.awt.Color(39, 41, 46));
        N3.setFont(new java.awt.Font("Yu Gothic UI", 0, 23)); // NOI18N
        N3.setForeground(new java.awt.Color(255, 255, 255));
        N3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ap/Boton.jpg"))); // NOI18N
        N3.setText("3");
        N3.setAlignmentY(0.0F);
        N3.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        N3.setFocusPainted(false);
        N3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        N3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Ap/BotonP.jpg"))); // NOI18N
        N3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Ap/Boton.jpg"))); // NOI18N
        N3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N3ActionPerformed(evt);
            }
        });
        PanelAbajo.add(N3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 247, 60, 60));

        Punto.setBackground(new java.awt.Color(39, 41, 46));
        Punto.setFont(new java.awt.Font("Tw Cen MT", 0, 30)); // NOI18N
        Punto.setForeground(new java.awt.Color(255, 255, 255));
        Punto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ap/Boton.jpg"))); // NOI18N
        Punto.setText(".");
        Punto.setAlignmentY(0.0F);
        Punto.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Punto.setFocusPainted(false);
        Punto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Punto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Ap/BotonP.jpg"))); // NOI18N
        Punto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Ap/Boton.jpg"))); // NOI18N
        Punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PuntoActionPerformed(evt);
            }
        });
        PanelAbajo.add(Punto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 60, 60));

        getContentPane().add(PanelAbajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 340, 410));

        PanelArriba.setBackground(new java.awt.Color(33, 35, 39));
        PanelArriba.setForeground(new java.awt.Color(23, 23, 28));
        PanelArriba.setAlignmentX(0.0F);
        PanelArriba.setAlignmentY(0.0F);
        PanelArriba.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtResultado.setBackground(new java.awt.Color(255, 255, 255));
        txtResultado.setFont(new java.awt.Font("Yu Gothic UI", 0, 42)); // NOI18N
        txtResultado.setForeground(new java.awt.Color(255, 255, 255));
        txtResultado.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        txtResultado.setAlignmentY(0.0F);
        txtResultado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PanelArriba.add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 310, 40));

        txtOperaciones.setBackground(new java.awt.Color(255, 255, 254));
        txtOperaciones.setFont(new java.awt.Font("Yu Gothic UI", 0, 17)); // NOI18N
        txtOperaciones.setForeground(new java.awt.Color(255, 255, 254));
        txtOperaciones.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        txtOperaciones.setAlignmentY(0.0F);
        txtOperaciones.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PanelArriba.add(txtOperaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 310, 30));

        Finalizar.setBackground(new java.awt.Color(255, 255, 255));
        Finalizar.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 50)); // NOI18N
        Finalizar.setForeground(new java.awt.Color(255, 0, 0));
        Finalizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Finalizar.setText("•");
        Finalizar.setAlignmentY(9.0F);
        Finalizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Finalizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FinalizarMouseClicked(evt);
            }
        });
        PanelArriba.add(Finalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 3, -1, 20));

        Minimizar.setBackground(new java.awt.Color(255, 255, 255));
        Minimizar.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 48)); // NOI18N
        Minimizar.setForeground(new java.awt.Color(255, 255, 0));
        Minimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Minimizar.setText("•");
        Minimizar.setAlignmentY(0.0F);
        Minimizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizarMouseClicked(evt);
            }
        });
        PanelArriba.add(Minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 3, -1, 20));

        getContentPane().add(PanelArriba, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BorrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarTodoActionPerformed
        txtOperaciones.setText(" ");
        txtResultado.setText(" ");
        decimal = false;
    }//GEN-LAST:event_BorrarTodoActionPerformed

    private void SignoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignoActionPerformed
        double signo = Double.parseDouble(String.valueOf(txtOperaciones.getText()));
        signo = signo * ( -1);
        txtOperaciones.setText(String.valueOf((int)signo));
    }//GEN-LAST:event_SignoActionPerformed

    private void PorsentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PorsentajeActionPerformed
        MostrarNumero("%");
    }//GEN-LAST:event_PorsentajeActionPerformed

    private void DivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DivisionActionPerformed
        MostrarNumero("/");
    }//GEN-LAST:event_DivisionActionPerformed

    private void MultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultiplicacionActionPerformed
        MostrarNumero("*");
    }//GEN-LAST:event_MultiplicacionActionPerformed

    private void RestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestaActionPerformed
        MostrarNumero("-");
    }//GEN-LAST:event_RestaActionPerformed

    private void SumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SumaActionPerformed
        MostrarNumero("+");
    }//GEN-LAST:event_SumaActionPerformed

    private void N7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N7ActionPerformed
        MostrarNumero("7");
    }//GEN-LAST:event_N7ActionPerformed

    private void N8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N8ActionPerformed
        MostrarNumero("8");
    }//GEN-LAST:event_N8ActionPerformed

    private void N9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N9ActionPerformed
        MostrarNumero("9");
    }//GEN-LAST:event_N9ActionPerformed

    private void N4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N4ActionPerformed
        MostrarNumero("4");
    }//GEN-LAST:event_N4ActionPerformed

    private void N5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N5ActionPerformed
        MostrarNumero("5");
    }//GEN-LAST:event_N5ActionPerformed

    private void N6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N6ActionPerformed
        MostrarNumero("6");
    }//GEN-LAST:event_N6ActionPerformed

    private void BorrarPasoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarPasoActionPerformed
        String borra;
        if (txtOperaciones.getText().length() > 0);
        {
            StringBuilder paso = new StringBuilder(txtOperaciones.getText());
            paso.deleteCharAt(txtOperaciones.getText().length() - 1);
            borra = paso.toString();
            txtOperaciones.setText(borra);
            txtResultado.setText("  ");
        }
    }//GEN-LAST:event_BorrarPasoActionPerformed

    private void N0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N0ActionPerformed
        MostrarNumero("0");
    }//GEN-LAST:event_N0ActionPerformed

    private void IgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IgualActionPerformed
        try {
            String respuesta = txtOperaciones.getText().trim();
            String[] an = respuesta.split(" ");
            
            List<Double> bn = new ArrayList<>();
            List<String> cn = new ArrayList<>();
            for (int i = 0; i < an.length; i = i + 1) {
                if (i % 2 == 0) {
                    if (an[i].contains("%")) {
                        String porcentaje = an[i].replace("%", "");
                        double valor = Double.parseDouble(porcentaje) / 100;
                        bn.add(valor);
                    } else {
                        double valor2 = Double.parseDouble(an[i]);
                        bn.add(valor2);
                    }
                } else {
                    cn.add(an[i]);
                }
            }
            for (int i = 0; i < cn.size(); i = i + 1) {
                if (cn.get(i).equals("*") || cn.get(i).equals("/")) {
                    double valor3;
                    if (cn.get(i).equals("*")) {
                        valor3 = bn.get(i) * bn.get(i + 1);
                    } else {
                        if (bn.get(i + 1) == 0) {
                            txtResultado.setText("Syntax error");
                            return;
                        }
                        valor3 = bn.get(i) / bn.get(i + 1);
                    }
                    bn.set(i, valor3);
                    bn.remove(i + 1);
                    cn.remove(i);
                    i = i - 1;
                }
            }
            double valor4 = bn.get(0);
            for (int i = 0; i < cn.size(); i = i + 1) {
                if (cn.get(i).equals("+")) {
                    valor4 = valor4 + bn.get(i + 1);
                } else if (cn.get(i).equals("-")) {
                    valor4 = valor4 - bn.get(i + 1);
                }
            }
            if (valor4 % 1 == 0) {
                txtResultado.setText(String.valueOf((int) valor4));
            } else {
                txtResultado.setText(String.valueOf(valor4));
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_IgualActionPerformed

    private void N1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N1ActionPerformed
        MostrarNumero("1");
    }//GEN-LAST:event_N1ActionPerformed

    private void N2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N2ActionPerformed
        MostrarNumero("2");
    }//GEN-LAST:event_N2ActionPerformed

    private void N3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N3ActionPerformed
        MostrarNumero("3");
    }//GEN-LAST:event_N3ActionPerformed

    private void PuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PuntoActionPerformed
        MostrarNumero(".");
    }//GEN-LAST:event_PuntoActionPerformed

    private void MinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarMouseClicked
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_MinimizarMouseClicked

    private void FinalizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FinalizarMouseClicked
        this.dispose();
    }//GEN-LAST:event_FinalizarMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Calculadora().setVisible(true);
        });
    }
    
    public void MostrarNumero(String digito){
        if (digito.equals("+")) {
            txtOperaciones.setText(txtOperaciones.getText() + " + ");
            decimal = false;
        } else if (digito.equals("-")) {
            txtOperaciones.setText(txtOperaciones.getText() + " - ");
            decimal = false;
        } else if (digito.equals("*")) {
            txtOperaciones.setText(txtOperaciones.getText() + " * ");
            decimal = false;
        } else if (digito.equals("/")) {
            txtOperaciones.setText(txtOperaciones.getText() + " / ");
            decimal = false;
        } else if (digito.equals(".")) {
            if (decimal == false) {
                txtOperaciones.setText(txtOperaciones.getText() + digito);
                decimal = true;
            }
        } else {
            txtOperaciones.setText(txtOperaciones.getText() + digito);
        }

    }
    
    public class Redondo extends JPanel {
        private final int cornerRadius = 60;
        public Redondo() {
            setOpaque(false);
        }
        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D rendo = (Graphics2D) g;
            rendo.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            rendo.setColor(getBackground());
            rendo.fill(new RoundRectangle2D.Float(0, 0, getWidth(), getHeight(), cornerRadius, cornerRadius));
            rendo.fillRect(0, cornerRadius, getWidth(), getHeight() - cornerRadius);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BorrarPaso;
    private javax.swing.JButton BorrarTodo;
    private javax.swing.JButton Division;
    private javax.swing.JLabel Finalizar;
    private javax.swing.JButton Igual;
    private javax.swing.JLabel Minimizar;
    private javax.swing.JButton Multiplicacion;
    private javax.swing.JButton N0;
    private javax.swing.JButton N1;
    private javax.swing.JButton N2;
    private javax.swing.JButton N3;
    private javax.swing.JButton N4;
    private javax.swing.JButton N5;
    private javax.swing.JButton N6;
    private javax.swing.JButton N7;
    private javax.swing.JButton N8;
    private javax.swing.JButton N9;
    private javax.swing.JPanel PanelAbajo;
    private javax.swing.JPanel PanelArriba;
    private javax.swing.JButton Porsentaje;
    private javax.swing.JButton Punto;
    private javax.swing.JButton Resta;
    private javax.swing.JButton Signo;
    private javax.swing.JButton Suma;
    private javax.swing.JLabel txtOperaciones;
    private javax.swing.JLabel txtResultado;
    // End of variables declaration//GEN-END:variables
}
