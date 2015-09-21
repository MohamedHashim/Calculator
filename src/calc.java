import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
public class calc extends JFrame implements ActionListener{
    
    private JPanel panel;
    static JButton zeroButton,oneButton ,twoButton,threeButton,fourButton,fiveButton,sixButton,sevenButton,eightButton,nineButton,addButton,subButton,multiButton,divButton,equalsButton,clearButton,plusMinusButton,decimalButton;
    static JTextField ansField;
    static Double num1 ,num2,ans,plusminus;
    static int addclick=0,subclick=0,mulclick=0,divclick=0,clearfield;
    
    public calc(){
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("M.Hashim Calculator");
        setResizable(false);
        setSize(230,370);
        setLocationRelativeTo(null);
        panel=new JPanel();
        panel.setSize(230,370);
        panel.setLayout(null);
        addButton = new JButton("+");
        addButton.setSize(50,50);
        addButton.setLocation(170,175);
        subButton = new JButton("-");
        subButton.setSize(50,50);
        subButton.setLocation(170,120);
        multiButton = new JButton("*");
        multiButton.setSize(50,50);
        multiButton.setLocation(170, 65);
        divButton = new JButton("/");
        divButton.setSize(50,50);
        divButton.setLocation(115,65);
        equalsButton = new JButton("=");
        equalsButton.setSize(50,105);
        equalsButton.setLocation(170,230);
        zeroButton = new JButton("0");
        zeroButton.setSize(105,50);
        zeroButton.setLocation(5,285);
        oneButton = new JButton("1");
        oneButton.setSize(50,50);
        oneButton.setLocation(5,230);
        twoButton = new JButton("2");
        twoButton.setSize(50,50);
        twoButton.setLocation(60,230);
        threeButton = new JButton("3");
        threeButton.setSize(50,50);
        threeButton.setLocation(115,230);
        fourButton = new JButton("4");
        fourButton.setSize(50,50);
        fourButton.setLocation(5,175);
        fiveButton = new JButton("5");
        fiveButton.setSize(50,50);
        fiveButton.setLocation(60,175);
        sixButton = new JButton("6");
        sixButton.setSize(50,50);
        sixButton.setLocation(115,175);
        sevenButton = new JButton("7");
        sevenButton.setSize(50,50);
        sevenButton.setLocation(5,120);
        eightButton = new JButton("8");
        eightButton.setSize(50,50);
        eightButton.setLocation(60,120);
        nineButton = new JButton("9");
        nineButton.setSize(50,50);
        nineButton.setLocation(115,120);
        clearButton = new JButton("C");
        clearButton.setSize(50,50);
        clearButton.setLocation(5,65);
        decimalButton = new JButton(".");
        decimalButton.setSize(50,50);
        decimalButton.setLocation(115,285);
        plusMinusButton = new JButton("+/-");
        plusMinusButton.setSize(50,50);
        plusMinusButton.setLocation(60,65);
        ansField = new JTextField();
        ansField.setBackground(Color.WHITE);
        ansField.setSize(215,50);
        ansField.setLocation(5,10);
        ansField.setFont(new Font("Arial",Font.BOLD,24));
        ansField.setEditable(false); panel.add(addButton);
        panel.add(subButton);
        panel.add(multiButton);
        panel.add(divButton);
        panel.add(zeroButton);
        panel.add(oneButton);
        panel.add(twoButton);
        panel.add(threeButton);
        panel.add(fourButton);
        panel.add(fiveButton);
        panel.add(sixButton);
        panel.add(sevenButton);
        panel.add(eightButton);
        panel.add(nineButton);
        panel.add(ansField);
        panel.add(plusMinusButton);
        panel.add(decimalButton);
        panel.add(equalsButton);
        panel.add(clearButton); add(panel);
        zeroButton.addActionListener(this);
        oneButton.addActionListener(this);
        twoButton.addActionListener(this);
        threeButton.addActionListener(this);
        fourButton.addActionListener(this);
        fiveButton.addActionListener(this);
        sixButton.addActionListener(this);
        sevenButton.addActionListener(this);
        eightButton.addActionListener(this);
        nineButton.addActionListener(this);
        addButton.addActionListener(this);
        subButton.addActionListener(this);
        multiButton.addActionListener(this);
        divButton.addActionListener(this);
        clearButton.addActionListener(this);
        decimalButton.addActionListener(this);
        plusMinusButton.addActionListener(this);
        equalsButton.addActionListener(this);
    }
    
