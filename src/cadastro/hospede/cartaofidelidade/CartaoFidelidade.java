package cadastro.hospede.cartaofidelidade;

/** Classe que representa um cartao de fidelidade
 * @author Ricardo Andrade
 * @author Ygor
 * @since 13/10/2016
 */
public class CartaoFidelidade {
	private int pontos;
	private TipoDeCartao tipoDeCartao;
	
	public CartaoFidelidade() {
		this.tipoDeCartao = new Padrao();
	}
	
	public double aplicaDesconto(double valor) {
		return tipoDeCartao.aplicaDesconto(valor);
	}

	public int getPontos(){
		return this.pontos;
	}
	
	public void adicionaPontos(double valor){
		pontos += tipoDeCartao.adicionaPontos(valor);
		this.upgrade();
	}

	private void upgrade() {
		if(this.pontos >= 1000){
			this.tipoDeCartao = new Vip();
		} else if(this.pontos >= 350){
			this.tipoDeCartao = new Premium();
		} else {
			this.tipoDeCartao = new Padrao();
		}
	}
	
	public double convertePontos(double valor){
		this.pontos -= valor;
		return tipoDeCartao.convertePontos(valor);
	}
	
}
