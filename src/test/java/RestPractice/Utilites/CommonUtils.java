package RestPractice.Utilites;

import org.opencv.core.Mat;

public class CommonUtils {

    public String genrateRandomString(int length) {
        String shopString = "ABDCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopq";
        StringBuffer buffer = new StringBuffer();
        while (length-- > 0) {
            int index = (int) (Math.random() * 10);
            char randomChar = shopString.charAt(index);
            buffer.append(randomChar);
        }
        return buffer.toString();
    }
}
