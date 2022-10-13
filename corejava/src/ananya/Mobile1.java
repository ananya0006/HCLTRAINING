package ananya;
//aggregation ex go o mobile1.java
	public class Mobile1 {
		String ram;
		double rom;
		SmartWatch s;
		
		Mobile1(String ram,double rom)
		{
			this.ram=ram;
			this.rom=rom;
		}
		public void connectWatch(SmartWatch s) {
			if(this.s==null)
			{
				this.s=s;
				System.out.println("Smartwatch found..!");
			}
			else
			{
				System.out.println("Smartwatch is connected already");
			}
		}
		public void disconnectWatch()
		{
			if(this.s==null)
			{
				System.out.println("No smartwatch found to disconnect");
			}
			else
			{
				this.s=null;
				System.out.println("smartwatch is disconnected successfully");
			}
		}
		public void details() {
			if(this.s==null)
			{
				System.out.println("no smartwatch is found to show details!");
			}
			else
			{
				System.out.println("smartwatch details:");
				System.out.println(s.brand);
				System.out.println(s.color);
				System.out.println(s.price);
				System.out.println();
				System.out.println("Mobile details:");
				System.out.println(ram);
				System.out.println(rom);
			}
		}
	}
		



