package core.springcore.springlifecycleusingXML;

public class Samosa {
	
	private int price;

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		System.out.println("data setting");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
    public void init() {
		System.out.println("init method call");
	}
    
    public void destroy()
    {
    	System.out.println("destroy method call");
    }
}
