
public class SmokeDetector {
 
	private Room rooms[]=new Room[2];
	private float threshold ;
	private int MAX =rooms.length;
	private int numberofRooms=0;
	
	public SmokeDetector() {
		super();
	}
	
	public SmokeDetector(float threshold) {
		super();
		this.threshold=threshold;
	}
	
	public Room[] getRoom() {
		return rooms;
	}
	
	public int getRoomNum() {
		return numberofRooms;
	}
	
	public float getThreshold() {
		return threshold;
	}
	
	public void setThreshold(float threshold) {
		this.threshold=threshold;
	}
	
	public boolean MonitoredRoom(Room room) {
		if (getRoomNum() <MAX) {
			rooms[numberofRooms]= room;
			numberofRooms++;
			return true;
		}
		else
			System.out.println("Will only monitor a maximum of" +MAX+"rooms");
		     return false;
	}
	
	public boolean checkAllarm(float LevelofSmoke) {
		if(LevelofSmoke > threshold) {
			for(int i=0; i< getRoomNum(); i++) {
				System.out.println(rooms[i].display());
			}
			return true;
		}
		else {
			return false;
		}
		  
	}
}
