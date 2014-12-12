package br.com.mibsim.presentation.slide.poi;

import br.com.etyllica.core.graphics.Graphic;
import br.com.mibsim.presentation.CommonSlide;
import br.com.mibsim.presentation.slide.proposal.EndOfSimulationSlide;

public class FontsSlide extends CommonSlide {
	
	public FontsSlide(int w, int h) {
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
		
		drawTitle(g, "Fontes de Nutrientes");
		drawSentence(g, 1, "Água");
		drawSentence(g, 2, "Adamantita");
	}
	
	@Override
	public void nextSlide() {
		nextApplication = new EndOfSimulationSlide(w, h);
	}
	
	@Override
	public void previousSlide() {
		nextApplication = new BasementsSlide(w, h);
	}

}
