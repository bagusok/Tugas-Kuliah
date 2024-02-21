package dragon;

public class Dragon {
    private int x=0, y=0, width=10, height=10;

    public Dragon() {
    }

    public Dragon(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void moveLeft() {
        x -= 1;
        detectCollision(x, y);
    }

    public void moveRight() {
        x += 1;
        detectCollision(x, y);
    }

    public void moveUp() {
        y -= 1;
        detectCollision(x, y);
    }


    public void moveDown() {
        y += 1;
        detectCollision(x, y);
    }

    public void printPosition() {
        System.out.println("x: " + x + ", y: " + y);
    }

    private void detectCollision(int x, int y) {
        if (x < 0 || x > width || y < 0 || y > height) {
            System.out.println("Game Over");
        }
    }

}
