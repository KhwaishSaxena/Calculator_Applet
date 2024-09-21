import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class calculatorFrame extends JFrame implements ActionListener {
    int c, n;
    String s1, s2, s3, s4, s5;
    JTextField tDis;
    JButton  b1, b2, b3, b4, b5, b6, b7, b8, b9, bt0 ,btSum ,btSub ,btMul ,btDiv ,btClr ,btEql;
    JPanel Btn , pDis;
    GridLayout g;

    calculatorFrame() {

        Color bc = new Color(81, 96, 96);
        getContentPane().setBackground(bc);
        setLayout(new FlowLayout());

        Btn = new JPanel();


        b1 = new JButton("1");
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.BLACK);
        b1.addActionListener(this);

        b2 = new JButton("2");
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.BLACK);
        b2.addActionListener(this);

        b3 = new JButton("3");
        b3.setForeground(Color.WHITE);
        b3.setBackground(Color.BLACK);
        b3.addActionListener(this);

        b4 = new JButton("4");
        b4.setForeground(Color.WHITE);
        b4.setBackground(Color.BLACK);
        b4.addActionListener(this);

        b5 = new JButton("5");
        b5.setForeground(Color.WHITE);
        b5.setBackground(Color.BLACK);
        b5.addActionListener(this);

        b6 = new JButton("6");
        b6.setForeground(Color.WHITE);
        b6.setBackground(Color.BLACK);
        b6.addActionListener(this);

        b7 = new JButton("7");
        b7.setForeground(Color.WHITE);
        b7.setBackground(Color.BLACK);
        b7.addActionListener(this);

        b8 = new JButton("8");
        b8.setForeground(Color.WHITE);
        b8.setBackground(Color.BLACK);
        b8.addActionListener(this);

        b9 = new JButton("9");
        b9.setForeground(Color.WHITE);
        b9.setBackground(Color.BLACK);
        b9.addActionListener(this);

        bt0 = new JButton("0");
        bt0.setForeground(Color.WHITE);
        bt0.setBackground(Color.BLACK);
        bt0.addActionListener(this);

        Color color = new Color(5, 134, 134);

        btSum = new JButton("+");
        btSum.setBackground(color);
        btSum.setForeground(Color.WHITE);
        btSum.addActionListener(this);

        btSub = new JButton("-");
        btSub.setBackground(color);
        btSub.setForeground(Color.WHITE);
        btSub.addActionListener(this);


        btDiv = new JButton("÷");
        btDiv.setBackground(color);
        btDiv.setForeground(Color.WHITE);
        btDiv.addActionListener(this);

        btMul = new JButton("x");
        btMul.setBackground(color);
        btMul.setForeground(Color.WHITE);
        btMul.addActionListener(this);

        btEql = new JButton("=");
        btEql.setBackground(Color.BLUE);
        btEql.setForeground(Color.WHITE);
        btEql.addActionListener(this);

        btClr = new JButton("AC");
        btClr.setBackground(Color.RED);
        btClr.setForeground(Color.WHITE);
        btClr.addActionListener(this);


        pDis = new JPanel();
        pDis.setSize(20,60);
        tDis = new JTextField(25);
        tDis.setSize(20,60);
        pDis.add(tDis);
        add(pDis);
        g = new GridLayout(4,4,12,12);
        Btn.setLayout(g);
        Btn.setPreferredSize(new Dimension(14*20,12*20));
        Btn.setBackground(bc);


        Btn.add(b1);
        Btn.add(b2);
        Btn.add(b3);
        Btn.add(btSum);

        Btn.add(b4);
        Btn.add(b5);
        Btn.add(b6);
        Btn.add(btSub);

        Btn.add(b7);
        Btn.add(b8);
        Btn.add(b9);
        Btn.add(btDiv);

        Btn.add(bt0);
        Btn.add(btEql);
        Btn.add(btClr);
        Btn.add(btMul);

        add(Btn);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bt0) {
           s3 = tDis.getText();
            s4 = "0";
           s5 = s3 + s4;
            tDis.setText(s5);
        }
        if (e.getSource() == b1) {
            s3 = tDis.getText();
            s4 = "1";
            s5 = s3 + s4;
            tDis.setText(s5);
        }
        if (e.getSource() == b2) {
            s3 = tDis.getText();
            s4 = "2";
            s5 = s3 + s4;
            tDis.setText(s5);
        }
        if (e.getSource() == b3) {
            s3 = tDis.getText();
            s4 = "3";
            s5 = s3 + s4;
            tDis.setText(s5);
        }
        if (e.getSource() == b4) {
            s3 = tDis.getText();
            s4 = "4";
            s5 = s3 + s4;
            tDis.setText(s5);
        }
        if (e.getSource() == b5) {
            s3 = tDis.getText();
            s4 = "5";
            s5 = s3 + s4;
            tDis.setText(s5);
        }
        if (e.getSource() == b6) {
            s3 = tDis.getText();
            s4 = "6";
            s5 = s3 + s4;
            tDis.setText(s5);
        }
        if (e.getSource() == b7) {
            s3 = tDis.getText();
            s4 = "7";
            s5 = s3 + s4;
            tDis.setText(s5);
        }
        if (e.getSource() == b8) {
            s3 = tDis.getText();
            s4 = "8";
            s5 = s3 + s4;
            tDis.setText(s5);
        }
        if (e.getSource() == b9)
        {
            s3 = tDis.getText();
            s4 = "9";
            s5 = s3 + s4;
            tDis.setText(s5);
        }
        if (e.getSource() == btSum) {
            s1 = tDis.getText();
            tDis.setText("");
            c = 1;
        }
        if (e.getSource() == btSub) {
            s1 = tDis.getText();
            tDis.setText("");
            c = 2;
        }
        if (e.getSource() == btMul) {
            s1 = tDis.getText();
            tDis.setText("");
            c = 3;
        }
        if (e.getSource() == btDiv) {
            s1 = tDis.getText();
            tDis.setText("");
            c = 4;
        }
        if (e.getSource() == btEql) {
            s2 = tDis.getText();
            if (c == 1) {
                n = Integer.parseInt(s1) + Integer.parseInt(s2);
                tDis.setText(String.valueOf(n));
            }
            if (c == 2) {
                n = Integer.parseInt(s1) - Integer.parseInt(s2);
                tDis.setText(String.valueOf(n));
            }
            if (c == 3) {
                n = Integer.parseInt(s1) * Integer.parseInt(s2);
                tDis.setText(String.valueOf(n));
            }
            if (c == 4) {
                n = Integer.parseInt(s1) / Integer.parseInt(s2);
                tDis.setText(String.valueOf(n));
            }
        }
        if (e.getSource() == btClr) {
            tDis.setText("");
        }
    }
}
public class projectCalc {
    public static void main(String[] args) {
       calculatorFrame fr = new calculatorFrame();
        fr.setTitle("Calculator");
        fr.setSize(330, 330);
        fr.setVisible(true);
       fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}