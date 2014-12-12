package br.com.mibsim.presentation.slide.conclusion;

import br.com.etyllica.core.graphics.Graphic;
import br.com.mibsim.presentation.CommonSlide;
import br.com.mibsim.presentation.slide.proposal.EndOfSimulationSlide;

public class ConclusionSlide extends CommonSlide {
	
	public ConclusionSlide(int w, int h) {
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
				
		drawTitle(g, "Conclusão");
		drawSentence(g, 0, "O MibSim pode ser usado em diversas situações");
		drawSentence(g, 1, "desde que o problema se encaixe nos requisitos");
		drawSentence(g, 2, "No caso dos aspiradores de pó");
		drawSentence(g, 3, "a proposta prevê pontos de reabastecimento");
		
	}
	
	@Override
	public void nextSlide() {
		nextApplication = new LimitationSlide(w, h);
	}
	
	@Override
	public void previousSlide() {
		nextApplication = new EndOfSimulationSlide(w, h);
	}

}
