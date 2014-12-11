package br.com.mibsim.presentation.slide.proposal;

import br.com.etyllica.core.graphics.Graphic;
import br.com.mibsim.presentation.CommonSlide;

public class HowItWorksSlide extends CommonSlide {
	
	public HowItWorksSlide(int w, int h) {
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
				
		drawTitle(g, "Funcionamento do Sistema");
		drawSentence(g, 0, "Os agentes vão até as bases");
		drawSentence(g, 1, "e solicitam por designações");
		drawSentence(g, 2, "A base estratégica sugere um setor inexplorado");
		drawSentence(g, 3, "o agente vai até o setor enquanto possuir nutrientes");
				
	}
	
	@Override
	public void nextSlide() {
		nextApplication = new EndOfSimulationSlide(w, h);
	}
	
	@Override
	public void previousSlide() {
		nextApplication = new DescriptionSlide(w, h);
	}

}
