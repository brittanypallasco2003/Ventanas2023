import javax.swing.*;

public class PruebaPanelDibujo {
    public static void main(String[] args) {
        /*
        //creo una instancia de la clase panelDibujo
        PanelDibujo panel=new PanelDibujo();
        //Creo un marco en la ventana
        JFrame aplicacion=new JFrame();
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Pongo un boton para cerrar la ventana

        aplicacion.add(panel);//agrego un panel a la ventana
        aplicacion.setSize(250,250);//TAM DE LA VENTANA, se setea
        aplicacion.setVisible(true);//permito que se vea la ventana
        */

        PanelDibujo panelname = new PanelDibujo();
        JFrame aplicacion1 =new JFrame();
        aplicacion1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion1.add(panelname);
        aplicacion1.setSize(250,250);
        aplicacion1.setVisible(true);
    }
}