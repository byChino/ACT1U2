package U2;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class paisaje extends JFrame {

    private JPanel contentPane;

    public static void main(String[] args) throws Exception {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    paisaje frame = new paisaje();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }// fin de la clase main

    // clase JFrame
    public paisaje() {
        // JFrame o lieanzo
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setTitle("Paisaje de una amanecer");
        setSize(800, 400);
        setLocationRelativeTo(null);
        // Jpanel
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        setResizable(false);

    }// fin de la clase main

    public void paint(Graphics g) {
        super.paint(g);

        // for que dibuja lineas desde el color lila a naranja //
        int fila1 = 0;
        for (int naranja = 255, naranja1 = 0; naranja >= 0 && naranja1 <= 200; naranja--, naranja1++) {
            Color col = new Color(255, naranja1, naranja);
            g.setColor(col);
            g.drawLine(0, fila1, 800, fila1);
            fila1++;
        }

        int fila2 = 200;
        for (int black1 = 255, black2 = 200; black1 >= 0 && black2 >= 0; black1--, black2--) {
            Color col = new Color(black1, black2, 55);
            g.setColor(col);
            g.drawLine(0, fila2, 800, fila2);
            fila2++;
        }
        // Dibujo de un sol
        Graphics2D g2d = (Graphics2D) g;
        Graphics2D gc = (Graphics2D) g;
        gc.setColor(new Color(245, 251, 5)); // color amarillo
        gc.fillOval(300, 150, 200, 200);

        // Dibujo de montajas
        // Definicion de coordenas de los triangulos
        int[] Xpuntos1 = { 0, 10, 55 };
        int[] Ypuntos1 = { 255, 133, 255 };

        int[] Xpuntos2 = { 25, 88, 139 };
        int[] Ypuntos2 = { 255, 178, 255 };

        int[] Xpuntos3 = { 133, 160, 245 };
        int[] Ypuntos3 = { 255, 149, 255 };

        int[] Xpuntos4 = { 140, 251, 300 };
        int[] Ypuntos4 = { 255, 152, 255 };

        int[] Xpuntos5 = { 251, 300, 362 };
        int[] Ypuntos5 = { 255, 200, 255 };

        int[] Xpuntos6 = { 325, 441, 497 };
        int[] Ypuntos6 = { 255, 185, 255 };

        int[] Xpuntos7 = { 465, 540, 609 };
        int[] Ypuntos7 = { 255, 189, 255 };

        int[] Xpuntos8 = { 607, 680, 729 };
        int[] Ypuntos8 = { 255, 136, 255 };

        int[] Xpuntos9 = { 727, 754, 800 };
        int[] Ypuntos9 = { 255, 166, 255 };

        // Crear el objeto Polygon con las coordenadas definidas
        Polygon Triangulo1 = new Polygon(Xpuntos1, Ypuntos1, 3);
        Polygon Triangulo2 = new Polygon(Xpuntos2, Ypuntos2, 3);
        Polygon Triangulo3 = new Polygon(Xpuntos3, Ypuntos3, 3);
        Polygon Triangulo4 = new Polygon(Xpuntos4, Ypuntos4, 3);
        Polygon Triangulo5 = new Polygon(Xpuntos5, Ypuntos5, 3);
        Polygon Triangulo6 = new Polygon(Xpuntos6, Ypuntos6, 3);
        Polygon Triangulo7 = new Polygon(Xpuntos7, Ypuntos7, 3);
        Polygon Triangulo8 = new Polygon(Xpuntos8, Ypuntos8, 3);
        Polygon Triangulo9 = new Polygon(Xpuntos9, Ypuntos9, 3);

        // Dibujar el polígono utilizando fillPolygon
        g2d.setColor(new Color(25, 16, 9)); // color cafe oscuro
        g2d.fillPolygon(Triangulo1);
        g2d.fillPolygon(Triangulo2);
        g2d.fillPolygon(Triangulo3);
        g2d.fillPolygon(Triangulo4);
        g2d.fillPolygon(Triangulo5);
        g2d.fillPolygon(Triangulo6);
        g2d.fillPolygon(Triangulo7);
        g2d.fillPolygon(Triangulo8);
        g2d.fillPolygon(Triangulo9);

        // Dibujo del pasto
        Graphics2D gr = (Graphics2D) g;
        gr.setColor(new Color(0, 24, 1)); // color verde oscuro
        gr.fillRect(0, 255, 800, 200);

    }

}
