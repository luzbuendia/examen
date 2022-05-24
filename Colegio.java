package clase1;

public class Colegio
{
    public String alumno;
    public  Matricula matricula[];
    public String docente[];
    public int matriculaActual;

   
    public int valores;
    
    public Colegio()
    {
       String cursos[] ={"Matematica",  "Algoritmo" , " Calculo "};
       String docente[]={"Alejandro", " Pablo"};
       this.matricula=new Matricula[3];
       this.matriculaActual = 0;
       
         for(int i=0;i<this.matricula.length;i++)
         
          {
           System.out.ptintln(matricula[i%3]+""+docente[i/2]);
            
            
          }
    public void mostrarMatricu()
    {
       
       for(int i=0;i<this.matricula.length;i++)

      {  this.valores=Integer.parseInt(JOptionPane.showInputDialog("Digita un numero para la posición: a["+i+"]"));
         this.matricula[i]= this.valores;

      }
      
    }
    
       
    }
    public static void main (String args[])
    {
      Colegio colegio=new Colegio();
      colegio.mostrarMatricu();
    }

}

