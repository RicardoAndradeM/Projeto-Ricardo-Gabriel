package componentes;

import easyaccept.EasyAccept;

public class Main {
	public void iniciaSistema(){
		
	}
	
	 public static void main(String[] args) {
	        args = new String[] { 
	        		"componentes.Facade", "testacept/testes_uc1.txt/",
	                "testacept/testes_uc1_exception.txt/", 
	                "testacept/testes_uc2.txt/",
	                "testacept/testes_uc2_exception.txt/", 
	                "testacept/testes_uc3.txt/",
	                "testacept/testes_uc3_exception.txt/", 
	                "testacept/testes_uc4.txt/",
	                "testacept/testes_uc4_exception.txt/" 
	                };
	        EasyAccept.main(args);
	    }
	 
	 public void fechaSistema(){
		 
	 }
}
