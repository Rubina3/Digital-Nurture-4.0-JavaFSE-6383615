public class BuilderTest{
    public static void main(String[] args){
        Computer gamingPC = new Computer.Builder()
                .setCpu("Intel i9")
                .setRam("32GB")
                .setStorage("1TB SSD")
                .setGpu("NVIDIA RTX 4080")
                .setWifi("Intel AX210")
                .build();

        Computer basicPC = new Computer.Builder()
                .setCpu("Intel i3")
                .setRam("4GB")
                .setStorage("256GB SSD")
                .build();

        System.out.println("Gaming PC: " + gamingPC);
        System.out.println("Basic PC: " + basicPC);
    }
}

