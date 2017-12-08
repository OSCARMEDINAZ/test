package com.tdd.app;

public class App {
	
   public double calcularMedia(double[] setMedia) {
	   double suma = 0;
	   double media = 0;
	   for(int i = 0; i < setMedia.length; i++) {
		   suma += setMedia[i];
	   }
	   media = (double) suma / setMedia.length;
	   return Math.round(media * 100d) / 100d;
   }
   
   public double calcularDesviacionStd(double[] setDesv) {
	   double media = calcularMedia(setDesv);
	   double desviacion = 0;
	   for(int i = 0; i < setDesv.length; i++) {
		   System.out.println("( "+ setDesv[i]+" - "+ media+" ) ^ 2 = "+ Math.round(Math.pow((setDesv[i] - media), 2)* 100d) / 100d);
		   desviacion += Math.round(Math.pow((setDesv[i] - media), 2)* 100d) / 100d;
	   }
	   desviacion = Math.round(Math.sqrt(( desviacion / (setDesv.length - 1))) * 100d) / 100d;
	   System.out.println("Desviacion Std: "+desviacion);
	   return desviacion;
   }
   
}
