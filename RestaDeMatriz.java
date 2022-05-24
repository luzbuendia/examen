package clase1;
import javax.swing.JOptionPane;
public class RestaDeMatriz 
{
    
      public int matriz[][];
      public int matriz1[][];
      public int filas;
      public int columnas;
      public int valores;
      public int matrizResta[][];
    
      
     public RestaDeMatriz()
     {
        filas=Integer.parseInt(JOptionPane.showInputDialog("Digita las filas de las matrices"));
        columnas=Integer.parseInt(JOptionPane.showInputDialog("Digita las columnas de las matrices"));
        this.matriz=new int[filas][columnas];
        this.matriz1=new int[filas][columnas];
        this.matrizResta=new int[filas][columnas];
        
            
      }
      public void setMatriz()
      {
    
        for(int filas=0;filas<this.matriz.length;filas++)
        {
          for(int columnas=0;columnas<this.matriz.length;columnas++)
         {
          this.valores=Integer.parseInt(JOptionPane.showInputDialog("Digita un número para la posición: a["+filas+"]["+columnas+"]"+" de la matriz A"));
          
          this.matriz[filas][columnas]=this.valores;
          
    
         }
       }
      }
      public void getMatriz()
      {
        for(int filas=0; filas<this.matriz.length;filas++)
        {
          for(int columnas=0; columnas <this.matriz.length;columnas++)
          {
            System.out.print(this.matriz[filas][columnas]+" ");
          } 
          System.out.println(); 
        }
        
    
      }
      public void setMatriz1()
      {
      
        for(int filas=0;filas<this.matriz1.length;filas++)
        {
          for(int columnas=0;columnas<this.matriz1.length;columnas++)
          {
            this.valores=Integer.parseInt(JOptionPane.showInputDialog("Digita un número para la posición: a["+filas+"]["+columnas+"]"+" de la matriz B"));
            
            this.matriz1[filas][columnas]=this.valores;
            
      
          }
        }
    
      }
      
      public void getMatriz1()
      {
        for(int filas=0; filas <this.matriz1.length;filas++)
        {
          for(int columnas=0; columnas <this.matriz1.length;columnas++)
          {
            System.out.print(this.matriz1[filas][columnas]+" ");
          } 
          System.out.println(); 
        }
        
    
      }
      public void matrizResta()
      { 
       for(int filas=0;filas<this.matriz.length;filas++)
       {
         for(int columnas=0;columnas<this.matriz1.length;columnas++)
         {
           matrizResta[filas][columnas]=matriz[filas][columnas]-matriz1[filas][columnas];                            
           System.out.print(this.matrizResta[filas][columnas]+" ");
         }
         System.out.println();
       }
        
      }
      public static void main(String[] args)
     {
       RestaDeMatriz matriz= new RestaDeMatriz();
       matriz.setMatriz();
       matriz.getMatriz();
       matriz.setMatriz1();
       matriz.getMatriz1();
       matriz.matrizResta();
      
     }
    
} 
    
    
    
    
    
      
    

