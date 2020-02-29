package dev.ananda.oopatterns.behavioral.mediator.sample1;

import java.text.MessageFormat;
import java.util.Date;

public class Chat {
	public static void showMessage(User user, String message){
		System.out.println(MessageFormat.format("{0,time} on {0,date} {1} : {2}",new Date(), user, message));
	}
}
