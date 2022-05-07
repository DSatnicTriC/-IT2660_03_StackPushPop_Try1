public class StackRunner {
	static DSatnicStack dSatnicStack = new DSatnicStack();
	
	public static void main(String[] args) {
		dSatnicStack.SeeStack();
		
		var valuesToPush = new int[] { 4, 67, 73, 53, 57, 12 };
		for (int i = 0; i < valuesToPush.length; i++) {
			dSatnicStack.Push(valuesToPush[i]);
		}
		
		dSatnicStack.SeeStack();
	}
}
