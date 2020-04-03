package part8;

public class MyIntStack {
	private int[] contents;
	private int tos; // Top of the stack
	// constructors

	public MyIntStack(int capacity) {
		contents = new int[capacity];
		tos = -1;
	}

	public boolean push(int element) {

		try {
			contents[++tos] = element;
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
		/*if(tos >= (contents.length - 1)) 
		{
			int temp[] = new int[contents.length + 1];
			for(int i = 0; i < contents.length; i++) 
			{
				temp[i] = contents[i];
			}
			temp[tos + 1] = element;
			contents = temp;
		}
		contents[++tos] = element;*/
	}
	

	public int pop() {
		return contents[tos--];
	}

	public int peek() {
		return contents[tos];
	}

	public boolean isEmpty() {
		return tos < 0;
	}

	public boolean isFull() {
		return tos == contents.length - 1;
	}
	

}
