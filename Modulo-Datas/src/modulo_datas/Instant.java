package modulo_datas;

import java.time.Duration;

public class Instant {

	public static void main(String[] args) throws InterruptedException {

		java.time.Instant inicio = java.time.Instant.now();
		
		Thread.sleep(2000);
		
		java.time.Instant ifinal = java.time.Instant.now();
		
		Duration duracao = Duration.between(inicio, ifinal);
		
		System.out.println("Duração em nano segundo :" + duracao.toNanos());
		
		System.out.println("Duração em Minutos :" + duracao.toMinutes());
		
		System.out.println("Duração em Moras :" + duracao.toHours());

		System.out.println("Duração em Milisegundo :" + duracao.toMillis());
		
		System.out.println("Duração em Dias :" + duracao.toDays());



		
	}

}
