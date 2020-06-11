package com.company;
import javax.swing.*;


public class QuadraticEquations {
    public static void main(String[] args) {
        float a,b,c;
        double d,x1,x2;
        JFrame frame = new JFrame();
        String A = JOptionPane.showInputDialog("Ввведите a");
        a = Float.parseFloat(A);
        String B = JOptionPane.showInputDialog("Ввведите b");
        b = Float.parseFloat(B);
        String C = JOptionPane.showInputDialog("Ввведите c");
        c = Float.parseFloat(C);
        if(c == 0){
            x1 = 0;
            x2 = -b/2;
            System.out.println("Первый корень ="+ x1 + ","+ "Второй корень="  + x2);

        }
        d = (b * b) - 4 * a * c;

        String diskr = "Дискриминант = " + String.format("%.1f", d);
        JOptionPane.showMessageDialog(frame, diskr);

        if(d <0){
            System.out.println("Дискриминант < 0 , уравнение корней не имеет");

        }else {
            if (d == 0){
                x1=x2=-b/2*a;
                System.out.println("Корни уравнения равны между собой и ="+x1);

            }
            x1=(-b+Math.sqrt(d))/2*a;
            x2=(-b-Math.sqrt(d))/2*a;
            System.out.println("Первый корень ="+x1+" Второй корень =" + x2);

        }
    }

}
