package dev.ananda.oopatterns.structural.flyweight.sample1;

import java.util.HashMap;
import java.util.Map;

public class AttendeeFactory {
	private static final Map<String, AttendeeImpl> attendees = new HashMap<>();
	
	public static Attendee getAttendee(String name) {
        AttendeeImpl attendeeImpl = attendees.get(name);
        if(null == attendeeImpl){
        	attendeeImpl = new AttendeeImpl(name);
        	attendees.put(name, attendeeImpl);
        }
            
         return attendeeImpl;
    }
}