 @Override
    public void actionPerformed(ActionEvent e) {
     if(e.getSource()==zeroButton){
            if(ansField.getText().length()<16){
                if(clearfield ==1){
                    ansField.setText("0");
                    clearfield=0;
                }else{
                    ansField.setText(ansField.getText()+"0");
                }
            }
        }
        if(e.getSource()==oneButton){
            if(ansField.getText().length()<16){
                if(clearfield ==1){
                    ansField.setText("1");
                    clearfield=0;
                }else{
                    ansField.setText(ansField.getText()+"1");
                }
            }
        }
         if(e.getSource()==twoButton){
            if(ansField.getText().length()<16){
                if(clearfield ==1){
                    ansField.setText("2");
                    clearfield=0;
                }else{
                    ansField.setText(ansField.getText()+"2");
                }
            }
        }
         if(e.getSource()==threeButton){
            if(ansField.getText().length()<16){
                if(clearfield ==1){
                    ansField.setText("3");
                    clearfield=0;
                }else{
                    ansField.setText(ansField.getText()+"3");
                }
            }
        }
         if(e.getSource()==fourButton){
            if(ansField.getText().length()<16){
                if(clearfield ==1){
                    ansField.setText("4");
                    clearfield=0;
                }else{
                    ansField.setText(ansField.getText()+"4");
                }
            }
        }
         if(e.getSource()==fiveButton){
            if(ansField.getText().length()<16){
                if(clearfield ==1){
                    ansField.setText("5");
                    clearfield=0;
                }else{
                    ansField.setText(ansField.getText()+"5");
                }
            }
        }
         if(e.getSource()==sixButton){
            if(ansField.getText().length()<16){
                if(clearfield ==1){
                    ansField.setText("6");
                    clearfield=0;
                }else{
                    ansField.setText(ansField.getText()+"6");
                }
            }
        }
         if(e.getSource()==sevenButton){
            if(ansField.getText().length()<16){
                if(clearfield ==1){
                    ansField.setText("7");
                    clearfield=0;
                }else{
                    ansField.setText(ansField.getText()+"7");
                }
            }
        }
         if(e.getSource()==eightButton){
            if(ansField.getText().length()<16){
                if(clearfield ==1){
                    ansField.setText("8");
                    clearfield=0;
                }else{
                    ansField.setText(ansField.getText()+"8");
                }
            }
        }
         if(e.getSource()==nineButton){
            if(ansField.getText().length()<16){
                if(clearfield ==1){
                    ansField.setText("9");
                    clearfield=0;
                }else{
                    ansField.setText(ansField.getText()+"9");
                }
            }
        }
         
           if(e.getSource()==plusMinusButton){
               if(ansField.getText().equals("")|| ansField.getText().equals("-")){
                   ansField.setText("-");        
               }else{
                    plusminus=(Double.parseDouble(String.valueOf(ansField.getText())));
                    plusminus*=-1;
                    ansField.setText(String.valueOf(plusminus));
               }
           }
           if(e.getSource()==clearButton){
               ansField.setText("");
               num1=0.0;  num2=0.0;
               addclick=0; subclick=0;
               mulclick =0; divclick=0;  
           }
           if(e.getSource()==decimalButton){
               if(ansField.getText().contains(".")){
                   ansField.setText(ansField.getText());
               }else{
                   ansField.setText(ansField.getText()+".");
               }
           }
           if(e.getSource()==addButton){
               if(ansField.getText()!= null){
                   num1=Double.parseDouble(String.valueOf(ansField.getText()));
                   addclick=1;
                   clearfield=1;
               }
           }
           if(e.getSource()==subButton){
               if(ansField.getText()!= null){
                   num1=Double.parseDouble(String.valueOf(ansField.getText()));
                   subclick=1;
                   clearfield=1;
               }
           }
           if(e.getSource()==multiButton){
               if(ansField.getText()!= null){
                   num1=Double.parseDouble(String.valueOf(ansField.getText()));
                   mulclick=1;
                   clearfield=1;
               }
           }
           if(e.getSource()==divButton){
               if(ansField.getText()!= null){
                   num1=Double.parseDouble(String.valueOf(ansField.getText()));
                   divclick=1;
                   clearfield=1;
               }
           }
           if(e.getSource()==equalsButton){
               num2=Double.parseDouble(String.valueOf(ansField.getText()));
               ansField.setText(ansField.getText());
               if(addclick==1){
                   ans=num1+num2;
                   ansField.setText(String.valueOf(ans));
                   addclick=0;
               }
               if(subclick==1){
                   ans=num1-num2;
                   ansField.setText(String.valueOf(ans));
                   subclick=0;
               }
               if(mulclick==1){
                   ans=num1*num2;
                   ansField.setText(String.valueOf(ans));
                   mulclick=0;
               }
               if(divclick==1){
                   ans=num1/num2;
                   if(num2==0.0)
                         ansField.setText("ERROR !");
                   else
                   ansField.setText(String.valueOf(ans));
                   divclick=0;
               }
           }
    }
    }
    

