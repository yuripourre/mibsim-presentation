package br.com.mibsim.presentation.slide.poi;

import br.com.etyllica.core.graphics.Graphic;
import br.com.mibsim.presentation.CommonSlide;

public class SpeciesSlide extends CommonSlide {
	
	public SpeciesSlide(int w, int h) {
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
		
		drawTitle(g, "Espécies");
		drawSentence(g, 1, "Ultralisk");
		drawSentence(g, 2, "Hydralisk");
		drawSentence(g, 3, "Lurker");
	}
	
	@Override
	public void nextSlide() {
		nextApplication = new BasementsSlide(w, h);
	}
	
	@Override
	public void previousSlide() {
		nextApplication = new AgentsSlide(w, h);
	}

}
