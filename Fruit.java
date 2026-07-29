public class Fruit {
    public static void main(String[] args){
        int a=12,b=15,o=13;
        int  tot=a+b+o;
        int box=tot/8;
        if(tot%8!=0)
        {
            box+=1;
        }
       int empty=0;
       if(tot%8!=0)
       {
        int tep=tot%8;
        empty=8-tep;
       }
    }
}
