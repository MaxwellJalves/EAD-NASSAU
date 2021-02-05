package academiaUninassauSI.model;

public class Pacote {

	private String plano;
	
	public Pacote(int cd_plano) {
		if(validaPlano(cd_plano) > 0)
		this.plano = (cd_plano == 1) ? "PLANO A" : "PLANO B";
	}
	
	protected int validaPlano(int k) {
		try {
			if(!String.valueOf(k).isBlank() || !String.valueOf(k).isEmpty() ) {
			 return k;	
			}else {
			 return -1;	
			}
		}catch(Exception e) {
			System.out.println("OPS! OCORREU UM PROBLEMA DURANTE A VALIDACAO DOS DADOS "
							   + "\n Verique os dados informados e tente novamente.");
		}
		return 0;
	}

    public String getPlano() {
    	return this.plano;
    }
    
    
    public String toString() {
    	return "Plano : " + this.plano;
    }

}
