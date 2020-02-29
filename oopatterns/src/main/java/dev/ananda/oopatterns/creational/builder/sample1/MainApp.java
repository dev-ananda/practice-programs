package dev.ananda.oopatterns.creational.builder.sample1;

public class MainApp {

	public static void main(String[] args) {
		Computer computer = new Computer.Builder()
                .withCase("Tower")
                .withCPU("Intel i5")
                .withMotherboard("MSI B360M-MORTAR")
                .withGPU("nVidia Geforce GTX 750ti")
                .withHDD("Toshiba 1TB")
                .withOperatingSystem("Windows 10")
                .withPowerSupply(500)
                .withRAM(8)
                .build();
		
		System.out.println(computer);
	}

}
