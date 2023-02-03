package padrao;

public class Operacao {
	String produto;
	int qtdCompra,qtdVenda;
	float precoCompra,precoVenda;
	
	Operacao(){}
	Operacao(String pr, int qc, int qv, float pc, float pv){
		produto = pr;
		qtdCompra = qc;
		qtdVenda = qv;
		precoCompra = pc;
		precoVenda = pv;
	}
	float investimento(){
		return precoCompra * qtdCompra;
	}
	float faturamento(){
		return precoVenda * qtdVenda;
	}
	float lucroDinheiro(){
		return faturamento() - investimento();
	}
	float lucroPorc(){
		return (lucroDinheiro()*100)/investimento();
	}
	public String toString() {
		return String.format("[%s]\t[%d]\t\t[%d]\t\t[R$%.2f]\t[R$%.2f]\t[R$%.2f]\t[R$%.2f]\t[R$%.2f]\t[%.1f%%]", produto, qtdCompra, qtdVenda, precoCompra,precoVenda,investimento(),faturamento(),lucroDinheiro(),lucroPorc());
	}
}

