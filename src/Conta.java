

public abstract class Conta {
	
	
  protected  double saldo;
  private int agencia;
  private int numero;
    //titular da conta
  private Cliente titular;
  //Quantas contas foram abertas?O total da classe e n�o do objet, nisto uso static
  private static int total;


  public Conta(int agencia, int numero) { 
      total ++;
      System.out.println("o total de contas � " + total);
      this.agencia = agencia; 
      this.numero = numero; 
      System.out.println("estou criando uma conta " + this.numero); 
  }
   
    

    public abstract void deposita (double valor) ;
    
    public boolean sacar(double valor) {
    	
    	if(saldo>=valor) {
    	this.saldo=this.saldo-valor;
    	return true;
    }  
    	else {
        return false;
    	}
}
    public boolean transfere(double valor, Conta destino) {
    	if(this.saldo>=valor) {
    		this.saldo-=valor;
    		destino.deposita(valor);
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    //metodo que devolve e informa o saldo
    
    public double getSaldo() {
    	return this.saldo;
    }
    
    // Pega n�mero
    public int getNumero() {
    	return this.numero;
    }
   
    public void setNumero(int numero){
    	
    	if(numero<=0) {
    		System.out.println("N�o pode valor<=0");
    		return;
    	}
    	this.numero=numero;
    	
    }
    
    
    public int getAgencia() {
		return this.agencia;
	}
    
    public void setAgencia(int agencia) {
    	if(agencia<=0) {
    		System.out.println("N�o pode valor<=0");
    		return;
    	}
		this.agencia = agencia;
	}
    
    
    public void setTitular(Cliente titular) {
		this.titular = titular;
	}
    public Cliente getTitular() {
		return titular;
	}
    
    public static int getTotal() {
    	//como � um atributo da classe o static acessamos com o nome da classe
    	return Conta.total;
    }
   
}
