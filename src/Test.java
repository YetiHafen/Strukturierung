import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                System.out.println("J: " + j);
                if(j == 5) break;
            }
            System.out.println("I: " + i);
        }

    }









































    private static String encode(String text) {
        byte[] data = text.getBytes(StandardCharsets.UTF_8);
        StringBuilder result = new StringBuilder();
        for (byte current : data) {
            result.append(Integer.toHexString(128 - current));
            result.append(".");
        }
        return result.substring(0, result.lastIndexOf("."));
    }

    private static String decode(String encoded) {
        String[] parts = encoded.split("\\.");
        ArrayList<Byte> data = new ArrayList<>();
        for(String part : parts) {
            byte b = (byte) (128 - Integer.parseInt(part, 16));
            data.add(b);
        }
        byte[] res = new byte[data.size()];

        for(int i = 0; i < res.length; i++) {
            res[i] = data.get(i);
        }

        return new String(res, StandardCharsets.UTF_8);
    }

    private static void hackOutput() {
        System.setOut(new PrintStream(System.out) {
            @Override
            public void println(String s) {
                try {
                    super.println(decode(s));
                } catch (Exception ignored) {
                    super.println(Arrays.toString(s.getBytes(StandardCharsets.UTF_8)));
                }
            }
        });
    }
}
