package juanJava;

public class ejerD {
	  public static void main(String[] args) throws Exception {
	      int numInicio = 6;
	       int numFin = 14;
	       int i = 0;

	        for(i=0;numFin>numInicio; numFin--) {
	            i = numFin % 2;
	            if(i==0){
	              System.out.println(numFin);
	            }
	        }   

	    }
}
