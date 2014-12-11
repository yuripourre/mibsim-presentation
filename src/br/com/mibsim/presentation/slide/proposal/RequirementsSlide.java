package br.com.mibsim.presentation.slide.proposal;

import br.com.etyllica.core.graphics.Graphic;
import br.com.mibsim.presentation.CommonSlide;

public class RequirementsSlide extends CommonSlide {
	
	public RequirementsSlide(int w, int h) {
		super(w, h);
	}

	@Override
	public void load() {
		super.load();
				
		loading = 100;
	}	
	
	@Override
	public void draw(Graphic g) {
		super.draw(g);
				
		drawTitle(g, "Requisitos");
		drawSentence(g, 0, "Agentes precisam:");
		drawSentence(g, 1, "Possuir características semelhantes");
		drawSentence(g, 2, "Conhecer préviamente um ponto do mapa");		
	}
	
	@Override
	public void nextSlide() {
		nextApplication = new DescriptionSlide(w, h);
	}
	
	@Override
	public void previousSlide() {
		nextApplication = new ProposalSlide(w, h);
	}

}
