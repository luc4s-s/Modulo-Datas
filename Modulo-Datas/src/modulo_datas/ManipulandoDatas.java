package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ManipulandoDatas {

	public static void main(String[] args) throws ParseException {
 
		Calendar calendar = Calendar.getInstance();//pega a data atual
		Calendar mes = Calendar.getInstance();
		Calendar ano = Calendar.getInstance();
		
		//simulando que a data vem do banco de dados
		calendar.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("20-03-2021"));//Definindo uma data qualquer
		mes.setTime(new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2000"));
		ano.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("10-10-2010"));
		
		
		calendar.add(calendar.DAY_OF_MONTH, 5);//Adicinando ou retirando dias 
		System.out.println("Adicionando dia no Mes " + new SimpleDateFormat("yyyy-MM-dd").format(calendar.getTime()));
		
		mes.add(mes.MONTH, 1);//Adicionando mais um Mes
		System.out.println("Adicionando um Mês " + new SimpleDateFormat("dd/MM/yyyy").format(mes.getTime()));
		
		ano.add(ano.YEAR, -12);//Adicionando mais um Ano
		System.out.println("Adicionando um Ano " + new SimpleDateFormat("dd-MM-yyyy").format(ano.getTime()));
	}

}
