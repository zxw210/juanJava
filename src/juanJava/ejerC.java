package juanJava;

public class ejerC {
	 public static void main(String[] args) throws Exception {
	      int numInicio = 5;
	       int numFin = 14;
	       int i = 0;
	       boolean par = true;
	       
	       
	        while(numInicio<=numFin) {
	            i = numInicio % 2;
	            if(par==true && i==0){
	             
	               System.out.println(numInicio);
	            }
	            if(par==false && i!=0){
	                System.out.println(numInicio);
	            }
	            numInicio++;
	        }   

	    }
}
