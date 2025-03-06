

public class Water_container {

    static class water{

public int max_area(ArrayList<Integer>() height) {

        int max_water = 0;
        int left = 0, right = height.size() - 1;

        while (left < right) {

            int min_height = Math.min(height[left], height[right]);
            int width = right - left;
            int area = min_height * width;
            max_water = Math.max(max_water, area);

        if (height[left] < height[right]) 
        
        { left++; }
        
         else { right--; }
       
        }

        return max_water;
    }
}
}



 public static void main(String[] args) {
        
        ArrayList<Integer> height = new ArrayList<>(Arrays.asList(1, 8, 6, 2, 5, 4, 8, 3, 7));
        
        Container container = new Container();  
        System.out.println("Max Water: " + container.max_area(height)); 
    }
