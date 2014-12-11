package br.com.mibsim.presentation.slide.proposal;

import br.com.etyllica.core.graphics.Graphic;
import br.com.mibsim.presentation.CommonSlide;

public class EndOfSimulationSlide extends CommonSlide {
	
	public EndOfSimulationSlide(int w, int h) {
		super(w, h);
	}

	@Override
	public void load() {
		super.load();
		
		//draw more complex background
		//agents dying
				
		loading = 100;
	}	
	
	@Override
	public void draw(Graphic g) {
		super.draw(g);
				
		drawTitle(g, "Fim da Simulação");
		drawSentence(g, 0, "A simulação acaba em duas situações:");
		drawSentence(g, 1, "Quando todos os agentes morrem");
		drawSentence(g, 2, "Quando alguma espécie explora todo o mapa");
		
	}
	
	@Override
	public void nextSlide() {
		nextApplication = new ConclusionSlide(w, h);
	}
	
	@Override
	public void previousSlide() {
		nextApplication = new HowItWorksSlide(w, h);
	}

}
