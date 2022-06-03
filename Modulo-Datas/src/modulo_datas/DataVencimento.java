package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataVencimento {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		Date dataVencimentoBoleto = simpleDateFormat.parse("07/07/2022");
		
		Date dateAtualHoje = simpleDateFormat.parse("03/06/2022");
		
		//after
		if (dataVencimentoBoleto.after(dateAtualHoje)) {//posterior ou maior ou depois da data atual
			System.out.println("Boleto não vencido");
		}else {
			System.out.println("Boleto vencido - PAGAR URGENTE");
		}
		
		//after : se data 1 é maior que data 2
		//before : se data 1 é menor que data 2
		
		if (dataVencimentoBoleto.before(dateAtualHoje)) {//se a data 1 é menor que a data 2
			System.out.println("Boleto vencido - PAGAR URGENTE");
		}else {
			System.out.println("Boleto não vencido");
		}
	}

}
