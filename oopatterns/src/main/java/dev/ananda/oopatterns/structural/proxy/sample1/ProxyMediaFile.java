package dev.ananda.oopatterns.structural.proxy.sample1;

public class ProxyMediaFile implements MediaFile {
	private String fileName;
	
	private MediaFile mediaFile;
	
	public ProxyMediaFile(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void printName() {
		if(null == mediaFile){
			mediaFile = new MediaFileImpl(fileName);
		}
		mediaFile.printName();
	}

}
