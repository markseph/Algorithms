import java.lang.Math;

//	The idea is to simulate random (x, y) points in a 2-D plane
//	with domain as a square of side 1 unit.
//	Imagine a circle inside the same domain with same diameter and
//	inscribed into the square. We then calculate the ratio of number points
//	that lied inside the circle and total number of generated points.

public class A_Estimate_Pi {
	public static void main(String[] args) {
		int numPoints = 100000;
//		int numPoints = 10000;
//		int numPoints = 1000;
		
		double pi = 0.0;
		pi = estimatePi(numPoints);
		System.out.println("Estimate of Pi: " + pi);
	}
	
//	//	time complexity: O()
//	//	space complexity: O()
//	public static double estimatePi(int n) {
//		
//	}
	
	//	time complexity: O(n)
	//	space complexity: O(n)
	public static double estimatePi(int n) {
		int numPointsCircle = 0;
		int numPointsTotal = 0;
		double max = 1.0;
		double min = 0.0;
		double range = max - min;
		double x = 0.0;
		double y = 0.0;
		double distance = 0.0;
		double pi = 0.0;
		
		for(int i = 0; i < n; i++) {
			x = (Math.random() * range) + min;
			y = (Math.random() * range) + min;
			distance = Math.pow(x, 2) + Math.pow(y, 2);
			if(distance <= 1) {
				numPointsCircle += 1;
			}
			numPointsTotal += 1;
		}
		
		pi = 4.0 * (double)numPointsCircle / (double)numPointsTotal;
		return pi;
	}
}