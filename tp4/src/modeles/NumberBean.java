package modeles;

public class NumberBean {

    private double number;
    
    
    public NumberBean() {
        
    	 setNumber(0);
    }

 
    public double getNumber() {
        return number;
    }
    public void setNumber(double number) { 
    	this.number=number;
    }

    public static double getrandom(String x){
    	System.out.println("inside javabean "+(Math.random()*Double.parseDouble(x)));
    	return ((Math.random()*Double.parseDouble(x)));
    }

		
	}

