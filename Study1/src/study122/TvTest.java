package study122;

public class TvTest {
	public static void main(String[] args) {
		
		Tv[] tvArray = new Tv[3];
		tvArray[0] = new Tv("INFINIA", 1500000, "LED TV");
		tvArray[1] = new Tv("XCANVAS", 1000000, "LCD TV");
		tvArray[2] = new Tv("CINEMA", 2000000, "3D TV");
		
		for(int i=0; i<tvArray.length; i++) {
			System.out.println(tvArray[i].toString());
			if(i !=(tvArray.length-1)) {
				//max = (tvArray[i].getPrice() > tvArray[i+1].getPrice() ? tvArray[i].getName()
				//min = (tvArray[i].getPrice() < tvArray[i+i].getPrice() ? tvArray[i].getName()
			}
		}
		
	}

}
