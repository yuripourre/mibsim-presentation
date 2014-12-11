package br.com.mibsim.presentation.slide.proposal;

import br.com.etyllica.core.graphics.Graphic;
import br.com.mibsim.presentation.CommonSlide;
import br.com.mibsim.presentation.slide.poi.AgentsSlide;

public class DescriptionSlide extends CommonSlide {
	
	public DescriptionSlide(int w, int h) {
		super(w, h);
	}

	@Override
	public void load() {
		super.load();
		
		//draw more complex background
				
		loading = 100;
	}	
	
	@Override
	public void draw(Graphic g) {
		super.draw(g);
				
		drawTitle(g, "Descrição");
		drawSentence(g, 0, "Simulador de Ambiente Virtual que possui:");
		drawSentence(g, 1, "Diversos Agentes autônomos");
		drawSentence(g, 2, "Diversas bases estratégicas");
		drawSentence(g, 3, "Diversas fontes de nutrientes");
		
	}
	
	@Override
	public void nextSlide() {
		nextApplication = new AgentsSlide(w, h);
	}
	
	@Override
	public void previousSlide() {
		nextApplication = new ProposalSlide(w, h);
	}

}
