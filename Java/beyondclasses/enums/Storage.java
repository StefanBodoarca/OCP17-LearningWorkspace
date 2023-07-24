package beyondclasses.enums;

public enum Storage {
    sharepoint,
    google_drive
}

class MainClazz {
    public static void main(String[] args) {
        switch (Storage.valueOf("sharepoint")) {
            case sharepoint -> System.out.println("sharepoint storage");
            case google_drive -> System.out.println("drive storage");
            default -> System.out.println("default case");
        }
    }
}
