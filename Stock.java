/*
  public class Rectangle {
    private int x, y;
    private int width, height;
        
    public Rectangle() {
        this(0, 0, 1, 1);
    }
    public Rectangle(int width, int height) {
        this(0, 0, width, height);
    }
    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    ...
}  How to use construtor with class
  
  */
import java.util.Random;



public class Stock{

    private String name;

    private String symbol;

    private float currentPrice;

    private float nextPrice;

    private float priceChange;

    private float percentChange;
   

    public Stock(){

        this.name = "Microsoft";

        this.symbol = "MS";

        this.currentPrice = Float.valueOf("46.87");
        
        //tried to use a double
        //would be like this.currentPrice = new Double("46.87");

        this.nextPrice = Float.valueOf("46.87");

    }

  

    public Stock(String name,String symbol,float currentPrice,float nextPrice){

        this.name = name;

        this.symbol = symbol;

        this.currentPrice = currentPrice;

        this.nextPrice = nextPrice;
        
       

    }

    

    public String getName(){
    	
    	//return from constructor

        return this.name;

    }

    public String getSymbol(){

        return this.symbol;

    }

    public float getCurrentPrice(){

        return this.currentPrice;

    }

    public float getNextPrice(){

        return this.nextPrice;

    }

    public float getPriceChange(){

        return this.priceChange;

    }

    public float getPercentChange(){

        return this.percentChange;

    }

    

 

    public void setName(String name){

        this.name = name;

    }

    public void setSymbol(String symbol){

        this.symbol = symbol;

    }

   

    public void setCurrentPrice(float currentPrice){

        if(currentPrice < 0){

            this.currentPrice = 0;

        }else{

            this.currentPrice = currentPrice;

        }

    }


    public void setNextPrice(float nextPrice){

        if(nextPrice < 0){

            this.nextPrice = 0;

        }else{

            this.nextPrice = nextPrice;

        }

    }

    public void setPriceChange(float priceChange){

        this.priceChange = priceChange;

    }

    public void setPercentChange(float percentChange){

        this.percentChange = percentChange;

    }

    // simulatePrice function

    public float simulatePrice(){

        Random random = new Random();

        float randomPercent = random.nextFloat()/10;

        

        int positive = random.nextInt(2);

        if(positive!=0){

            setNextPrice(this.currentPrice + (this.currentPrice * randomPercent));

        }

        else{

             

            setNextPrice(this.currentPrice - (this.currentPrice * randomPercent));

        }


        setPriceChange(this.nextPrice - this.currentPrice);

      

        setPercentChange((this.nextPrice/this.nextPrice) * (randomPercent * 100));


        return this.nextPrice;

    }
}
	
	
	


		
		
		
		

	
	
