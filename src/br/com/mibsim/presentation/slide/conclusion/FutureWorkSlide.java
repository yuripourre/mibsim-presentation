package br.com.mibsim.presentation.slide.conclusion;

import br.com.etyllica.core.graphics.Graphic;
import br.com.mibsim.presentation.CommonSlide;

public class FutureWorkSlide extends CommonSlide {
	
	public FutureWorkSlide(int w, int h) {
		super(w, h);
	}

	@Override
	public void load() {
		quantity = 40;
		
		super.load();
		
		loading = 100;
	}	
	
	@Override
	public void draw(Graphic g) {
		super.draw(g);
				
		drawTitle(g, "Trabalhos futuros");
		drawSentence(g, 0, "Levar o MibSim para o mundo real");						
	}
	
	@Override
	public void nextSlide() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void previousSlide() {
		nextApplication = new LimitationSlide(w, h);
	}

}
