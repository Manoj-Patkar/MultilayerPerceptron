package com.neural.net;

public class Driver {
	
	public static  void main(String[] args){
		int[][][] data =Perceptron.andData;
		double[] weights=Perceptron.INITIAL_WEIGHTS;
		Driver driver=new Driver();
		Perceptron perceptron= new Perceptron();
		boolean errorFlag=true;
		int epochNumber=0;
		double error=0;
		double[] adjustmentWeights=null;
		/*while(errorFlag){
			errorFlag=false;
			driver.printHeading(epochNumber++);
			for(int x=0;x<data.length;x++){
				double weightedSum=perceptron.calcualateWeightedSum(data[x][0], weights);
				int result=perceptron.applyActivationFunction(weightedSum);
				error=data[x][1][0]-result;
				if(error!=0)errorFlag=true;
				adjustmentWeights=perceptron.adjustWeights(data[x][0], weights, error);
			    driver.printVector(data[x], weights, result, error, weightedSum, adjustmentWeights);
			    weights=adjustmentWeights;
			}
		}*/

		
	}
	
	public void printHeading(int epochNumber){
		System.out.println("\n=================================Epoch# "+epochNumber+" "
				+ "==================================================================");
		System.out.println("  w1  |  w2  |  x1  |  x2  |  targetResult  |  Result  |"
				+ "  error  |  weightedSum  |   adjusted w1  |  adjusted w2");
		System.out.println("---------------------------------------------------------- "
				+ "-------------------------------------------------------------------");
	}
 
  public void printVector(int[][] data ,double[] weights,int result,double error,double weightedSum,double[] adjustmentWeights){
	  System.out.println(" "+String.format("%.2f", weights[0])+" | "
	  		+ String.format("%.2f", weights[1])+" | "
	  				+ ""+data[0][0]+ "   |  "+data[0][1]+ "     |    "+data[1][0]  
	  						+"          |     "+result+"    |  "+error+"    |  "+String.format("%.2f", weightedSum)
	  						+"         |  "+String.format("%.2f", adjustmentWeights[0])+"          |  "+String.format("%.2f", adjustmentWeights[1]));
  }

}
