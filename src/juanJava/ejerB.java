package juanJava;

public class ejerB {
    public static void main(String[] args) throws Exception {
        int numInicio = 6;
         int numFin = 14;
         int i = 0;

          while(numInicio<=numFin) {
              i = numInicio % 2;
              if(i==0){
                System.out.println(numInicio);
              }
              numInicio++;
          }   

      }
}
