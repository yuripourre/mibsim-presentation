package br.com.mibsim.presentation.slide;

import br.com.etyllica.core.graphics.Graphic;
import br.com.mibsim.presentation.CommonSlide;

public class MotivationSlide extends CommonSlide {
	
	public MotivationSlide(int w, int h) {
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
				
		drawTitle(g, "Motivação");
		drawSentence(g, 0, "Robôs autônomos já são uma realidade e");
		drawSentence(g, 1, "estão chegando às casas das pessoas.");
		drawSentence(g, 3, "Ainda há alguns obstáculos a serem vencidos.");
	}
		
	@Override
	public void nextSlide() {
		nextApplication = new UsageSlide(w, h);
	}
	
	@Override
	public void previousSlide() {
		nextApplication = new FirstSlide(w, h);		
	}

}
