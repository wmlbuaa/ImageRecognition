package UI;

import Ashing.Ashing;
import PictureOperation.Picture;

import java.util.Map;

/**
 * @author wmlbuaa
 * @date 2018-08-26
 */
public class ConsoleMain {
    public static final String IMAGE_PATH = "Picture//source_image.jpg";

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        Map<String, String> map = System.getenv();
        String userName = map.get("USERNAME");

        Picture picture = new Picture();
        picture.readImage(IMAGE_PATH);
        new Ashing(picture);
        picture.saveImage("C:\\Users\\" + userName + "\\Pictures\\"+System.currentTimeMillis()+".jpg");
        System.out.println(System.currentTimeMillis());
    }
}