import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class Triangle {

    private JFrame frame;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JLabel lblPleaseEnterThree;
    private JLabel label;
    private JLabel lblResult;


    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Triangle window = new Triangle();
                    window.frame.setVisible(true);
                    window.frame.setResizable(false);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Triangle() {
        initialize();
    }

    /**
     * The method to calculate the area of a given triangle
     * */
    public String calculate(Integer one, Integer two, Integer three){
        if (one<0||two<0||three<0){
            return "Not a Valid Triangle";
        }
        if (one==0||two==0||three==0){
            return "Not a Valid Triangle";
        }
        if((one+two>three)&&(two+three>one)&&(one+three>two)){
            if(one==two&&three==one){
                Integer sides_total=(one+two+three);
                Double half_total=0.5*sides_total;
                Double area_no_sqrt=(half_total*((half_total-one)*(half_total-two)*(half_total-three)));
                Double area=Math.sqrt(area_no_sqrt);
                DecimalFormat df = new DecimalFormat();
                df.setMaximumFractionDigits(2);
                return "Equilateral Tri With Area: "+df.format(area);

            }
            else if((one==two&&one!=three)||(two==three&&two!=one)||(one==three&&one!=two)){
                Integer sides_total=(one+two+three);
                Double half_total=0.5*sides_total;
                Double area_no_sqrt=(half_total*((half_total-one)*(half_total-two)*(half_total-three)));
                Double area=Math.sqrt(area_no_sqrt);
                DecimalFormat df = new DecimalFormat();
                df.setMaximumFractionDigits(2);
                return "Isosceles Tri With Area: "+df.format(area);
            }
            else{
                Integer sides_total=(one+two+three);
                Double half_total=0.5*sides_total;
                Double area_no_sqrt=(half_total*((half_total-one)*(half_total-two)*(half_total-three)));
                Double area=Math.sqrt(area_no_sqrt);
                DecimalFormat df = new DecimalFormat();
                df.setMaximumFractionDigits(2);
                return "Scalene Tri With Area: "+df.format(area);
            }
        }
        else
            return "Not a Valid Triangle";

    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(UIManager.getColor("Desktop.background"));
        frame.getContentPane().setForeground(Color.DARK_GRAY);
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblExerciseProblem = new JLabel("Triangle Calculation");
        lblExerciseProblem.setBackground(Color.LIGHT_GRAY);
        lblExerciseProblem.setFont(new Font("Malayalam MN", Font.BOLD | Font.ITALIC, 25));
        lblExerciseProblem.setHorizontalAlignment(SwingConstants.CENTER);
        lblExerciseProblem.setBounds(55, 28, 352, 49);
        frame.getContentPane().add(lblExerciseProblem);

        JLabel lblEnter = new JLabel("Enter Triangle Sides");
        lblEnter.setHorizontalAlignment(SwingConstants.CENTER);
        lblEnter.setBounds(142, 76, 176, 16);
        frame.getContentPane().add(lblEnter);

        textField_1 = new JTextField();
        textField_1.setBounds(6, 134, 134, 28);
        frame.getContentPane().add(textField_1);
        textField_1.setColumns(10);

        textField_2 = new JTextField();
        textField_2.setBounds(152, 134, 134, 28);
        frame.getContentPane().add(textField_2);
        textField_2.setColumns(10);

        textField_3 = new JTextField();
        textField_3.setBounds(298, 134, 134, 28);
        frame.getContentPane().add(textField_3);
        textField_3.setColumns(10);

        JLabel lblSideOne = new JLabel("Side One");
        lblSideOne.setHorizontalAlignment(SwingConstants.CENTER);
        lblSideOne.setBounds(38, 161, 61, 16);
        frame.getContentPane().add(lblSideOne);

        JLabel lblSideTwo = new JLabel("Side Two");
        lblSideTwo.setHorizontalAlignment(SwingConstants.CENTER);
        lblSideTwo.setBounds(187, 161, 61, 16);
        frame.getContentPane().add(lblSideTwo);

        JLabel lblSideThree = new JLabel("Side Three");
        lblSideThree.setHorizontalAlignment(SwingConstants.CENTER);
        lblSideThree.setBounds(329, 161, 78, 16);
        frame.getContentPane().add(lblSideThree);

        JButton btnCalculate = new JButton("Calculate");
        btnCalculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(textField_1.getText().equals("")){
                    textField_1.setText("0");
                }
                if(textField_2.getText().equals("")){
                    textField_2.setText("0");
                }
                if(textField_3.getText().equals("")){
                    textField_3.setText("0");
                }
                try {
                    Integer side_one=Integer.parseInt(textField_1.getText());
                    Integer side_two=Integer.parseInt(textField_2.getText());
                    Integer side_three=Integer.parseInt(textField_3.getText());
                    String result = calculate(side_one,side_two,side_three);
                    lblResult.setText(result);
                    label.setVisible(false);
                    if (side_one==0||side_two==0||side_three==0){
                        lblPleaseEnterThree.setVisible(true);
                    }
                    else{
                        lblPleaseEnterThree.setVisible(false);
                    }
                    lblResult.setVisible(true);
                }
                catch (Exception q) {
                    lblResult.setVisible(false);
                    label.setText(("Exception: " + q.getMessage()));
                    label.setVisible(true);
                }

            }
        });
        btnCalculate.setBounds(162, 206, 86, 29);
        frame.getContentPane().add(btnCalculate);

        JButton btnExit = new JButton("Exit");
        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btnExit.setBounds(315, 243, 117, 29);
        frame.getContentPane().add(btnExit);

        JButton btnClear = new JButton("Clear");
        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField_1.setText("");
                textField_2.setText("");
                textField_3.setText("");
                lblPleaseEnterThree.setVisible(false);
                label.setVisible(false);
                lblResult.setVisible(false);
            }
        });
        btnClear.setBounds(6, 243, 117, 29);
        frame.getContentPane().add(btnClear);

        lblPleaseEnterThree = new JLabel("Please Enter Three Non-Zero Integers");
        lblPleaseEnterThree.setForeground(UIManager.getColor("InternalFrame.borderShadow"));
        lblPleaseEnterThree.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 13));
        lblPleaseEnterThree.setHorizontalAlignment(SwingConstants.CENTER);
        lblPleaseEnterThree.setBounds(74, 231, 315, 16);
        frame.getContentPane().add(lblPleaseEnterThree);

        label = new JLabel("");
        label.setVisible(false);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setFont(new Font("Lucida Grande", Font.ITALIC, 11));
        label.setForeground(UIManager.getColor("InternalFrame.borderShadow"));
        label.setBounds(121, 247, 197, 16);
        frame.getContentPane().add(label);

        lblResult = new JLabel("Result");
        lblResult.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
        lblResult.setVisible(false);
        lblResult.setForeground(UIManager.getColor("InternalFrame.borderDarkShadow"));
        lblResult.setHorizontalAlignment(SwingConstants.CENTER);
        lblResult.setBounds(249, 201, 176, 38);
        frame.getContentPane().add(lblResult);
        lblPleaseEnterThree.setVisible(false);

    }
}
