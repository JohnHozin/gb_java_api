package home_work.home_work_6;

public class NoteBook {
    private String name;
    private int randomAccessMemory;
    private String operationSystem;
    private String color;
    private int hardDiskVolume;
    private int price;

    public NoteBook(String name, int randomAccessMemory, String operationSystem, String color, int hardDiskVolume, int price) {
        this.name = name;
        this.randomAccessMemory = randomAccessMemory;
        this.operationSystem = operationSystem;
        this.color = color;
        this.hardDiskVolume = hardDiskVolume;
        this.price = price;
    }

    public NoteBook() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRandomAccessMemory() {
        return randomAccessMemory;
    }

    public void setRandomAccessMemory(int randomAccessMemory) {
        this.randomAccessMemory = randomAccessMemory;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHardDiskVolume() {
        return hardDiskVolume;
    }

    public void setHardDiskVolume(int hardDiskVolume) {
        this.hardDiskVolume = hardDiskVolume;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NoteBook noteBook = (NoteBook) o;

        if (randomAccessMemory != noteBook.randomAccessMemory) return false;
        if (hardDiskVolume != noteBook.hardDiskVolume) return false;
        if (price != noteBook.price) return false;
        if (name != null ? !name.equals(noteBook.name) : noteBook.name != null) return false;
        if (operationSystem != null ? !operationSystem.equals(noteBook.operationSystem) : noteBook.operationSystem != null)
            return false;
        return color != null ? color.equals(noteBook.color) : noteBook.color == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + randomAccessMemory;
        result = 31 * result + (operationSystem != null ? operationSystem.hashCode() : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + hardDiskVolume;
        result = 31 * result + price;
        return result;
    }

    @Override
    public String toString() {
//        return "NoteBook{" +
//                "Name = " + name +
//                ", RAM = " + randomAccessMemory +
//                " GB, OS = '" + operationSystem + '\'' +
//                ", color ='" + color + '\'' +
//                ", HD = " + hardDiskVolume +
//                " GB, price = " + price +
//                " RUB}";
        return String.format("Name = %12s, RAM = %2d GB, OS = %10s, color = %8s, HD = %6d GB, price = %10d RUB;", name, randomAccessMemory, operationSystem, color, hardDiskVolume, price);
    }
}
