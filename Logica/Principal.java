package Logica;
import javax.swing.JOptionPane;


public  class Principal  {
    
    private  double num1;
    private double num2;
    private  double suma;
    private  double resta;
    private   double mult;
    private    double division;
   
   public final double getSuma(){
          num1 =Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL VALOR DEL NUMEROM1 "));
          num2=Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL VALOR DEL NUMEROM2"));
   
          suma=num1+num2;
          return suma;     
  }
   public final double getResta(){
        num1 =Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL VALOR DEL NUMEROM1 "));
          num2=Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL VALOR DEL NUMEROM2"));
   
          resta=num1-num2;
          return resta;
  }
   public final double getMult(){
       num1 =Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL VALOR DEL NUMEROM1 "));
          num2=Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL VALOR DEL NUMEROM2"));
   
          mult=num1*num2;
      return mult;
      }
      public final double getDivision(){
          num1 =Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL VALOR DEL NUMEROM1 "));
          num2=Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL VALOR DEL NUMEROM2"));
    division=num1/num2;
     
        return division;
      }
  
}
      
     

 
