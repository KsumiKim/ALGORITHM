package algorithm;

public class Boomerang {

	public static void main(String[] args) {
		int[][] points = {
				{1, 1},
				{2, 3},
				{3, 2}}; // true
		
		int[][] points2 = {
				{0, 1},
				{1, 1},
				{2, 1}}; // false
		
		int[][] points3 = {
				{1, 1},
				{2, 2},
				{3, 3}}; // false

		int[][] points4 = {
				{0, 0},
				{1, 0},
				{2, 2}}; // true
		
		int[][] points5 = {
				{73, 31},
				{73, 19},
				{73, 45}}; // false
		
		int[][] points6 = {
				{0, 0},
				{0, 2},
				{2, 1}}; // true
		
		int[][] points7 = {
				{22, 33},
				{37, 27},
				{67, 15}}; // true
		
		Boomerang boomerang = new Boomerang();
		boolean res = boomerang.isBoomerang2(points7);
		System.out.println(res);
	}
	
	// The three given points are boomerang if and only if 
	// 1. the points are distinct 
	// 2. they are not in a straight line
    public boolean isBoomerang(int[][] points) {
    	// Method 1: Calculate the slope of AB and AC 
    	// K_AB = (p[0][0] - p[1][0]) / (p[0][1] - p[1][1])
    	// K_AC = (p[0][0] - p[2][0]) / (p[0][1] - p[2][1])
    	
    	// Method 2: Calculate the area of ABC
    	// 0.5 * (i[0] * j[1] + j[0] * k[1] + k[0] * i[1] - 
    	// j[0] * i[1] - k[0] * j[1] - i[0] * k[1]);
    	
    	return (points[0][0] - points[1][0]) * (points[0][1] - points[2][1]) != 
    			(points[0][1] - points[1][1]) * (points[0][0] - points[2][0]) ;
    }


    public boolean isBoomerang2(int[][] points) {
    	int[] point1 = points[0];
    	int[] point2 = points[1];
    	int[] point3 = points[2];
    	
    	if ((point1[0] == point2[0] && point1[1] == point2[1]) ||
    		(point2[0] == point3[0] && point2[1] == point3[1]) || 
    		(point1[0] == point3[0] && point1[1] == point3[1])) {
    		return false;
    	}
    	
    	float slope1 = getSlope(point1, point2);
    	float slope2 = getSlope(point2, point3);
    	float slope3 = getSlope(point1, point3);
    	
    	if (Float.isInfinite(slope1) && Float.isInfinite(slope2) && Float.isInfinite(slope3)) {
    		return false;
    	}
    	
    	float b = point1[1] - (slope1 * point1[0]);
    	return point3[1] != point3[0] * slope1 + b;
    }
    
    private float getSlope(int[] point1, int[] point2) {
    	return (float)(point2[1] - point1[1]) / (float)(point2[0] - point1[0]);
    }
    
}
