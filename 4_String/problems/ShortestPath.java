public class ShortestPath {
    public static double getPath(String str) {
        int x = 0, y =0;
        for (int i =0; i < str.length(); i++) {
            char chr = str.charAt(i);
            if (chr == 'N') {
                y++;
            }
            if (chr == 'S')  {
                y--;
            }
            if (chr == 'E') {
                x++;
            }
            if (chr == 'W') {
                x--;
            }
        }
        // Euclidean Distance Formula
        return Math.sqrt((Math.pow((x-0),2)) + (Math.pow((y-0),2)));
    }
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println("Displacement: " + getPath(str));
    }
}