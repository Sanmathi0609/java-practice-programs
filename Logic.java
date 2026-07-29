import java.util.Scanner;
public class Logic {
    public static void main(String[] args){
        Scanner s2=new Scanner(System.in);
        int a=s2.nextInt();
      int b=s2.nextInt();
      {
    //AND GATE
    if(a==1 && b==1)
    {
        System.out.println("AND=1");
    }
    else
    {
        System.out.println("AND=0");
    }
    }
    {
        //OR GATE 
        if(a==1 || b==1)
        {
          System.out.println("OR=1");
        }
        else
        {
          System.out.println("OR=0");
        }
    }
    {
        //NOT GATE
        if(a==1)
        {
          System.out.println("NOT=0");
        }
        else
        {
         System.out.println("NOT=1");
        }
    }
    {
        //NAND GATE
        if(a==1 && b==1)
    {
        System.out.println("NAND=0");
    }
    else
    {
        System.out.println("NAND=1");
    }
    }
    {
        // NOR GATE
                if(a==1 || b==1)
        {
          System.out.println("NOR=0");
        }
        else
        {
          System.out.println("NOR=1");
        }
    }
    {
        //XOR GATE
        if(a==b)
        {
            System.out.println("XOR=0");
        }
        else
        {
            System.out.println("XOR=0");
        }
  }
  {//XNOR
            if(a==b)
        {
            System.out.println("XNOR=10");
        }
        else
        {
            System.out.println("XNOR=0");
        }

  }
  s2.close();

    }
    }
    
