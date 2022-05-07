public class DSatnicStack {
	private int[] myStack;
	
	public void SeeStack() {
		System.out.println("................");
		if (this.myStack == null) {
			System.out.println("Stack is empty!");
		} else {
			System.out.println("Current Amounts:");
			for (int i = 0; i < this.myStack.length; i++) {
				System.out.println("Position: " + i + " ... " + "Value: " + this.myStack[i]);
			}
		}
		System.out.println("................");
	}
	
	public void Push(int value) {
		if (this.myStack == null || this.myStack.length == 0) {
			this.myStack = new int[1];
			this.myStack[0] = value;
			return;
		}

		this.PushLogic(value, this.myStack.length);
	}
	
	public int Pop() throws Exception {
		if (this.myStack.length == 0) {
			throw new Exception("Out of pops!");
		}		
		
		return this.PopLogic();
	}
	
	private void PushLogic(int value, int position) {
		var newArray = new int[this.myStack.length + 1];

		for (int i = 0; i < position; i++) {
			newArray[i] = this.myStack[i];
		}

		newArray[position] = value;

		for (int i = position + 1; i <= this.myStack.length; i++) {
			newArray[i] = this.myStack[i - 1];
		}

		this.myStack = newArray;
	}
	
	private int PopLogic() {
		var poppedValue = this.myStack[myStack.length - 1];
		var newArray = new int[this.myStack.length + 1];

		for (int i = 0; i < myStack.length - 1; i++) {
			newArray[i] = this.myStack[i];
		}

		this.myStack = newArray;
		
		return poppedValue;
	}
}