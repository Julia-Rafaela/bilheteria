package view;
import java.util.concurrent.Semaphore;

import controller.ticket;
public class main {
public static void main(String args []) {
		
		Semaphore semaforo = new Semaphore(1);
		for (int i = 0; i < 300; i++) {
			Thread show = new ticket(i, semaforo);
			show.start();
			
					}
		}

                     
}
