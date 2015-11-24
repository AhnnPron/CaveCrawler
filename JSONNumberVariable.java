public class JSONNumberVariable extends JSONVariable
{
	private int value;
	
	public JSONNumberVariable(String name, int value) 
	{
		super(name);
		this.value = value;
	}

	@Override
	void display() 
	{
		System.out.println("Number : " + this.name + " -> " + this.value);
	}
	
	@Override
	String exportToJSON()
	{
		return "\"" + this.name + "\":" + this.value;
	}

}
