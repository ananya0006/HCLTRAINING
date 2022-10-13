class Shop
{
	private String shopName;
	private int shopID;
	private String shopOwner;
	private int  GSTNumber;
	private String shopType; 
	
	Shop(String shopName,int shopID,String shopOwner,int  GSTNumber,String shopType)
	{
		this.shopName=shopName;
		this.shopID=shopID;
		this.shopOwner=shopOwner;
		this.GSTNumber=GSTNumber;
		this.shopType=shopType;
	}
	
	public String getName()
	{
		return shopName;
	}
	public int getID()
	{
		return shopID;
	}
		
	public String getOwner()
	{
		return shopOwner;
	}
	public int GSTNumber()
	{
		return GSTNumber;
	}
	public String getshopType()
	{
		return shopType;
	}
	public void setName(String shopName) // to set the value
	{	
		this.shopName=shopName;
	
	}
	public void setID(int shopID) // to set the value
	{	
		this.shopID=shopID;
	
	}
	public void setOwner(int setOwner) // to set the value
	{	
		this.shopOwner=shopOwner;
	
	}
	public void GSTNumber(int GSTNumber) // to set the value
	{	
		this. GSTNumber= GSTNumber;
	
	}
	
	public void setshopType(int setshopType) // to set the value
	{	
		this.shopType=shopType;
	
	}	
	



}