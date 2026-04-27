
class myGenericClass <T> {
	T myVar;
	public myGenericClass(T myVar) {
		this.myVar = myVar;
	}
	public void setMyVar(T myVar) {
		this.myVar = myVar;
	}
	public T getMyVar() {
		return myVar;
	}
	public void display() {
		System.out.println(myVar);
	}
}

class Pair <K, V> {
	K key;
	V value;

	public Pair(){}

	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public String toString(){
		return "Key: "+this.key+"\tValue: "+this.value;
	}
}
//you're reading a paragraph and 
//counting the words in it
//storing each word with a value


public class Main {
    public static void main(String[] args) {
      
		myGenericClass <Integer> ob1 = new myGenericClass<>(10); 
		myGenericClass <String> ob2 = new myGenericClass<>("This");
		ob1.display();
		ob2.display();
		
		Pair<String, Integer> counts[] = new Pair[20];
		String p = "Speed I am Speed Faster than Fast Quicker than Quick I am Lighting McQueen";
		String arr[] = p.split(" ");
		for(int i = 0; i <arr.length; i++){
			for(int j = 0; j<counts.length; j++){
				if(counts[j]!=null) {
					if (counts[j].key.equalsIgnoreCase(arr[i])) {
						counts[j].key = arr[i];
						counts[j].value++;
					}else{
						counts[i] = new Pair(arr[i], 1);
						break;
					}
				}else{
					counts[i] = new Pair(arr[i], 1);
					break;
				}
			}
		}

		for (int i = 0; counts[i]!=null; i++) {
			System.out.println(counts[i].toString());
		}
    }
}