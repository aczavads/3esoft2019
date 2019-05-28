package aula20190528.v2.pessoa;

import java.util.Map;


public class App {
	
	public static void main(String[] args) {
		//Pessoa wilson = ;
		Pessoa claudio = new Fisica("Cl�udio Ferdinandi", "2.222.222-55", "123.984.445-12");
		Pessoa arthur = new Fisica("Arthur Cattaneo Zavadski", "3.333.333-74", "888.333.445-24");
		Juridica uniCesumar = new Juridica("UniCesumar Centro Universitário Cesumar Ltda.", "01.004.137/0001-55", 500_000d);
		
		uniCesumar.adicionarSocio(
				new Fisica("Wilson da Silva Matos", "4.444.444-44", "444.555.445-44"), 
				new PercentualDeParticipacao(70.00d));
		
		uniCesumar.adicionarSocio(claudio, new PercentualDeParticipacao(-29.50d));
		uniCesumar.adicionarSocio(arthur, new PercentualDeParticipacao(0.25d));
		
		Map<Pessoa, PercentualDeParticipacao> cotasSociedade = uniCesumar.getCotasSociedade();
		for (Pessoa p : cotasSociedade.keySet()) {
			System.out.println(p.getNome() + ": " + cotasSociedade.get(p).getValor());
		}
		
		
		
		
		uniCesumar.removerSocio(arthur);
		System.out.println("Foi.");
		
	}

}
