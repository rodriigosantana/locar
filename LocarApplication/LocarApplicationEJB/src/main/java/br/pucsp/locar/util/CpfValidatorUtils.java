package br.pucsp.locar.util;

import org.apache.commons.lang3.StringUtils;

public class CpfValidatorUtils {
	
	public static boolean isCpfValido(String cpf) {
		
		int cpfArray[] = new int[11];
		int dv1 = 0;
		int dv2 = 0;

		cpf = cpf.replace(".", "");
		cpf = cpf.replace("-", "");

		if (cpf.equals("11111111111") ||
				cpf.equals("22222222222") ||
				cpf.equals("33333333333") ||
				cpf.equals("44444444444") ||
				cpf.equals("55555555555") ||
				cpf.equals("66666666666") ||
				cpf.equals("77777777777") ||
				cpf.equals("88888888888") ||
				cpf.equals("99999999999") ){
			return false;
		}
		
		if (cpf.length() > 11) {
			return false;
		} else if (cpf.length() < 11) {
			cpf = StringUtils.leftPad(cpf, 11, "0");
		}

		for (int i = 0; i < 11; i++)
			cpfArray[i] = Integer.parseInt(cpf.substring(i, i + 1));
		
		for (int i = 0; i < 9; i++)
			dv1 += cpfArray[i] * (i + 1);
		
		cpfArray[9] = dv1 = dv1 % 11;
		
		for (int i = 0; i < 10; i++)
			dv2 += cpfArray[i] * i;
		
		cpfArray[10] = dv2 = dv2 % 11;
		
		if (dv1 > 9)
			cpfArray[9] = 0;
		
		if (dv2 > 9)
			cpfArray[10] = 0;

		if (Integer.parseInt(cpf.substring(9, 10)) != cpfArray[9]
				|| Integer.parseInt(cpf.substring(10, 11)) != cpfArray[10]){
			
			return false;
			
		} else {
			
			return true;
			
		}
	}

}
