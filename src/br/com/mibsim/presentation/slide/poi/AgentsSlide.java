package br.com.mibsim.presentation.slide.poi;

import br.com.etyllica.core.graphics.Graphic;
import br.com.mibsim.presentation.CommonSlide;
import br.com.mibsim.presentation.slide.proposal.DescriptionSlide;

public class AgentsSlide extends CommonSlide {
	
	public AgentsSlide(int w, int h) {
		super(w, h);
	}

	@Override
	public void load() {
		super.load();
		
		//draw more complex agentes acting
				
		loading = 100;
	}	
	
	@Override
	public void draw(Graphic g) {
		super.draw(g);
				
		drawTitle(g, "Agentes");
		drawSentence(g, 0, "Os agentes exploram o mapa por setores");
		drawSentence(g, 1, "assim que explora um setor designado");
		drawSentence(g, 2, "volta até a base e reporta o encontrado");
		drawSentence(g, 3, "Quando sente fome, o agente suspende a exploração");
		drawSentence(g, 4, "e busca por alguma fonte de nutrientes conhecida");
		
	}
	
	@Override
	public void nextSlide() {
		nextApplication = new SpeciesSlide(w, h);
	}
	
	@Override
	public void previousSlide() {
		nextApplication = new DescriptionSlide(w, h);
	}

}
