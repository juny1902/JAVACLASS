enum Operator {
	PLUS, MINUS, MULTI, DIV
}

class ListStack {
	private Node top;

	private class Node {
		private Object data;
		private Node nextNode;

		Node(Object data) {
			this.data = data;
			this.nextNode = null;
		}
	}

	public ListStack() {
		this.top = null;
	}

	public boolean empty() {
		return (top == null);
	}

	public void push(Object item) {
		Node newNode = new Node(item);
		newNode.nextNode = top;
		top = newNode;
	}

	public Object peek() {
		if (empty())
			throw new ArrayIndexOutOfBoundsException();
		return top.data;
	}

	public Object pop() {
		Object tmp = peek();
		top = top.nextNode;
		return tmp;
	}

}

class Calculator extends ListStack {
	public void input(int a){
		this.push(a);
	}
	public void input(char a){
		int tmp = 0;
		while(this.peek() != null){
			tmp = (int)this.pop();
		}
	}
}

public class StackCalcExample {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.input(3);
	}

}
