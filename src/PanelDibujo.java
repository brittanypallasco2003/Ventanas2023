import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class PanelDibujo extends JPanel {
    /*
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int anchura=getWidth();
        int altura=getHeight();

        g.drawLine(10,0,10,anchura);
        g.drawLine(10,0,200,altura);
        g.drawLine(200,altura,200,0);
    }
    */

    public void paintComponent2(Graphics name){
        super.paintComponent(name);
        int anchura=getWidth();
        int altura=getHeight();

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre =entrada.nextLine();
        name.drawString(nombre,0,0);
    }

}
