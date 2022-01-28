package designpatterns.estrutural.adapter;

import java.math.BigDecimal;

public class MeuPagamentoCredito extends SdkPagamentoCredito implements ProcessadorPagamento  {
	
	public void debitar(BigDecimal valor) {//Adapter - two-way
		super.autorizar(valor);
		super.capturar(valor);
	}

	public void creditar(BigDecimal valor) {
		super.creditar(valor);
	}

//	@Override
//	public void autorizar(BigDecimal valor) {
//		// mudou o comportamento - não é mais two-way se sobrescrever.
//		
//	}

}
