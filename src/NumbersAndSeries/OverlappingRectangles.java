package NumbersAndSeries;

// we check for overlapping rectangle and pizza cutter problem
public class OverlappingRectangles {

	public static class Point{
		int x,y;
	}
	
	public static void main(String [] args) {
		
		Point l1 = new Point(),r1 = new Point(),
                l2 = new Point(),r2 = new Point();
        l1.x=0;l1.y=10; r1.x=10;r1.y=0;
         l2.x=5;l2.y=5; r2.x=15;r2.y=0;
 
        if (checkOverlap(l1, r1, l2, r2)) {
            System.out.println("Rectangles Overlap");
        } else {
            System.out.println("Rectangles Don't Overlap");
        }
        
        int cuts =2;
        int slices = cutPizza(cuts);
        System.out.println("We can get at most "+slices);
	}
	
	public static boolean checkOverlap(Point l1, Point r1, Point l2, Point r2) {
		
		//checking if the sides coincide but the rectangles dont overlap
		if(l1.x==r1.x || l1.y==r1.y || l2.x==r2.x || l2.y==r2.y) {
			return false;
		}
		
		//x axis of the l triangle must be lesser than the one to be proven
		if(l1.x>r2.x || l2.x>r1.x) {
			return false;
		}
		
		// y axis of the l triangle must be greater than the one to be proven
		if(l1.y<r2.y || l2.y<r1.y) {
			return false;
		}
		
		return true;
	}
	
	public static int cutPizza(int cuts) {
		return 1+cuts*(cuts+1)/2;
	}
}
