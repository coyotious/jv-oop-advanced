package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static String getRandomColor() {
        Color[] values = Color.values();
        int randomIndex = new Random().nextInt(values.length);
        return values[randomIndex].name().toLowerCase();
    }
}
