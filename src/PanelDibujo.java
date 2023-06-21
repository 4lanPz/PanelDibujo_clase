import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class PanelDibujo extends JPanel{
    public void paintComponent(Graphics g){
        Scanner input = new Scanner(System.in);
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        //origen setea punto de origen y punto de fin
        g.drawLine(0,200,100,0);
        g.drawLine(100,0,300,300);
        g.drawLine(0,100,1000,100);
        //g.drawLine(0,50,4,100);
        //esquina inferior derecha
        //g.drawLine(125,0,12,12);
        //g.drawRoundRect(0,0,50,50,30,30);
        //g.drawString("",20,20);
        double peso,altura,imc;
        String cadena;
        //IMC
        System.out.println("Ingrese el peso");
        peso = input.nextDouble();
        System.out.println("Ingrese la altura");
        altura = input.nextDouble();
        imc=peso/altura;
        cadena = String.valueOf(imc);
        g.drawString(cadena,20,20);
    }
}
