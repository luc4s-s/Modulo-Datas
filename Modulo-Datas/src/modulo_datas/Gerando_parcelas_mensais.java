package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Gerando_parcelas_mensais {

	public static void main(String[] args) throws ParseException {
		
		//aprendendo a gerar parcela de vencimento 
		

		Date dataInicial = new SimpleDateFormat("dd/MM/yyyy").parse("08/06/2022");//data inicial da fatura
		
		//instanciando o objeto calendar
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dataInicial);//passando a data inicial
		
		
		for (int parcela = 1; parcela <= 12; parcela++) {
			calendar.add(Calendar.MONTH, 1);//adicionado 1 mes
			
			System.out.println("Parcela de numero: "+ parcela + " Vencimento é em : " 
			+ new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
		}
		
	}

}
