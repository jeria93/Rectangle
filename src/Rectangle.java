public class Rectangle {

    int x;
    int y;
    int width;
    int height;

//    Constructor 1
    Rectangle() {
        this.x = 0;
        this.y = 0;
        this.width = 0;
        this.height = 0;
    }

//    Constructor 2
    Rectangle(int width, int height) {
        this.x = 0;
        this.y = 0;
    }

//    Constructor 3
    Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;

    }

    //Calculates the area of an rectangle
    public double calculateArea(double width, double height) {

        return + width * height;
    }

    public double calculatePerimeter(double x, double y) {

            return Math.pow(x, 2) + Math.pow(y, 2);
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

//Omkrets = a'2 + b'2