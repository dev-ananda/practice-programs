package dev.ananda.oopatterns.structural.proxy.sample1;

public class Main {
	public static void main(String[] args) {
		MediaFile mediaFile = new ProxyMediaFile("Movie.mkv");
		
		mediaFile.printName();
		mediaFile.printName();
	}
}
