package dev.ananda.oopatterns.structural.flyweight.sample1;

import java.util.Random;

public class Main {
	private static final String[] names = {"David", "Scott", "Andrew", "Rhett"};
	
	public static void main(String[] args) {
		for(int i = 0; i < 10; ++i) {
            AttendeeImpl attendeeImpl = (AttendeeImpl) AttendeeFactory.getAttendee(getRandomName());
            attendeeImpl.setAge(getRandomAge());
            attendeeImpl.listenToConcert();
        }
	}
	
	private static String getRandomName() {
        int randomName = new Random().nextInt(names.length);
        return names[randomName];
    }
    
    private static int getRandomAge() {
        return (int)(Math.random()*180);
    }

}
