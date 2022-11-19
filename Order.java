package Phase3;

public class Order {
	private int ASUID;
	static private int OrderNum;
	private String Type;
	private String Toppings;
	private double Pickup;
	
	public Order() {
		OrderNum=OrderNum +1;
		ASUID = 0;
		Type="";
		Toppings = "";
		Pickup = 0;
	}
	public Order(int ASUID, int OrderNum,String Type, String Toppings, double Pickup) {
		this.ASUID = ASUID;
		this.OrderNum = OrderNum;
		this.Type=Type;
		this.Toppings = Toppings;
		this.Pickup = Pickup;
	}
	public int getID() {return ASUID;}
	public int getOrderNum() {return OrderNum;}
	public String getType() {return Type;}
	public String getToppings() {return Toppings;}
	public double getPickup() {return Pickup;}
	public void setID(int id) {ASUID = id;}
	public void setOrderNum(int ordernum) {OrderNum = ordernum;}
	public void setType(String type) {Type = type;}
	public void setToppings(String toppings) {Toppings = toppings;}
	public void setPickup(double pickup) {Pickup = pickup;}
	public String toString() {
		return "Type:"+Type+"\nToppings:"+Toppings+"\nPickup:"+Pickup;
	}
}
