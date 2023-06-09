package streams;

public class MediaTest {

	
	public static void main(String[] args) {
		
		Media m1 = new Media().add(3).add(3).add(3);
		System.out.println(m1.getMedia());
		Media m2 = new Media().add(2).add(2).add(2);
		System.out.println(m1.getMedia());
		
		double m3 = Media.combinar(m1, m2).getMedia();
		
		System.out.println(m3);
		
	}
	
}
