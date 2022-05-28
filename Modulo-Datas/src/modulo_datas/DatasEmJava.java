package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {

	public static void main(String[] args) throws ParseException {

		/** Calendar **/
		Calendar calendar = Calendar.getInstance();
		
		System.out.println("Calendar Data em milisegundo: "+ calendar.getTimeInMillis());
		System.out.println("Calendar Dia do mes: "+ calendar.get(calendar.DAY_OF_MONTH));
		System.out.println("Calendar Dia da semana: "+ (calendar.get(calendar.DAY_OF_WEEK) - 1));
		System.out.println("Calendar Hora do Dia: "+ calendar.get(calendar.HOUR_OF_DAY));
		System.out.println("Calendar minuto da hora: "+ calendar.get(calendar.MINUTE));
		System.out.println("Calendar segundos da hora: "+ calendar.get(calendar.SECOND));
		System.out.println("Calendar Ano: "+ calendar.get(calendar.YEAR)+ "\n");
		
		
		/** Calendar Format **/

		 //Formato padrao
		SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");
		System.out.println("Data atual em formato padrao e string: " + simpleDateFormat1.format(calendar.getTime()));

		// Formato de banco de Dados
		simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd"); 
		System.out.println("CalendarData atual em formato do Banco de Dado: " + simpleDateFormat1.format(calendar.getTime()) );
		System.out.println("Calendar Objeto Date: " + simpleDateFormat1.parse("2022-05-27")+ "\n");// com a hora sendo passada fixa
																							 
		
		/** Date **/ 
		Date date = new Date();

		/** o date sera substituido pelo calendar **/
		System.out.println("------------------------------------------------------");
		System.out.println("milisegundo: "+ date.getTime());
		System.out.println("Dia do mes: " + date.getDate());
		System.out.println("Dia da semana: " + date.getDay());
		System.out.println("Hora do dia: " + date.getHours());
		System.out.println("Minuto da hora: " + date.getMinutes());
		System.out.println("Segundos da hora: " + date.getSeconds()+ "\n");
		// Era para esta (date.getYear());
		System.out.println("Ano: " + (date.getYear() + 1900)); // o nao e somado 1900 como base, mais oque foi imprimido
																// no console
		/**System.out.println(": " + date.getTime());
		System.out.println(": " + date.getTimezoneOffset());/**

		/** --------- Simple Date Format --------- **/

		//Formato padrao
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");
		System.out.println("Data atual em formato padrao e string: " + simpleDateFormat.format(date));

		// Formato de banco de Dados
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("Data atual em formato do Banco de Dado: " + simpleDateFormat.format(date));

		// Objeto Date1
		simpleDateFormat = new SimpleDateFormat("yyy-MM-dd");
		System.out.println("Objeto Date: " + simpleDateFormat.parse("2022-05-27"));

		// Objeto Date2
		simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Objeto Date: " + simpleDateFormat.parse("27/05/2022"));// com a hora sendo passada fixa
																							
	}
}
