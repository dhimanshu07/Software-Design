package q1;

class Counter{
	private int value=0;
    public Counter(){value=0;}
    public Counter(int v){value=v;}
	public void increment(){
		this.value++;
	}
	public void decrement(){
		this.value--; 
		
	}
	public int read_value(){
		return this.value;
	}
	public void resetv() {
		// TODO Auto-generated method stub
		this.value=0;
	}
	
}


