import javax.swing.*;
import java.util.Scanner;

public class PruebaPanelDibujo {
    public static void main(String[] args){
        double peso,altura,imc;
        Scanner input = new Scanner(System.in);
        PanelDibujo panel=new PanelDibujo();
        JFrame aplicacion=new JFrame();
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        aplicacion.add(panel);//agrega un panel a la ventana
        aplicacion.setSize(250,250);//selecciona el tamaño
        aplicacion.setVisible(true);//
    }
}
