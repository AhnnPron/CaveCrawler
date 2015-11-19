public class JSONArray extends JSONVariable
{
	private JSONArray[] ObjectArray; 
	private int currSize; 
	
	
	public JSONArray() 
	{
		this.ObjectArray = new JSONArray[10];
		this.currSize = 0; 
		
	}
	public void addVariable(JSONVariable OA)
	{
		if(this.currSize < this.ObjectArray.length)
		{
			this.ObjectArray[this.currSize] = OA;
			this.currSize++;
			
		}
		
	public void display()
	{
		System.out.println("JSON Array - Num Objects: " + this.currSize);
		for(int i = 0; i < this.currSize; i++)
			{
				this.ObjectArray[i].display();
			}
			
	}
}


