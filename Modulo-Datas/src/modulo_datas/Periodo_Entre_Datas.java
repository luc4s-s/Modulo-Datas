package modulo_datas;

import java.time.LocalDate;
import java.time.Period;

public class Periodo_Entre_Datas {

	public static void main(String[] args) {

//		LocalDate dataAntiga = LocalDate.of(2010, 1, 05); 
//		LocalDate dataNova = LocalDate.of(2022, 06, 03);
		
		//podendo usar das duas forma
		LocalDate dataAntiga = LocalDate.parse("2010-10-05");
		LocalDate dataNova = LocalDate.parse("2022-06-03");
		
		
		System.out.println("Data antiga é maior que data atual: " + dataAntiga.isAfter(dataNova));

		System.out.println("Data antiga é menor que data atual: " + dataAntiga.isBefore(dataNova));
		
		System.out.println("Data antiga é igual que data atual: " + dataAntiga.isEqual(dataNova) + "\n");
		
		
		//com a class Period podemos verificar a quantidaddes de Anos, Mês e dias ou separados
		Period periodo = Period.between(dataAntiga, dataNova);
		
		/** verificando o tempo total de Ano, Mês e dias separados  **/
		System.out.println("quantidades de Dias : " + periodo.getDays());
		System.out.println("quantidades de Mês : " + periodo.getMonths());
		System.out.println("quantidades de Anos : " + periodo.getYears()+ "\n");
		
		
		/** verificando o tempo total de Ano, Mês e dias  **/
		System.out.println("periodos entre Data Antiga e Data Nova : " 
		+ periodo.getYears() +" Anos "+ periodo.getMonths() +" Mês "+ periodo.getDays() + " Dias.");
		
		
		/** verificando tempo total apenas dos Mês **/
		System.out.println("quantidades de mes : " + periodo.toTotalMonths()+ "\n");

	}

}
