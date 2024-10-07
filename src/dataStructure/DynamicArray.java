package dataStructure;

// extend from a static array
public class DynamicArray {

	protected int size;

	protected int capacity;

	protected Object[] array;

	public DynamicArray() {
		this.capacity = 10;
		array = new Object[this.capacity];
	}

	public DynamicArray(int capacity) {
		this.capacity = capacity;
		array = new Object[this.capacity];
	}

	public void insert(int index, Object bean) {
		
		if(index<this.size-1) {
			for(int i =this.size;i>index;i--)
			{
				array[i]=array[i-1];
			}
			array[index]=bean;
		}
		else {
			add(bean);
		}

	}

	public void add(Object bean) {
		if (this.size >= this.capacity) {
			extend();
		}
		array[this.size] = bean;
	}

	public void delete(int index) {
		for (int i = index; i < this.size - 1; i++) {
			array[i] = array[i + 1];
		}

	}

	public Object search() {

	}

	public String toString() {

	}

	private void extend() {

	}

	private void shrink() {

	}
	
	public boolean isEmpty() {
		return this.size==0;
	}

}
