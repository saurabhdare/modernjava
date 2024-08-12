public class SwitchDemo {
    public static void main(String[] args) {
        int value = 2;

        String size = switch (value) {
            case 0 -> "Small";
            case 1 -> "Medium";
            case 2 -> "Large";
            default -> "Unknown";
        };

        System.out.println(size);
    }
}

