
public class Pair<K, V> {

	private K key;
	private V value;
	
	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public String toString() {
		return "Key: "+key+" Value: "+value;
	}
}
