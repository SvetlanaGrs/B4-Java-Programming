package day26_methods;

public class Painter {
    public static void main(String[] args) {
        Picture.draw();
       // Picture.draw(6);
        Picture.draw("blue");

        Picture.draw("blue", "red");
        Picture.draw("blue", "red", "white");

        Picture.draw(3, "purple");
        Picture.draw("purple", 3);

        Picture.draw(7);

        Picture.draw(true);
    }
}
