
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Room Room1 = new Room();
        Room1.setName("Conference Room");
        Room1.setCapacity(30);
        
        Room Room2 = new Room ("Training Room", 20);
        
        SmokeDetector Detector = new SmokeDetector((float)50.0);
        
        Detector.MonitoredRoom(Room1);
        Detector.MonitoredRoom(Room2);
        
        Detector.checkAllarm((float)75.0);
        Detector.checkAllarm((float)35.0);
	}

}
