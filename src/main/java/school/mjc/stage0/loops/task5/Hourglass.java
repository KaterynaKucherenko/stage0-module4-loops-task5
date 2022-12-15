package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
String res = "";
	    String a = " ";
	 for (int x=0; x<=height; x++){
	     for( int y = 0; y<x; y++){
	         System.out.print(" ");}
	         for (int r=x; r<height; r++){
	             System.out.print("8" + " ");}  
	             System.out.println();}
	             
	             for(int x = height-1; x>=1; x--){
	                 for (int y=1; y<x; y++){
	                     System.out.print(" ");}
	                     for (int r=x; r<=height; r++){
	                         System.out.print("8" + " ");}System.out.println();}
    }
}
