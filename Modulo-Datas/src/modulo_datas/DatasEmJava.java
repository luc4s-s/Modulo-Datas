package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatasEmJava {

	public static void main(String[] args) throws ParseException {

		Date date = new Date();

		/** o date sera substituido pelo calendar **/
		System.out.println("Dia do mes: " + date.getDate());
		System.out.println("Dia da semana: " + date.getDay());
		System.out.println("Hora do dia: " + date.getHours());
		System.out.println("Minuto da hora: " + date.getMinutes());
		System.out.println("Segundos da hora: " + date.getSeconds());
		// Era para esta (date.getYear());
		System.out.println("Ano: " + (date.getYear() + 1900)); // o nao e somado 1900 como base, mais oque foi imprimido
																// no console
		System.out.println(": " + date.getTime());
		System.out.println(": " + date.getTimezoneOffset());

		/** --------- Simple Date Format --------- **/

		// Formato padrao
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");
		System.out.println("Data atual em formato padrao e string: " + simpleDateFormat.format(date));

		// Formato de banco de Dados
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("Data atual em formato do Banco de Dado: " + simpleDateFormat.format(date));

		// Objeto Date1
		simpleDateFormat = new SimpleDateFormat("yyy-MM-dd");
		System.out.println("Objeto Date: " + simpleDateFormat.parse("2022-05-27"));

		// Objeto Date2
		simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");
		System.out.println("Objeto Date: " + simpleDateFormat.parse("27/05/2022 21:28.05"));// com a hora sendo passada
																							// fixa
	}
}
