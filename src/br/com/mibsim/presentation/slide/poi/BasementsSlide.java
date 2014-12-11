package br.com.mibsim.presentation.slide.poi;

import br.com.etyllica.core.graphics.Graphic;
import br.com.mibsim.presentation.CommonSlide;
import br.com.mibsim.presentation.slide.proposal.HowItWorksSlide;

public class BasementsSlide extends CommonSlide {
	
	public BasementsSlide(int w, int h) {
		super(w, h);
	}

	@Override
	public void load() {
		super.load();
		
		//Add photos
				
		loading = 100;
	}	
	
	@Override
	public void draw(Graphic g) {
		super.draw(g);
		
		drawTitle(g, "Bases estratégicas");
		drawSentence(g, 1, "Cada espécie possui sua própria base");
		drawSentence(g, 2, "Serve de local de encontro para reportar");
		drawSentence(g, 3, "o que foi encontrado no setor designado");
	}
	
	@Override
	public void nextSlide() {
		nextApplication = new HowItWorksSlide(w, h);
	}
	
	@Override
	public void previousSlide() {
		nextApplication = new SpeciesSlide(w, h);
	}

}
