
public class Room {

	private String name;
	private int capacity;
	
	public Room() {
		name="";
		capacity=0;
	}
	
	public Room(Room room) {
		name=room.name;
		capacity =room.capacity;
		// TODO Auto-generated constructor stub
	}
	public Room(String name, int capacity) {
		super();
		this.name = name;
		this.capacity = capacity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public String display() {
		return "Name: "+ name +", capacity: "+capacity;
	}
	
}
