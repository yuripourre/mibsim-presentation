package br.com.mibsim.presentation.slide;

import br.com.etyllica.core.graphics.Graphic;
import br.com.mibsim.presentation.CommonSlide;

public class UsageSlide extends CommonSlide {
	
	public UsageSlide(int w, int h) {
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
				
		drawTitle(g, "Uso de robôs autônomos");
		drawSentence(g, 0, "Aspirador Roomba");
		drawSentence(g, 1, "Viagens a marte");
	}
		
	@Override
	public void nextSlide() {
		nextApplication = new ProblemsSlide(w, h);
	}
	
	@Override
	public void previousSlide() {
		nextApplication = new MotivationSlide(w, h);
	}

}
