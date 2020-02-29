package dev.ananda.oopatterns.structural.proxy.sample1;

public class MediaFileImpl implements MediaFile {
	private String fileName;

	public MediaFileImpl(String fileName) {
		super();
		this.fileName = fileName;
		this.loadFromDisk();
	}

	private void loadFromDisk() {
		System.out.println("Loading " + fileName);
	}

	@Override
	public void printName() {
		System.out.println("Displaying " + fileName);
	}

}
