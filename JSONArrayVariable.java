public class JSONArrayVariable extends JSONVariable
{
	private JSONObject[] value;
	private int currSize;
	public JSONArrayVariable(String name)
	{
		super(name);
		this.value = new JSONObject[50];
		this.currSize = 0;
	}
	
	public void addJSONObject(JSONObject obj)
	{
		this.value[this.currSize] = obj;
		this.currSize++;
	}
	
	@Override
	void display() 
	{
		System.out.println("JSON Array - " + this.name + " -> Num Objects: " + this.currSize);
		for(int i = 0; i < this.currSize; i++)
		{
			this.value[i].display();
		}
	}
	
	@Override
	String exportToJSON()
	{
		String ans = "\"" + this.name + "\":[";
		for (int i = 0; i < currSize - 1; i++)
		{
			ans += this.value[i].exportToJSON() + ",";
		}
		return ans + this.value[currSize - 1].exportToJSON() + "]";
	}
}